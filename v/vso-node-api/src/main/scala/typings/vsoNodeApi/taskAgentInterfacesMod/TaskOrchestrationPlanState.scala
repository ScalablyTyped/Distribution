package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskOrchestrationPlanState extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskOrchestrationPlanState")
@js.native
object TaskOrchestrationPlanState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskOrchestrationPlanState with Double] = js.native
  
  @js.native
  sealed trait Completed extends TaskOrchestrationPlanState
  /* 4 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  @js.native
  sealed trait InProgress extends TaskOrchestrationPlanState
  /* 1 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  @js.native
  sealed trait Queued extends TaskOrchestrationPlanState
  /* 2 */ @js.native
  object Queued extends TopLevel[Queued with Double]
}
