package typings.titanium.Titanium.UI.iOS

import typings.titanium.Point
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base dynamic configuration for an item.
  */
@js.native
trait DynamicItemBehavior extends Proxy {
  
  /**
    * Adds a specified angular velocity for the item.
    */
  def addAngularVelocityForItem(item: View, velocity: Double): Unit = js.native
  
  /**
    * Adds an item to this behavior.
    */
  def addItem(item: View): Unit = js.native
  
  /**
    * Adds a specified linear velocity for the item.
    */
  def addLinearVelocityForItem(item: View, velocity: Point): Unit = js.native
  
  /**
    * Specifies if this item can rotate.
    */
  var allowsRotation: Boolean = js.native
  
  /**
    * Specifies the angular resistance of this item.
    */
  var angularResistance: Double = js.native
  
  /**
    * Returns the angular velocity of the item.
    */
  def angularVelocityForItem(item: View): Double = js.native
  
  /**
    * Specifies the relative mass density of this item.
    */
  var density: Double = js.native
  
  /**
    * Specifies the elasticity applied to collisions for this item.
    */
  var elasticity: Double = js.native
  
  /**
    * Specifies the linear resistance of the item when it slides against another item.
    */
  var friction: Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.allowsRotation> property.
    * @deprecated Access <Titanium.UI.iOS.DynamicItemBehavior.allowsRotation> instead.
    */
  def getAllowsRotation(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.angularResistance> property.
    * @deprecated Access <Titanium.UI.iOS.DynamicItemBehavior.angularResistance> instead.
    */
  def getAngularResistance(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.density> property.
    * @deprecated Access <Titanium.UI.iOS.DynamicItemBehavior.density> instead.
    */
  def getDensity(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.elasticity> property.
    * @deprecated Access <Titanium.UI.iOS.DynamicItemBehavior.elasticity> instead.
    */
  def getElasticity(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.friction> property.
    * @deprecated Access <Titanium.UI.iOS.DynamicItemBehavior.friction> instead.
    */
  def getFriction(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.items> property.
    * @deprecated Access <Titanium.UI.iOS.DynamicItemBehavior.items> instead.
    */
  def getItems(): js.Array[View] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.DynamicItemBehavior.resistance> property.
    * @deprecated Access <Titanium.UI.iOS.DynamicItemBehavior.resistance> instead.
    */
  def getResistance(): Double = js.native
  
  /**
    * Items added to this behavior.
    */
  val items: js.Array[View] = js.native
  
  /**
    * Returns the linear velocity of the item.
    */
  def linearVelocityForItem(item: View): Point = js.native
  
  /**
    * Removes the specified item from this behavior.
    */
  def removeItem(item: View): Unit = js.native
  
  /**
    * Specifies the linear resistance of this item which reduces linear velocity over time.
    */
  var resistance: Double = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.allowsRotation> property.
    * @deprecated Set the value using <Titanium.UI.iOS.DynamicItemBehavior.allowsRotation> instead.
    */
  def setAllowsRotation(allowsRotation: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.angularResistance> property.
    * @deprecated Set the value using <Titanium.UI.iOS.DynamicItemBehavior.angularResistance> instead.
    */
  def setAngularResistance(angularResistance: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.density> property.
    * @deprecated Set the value using <Titanium.UI.iOS.DynamicItemBehavior.density> instead.
    */
  def setDensity(density: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.elasticity> property.
    * @deprecated Set the value using <Titanium.UI.iOS.DynamicItemBehavior.elasticity> instead.
    */
  def setElasticity(elasticity: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.friction> property.
    * @deprecated Set the value using <Titanium.UI.iOS.DynamicItemBehavior.friction> instead.
    */
  def setFriction(friction: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.DynamicItemBehavior.resistance> property.
    * @deprecated Set the value using <Titanium.UI.iOS.DynamicItemBehavior.resistance> instead.
    */
  def setResistance(resistance: Double): Unit = js.native
}
