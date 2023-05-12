package typings.thunderbirdWebextBrowser.anon

import typings.thunderbirdWebextBrowser.messenger.manifest.ExtensionURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Serviceworker extends StObject {
  
  var service_worker: ExtensionURL
}
object Serviceworker {
  
  inline def apply(service_worker: ExtensionURL): Serviceworker = {
    val __obj = js.Dynamic.literal(service_worker = service_worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serviceworker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Serviceworker] (val x: Self) extends AnyVal {
    
    inline def setService_worker(value: ExtensionURL): Self = StObject.set(x, "service_worker", value.asInstanceOf[js.Any])
  }
}
