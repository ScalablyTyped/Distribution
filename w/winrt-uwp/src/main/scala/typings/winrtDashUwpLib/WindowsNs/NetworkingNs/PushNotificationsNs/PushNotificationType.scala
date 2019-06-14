package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.PushNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PushNotificationType extends js.Object

/** The type of push notification that has been received from the app server. Used by the NotificationType property. */
@JSGlobal("Windows.Networking.PushNotifications.PushNotificationType")
@js.native
object PushNotificationType extends js.Object {
  /** A push notification to update a tile's badge overlay. */
  @js.native
  sealed trait badge
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType
  
  /** A push notification to perform an update to a tile that does not involve UI. */
  @js.native
  sealed trait raw
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType
  
  /** A push notification to update one or more elements of a tile. */
  @js.native
  sealed trait tile
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType
  
  /** A push notification to update an app's tile flyout. */
  @js.native
  sealed trait tileFlyout
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType
  
  /** A push notification to display as toast. */
  @js.native
  sealed trait toast
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType
  
  /* 2 */ val badge: badge with scala.Double = js.native
  /* 3 */ val raw: raw with scala.Double = js.native
  /* 1 */ val tile: tile with scala.Double = js.native
  /* 4 */ val tileFlyout: tileFlyout with scala.Double = js.native
  /* 0 */ val toast: toast with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType with scala.Double
  ] = js.native
}

