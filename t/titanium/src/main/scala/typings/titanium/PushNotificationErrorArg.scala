package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object passed to the
  * [registerForPushNotifications](Titanium.Network.registerForPushNotifications) error callback.
  */
@js.native
trait PushNotificationErrorArg extends FailureResponse {
  /**
    * The value of this string is always "remote".
    */
  var `type`: js.UndefOr[java.lang.String] = js.native
}

object PushNotificationErrorArg {
  @scala.inline
  def apply(): PushNotificationErrorArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationErrorArg]
  }
  @scala.inline
  implicit class PushNotificationErrorArgOps[Self <: PushNotificationErrorArg] (val x: Self) extends AnyVal {
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
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

