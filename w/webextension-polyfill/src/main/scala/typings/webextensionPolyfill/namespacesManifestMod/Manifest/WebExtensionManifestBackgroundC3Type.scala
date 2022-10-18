package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestBackgroundC3Type extends StObject {
  
  var service_worker: ExtensionURL
}
object WebExtensionManifestBackgroundC3Type {
  
  inline def apply(service_worker: ExtensionURL): WebExtensionManifestBackgroundC3Type = {
    val __obj = js.Dynamic.literal(service_worker = service_worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestBackgroundC3Type]
  }
  
  extension [Self <: WebExtensionManifestBackgroundC3Type](x: Self) {
    
    inline def setService_worker(value: ExtensionURL): Self = StObject.set(x, "service_worker", value.asInstanceOf[js.Any])
  }
}
