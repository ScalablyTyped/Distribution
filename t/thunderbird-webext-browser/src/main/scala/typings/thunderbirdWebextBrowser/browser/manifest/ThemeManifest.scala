package typings.thunderbirdWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeManifest extends StObject {
  
  /** Fallback properties for the dark system theme. */
  var dark_theme: js.UndefOr[ThemeType] = js.undefined
  
  var default_locale: js.UndefOr[String] = js.undefined
  
  /** Icons shown in the Add-ons Manager. */
  var icons: js.UndefOr[ThemeManifestIcons] = js.undefined
  
  var theme: ThemeType
  
  /** CSS file with additional styles. */
  var theme_experiment: js.UndefOr[ThemeExperiment] = js.undefined
}
object ThemeManifest {
  
  inline def apply(theme: ThemeType): ThemeManifest = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeManifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeManifest] (val x: Self) extends AnyVal {
    
    inline def setDark_theme(value: ThemeType): Self = StObject.set(x, "dark_theme", value.asInstanceOf[js.Any])
    
    inline def setDark_themeUndefined: Self = StObject.set(x, "dark_theme", js.undefined)
    
    inline def setDefault_locale(value: String): Self = StObject.set(x, "default_locale", value.asInstanceOf[js.Any])
    
    inline def setDefault_localeUndefined: Self = StObject.set(x, "default_locale", js.undefined)
    
    inline def setIcons(value: ThemeManifestIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setTheme(value: ThemeType): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTheme_experiment(value: ThemeExperiment): Self = StObject.set(x, "theme_experiment", value.asInstanceOf[js.Any])
    
    inline def setTheme_experimentUndefined: Self = StObject.set(x, "theme_experiment", js.undefined)
  }
}
