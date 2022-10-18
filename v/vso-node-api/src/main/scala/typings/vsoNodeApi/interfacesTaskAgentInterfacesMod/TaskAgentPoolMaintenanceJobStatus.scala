package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolMaintenanceJobStatus extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolMaintenanceJobStatus")
@js.native
object TaskAgentPoolMaintenanceJobStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceJobStatus & Double] = js.native
  
  @js.native
  sealed trait Cancelling
    extends StObject
       with TaskAgentPoolMaintenanceJobStatus
  /* 4 */ val Cancelling: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus.Cancelling & Double = js.native
  
  @js.native
  sealed trait Completed
    extends StObject
       with TaskAgentPoolMaintenanceJobStatus
  /* 2 */ val Completed: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus.Completed & Double = js.native
  
  @js.native
  sealed trait InProgress
    extends StObject
       with TaskAgentPoolMaintenanceJobStatus
  /* 1 */ val InProgress: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus.InProgress & Double = js.native
  
  @js.native
  sealed trait Queued
    extends StObject
       with TaskAgentPoolMaintenanceJobStatus
  /* 8 */ val Queued: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus.Queued & Double = js.native
}
