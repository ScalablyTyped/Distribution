package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object passed to the [retrieveDeviceToken](Modules.CloudPush.retrieveDeviceToken) error callback.
  */
trait CloudPushNotificationErrorArg extends js.Object {
  /**
  	 * Description of the error.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
}

object CloudPushNotificationErrorArg {
  @scala.inline
  def apply(error: java.lang.String = null): CloudPushNotificationErrorArg = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[CloudPushNotificationErrorArg]
  }
}

