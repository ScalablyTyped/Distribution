package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A simple object passed to the [retrieveDeviceToken](Modules.CloudPush.retrieveDeviceToken) success callback.
 */

trait CloudPushNotificationSuccessArg extends js.Object {
  /**
  	 * The device token which this device was registered for.
  	 */
  var deviceToken: js.UndefOr[java.lang.String] = js.undefined
}

