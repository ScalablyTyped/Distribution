package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPickSourceAction extends js.Object {
  var pickSourceAction: Double
  var pickTargetAction: Double
  var undecided: Double
}

object AnonPickSourceAction {
  @scala.inline
  def apply(pickSourceAction: Double, pickTargetAction: Double, undecided: Double): AnonPickSourceAction = {
    val __obj = js.Dynamic.literal(pickSourceAction = pickSourceAction.asInstanceOf[js.Any], pickTargetAction = pickTargetAction.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPickSourceAction]
  }
}

