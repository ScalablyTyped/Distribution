package typings.titanium.Titanium.UI.iOS

import typings.titanium.Point
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.View
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Gravitational force to apply to an item.
			 */
trait GravityBehavior extends Proxy {
  /**
  				 * Specifies the angle of the gravity vector in radians.
  				 */
  var angle: Double
  /**
  				 * Specifies the direction of the gravity vector as an x, y pair.
  				 */
  var gravityDirection: Point
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[View]
  /**
  				 * Specifies the magnitude of the gravity vector.
  				 */
  var magnitude: Double
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.angle> property.
  				 */
  def getAngle(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.gravityDirection> property.
  				 */
  def getGravityDirection(): Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.items> property.
  				 */
  def getItems(): js.Array[View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.magnitude> property.
  				 */
  def getMagnitude(): Double
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.GravityBehavior.angle> property.
  				 */
  def setAngle(angle: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.GravityBehavior.gravityDirection> property.
  				 */
  def setGravityDirection(gravityDirection: Point): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.GravityBehavior.magnitude> property.
  				 */
  def setMagnitude(magnitude: Double): Unit
}

object GravityBehavior {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    addItem: js.Any => Unit,
    angle: Double,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getAngle: () => Double,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getGravityDirection: () => Point,
    getItems: () => js.Array[View],
    getMagnitude: () => Double,
    gravityDirection: Point,
    items: js.Array[View],
    magnitude: Double,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    removeItem: js.Any => Unit,
    setAngle: Double => Unit,
    setBubbleParent: Boolean => Unit,
    setGravityDirection: Point => Unit,
    setMagnitude: Double => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): GravityBehavior = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), addItem = js.Any.fromFunction1(addItem), angle = angle, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getAngle = js.Any.fromFunction0(getAngle), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getGravityDirection = js.Any.fromFunction0(getGravityDirection), getItems = js.Any.fromFunction0(getItems), getMagnitude = js.Any.fromFunction0(getMagnitude), gravityDirection = gravityDirection, items = items, magnitude = magnitude, removeEventListener = js.Any.fromFunction2(removeEventListener), removeItem = js.Any.fromFunction1(removeItem), setAngle = js.Any.fromFunction1(setAngle), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setGravityDirection = js.Any.fromFunction1(setGravityDirection), setMagnitude = js.Any.fromFunction1(setMagnitude))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[GravityBehavior]
  }
}

