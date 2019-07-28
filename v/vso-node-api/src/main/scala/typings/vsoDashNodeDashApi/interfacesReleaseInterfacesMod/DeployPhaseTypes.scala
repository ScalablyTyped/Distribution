package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeployPhaseTypes extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeployPhaseTypes")
@js.native
object DeployPhaseTypes extends js.Object {
  @js.native
  sealed trait AgentBasedDeployment extends DeployPhaseTypes
  
  @js.native
  sealed trait MachineGroupBasedDeployment extends DeployPhaseTypes
  
  @js.native
  sealed trait RunOnServer extends DeployPhaseTypes
  
  @js.native
  sealed trait Undefined extends DeployPhaseTypes
  
  /* 1 */ val AgentBasedDeployment: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseTypes.AgentBasedDeployment with Double = js.native
  /* 4 */ val MachineGroupBasedDeployment: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseTypes.MachineGroupBasedDeployment with Double = js.native
  /* 2 */ val RunOnServer: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseTypes.RunOnServer with Double = js.native
  /* 0 */ val Undefined: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseTypes.Undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeployPhaseTypes with Double] = js.native
}

