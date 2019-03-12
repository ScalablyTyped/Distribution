package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Gravitational force to apply to an item.
			 */
trait GravityBehavior
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Specifies the angle of the gravity vector in radians.
  				 */
  var angle: scala.Double
  /**
  				 * Specifies the direction of the gravity vector as an x, y pair.
  				 */
  var gravityDirection: titaniumLib.Point
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[titaniumLib.TitaniumNs.UINs.View]
  /**
  				 * Specifies the magnitude of the gravity vector.
  				 */
  var magnitude: scala.Double
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): scala.Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.angle> property.
  				 */
  def getAngle(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.gravityDirection> property.
  				 */
  def getGravityDirection(): titaniumLib.Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.items> property.
  				 */
  def getItems(): js.Array[titaniumLib.TitaniumNs.UINs.View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.GravityBehavior.magnitude> property.
  				 */
  def getMagnitude(): scala.Double
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.GravityBehavior.angle> property.
  				 */
  def setAngle(angle: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.GravityBehavior.gravityDirection> property.
  				 */
  def setGravityDirection(gravityDirection: titaniumLib.Point): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.GravityBehavior.magnitude> property.
  				 */
  def setMagnitude(magnitude: scala.Double): scala.Unit
}

object GravityBehavior {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    addItem: js.Any => scala.Unit,
    angle: scala.Double,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getAngle: () => scala.Double,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getGravityDirection: () => titaniumLib.Point,
    getItems: () => js.Array[titaniumLib.TitaniumNs.UINs.View],
    getMagnitude: () => scala.Double,
    gravityDirection: titaniumLib.Point,
    items: js.Array[titaniumLib.TitaniumNs.UINs.View],
    magnitude: scala.Double,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    removeItem: js.Any => scala.Unit,
    setAngle: scala.Double => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setGravityDirection: titaniumLib.Point => scala.Unit,
    setMagnitude: scala.Double => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): GravityBehavior = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), addItem = js.Any.fromFunction1(addItem), angle = angle, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getAngle = js.Any.fromFunction0(getAngle), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getGravityDirection = js.Any.fromFunction0(getGravityDirection), getItems = js.Any.fromFunction0(getItems), getMagnitude = js.Any.fromFunction0(getMagnitude), gravityDirection = gravityDirection, items = items, magnitude = magnitude, removeEventListener = js.Any.fromFunction2(removeEventListener), removeItem = js.Any.fromFunction1(removeItem), setAngle = js.Any.fromFunction1(setAngle), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setGravityDirection = js.Any.fromFunction1(setGravityDirection), setMagnitude = js.Any.fromFunction1(setMagnitude))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[GravityBehavior]
  }
}

