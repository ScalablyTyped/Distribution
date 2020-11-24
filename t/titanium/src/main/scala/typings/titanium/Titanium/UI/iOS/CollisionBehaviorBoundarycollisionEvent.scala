package typings.titanium.Titanium.UI.iOS

import typings.titanium.Point
import typings.titanium.Titanium.UI.View
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
  implicit class CollisionBehaviorBoundarycollisionEventOps[Self <: CollisionBehaviorBoundarycollisionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: View): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Boolean): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
