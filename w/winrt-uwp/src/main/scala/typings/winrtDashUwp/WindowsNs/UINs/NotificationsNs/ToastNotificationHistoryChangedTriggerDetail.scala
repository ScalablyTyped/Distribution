package typings.winrtDashUwp.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the details of a toast history changed trigger. */
@JSGlobal("Windows.UI.Notifications.ToastNotificationHistoryChangedTriggerDetail")
@js.native
abstract class ToastNotificationHistoryChangedTriggerDetail () extends js.Object {
  /** Gets a value representing the kind of change that caused the toast history changed trigger. */
  var changeType: ToastHistoryChangedType = js.native
}

