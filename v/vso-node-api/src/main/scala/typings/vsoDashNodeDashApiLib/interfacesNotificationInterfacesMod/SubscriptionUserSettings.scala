package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionUserSettings extends js.Object {
  /**
    * Indicates whether the user will receive notifications for the associated group subscription.
    */
  var optedOut: scala.Boolean
}

object SubscriptionUserSettings {
  @scala.inline
  def apply(optedOut: scala.Boolean): SubscriptionUserSettings = {
    val __obj = js.Dynamic.literal(optedOut = optedOut)
  
    __obj.asInstanceOf[SubscriptionUserSettings]
  }
}

