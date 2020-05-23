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
  
}

