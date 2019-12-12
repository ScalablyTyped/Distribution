package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult.Canceled
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult.Failed
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult.Succeeded
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceJobResult with Double] = js.native
  /* 4 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  /* 2 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 1 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
}

