package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Automatic extends js.Object {
  var automatic: Double
  var deploymentSubmitter: Double
  var firstPreDeploymentApprover: Double
}

object Anon_Automatic {
  @scala.inline
  def apply(automatic: Double, deploymentSubmitter: Double, firstPreDeploymentApprover: Double): Anon_Automatic = {
    val __obj = js.Dynamic.literal(automatic = automatic.asInstanceOf[js.Any], deploymentSubmitter = deploymentSubmitter.asInstanceOf[js.Any], firstPreDeploymentApprover = firstPreDeploymentApprover.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Automatic]
  }
}

