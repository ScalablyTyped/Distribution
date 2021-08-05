package typings.wordpressI18n

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createI18nMod {
  
  @JSImport("@wordpress/i18n/build-types/create-i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createI18n(): I18n = ^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")().asInstanceOf[I18n]
  inline def createI18n(initialData: Unit, initialDomain: String): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: Record[String, js.Any]): I18n = ^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any]).asInstanceOf[I18n]
  inline def createI18n(initialData: Record[String, js.Any], initialDomain: String): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any])).asInstanceOf[I18n]
  
  trait I18n extends StObject {
    
    /**
      * Retrieve the translation of text.
      */
    var __ : js.Function
    
    /**
      * Translates and retrieves the singular or plural form based on the supplied
      * number.
      */
    var _n: js.Function
    
    /**
      * Translates and retrieves the singular or plural form based on the supplied
      * number, with gettext context.
      */
    var _nx: js.Function
    
    /**
      * Retrieve translated string with gettext context.
      */
    var _x: js.Function
    
    /**
      * Check if current locale is RTL.
      */
    var isRTL: js.Function
    
    /**
      * Merges locale data into the Tannin instance by domain. Accepts data in a
      * Jed-formatted JSON object shape.
      */
    var setLocaleData: js.Function
  }
  object I18n {
    
    inline def apply(
      __ : js.Function,
      _n: js.Function,
      _nx: js.Function,
      _x: js.Function,
      isRTL: js.Function,
      setLocaleData: js.Function
    ): I18n = {
      val __obj = js.Dynamic.literal(__ = __.asInstanceOf[js.Any], _n = _n.asInstanceOf[js.Any], _nx = _nx.asInstanceOf[js.Any], _x = _x.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], setLocaleData = setLocaleData.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18n]
    }
    
    extension [Self <: I18n](x: Self) {
      
      inline def setIsRTL(value: js.Function): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      inline def setSetLocaleData(value: js.Function): Self = StObject.set(x, "setLocaleData", value.asInstanceOf[js.Any])
      
      inline def set__(value: js.Function): Self = StObject.set(x, "__", value.asInstanceOf[js.Any])
      
      inline def set_n(value: js.Function): Self = StObject.set(x, "_n", value.asInstanceOf[js.Any])
      
      inline def set_nx(value: js.Function): Self = StObject.set(x, "_nx", value.asInstanceOf[js.Any])
      
      inline def set_x(value: js.Function): Self = StObject.set(x, "_x", value.asInstanceOf[js.Any])
    }
  }
  
  type LocaleData = StringDictionary[js.Any]
}
