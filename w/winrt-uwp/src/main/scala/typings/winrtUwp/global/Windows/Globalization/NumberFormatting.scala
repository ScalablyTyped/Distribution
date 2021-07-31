package typings.winrtUwp.global.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Globalization.NumberFormatting.CurrencyFormatterMode
import typings.winrtUwp.Windows.Globalization.NumberFormatting.INumberRounder
import typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for formatting currencies, decimal numbers, percent values, and permille values, based on the user's languages and geographic region. */
object NumberFormatting {
  
  /** Formats and parses currencies. */
  @JSGlobal("Windows.Globalization.NumberFormatting.CurrencyFormatter")
  @js.native
  class CurrencyFormatter protected ()
    extends StObject
       with typings.winrtUwp.Windows.Globalization.NumberFormatting.CurrencyFormatter {
    /**
      * Creates a CurrencyFormatter object that is initialized with a currency identifier.
      * @param currencyCode The currency identifier to use when formatting and parsing currency values.
      */
    def this(currencyCode: String) = this()
    /**
      * Creates a CurrencyFormatter object initialized with a currency identifier, language list, and geographic region.
      * @param currencyCode The currency identifier to use when formatting and parsing currency values.
      * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
      * @param geographicRegion The identifier for the geographic region.
      */
    def this(currencyCode: String, languages: IIterable[String], geographicRegion: String) = this()
    
    /**
      * Prepares the CurrencyFormatter object to format currency values with a specified rounding algorithm.
      * @param roundingAlgorithm The desired rounding algorithm for the currency. This must be one of the members of RoundingAlgorithm , excluding None.
      */
    /* CompleteClass */
    override def applyRoundingForCurrency(roundingAlgorithm: RoundingAlgorithm): Unit = js.native
    
    /** Gets the identifier for the currency to be used for formatting and parsing currency values. */
    /* CompleteClass */
    var currency: String = js.native
    
    /**
      * Returns a string representation of a UInt64 currency value.
      * @param value The UInt64 currency value to be formatted.
      * @return A string that represents the value.
      */
    /* CompleteClass */
    override def format(value: Double): String = js.native
    
    /**
      * Returns a string representation of a Double currency value.
      * @param value The Double currency value to be formatted.
      * @return A string that represents the value.
      */
    /* CompleteClass */
    override def formatDouble(value: Double): String = js.native
    
    /**
      * Returns a string representation of an Int64 currency value.
      * @param value The Int64 currency value to be formatted.
      * @return A string that represents the value.
      */
    /* CompleteClass */
    override def formatInt(value: Double): String = js.native
    
    /**
      * Returns a string representation of a UInt64 currency value.
      * @param value The UInt64 currency value to be formatted.
      * @return The UInt64 currency value to be formatted.
      */
    /* CompleteClass */
    override def formatUInt(value: Double): String = js.native
    
    /** Gets or sets the minimum number of digits to display for the fraction part of the currency value. */
    /* CompleteClass */
    var fractionDigits: Double = js.native
    
    /** Gets the region that is used when formatting and parsing currency values. */
    /* CompleteClass */
    var geographicRegion: String = js.native
    
    /** Gets or sets the minimum number of digits to display for the integer part of the currency value. */
    /* CompleteClass */
    var integerDigits: Double = js.native
    
    /** Gets or sets whether the decimal point of the currency value should always be displayed. */
    /* CompleteClass */
    var isDecimalPointAlwaysDisplayed: Boolean = js.native
    
    /** Gets or sets whether the integer part of the currency value should be grouped. */
    /* CompleteClass */
    var isGrouped: Boolean = js.native
    
    /** Gets or sets whether -0 is formatted using the conventions for negative numbers or for positive numbers. (In the Latin numeral system, the choice is "-0" or "0".) */
    /* CompleteClass */
    var isZeroSigned: Boolean = js.native
    
    /** Gets the priority list of language identifiers that is used when formatting and parsing currency values. */
    /* CompleteClass */
    var languages: IVectorView[String] = js.native
    
    /** Gets or sets whether the currency is formatted with the currency symbol or currency code. */
    /* CompleteClass */
    var mode: CurrencyFormatterMode = js.native
    
    /** Gets or sets the current rounding strategy to be used when formatting currency amounts. */
    /* CompleteClass */
    var numberRounder: INumberRounder = js.native
    
    /** Gets or sets the numbering system that is used to format and parse currency values. */
    /* CompleteClass */
    var numeralSystem: String = js.native
    
    /**
      * Attempts to parse a string representation of a Double currency value.
      * @param text The text to be parsed.
      * @return If successful, a Double that corresponds to the string representation, and otherwise null.
      */
    /* CompleteClass */
    override def parseDouble(text: String): Double = js.native
    
    /**
      * Attempts to parse a string representation of an integer currency value.
      * @param text The text to be parsed.
      * @return If successful, an Int64 that corresponds to the string representation, and otherwise null.
      */
    /* CompleteClass */
    override def parseInt(text: String): Double = js.native
    
    /**
      * Attempts to parse a string representation of an unsigned integer currency value.
      * @param text The text to be parsed.
      * @return If successful, a UInt64 that corresponds to the string representation, and otherwise null.
      */
    /* CompleteClass */
    override def parseUInt(text: String): Double = js.native
    
    /** Gets the geographic region that was most recently used to format or parse currency values. */
    /* CompleteClass */
    var resolvedGeographicRegion: String = js.native
    
    /** Gets the language that was most recently used to format or parse currency values. */
    /* CompleteClass */
    var resolvedLanguage: String = js.native
    
    /** Gets or sets the current padding to significant digits when a currency amount is formatted. */
    /* CompleteClass */
    var significantDigits: Double = js.native
  }
  
