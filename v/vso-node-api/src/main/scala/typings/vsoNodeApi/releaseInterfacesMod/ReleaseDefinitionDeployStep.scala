package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionDeployStep extends ReleaseDefinitionEnvironmentStep {
  /**
    * The list of steps for this definition.
    */
  var tasks: js.Array[WorkflowTask]
}

object ReleaseDefinitionDeployStep {
  @scala.inline
  def apply(id: Double, tasks: js.Array[WorkflowTask]): ReleaseDefinitionDeployStep = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionDeployStep]
  }
}

