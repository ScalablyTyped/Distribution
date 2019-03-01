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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    authenticationRequired: scala.Boolean,
    behavior: scala.Double,
    bubbleParent: scala.Boolean,
    destructive: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getActivationMode: js.Function0[scala.Double],
    getApiName: js.Function0[java.lang.String],
    getBehavior: js.Function0[scala.Double],
    getBubbleParent: js.Function0[scala.Boolean],
    identifier: java.lang.String,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setActivationMode: js.Function1[scala.Double, scala.Unit],
    setBehavior: js.Function1[scala.Double, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    title: java.lang.String,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): UserNotificationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activationMode")(activationMode)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("authenticationRequired")(authenticationRequired)
    __obj.updateDynamic("behavior")(behavior)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("destructive")(destructive)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getActivationMode")(getActivationMode)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBehavior")(getBehavior)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("identifier")(identifier)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setActivationMode")(setActivationMode)
    __obj.updateDynamic("setBehavior")(setBehavior)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("title")(title)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[UserNotificationAction]
  }
}

