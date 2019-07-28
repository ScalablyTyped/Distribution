package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllApprovals extends js.Object {
  var all: Double
  var approvals: Double
  var artifacts: Double
  var deploymentOnly: Double
}

object Anon_AllApprovals {
  @scala.inline
  def apply(all: Double, approvals: Double, artifacts: Double, deploymentOnly: Double): Anon_AllApprovals = {
    val __obj = js.Dynamic.literal(all = all, approvals = approvals, artifacts = artifacts, deploymentOnly = deploymentOnly)
  
    __obj.asInstanceOf[Anon_AllApprovals]
  }
}

