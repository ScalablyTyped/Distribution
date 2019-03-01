package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationPlanReference extends js.Object {
  /**
    * The type of the plan.
    */
  var orchestrationType: scala.Double
  /**
    * The ID of the plan.
    */
  var planId: java.lang.String
}

object TaskOrchestrationPlanReference {
  @scala.inline
  def apply(orchestrationType: scala.Double, planId: java.lang.String): TaskOrchestrationPlanReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("orchestrationType")(orchestrationType)
    __obj.updateDynamic("planId")(planId)
    __obj.asInstanceOf[TaskOrchestrationPlanReference]
  }
}

