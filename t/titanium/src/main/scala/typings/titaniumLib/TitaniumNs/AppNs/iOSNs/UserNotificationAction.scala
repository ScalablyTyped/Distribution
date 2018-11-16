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

