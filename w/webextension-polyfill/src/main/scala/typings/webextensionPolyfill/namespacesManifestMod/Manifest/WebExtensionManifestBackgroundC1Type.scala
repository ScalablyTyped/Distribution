package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestBackgroundC1Type extends StObject {
  
  var page: ExtensionURL
  
  /**
    * Optional.
    */
  var persistent: js.UndefOr[Boolean] = js.undefined
}
object WebExtensionManifestBackgroundC1Type {
  
  inline def apply(page: ExtensionURL): WebExtensionManifestBackgroundC1Type = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestBackgroundC1Type]
  }
  
  extension [Self <: WebExtensionManifestBackgroundC1Type](x: Self) {
    
    inline def setPage(value: ExtensionURL): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
  }
}
