package typings.vuexI18n

import org.scalablytyped.runtime.StringDictionary
import typings.vue.pluginMod.PluginObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("vuex-i18n", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vuex-i18n", "default.plugin")
    @js.native
    def plugin: PluginObject[Ii18n] = js.native
    inline def plugin_=(x: PluginObject[Ii18n]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugin")(x.asInstanceOf[js.Any])
    
    @JSImport("vuex-i18n", "default.store")
    @js.native
    def store: js.Object = js.native
    inline def store_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("store")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Ii18n extends StObject {
    
    /**
      * add locale translation to the storage. this will extend existing information
      * (i.e. 'de', {'message': 'Eine Nachricht'})
      */
    def add(locale: String, translations: Translations): Unit = js.native
    
    /**
      * set a fallback locale if translation for current locale does not exist
      */
    def fallback(locale: String): Unit = js.native
    
    /**
      * check if the given key is available
      * optional with a second parameter to limit the scope
      * strict: only current locale (exact match)
      * locale: current locale and parent language locale (i.e. en-us & en)
      * fallback: current locale, parent language locale and fallback locale
      * the default is fallback
      */
    def keyExists(key: String): Boolean = js.native
    def keyExists(key: String, scope: String): Boolean = js.native
    
    /** get the current locale */
    def locale(): String | Null = js.native
    
    /**
      * check if the given locale translations are present in the store
      */
    def localeExists(locale: String): Boolean = js.native
    
    /** get all the registered locales */
    def locales(): js.Array[String] = js.native
    
    /**
      * remove the given locale from the store
      */
    def remove(locale: String): Unit = js.native
    
    /**
      * replace locale translations in the storage. this will remove all previous
      * locale information for the specified locale
      */
    def replace(locale: String, translations: Translations): Unit = js.native
    
    /** set the current locale (i.e. 'de', 'en') */
    def set(locale: String): Unit = js.native
    
    /**
      * get localized string from store. note that we pass the arguments passed
      * to the function directly to the translateInLanguage function
      */
    def translate(key: String): js.UndefOr[String] = js.native
    /**
      * get localized string from store. note that we pass the arguments passed
      * to the function directly to the translateInLanguage function
      */
    def translate(key: String, defaultValue: String): js.UndefOr[String] = js.native
    def translate(key: String, defaultValue: String, options: js.Any): js.UndefOr[String] = js.native
    def translate(key: String, defaultValue: String, options: js.Any, pluralization: Double): js.UndefOr[String] = js.native
    def translate(key: String, defaultValue: String, options: Unit, pluralization: Double): js.UndefOr[String] = js.native
    def translate(key: String, options: js.Any): js.UndefOr[String] = js.native
    def translate(key: String, options: js.Any, pluralization: Double): js.UndefOr[String] = js.native
    def translate(key: String, options: Unit, pluralization: Double): js.UndefOr[String] = js.native
    
    /**
      * get localized string from store in a given language if available.
      */
    def translateIn(locale: String, key: String): js.UndefOr[String] = js.native
    /**
      * get localized string from store in a given language if available.
      */
    def translateIn(locale: String, key: String, defaultValue: String): js.UndefOr[String] = js.native
    def translateIn(locale: String, key: String, defaultValue: String, options: js.Any): js.UndefOr[String] = js.native
    def translateIn(locale: String, key: String, defaultValue: String, options: js.Any, pluralization: Double): js.UndefOr[String] = js.native
    def translateIn(locale: String, key: String, defaultValue: String, options: Unit, pluralization: Double): js.UndefOr[String] = js.native
    def translateIn(locale: String, key: String, options: js.Any): js.UndefOr[String] = js.native
    def translateIn(locale: String, key: String, options: js.Any, pluralization: Double): js.UndefOr[String] = js.native
    def translateIn(locale: String, key: String, options: Unit, pluralization: Double): js.UndefOr[String] = js.native
  }
  
  trait Translations
    extends StObject
       with /* key */ StringDictionary[String | Translations]
  object Translations {
    
    inline def apply(): Translations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Translations]
    }
  }
  
  trait i18nState extends StObject {
    
    var fallback: String | Null
    
    var locale: String | Null
    
    var translations: StringDictionary[Translations]
  }
  object i18nState {
    
    inline def apply(translations: StringDictionary[Translations]): i18nState = {
      val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any], fallback = null, locale = null)
      __obj.asInstanceOf[i18nState]
    }
    
    extension [Self <: i18nState](x: Self) {
      
      inline def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleNull: Self = StObject.set(x, "locale", null)
      
      inline def setTranslations(value: StringDictionary[Translations]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  object vueTypesVueAugmentingMod {
    
    @js.native
    trait Vue extends StObject {
      
      @JSName("$i18n")
      var $i18n: Ii18n = js.native
      
      @JSName("$t")
      def $t(key: String): js.UndefOr[String] = js.native
      @JSName("$t")
      def $t(key: String, defaultValue: String): js.UndefOr[String] = js.native
      @JSName("$t")
      def $t(key: String, defaultValue: String, options: js.Any): js.UndefOr[String] = js.native
      @JSName("$t")
      def $t(key: String, defaultValue: String, options: js.Any, pluralization: Double): js.UndefOr[String] = js.native
      @JSName("$t")
      def $t(key: String, defaultValue: String, options: Unit, pluralization: Double): js.UndefOr[String] = js.native
      @JSName("$t")
      def $t(key: String, options: js.Any): js.UndefOr[String] = js.native
      @JSName("$t")
      def $t(key: String, options: js.Any, pluralization: Double): js.UndefOr[String] = js.native
      @JSName("$t")
      def $t(key: String, options: Unit, pluralization: Double): js.UndefOr[String] = js.native
    }
    
    trait VueConstructor[V /* <: Vue */] extends StObject {
      
      var i18n: Ii18n
    }
    object VueConstructor {
      
      inline def apply[V /* <: Vue */](i18n: Ii18n): VueConstructor[V] = {
        val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
        __obj.asInstanceOf[VueConstructor[V]]
      }
      
      extension [Self <: VueConstructor[?], V /* <: Vue */](x: Self & VueConstructor[V]) {
        
        inline def setI18n(value: Ii18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      }
    }
  }
}
