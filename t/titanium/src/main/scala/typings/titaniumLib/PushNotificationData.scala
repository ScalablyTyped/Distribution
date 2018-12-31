package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object representing a push notification.
  */
trait PushNotificationData extends js.Object {
  /**
  	 * The `userinfo` dictionary passed to the Apple Push Notification Service.
  	 */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Boolean indicating if notification was received while app was in background.
  	 * This property became available in Titanium Mobile 3.1.0 for iOS.
  	 */
  var inBackground: js.UndefOr[scala.Boolean] = js.undefined
}

