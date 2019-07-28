package typings.winrtDashUwp.WindowsNs.NetworkingNs.PushNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the app-defined content of a raw notification (a push notification that does not involve UI). Its contents can be used in an app's background task, if the app has that capability, or otherwise consumed by the app and acted on as needed. */
@JSGlobal("Windows.Networking.PushNotifications.RawNotification")
@js.native
abstract class RawNotification () extends js.Object {
  /** Gets the content of the raw notification as a string. This string specifies a background task associated with the app. */
  var content: String = js.native
}

