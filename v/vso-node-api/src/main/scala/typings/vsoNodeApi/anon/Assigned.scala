package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assigned extends js.Object {
  var active: scala.Double
  var assigned: scala.Double
  var moving: scala.Double
}

object Assigned {
  @scala.inline
  def apply(active: scala.Double, assigned: scala.Double, moving: scala.Double): Assigned = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], assigned = assigned.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assigned]
  }
}

