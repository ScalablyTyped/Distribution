package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentBuild extends Deployment {
  var buildId: Double = js.native
}

object DeploymentBuild {
  @scala.inline
  def apply(buildId: Double, `type`: String): DeploymentBuild = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentBuild]
  }
  @scala.inline
  implicit class DeploymentBuildOps[Self <: DeploymentBuild] (val x: Self) extends AnyVal {
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
    def setBuildId(value: Double): Self = this.set("buildId", value.asInstanceOf[js.Any])
  }
  
}

