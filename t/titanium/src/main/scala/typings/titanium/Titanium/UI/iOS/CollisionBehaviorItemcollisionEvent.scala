package typings.titanium.Titanium.UI.iOS

import typings.titanium.Point
import typings.titanium.Titanium.UI.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when two items collide.
  */
@js.native
trait CollisionBehaviorItemcollisionEvent extends CollisionBehaviorBaseEvent {
  
  /**
    * Item that collided with `item2`.
    */
  var item1: View = js.native
  
  /**
    * Item that collided with `item1`.
    */
  var item2: View = js.native
  
  /**
    * Point of the collision when it started. Only returned when `start` is `true`.
    */
  var point: Point = js.native
  
  /**
    * Returns `true` if the collision started else `false`.
    */
  var start: Boolean = js.native
}
object CollisionBehaviorItemcollisionEvent {
  
  @scala.inline
  def apply(item1: View, item2: View, point: Point, source: CollisionBehavior, start: Boolean): CollisionBehaviorItemcollisionEvent = {
    val __obj = js.Dynamic.literal(item1 = item1.asInstanceOf[js.Any], item2 = item2.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionBehaviorItemcollisionEvent]
  }
  
  @scala.inline
  implicit class CollisionBehaviorItemcollisionEventMutableBuilder[Self <: CollisionBehaviorItemcollisionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem1(value: View): Self = StObject.set(x, "item1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem2(value: View): Self = StObject.set(x, "item2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
