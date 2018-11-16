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

