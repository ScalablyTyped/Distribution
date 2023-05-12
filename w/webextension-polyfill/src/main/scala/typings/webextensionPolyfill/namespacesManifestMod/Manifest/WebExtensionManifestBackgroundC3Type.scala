package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import typings.webextensionPolyfill.webextensionPolyfillStrings.module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestBackgroundC3Type extends StObject {
  
  var service_worker: ExtensionURL
  
  /**
    * Even though Manifest V3, does not support multiple background scripts, you can optionally declare the service worker as
    * an ES Module by specifying "type": "module", which allows you to import further code.
    * Optional.
    */
  var `type`: js.UndefOr[module] = js.undefined
}
object WebExtensionManifestBackgroundC3Type {
  
  inline def apply(service_worker: ExtensionURL): WebExtensionManifestBackgroundC3Type = {
    val __obj = js.Dynamic.literal(service_worker = service_worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestBackgroundC3Type]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionManifestBackgroundC3Type] (val x: Self) extends AnyVal {
    
    inline def setService_worker(value: ExtensionURL): Self = StObject.set(x, "service_worker", value.asInstanceOf[js.Any])
    
    inline def setType(value: module): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
