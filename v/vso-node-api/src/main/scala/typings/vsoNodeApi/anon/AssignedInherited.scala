package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignedInherited extends js.Object {
  var assigned: scala.Double
  var inherited: scala.Double
}

object AssignedInherited {
  @scala.inline
  def apply(assigned: scala.Double, inherited: scala.Double): AssignedInherited = {
    val __obj = js.Dynamic.literal(assigned = assigned.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignedInherited]
  }
}

