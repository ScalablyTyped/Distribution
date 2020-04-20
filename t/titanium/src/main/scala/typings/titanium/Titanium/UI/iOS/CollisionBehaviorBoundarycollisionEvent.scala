package typings.titanium.Titanium.UI.iOS

import typings.titanium.Point
import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when an item collides with a boundary.
			 */
trait CollisionBehaviorBoundarycollisionEvent extends CollisionBehaviorBaseEvent {
  /**
  				 * Identifier of the boundary the item collided with.
  				 */
  var identifier: String
  /**
  				 * Item that collided with the boundary.
  				 */
  var item: View
  /**
  				 * Point of the collision when it started. Only returned when `start` is `true`.
  				 */
  var point: Point
  /**
  				 * Returns `true` if the collision started else `false`.
  				 */
  var start: Boolean
}

object CollisionBehaviorBoundarycollisionEvent {
  @scala.inline
  def apply(identifier: String, item: View, point: Point, source: CollisionBehavior, start: Boolean): CollisionBehaviorBoundarycollisionEvent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionBehaviorBoundarycollisionEvent]
  }
}

