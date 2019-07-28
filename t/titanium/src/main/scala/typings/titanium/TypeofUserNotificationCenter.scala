package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofUserNotificationCenter extends js.Object {
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserNotificationCenter.apiName> property.
  				 */
  def getApiName(): String
  /**
  				 * Fetches the delivered notifications asynchronously.
  				 */
  def getDeliveredNotifications(callback: js.Function1[/* param0 */ UserNotificationCallbackResponse, _]): Unit
  /**
  				 * Fetches the pending notifications asynchronously.
  				 */
  def getPendingNotifications(callback: js.Function1[/* param0 */ UserNotificationCallbackResponse, _]): Unit
  /**
  				 * Removes the specified delivered notifications from the notification-center.
  				 * If no notifications are specified, all delivered notifications will be removed.
  				 */
  def removeDeliveredNotifications(notifications: js.Array[UserNotificationDictionary]): Unit
  /**
  				 * Removes the specified pending notifications to prevent them from being triggered.
  				 * If no notifications are specified, all pending notifications will be removed.
  				 */
  def removePendingNotifications(notifications: js.Array[UserNotificationDictionary]): Unit
  /**
  				 * Notification types and user notification categories the application is registered to use.
  				 */
  def requestUserNotificationSettings(callback: js.Function1[/* param0 */ GetUserNotificationSettings, _]): Unit
}

object TypeofUserNotificationCenter {
  @scala.inline
  def apply(
    apiName: String,
    getApiName: () => String,
    getDeliveredNotifications: js.Function1[/* param0 */ UserNotificationCallbackResponse, _] => Unit,
    getPendingNotifications: js.Function1[/* param0 */ UserNotificationCallbackResponse, _] => Unit,
    removeDeliveredNotifications: js.Array[UserNotificationDictionary] => Unit,
    removePendingNotifications: js.Array[UserNotificationDictionary] => Unit,
    requestUserNotificationSettings: js.Function1[/* param0 */ GetUserNotificationSettings, _] => Unit
  ): TypeofUserNotificationCenter = {
    val __obj = js.Dynamic.literal(apiName = apiName, getApiName = js.Any.fromFunction0(getApiName), getDeliveredNotifications = js.Any.fromFunction1(getDeliveredNotifications), getPendingNotifications = js.Any.fromFunction1(getPendingNotifications), removeDeliveredNotifications = js.Any.fromFunction1(removeDeliveredNotifications), removePendingNotifications = js.Any.fromFunction1(removePendingNotifications), requestUserNotificationSettings = js.Any.fromFunction1(requestUserNotificationSettings))
  
    __obj.asInstanceOf[TypeofUserNotificationCenter]
  }
}

