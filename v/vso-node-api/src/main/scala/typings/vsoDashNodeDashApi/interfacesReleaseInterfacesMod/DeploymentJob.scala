package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentJob extends js.Object {
  var job: ReleaseTask
  var tasks: js.Array[ReleaseTask]
}

object DeploymentJob {
  @scala.inline
  def apply(job: ReleaseTask, tasks: js.Array[ReleaseTask]): DeploymentJob = {
    val __obj = js.Dynamic.literal(job = job, tasks = tasks)
  
    __obj.asInstanceOf[DeploymentJob]
  }
}

