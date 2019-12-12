package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlanState.Completed
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlanState.InProgress
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlanState.Queued
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskOrchestrationPlanState with Double] = js.native
  /* 4 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /* 1 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 2 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
}

