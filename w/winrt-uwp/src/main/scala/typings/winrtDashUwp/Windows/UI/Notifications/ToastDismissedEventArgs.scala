package typings.winrtDashUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the reason that a toast notification is no longer displayed on-screen. */
@JSGlobal("Windows.UI.Notifications.ToastDismissedEventArgs")
@js.native
abstract class ToastDismissedEventArgs () extends js.Object {
  /** Gets the reason that a toast notification is no longer displayed on-screen. */
  var reason: ToastDismissalReason = js.native
}

