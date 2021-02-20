package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionChannelWithAddress extends StObject {
  
  var address: String = js.native
  
  var `type`: String = js.native
  
  var useCustomAddress: Boolean = js.native
}
object SubscriptionChannelWithAddress {
  
  @scala.inline
  def apply(address: String, `type`: String, useCustomAddress: Boolean): SubscriptionChannelWithAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], useCustomAddress = useCustomAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionChannelWithAddress]
  }
  
  @scala.inline
  implicit class SubscriptionChannelWithAddressMutableBuilder[Self <: SubscriptionChannelWithAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCustomAddress(value: Boolean): Self = StObject.set(x, "useCustomAddress", value.asInstanceOf[js.Any])
  }
}
