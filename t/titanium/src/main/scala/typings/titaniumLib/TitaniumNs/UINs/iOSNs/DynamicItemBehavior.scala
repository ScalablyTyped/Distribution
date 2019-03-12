package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Base dynamic configuration for an item.
			 */
trait DynamicItemBehavior
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Specifies if this item can rotate.
  				 */
  var allowsRotation: scala.Boolean
  /**
  				 * Specifies the angular resistance of this item.
  				 */
  var angularResistance: scala.Double
  /**
  				 * Specifies the relative mass density of this item.
  				 */
  var density: scala.Double
  /**
  				 * Specifies the elasticity applied to collisions for this item.
  				 */
  var elasticity: scala.Double
  /**
  				 * Specifies the linear resistance of the item when it slides against another item.
  				 */
  var friction: scala.Double
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[titaniumLib.TitaniumNs.UINs.View]
  /**
  				 * Specifies the linear resistance of this item which reduces linear velocity over time.
  				 */
  var resistance: scala.Double
  /**
  				 * Adds a specified angular velocity for the item.
  				 */
  def addAngularVelocityForItem(item: js.Any, velocity: scala.Double): scala.Unit
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): scala.Unit
  /**
  				 * Adds a specified linear velocity for the item.
  				 */
  def addLinearVelocityForItem(item: js.Any, velocity: titaniumLib.Point): scala.Unit
  /**
  				 * Returns the angular velocity of the item.
  				 */
  def angularVelocityForItem(item: js.Any): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.allowsRotation> property.
  				 */
  def getAllowsRotation(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.angularResistance> property.
  				 */
  def getAngularResistance(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.density> property.
  				 */
  def getDensity(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.elasticity> property.
  				 */
  def getElasticity(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.friction> property.
  				 */
  def getFriction(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.items> property.
  				 */
  def getItems(): js.Array[titaniumLib.TitaniumNs.UINs.View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.resistance> property.
  				 */
  def getResistance(): scala.Double
  /**
  				 * Returns the linear velocity of the item.
  				 */
  def linearVelocityForItem(item: js.Any): titaniumLib.Point
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.allowsRotation> property.
  				 */
  def setAllowsRotation(allowsRotation: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.angularResistance> property.
  				 */
  def setAngularResistance(angularResistance: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.density> property.
  				 */
  def setDensity(density: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.elasticity> property.
  				 */
  def setElasticity(elasticity: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.friction> property.
  				 */
  def setFriction(friction: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.resistance> property.
  				 */
  def setResistance(resistance: scala.Double): scala.Unit
}

object DynamicItemBehavior {
  @scala.inline
  def apply(
    addAngularVelocityForItem: (js.Any, scala.Double) => scala.Unit,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    addItem: js.Any => scala.Unit,
    addLinearVelocityForItem: (js.Any, titaniumLib.Point) => scala.Unit,
    allowsRotation: scala.Boolean,
    angularResistance: scala.Double,
    angularVelocityForItem: js.Any => scala.Double,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    density: scala.Double,
    elasticity: scala.Double,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    friction: scala.Double,
    getAllowsRotation: () => scala.Boolean,
    getAngularResistance: () => scala.Double,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getDensity: () => scala.Double,
    getElasticity: () => scala.Double,
    getFriction: () => scala.Double,
    getItems: () => js.Array[titaniumLib.TitaniumNs.UINs.View],
    getResistance: () => scala.Double,
    items: js.Array[titaniumLib.TitaniumNs.UINs.View],
    linearVelocityForItem: js.Any => titaniumLib.Point,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    removeItem: js.Any => scala.Unit,
    resistance: scala.Double,
    setAllowsRotation: scala.Boolean => scala.Unit,
    setAngularResistance: scala.Double => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setDensity: scala.Double => scala.Unit,
    setElasticity: scala.Double => scala.Unit,
    setFriction: scala.Double => scala.Unit,
    setResistance: scala.Double => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): DynamicItemBehavior = {
    val __obj = js.Dynamic.literal(addAngularVelocityForItem = js.Any.fromFunction2(addAngularVelocityForItem), addEventListener = js.Any.fromFunction2(addEventListener), addItem = js.Any.fromFunction1(addItem), addLinearVelocityForItem = js.Any.fromFunction2(addLinearVelocityForItem), allowsRotation = allowsRotation, angularResistance = angularResistance, angularVelocityForItem = js.Any.fromFunction1(angularVelocityForItem), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, density = density, elasticity = elasticity, fireEvent = js.Any.fromFunction2(fireEvent), friction = friction, getAllowsRotation = js.Any.fromFunction0(getAllowsRotation), getAngularResistance = js.Any.fromFunction0(getAngularResistance), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDensity = js.Any.fromFunction0(getDensity), getElasticity = js.Any.fromFunction0(getElasticity), getFriction = js.Any.fromFunction0(getFriction), getItems = js.Any.fromFunction0(getItems), getResistance = js.Any.fromFunction0(getResistance), items = items, linearVelocityForItem = js.Any.fromFunction1(linearVelocityForItem), removeEventListener = js.Any.fromFunction2(removeEventListener), removeItem = js.Any.fromFunction1(removeItem), resistance = resistance, setAllowsRotation = js.Any.fromFunction1(setAllowsRotation), setAngularResistance = js.Any.fromFunction1(setAngularResistance), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDensity = js.Any.fromFunction1(setDensity), setElasticity = js.Any.fromFunction1(setElasticity), setFriction = js.Any.fromFunction1(setFriction), setResistance = js.Any.fromFunction1(setResistance))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[DynamicItemBehavior]
  }
}

