package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskDefinitionStatus extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskDefinitionStatus")
@js.native
object TaskDefinitionStatus extends js.Object {
  @js.native
  sealed trait AlreadyUpToDate
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus
  
  @js.native
  sealed trait InlineUpdateReceived
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus
  
  @js.native
  sealed trait Installed
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus
  
  @js.native
  sealed trait Preinstalled
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus
  
  @js.native
  sealed trait ReceivedInstallOrUpdate
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus
  
  @js.native
  sealed trait ReceivedUninstall
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus
  
  @js.native
  sealed trait RequestedUpdate
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus
  
  @js.native
  sealed trait Uninstalled
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus
  
  @js.native
  sealed trait Updated
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus
  
  /* 8 */ val AlreadyUpToDate: AlreadyUpToDate with scala.Double = js.native
  /* 9 */ val InlineUpdateReceived: InlineUpdateReceived with scala.Double = js.native
  /* 3 */ val Installed: Installed with scala.Double = js.native
  /* 1 */ val Preinstalled: Preinstalled with scala.Double = js.native
  /* 2 */ val ReceivedInstallOrUpdate: ReceivedInstallOrUpdate with scala.Double = js.native
  /* 4 */ val ReceivedUninstall: ReceivedUninstall with scala.Double = js.native
  /* 6 */ val RequestedUpdate: RequestedUpdate with scala.Double = js.native
  /* 5 */ val Uninstalled: Uninstalled with scala.Double = js.native
  /* 7 */ val Updated: Updated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus with scala.Double
  ] = js.native
}

