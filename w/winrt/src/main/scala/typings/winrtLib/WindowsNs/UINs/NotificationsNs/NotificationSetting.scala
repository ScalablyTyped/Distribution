package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationSetting extends js.Object

@JSGlobal("Windows.UI.Notifications.NotificationSetting")
@js.native
object NotificationSetting extends js.Object {
  @js.native
  sealed trait disabledByGroupPolicy
    extends winrtLib.WindowsNs.UINs.NotificationsNs.NotificationSetting
  
  @js.native
  sealed trait disabledByManifest
    extends winrtLib.WindowsNs.UINs.NotificationsNs.NotificationSetting
  
  @js.native
  sealed trait disabledForApplication
    extends winrtLib.WindowsNs.UINs.NotificationsNs.NotificationSetting
  
  @js.native
  sealed trait disabledForUser
    extends winrtLib.WindowsNs.UINs.NotificationsNs.NotificationSetting
  
  @js.native
  sealed trait enabled
    extends winrtLib.WindowsNs.UINs.NotificationsNs.NotificationSetting
  
  /* 3 */ val disabledByGroupPolicy: disabledByGroupPolicy with scala.Double = js.native
  /* 4 */ val disabledByManifest: disabledByManifest with scala.Double = js.native
  /* 1 */ val disabledForApplication: disabledForApplication with scala.Double = js.native
  /* 2 */ val disabledForUser: disabledForUser with scala.Double = js.native
  /* 0 */ val enabled: enabled with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.NotificationsNs.NotificationSetting with scala.Double] = js.native
}

