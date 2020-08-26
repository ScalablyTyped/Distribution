package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentTest extends Deployment {
  var runId: Double = js.native
}

object DeploymentTest {
  @scala.inline
  def apply(runId: Double, `type`: String): DeploymentTest = {
    val __obj = js.Dynamic.literal(runId = runId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentTest]
  }
  @scala.inline
  implicit class DeploymentTestOps[Self <: DeploymentTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRunId(value: Double): Self = this.set("runId", value.asInstanceOf[js.Any])
  }
  
}

