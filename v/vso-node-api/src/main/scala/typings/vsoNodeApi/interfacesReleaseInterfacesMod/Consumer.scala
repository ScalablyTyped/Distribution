package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Consumer extends StObject {
  
  var consumerId: Double
  
  var consumerName: String
}
object Consumer {
  
  inline def apply(consumerId: Double, consumerName: String): Consumer = {
    val __obj = js.Dynamic.literal(consumerId = consumerId.asInstanceOf[js.Any], consumerName = consumerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consumer]
  }
  
  extension [Self <: Consumer](x: Self) {
    
    inline def setConsumerId(value: Double): Self = StObject.set(x, "consumerId", value.asInstanceOf[js.Any])
    
    inline def setConsumerName(value: String): Self = StObject.set(x, "consumerName", value.asInstanceOf[js.Any])
  }
}
