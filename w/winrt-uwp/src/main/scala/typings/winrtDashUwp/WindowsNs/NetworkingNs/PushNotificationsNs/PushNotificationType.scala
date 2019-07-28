package typings.winrtDashUwp.WindowsNs.NetworkingNs.PushNotificationsNs

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
  sealed trait badge extends PushNotificationType
  
  /** A push notification to perform an update to a tile that does not involve UI. */
  @js.native
  sealed trait raw extends PushNotificationType
  
  /** A push notification to update one or more elements of a tile. */
  @js.native
  sealed trait tile extends PushNotificationType
  
  /** A push notification to update an app's tile flyout. */
  @js.native
  sealed trait tileFlyout extends PushNotificationType
  
  /** A push notification to display as toast. */
  @js.native
  sealed trait toast extends PushNotificationType
  
  /* 2 */ val badge: typings.winrtDashUwp.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType.badge with Double = js.native
  /* 3 */ val raw: typings.winrtDashUwp.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType.raw with Double = js.native
  /* 1 */ val tile: typings.winrtDashUwp.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType.tile with Double = js.native
  /* 4 */ val tileFlyout: typings.winrtDashUwp.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType.tileFlyout with Double = js.native
  /* 0 */ val toast: typings.winrtDashUwp.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationType.toast with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PushNotificationType with Double] = js.native
}

