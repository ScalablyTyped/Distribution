package typings.titanium.Titanium.App

import typings.titanium.Titanium.App.iOS.UserNotificationCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the user notification settings are registered.
		 */
trait iOSUsernotificationsettingsEvent extends iOSBaseEvent {
  /**
  			 * Set of categories of user notification actions the application is registered to use.
  			 */
  var categories: js.Array[UserNotificationCategory]
  /**
  			 * Notification types the application is registered to use.
  			 */
  var types: js.Array[Double]
}

object iOSUsernotificationsettingsEvent {
  @scala.inline
  def apply(categories: js.Array[UserNotificationCategory], source: iOS, types: js.Array[Double]): iOSUsernotificationsettingsEvent = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSUsernotificationsettingsEvent]
  }
}

