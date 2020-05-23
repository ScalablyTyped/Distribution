package typings.titanium.Titanium.App.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the user activity was continued on another device.
  */
trait UserActivityUseractivitywascontinuedEvent extends UserActivityBaseEvent {
  /**
    * The activityType of the User Activity triggering the event.
    */
  var activityType: String
  /**
    * The title of the User Activity if defined.
    */
  var title: String
  /**
    * Dictionary object containing the userInfo data of the User Activity.
    */
  var userInfo: js.Any
  /**
    * The webpageURL of the User Activity if defined.
    */
  var webpageURL: String
}

object UserActivityUseractivitywascontinuedEvent {
  @scala.inline
  def apply(activityType: String, source: UserActivity, title: String, userInfo: js.Any, webpageURL: String): UserActivityUseractivitywascontinuedEvent = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any], webpageURL = webpageURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserActivityUseractivitywascontinuedEvent]
  }
}

