package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentTest extends Deployment {
  var runId: Double
}

object DeploymentTest {
  @scala.inline
  def apply(runId: Double, `type`: String): DeploymentTest = {
    val __obj = js.Dynamic.literal(runId = runId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentTest]
  }
}

