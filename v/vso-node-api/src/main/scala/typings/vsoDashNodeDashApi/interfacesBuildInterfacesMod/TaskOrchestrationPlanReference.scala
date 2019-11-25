package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationPlanReference extends js.Object {
  /**
    * The type of the plan.
    */
  var orchestrationType: Double
  /**
    * The ID of the plan.
    */
  var planId: String
}

object TaskOrchestrationPlanReference {
  @scala.inline
  def apply(orchestrationType: Double, planId: String): TaskOrchestrationPlanReference = {
    val __obj = js.Dynamic.literal(orchestrationType = orchestrationType.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskOrchestrationPlanReference]
  }
}

