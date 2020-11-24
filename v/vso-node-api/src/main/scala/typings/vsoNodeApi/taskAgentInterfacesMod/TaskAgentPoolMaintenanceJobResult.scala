package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolMaintenanceJobResult extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolMaintenanceJobResult")
@js.native
object TaskAgentPoolMaintenanceJobResult extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceJobResult with Double] = js.native
  
  @js.native
  sealed trait Canceled extends TaskAgentPoolMaintenanceJobResult
  /* 4 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  @js.native
  sealed trait Failed extends TaskAgentPoolMaintenanceJobResult
  /* 2 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  @js.native
  sealed trait Succeeded extends TaskAgentPoolMaintenanceJobResult
  /* 1 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
}
