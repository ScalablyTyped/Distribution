package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskAgentPoolMaintenanceJobResult extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolMaintenanceJobResult")
@js.native
object TaskAgentPoolMaintenanceJobResult extends js.Object {
  @js.native
  sealed trait Canceled
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult
  
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult
  
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult
  
  /* 4 */ val Canceled: Canceled with scala.Double = js.native
  /* 2 */ val Failed: Failed with scala.Double = js.native
  /* 1 */ val Succeeded: Succeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult with scala.Double
  ] = js.native
}

