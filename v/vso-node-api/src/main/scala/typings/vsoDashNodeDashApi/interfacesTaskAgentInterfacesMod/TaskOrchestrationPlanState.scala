package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskOrchestrationPlanState extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskOrchestrationPlanState")
@js.native
object TaskOrchestrationPlanState extends js.Object {
  @js.native
  sealed trait Completed extends TaskOrchestrationPlanState
  
  @js.native
  sealed trait InProgress extends TaskOrchestrationPlanState
  
  @js.native
  sealed trait Queued extends TaskOrchestrationPlanState
  
  /* 4 */ val Completed: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlanState.Completed with Double = js.native
  /* 1 */ val InProgress: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlanState.InProgress with Double = js.native
  /* 2 */ val Queued: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlanState.Queued with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskOrchestrationPlanState with Double] = js.native
}

