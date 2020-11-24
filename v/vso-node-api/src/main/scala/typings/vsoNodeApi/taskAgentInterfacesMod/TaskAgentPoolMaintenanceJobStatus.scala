package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolMaintenanceJobStatus extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolMaintenanceJobStatus")
@js.native
object TaskAgentPoolMaintenanceJobStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceJobStatus with Double] = js.native
  
  @js.native
  sealed trait Cancelling extends TaskAgentPoolMaintenanceJobStatus
  /* 4 */ @js.native
  object Cancelling extends TopLevel[Cancelling with Double]
  
  @js.native
  sealed trait Completed extends TaskAgentPoolMaintenanceJobStatus
  /* 2 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  @js.native
  sealed trait InProgress extends TaskAgentPoolMaintenanceJobStatus
  /* 1 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  @js.native
  sealed trait Queued extends TaskAgentPoolMaintenanceJobStatus
  /* 8 */ @js.native
  object Queued extends TopLevel[Queued with Double]
}
