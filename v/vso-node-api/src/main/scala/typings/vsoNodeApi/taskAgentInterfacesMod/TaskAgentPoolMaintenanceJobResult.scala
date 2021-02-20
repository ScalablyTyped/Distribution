package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolMaintenanceJobResult extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolMaintenanceJobResult")
@js.native
object TaskAgentPoolMaintenanceJobResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceJobResult with Double] = js.native
  
  @js.native
  sealed trait Canceled extends TaskAgentPoolMaintenanceJobResult
  /* 4 */ val Canceled: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult.Canceled with Double = js.native
  
  @js.native
  sealed trait Failed extends TaskAgentPoolMaintenanceJobResult
  /* 2 */ val Failed: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult.Failed with Double = js.native
  
  @js.native
  sealed trait Succeeded extends TaskAgentPoolMaintenanceJobResult
  /* 1 */ val Succeeded: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult.Succeeded with Double = js.native
}
