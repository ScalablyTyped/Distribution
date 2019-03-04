package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCallbackEventFireEventGetApiName extends js.Object {
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: java.lang.String
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: scala.Boolean
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Applies the properties to the proxy.
  				 */
  def applyProperties(props: js.Any): scala.Unit
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserNotificationCenter.apiName> property.
  				 */
  def getApiName(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserNotificationCenter.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean
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
  def removeDeliveredNotifications(): scala.Unit
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Removes the specified pending notifications to prevent them from being triggered.
  				 * If no notifications are specified, all pending notifications will be removed.
  				 */
  def removePendingNotifications(notifications: js.Array[titaniumLib.TitaniumNs.AppNs.iOSNs.LocalNotification]): scala.Unit
  /**
  				 * Notification types and user notification categories the application is registered to use.
  				 */
  def requestUserNotificationSettings(callback: js.Function1[/* param0 */ GetUserNotificationSettings, _]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserNotificationCenter.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit
}

object Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCallbackEventFireEventGetApiName {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getDeliveredNotifications: js.Function1[js.Function1[/* param0 */ UserNotificationCallbackResponse, _], scala.Unit],
    getPendingNotifications: js.Function1[js.Function1[/* param0 */ UserNotificationCallbackResponse, _], scala.Unit],
    removeDeliveredNotifications: js.Function0[scala.Unit],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    removePendingNotifications: js.Function1[js.Array[titaniumLib.TitaniumNs.AppNs.iOSNs.LocalNotification], scala.Unit],
    requestUserNotificationSettings: js.Function1[js.Function1[/* param0 */ GetUserNotificationSettings, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit]
  ): Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCallbackEventFireEventGetApiName = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getDeliveredNotifications = getDeliveredNotifications, getPendingNotifications = getPendingNotifications, removeDeliveredNotifications = removeDeliveredNotifications, removeEventListener = removeEventListener, removePendingNotifications = removePendingNotifications, requestUserNotificationSettings = requestUserNotificationSettings, setBubbleParent = setBubbleParent)
  
    __obj.asInstanceOf[Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCallbackEventFireEventGetApiName]
  }
}

