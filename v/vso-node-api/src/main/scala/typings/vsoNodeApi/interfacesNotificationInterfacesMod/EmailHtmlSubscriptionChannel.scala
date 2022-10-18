package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailHtmlSubscriptionChannel
  extends StObject
     with SubscriptionChannelWithAddress
object EmailHtmlSubscriptionChannel {
  
  inline def apply(address: String, `type`: String, useCustomAddress: Boolean): EmailHtmlSubscriptionChannel = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], useCustomAddress = useCustomAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailHtmlSubscriptionChannel]
  }
}
