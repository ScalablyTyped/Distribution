package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskOrchestrationPlanState extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskOrchestrationPlanState")
@js.native
object TaskOrchestrationPlanState extends js.Object {
  @js.native
  sealed trait Completed
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlanState
  
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlanState
  
  @js.native
  sealed trait Queued
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlanState
  
  /* 4 */ val Completed: Completed with scala.Double = js.native
  /* 1 */ val InProgress: InProgress with scala.Double = js.native
  /* 2 */ val Queued: Queued with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlanState with scala.Double
  ] = js.native
}

