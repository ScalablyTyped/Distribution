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
  
  val badge: badge with java.lang.String = js.native
  val raw: raw with java.lang.String = js.native
  val tile: tile with java.lang.String = js.native
  val tileFlyout: tileFlyout with java.lang.String = js.native
  val toast: toast with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType with java.lang.String
  ] = js.native
}

