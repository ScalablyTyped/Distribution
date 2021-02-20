package typings.wordpressI18n

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createI18nMod {
  
  @JSImport("@wordpress/i18n/build-types/create-i18n", "createI18n")
  @js.native
  def createI18n(): I18n = js.native
  @JSImport("@wordpress/i18n/build-types/create-i18n", "createI18n")
  @js.native
  def createI18n(initialData: js.UndefOr[scala.Nothing], initialDomain: String): I18n = js.native
  @JSImport("@wordpress/i18n/build-types/create-i18n", "createI18n")
  @js.native
  def createI18n(initialData: Record[String, _]): I18n = js.native
  @JSImport("@wordpress/i18n/build-types/create-i18n", "createI18n")
  @js.native
  def createI18n(initialData: Record[String, _], initialDomain: String): I18n = js.native
  
  @js.native
  trait I18n extends StObject {
    
    /**
      * Retrieve the translation of text.
      */
    var __ : js.Function = js.native
    
    /**
      * Translates and retrieves the singular or plural form based on the supplied
      * number.
      */
    var _n: js.Function = js.native
    
    /**
      * Translates and retrieves the singular or plural form based on the supplied
      * number, with gettext context.
      */
    var _nx: js.Function = js.native
    
    /**
      * Retrieve translated string with gettext context.
      */
    var _x: js.Function = js.native
    
    /**
      * Check if current locale is RTL.
      */
    var isRTL: js.Function = js.native
    
    /**
      * Merges locale data into the Tannin instance by domain. Accepts data in a
      * Jed-formatted JSON object shape.
      */
    var setLocaleData: js.Function = js.native
  }
  object I18n {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class I18nMutableBuilder[Self <: I18n] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsRTL(value: js.Function): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetLocaleData(value: js.Function): Self = StObject.set(x, "setLocaleData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__(value: js.Function): Self = StObject.set(x, "__", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_n(value: js.Function): Self = StObject.set(x, "_n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_nx(value: js.Function): Self = StObject.set(x, "_nx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_x(value: js.Function): Self = StObject.set(x, "_x", value.asInstanceOf[js.Any])
    }
  }
  
  type LocaleData = StringDictionary[js.Any]
}
