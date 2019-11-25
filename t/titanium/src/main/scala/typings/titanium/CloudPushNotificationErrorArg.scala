package typings.titanium

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
  var error: js.UndefOr[String] = js.undefined
}

object CloudPushNotificationErrorArg {
  @scala.inline
  def apply(error: String = null): CloudPushNotificationErrorArg = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudPushNotificationErrorArg]
  }
}

