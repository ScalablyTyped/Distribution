package typings.titanium.Titanium.App.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired if the activity context needs to be saved before being continued on another device.
  * To fire the event, set the UserActiviy object's `needsSave ` property to `true`.
  * The receiver should update the activity with current activity state.
  * After the event is fired, iOS will reset the `needsSave` property to false.
  */
trait UserActivityUseractivitywillsaveEvent extends UserActivityBaseEvent {
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

object UserActivityUseractivitywillsaveEvent {
  @scala.inline
  def apply(activityType: String, source: UserActivity, title: String, userInfo: js.Any, webpageURL: String): UserActivityUseractivitywillsaveEvent = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any], webpageURL = webpageURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserActivityUseractivitywillsaveEvent]
  }
}

