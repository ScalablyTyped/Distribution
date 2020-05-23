package typings.winrtUwp.global.Windows.Data

import typings.winrtUwp.Windows.Data.Text.AlternateNormalizationFormat
import typings.winrtUwp.Windows.Data.Text.SelectableWordSegmentsTokenizingHandler
import typings.winrtUwp.Windows.Data.Text.TextSegment
import typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory
import typings.winrtUwp.Windows.Data.Text.UnicodeNumericType
import typings.winrtUwp.Windows.Data.Text.WordSegmentsTokenizingHandler
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.anon.HighSurrogate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides support for identifying text segments and for determining the properties of Unicode characters. */
@JSGlobal("Windows.Data.Text")
@js.native
object Text extends js.Object {
  /** Identifies an alternate form of the word represented by a WordSegment object.. For example, this may contain a number in a normalized format. */
  @js.native
  abstract class AlternateWordForm ()
    extends typings.winrtUwp.Windows.Data.Text.AlternateWordForm {
    /** Gets the text of the alternate word form identified by this AlternateWordForm object. */
    /* CompleteClass */
    override var alternateText: String = js.native
    /** Gets the normalization format for this current AlternateWordForm object. */
    /* CompleteClass */
    override var normalizationFormat: AlternateNormalizationFormat = js.native
    /** Gets the TextSegment that identifies the source text's sub-string for which this AlternateWordForm object is an alternate. */
    /* CompleteClass */
    override var sourceTextSegment: TextSegment = js.native
  }
  
  /** Represents a segment from your provided text that includes a word and any trailing whitespace and/or punctuation after this word. */
  @js.native
  abstract class SelectableWordSegment ()
    extends typings.winrtUwp.Windows.Data.Text.SelectableWordSegment {
    /** Gets the TextSegment that identifies the source text's sub-string that is the selected word. */
    /* CompleteClass */
    override var sourceTextSegment: TextSegment = js.native
    /** Gets the text of the selected word identified by this SelectableWordSegment object. */
    /* CompleteClass */
    override var text: String = js.native
  }
  
  /** A segmenter class that is able to segment provided text into units appropriate for selecting text by words. */
  @js.native
  class SelectableWordsSegmenter protected ()
    extends typings.winrtUwp.Windows.Data.Text.SelectableWordsSegmenter {
    /**
      * Creates a SelectableWordsSegmenter object. See the introduction in SelectableWordsSegmenter for a description of how the language supplied to this constructor is used.
      * @param language A BCP-47 language tag.
      */
    def this(language: String) = this()
    /** Gets the language of the rules used by this SelectableWordsSegmenter object. */
    /* CompleteClass */
    override var resolvedLanguage: String = js.native
    /**
      * Determines and returns the selectable word which contains or follows a specified index into the provided text.
      * @param text Provided text in which a word is to be selected.
      * @param startIndex A zero-based index into text. It must be less than the length of text.
      * @return A SelectableWordSegment that represents the selected word.
      */
    /* CompleteClass */
    override def getTokenAt(text: String, startIndex: Double): typings.winrtUwp.Windows.Data.Text.SelectableWordSegment = js.native
    /**
      * Determines and returns all of the selectable words in the provided text.
      * @param text Provided text containing words to be selected.
      * @return A collection of SelectableWordSegment objects that represent the selectable words.
      */
    /* CompleteClass */
    override def getTokens(text: String): IVectorView[typings.winrtUwp.Windows.Data.Text.SelectableWordSegment] = js.native
    /**
      * Calls the provided handler with two iterators that iterate through the selectable words prior to and following a given index into the provided text.
      * @param text Provided text containing words to be selected.
      * @param startIndex A zero-based index into text. It must be less than the length of text.
      * @param handler The function that receives the iterators.
      */
    /* CompleteClass */
    override def tokenize(text: String, startIndex: Double, handler: SelectableWordSegmentsTokenizingHandler): Unit = js.native
  }
  
