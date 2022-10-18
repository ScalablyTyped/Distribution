package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionChannelWithAddress extends StObject {
  
  var address: String
  
  var `type`: String
  
  var useCustomAddress: Boolean
}
object SubscriptionChannelWithAddress {
  
  inline def apply(address: String, `type`: String, useCustomAddress: Boolean): SubscriptionChannelWithAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], useCustomAddress = useCustomAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionChannelWithAddress]
  }
  
  extension [Self <: SubscriptionChannelWithAddress](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUseCustomAddress(value: Boolean): Self = StObject.set(x, "useCustomAddress", value.asInstanceOf[js.Any])
  }
}
