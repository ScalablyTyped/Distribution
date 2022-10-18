package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskOrchestrationPlanState extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskOrchestrationPlanState")
@js.native
object TaskOrchestrationPlanState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskOrchestrationPlanState & Double] = js.native
  
  @js.native
  sealed trait Completed
    extends StObject
       with TaskOrchestrationPlanState
  /* 4 */ val Completed: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlanState.Completed & Double = js.native
  
  @js.native
  sealed trait InProgress
    extends StObject
       with TaskOrchestrationPlanState
  /* 1 */ val InProgress: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlanState.InProgress & Double = js.native
  
  @js.native
  sealed trait Queued
    extends StObject
       with TaskOrchestrationPlanState
  /* 2 */ val Queued: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlanState.Queued & Double = js.native
}