  /** Permits apps to perform text queries using Advanced Query Syntax (AQS) strings, with the option of providing a language tag to be employed in the query. */
  @js.native
  class SemanticTextQuery protected ()
    extends typings.winrtUwp.Windows.Data.Text.SemanticTextQuery {
    /**
      * Creates a SemanticTextQuery from an Advanced Query Syntax (AQS) query string.
      * @param aqsFilter An AQS string that contains the desired query. Learn more about AQS in Advanced Query Syntax (AQS).
      */
    def this(aqsFilter: String) = this()
    /**
      * Creates a SemanticTextQuery from an Advanced Query Syntax (AQS) query string and a language tag.
      * @param aqsFilter An AQS string that contains the desired query. Learn more about AQS in Advanced Query Syntax (AQS).
      * @param filterLanguage The BCP-47 language tag to be employed in the query.
      */
    def this(aqsFilter: String, filterLanguage: String) = this()
    /**
      * Returns segments of a source string that match the SemanticTextQuery object's query.
      * @param content A source string to be queried.
      * @return A collection of TextSegment structures that represent hits from the query.
      */
    /* CompleteClass */
    override def find(content: String): IVectorView[TextSegment] = js.native
    /**
      * Returns segments of a source string that match the SemanticTextQuery object's query over properties.
      * @param propertyContent A source string to be queried.
      * @param propertyName The name of the property.
      * @return A collection of TextSegment structures that represent hits from the query.
      */
    /* CompleteClass */
    override def findInProperty(propertyContent: String, propertyName: String): IVectorView[TextSegment] = js.native
  }
  
  /** Converts input phonetic characters into a collection of corresponding ideographic characters (Chinese characters). */
  @js.native
  class TextConversionGenerator protected ()
    extends typings.winrtUwp.Windows.Data.Text.TextConversionGenerator {
    /**
      * Constructs a TextConversionGenerator object based on a specific BCP-47 language tag.
      * @param languageTag The BCP-47 language tag of the language in which the words are to be projected. Japanese ("ja") and Simplified Chinese ("zh-Hans") are supported.
      */
    def this(languageTag: String) = this()
  }
  
  /** Predicts Japanese words based on a phonetic characters prefix. */
  @js.native
  class TextPredictionGenerator protected ()
    extends typings.winrtUwp.Windows.Data.Text.TextPredictionGenerator {
    /**
      * Constructs a TextPredictionGenerator object based on a specific BCP-47 language tag.
      * @param languageTag The BCP-47 language tag of the language in which the words are to be projected. Only Japanese ("ja") is supported.
      */
    def this(languageTag: String) = this()
  }
  
  /** Reverse-converts a Japanese string which is mix of phonetic and ideographic characters, to a string of phonetic characters. */
  @js.native
  class TextReverseConversionGenerator protected ()
    extends typings.winrtUwp.Windows.Data.Text.TextReverseConversionGenerator {
    /**
      * Constructs a TextReverseConversionGenerator object based on a specific BCP-47 language tag.
      * @param languageTag The BCP-47 language tag of the language in which the words are to be reverse-converted. Only Japanese ("ja") is supported.
      */
    def this(languageTag: String) = this()
    /** Determines if the language tag specified is available for reverse conversions, but is not installed on the user's device. */
    /* CompleteClass */
    override var languageAvailableButNotInstalled: Boolean = js.native
    /** Gets the language tag of the successfully created TextReverseConversionGenerator object. */
    /* CompleteClass */
    override var resolvedLanguage: String = js.native
    /**
      * Asynchronously reverse-converts a string which contains ideographic characters to a phonetic expression.
      * @param input The string containing ideographic characters to be reverse-converted.
      * @return An asynchronous operation to return the phonetic expression.
      */
    /* CompleteClass */
    override def convertBackAsync(input: String): IPromiseWithIAsyncOperation[String] = js.native
  }
  
  /** Provides a way for apps to get information about Unicode characters. */
  @js.native
  abstract class UnicodeCharacters ()
    extends typings.winrtUwp.Windows.Data.Text.UnicodeCharacters
  
  /** Represents a word from your provided text. */
  @js.native
  abstract class WordSegment ()
    extends typings.winrtUwp.Windows.Data.Text.WordSegment {
    /** Gets the alternate forms (if any) associated with the current word. */
    /* CompleteClass */
    override var alternateForms: IVectorView[typings.winrtUwp.Windows.Data.Text.AlternateWordForm] = js.native
    /** Gets the TextSegment that identifies the source text's sub-string that is a word. */
    /* CompleteClass */
    override var sourceTextSegment: TextSegment = js.native
    /** Gets the text of the word identified by this WordSegment object. */
    /* CompleteClass */
    override var text: String = js.native
  }
  
