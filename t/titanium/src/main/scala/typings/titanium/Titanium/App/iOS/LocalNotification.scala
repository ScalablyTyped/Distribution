package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A local notification to alert the user of new or pending application information.
			 */
@JSGlobal("Titanium.App.iOS.LocalNotification")
@js.native
class LocalNotification () extends Proxy {
  /**
  				 * Cancels the pending notification.
  				 * @deprecated Use [Titanium.App.iOS.UserNotificationCenter.removePendingNotifications](Titanium.App.iOS.UserNotificationCenter.removePendingNotifications) instead.
  				 */
  def cancel(): Unit = js.native
}

