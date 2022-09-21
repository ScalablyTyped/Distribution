package typings.webextensionPolyfill.manifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestSidebarActionType extends StObject {
  
  /**
    * Optional.
    */
  var browser_style: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    */
  var default_icon: js.UndefOr[IconPath] = js.undefined
  
  var default_panel: String
  
  /**
    * Optional.
    */
  var default_title: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not the sidebar is opened at install. Default is <code>true</code>.
    * Optional.
    */
  var open_at_install: js.UndefOr[Boolean] = js.undefined
}
object WebExtensionManifestSidebarActionType {
  
  inline def apply(default_panel: String): WebExtensionManifestSidebarActionType = {
    val __obj = js.Dynamic.literal(default_panel = default_panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestSidebarActionType]
  }
  
  extension [Self <: WebExtensionManifestSidebarActionType](x: Self) {
    
    inline def setBrowser_style(value: Boolean): Self = StObject.set(x, "browser_style", value.asInstanceOf[js.Any])
    
    inline def setBrowser_styleUndefined: Self = StObject.set(x, "browser_style", js.undefined)
    
    inline def setDefault_icon(value: IconPath): Self = StObject.set(x, "default_icon", value.asInstanceOf[js.Any])
    
    inline def setDefault_iconUndefined: Self = StObject.set(x, "default_icon", js.undefined)
    
    inline def setDefault_panel(value: String): Self = StObject.set(x, "default_panel", value.asInstanceOf[js.Any])
    
    inline def setDefault_title(value: String): Self = StObject.set(x, "default_title", value.asInstanceOf[js.Any])
    
    inline def setDefault_titleUndefined: Self = StObject.set(x, "default_title", js.undefined)
    
    inline def setOpen_at_install(value: Boolean): Self = StObject.set(x, "open_at_install", value.asInstanceOf[js.Any])
    
    inline def setOpen_at_installUndefined: Self = StObject.set(x, "open_at_install", js.undefined)
  }
}
