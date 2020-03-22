package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssigned extends js.Object {
  var active: Double
  var assigned: Double
  var moving: Double
}

object AnonAssigned {
  @scala.inline
  def apply(active: Double, assigned: Double, moving: Double): AnonAssigned = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], assigned = assigned.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssigned]
  }
}

