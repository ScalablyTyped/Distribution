package typings.titanium.TitaniumNs.UINs.iOSNs

import typings.titanium.Point
import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.View
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Continuous or instantaneous force to apply to an item.
			 */
trait PushBehavior extends Proxy {
  /**
  				 * State of the push behavior's force.
  				 */
  var active: Boolean
  /**
  				 * Specifies the angle of the force vector in radians.
  				 */
  var angle: Double
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[View]
  /**
  				 * Specifies the magnitude of the force vector.
  				 */
  var magnitude: Double
  /**
  				 * Specifies the direction of the force vector as an x, y pair.
  				 */
  var pushDirection: Point
  /**
  				 * Specifies the push mode.
  				 */
  var pushMode: Double
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.active> property.
  				 */
  def getActive(): Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.angle> property.
  				 */
  def getAngle(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.items> property.
  				 */
  def getItems(): js.Array[View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.magnitude> property.
  				 */
  def getMagnitude(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.pushDirection> property.
  				 */
  def getPushDirection(): Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.pushMode> property.
  				 */
  def getPushMode(): Double
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.active> property.
  				 */
  def setActive(active: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.angle> property.
  				 */
  def setAngle(angle: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.magnitude> property.
  				 */
  def setMagnitude(magnitude: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.pushDirection> property.
  				 */
  def setPushDirection(pushDirection: Point): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.pushMode> property.
  				 */
  def setPushMode(pushMode: Double): Unit
}

object PushBehavior {
  @scala.inline
  def apply(
    active: Boolean,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    addItem: js.Any => Unit,
    angle: Double,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getActive: () => Boolean,
    getAngle: () => Double,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getItems: () => js.Array[View],
    getMagnitude: () => Double,
    getPushDirection: () => Point,
    getPushMode: () => Double,
    items: js.Array[View],
    magnitude: Double,
    pushDirection: Point,
    pushMode: Double,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    removeItem: js.Any => Unit,
    setActive: Boolean => Unit,
    setAngle: Double => Unit,
    setBubbleParent: Boolean => Unit,
    setMagnitude: Double => Unit,
    setPushDirection: Point => Unit,
    setPushMode: Double => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): PushBehavior = {
    val __obj = js.Dynamic.literal(active = active, addEventListener = js.Any.fromFunction2(addEventListener), addItem = js.Any.fromFunction1(addItem), angle = angle, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getActive = js.Any.fromFunction0(getActive), getAngle = js.Any.fromFunction0(getAngle), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getItems = js.Any.fromFunction0(getItems), getMagnitude = js.Any.fromFunction0(getMagnitude), getPushDirection = js.Any.fromFunction0(getPushDirection), getPushMode = js.Any.fromFunction0(getPushMode), items = items, magnitude = magnitude, pushDirection = pushDirection, pushMode = pushMode, removeEventListener = js.Any.fromFunction2(removeEventListener), removeItem = js.Any.fromFunction1(removeItem), setActive = js.Any.fromFunction1(setActive), setAngle = js.Any.fromFunction1(setAngle), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setMagnitude = js.Any.fromFunction1(setMagnitude), setPushDirection = js.Any.fromFunction1(setPushDirection), setPushMode = js.Any.fromFunction1(setPushMode))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[PushBehavior]
  }
}

