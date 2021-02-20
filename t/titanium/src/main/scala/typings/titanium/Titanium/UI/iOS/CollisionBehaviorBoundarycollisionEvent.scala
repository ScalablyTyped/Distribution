package typings.titanium.Titanium.UI.iOS

import typings.titanium.Point
import typings.titanium.Titanium.UI.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when an item collides with a boundary.
  */
@js.native
trait CollisionBehaviorBoundarycollisionEvent extends CollisionBehaviorBaseEvent {
  
  /**
    * Identifier of the boundary the item collided with.
    */
  var identifier: String = js.native
  
  /**
    * Item that collided with the boundary.
    */
  var item: View = js.native
  
  /**
    * Point of the collision when it started. Only returned when `start` is `true`.
    */
  var point: Point = js.native
  
  /**
    * Returns `true` if the collision started else `false`.
    */
  var start: Boolean = js.native
}
object CollisionBehaviorBoundarycollisionEvent {
  
  @scala.inline
  def apply(identifier: String, item: View, point: Point, source: CollisionBehavior, start: Boolean): CollisionBehaviorBoundarycollisionEvent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionBehaviorBoundarycollisionEvent]
  }
  
  @scala.inline
  implicit class CollisionBehaviorBoundarycollisionEventMutableBuilder[Self <: CollisionBehaviorBoundarycollisionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: View): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
