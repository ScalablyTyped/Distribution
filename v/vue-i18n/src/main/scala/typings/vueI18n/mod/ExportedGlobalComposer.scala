package typings.vueI18n.mod

import typings.intlifyCoreBase.mod.FallbackLocale
import typings.intlifyCoreBase.mod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportedGlobalComposer extends StObject {
  
  /**
    * Available locales
    *
    * @remarks
    * This property is proxy-like property for `Composer#availableLocales`. About details, see the [Composer#availableLocales](composition#availablelocales)
    */
  val availableLocales: js.Array[Locale]
  
  /**
    * Fallback locale
    *
    * @remarks
    * This property is proxy-like property for `Composer#fallbackLocale`. About details, see the [Composer#fallbackLocale](composition#fallbacklocale)
    */
  var fallbackLocale: FallbackLocale
  
  /**
    * Locale
    *
    * @remarks
    * This property is proxy-like property for `Composer#locale`. About details, see the [Composer#locale](composition#locale)
    */
  var locale: Locale
}
object ExportedGlobalComposer {
  
  inline def apply(availableLocales: js.Array[Locale], fallbackLocale: FallbackLocale, locale: Locale): ExportedGlobalComposer = {
    val __obj = js.Dynamic.literal(availableLocales = availableLocales.asInstanceOf[js.Any], fallbackLocale = fallbackLocale.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportedGlobalComposer]
  }
  
  extension [Self <: ExportedGlobalComposer](x: Self) {
    
    inline def setAvailableLocales(value: js.Array[Locale]): Self = StObject.set(x, "availableLocales", value.asInstanceOf[js.Any])
    
    inline def setAvailableLocalesVarargs(value: Locale*): Self = StObject.set(x, "availableLocales", js.Array(value*))
    
    inline def setFallbackLocale(value: FallbackLocale): Self = StObject.set(x, "fallbackLocale", value.asInstanceOf[js.Any])
    
    inline def setFallbackLocaleVarargs(value: Locale*): Self = StObject.set(x, "fallbackLocale", js.Array(value*))
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
  }
}
