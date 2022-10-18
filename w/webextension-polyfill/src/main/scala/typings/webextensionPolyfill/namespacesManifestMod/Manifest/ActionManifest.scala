package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionManifest extends StObject {
  
  /**
    * Optional.
    */
  var browser_style: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the location the browserAction will appear by default.  The default location is navbar.
    * Optional.
    */
  var default_area: js.UndefOr[ActionManifestDefaultAreaEnum] = js.undefined
  
  /**
    * Optional.
    */
  var default_icon: js.UndefOr[IconPath] = js.undefined
  
  /**
    * Optional.
    */
  var default_popup: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var default_title: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies icons to use for dark and light themes
    * Optional.
    */
  var theme_icons: js.UndefOr[js.Array[ThemeIcons]] = js.undefined
}
object ActionManifest {
  
  inline def apply(): ActionManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionManifest]
  }
  
  extension [Self <: ActionManifest](x: Self) {
    
    inline def setBrowser_style(value: Boolean): Self = StObject.set(x, "browser_style", value.asInstanceOf[js.Any])
    
    inline def setBrowser_styleUndefined: Self = StObject.set(x, "browser_style", js.undefined)
    
    inline def setDefault_area(value: ActionManifestDefaultAreaEnum): Self = StObject.set(x, "default_area", value.asInstanceOf[js.Any])
    
    inline def setDefault_areaUndefined: Self = StObject.set(x, "default_area", js.undefined)
    
    inline def setDefault_icon(value: IconPath): Self = StObject.set(x, "default_icon", value.asInstanceOf[js.Any])
    
    inline def setDefault_iconUndefined: Self = StObject.set(x, "default_icon", js.undefined)
    
    inline def setDefault_popup(value: String): Self = StObject.set(x, "default_popup", value.asInstanceOf[js.Any])
    
    inline def setDefault_popupUndefined: Self = StObject.set(x, "default_popup", js.undefined)
    
    inline def setDefault_title(value: String): Self = StObject.set(x, "default_title", value.asInstanceOf[js.Any])
    
    inline def setDefault_titleUndefined: Self = StObject.set(x, "default_title", js.undefined)
    
    inline def setTheme_icons(value: js.Array[ThemeIcons]): Self = StObject.set(x, "theme_icons", value.asInstanceOf[js.Any])
    
    inline def setTheme_iconsUndefined: Self = StObject.set(x, "theme_icons", js.undefined)
    
    inline def setTheme_iconsVarargs(value: ThemeIcons*): Self = StObject.set(x, "theme_icons", js.Array(value*))
  }
}
