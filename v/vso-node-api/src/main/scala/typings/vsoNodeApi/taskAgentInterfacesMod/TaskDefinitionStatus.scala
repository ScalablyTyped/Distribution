package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskDefinitionStatus extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskDefinitionStatus")
@js.native
object TaskDefinitionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskDefinitionStatus with Double] = js.native
  
  @js.native
  sealed trait AlreadyUpToDate extends TaskDefinitionStatus
  /* 8 */ val AlreadyUpToDate: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.AlreadyUpToDate with Double = js.native
  
  @js.native
  sealed trait InlineUpdateReceived extends TaskDefinitionStatus
  /* 9 */ val InlineUpdateReceived: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.InlineUpdateReceived with Double = js.native
  
  @js.native
  sealed trait Installed extends TaskDefinitionStatus
  /* 3 */ val Installed: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.Installed with Double = js.native
  
  @js.native
  sealed trait Preinstalled extends TaskDefinitionStatus
  /* 1 */ val Preinstalled: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.Preinstalled with Double = js.native
  
  @js.native
  sealed trait ReceivedInstallOrUpdate extends TaskDefinitionStatus
  /* 2 */ val ReceivedInstallOrUpdate: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.ReceivedInstallOrUpdate with Double = js.native
  
  @js.native
  sealed trait ReceivedUninstall extends TaskDefinitionStatus
  /* 4 */ val ReceivedUninstall: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.ReceivedUninstall with Double = js.native
  
  @js.native
  sealed trait RequestedUpdate extends TaskDefinitionStatus
  /* 6 */ val RequestedUpdate: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.RequestedUpdate with Double = js.native
  
  @js.native
  sealed trait Uninstalled extends TaskDefinitionStatus
  /* 5 */ val Uninstalled: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.Uninstalled with Double = js.native
  
  @js.native
  sealed trait Updated extends TaskDefinitionStatus
  /* 7 */ val Updated: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.Updated with Double = js.native
}
