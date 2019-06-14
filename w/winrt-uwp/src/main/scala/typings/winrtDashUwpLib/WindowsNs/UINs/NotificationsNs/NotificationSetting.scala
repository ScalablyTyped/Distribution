package typings
package winrtDashUwpLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationSetting extends js.Object

/** Specifies the limitations on tile or toast notification display. */
@JSGlobal("Windows.UI.Notifications.NotificationSetting")
@js.native
object NotificationSetting extends js.Object {
  /** An administrator has disabled all notifications on this computer through group policy. The group policy setting overrides the user's setting. */
  @js.native
  sealed trait disabledByGroupPolicy
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.NotificationSetting
  
  /** This app has not declared itself toast capable in its package.appxmanifest file. This setting is found on the manifest's Application UI page, under the Notification section. For an app to send toast, the Toast Capable option must be set to "Yes". */
  @js.native
  sealed trait disabledByManifest
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.NotificationSetting
  
  /** The user has disabled notifications for this app. */
  @js.native
  sealed trait disabledForApplication
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.NotificationSetting
  
  /** The user or administrator has disabled all notifications for this user on this computer. */
  @js.native
  sealed trait disabledForUser
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.NotificationSetting
  
  /** All notifications raised by this app can be displayed. */
  @js.native
  sealed trait enabled
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.NotificationSetting
  
  /* 3 */ val disabledByGroupPolicy: disabledByGroupPolicy with scala.Double = js.native
  /* 4 */ val disabledByManifest: disabledByManifest with scala.Double = js.native
  /* 1 */ val disabledForApplication: disabledForApplication with scala.Double = js.native
  /* 2 */ val disabledForUser: disabledForUser with scala.Double = js.native
  /* 0 */ val enabled: enabled with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.NotificationSetting with scala.Double
  ] = js.native
}

