package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for specifying push notification options to
  * [registerForPushNotifications](Titanium.Network.registerForPushNotifications).
  */
trait PushNotificationConfig extends js.Object {
  /**
    * Callback function invoked upon receiving a new push notification.
    */
  var callback: js.UndefOr[js.Function1[/* param0 */ PushNotificationData, Unit]] = js.undefined
  /**
    * Callback function called when an error occurs during registration.
    */
  var error: js.UndefOr[js.Function1[/* param0 */ PushNotificationErrorArg, Unit]] = js.undefined
  /**
    * Callback function called when the push registration is successfully completed.
    */
  var success: js.UndefOr[js.Function1[/* param0 */ PushNotificationSuccessArg, Unit]] = js.undefined
  /**
    * Array of `NOTIFICATION_TYPE` constants that the application would like to receive.
    */
  var types: js.UndefOr[js.Array[Double]] = js.undefined
}

object PushNotificationConfig {
  @scala.inline
  def apply(
    callback: /* param0 */ PushNotificationData => Unit = null,
    error: /* param0 */ PushNotificationErrorArg => Unit = null,
    success: /* param0 */ PushNotificationSuccessArg => Unit = null,
    types: js.Array[Double] = null
  ): PushNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationConfig]
  }
}

