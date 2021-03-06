package com.vladsch.flexmark.ext.typographic.internal;

public class DoubleQuoteDelimiterProcessor extends QuoteDelimiterProcessorBase {
    public DoubleQuoteDelimiterProcessor(final TypographicOptions options) {
        super(options, '"', '"', options.doubleQuoteOpen, options.doubleQuoteClose, options.doubleQuoteUnmatched);
    }
}
