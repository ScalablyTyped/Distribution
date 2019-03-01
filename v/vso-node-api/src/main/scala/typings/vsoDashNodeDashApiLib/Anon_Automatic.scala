package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Automatic extends js.Object {
  var automatic: scala.Double
  var deploymentSubmitter: scala.Double
  var firstPreDeploymentApprover: scala.Double
}

object Anon_Automatic {
  @scala.inline
  def apply(
    automatic: scala.Double,
    deploymentSubmitter: scala.Double,
    firstPreDeploymentApprover: scala.Double
  ): Anon_Automatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("automatic")(automatic)
    __obj.updateDynamic("deploymentSubmitter")(deploymentSubmitter)
    __obj.updateDynamic("firstPreDeploymentApprover")(firstPreDeploymentApprover)
    __obj.asInstanceOf[Anon_Automatic]
  }
}

