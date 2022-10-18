package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionManagement extends StObject {
  
  var serviceInstanceType: String
  
  var url: String
}
object SubscriptionManagement {
  
  inline def apply(serviceInstanceType: String, url: String): SubscriptionManagement = {
    val __obj = js.Dynamic.literal(serviceInstanceType = serviceInstanceType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionManagement]
  }
  
  extension [Self <: SubscriptionManagement](x: Self) {
    
    inline def setServiceInstanceType(value: String): Self = StObject.set(x, "serviceInstanceType", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
