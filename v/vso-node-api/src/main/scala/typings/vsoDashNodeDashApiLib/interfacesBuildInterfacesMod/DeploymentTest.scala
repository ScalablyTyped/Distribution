package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentTest extends Deployment {
  var runId: scala.Double
}

object DeploymentTest {
  @scala.inline
  def apply(runId: scala.Double, `type`: java.lang.String): DeploymentTest = {
    val __obj = js.Dynamic.literal(runId = runId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeploymentTest]
  }
}

