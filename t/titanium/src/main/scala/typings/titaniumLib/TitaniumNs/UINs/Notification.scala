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

object Notification {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    duration: scala.Double,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getDuration: () => scala.Double,
    getGravity: () => scala.Double,
    getHorizontalMargin: () => scala.Double,
    getMessage: () => java.lang.String,
    getVerticalMargin: () => scala.Double,
    getXOffset: () => scala.Double,
    getYOffset: () => scala.Double,
    gravity: scala.Double,
    horizontalMargin: scala.Double,
    message: java.lang.String,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setDuration: scala.Double => scala.Unit,
    setGravity: scala.Double => scala.Unit,
    setHorizontalMargin: scala.Double => scala.Unit,
    setMessage: java.lang.String => scala.Unit,
    setVerticalMargin: scala.Double => scala.Unit,
    setXOffset: scala.Double => scala.Unit,
    setYOffset: scala.Double => scala.Unit,
    show: () => scala.Unit,
    verticalMargin: scala.Double,
    xOffset: scala.Double,
    yOffset: scala.Double,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, scala.Unit]) = null
  ): Notification = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, duration = duration, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDuration = js.Any.fromFunction0(getDuration), getGravity = js.Any.fromFunction0(getGravity), getHorizontalMargin = js.Any.fromFunction0(getHorizontalMargin), getMessage = js.Any.fromFunction0(getMessage), getVerticalMargin = js.Any.fromFunction0(getVerticalMargin), getXOffset = js.Any.fromFunction0(getXOffset), getYOffset = js.Any.fromFunction0(getYOffset), gravity = gravity, horizontalMargin = horizontalMargin, message = message, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDuration = js.Any.fromFunction1(setDuration), setGravity = js.Any.fromFunction1(setGravity), setHorizontalMargin = js.Any.fromFunction1(setHorizontalMargin), setMessage = js.Any.fromFunction1(setMessage), setVerticalMargin = js.Any.fromFunction1(setVerticalMargin), setXOffset = js.Any.fromFunction1(setXOffset), setYOffset = js.Any.fromFunction1(setYOffset), show = js.Any.fromFunction0(show), verticalMargin = verticalMargin, xOffset = xOffset, yOffset = yOffset)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Notification]
  }
}

