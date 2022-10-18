package typings.tannin

import org.scalablytyped.runtime.StringDictionary
import typings.std.TimerHandler
import typings.tannin.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tannin", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Tannin {
    /**
      * Tannin constructor.
      *
      * @class
      *
      * @param {TanninLocaleData} data      Jed-formatted locale data.
      * @param {TanninOptions}    [options] Tannin options.
      */
    def this(data: StringDictionary[Dictkey]) = this()
    def this(data: StringDictionary[Dictkey], options: TanninOptions) = this()
  }
  
  @js.native
  trait Tannin extends StObject {
    
    /**
      * Jed-formatted locale data.
      *
      * @name Tannin#data
      * @type {TanninLocaleData}
      */
    var data: TanninLocaleData = js.native
    
    def dcnpgettext(domain: String, context: String, singular: String): String = js.native
    def dcnpgettext(domain: String, context: String, singular: String, plural: String): String = js.native
    def dcnpgettext(domain: String, context: String, singular: String, plural: String, n: Double): String = js.native
    def dcnpgettext(domain: String, context: String, singular: String, plural: Unit, n: Double): String = js.native
    def dcnpgettext(domain: String, context: Unit, singular: String): String = js.native
    def dcnpgettext(domain: String, context: Unit, singular: String, plural: String): String = js.native
    def dcnpgettext(domain: String, context: Unit, singular: String, plural: String, n: Double): String = js.native
    def dcnpgettext(domain: String, context: Unit, singular: String, plural: Unit, n: Double): String = js.native
    
    def getPluralForm(domain: String, n: Double): Double = js.native
    
    /**
      * Effective options for instance, including defaults.
      *
      * @name Tannin#options
      * @type {TanninOptions}
      */
    var options: TanninOptions = js.native
    
    /**
      * Plural forms function cache, keyed by plural forms string.
      *
      * @name Tannin#pluralForms
      * @type {Object<string,Function>}
      */
    var pluralForms: StringDictionary[js.Function] = js.native
  }
  
  trait TanninDomainMetadata extends StObject {
    
    /**
      * Domain name.
      */
    var domain: js.UndefOr[String] = js.undefined
    
    /**
      * Language code.
      */
    var lang: js.UndefOr[String] = js.undefined
    
    /**
      * Plural forms expression or
      *  function evaluator.
      */
    var plural_forms: js.UndefOr[TimerHandler] = js.undefined
  }
  object TanninDomainMetadata {
    
    inline def apply(): TanninDomainMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TanninDomainMetadata]
    }
    
    extension [Self <: TanninDomainMetadata](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setPlural_forms(value: TimerHandler): Self = StObject.set(x, "plural_forms", value.asInstanceOf[js.Any])
      
      inline def setPlural_formsUndefined: Self = StObject.set(x, "plural_forms", js.undefined)
    }
  }
  
  type TanninLocaleData = StringDictionary[Dictkey]
  
  trait TanninLocaleDomain
    extends StObject
       with /* key */ StringDictionary[TanninDomainMetadata | (js.Tuple2[String, String])] {
    
    @JSName("")
    var _empty: TanninDomainMetadata | (js.Tuple2[String, String])
  }
  object TanninLocaleDomain {
    
    inline def apply(_empty: TanninDomainMetadata | (js.Tuple2[String, String])): TanninLocaleDomain = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
      __obj.asInstanceOf[TanninLocaleDomain]
    }
    
    extension [Self <: TanninLocaleDomain](x: Self) {
      
      inline def set_empty(value: TanninDomainMetadata | (js.Tuple2[String, String])): Self = StObject.set(x, "", value.asInstanceOf[js.Any])
    }
  }
  
  trait TanninOptions extends StObject {
    
    /**
      * Joiner in string lookup with context.
      */
    var contextDelimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Callback to invoke when key missing.
      */
    var onMissingKey: js.UndefOr[js.Function] = js.undefined
  }
  object TanninOptions {
    
    inline def apply(): TanninOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TanninOptions]
    }
    
    extension [Self <: TanninOptions](x: Self) {
      
      inline def setContextDelimiter(value: String): Self = StObject.set(x, "contextDelimiter", value.asInstanceOf[js.Any])
      
      inline def setContextDelimiterUndefined: Self = StObject.set(x, "contextDelimiter", js.undefined)
      
      inline def setOnMissingKey(value: js.Function): Self = StObject.set(x, "onMissingKey", value.asInstanceOf[js.Any])
      
      inline def setOnMissingKeyUndefined: Self = StObject.set(x, "onMissingKey", js.undefined)
    }
  }
  
  type TanninTranslation = js.Tuple2[String, String]
}
