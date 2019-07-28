package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
  
  /* 4 */ val Cancelling: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus.Cancelling with Double = js.native
  /* 2 */ val Completed: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus.Completed with Double = js.native
  /* 1 */ val InProgress: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus.InProgress with Double = js.native
  /* 8 */ val Queued: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus.Queued with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceJobStatus with Double] = js.native
}

