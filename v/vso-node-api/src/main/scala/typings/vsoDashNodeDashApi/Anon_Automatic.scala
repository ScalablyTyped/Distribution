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
    val __obj = js.Dynamic.literal(automatic = automatic, deploymentSubmitter = deploymentSubmitter, firstPreDeploymentApprover = firstPreDeploymentApprover)
  
    __obj.asInstanceOf[Anon_Automatic]
  }
}

