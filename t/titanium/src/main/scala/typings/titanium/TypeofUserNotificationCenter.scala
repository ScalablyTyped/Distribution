package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofUserNotificationCenter extends js.Object {
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserNotificationCenter.apiName> property.
  				 */
  def getApiName(): String = js.native
  /**
  				 * Fetches the delivered notifications asynchronously.
  				 */
  def getDeliveredNotifications(callback: js.Function1[/* param0 */ UserNotificationCallbackResponse, _]): Unit = js.native
  /**
  				 * Fetches the pending notifications asynchronously.
  				 */
  def getPendingNotifications(callback: js.Function1[/* param0 */ UserNotificationCallbackResponse, _]): Unit = js.native
  /**
  				 * Removes the specified delivered notifications from the notification-center.
  				 * If no notifications are specified, all delivered notifications will be removed.
  				 */
  def removeDeliveredNotifications(notifications: js.Array[UserNotificationDictionary]): Unit = js.native
  /**
  				 * Removes the specified pending notifications to prevent them from being triggered.
  				 * If no notifications are specified, all pending notifications will be removed.
  				 */
  def removePendingNotifications(): Unit = js.native
  def removePendingNotifications(notifications: js.Array[UserNotificationDictionary]): Unit = js.native
  /**
  				 * Notification types and user notification categories the application is registered to use.
  				 */
  def requestUserNotificationSettings(callback: js.Function1[/* param0 */ GetUserNotificationSettings, _]): Unit = js.native
}

