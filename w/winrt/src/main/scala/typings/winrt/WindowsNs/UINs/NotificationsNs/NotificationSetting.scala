package typings.winrt.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationSetting extends js.Object

@JSGlobal("Windows.UI.Notifications.NotificationSetting")
@js.native
object NotificationSetting extends js.Object {
  @js.native
  sealed trait disabledByGroupPolicy extends NotificationSetting
  
  @js.native
  sealed trait disabledByManifest extends NotificationSetting
  
  @js.native
  sealed trait disabledForApplication extends NotificationSetting
  
  @js.native
  sealed trait disabledForUser extends NotificationSetting
  
  @js.native
  sealed trait enabled extends NotificationSetting
  
  /* 3 */ val disabledByGroupPolicy: typings.winrt.WindowsNs.UINs.NotificationsNs.NotificationSetting.disabledByGroupPolicy with Double = js.native
  /* 4 */ val disabledByManifest: typings.winrt.WindowsNs.UINs.NotificationsNs.NotificationSetting.disabledByManifest with Double = js.native
  /* 1 */ val disabledForApplication: typings.winrt.WindowsNs.UINs.NotificationsNs.NotificationSetting.disabledForApplication with Double = js.native
  /* 2 */ val disabledForUser: typings.winrt.WindowsNs.UINs.NotificationsNs.NotificationSetting.disabledForUser with Double = js.native
  /* 0 */ val enabled: typings.winrt.WindowsNs.UINs.NotificationsNs.NotificationSetting.enabled with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationSetting with Double] = js.native
}

