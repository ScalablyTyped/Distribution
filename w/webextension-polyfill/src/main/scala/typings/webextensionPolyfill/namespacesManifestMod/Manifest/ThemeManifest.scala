package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contents of manifest.json for a static theme
  */
trait ThemeManifest
  extends StObject
     with ManifestBase {
  
  /**
    * Optional.
    */
  var dark_theme: js.UndefOr[ThemeType] = js.undefined
  
  /**
    * Optional.
    */
  var default_locale: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var icons: js.UndefOr[Record[String, String]] = js.undefined
  
  var theme: ThemeType
  
  /**
    * Optional.
    */
  var theme_experiment: js.UndefOr[ThemeExperiment] = js.undefined
}
object ThemeManifest {
  
  inline def apply(manifest_version: Double, name: String, theme: ThemeType, version: String): ThemeManifest = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeManifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeManifest] (val x: Self) extends AnyVal {
    
    inline def setDark_theme(value: ThemeType): Self = StObject.set(x, "dark_theme", value.asInstanceOf[js.Any])
    
    inline def setDark_themeUndefined: Self = StObject.set(x, "dark_theme", js.undefined)
    
    inline def setDefault_locale(value: String): Self = StObject.set(x, "default_locale", value.asInstanceOf[js.Any])
    
    inline def setDefault_localeUndefined: Self = StObject.set(x, "default_locale", js.undefined)
    
    inline def setIcons(value: Record[String, String]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setTheme(value: ThemeType): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTheme_experiment(value: ThemeExperiment): Self = StObject.set(x, "theme_experiment", value.asInstanceOf[js.Any])
    
    inline def setTheme_experimentUndefined: Self = StObject.set(x, "theme_experiment", js.undefined)
  }
}
