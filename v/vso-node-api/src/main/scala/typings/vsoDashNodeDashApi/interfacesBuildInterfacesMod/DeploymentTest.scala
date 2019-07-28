package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentTest extends Deployment {
  var runId: Double
}

object DeploymentTest {
  @scala.inline
  def apply(runId: Double, `type`: String): DeploymentTest = {
    val __obj = js.Dynamic.literal(runId = runId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeploymentTest]
  }
}

