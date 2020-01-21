package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionUserSettings extends js.Object {
  /**
    * Indicates whether the user will receive notifications for the associated group subscription.
    */
  var optedOut: Boolean
}

object SubscriptionUserSettings {
  @scala.inline
  def apply(optedOut: Boolean): SubscriptionUserSettings = {
    val __obj = js.Dynamic.literal(optedOut = optedOut.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscriptionUserSettings]
  }
}

