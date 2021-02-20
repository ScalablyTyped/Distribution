package typings.winrtUwp.global.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for formatting currencies, decimal numbers, percent values, and permille values, based on the user's languages and geographic region. */
object NumberFormatting {
  
  /** Formats and parses currencies. */
  @JSGlobal("Windows.Globalization.NumberFormatting.CurrencyFormatter")
  @js.native
  class CurrencyFormatter protected ()
    extends typings.winrtUwp.Windows.Globalization.NumberFormatting.CurrencyFormatter {
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
  }
  
  /** Specifies the use of symbols or codes when currency is formatted. */
  @JSGlobal("Windows.Globalization.NumberFormatting.CurrencyFormatterMode")
  @js.native
  object CurrencyFormatterMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Globalization.NumberFormatting.CurrencyFormatterMode with Double
      ] = js.native
    
    /* 1 */ val useCurrencyCode: typings.winrtUwp.Windows.Globalization.NumberFormatting.CurrencyFormatterMode.useCurrencyCode with Double = js.native
    
    /* 0 */ val useSymbol: typings.winrtUwp.Windows.Globalization.NumberFormatting.CurrencyFormatterMode.useSymbol with Double = js.native
  }
  
  /** Formats and parses decimal numbers. */
  @JSGlobal("Windows.Globalization.NumberFormatting.DecimalFormatter")
  @js.native
  /** Creates a DecimalFormatter object and initializes it to default values. */
  class DecimalFormatter ()
    extends typings.winrtUwp.Windows.Globalization.NumberFormatting.DecimalFormatter {
    /**
      * Creates a DecimalFormatter object initialized by a language list and a geographic region.
      * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
      * @param geographicRegion The identifier for the geographic region.
      */
    def this(languages: IIterable[String], geographicRegion: String) = this()
  }
  
  /** Rounds numbers to a specified increment. */
  @JSGlobal("Windows.Globalization.NumberFormatting.IncrementNumberRounder")
  @js.native
  /** Creates an IncrementNumberRounder object. */
  class IncrementNumberRounder ()
    extends typings.winrtUwp.Windows.Globalization.NumberFormatting.IncrementNumberRounder
  
  /** Translates digits of the Latin numerical system into digits of another numerical system. */
  @JSGlobal("Windows.Globalization.NumberFormatting.NumeralSystemTranslator")
  @js.native
  /** Creates a NumeralSystemTranslator object initialized by the list of current runtime language values preferred by the user. */
  class NumeralSystemTranslator ()
    extends typings.winrtUwp.Windows.Globalization.NumberFormatting.NumeralSystemTranslator {
    /**
      * Creates a NumeralSystemTranslator object initialized by a language list.
      * @param languages A list of BCP-47 language tags, in priority order, representing the choice of languages. They must all be well-formed according to Windows.Globalization.Language.isWellFormed .
      */
    def this(languages: IIterable[String]) = this()
  }
  
  /** Formats and parses percentages. */
  @JSGlobal("Windows.Globalization.NumberFormatting.PercentFormatter")
  @js.native
  /** Creates a PercentFormatter object and initializes it to default values. */
  class PercentFormatter ()
    extends typings.winrtUwp.Windows.Globalization.NumberFormatting.PercentFormatter {
    /**
      * Creates a PercentFormatter object initialized by a language list and a geographic region.
      * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
      * @param geographicRegion The identifier for the geographic region.
      */
    def this(languages: IIterable[String], geographicRegion: String) = this()
  }
  
  /** Formats and parses permillages. */
  @JSGlobal("Windows.Globalization.NumberFormatting.PermilleFormatter")
  @js.native
  /** Creates a PermilleFormatter object and initializes it to default values. */
  class PermilleFormatter ()
    extends typings.winrtUwp.Windows.Globalization.NumberFormatting.PermilleFormatter {
    /**
      * Creates a PermilleFormatter object initialized by a language list and a geographic region.
      * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
      * @param geographicRegion The identifier for the geographic region.
      */
    def this(languages: IIterable[String], geographicRegion: String) = this()
  }
  
  /** Specifies the algorithm used to round numbers. */
  @JSGlobal("Windows.Globalization.NumberFormatting.RoundingAlgorithm")
  @js.native
  object RoundingAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm with Double
      ] = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.none with Double = js.native
    
    /* 4 */ val roundAwayFromZero: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundAwayFromZero with Double = js.native
    
    /* 1 */ val roundDown: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundDown with Double = js.native
    
    /* 8 */ val roundHalfAwayFromZero: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfAwayFromZero with Double = js.native
    
    /* 5 */ val roundHalfDown: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfDown with Double = js.native
    
    /* 9 */ val roundHalfToEven: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfToEven with Double = js.native
    
    /* 10 */ val roundHalfToOdd: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfToOdd with Double = js.native
    
    /* 7 */ val roundHalfTowardsZero: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfTowardsZero with Double = js.native
    
    /* 6 */ val roundHalfUp: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfUp with Double = js.native
    
    /* 3 */ val roundTowardsZero: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundTowardsZero with Double = js.native
    
    /* 2 */ val roundUp: typings.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundUp with Double = js.native
  }
  
  /** Rounds numbers to a specified number of significant digits. */
  @JSGlobal("Windows.Globalization.NumberFormatting.SignificantDigitsNumberRounder")
  @js.native
  /** Creates a SignificantDigitsNumberRounder object. */
  class SignificantDigitsNumberRounder ()
    extends typings.winrtUwp.Windows.Globalization.NumberFormatting.SignificantDigitsNumberRounder
}
