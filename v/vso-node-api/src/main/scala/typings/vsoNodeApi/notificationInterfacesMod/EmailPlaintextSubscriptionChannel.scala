package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailPlaintextSubscriptionChannel
  extends StObject
     with SubscriptionChannelWithAddress
object EmailPlaintextSubscriptionChannel {
  
  @scala.inline
  def apply(address: String, `type`: String, useCustomAddress: Boolean): EmailPlaintextSubscriptionChannel = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], useCustomAddress = useCustomAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailPlaintextSubscriptionChannel]
  }
}
