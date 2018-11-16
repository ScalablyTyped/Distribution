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
  
  val badge: badge with java.lang.String = js.native
  val raw: raw with java.lang.String = js.native
  val tile: tile with java.lang.String = js.native
  val toast: toast with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType with java.lang.String
  ] = js.native
}

