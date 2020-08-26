package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollisionBehaviorEventMap extends ProxyEventMap {
  var boundarycollision: CollisionBehaviorBoundarycollisionEvent = js.native
  var itemcollision: CollisionBehaviorItemcollisionEvent = js.native
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
  @scala.inline
  implicit class CollisionBehaviorEventMapOps[Self <: CollisionBehaviorEventMap] (val x: Self) extends AnyVal {
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
    def setBoundarycollision(value: CollisionBehaviorBoundarycollisionEvent): Self = this.set("boundarycollision", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemcollision(value: CollisionBehaviorItemcollisionEvent): Self = this.set("itemcollision", value.asInstanceOf[js.Any])
  }
  
}

