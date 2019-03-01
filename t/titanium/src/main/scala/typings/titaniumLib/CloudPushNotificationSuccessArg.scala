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

object CloudPushNotificationSuccessArg {
  @scala.inline
  def apply(deviceToken: java.lang.String = null): CloudPushNotificationSuccessArg = {
    val __obj = js.Dynamic.literal()
    if (deviceToken != null) __obj.updateDynamic("deviceToken")(deviceToken)
    __obj.asInstanceOf[CloudPushNotificationSuccessArg]
  }
}

