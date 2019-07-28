package typings.titanium

import typings.titanium.TitaniumNs.AppNs.iOSNs.UserNotificationCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters used to register the application with local notifications using
  * the <Titanium.App.iOS.registerUserNotificationSettings> method.
  * To retrieve the current notification settings, use the
  * <Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings> method.
  */
trait UserNotificationSettings extends js.Object {
  /**
  	 * Set of categories of user notification actions required by the applicaiton to use.
  	 */
  var categories: js.UndefOr[js.Array[UserNotificationCategory]] = js.undefined
  /**
  	 * Notification types to use.
  	 */
  var types: js.UndefOr[js.Array[Double]] = js.undefined
}

object UserNotificationSettings {
  @scala.inline
  def apply(categories: js.Array[UserNotificationCategory] = null, types: js.Array[Double] = null): UserNotificationSettings = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[UserNotificationSettings]
  }
}

