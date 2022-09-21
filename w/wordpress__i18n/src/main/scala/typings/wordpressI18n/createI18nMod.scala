package typings.wordpressI18n

import typings.std.Record
import typings.wordpressHooks.createHooksMod._Hooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createI18nMod {
  
  @JSImport("@wordpress/i18n/build-types/create-i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createI18n(): I18n = ^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")().asInstanceOf[I18n]
  inline def createI18n(initialData: Unit, initialDomain: String): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: Unit, initialDomain: String, hooks: _Hooks): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: Unit, initialDomain: Unit, hooks: _Hooks): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: LocaleData): I18n = ^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any]).asInstanceOf[I18n]
  inline def createI18n(initialData: LocaleData, initialDomain: String): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: LocaleData, initialDomain: String, hooks: _Hooks): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: LocaleData, initialDomain: Unit, hooks: _Hooks): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[I18n]
  
  type AddLocaleData = js.Function2[/* data */ js.UndefOr[LocaleData], /* domain */ js.UndefOr[String], Unit]
  
  type GetFilterDomain = js.Function1[/* domain */ js.UndefOr[String], String]
  
  type GetLocaleData = js.Function1[/* domain */ js.UndefOr[String], LocaleData]
  
  type HasTranslation = js.Function3[
    /* single */ String, 
    /* context */ js.UndefOr[String], 
    /* domain */ js.UndefOr[String], 
    Boolean
  ]
  
  type Hooks = typings.wordpressHooks.mod.Hooks
  
  trait I18n extends StObject {
    
    /**
      * Retrieve the translation of text.
      */
    def __(text: String): String
    def __(text: String, domain: String): String
    /**
      * Retrieve the translation of text.
      */
    @JSName("__")
    var ___Original: __
    
    /**
      * Translates and retrieves the singular or plural form based on the supplied
      * number.
      */
    def _n(single: String, plural: String, number: Double): String
    def _n(single: String, plural: String, number: Double, domain: String): String
    /**
      * Translates and retrieves the singular or plural form based on the supplied
      * number.
      */
    @JSName("_n")
    var _n_Original: n
    
    /**
      * Translates and retrieves the singular or plural form based on the supplied
      * number, with gettext context.
      */
    def _nx(single: String, plural: String, number: Double, context: String): String
    def _nx(single: String, plural: String, number: Double, context: String, domain: String): String
    /**
      * Translates and retrieves the singular or plural form based on the supplied
      * number, with gettext context.
      */
    @JSName("_nx")
    var _nx_Original: nx
    
    /**
      * Retrieve translated string with gettext context.
      */
    def _x(text: String, context: String): String
    def _x(text: String, context: String, domain: String): String
    /**
      * Retrieve translated string with gettext context.
      */
    @JSName("_x")
    var _x_Original: x
    
    /**
      * Merges locale data into the Tannin instance by domain. Note that this
      * function will also merge the domain configuration. Accepts data in a
      * Jed-formatted JSON object shape.
      */
    def addLocaleData(): Unit
    def addLocaleData(data: Unit, domain: String): Unit
    def addLocaleData(data: LocaleData): Unit
    def addLocaleData(data: LocaleData, domain: String): Unit
    /**
      * Merges locale data into the Tannin instance by domain. Note that this
      * function will also merge the domain configuration. Accepts data in a
      * Jed-formatted JSON object shape.
      */
    @JSName("addLocaleData")
    var addLocaleData_Original: AddLocaleData
    
    /**
      * Returns locale data by domain in a Jed-formatted JSON object shape.
      */
    def getLocaleData(): LocaleData
    def getLocaleData(domain: String): LocaleData
    /**
      * Returns locale data by domain in a Jed-formatted JSON object shape.
      */
    @JSName("getLocaleData")
    var getLocaleData_Original: GetLocaleData
    
    /**
      * Check if there is a translation for a given string.
      */
    def hasTranslation(single: String): Boolean
    def hasTranslation(single: String, context: String): Boolean
    def hasTranslation(single: String, context: String, domain: String): Boolean
    def hasTranslation(single: String, context: Unit, domain: String): Boolean
    /**
      * Check if there is a translation for a given string.
      */
    @JSName("hasTranslation")
    var hasTranslation_Original: HasTranslation
    
    /**
      * Check if current locale is RTL.
      */
    def isRTL(): Boolean
    /**
      * Check if current locale is RTL.
      */
    @JSName("isRTL")
    var isRTL_Original: IsRtl
    
    /**
      * Resets all current Tannin instance locale data and sets the specified
      * locale data for the domain. Accepts data in a Jed-formatted JSON object shape.
      */
    def resetLocaleData(): Unit
    def resetLocaleData(data: Unit, domain: String): Unit
    def resetLocaleData(data: LocaleData): Unit
    def resetLocaleData(data: LocaleData, domain: String): Unit
    /**
      * Resets all current Tannin instance locale data and sets the specified
      * locale data for the domain. Accepts data in a Jed-formatted JSON object shape.
      */
    @JSName("resetLocaleData")
    var resetLocaleData_Original: ResetLocaleData
    
    /**
      * Merges locale data into the Tannin instance by domain. Note that this
      * function will overwrite the domain configuration. Accepts data in a
      * Jed-formatted JSON object shape.
      */
    def setLocaleData(): Unit
    def setLocaleData(data: Unit, domain: String): Unit
    def setLocaleData(data: LocaleData): Unit
    def setLocaleData(data: LocaleData, domain: String): Unit
    /**
      * Merges locale data into the Tannin instance by domain. Note that this
      * function will overwrite the domain configuration. Accepts data in a
      * Jed-formatted JSON object shape.
      */
    @JSName("setLocaleData")
    var setLocaleData_Original: SetLocaleData
    
    /**
      * Subscribes to changes of Tannin locale data.
      */
    def subscribe(callback: SubscribeCallback): UnsubscribeCallback
    /**
      * Subscribes to changes of Tannin locale data.
      */
    @JSName("subscribe")
    var subscribe_Original: Subscribe
  }
  object I18n {
    
    inline def apply(
      __ : (/* text */ String, /* domain */ js.UndefOr[String]) => String,
      _n: (/* single */ String, /* plural */ String, /* number */ Double, /* domain */ js.UndefOr[String]) => String,
      _nx: (/* single */ String, /* plural */ String, /* number */ Double, /* context */ String, /* domain */ js.UndefOr[String]) => String,
      _x: (/* text */ String, /* context */ String, /* domain */ js.UndefOr[String]) => String,
      addLocaleData: (/* data */ js.UndefOr[LocaleData], /* domain */ js.UndefOr[String]) => Unit,
      getLocaleData: /* domain */ js.UndefOr[String] => LocaleData,
      hasTranslation: (/* single */ String, /* context */ js.UndefOr[String], /* domain */ js.UndefOr[String]) => Boolean,
      isRTL: () => Boolean,
      resetLocaleData: (/* data */ js.UndefOr[LocaleData], /* domain */ js.UndefOr[String]) => Unit,
      setLocaleData: (/* data */ js.UndefOr[LocaleData], /* domain */ js.UndefOr[String]) => Unit,
      subscribe: /* callback */ SubscribeCallback => UnsubscribeCallback
    ): I18n = {
      val __obj = js.Dynamic.literal(__ = js.Any.fromFunction2(__), _n = js.Any.fromFunction4(_n), _nx = js.Any.fromFunction5(_nx), _x = js.Any.fromFunction3(_x), addLocaleData = js.Any.fromFunction2(addLocaleData), getLocaleData = js.Any.fromFunction1(getLocaleData), hasTranslation = js.Any.fromFunction3(hasTranslation), isRTL = js.Any.fromFunction0(isRTL), resetLocaleData = js.Any.fromFunction2(resetLocaleData), setLocaleData = js.Any.fromFunction2(setLocaleData), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[I18n]
    }
    
    extension [Self <: I18n](x: Self) {
      
      inline def setAddLocaleData(value: (/* data */ js.UndefOr[LocaleData], /* domain */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "addLocaleData", js.Any.fromFunction2(value))
      
      inline def setGetLocaleData(value: /* domain */ js.UndefOr[String] => LocaleData): Self = StObject.set(x, "getLocaleData", js.Any.fromFunction1(value))
      
      inline def setHasTranslation(
        value: (/* single */ String, /* context */ js.UndefOr[String], /* domain */ js.UndefOr[String]) => Boolean
      ): Self = StObject.set(x, "hasTranslation", js.Any.fromFunction3(value))
      
      inline def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      inline def setResetLocaleData(value: (/* data */ js.UndefOr[LocaleData], /* domain */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "resetLocaleData", js.Any.fromFunction2(value))
      
      inline def setSetLocaleData(value: (/* data */ js.UndefOr[LocaleData], /* domain */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "setLocaleData", js.Any.fromFunction2(value))
      
      inline def setSubscribe(value: /* callback */ SubscribeCallback => UnsubscribeCallback): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      inline def set__(value: (/* text */ String, /* domain */ js.UndefOr[String]) => String): Self = StObject.set(x, "__", js.Any.fromFunction2(value))
      
      inline def set_n(
        value: (/* single */ String, /* plural */ String, /* number */ Double, /* domain */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "_n", js.Any.fromFunction4(value))
      
      inline def set_nx(
        value: (/* single */ String, /* plural */ String, /* number */ Double, /* context */ String, /* domain */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "_nx", js.Any.fromFunction5(value))
      
      inline def set_x(value: (/* text */ String, /* context */ String, /* domain */ js.UndefOr[String]) => String): Self = StObject.set(x, "_x", js.Any.fromFunction3(value))
    }
  }
  
  type IsRtl = js.Function0[Boolean]
  
  type LocaleData = Record[String, Any]
  
  type ResetLocaleData = js.Function2[/* data */ js.UndefOr[LocaleData], /* domain */ js.UndefOr[String], Unit]
  
  type SetLocaleData = js.Function2[/* data */ js.UndefOr[LocaleData], /* domain */ js.UndefOr[String], Unit]
  
  type Subscribe = js.Function1[/* callback */ SubscribeCallback, UnsubscribeCallback]
  
  type SubscribeCallback = js.Function0[Unit]
  
  type UnsubscribeCallback = js.Function0[Unit]
  
  type __ = js.Function2[/* text */ String, /* domain */ js.UndefOr[String], String]
  
  type n = js.Function4[
    /* single */ String, 
    /* plural */ String, 
    /* number */ Double, 
    /* domain */ js.UndefOr[String], 
    String
  ]
  
  type nx = js.Function5[
    /* single */ String, 
    /* plural */ String, 
    /* number */ Double, 
    /* context */ String, 
    /* domain */ js.UndefOr[String], 
    String
  ]
  
  type x = js.Function3[/* text */ String, /* context */ String, /* domain */ js.UndefOr[String], String]
}
