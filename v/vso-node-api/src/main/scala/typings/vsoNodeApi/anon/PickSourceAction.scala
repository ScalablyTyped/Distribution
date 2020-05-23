package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickSourceAction extends js.Object {
  var pickSourceAction: scala.Double
  var pickTargetAction: scala.Double
  var undecided: scala.Double
}

object PickSourceAction {
  @scala.inline
  def apply(pickSourceAction: scala.Double, pickTargetAction: scala.Double, undecided: scala.Double): PickSourceAction = {
    val __obj = js.Dynamic.literal(pickSourceAction = pickSourceAction.asInstanceOf[js.Any], pickTargetAction = pickTargetAction.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSourceAction]
  }
}

