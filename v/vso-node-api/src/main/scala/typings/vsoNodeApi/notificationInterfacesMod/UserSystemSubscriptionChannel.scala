package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserSystemSubscriptionChannel extends SubscriptionChannelWithAddress
object UserSystemSubscriptionChannel {
  
  @scala.inline
  def apply(address: String, `type`: String, useCustomAddress: Boolean): UserSystemSubscriptionChannel = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], useCustomAddress = useCustomAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSystemSubscriptionChannel]
  }
}
