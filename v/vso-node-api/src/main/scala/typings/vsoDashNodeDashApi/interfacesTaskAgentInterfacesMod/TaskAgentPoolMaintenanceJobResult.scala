package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskAgentPoolMaintenanceJobResult extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolMaintenanceJobResult")
@js.native
object TaskAgentPoolMaintenanceJobResult extends js.Object {
  @js.native
  sealed trait Canceled extends TaskAgentPoolMaintenanceJobResult
  
  @js.native
  sealed trait Failed extends TaskAgentPoolMaintenanceJobResult
  
  @js.native
  sealed trait Succeeded extends TaskAgentPoolMaintenanceJobResult
  
  /* 4 */ val Canceled: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult.Canceled with Double = js.native
  /* 2 */ val Failed: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult.Failed with Double = js.native
  /* 1 */ val Succeeded: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult.Succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceJobResult with Double] = js.native
}

