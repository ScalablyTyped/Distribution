package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for specifying push notification options to
  * [registerForPushNotifications](Titanium.Network.registerForPushNotifications).
  */
@js.native
trait PushNotificationConfig extends js.Object {
  /**
    * Callback function invoked upon receiving a new push notification.
    */
  var callback: js.UndefOr[js.Function1[/* param0 */ PushNotificationData, Unit]] = js.native
  /**
    * Callback function called when an error occurs during registration.
    */
  var error: js.UndefOr[js.Function1[/* param0 */ PushNotificationErrorArg, Unit]] = js.native
  /**
    * Callback function called when the push registration is successfully completed.
    */
  var success: js.UndefOr[js.Function1[/* param0 */ PushNotificationSuccessArg, Unit]] = js.native
  /**
    * Array of `NOTIFICATION_TYPE` constants that the application would like to receive.
    */
  var types: js.UndefOr[js.Array[Double]] = js.native
}

object PushNotificationConfig {
  @scala.inline
  def apply(): PushNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationConfig]
  }
  @scala.inline
  implicit class PushNotificationConfigOps[Self <: PushNotificationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallback(value: /* param0 */ PushNotificationData => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setError(value: /* param0 */ PushNotificationErrorArg => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setSuccess(value: /* param0 */ PushNotificationSuccessArg => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTypesVarargs(value: Double*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[Double]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

