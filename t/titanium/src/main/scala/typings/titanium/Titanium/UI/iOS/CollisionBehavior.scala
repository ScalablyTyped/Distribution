package typings.titanium.Titanium.UI.iOS

import typings.titanium.BoundaryIdentifier
import typings.titanium.Padding
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.View
import typings.titanium.titaniumStrings.boundarycollision
import typings.titanium.titaniumStrings.itemcollision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamic behavior to support collisions between items and boundaries.
  */
@js.native
trait CollisionBehavior extends Proxy {
  
  /**
    * Adds a boundary to this behavior.
    */
  def addBoundary(boundary: BoundaryIdentifier): Unit = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_boundarycollision(
    name: boundarycollision,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ CollisionBehaviorBoundarycollisionEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemcollision(
    name: itemcollision,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ CollisionBehaviorItemcollisionEvent, Unit]
  ): Unit = js.native
  
  /**
    * Adds an item to this behavior.
    */
  def addItem(item: View): Unit = js.native
  
  /**
    * Boundary identfiers added to this behavior.
    */
  val boundaryIdentifiers: js.Array[BoundaryIdentifier] = js.native
  
  /**
    * Specifies the collision behavior.
    */
  var collisionMode: Double = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_boundarycollision(name: boundarycollision): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_boundarycollision(name: boundarycollision, event: CollisionBehaviorBoundarycollisionEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_itemcollision(name: itemcollision): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_itemcollision(name: itemcollision, event: CollisionBehaviorItemcollisionEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.boundaryIdentifiers> property.
    * @deprecated Access <Titanium.UI.iOS.CollisionBehavior.boundaryIdentifiers> instead.
    */
  def getBoundaryIdentifiers(): js.Array[BoundaryIdentifier] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.collisionMode> property.
    * @deprecated Access <Titanium.UI.iOS.CollisionBehavior.collisionMode> instead.
    */
  def getCollisionMode(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.items> property.
    * @deprecated Access <Titanium.UI.iOS.CollisionBehavior.items> instead.
    */
  def getItems(): js.Array[View] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.referenceInsets> property.
    * @deprecated Access <Titanium.UI.iOS.CollisionBehavior.referenceInsets> instead.
    */
  def getReferenceInsets(): Padding = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.CollisionBehavior.treatReferenceAsBoundary> property.
    * @deprecated Access <Titanium.UI.iOS.CollisionBehavior.treatReferenceAsBoundary> instead.
    */
  def getTreatReferenceAsBoundary(): Boolean = js.native
  
  /**
    * Items added to this behavior.
    */
  val items: js.Array[View] = js.native
  
  /**
    * Insets to apply when using the animator's reference view as the boundary.
    */
  var referenceInsets: Padding = js.native
  
  /**
    * Removes all boundaries from this behavior.
    */
  def removeAllBoundaries(): Unit = js.native
  
  /**
    * Removes the specified boundary from this behavior.
    */
  def removeBoundary(boundary: BoundaryIdentifier): Unit = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_boundarycollision(
    name: boundarycollision,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ CollisionBehaviorBoundarycollisionEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_itemcollision(
    name: itemcollision,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ CollisionBehaviorItemcollisionEvent, Unit]
  ): Unit = js.native
  
  /**
    * Removes the specified item from this behavior.
    */
  def removeItem(item: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.CollisionBehavior.collisionMode> property.
    * @deprecated Set the value using <Titanium.UI.iOS.CollisionBehavior.collisionMode> instead.
    */
  def setCollisionMode(collisionMode: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.CollisionBehavior.referenceInsets> property.
    * @deprecated Set the value using <Titanium.UI.iOS.CollisionBehavior.referenceInsets> instead.
    */
  def setReferenceInsets(referenceInsets: Padding): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.CollisionBehavior.treatReferenceAsBoundary> property.
    * @deprecated Set the value using <Titanium.UI.iOS.CollisionBehavior.treatReferenceAsBoundary> instead.
    */
  def setTreatReferenceAsBoundary(treatReferenceAsBoundary: Boolean): Unit = js.native
  
  /**
    * Use the animator's reference view as the boundary.
    */
  var treatReferenceAsBoundary: Boolean = js.native
}
