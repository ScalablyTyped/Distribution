package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllApprovals extends js.Object {
  var all: scala.Double
  var approvals: scala.Double
  var artifacts: scala.Double
  var deploymentOnly: scala.Double
}

object Anon_AllApprovals {
  @scala.inline
  def apply(all: scala.Double, approvals: scala.Double, artifacts: scala.Double, deploymentOnly: scala.Double): Anon_AllApprovals = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("approvals")(approvals)
    __obj.updateDynamic("artifacts")(artifacts)
    __obj.updateDynamic("deploymentOnly")(deploymentOnly)
    __obj.asInstanceOf[Anon_AllApprovals]
  }
}