  /** Specifies the use of symbols or codes when currency is formatted. */
  @JSGlobal("Windows.Globalization.NumberFormatting.CurrencyFormatterMode")
  @js.native
  object CurrencyFormatterMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Globalization.NumberFormatting.CurrencyFormatterMode & Double
      ] = js.native
    
    /* 1 */ val useCurrencyCode: typings.winrtUwp.Windows.Globalization.NumberFormatting.CurrencyFormatterMode.useCurrencyCode & Double = js.native
    
    /* 0 */ val useSymbol: typings.winrtUwp.Windows.Globalization.NumberFormatting.CurrencyFormatterMode.useSymbol & Double = js.native
  }
  
  /** Formats and parses decimal numbers. */
  @JSGlobal("Windows.Globalization.NumberFormatting.DecimalFormatter")
  @js.native
  /** Creates a DecimalFormatter object and initializes it to default values. */
  class DecimalFormatter ()
    extends StObject
       with typings.winrtUwp.Windows.Globalization.NumberFormatting.DecimalFormatter {
    /**
      * Creates a DecimalFormatter object initialized by a language list and a geographic region.
      * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
      * @param geographicRegion The identifier for the geographic region.
      */
    def this(languages: IIterable[String], geographicRegion: String) = this()
    
    /**
      * Returns a string representation of a Double number.
      * @param value The Double value to be formatted.
      * @return A string that represents the number.
      */
    /* CompleteClass */
    override def format(value: Double): String = js.native
    
    /**
      * Returns a string representation of a Double number.
      * @param value The Double value to be formatted.
      * @return A string that represents the number.
      */
    /* CompleteClass */
    override def formatDouble(value: Double): String = js.native
    
    /**
      * Returns a string representation of an Int64 number.
      * @param value The Int64 value to be formatted.
      * @return A string that represents the number.
      */
    /* CompleteClass */
    override def formatInt(value: Double): String = js.native
    
    /**
      * Returns a string representation of a UInt64 number.
      * @param value The UInt64 value to be formatted.
      * @return A string that represents the number.
      */
    /* CompleteClass */
    override def formatUInt(value: Double): String = js.native
    
    /** Gets or sets the minimum number of digits to display for the fraction part of the number. */
    /* CompleteClass */
    var fractionDigits: Double = js.native
    
    /** Gets the region that is used when formatting and parsing decimal numbers. */
    /* CompleteClass */
    var geographicRegion: String = js.native
    
    /** Gets or sets the minimum number of digits to display for the integer part of the number. */
    /* CompleteClass */
    var integerDigits: Double = js.native
    
    /** Gets or sets whether the decimal point of the number should always be displayed. */
    /* CompleteClass */
    var isDecimalPointAlwaysDisplayed: Boolean = js.native
    
    /** Gets or sets whether the integer part of the number should be grouped. */
    /* CompleteClass */
    var isGrouped: Boolean = js.native
    
    /** Gets or sets whether -0 is formatted as "-0" or "0". */
    /* CompleteClass */
    var isZeroSigned: Boolean = js.native
    
    /** Gets the priority list of language identifiers that is used when formatting and parsing decimal numbers. */
    /* CompleteClass */
    var languages: IVectorView[String] = js.native
    
    /** Gets or sets the current rounding strategy to be used when formatting numbers. */
    /* CompleteClass */
    var numberRounder: INumberRounder = js.native
    
    /** Gets or sets the numbering system that is used to format and parse decimal numbers. */
    /* CompleteClass */
    var numeralSystem: String = js.native
    
    /**
      * Attempts to parse a string representation of a Double number.
      * @param text The text to be parsed.
      * @return If successful, a Double that corresponds to the string representation, and otherwise null.
      */
    /* CompleteClass */
    override def parseDouble(text: String): Double = js.native
    
    /**
      * Attempts to parse a string representation of an integer.
      * @param text The text to be parsed.
      * @return If successful, an Int64 that corresponds to the string representation, and otherwise null.
      */
    /* CompleteClass */
    override def parseInt(text: String): Double = js.native
    
    /**
      * Attempts to parse a string representation of an unsigned integer.
      * @param text The text to be parsed.
      * @return If successful, a UInt64 that corresponds to the string representation, and otherwise null.
      */
    /* CompleteClass */
    override def parseUInt(text: String): Double = js.native
    
    /** Gets the geographic region that was most recently used to format or parse decimal values. */
    /* CompleteClass */
    var resolvedGeographicRegion: String = js.native
    
    /** Gets the language that was most recently used to format or parse decimal values. */
    /* CompleteClass */
    var resolvedLanguage: String = js.native
    
    /** Gets or sets the current padding to significant digits when a decimal number is formatted. */
    /* CompleteClass */
    var significantDigits: Double = js.native
  }
  
  /** Rounds numbers to a specified increment. */
  @JSGlobal("Windows.Globalization.NumberFormatting.IncrementNumberRounder")
  @js.native
  /** Creates an IncrementNumberRounder object. */
  class IncrementNumberRounder ()
    extends StObject
       with typings.winrtUwp.Windows.Globalization.NumberFormatting.IncrementNumberRounder {
    
    /** Gets or sets the increment this IncrementNumberRounder object uses for rounding. */
    /* CompleteClass */
    var increment: Double = js.native
    
    /**
      * Rounds a Double number to the specified increment.
      * @param value The Double value to be rounded.
      * @return The rounded number. This result is a double precision floating point number, which is not necessarily an integer.
      */
    /* CompleteClass */
    override def roundDouble(value: Double): Double = js.native
    
    /**
      * Rounds an Int32 number to the specified increment.
      * @param value The Int32 value to be rounded.
      * @return The rounded 32 bit integer.
      */
    /* CompleteClass */
    override def roundInt32(value: Double): Double = js.native
    
    /**
      * Rounds an Int64 number to the specified increment.
      * @param value The Int64 value to be rounded.
      * @return The rounded 64 bit integer.
      */
    /* CompleteClass */
    override def roundInt64(value: Double): Double = js.native
    
    /**
      * Rounds a Single number to the specified increment.
      * @param value The Single value to be rounded.
      * @return The rounded number. This result is a single precision floating point number, which is not necessarily an integer.
      */
    /* CompleteClass */
    override def roundSingle(value: Double): Double = js.native
    
    /**
      * Rounds a UInt32 number to the specified increment.
      * @param value The UInt32 value to be rounded.
      * @return The rounded unsigned 32 bit integer.
      */
    /* CompleteClass */
    override def roundUInt32(value: Double): Double = js.native
    
    /**
      * Rounds a UInt64 number to the specified increment.
      * @param value The UInt64 value to be rounded.
      * @return The rounded unsigned 64 bit integer.
      */
    /* CompleteClass */
    override def roundUInt64(value: Double): Double = js.native
    
    /** Gets or sets the rounding strategy value for this IncrementNumberRounder object. */
    /* CompleteClass */
    var roundingAlgorithm: RoundingAlgorithm = js.native
  }
  
  /** Translates digits of the Latin numerical system into digits of another numerical system. */
  @JSGlobal("Windows.Globalization.NumberFormatting.NumeralSystemTranslator")
  @js.native
  /** Creates a NumeralSystemTranslator object initialized by the list of current runtime language values preferred by the user. */
  class NumeralSystemTranslator ()
    extends StObject
       with typings.winrtUwp.Windows.Globalization.NumberFormatting.NumeralSystemTranslator {
    /**
      * Creates a NumeralSystemTranslator object initialized by a language list.
      * @param languages A list of BCP-47 language tags, in priority order, representing the choice of languages. They must all be well-formed according to Windows.Globalization.Language.isWellFormed .
      */
    def this(languages: IIterable[String]) = this()
    
    /** Gets the BCP-47 language tag(s) used to initialize this NumeralSystemTranslator object. */
    /* CompleteClass */
    var languages: IVectorView[String] = js.native
    
    /** Gets or sets the numeral system that Latin digits will be converted to on calls to TranslateNumerals . */
    /* CompleteClass */
    var numeralSystem: String = js.native
    
    /** Gets the language used to determine the numeral system when this object was initialized. */
    /* CompleteClass */
    var resolvedLanguage: String = js.native
    
    /**
      * Converts a string of characters containing Latin digits to a string containing the corresponding digits of NumeralSystem .
      * @param value A string of characters containing Latin digits to be converted.
      * @return A string containing the converted digits. This string may be a different length than value.
      */
    /* CompleteClass */
    override def translateNumerals(value: String): String = js.native
  }
  
  /** Formats and parses percentages. */
  @JSGlobal("Windows.Globalization.NumberFormatting.PercentFormatter")
  @js.native
  /** Creates a PercentFormatter object and initializes it to default values. */
  class PercentFormatter ()
    extends StObject
       with typings.winrtUwp.Windows.Globalization.NumberFormatting.PercentFormatter {
    /**
      * Creates a PercentFormatter object initialized by a language list and a geographic region.
      * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
      * @param geographicRegion The identifier for the geographic region.
      */
    def this(languages: IIterable[String], geographicRegion: String) = this()
    
    /**
      * Returns a string representation of a UInt64 percentage.
      * @param value The UInt64 value to be formatted.
      * @return A string that represents the percentage.
      */
    /* CompleteClass */
    override def format(value: Double): String = js.native
    
    /**
      * Returns a string representation of a Double percentage.
      * @param value The Double value to be formatted.
      * @return A string that represents the percentage.
      */
    /* CompleteClass */
    override def formatDouble(value: Double): String = js.native
    
    /**
      * Returns a string representation of an Int64 percentage.
      * @param value The Int64 value to be formatted.
      * @return A string that represents the percentage.
      */
    /* CompleteClass */
    override def formatInt(value: Double): String = js.native
    
    /**
      * Returns a string representation of a UInt64 percentage.
      * @param value The UInt64 value to be formatted.
      * @return A string that represents the percentage.
      */
    /* CompleteClass */
    override def formatUInt(value: Double): String = js.native
    
    /** Gets or sets the minimum number of digits to display for the fraction part of the percentage. */
    /* CompleteClass */
    var fractionDigits: Double = js.native
    
    /** Gets the region that is used when formatting and parsing percentages. */
    /* CompleteClass */
    var geographicRegion: String = js.native
    
    /** Gets or sets the minimum number of digits to display for the integer part of the percentage. */
    /* CompleteClass */
    var integerDigits: Double = js.native
    
    /** Gets or sets whether the decimal point of the percentage should always be displayed. */
    /* CompleteClass */
    var isDecimalPointAlwaysDisplayed: Boolean = js.native
    
    /** Gets or sets whether the integer part of the percentage should be grouped. */
    /* CompleteClass */
    var isGrouped: Boolean = js.native
    
    /** Gets or sets whether -0 is formatted as "-0" or "0". */
    /* CompleteClass */
    var isZeroSigned: Boolean = js.native
    
    /** Gets the priority list of language identifiers that is used when formatting and parsing percentages. */
    /* CompleteClass */
    var languages: IVectorView[String] = js.native
    
    /** Gets or sets the current rounding strategy to be used when formatting percents. */
    /* CompleteClass */
    var numberRounder: INumberRounder = js.native
    
    /** Gets or sets the numbering system that is used to format and parse percentages. */
    /* CompleteClass */
    var numeralSystem: String = js.native
    
    /**
      * Attempts to parse a string representation of a Double percentage.
      * @param text The text to be parsed.
      * @return If successful, a Double that corresponds to the string representation, and otherwise null.
      */
    /* CompleteClass */
    override def parseDouble(text: String): Double = js.native
    
    /**
      * Attempts to parse a string representation of an integer percentage.
      * @param text The text to be parsed.
      * @return If successful, an Int64 that corresponds to the string representation, and otherwise null.
      */
    /* CompleteClass */
    override def parseInt(text: String): Double = js.native
    
    /**
      * Attempts to parse a string representation of an unsigned integer percentage.
      * @param text The text to be parsed.
      * @return If successful, a UInt64 that corresponds to the string representation, and otherwise null.
      */
    /* CompleteClass */
    override def parseUInt(text: String): Double = js.native
    
    /** Gets the geographic region that was most recently used to format or parse percent values. */
    /* CompleteClass */
    var resolvedGeographicRegion: String = js.native
    
    /** Gets the language that was most recently used to format or parse percent values. */
    /* CompleteClass */
    var resolvedLanguage: String = js.native
    
    /** Gets or sets the current padding to significant digits when a percent is formatted. */
    /* CompleteClass */
    var significantDigits: Double = js.native
  }
  
  /** Formats and parses permillages. */
  @JSGlobal("Windows.Globalization.NumberFormatting.PermilleFormatter")
  @js.native
  /** Creates a PermilleFormatter object and initializes it to default values. */
  class PermilleFormatter ()
    extends StObject
       with typings.winrtUwp.Windows.Globalization.NumberFormatting.PermilleFormatter {
    /**
      * Creates a PermilleFormatter object initialized by a language list and a geographic region.
      * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
      * @param geographicRegion The identifier for the geographic region.
      */
    def this(languages: IIterable[String], geographicRegion: String) = this()
    
    /**
      * Returns a string representation of a UInt64 permillage.
      * @param value The UInt64 value to be formatted.
      * @return A string that represents the permillage.
      */
    /* CompleteClass */
    override def format(value: Double): String = js.native
    
    /**
      * Returns a string representation of a Double permillage.
      * @param value The Double value to be formatted.
      * @return A string that represents the permillage.
      */
    /* CompleteClass */
    override def formatDouble(value: Double): String = js.native
    
    /**
      * Returns a string representation of an Int64 permillage.
      * @param value The Int64 value to be formatted.
      * @return A string that represents the permillage.
      */
    /* CompleteClass */
    override def formatInt(value: Double): String = js.native
    
    /**
      * Returns a string representation of a UInt64 permillage.
      * @param value The UInt64 value to be formatted.
      * @return A string that represents the permillage.
      */
    /* CompleteClass */
    override def formatUInt(value: Double): String = js.native
    
    /** Gets or sets the minimum number of digits to display for the fraction part of the permillage. */
    /* CompleteClass */
    var fractionDigits: Double = js.native
    
    /** Gets the region that is used when formatting and parsing permille values. */
    /* CompleteClass */
    var geographicRegion: String = js.native
    
    /** Gets or sets the minimum number of digits to display for the integer part of the permillage. */
    /* CompleteClass */
    var integerDigits: Double = js.native
    
    /** Gets or sets whether the decimal point of the permillage should always be displayed. */
    /* CompleteClass */
    var isDecimalPointAlwaysDisplayed: Boolean = js.native
    
    /** Gets or sets whether the integer part of the permillage should be grouped. */
    /* CompleteClass */
    var isGrouped: Boolean = js.native
    
    /** Gets or sets whether -0 is formatted as "-0" or "0". */
    /* CompleteClass */
    var isZeroSigned: Boolean = js.native
    
    /** Gets the priority list of language identifiers that is used when formatting and parsing permille values. */
    /* CompleteClass */
    var languages: IVectorView[String] = js.native
    
    /** Gets or sets the current rounding strategy to be used when formatting permilles. */
    /* CompleteClass */
    var numberRounder: INumberRounder = js.native
    
    /** Gets or sets the numbering system that is used to format and parse permille values. */
    /* CompleteClass */
    var numeralSystem: String = js.native
    
    /**
      * Attempts to parse a string representation of a Double permillage.
      * @param text The text to be parsed.
      * @return If successful, a Double that corresponds to the string representation, and otherwise null.
      */
    /* CompleteClass */
    override def parseDouble(text: String): Double = js.native
    
    /**
      * Attempts to parse a string representation of an integer permillage.
      * @param text The text to be parsed.
      * @return If successful, an Int64 that corresponds to the string representation, and otherwise null.
      */
    /* CompleteClass */
    override def parseInt(text: String): Double = js.native
    
    /**
      * Attempts to parse a string representation of an unsigned integer permillage.
      * @param text The text to be parsed.
      * @return If successful, a UInt64 that corresponds to the string representation, and otherwise null.
      */
    /* CompleteClass */
    override def parseUInt(text: String): Double = js.native
    
    /** Gets the geographic region that was most recently used to format or parse permille values. */
    /* CompleteClass */
    var resolvedGeographicRegion: String = js.native
    
    /** Gets the language that was most recently used to format or parse permille values. */
    /* CompleteClass */
    var resolvedLanguage: String = js.native
    
    /** Gets or sets the current padding to significant digits when a permille is formatted. */
    /* CompleteClass */
    var significantDigits: Double = js.native
  }
  
  /** Specifies the algorithm used to round numbers. */
  @JSGlobal("Windows.Globalization.NumberFormatting.RoundingAlgorithm")
  @js.native
  object RoundingAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm & Double
      ] = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.none & Double = js.native
    
    /* 4 */ val roundAwayFromZero: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundAwayFromZero & Double = js.native
    
    /* 1 */ val roundDown: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundDown & Double = js.native
    
    /* 8 */ val roundHalfAwayFromZero: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfAwayFromZero & Double = js.native
    
    /* 5 */ val roundHalfDown: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfDown & Double = js.native
    
    /* 9 */ val roundHalfToEven: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfToEven & Double = js.native
    
    /* 10 */ val roundHalfToOdd: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfToOdd & Double = js.native
    
    /* 7 */ val roundHalfTowardsZero: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfTowardsZero & Double = js.native
    
    /* 6 */ val roundHalfUp: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfUp & Double = js.native
    
    /* 3 */ val roundTowardsZero: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundTowardsZero & Double = js.native
    
    /* 2 */ val roundUp: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundUp & Double = js.native
  }
  
  /** Rounds numbers to a specified number of significant digits. */
  @JSGlobal("Windows.Globalization.NumberFormatting.SignificantDigitsNumberRounder")
  @js.native
  /** Creates a SignificantDigitsNumberRounder object. */
  class SignificantDigitsNumberRounder ()
    extends StObject
       with typings.winrtUwp.Windows.Globalization.NumberFormatting.SignificantDigitsNumberRounder {
    
    /**
      * Rounds a Double number to the specified number of significant digits.
      * @param value The Double value to be rounded.
      * @return The rounded number. This result is a double precision floating point number, which is not necessarily an integer.
      */
    /* CompleteClass */
    override def roundDouble(value: Double): Double = js.native
    
    /**
      * Rounds an Int32 number to the specified number of significant digits.
      * @param value The Int32 value to be rounded.
      * @return The rounded 32 bit integer.
      */
    /* CompleteClass */
    override def roundInt32(value: Double): Double = js.native
    
    /**
      * Rounds an Int64 number to the specified number of significant digits.
      * @param value The Int64 value to be rounded.
      * @return The rounded 64 bit integer.
      */
    /* CompleteClass */
    override def roundInt64(value: Double): Double = js.native
    
    /**
      * Rounds a Single number to the specified number of significant digits.
      * @param value The Single value to be rounded.
      * @return The rounded number. This result is a single precision floating point number, which is not necessarily an integer.
      */
    /* CompleteClass */
    override def roundSingle(value: Double): Double = js.native
    
    /**
      * Rounds a UInt32 number to the specified number of significant digits.
      * @param value The UInt32 value to be rounded.
      * @return The rounded unsigned 32 bit integer.
      */
    /* CompleteClass */
    override def roundUInt32(value: Double): Double = js.native
    
    /**
      * Rounds a UInt64 number to the specified number of significant digits.
      * @param value The UInt64 value to be rounded.
      * @return The rounded unsigned 64 bit integer.
      */
    /* CompleteClass */
    override def roundUInt64(value: Double): Double = js.native
    
    /** Gets or sets the rounding strategy value for this SignificantDigitsNumberRounder object. */
    /* CompleteClass */
    var roundingAlgorithm: RoundingAlgorithm = js.native
    
    /** Gets or sets the number of significant digits this SignificantDigitsNumberRounder object uses for rounding. */
    /* CompleteClass */
    var significantDigits: Double = js.native
  }
}
