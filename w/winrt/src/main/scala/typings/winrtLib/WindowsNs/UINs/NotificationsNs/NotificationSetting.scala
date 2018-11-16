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
  
  val disabledByGroupPolicy: disabledByGroupPolicy with java.lang.String = js.native
  val disabledByManifest: disabledByManifest with java.lang.String = js.native
  val disabledForApplication: disabledForApplication with java.lang.String = js.native
  val disabledForUser: disabledForUser with java.lang.String = js.native
  val enabled: enabled with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.UINs.NotificationsNs.NotificationSetting with java.lang.String
  ] = js.native
}

