package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A toast notification.
		 */

trait Notification
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Determines how long the notification stays on screen.
  			 */
  var duration: scala.Double
  /**
  			 * Determines the location at which the notification should appear on the screen.
  			 */
  var gravity: scala.Double
  /**
  			 * Horizontal placement of the notification, *as a fraction of the screen width*.
  			 */
  var horizontalMargin: scala.Double
  /**
  			 * Notification text to display.
  			 */
  var message: java.lang.String
  /**
  			 * Vertical placement of the notifcation, *as a fraction of the screen height*.
  			 */
  var verticalMargin: scala.Double
  /**
  			 * X offset from the default position, in pixels.
  			 */
  var xOffset: scala.Double
  /**
  			 * Y offset from the default position, in pixels.
  			 */
  var yOffset: scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.duration> property.
  			 */
  def getDuration(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.gravity> property.
  			 */
  def getGravity(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.horizontalMargin> property.
  			 */
  def getHorizontalMargin(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.message> property.
  			 */
  def getMessage(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.UI.Notification.verticalMargin> property.
  			 */
  def getVerticalMargin(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.xOffset> property.
  			 */
  def getXOffset(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.yOffset> property.
  			 */
  def getYOffset(): scala.Double
  /**
  			 * Sets the value of the <Titanium.UI.Notification.duration> property.
  			 */
  def setDuration(duration: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.gravity> property.
  			 */
  def setGravity(gravity: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.horizontalMargin> property.
  			 */
  def setHorizontalMargin(horizontalMargin: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.message> property.
  			 */
  def setMessage(message: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.verticalMargin> property.
  			 */
  def setVerticalMargin(verticalMargin: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.xOffset> property.
  			 */
  def setXOffset(xOffset: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.yOffset> property.
  			 */
  def setYOffset(yOffset: scala.Double): scala.Unit
  /**
  			 * Show the notification.
  			 */
  def show(): scala.Unit
}