  /** A segmenter class that is able to segment provided text into words. */
  @js.native
  class WordsSegmenter protected ()
    extends typings.winrtUwp.Windows.Data.Text.WordsSegmenter {
    /**
      * Creates a WordsSegmenter object. See the introduction in WordsSegmenter for a description of how the language supplied to this constructor is used.
      * @param language A BCP-47 language tag.
      */
    def this(language: String) = this()
    /** Gets the language of the rules used by this WordsSegmenter object. */
    /* CompleteClass */
    override var resolvedLanguage: String = js.native
    /**
      * Determines and returns the word which contains or follows a specified index into the provided text.
      * @param text Provided text from which the word is to be returned.
      * @param startIndex A zero-based index into text. It must be less than the length of text.
      * @return A WordSegment that represents the word.
      */
    /* CompleteClass */
    override def getTokenAt(text: String, startIndex: Double): typings.winrtUwp.Windows.Data.Text.WordSegment = js.native
    /**
      * Determines and returns all of the words in the provided text.
      * @param text Provided text containing words to be returned.
      * @return A collection of WordSegment objects that represent the words.
      */
    /* CompleteClass */
    override def getTokens(text: String): IVectorView[typings.winrtUwp.Windows.Data.Text.WordSegment] = js.native
    /**
      * Calls the provided handler with two iterators that iterate through the words prior to and following a given index into the provided text.
      * @param text Provided text containing words to be returned.
      * @param startIndex A zero-based index into text. It must be less than the length of text.
      * @param handler The function that receives the iterators.
      */
    /* CompleteClass */
    override def tokenize(text: String, startIndex: Double, handler: WordSegmentsTokenizingHandler): Unit = js.native
  }
  
