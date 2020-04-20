package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutomatic extends js.Object {
  var automatic: Double
  var deploymentSubmitter: Double
  var firstPreDeploymentApprover: Double
}

object AnonAutomatic {
  @scala.inline
  def apply(automatic: Double, deploymentSubmitter: Double, firstPreDeploymentApprover: Double): AnonAutomatic = {
    val __obj = js.Dynamic.literal(automatic = automatic.asInstanceOf[js.Any], deploymentSubmitter = deploymentSubmitter.asInstanceOf[js.Any], firstPreDeploymentApprover = firstPreDeploymentApprover.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutomatic]
  }
}

