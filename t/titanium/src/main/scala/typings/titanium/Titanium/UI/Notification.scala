package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A toast notification.
		 */
trait Notification extends Proxy {
  /**
  			 * Determines how long the notification stays on screen.
  			 */
  var duration: Double
  /**
  			 * Determines the location at which the notification should appear on the screen.
  			 */
  var gravity: Double
  /**
  			 * Horizontal placement of the notification, *as a fraction of the screen width*.
  			 */
  var horizontalMargin: Double
  /**
  			 * Notification text to display.
  			 */
  var message: String
  /**
  			 * Vertical placement of the notifcation, *as a fraction of the screen height*.
  			 */
  var verticalMargin: Double
  /**
  			 * X offset from the default position, in pixels.
  			 */
  var xOffset: Double
  /**
  			 * Y offset from the default position, in pixels.
  			 */
  var yOffset: Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.duration> property.
  			 */
  def getDuration(): Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.gravity> property.
  			 */
  def getGravity(): Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.horizontalMargin> property.
  			 */
  def getHorizontalMargin(): Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.message> property.
  			 */
  def getMessage(): String
  /**
  			 * Gets the value of the <Titanium.UI.Notification.verticalMargin> property.
  			 */
  def getVerticalMargin(): Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.xOffset> property.
  			 */
  def getXOffset(): Double
  /**
  			 * Gets the value of the <Titanium.UI.Notification.yOffset> property.
  			 */
  def getYOffset(): Double
  /**
  			 * Sets the value of the <Titanium.UI.Notification.duration> property.
  			 */
  def setDuration(duration: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.gravity> property.
  			 */
  def setGravity(gravity: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.horizontalMargin> property.
  			 */
  def setHorizontalMargin(horizontalMargin: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.message> property.
  			 */
  def setMessage(message: String): Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.verticalMargin> property.
  			 */
  def setVerticalMargin(verticalMargin: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.xOffset> property.
  			 */
  def setXOffset(xOffset: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.Notification.yOffset> property.
  			 */
  def setYOffset(yOffset: Double): Unit
  /**
  			 * Show the notification.
  			 */
  def show(): Unit
}

object Notification {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    duration: Double,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getDuration: () => Double,
    getGravity: () => Double,
    getHorizontalMargin: () => Double,
    getMessage: () => String,
    getVerticalMargin: () => Double,
    getXOffset: () => Double,
    getYOffset: () => Double,
    gravity: Double,
    horizontalMargin: Double,
    message: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setDuration: Double => Unit,
    setGravity: Double => Unit,
    setHorizontalMargin: Double => Unit,
    setMessage: String => Unit,
    setVerticalMargin: Double => Unit,
    setXOffset: Double => Unit,
    setYOffset: Double => Unit,
    show: () => Unit,
    verticalMargin: Double,
    xOffset: Double,
    yOffset: Double,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Notification = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, duration = duration, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDuration = js.Any.fromFunction0(getDuration), getGravity = js.Any.fromFunction0(getGravity), getHorizontalMargin = js.Any.fromFunction0(getHorizontalMargin), getMessage = js.Any.fromFunction0(getMessage), getVerticalMargin = js.Any.fromFunction0(getVerticalMargin), getXOffset = js.Any.fromFunction0(getXOffset), getYOffset = js.Any.fromFunction0(getYOffset), gravity = gravity, horizontalMargin = horizontalMargin, message = message, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDuration = js.Any.fromFunction1(setDuration), setGravity = js.Any.fromFunction1(setGravity), setHorizontalMargin = js.Any.fromFunction1(setHorizontalMargin), setMessage = js.Any.fromFunction1(setMessage), setVerticalMargin = js.Any.fromFunction1(setVerticalMargin), setXOffset = js.Any.fromFunction1(setXOffset), setYOffset = js.Any.fromFunction1(setYOffset), show = js.Any.fromFunction0(show), verticalMargin = verticalMargin, xOffset = xOffset, yOffset = yOffset)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Notification]
  }
}

