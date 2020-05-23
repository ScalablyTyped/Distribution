package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Approvals extends js.Object {
  var all: scala.Double
  var approvals: scala.Double
  var artifacts: scala.Double
  var deploymentOnly: scala.Double
}

object Approvals {
  @scala.inline
  def apply(all: scala.Double, approvals: scala.Double, artifacts: scala.Double, deploymentOnly: scala.Double): Approvals = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approvals = approvals.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], deploymentOnly = deploymentOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Approvals]
  }
}

