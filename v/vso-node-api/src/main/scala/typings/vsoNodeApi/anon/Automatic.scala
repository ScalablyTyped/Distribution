package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Automatic extends js.Object {
  var automatic: scala.Double
  var deploymentSubmitter: scala.Double
  var firstPreDeploymentApprover: scala.Double
}

object Automatic {
  @scala.inline
  def apply(
    automatic: scala.Double,
    deploymentSubmitter: scala.Double,
    firstPreDeploymentApprover: scala.Double
  ): Automatic = {
    val __obj = js.Dynamic.literal(automatic = automatic.asInstanceOf[js.Any], deploymentSubmitter = deploymentSubmitter.asInstanceOf[js.Any], firstPreDeploymentApprover = firstPreDeploymentApprover.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automatic]
  }
}

