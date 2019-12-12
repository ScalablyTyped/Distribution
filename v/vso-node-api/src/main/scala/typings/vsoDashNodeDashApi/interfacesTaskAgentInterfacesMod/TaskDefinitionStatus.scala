package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.AlreadyUpToDate
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.InlineUpdateReceived
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Installed
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Preinstalled
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.ReceivedInstallOrUpdate
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.ReceivedUninstall
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.RequestedUpdate
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Uninstalled
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Updated
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskDefinitionStatus with Double] = js.native
  /* 8 */ @js.native
  object AlreadyUpToDate extends TopLevel[AlreadyUpToDate with Double]
  
  /* 9 */ @js.native
  object InlineUpdateReceived extends TopLevel[InlineUpdateReceived with Double]
  
  /* 3 */ @js.native
  object Installed extends TopLevel[Installed with Double]
  
  /* 1 */ @js.native
  object Preinstalled extends TopLevel[Preinstalled with Double]
  
  /* 2 */ @js.native
  object ReceivedInstallOrUpdate extends TopLevel[ReceivedInstallOrUpdate with Double]
  
  /* 4 */ @js.native
  object ReceivedUninstall extends TopLevel[ReceivedUninstall with Double]
  
  /* 6 */ @js.native
  object RequestedUpdate extends TopLevel[RequestedUpdate with Double]
  
  /* 5 */ @js.native
  object Uninstalled extends TopLevel[Uninstalled with Double]
  
  /* 7 */ @js.native
  object Updated extends TopLevel[Updated with Double]
  
}

