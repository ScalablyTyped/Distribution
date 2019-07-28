package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskDefinitionStatus extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskDefinitionStatus")
@js.native
object TaskDefinitionStatus extends js.Object {
  @js.native
  sealed trait AlreadyUpToDate extends TaskDefinitionStatus
  
  @js.native
  sealed trait InlineUpdateReceived extends TaskDefinitionStatus
  
  @js.native
  sealed trait Installed extends TaskDefinitionStatus
  
  @js.native
  sealed trait Preinstalled extends TaskDefinitionStatus
  
  @js.native
  sealed trait ReceivedInstallOrUpdate extends TaskDefinitionStatus
  
  @js.native
  sealed trait ReceivedUninstall extends TaskDefinitionStatus
  
  @js.native
  sealed trait RequestedUpdate extends TaskDefinitionStatus
  
  @js.native
  sealed trait Uninstalled extends TaskDefinitionStatus
  
  @js.native
  sealed trait Updated extends TaskDefinitionStatus
  
  /* 8 */ val AlreadyUpToDate: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.AlreadyUpToDate with Double = js.native
  /* 9 */ val InlineUpdateReceived: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.InlineUpdateReceived with Double = js.native
  /* 3 */ val Installed: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Installed with Double = js.native
  /* 1 */ val Preinstalled: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Preinstalled with Double = js.native
  /* 2 */ val ReceivedInstallOrUpdate: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.ReceivedInstallOrUpdate with Double = js.native
  /* 4 */ val ReceivedUninstall: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.ReceivedUninstall with Double = js.native
  /* 6 */ val RequestedUpdate: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.RequestedUpdate with Double = js.native
  /* 5 */ val Uninstalled: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Uninstalled with Double = js.native
  /* 7 */ val Updated: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Updated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskDefinitionStatus with Double] = js.native
}

