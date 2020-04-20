package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollisionBehaviorEventMap extends ProxyEventMap {
  var boundarycollision: CollisionBehaviorBoundarycollisionEvent
  var itemcollision: CollisionBehaviorItemcollisionEvent
}

object CollisionBehaviorEventMap {
  @scala.inline
  def apply(
    boundarycollision: CollisionBehaviorBoundarycollisionEvent,
    itemcollision: CollisionBehaviorItemcollisionEvent
  ): CollisionBehaviorEventMap = {
    val __obj = js.Dynamic.literal(boundarycollision = boundarycollision.asInstanceOf[js.Any], itemcollision = itemcollision.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionBehaviorEventMap]
  }
}

