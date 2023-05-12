package typings.thunderbirdWebextBrowser.anon

import typings.thunderbirdWebextBrowser.browser.manifest.ExtensionURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceworkerExtensionURL extends StObject {
  
  var service_worker: ExtensionURL
}
object ServiceworkerExtensionURL {
  
  inline def apply(service_worker: ExtensionURL): ServiceworkerExtensionURL = {
    val __obj = js.Dynamic.literal(service_worker = service_worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceworkerExtensionURL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceworkerExtensionURL] (val x: Self) extends AnyVal {
    
    inline def setService_worker(value: ExtensionURL): Self = StObject.set(x, "service_worker", value.asInstanceOf[js.Any])
  }
}
