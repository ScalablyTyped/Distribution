package typings.titanium.Titanium.UI.iOS

import typings.titanium.Point
import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when two items collide.
			 */
trait CollisionBehaviorItemcollisionEvent extends CollisionBehaviorBaseEvent {
  /**
  				 * Item that collided with `item2`.
  				 */
  var item1: View
  /**
  				 * Item that collided with `item1`.
  				 */
  var item2: View
  /**
  				 * Point of the collision when it started. Only returned when `start` is `true`.
  				 */
  var point: Point
  /**
  				 * Returns `true` if the collision started else `false`.
  				 */
  var start: Boolean
}

object CollisionBehaviorItemcollisionEvent {
  @scala.inline
  def apply(item1: View, item2: View, point: Point, source: CollisionBehavior, start: Boolean): CollisionBehaviorItemcollisionEvent = {
    val __obj = js.Dynamic.literal(item1 = item1.asInstanceOf[js.Any], item2 = item2.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionBehaviorItemcollisionEvent]
  }
}

