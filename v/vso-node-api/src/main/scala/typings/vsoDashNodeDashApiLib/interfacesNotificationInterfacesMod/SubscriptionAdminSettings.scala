package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionAdminSettings extends js.Object {
  /**
    * If true, members of the group subscribed to the associated subscription cannot opt (choose not to get notified)
    */
  var blockUserOptOut: scala.Boolean
}

object SubscriptionAdminSettings {
  @scala.inline
  def apply(blockUserOptOut: scala.Boolean): SubscriptionAdminSettings = {
    val __obj = js.Dynamic.literal(blockUserOptOut = blockUserOptOut)
  
    __obj.asInstanceOf[SubscriptionAdminSettings]
  }
}

