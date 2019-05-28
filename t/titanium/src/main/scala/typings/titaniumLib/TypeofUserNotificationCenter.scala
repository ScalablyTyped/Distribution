package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofUserNotificationCenter extends js.Object {
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserNotificationCenter.apiName> property.
  				 */
  def getApiName(): java.lang.String
  /**
  				 * Fetches the delivered notifications asynchronously.
  				 */
  def getDeliveredNotifications(callback: js.Function1[/* param0 */ UserNotificationCallbackResponse, _]): scala.Unit
  /**
  				 * Fetches the pending notifications asynchronously.
  				 */
  def getPendingNotifications(callback: js.Function1[/* param0 */ UserNotificationCallbackResponse, _]): scala.Unit
  /**
  				 * Removes the specified delivered notifications from the notification-center.
  				 * If no notifications are specified, all delivered notifications will be removed.
  				 */
  def removeDeliveredNotifications(notifications: js.Array[UserNotificationDictionary]): scala.Unit
  /**
  				 * Removes the specified pending notifications to prevent them from being triggered.
  				 * If no notifications are specified, all pending notifications will be removed.
  				 */
  def removePendingNotifications(notifications: js.Array[UserNotificationDictionary]): scala.Unit
  /**
  				 * Notification types and user notification categories the application is registered to use.
  				 */
  def requestUserNotificationSettings(callback: js.Function1[/* param0 */ GetUserNotificationSettings, _]): scala.Unit
}

object TypeofUserNotificationCenter {
  @scala.inline
  def apply(
    apiName: java.lang.String,
    getApiName: () => java.lang.String,
    getDeliveredNotifications: js.Function1[/* param0 */ UserNotificationCallbackResponse, _] => scala.Unit,
    getPendingNotifications: js.Function1[/* param0 */ UserNotificationCallbackResponse, _] => scala.Unit,
    removeDeliveredNotifications: js.Array[UserNotificationDictionary] => scala.Unit,
    removePendingNotifications: js.Array[UserNotificationDictionary] => scala.Unit,
    requestUserNotificationSettings: js.Function1[/* param0 */ GetUserNotificationSettings, _] => scala.Unit
  ): TypeofUserNotificationCenter = {
    val __obj = js.Dynamic.literal(apiName = apiName, getApiName = js.Any.fromFunction0(getApiName), getDeliveredNotifications = js.Any.fromFunction1(getDeliveredNotifications), getPendingNotifications = js.Any.fromFunction1(getPendingNotifications), removeDeliveredNotifications = js.Any.fromFunction1(removeDeliveredNotifications), removePendingNotifications = js.Any.fromFunction1(removePendingNotifications), requestUserNotificationSettings = js.Any.fromFunction1(requestUserNotificationSettings))
  
    __obj.asInstanceOf[TypeofUserNotificationCenter]
  }
}

