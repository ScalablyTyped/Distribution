package typings
package titaniumLib.TitaniumNs.AppNs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An action the user selects in response to an interactive notification.
			 */
trait UserNotificationAction
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Selects how to activate the application.
  				 */
  var activationMode: scala.Double
  /**
  				 * Set to true if the action requires the device to be unlocked. On the Apple Watch actions never require authentication.
  				 */
  var authenticationRequired: scala.Boolean
  /**
  				 * Custom behavior the user notification supports.
  				 */
  var behavior: scala.Double
  /**
  				 * Set to true if the action causes destructive behavior to the user's data or the application.
  				 */
  var destructive: scala.Boolean
  /**
  				 * Identifier for this action. Used to identify the action the user pressed.
  				 */
  var identifier: java.lang.String
  /**
  				 * Title of the button displayed in the notification.
  				 */
  var title: java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserNotificationAction.activationMode> property.
  				 */
  def getActivationMode(): scala.Double
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserNotificationAction.behavior> property.
  				 */
  def getBehavior(): scala.Double
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserNotificationAction.activationMode> property.
  				 */
  def setActivationMode(activationMode: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserNotificationAction.behavior> property.
  				 */
  def setBehavior(behavior: scala.Double): scala.Unit
}

object UserNotificationAction {
  @scala.inline
  def apply(
    activationMode: scala.Double,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    authenticationRequired: scala.Boolean,
    behavior: scala.Double,
    bubbleParent: scala.Boolean,
    destructive: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getActivationMode: () => scala.Double,
    getApiName: () => java.lang.String,
    getBehavior: () => scala.Double,
    getBubbleParent: () => scala.Boolean,
    identifier: java.lang.String,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setActivationMode: scala.Double => scala.Unit,
    setBehavior: scala.Double => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    title: java.lang.String,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): UserNotificationAction = {
    val __obj = js.Dynamic.literal(activationMode = activationMode, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), authenticationRequired = authenticationRequired, behavior = behavior, bubbleParent = bubbleParent, destructive = destructive, fireEvent = js.Any.fromFunction2(fireEvent), getActivationMode = js.Any.fromFunction0(getActivationMode), getApiName = js.Any.fromFunction0(getApiName), getBehavior = js.Any.fromFunction0(getBehavior), getBubbleParent = js.Any.fromFunction0(getBubbleParent), identifier = identifier, removeEventListener = js.Any.fromFunction2(removeEventListener), setActivationMode = js.Any.fromFunction1(setActivationMode), setBehavior = js.Any.fromFunction1(setBehavior), setBubbleParent = js.Any.fromFunction1(setBubbleParent), title = title)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[UserNotificationAction]
  }
}

