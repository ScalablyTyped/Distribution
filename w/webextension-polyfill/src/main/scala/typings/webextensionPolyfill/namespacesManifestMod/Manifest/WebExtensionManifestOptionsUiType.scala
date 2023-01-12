package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestOptionsUiType extends StObject {
  
  /**
    * Optional.
    */
  var browser_style: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    */
  var chrome_style: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    */
  var open_in_tab: js.UndefOr[Boolean] = js.undefined
  
  var page: ExtensionURL
}
object WebExtensionManifestOptionsUiType {
  
  inline def apply(page: ExtensionURL): WebExtensionManifestOptionsUiType = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestOptionsUiType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionManifestOptionsUiType] (val x: Self) extends AnyVal {
    
    inline def setBrowser_style(value: Boolean): Self = StObject.set(x, "browser_style", value.asInstanceOf[js.Any])
    
    inline def setBrowser_styleUndefined: Self = StObject.set(x, "browser_style", js.undefined)
    
    inline def setChrome_style(value: Boolean): Self = StObject.set(x, "chrome_style", value.asInstanceOf[js.Any])
    
    inline def setChrome_styleUndefined: Self = StObject.set(x, "chrome_style", js.undefined)
    
    inline def setOpen_in_tab(value: Boolean): Self = StObject.set(x, "open_in_tab", value.asInstanceOf[js.Any])
    
    inline def setOpen_in_tabUndefined: Self = StObject.set(x, "open_in_tab", js.undefined)
    
    inline def setPage(value: ExtensionURL): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
