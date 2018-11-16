package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeployPhaseTypes extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeployPhaseTypes")
@js.native
object DeployPhaseTypes extends js.Object {
  @js.native
  sealed trait AgentBasedDeployment
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseTypes
  
  @js.native
  sealed trait MachineGroupBasedDeployment
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseTypes
  
  @js.native
  sealed trait RunOnServer
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseTypes
  
  @js.native
  sealed trait Undefined
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseTypes
  
  /* 1 */ val AgentBasedDeployment: AgentBasedDeployment with scala.Double = js.native
  /* 4 */ val MachineGroupBasedDeployment: MachineGroupBasedDeployment with scala.Double = js.native
  /* 2 */ val RunOnServer: RunOnServer with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseTypes with scala.Double
  ] = js.native
}

