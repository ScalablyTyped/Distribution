package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskDefinitionStatus extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskDefinitionStatus")
@js.native
object TaskDefinitionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskDefinitionStatus & Double] = js.native
  
  @js.native
  sealed trait AlreadyUpToDate
    extends StObject
       with TaskDefinitionStatus
  /* 8 */ val AlreadyUpToDate: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.AlreadyUpToDate & Double = js.native
  
  @js.native
  sealed trait InlineUpdateReceived
    extends StObject
       with TaskDefinitionStatus
  /* 9 */ val InlineUpdateReceived: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.InlineUpdateReceived & Double = js.native
  
  @js.native
  sealed trait Installed
    extends StObject
       with TaskDefinitionStatus
  /* 3 */ val Installed: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.Installed & Double = js.native
  
  @js.native
  sealed trait Preinstalled
    extends StObject
       with TaskDefinitionStatus
  /* 1 */ val Preinstalled: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.Preinstalled & Double = js.native
  
  @js.native
  sealed trait ReceivedInstallOrUpdate
    extends StObject
       with TaskDefinitionStatus
  /* 2 */ val ReceivedInstallOrUpdate: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.ReceivedInstallOrUpdate & Double = js.native
  
  @js.native
  sealed trait ReceivedUninstall
    extends StObject
       with TaskDefinitionStatus
  /* 4 */ val ReceivedUninstall: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.ReceivedUninstall & Double = js.native
  
  @js.native
  sealed trait RequestedUpdate
    extends StObject
       with TaskDefinitionStatus
  /* 6 */ val RequestedUpdate: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.RequestedUpdate & Double = js.native
  
  @js.native
  sealed trait Uninstalled
    extends StObject
       with TaskDefinitionStatus
  /* 5 */ val Uninstalled: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.Uninstalled & Double = js.native
  
  @js.native
  sealed trait Updated
    extends StObject
       with TaskDefinitionStatus
  /* 7 */ val Updated: typings.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.Updated & Double = js.native
}
