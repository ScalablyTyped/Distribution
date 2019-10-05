package typings.winrt.Windows.Networking.PushNotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PushNotificationType extends js.Object

@JSGlobal("Windows.Networking.PushNotifications.PushNotificationType")
@js.native
object PushNotificationType extends js.Object {
  @js.native
  sealed trait badge extends PushNotificationType
  
  @js.native
  sealed trait raw extends PushNotificationType
  
  @js.native
  sealed trait tile extends PushNotificationType
  
  @js.native
  sealed trait toast extends PushNotificationType
  
  /* 2 */ val badge: typings.winrt.Windows.Networking.PushNotifications.PushNotificationType.badge with Double = js.native
  /* 3 */ val raw: typings.winrt.Windows.Networking.PushNotifications.PushNotificationType.raw with Double = js.native
  /* 1 */ val tile: typings.winrt.Windows.Networking.PushNotifications.PushNotificationType.tile with Double = js.native
  /* 0 */ val toast: typings.winrt.Windows.Networking.PushNotifications.PushNotificationType.toast with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PushNotificationType with Double] = js.native
}

