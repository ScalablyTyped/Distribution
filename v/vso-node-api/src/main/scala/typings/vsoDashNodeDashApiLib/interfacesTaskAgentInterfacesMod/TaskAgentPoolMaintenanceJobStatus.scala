package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskAgentPoolMaintenanceJobStatus extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolMaintenanceJobStatus")
@js.native
object TaskAgentPoolMaintenanceJobStatus extends js.Object {
  @js.native
  sealed trait Cancelling
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus
  
  @js.native
  sealed trait Completed
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus
  
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus
  
  @js.native
  sealed trait Queued
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus
  
  /* 4 */ val Cancelling: Cancelling with scala.Double = js.native
  /* 2 */ val Completed: Completed with scala.Double = js.native
  /* 1 */ val InProgress: InProgress with scala.Double = js.native
  /* 8 */ val Queued: Queued with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus with scala.Double
  ] = js.native
}

