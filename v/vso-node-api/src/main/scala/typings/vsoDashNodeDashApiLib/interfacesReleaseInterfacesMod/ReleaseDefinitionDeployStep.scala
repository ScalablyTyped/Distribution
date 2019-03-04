package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

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
  def apply(id: scala.Double, tasks: js.Array[WorkflowTask]): ReleaseDefinitionDeployStep = {
    val __obj = js.Dynamic.literal(id = id, tasks = tasks)
  
    __obj.asInstanceOf[ReleaseDefinitionDeployStep]
  }
}

