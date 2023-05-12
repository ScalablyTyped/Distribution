package typings.wikibaseSdk

import typings.std.Record
import typings.wikibaseSdk.distSrcHelpersParseResponsesMod.CirrusSearchResult
import typings.wikibaseSdk.distSrcHelpersTimeMod.TimeInputValue
import typings.wikibaseSdk.distSrcTypesSparqlMod.SparqlValueObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait After extends StObject {
    
    var after: Double
    
    var before: Double
    
    var calendermodel: String
    
    var precision: Double
    
    var time: String
    
    var timezone: Double
  }
  object After {
    
    inline def apply(
      after: Double,
      before: Double,
      calendermodel: String,
      precision: Double,
      time: String,
      timezone: Double
    ): After = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], calendermodel = calendermodel.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[After]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: After] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: Double): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: Double): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setCalendermodel(value: String): Self = StObject.set(x, "calendermodel", value.asInstanceOf[js.Any])
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimezone(value: Double): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
  
  trait Amount extends StObject {
    
    var amount: String
    
    var lowerBound: js.UndefOr[String] = js.undefined
    
    var unit: String
    
    var upperBound: js.UndefOr[String] = js.undefined
  }
  object Amount {
    
    inline def apply(amount: String, unit: String): Amount = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Amount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Amount] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setLowerBound(value: String): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
      
      inline def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUpperBound(value: String): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
      
      inline def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
    }
  }
  
  trait Bindings extends StObject {
    
    val bindings: js.Array[Record[String, SparqlValueObj]]
  }
  object Bindings {
    
    inline def apply(bindings: js.Array[Record[String, SparqlValueObj]]): Bindings = {
      val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bindings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bindings] (val x: Self) extends AnyVal {
      
      inline def setBindings(value: js.Array[Record[String, SparqlValueObj]]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      inline def setBindingsVarargs(value: (Record[String, SparqlValueObj])*): Self = StObject.set(x, "bindings", js.Array(value*))
    }
  }
  
  trait CommonsMedia extends StObject {
    
    def commonsMedia(datavalue: Any): Any
    
    def `external-id`(datavalue: Any): Any
    
    def `geo-shape`(datavalue: Any): Any
    
    def `globe-coordinate`(datavalue: Any, options: Any): Any
    
    def math(datavalue: Any): Any
    
    def monolingualtext(datavalue: Any, options: Any): Any
    
    def `musical-notation`(datavalue: Any): Any
    
    def quantity(datavalue: Any, options: Any): Any
    
    def string(datavalue: Any): Any
    
    def `tabular-data`(datavalue: Any): Any
    
    def time(datavalue: Any, options: Any): Any
    
    def url(datavalue: Any): Any
    
    def `wikibase-entityid`(datavalue: Any, options: Any): Any
    
    def `wikibase-form`(datavalue: Any, options: Any): Any
    
    def `wikibase-item`(datavalue: Any, options: Any): Any
    
    def `wikibase-lexeme`(datavalue: Any, options: Any): Any
    
    def `wikibase-property`(datavalue: Any, options: Any): Any
    
    def `wikibase-sense`(datavalue: Any, options: Any): Any
  }
  object CommonsMedia {
    
    inline def apply(
      commonsMedia: Any => Any,
      `external-id`: Any => Any,
      `geo-shape`: Any => Any,
      `globe-coordinate`: (Any, Any) => Any,
      math: Any => Any,
      monolingualtext: (Any, Any) => Any,
      `musical-notation`: Any => Any,
      quantity: (Any, Any) => Any,
      string: Any => Any,
      `tabular-data`: Any => Any,
      time: (Any, Any) => Any,
      url: Any => Any,
      `wikibase-entityid`: (Any, Any) => Any,
      `wikibase-form`: (Any, Any) => Any,
      `wikibase-item`: (Any, Any) => Any,
      `wikibase-lexeme`: (Any, Any) => Any,
      `wikibase-property`: (Any, Any) => Any,
      `wikibase-sense`: (Any, Any) => Any
    ): CommonsMedia = {
      val __obj = js.Dynamic.literal(commonsMedia = js.Any.fromFunction1(commonsMedia), math = js.Any.fromFunction1(math), monolingualtext = js.Any.fromFunction2(monolingualtext), quantity = js.Any.fromFunction2(quantity), string = js.Any.fromFunction1(string), time = js.Any.fromFunction2(time), url = js.Any.fromFunction1(url))
      __obj.updateDynamic("external-id")(js.Any.fromFunction1(`external-id`))
      __obj.updateDynamic("geo-shape")(js.Any.fromFunction1(`geo-shape`))
      __obj.updateDynamic("globe-coordinate")(js.Any.fromFunction2(`globe-coordinate`))
      __obj.updateDynamic("musical-notation")(js.Any.fromFunction1(`musical-notation`))
      __obj.updateDynamic("tabular-data")(js.Any.fromFunction1(`tabular-data`))
      __obj.updateDynamic("wikibase-entityid")(js.Any.fromFunction2(`wikibase-entityid`))
      __obj.updateDynamic("wikibase-form")(js.Any.fromFunction2(`wikibase-form`))
      __obj.updateDynamic("wikibase-item")(js.Any.fromFunction2(`wikibase-item`))
      __obj.updateDynamic("wikibase-lexeme")(js.Any.fromFunction2(`wikibase-lexeme`))
      __obj.updateDynamic("wikibase-property")(js.Any.fromFunction2(`wikibase-property`))
      __obj.updateDynamic("wikibase-sense")(js.Any.fromFunction2(`wikibase-sense`))
      __obj.asInstanceOf[CommonsMedia]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonsMedia] (val x: Self) extends AnyVal {
      
      inline def setCommonsMedia(value: Any => Any): Self = StObject.set(x, "commonsMedia", js.Any.fromFunction1(value))
      
      inline def `setExternal-id`(value: Any => Any): Self = StObject.set(x, "external-id", js.Any.fromFunction1(value))
      
      inline def `setGeo-shape`(value: Any => Any): Self = StObject.set(x, "geo-shape", js.Any.fromFunction1(value))
      
      inline def `setGlobe-coordinate`(value: (Any, Any) => Any): Self = StObject.set(x, "globe-coordinate", js.Any.fromFunction2(value))
      
      inline def setMath(value: Any => Any): Self = StObject.set(x, "math", js.Any.fromFunction1(value))
      
      inline def setMonolingualtext(value: (Any, Any) => Any): Self = StObject.set(x, "monolingualtext", js.Any.fromFunction2(value))
      
      inline def `setMusical-notation`(value: Any => Any): Self = StObject.set(x, "musical-notation", js.Any.fromFunction1(value))
      
      inline def setQuantity(value: (Any, Any) => Any): Self = StObject.set(x, "quantity", js.Any.fromFunction2(value))
      
      inline def setString(value: Any => Any): Self = StObject.set(x, "string", js.Any.fromFunction1(value))
      
      inline def `setTabular-data`(value: Any => Any): Self = StObject.set(x, "tabular-data", js.Any.fromFunction1(value))
      
      inline def setTime(value: (Any, Any) => Any): Self = StObject.set(x, "time", js.Any.fromFunction2(value))
      
      inline def setUrl(value: Any => Any): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      inline def `setWikibase-entityid`(value: (Any, Any) => Any): Self = StObject.set(x, "wikibase-entityid", js.Any.fromFunction2(value))
      
      inline def `setWikibase-form`(value: (Any, Any) => Any): Self = StObject.set(x, "wikibase-form", js.Any.fromFunction2(value))
      
      inline def `setWikibase-item`(value: (Any, Any) => Any): Self = StObject.set(x, "wikibase-item", js.Any.fromFunction2(value))
      
      inline def `setWikibase-lexeme`(value: (Any, Any) => Any): Self = StObject.set(x, "wikibase-lexeme", js.Any.fromFunction2(value))
      
      inline def `setWikibase-property`(value: (Any, Any) => Any): Self = StObject.set(x, "wikibase-property", js.Any.fromFunction2(value))
      
      inline def `setWikibase-sense`(value: (Any, Any) => Any): Self = StObject.set(x, "wikibase-sense", js.Any.fromFunction2(value))
    }
  }
  
  trait Entitytype extends StObject {
    
    var `entity-type`: String
    
    var id: String
    
    var `numeric-id`: Double
  }
  object Entitytype {
    
    inline def apply(`entity-type`: String, id: String, `numeric-id`: Double): Entitytype = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("entity-type")(`entity-type`.asInstanceOf[js.Any])
      __obj.updateDynamic("numeric-id")(`numeric-id`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entitytype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entitytype] (val x: Self) extends AnyVal {
      
      inline def `setEntity-type`(value: String): Self = StObject.set(x, "entity-type", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def `setNumeric-id`(value: Double): Self = StObject.set(x, "numeric-id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Epoch extends StObject {
    
    def epoch(value: TimeInputValue): String | Double
    
    def iso(value: TimeInputValue): String
    
    def none(wikibaseTime: TimeInputValue): String
    
    def `simple-day`(value: TimeInputValue): String
  }
  object Epoch {
    
    inline def apply(
      epoch: TimeInputValue => String | Double,
      iso: TimeInputValue => String,
      none: TimeInputValue => String,
      `simple-day`: TimeInputValue => String
    ): Epoch = {
      val __obj = js.Dynamic.literal(epoch = js.Any.fromFunction1(epoch), iso = js.Any.fromFunction1(iso), none = js.Any.fromFunction1(none))
      __obj.updateDynamic("simple-day")(js.Any.fromFunction1(`simple-day`))
      __obj.asInstanceOf[Epoch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Epoch] (val x: Self) extends AnyVal {
      
      inline def setEpoch(value: TimeInputValue => String | Double): Self = StObject.set(x, "epoch", js.Any.fromFunction1(value))
      
      inline def setIso(value: TimeInputValue => String): Self = StObject.set(x, "iso", js.Any.fromFunction1(value))
      
      inline def setNone(value: TimeInputValue => String): Self = StObject.set(x, "none", js.Any.fromFunction1(value))
      
      inline def `setSimple-day`(value: TimeInputValue => String): Self = StObject.set(x, "simple-day", js.Any.fromFunction1(value))
    }
  }
  
  trait From extends StObject {
    
    var from: String
    
    var to: String
  }
  object From {
    
    inline def apply(from: String, to: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait Language extends StObject {
    
    var language: String
    
    var text: String
    
    var `type`: String
  }
  object Language {
    
    inline def apply(language: String, text: String, `type`: String): Language = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Search extends StObject {
    
    var search: js.Array[CirrusSearchResult]
  }
  object Search {
    
    inline def apply(search: js.Array[CirrusSearchResult]): Search = {
      val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Search]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Search] (val x: Self) extends AnyVal {
      
      inline def setSearch(value: js.Array[CirrusSearchResult]): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchVarargs(value: CirrusSearchResult*): Self = StObject.set(x, "search", js.Array(value*))
    }
  }
  
  trait SearchString extends StObject {
    
    var search: String
  }
  object SearchString {
    
    inline def apply(search: String): SearchString = {
      val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchString] (val x: Self) extends AnyVal {
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  trait Vars extends StObject {
    
    val vars: js.Array[String]
  }
  object Vars {
    
    inline def apply(vars: js.Array[String]): Vars = {
      val __obj = js.Dynamic.literal(vars = vars.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vars]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Vars] (val x: Self) extends AnyVal {
      
      inline def setVars(value: js.Array[String]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      
      inline def setVarsVarargs(value: String*): Self = StObject.set(x, "vars", js.Array(value*))
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("*")
    var Asterisk: String
    
    var code: String
    
    var info: String
  }
  object _empty {
    
    inline def apply(Asterisk: String, code: String, info: String): _empty = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
      __obj.updateDynamic("*")(Asterisk.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      inline def setAsterisk(value: String): Self = StObject.set(x, "*", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
}
