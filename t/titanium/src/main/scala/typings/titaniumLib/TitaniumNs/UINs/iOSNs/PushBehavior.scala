package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Continuous or instantaneous force to apply to an item.
			 */
trait PushBehavior
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * State of the push behavior's force.
  				 */
  var active: scala.Boolean
  /**
  				 * Specifies the angle of the force vector in radians.
  				 */
  var angle: scala.Double
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[titaniumLib.TitaniumNs.UINs.View]
  /**
  				 * Specifies the magnitude of the force vector.
  				 */
  var magnitude: scala.Double
  /**
  				 * Specifies the direction of the force vector as an x, y pair.
  				 */
  var pushDirection: titaniumLib.Point
  /**
  				 * Specifies the push mode.
  				 */
  var pushMode: scala.Double
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): scala.Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.active> property.
  				 */
  def getActive(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.angle> property.
  				 */
  def getAngle(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.items> property.
  				 */
  def getItems(): js.Array[titaniumLib.TitaniumNs.UINs.View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.magnitude> property.
  				 */
  def getMagnitude(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.pushDirection> property.
  				 */
  def getPushDirection(): titaniumLib.Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.pushMode> property.
  				 */
  def getPushMode(): scala.Double
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.active> property.
  				 */
  def setActive(active: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.angle> property.
  				 */
  def setAngle(angle: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.magnitude> property.
  				 */
  def setMagnitude(magnitude: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.pushDirection> property.
  				 */
  def setPushDirection(pushDirection: titaniumLib.Point): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.pushMode> property.
  				 */
  def setPushMode(pushMode: scala.Double): scala.Unit
}

object PushBehavior {
  @scala.inline
  def apply(
    active: scala.Boolean,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    addItem: js.Any => scala.Unit,
    angle: scala.Double,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getActive: () => scala.Boolean,
    getAngle: () => scala.Double,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getItems: () => js.Array[titaniumLib.TitaniumNs.UINs.View],
    getMagnitude: () => scala.Double,
    getPushDirection: () => titaniumLib.Point,
    getPushMode: () => scala.Double,
    items: js.Array[titaniumLib.TitaniumNs.UINs.View],
    magnitude: scala.Double,
    pushDirection: titaniumLib.Point,
    pushMode: scala.Double,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    removeItem: js.Any => scala.Unit,
    setActive: scala.Boolean => scala.Unit,
    setAngle: scala.Double => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setMagnitude: scala.Double => scala.Unit,
    setPushDirection: titaniumLib.Point => scala.Unit,
    setPushMode: scala.Double => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): PushBehavior = {
    val __obj = js.Dynamic.literal(active = active, addEventListener = js.Any.fromFunction2(addEventListener), addItem = js.Any.fromFunction1(addItem), angle = angle, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getActive = js.Any.fromFunction0(getActive), getAngle = js.Any.fromFunction0(getAngle), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getItems = js.Any.fromFunction0(getItems), getMagnitude = js.Any.fromFunction0(getMagnitude), getPushDirection = js.Any.fromFunction0(getPushDirection), getPushMode = js.Any.fromFunction0(getPushMode), items = items, magnitude = magnitude, pushDirection = pushDirection, pushMode = pushMode, removeEventListener = js.Any.fromFunction2(removeEventListener), removeItem = js.Any.fromFunction1(removeItem), setActive = js.Any.fromFunction1(setActive), setAngle = js.Any.fromFunction1(setAngle), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setMagnitude = js.Any.fromFunction1(setMagnitude), setPushDirection = js.Any.fromFunction1(setPushDirection), setPushMode = js.Any.fromFunction1(setPushMode))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[PushBehavior]
  }
}

