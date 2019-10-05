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
			 * Base dynamic configuration for an item.
			 */
trait DynamicItemBehavior extends Proxy {
  /**
  				 * Specifies if this item can rotate.
  				 */
  var allowsRotation: Boolean
  /**
  				 * Specifies the angular resistance of this item.
  				 */
  var angularResistance: Double
  /**
  				 * Specifies the relative mass density of this item.
  				 */
  var density: Double
  /**
  				 * Specifies the elasticity applied to collisions for this item.
  				 */
  var elasticity: Double
  /**
  				 * Specifies the linear resistance of the item when it slides against another item.
  				 */
  var friction: Double
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[View]
  /**
  				 * Specifies the linear resistance of this item which reduces linear velocity over time.
  				 */
  var resistance: Double
  /**
  				 * Adds a specified angular velocity for the item.
  				 */
  def addAngularVelocityForItem(item: js.Any, velocity: Double): Unit
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): Unit
  /**
  				 * Adds a specified linear velocity for the item.
  				 */
  def addLinearVelocityForItem(item: js.Any, velocity: Point): Unit
  /**
  				 * Returns the angular velocity of the item.
  				 */
  def angularVelocityForItem(item: js.Any): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.allowsRotation> property.
  				 */
  def getAllowsRotation(): Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.angularResistance> property.
  				 */
  def getAngularResistance(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.density> property.
  				 */
  def getDensity(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.elasticity> property.
  				 */
  def getElasticity(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.friction> property.
  				 */
  def getFriction(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.items> property.
  				 */
  def getItems(): js.Array[View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.resistance> property.
  				 */
  def getResistance(): Double
  /**
  				 * Returns the linear velocity of the item.
  				 */
  def linearVelocityForItem(item: js.Any): Point
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.allowsRotation> property.
  				 */
  def setAllowsRotation(allowsRotation: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.angularResistance> property.
  				 */
  def setAngularResistance(angularResistance: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.density> property.
  				 */
  def setDensity(density: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.elasticity> property.
  				 */
  def setElasticity(elasticity: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.friction> property.
  				 */
  def setFriction(friction: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.resistance> property.
  				 */
  def setResistance(resistance: Double): Unit
}

object DynamicItemBehavior {
  @scala.inline
  def apply(
    addAngularVelocityForItem: (js.Any, Double) => Unit,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    addItem: js.Any => Unit,
    addLinearVelocityForItem: (js.Any, Point) => Unit,
    allowsRotation: Boolean,
    angularResistance: Double,
    angularVelocityForItem: js.Any => Double,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    density: Double,
    elasticity: Double,
    fireEvent: (String, js.Any) => Unit,
    friction: Double,
    getAllowsRotation: () => Boolean,
    getAngularResistance: () => Double,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getDensity: () => Double,
    getElasticity: () => Double,
    getFriction: () => Double,
    getItems: () => js.Array[View],
    getResistance: () => Double,
    items: js.Array[View],
    linearVelocityForItem: js.Any => Point,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    removeItem: js.Any => Unit,
    resistance: Double,
    setAllowsRotation: Boolean => Unit,
    setAngularResistance: Double => Unit,
    setBubbleParent: Boolean => Unit,
    setDensity: Double => Unit,
    setElasticity: Double => Unit,
    setFriction: Double => Unit,
    setResistance: Double => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): DynamicItemBehavior = {
    val __obj = js.Dynamic.literal(addAngularVelocityForItem = js.Any.fromFunction2(addAngularVelocityForItem), addEventListener = js.Any.fromFunction2(addEventListener), addItem = js.Any.fromFunction1(addItem), addLinearVelocityForItem = js.Any.fromFunction2(addLinearVelocityForItem), allowsRotation = allowsRotation, angularResistance = angularResistance, angularVelocityForItem = js.Any.fromFunction1(angularVelocityForItem), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, density = density, elasticity = elasticity, fireEvent = js.Any.fromFunction2(fireEvent), friction = friction, getAllowsRotation = js.Any.fromFunction0(getAllowsRotation), getAngularResistance = js.Any.fromFunction0(getAngularResistance), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDensity = js.Any.fromFunction0(getDensity), getElasticity = js.Any.fromFunction0(getElasticity), getFriction = js.Any.fromFunction0(getFriction), getItems = js.Any.fromFunction0(getItems), getResistance = js.Any.fromFunction0(getResistance), items = items, linearVelocityForItem = js.Any.fromFunction1(linearVelocityForItem), removeEventListener = js.Any.fromFunction2(removeEventListener), removeItem = js.Any.fromFunction1(removeItem), resistance = resistance, setAllowsRotation = js.Any.fromFunction1(setAllowsRotation), setAngularResistance = js.Any.fromFunction1(setAngularResistance), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDensity = js.Any.fromFunction1(setDensity), setElasticity = js.Any.fromFunction1(setElasticity), setFriction = js.Any.fromFunction1(setFriction), setResistance = js.Any.fromFunction1(setResistance))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[DynamicItemBehavior]
  }
}

