package typings
package titaniumLib.TitaniumNs.AppNs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The top-level App iOS Notification Center module. It is used to control scheduled notifications
			 * and receive details about the system-wide notification settings.
			 */
@JSGlobal("Titanium.App.iOS.UserNotificationCenter")
@js.native
object UserNotificationCenterNs extends js.Object {
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserNotificationCenter.apiName> property.
  				 */
  def getApiName(): java.lang.String = js.native
  /**
  				 * Fetches the delivered notifications asynchronously.
  				 */
  def getDeliveredNotifications(callback: js.Function1[/* param0 */ titaniumLib.UserNotificationCallbackResponse, _]): scala.Unit = js.native
  /**
  				 * Fetches the pending notifications asynchronously.
  				 */
  def getPendingNotifications(callback: js.Function1[/* param0 */ titaniumLib.UserNotificationCallbackResponse, _]): scala.Unit = js.native
  /**
  				 * Removes the specified delivered notifications from the notification-center.
  				 * If no notifications are specified, all delivered notifications will be removed.
  				 */
  def removeDeliveredNotifications(notifications: js.Array[titaniumLib.UserNotificationDictionary]): scala.Unit = js.native
  /**
  				 * Removes the specified pending notifications to prevent them from being triggered.
  				 * If no notifications are specified, all pending notifications will be removed.
  				 */
  def removePendingNotifications(notifications: js.Array[titaniumLib.UserNotificationDictionary]): scala.Unit = js.native
  /**
  				 * Notification types and user notification categories the application is registered to use.
  				 */
  def requestUserNotificationSettings(callback: js.Function1[/* param0 */ titaniumLib.GetUserNotificationSettings, _]): scala.Unit = js.native
}

