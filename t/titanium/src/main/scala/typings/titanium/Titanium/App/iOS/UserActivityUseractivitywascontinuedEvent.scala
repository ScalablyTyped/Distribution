package typings.titanium.Titanium.App.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the user activity was continued on another device.
  */
@js.native
trait UserActivityUseractivitywascontinuedEvent extends UserActivityBaseEvent {
  /**
    * The activityType of the User Activity triggering the event.
    */
  var activityType: String = js.native
  /**
    * The title of the User Activity if defined.
    */
  var title: String = js.native
  /**
    * Dictionary object containing the userInfo data of the User Activity.
    */
  var userInfo: js.Any = js.native
  /**
    * The webpageURL of the User Activity if defined.
    */
  var webpageURL: String = js.native
}

object UserActivityUseractivitywascontinuedEvent {
  @scala.inline
  def apply(activityType: String, source: UserActivity, title: String, userInfo: js.Any, webpageURL: String): UserActivityUseractivitywascontinuedEvent = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any], webpageURL = webpageURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserActivityUseractivitywascontinuedEvent]
  }
  @scala.inline
  implicit class UserActivityUseractivitywascontinuedEventOps[Self <: UserActivityUseractivitywascontinuedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivityType(value: String): Self = this.set("activityType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserInfo(value: js.Any): Self = this.set("userInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebpageURL(value: String): Self = this.set("webpageURL", value.asInstanceOf[js.Any])
  }
  
}

