package typings.winrtUwp.Windows.Networking.PushNotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
