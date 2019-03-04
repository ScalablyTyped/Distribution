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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    duration: scala.Double,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getDuration: js.Function0[scala.Double],
    getGravity: js.Function0[scala.Double],
    getHorizontalMargin: js.Function0[scala.Double],
    getMessage: js.Function0[java.lang.String],
    getVerticalMargin: js.Function0[scala.Double],
    getXOffset: js.Function0[scala.Double],
    getYOffset: js.Function0[scala.Double],
    gravity: scala.Double,
    horizontalMargin: scala.Double,
    message: java.lang.String,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setDuration: js.Function1[scala.Double, scala.Unit],
    setGravity: js.Function1[scala.Double, scala.Unit],
    setHorizontalMargin: js.Function1[scala.Double, scala.Unit],
    setMessage: js.Function1[java.lang.String, scala.Unit],
    setVerticalMargin: js.Function1[scala.Double, scala.Unit],
    setXOffset: js.Function1[scala.Double, scala.Unit],
    setYOffset: js.Function1[scala.Double, scala.Unit],
    show: js.Function0[scala.Unit],
    verticalMargin: scala.Double,
    xOffset: scala.Double,
    yOffset: scala.Double,
    getLifecycleContainer: js.Function0[Window | TabGroup] = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, scala.Unit]) = null
  ): Notification = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, duration = duration, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getDuration = getDuration, getGravity = getGravity, getHorizontalMargin = getHorizontalMargin, getMessage = getMessage, getVerticalMargin = getVerticalMargin, getXOffset = getXOffset, getYOffset = getYOffset, gravity = gravity, horizontalMargin = horizontalMargin, message = message, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent, setDuration = setDuration, setGravity = setGravity, setHorizontalMargin = setHorizontalMargin, setMessage = setMessage, setVerticalMargin = setVerticalMargin, setXOffset = setXOffset, setYOffset = setYOffset, show = show, verticalMargin = verticalMargin, xOffset = xOffset, yOffset = yOffset)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Notification]
  }
}

