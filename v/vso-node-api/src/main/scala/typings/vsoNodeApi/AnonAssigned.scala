package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssigned extends js.Object {
  var assigned: Double
  var inherited: Double
}

object AnonAssigned {
  @scala.inline
  def apply(assigned: Double, inherited: Double): AnonAssigned = {
    val __obj = js.Dynamic.literal(assigned = assigned.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssigned]
  }
}

