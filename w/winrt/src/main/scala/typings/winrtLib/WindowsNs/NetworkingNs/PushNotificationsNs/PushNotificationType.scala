package typings
package winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PushNotificationType extends js.Object

@JSGlobal("Windows.Networking.PushNotifications.PushNotificationType")
@js.native
object PushNotificationType extends js.Object {
  @js.native
  sealed trait badge
    extends winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType
  
  @js.native
  sealed trait raw
    extends winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType
  
  @js.native
  sealed trait tile
    extends winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType
  
  @js.native
  sealed trait toast
    extends winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType
  
  /* 2 */ val badge: badge with scala.Double = js.native
  /* 3 */ val raw: raw with scala.Double = js.native
  /* 1 */ val tile: tile with scala.Double = js.native
  /* 0 */ val toast: toast with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType with scala.Double
  ] = js.native
}

