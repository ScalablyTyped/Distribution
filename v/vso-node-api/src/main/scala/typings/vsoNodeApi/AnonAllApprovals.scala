package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllApprovals extends js.Object {
  var all: Double
  var approvals: Double
  var artifacts: Double
  var deploymentOnly: Double
}

object AnonAllApprovals {
  @scala.inline
  def apply(all: Double, approvals: Double, artifacts: Double, deploymentOnly: Double): AnonAllApprovals = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approvals = approvals.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], deploymentOnly = deploymentOnly.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllApprovals]
  }
}

