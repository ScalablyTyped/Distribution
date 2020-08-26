package typings.titanium.Titanium.UI.iOS

import typings.titanium.Point
import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class CollisionBehaviorItemcollisionEventOps[Self <: CollisionBehaviorItemcollisionEvent] (val x: Self) extends AnyVal {
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
    def setItem1(value: View): Self = this.set("item1", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem2(value: View): Self = this.set("item2", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Boolean): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

