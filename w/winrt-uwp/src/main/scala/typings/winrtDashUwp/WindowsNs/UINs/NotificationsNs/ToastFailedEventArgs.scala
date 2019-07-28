package typings.winrtDashUwp.WindowsNs.UINs.NotificationsNs

import typings.winrtDashUwp.WindowsNs.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the error code that was generated in the process of raising a toast notification. */
@JSGlobal("Windows.UI.Notifications.ToastFailedEventArgs")
@js.native
abstract class ToastFailedEventArgs () extends js.Object {
  /** Gets the error code that was generated in the process of raising a toast notification. */
  var errorCode: WinRTError = js.native
}

