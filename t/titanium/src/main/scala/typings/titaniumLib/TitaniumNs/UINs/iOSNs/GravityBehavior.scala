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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    addItem: js.Function1[js.Any, scala.Unit],
    angle: scala.Double,
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getAngle: js.Function0[scala.Double],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getGravityDirection: js.Function0[titaniumLib.Point],
    getItems: js.Function0[js.Array[titaniumLib.TitaniumNs.UINs.View]],
    getMagnitude: js.Function0[scala.Double],
    gravityDirection: titaniumLib.Point,
    items: js.Array[titaniumLib.TitaniumNs.UINs.View],
    magnitude: scala.Double,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    removeItem: js.Function1[js.Any, scala.Unit],
    setAngle: js.Function1[scala.Double, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setGravityDirection: js.Function1[titaniumLib.Point, scala.Unit],
    setMagnitude: js.Function1[scala.Double, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): GravityBehavior = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, addItem = addItem, angle = angle, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getAngle = getAngle, getApiName = getApiName, getBubbleParent = getBubbleParent, getGravityDirection = getGravityDirection, getItems = getItems, getMagnitude = getMagnitude, gravityDirection = gravityDirection, items = items, magnitude = magnitude, removeEventListener = removeEventListener, removeItem = removeItem, setAngle = setAngle, setBubbleParent = setBubbleParent, setGravityDirection = setGravityDirection, setMagnitude = setMagnitude)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[GravityBehavior]
  }
}