  /** Identifies the normalization format of an AlternateWordForm object. */
  @js.native
  object AlternateNormalizationFormat extends js.Object {
    /* 2 */ val currency: typings.winrtUwp.Windows.Data.Text.AlternateNormalizationFormat.currency with Double = js.native
    /* 3 */ val date: typings.winrtUwp.Windows.Data.Text.AlternateNormalizationFormat.date with Double = js.native
    /* 0 */ val notNormalized: typings.winrtUwp.Windows.Data.Text.AlternateNormalizationFormat.notNormalized with Double = js.native
    /* 1 */ val number: typings.winrtUwp.Windows.Data.Text.AlternateNormalizationFormat.number with Double = js.native
    /* 4 */ val time: typings.winrtUwp.Windows.Data.Text.AlternateNormalizationFormat.time with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Data.Text.AlternateNormalizationFormat with Double] = js.native
  }
  
  /* static members */
  @js.native
  object UnicodeCharacters extends js.Object {
    /**
      * Returns the supplementary Unicode character for the specified high and low surrogate pair.
      * @param highSurrogate The high surrogate value. This must be in the proper range: 0xD800 <= highSurrogate <= 0xDBFF.
      * @param lowSurrogate The low surrogate value. This must be in the proper range: 0xDC00 <= lowSurrogate <= 0xDFFF.
      * @return The supplementary Unicode character.
      */
    def getCodepointFromSurrogatePair(highSurrogate: Double, lowSurrogate: Double): Double = js.native
    /**
      * Returns the UnicodeGeneralCategory of the specified Unicode character.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return The Unicode general category for codepoint.
      */
    def getGeneralCategory(codepoint: Double): UnicodeGeneralCategory = js.native
    /**
      * Returns the UnicodeNumericType of the specified Unicode character.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return The Unicode numeric type for codepoint.
      */
    def getNumericType(codepoint: Double): UnicodeNumericType = js.native
    /**
      * Returns the high and low surrogate pair values for the specified supplementary Unicode character.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      */
    def getSurrogatePairFromCodepoint(codepoint: Double): HighSurrogate = js.native
    /**
      * Determines if a specified Unicode character can be considered alphabetic.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return TRUE if codepoint is alphabetic; otherwise FALSE.
      */
    def isAlphabetic(codepoint: Double): Boolean = js.native
    /**
      * Determines if a specified Unicode character can be considered cased (uppercase, lowercase or titlecase).
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return TRUE if codepoint is cased; otherwise FALSE.
      */
    def isCased(codepoint: Double): Boolean = js.native
    /**
      * Determines if a specified Unicode character can be considered the beginning of a grapheme.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return TRUE if codepoint is the beginning of a grapheme; otherwise FALSE.
      */
    def isGraphemeBase(codepoint: Double): Boolean = js.native
    /**
      * Determines if a specified Unicode character can be considered to continue a previous grapheme.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return TRUE if codepoint continues the previous grapheme; otherwise FALSE.
      */
    def isGraphemeExtend(codepoint: Double): Boolean = js.native
    /**
      * Determines if a specified Unicode character is a high surrogate.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return TRUE if codepoint is a high surrogate; otherwise FALSE.
      */
    def isHighSurrogate(codepoint: Double): Boolean = js.native
    /**
      * Determines if a specified Unicode character can be considered a continuation character of an identifier in programming.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return TRUE if codepoint is a continuation character of an identifier in programming; otherwise FALSE.
      */
    def isIdContinue(codepoint: Double): Boolean = js.native
    /**
      * Determines if a specified Unicode character can be considered the start character of an identifier in programming.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return TRUE if codepoint is the start character of an identifier in programming; otherwise FALSE.
      */
    def isIdStart(codepoint: Double): Boolean = js.native
    /**
      * Determines if a specified Unicode character is a low surrogate.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return TRUE if codepoint is a low surrogate; otherwise FALSE.
      */
    def isLowSurrogate(codepoint: Double): Boolean = js.native
    /**
      * Determines if a specified Unicode character can be considered a lower case character.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return TRUE if codepoint is a lower case character; otherwise FALSE.
      */
    def isLowercase(codepoint: Double): Boolean = js.native
    /**
      * Determines if a specified codepoint is a non-character.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return TRUE if codepoint is a non-character; otherwise FALSE.
      */
    def isNoncharacter(codepoint: Double): Boolean = js.native
    /**
      * Determines if a specified Unicode character is a supplementary character.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return TRUE if codepoint is a supplementary character; otherwise FALSE.
      */
    def isSupplementary(codepoint: Double): Boolean = js.native
    /**
      * Determines if a specified Unicode character can be considered an upper case character.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return TRUE if codepoint is an upper case character; otherwise FALSE.
      */
    def isUppercase(codepoint: Double): Boolean = js.native
    /**
      * Determines if a specified Unicode character can be considered whitespace.
      * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
      * @return TRUE if codepoint is whitespace; otherwise FALSE.
      */
    def isWhitespace(codepoint: Double): Boolean = js.native
  }
  
  /** Defines the Unicode general category of a character. */
  @js.native
  object UnicodeGeneralCategory extends js.Object {
    /* 21 */ val closePunctuation: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.closePunctuation with Double = js.native
    /* 18 */ val connectorPunctuation: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.connectorPunctuation with Double = js.native
    /* 14 */ val control: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.control with Double = js.native
    /* 26 */ val currencySymbol: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.currencySymbol with Double = js.native
    /* 19 */ val dashPunctuation: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.dashPunctuation with Double = js.native
    /* 8 */ val decimalDigitNumber: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.decimalDigitNumber with Double = js.native
    /* 7 */ val enclosingMark: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.enclosingMark with Double = js.native
    /* 23 */ val finalQuotePunctuation: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.finalQuotePunctuation with Double = js.native
    /* 15 */ val format: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.format with Double = js.native
    /* 22 */ val initialQuotePunctuation: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.initialQuotePunctuation with Double = js.native
    /* 9 */ val letterNumber: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.letterNumber with Double = js.native
    /* 12 */ val lineSeparator: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.lineSeparator with Double = js.native
    /* 1 */ val lowercaseLetter: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.lowercaseLetter with Double = js.native
    /* 25 */ val mathSymbol: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.mathSymbol with Double = js.native
    /* 3 */ val modifierLetter: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.modifierLetter with Double = js.native
    /* 27 */ val modifierSymbol: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.modifierSymbol with Double = js.native
    /* 5 */ val nonspacingMark: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.nonspacingMark with Double = js.native
    /* 29 */ val notAssigned: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.notAssigned with Double = js.native
    /* 20 */ val openPunctuation: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.openPunctuation with Double = js.native
    /* 4 */ val otherLetter: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.otherLetter with Double = js.native
    /* 10 */ val otherNumber: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.otherNumber with Double = js.native
    /* 24 */ val otherPunctuation: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.otherPunctuation with Double = js.native
    /* 28 */ val otherSymbol: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.otherSymbol with Double = js.native
    /* 13 */ val paragraphSeparator: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.paragraphSeparator with Double = js.native
    /* 17 */ val privateUse: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.privateUse with Double = js.native
    /* 11 */ val spaceSeparator: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.spaceSeparator with Double = js.native
    /* 6 */ val spacingCombiningMark: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.spacingCombiningMark with Double = js.native
    /* 16 */ val surrogate: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.surrogate with Double = js.native
    /* 2 */ val titlecaseLetter: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.titlecaseLetter with Double = js.native
    /* 0 */ val uppercaseLetter: typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory.uppercaseLetter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Data.Text.UnicodeGeneralCategory with Double] = js.native
  }
  
  /** Defines the type of numeral when a Unicode character represents a number. */
  @js.native
  object UnicodeNumericType extends js.Object {
    /* 1 */ val decimal: typings.winrtUwp.Windows.Data.Text.UnicodeNumericType.decimal with Double = js.native
    /* 2 */ val digit: typings.winrtUwp.Windows.Data.Text.UnicodeNumericType.digit with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Data.Text.UnicodeNumericType.none with Double = js.native
    /* 3 */ val numeric: typings.winrtUwp.Windows.Data.Text.UnicodeNumericType.numeric with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Data.Text.UnicodeNumericType with Double] = js.native
  }
  
}

