package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PickSourceAction extends js.Object {
  var pickSourceAction: scala.Double
  var pickTargetAction: scala.Double
  var undecided: scala.Double
}

object Anon_PickSourceAction {
  @scala.inline
  def apply(pickSourceAction: scala.Double, pickTargetAction: scala.Double, undecided: scala.Double): Anon_PickSourceAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pickSourceAction")(pickSourceAction)
    __obj.updateDynamic("pickTargetAction")(pickTargetAction)
    __obj.updateDynamic("undecided")(undecided)
    __obj.asInstanceOf[Anon_PickSourceAction]
  }
}

