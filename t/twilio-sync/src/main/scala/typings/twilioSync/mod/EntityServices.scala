package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityServices extends StObject {
  
  var network: Network
  
  var router: Router
  
  var storage: Storage
}
object EntityServices {
  
  inline def apply(network: Network, router: Router, storage: Storage): EntityServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityServices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityServices] (val x: Self) extends AnyVal {
    
    inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
