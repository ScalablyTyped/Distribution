package typings.titanium.TitaniumNs.AppNs.iOSNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An action the user selects in response to an interactive notification.
			 */
trait UserNotificationAction extends Proxy {
  /**
  				 * Selects how to activate the application.
  				 */
  var activationMode: Double
  /**
  				 * Set to true if the action requires the device to be unlocked. On the Apple Watch actions never require authentication.
  				 */
  var authenticationRequired: Boolean
  /**
  				 * Custom behavior the user notification supports.
  				 */
  var behavior: Double
  /**
  				 * Set to true if the action causes destructive behavior to the user's data or the application.
  				 */
  var destructive: Boolean
  /**
  				 * Identifier for this action. Used to identify the action the user pressed.
  				 */
  var identifier: String
  /**
  				 * Title of the button displayed in the notification.
  				 */
  var title: String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserNotificationAction.activationMode> property.
  				 */
  def getActivationMode(): Double
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserNotificationAction.behavior> property.
  				 */
  def getBehavior(): Double
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserNotificationAction.activationMode> property.
  				 */
  def setActivationMode(activationMode: Double): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserNotificationAction.behavior> property.
  				 */
  def setBehavior(behavior: Double): Unit
}

object UserNotificationAction {
  @scala.inline
  def apply(
    activationMode: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    authenticationRequired: Boolean,
    behavior: Double,
    bubbleParent: Boolean,
    destructive: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getActivationMode: () => Double,
    getApiName: () => String,
    getBehavior: () => Double,
    getBubbleParent: () => Boolean,
    identifier: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setActivationMode: Double => Unit,
    setBehavior: Double => Unit,
    setBubbleParent: Boolean => Unit,
    title: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): UserNotificationAction = {
    val __obj = js.Dynamic.literal(activationMode = activationMode, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), authenticationRequired = authenticationRequired, behavior = behavior, bubbleParent = bubbleParent, destructive = destructive, fireEvent = js.Any.fromFunction2(fireEvent), getActivationMode = js.Any.fromFunction0(getActivationMode), getApiName = js.Any.fromFunction0(getApiName), getBehavior = js.Any.fromFunction0(getBehavior), getBubbleParent = js.Any.fromFunction0(getBubbleParent), identifier = identifier, removeEventListener = js.Any.fromFunction2(removeEventListener), setActivationMode = js.Any.fromFunction1(setActivationMode), setBehavior = js.Any.fromFunction1(setBehavior), setBubbleParent = js.Any.fromFunction1(setBubbleParent), title = title)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[UserNotificationAction]
  }
}

