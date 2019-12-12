package typings.winrt.Windows.Networking.PushNotifications

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Networking.PushNotifications.PushNotificationType.badge
import typings.winrt.Windows.Networking.PushNotifications.PushNotificationType.raw
import typings.winrt.Windows.Networking.PushNotifications.PushNotificationType.tile
import typings.winrt.Windows.Networking.PushNotifications.PushNotificationType.toast
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PushNotificationType with Double] = js.native
  /* 2 */ @js.native
  object badge extends TopLevel[badge with Double]
  
  /* 3 */ @js.native
  object raw extends TopLevel[raw with Double]
  
  /* 1 */ @js.native
  object tile extends TopLevel[tile with Double]
  
  /* 0 */ @js.native
  object toast extends TopLevel[toast with Double]
  
}

