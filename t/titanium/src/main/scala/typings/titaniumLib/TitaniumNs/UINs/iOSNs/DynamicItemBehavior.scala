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
    addAngularVelocityForItem: js.Function2[js.Any, scala.Double, scala.Unit],
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    addItem: js.Function1[js.Any, scala.Unit],
    addLinearVelocityForItem: js.Function2[js.Any, titaniumLib.Point, scala.Unit],
    allowsRotation: scala.Boolean,
    angularResistance: scala.Double,
    angularVelocityForItem: js.Function1[js.Any, scala.Double],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    density: scala.Double,
    elasticity: scala.Double,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    friction: scala.Double,
    getAllowsRotation: js.Function0[scala.Boolean],
    getAngularResistance: js.Function0[scala.Double],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getDensity: js.Function0[scala.Double],
    getElasticity: js.Function0[scala.Double],
    getFriction: js.Function0[scala.Double],
    getItems: js.Function0[js.Array[titaniumLib.TitaniumNs.UINs.View]],
    getResistance: js.Function0[scala.Double],
    items: js.Array[titaniumLib.TitaniumNs.UINs.View],
    linearVelocityForItem: js.Function1[js.Any, titaniumLib.Point],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    removeItem: js.Function1[js.Any, scala.Unit],
    resistance: scala.Double,
    setAllowsRotation: js.Function1[scala.Boolean, scala.Unit],
    setAngularResistance: js.Function1[scala.Double, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setDensity: js.Function1[scala.Double, scala.Unit],
    setElasticity: js.Function1[scala.Double, scala.Unit],
    setFriction: js.Function1[scala.Double, scala.Unit],
    setResistance: js.Function1[scala.Double, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): DynamicItemBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAngularVelocityForItem")(addAngularVelocityForItem)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addItem")(addItem)
    __obj.updateDynamic("addLinearVelocityForItem")(addLinearVelocityForItem)
    __obj.updateDynamic("allowsRotation")(allowsRotation)
    __obj.updateDynamic("angularResistance")(angularResistance)
    __obj.updateDynamic("angularVelocityForItem")(angularVelocityForItem)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("density")(density)
    __obj.updateDynamic("elasticity")(elasticity)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("friction")(friction)
    __obj.updateDynamic("getAllowsRotation")(getAllowsRotation)
    __obj.updateDynamic("getAngularResistance")(getAngularResistance)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getDensity")(getDensity)
    __obj.updateDynamic("getElasticity")(getElasticity)
    __obj.updateDynamic("getFriction")(getFriction)
    __obj.updateDynamic("getItems")(getItems)
    __obj.updateDynamic("getResistance")(getResistance)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("linearVelocityForItem")(linearVelocityForItem)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeItem")(removeItem)
    __obj.updateDynamic("resistance")(resistance)
    __obj.updateDynamic("setAllowsRotation")(setAllowsRotation)
    __obj.updateDynamic("setAngularResistance")(setAngularResistance)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setDensity")(setDensity)
    __obj.updateDynamic("setElasticity")(setElasticity)
    __obj.updateDynamic("setFriction")(setFriction)
    __obj.updateDynamic("setResistance")(setResistance)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[DynamicItemBehavior]
  }
}

