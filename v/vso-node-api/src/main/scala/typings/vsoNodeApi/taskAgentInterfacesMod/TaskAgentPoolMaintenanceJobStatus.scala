package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskAgentPoolMaintenanceJobStatus extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolMaintenanceJobStatus")
@js.native
object TaskAgentPoolMaintenanceJobStatus extends js.Object {
  @js.native
  sealed trait Cancelling extends TaskAgentPoolMaintenanceJobStatus
  
  @js.native
  sealed trait Completed extends TaskAgentPoolMaintenanceJobStatus
  
  @js.native
  sealed trait InProgress extends TaskAgentPoolMaintenanceJobStatus
  
  @js.native
  sealed trait Queued extends TaskAgentPoolMaintenanceJobStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceJobStatus with Double] = js.native
  /* 4 */ @js.native
  object Cancelling extends TopLevel[Cancelling with Double]
  
  /* 2 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /* 1 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 8 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
}

