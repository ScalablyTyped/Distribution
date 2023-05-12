package typings.twitterCldr

import typings.std.Record
import typings.twitterCldr.anon.All
import typings.twitterCldr.anon.Children
import typings.twitterCldr.anon.Codeforterritory
import typings.twitterCldr.anon.Compile
import typings.twitterCldr.anon.Currencycodes
import typings.twitterCldr.anon.Fromstring
import typings.twitterCldr.anon.Instantiable
import typings.twitterCldr.anon.Instantiable1
import typings.twitterCldr.anon.Instantiable2
import typings.twitterCldr.anon.Instantiable3
import typings.twitterCldr.anon.InstantiableEachsentence
import typings.twitterCldr.anon.InstantiableGroupnames
import typings.twitterCldr.anon.Isvalid
import typings.twitterCldr.anon.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("twitter_cldr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(locale: String): TwitterCldr = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(locale.asInstanceOf[js.Any]).asInstanceOf[TwitterCldr]
  
  trait BidiString extends StObject {
    
    def reorder_visually(): BidiString
  }
  object BidiString {
    
    inline def apply(reorder_visually: () => BidiString): BidiString = {
      val __obj = js.Dynamic.literal(reorder_visually = js.Any.fromFunction0(reorder_visually))
      __obj.asInstanceOf[BidiString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BidiString] (val x: Self) extends AnyVal {
      
      inline def setReorder_visually(value: () => BidiString): Self = StObject.set(x, "reorder_visually", js.Any.fromFunction0(value))
    }
  }
  
  type CldrData = Record[String, Any]
  
  trait Currency extends StObject {
    
    var cldr_symbol: String
    
    var code_points: js.Array[Double]
    
    var country: String
    
    var currency: String
    
    var name: String
    
    var symbol: String
  }
  object Currency {
    
    inline def apply(
      cldr_symbol: String,
      code_points: js.Array[Double],
      country: String,
      currency: String,
      name: String,
      symbol: String
    ): Currency = {
      val __obj = js.Dynamic.literal(cldr_symbol = cldr_symbol.asInstanceOf[js.Any], code_points = code_points.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
      
      inline def setCldr_symbol(value: String): Self = StObject.set(x, "cldr_symbol", value.asInstanceOf[js.Any])
      
      inline def setCode_points(value: js.Array[Double]): Self = StObject.set(x, "code_points", value.asInstanceOf[js.Any])
      
      inline def setCode_pointsVarargs(value: Double*): Self = StObject.set(x, "code_points", js.Array(value*))
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twitterCldr.twitterCldrStrings.zero
    - typings.twitterCldr.twitterCldrStrings.one
    - typings.twitterCldr.twitterCldrStrings.two
    - typings.twitterCldr.twitterCldrStrings.few
    - typings.twitterCldr.twitterCldrStrings.many
    - typings.twitterCldr.twitterCldrStrings.other
  */
  trait PluralRule extends StObject
  object PluralRule {
    
    inline def few: typings.twitterCldr.twitterCldrStrings.few = "few".asInstanceOf[typings.twitterCldr.twitterCldrStrings.few]
    
    inline def many: typings.twitterCldr.twitterCldrStrings.many = "many".asInstanceOf[typings.twitterCldr.twitterCldrStrings.many]
    
    inline def one: typings.twitterCldr.twitterCldrStrings.one = "one".asInstanceOf[typings.twitterCldr.twitterCldrStrings.one]
    
    inline def other: typings.twitterCldr.twitterCldrStrings.other = "other".asInstanceOf[typings.twitterCldr.twitterCldrStrings.other]
    
    inline def two: typings.twitterCldr.twitterCldrStrings.two = "two".asInstanceOf[typings.twitterCldr.twitterCldrStrings.two]
    
    inline def zero: typings.twitterCldr.twitterCldrStrings.zero = "zero".asInstanceOf[typings.twitterCldr.twitterCldrStrings.zero]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twitterCldr.twitterCldrStrings.SpelloutRules
    - typings.twitterCldr.twitterCldrStrings.OrdinalRules
  */
  trait RbnfGroupName extends StObject
  object RbnfGroupName {
    
    inline def OrdinalRules: typings.twitterCldr.twitterCldrStrings.OrdinalRules = "OrdinalRules".asInstanceOf[typings.twitterCldr.twitterCldrStrings.OrdinalRules]
    
    inline def SpelloutRules: typings.twitterCldr.twitterCldrStrings.SpelloutRules = "SpelloutRules".asInstanceOf[typings.twitterCldr.twitterCldrStrings.SpelloutRules]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twitterCldr.twitterCldrStrings.second
    - typings.twitterCldr.twitterCldrStrings.minute
    - typings.twitterCldr.twitterCldrStrings.hour
    - typings.twitterCldr.twitterCldrStrings.day
    - typings.twitterCldr.twitterCldrStrings.week
    - typings.twitterCldr.twitterCldrStrings.month
    - typings.twitterCldr.twitterCldrStrings.year
  */
  trait TimeUnit extends StObject
  object TimeUnit {
    
    inline def day: typings.twitterCldr.twitterCldrStrings.day = "day".asInstanceOf[typings.twitterCldr.twitterCldrStrings.day]
    
    inline def hour: typings.twitterCldr.twitterCldrStrings.hour = "hour".asInstanceOf[typings.twitterCldr.twitterCldrStrings.hour]
    
    inline def minute: typings.twitterCldr.twitterCldrStrings.minute = "minute".asInstanceOf[typings.twitterCldr.twitterCldrStrings.minute]
    
    inline def month: typings.twitterCldr.twitterCldrStrings.month = "month".asInstanceOf[typings.twitterCldr.twitterCldrStrings.month]
    
    inline def second: typings.twitterCldr.twitterCldrStrings.second = "second".asInstanceOf[typings.twitterCldr.twitterCldrStrings.second]
    
    inline def week: typings.twitterCldr.twitterCldrStrings.week = "week".asInstanceOf[typings.twitterCldr.twitterCldrStrings.week]
    
    inline def year: typings.twitterCldr.twitterCldrStrings.year = "year".asInstanceOf[typings.twitterCldr.twitterCldrStrings.year]
  }
  
  trait TwitterCldr extends StObject {
    
    var Bidi: Fromstring
    
    var BreakIterator: InstantiableEachsentence
    
    var Currencies: Currencycodes
    
    var CurrencyFormatter: Instantiable3
    
    var DateTimeFormatter: Instantiable
    
    var DecimalFormatter: Instantiable2
    
    var LongDecimalFormatter: Instantiable2
    
    var PercentFormatter: Instantiable2
    
    var PhoneCodes: Codeforterritory
    
    var PluralRules: All
    
    var PostalCodes: Isvalid
    
    /** Rule-Based Number Formatting */
    var RBNF: InstantiableGroupnames
    
    var Settings: Locale
    
    var ShortDecimalFormatter: Instantiable2
    
    var TerritoriesContainment: Children
    
    var TimespanFormatter: Instantiable1
    
    var UnicodeRegex: Compile
    
    def get_data(): CldrData
    
    def set_data(data: CldrData): Null
  }
  object TwitterCldr {
    
    inline def apply(
      Bidi: Fromstring,
      BreakIterator: InstantiableEachsentence,
      Currencies: Currencycodes,
      CurrencyFormatter: Instantiable3,
      DateTimeFormatter: Instantiable,
      DecimalFormatter: Instantiable2,
      LongDecimalFormatter: Instantiable2,
      PercentFormatter: Instantiable2,
      PhoneCodes: Codeforterritory,
      PluralRules: All,
      PostalCodes: Isvalid,
      RBNF: InstantiableGroupnames,
      Settings: Locale,
      ShortDecimalFormatter: Instantiable2,
      TerritoriesContainment: Children,
      TimespanFormatter: Instantiable1,
      UnicodeRegex: Compile,
      get_data: () => CldrData,
      set_data: CldrData => Null
    ): TwitterCldr = {
      val __obj = js.Dynamic.literal(Bidi = Bidi.asInstanceOf[js.Any], BreakIterator = BreakIterator.asInstanceOf[js.Any], Currencies = Currencies.asInstanceOf[js.Any], CurrencyFormatter = CurrencyFormatter.asInstanceOf[js.Any], DateTimeFormatter = DateTimeFormatter.asInstanceOf[js.Any], DecimalFormatter = DecimalFormatter.asInstanceOf[js.Any], LongDecimalFormatter = LongDecimalFormatter.asInstanceOf[js.Any], PercentFormatter = PercentFormatter.asInstanceOf[js.Any], PhoneCodes = PhoneCodes.asInstanceOf[js.Any], PluralRules = PluralRules.asInstanceOf[js.Any], PostalCodes = PostalCodes.asInstanceOf[js.Any], RBNF = RBNF.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any], ShortDecimalFormatter = ShortDecimalFormatter.asInstanceOf[js.Any], TerritoriesContainment = TerritoriesContainment.asInstanceOf[js.Any], TimespanFormatter = TimespanFormatter.asInstanceOf[js.Any], UnicodeRegex = UnicodeRegex.asInstanceOf[js.Any], get_data = js.Any.fromFunction0(get_data), set_data = js.Any.fromFunction1(set_data))
      __obj.asInstanceOf[TwitterCldr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TwitterCldr] (val x: Self) extends AnyVal {
      
      inline def setBidi(value: Fromstring): Self = StObject.set(x, "Bidi", value.asInstanceOf[js.Any])
      
      inline def setBreakIterator(value: InstantiableEachsentence): Self = StObject.set(x, "BreakIterator", value.asInstanceOf[js.Any])
      
      inline def setCurrencies(value: Currencycodes): Self = StObject.set(x, "Currencies", value.asInstanceOf[js.Any])
      
      inline def setCurrencyFormatter(value: Instantiable3): Self = StObject.set(x, "CurrencyFormatter", value.asInstanceOf[js.Any])
      
      inline def setDateTimeFormatter(value: Instantiable): Self = StObject.set(x, "DateTimeFormatter", value.asInstanceOf[js.Any])
      
      inline def setDecimalFormatter(value: Instantiable2): Self = StObject.set(x, "DecimalFormatter", value.asInstanceOf[js.Any])
      
      inline def setGet_data(value: () => CldrData): Self = StObject.set(x, "get_data", js.Any.fromFunction0(value))
      
      inline def setLongDecimalFormatter(value: Instantiable2): Self = StObject.set(x, "LongDecimalFormatter", value.asInstanceOf[js.Any])
      
      inline def setPercentFormatter(value: Instantiable2): Self = StObject.set(x, "PercentFormatter", value.asInstanceOf[js.Any])
      
      inline def setPhoneCodes(value: Codeforterritory): Self = StObject.set(x, "PhoneCodes", value.asInstanceOf[js.Any])
      
      inline def setPluralRules(value: All): Self = StObject.set(x, "PluralRules", value.asInstanceOf[js.Any])
      
      inline def setPostalCodes(value: Isvalid): Self = StObject.set(x, "PostalCodes", value.asInstanceOf[js.Any])
      
      inline def setRBNF(value: InstantiableGroupnames): Self = StObject.set(x, "RBNF", value.asInstanceOf[js.Any])
      
      inline def setSet_data(value: CldrData => Null): Self = StObject.set(x, "set_data", js.Any.fromFunction1(value))
      
      inline def setSettings(value: Locale): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
      
      inline def setShortDecimalFormatter(value: Instantiable2): Self = StObject.set(x, "ShortDecimalFormatter", value.asInstanceOf[js.Any])
      
      inline def setTerritoriesContainment(value: Children): Self = StObject.set(x, "TerritoriesContainment", value.asInstanceOf[js.Any])
      
      inline def setTimespanFormatter(value: Instantiable1): Self = StObject.set(x, "TimespanFormatter", value.asInstanceOf[js.Any])
      
      inline def setUnicodeRegex(value: Compile): Self = StObject.set(x, "UnicodeRegex", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnicodeRegex extends StObject {
    
    def `match`(str: String): js.Array[String]
    
    def to_regexp(): js.RegExp
  }
  object UnicodeRegex {
    
    inline def apply(`match`: String => js.Array[String], to_regexp: () => js.RegExp): UnicodeRegex = {
      val __obj = js.Dynamic.literal(to_regexp = js.Any.fromFunction0(to_regexp))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[UnicodeRegex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnicodeRegex] (val x: Self) extends AnyVal {
      
      inline def setMatch(value: String => js.Array[String]): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setTo_regexp(value: () => js.RegExp): Self = StObject.set(x, "to_regexp", js.Any.fromFunction0(value))
    }
  }
}
