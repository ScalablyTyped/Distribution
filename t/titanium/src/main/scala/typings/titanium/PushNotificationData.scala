package typings.titanium

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
    */
  var inBackground: js.UndefOr[Boolean] = js.undefined
}

object PushNotificationData {
  @scala.inline
  def apply(data: js.Any = null, inBackground: js.UndefOr[Boolean] = js.undefined): PushNotificationData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(inBackground)) __obj.updateDynamic("inBackground")(inBackground.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationData]
  }
}

