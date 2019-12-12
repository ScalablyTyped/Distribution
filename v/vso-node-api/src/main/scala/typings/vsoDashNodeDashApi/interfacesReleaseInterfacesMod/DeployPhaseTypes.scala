package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseTypes.AgentBasedDeployment
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseTypes.MachineGroupBasedDeployment
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseTypes.RunOnServer
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseTypes.Undefined
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeployPhaseTypes with Double] = js.native
  /* 1 */ @js.native
  object AgentBasedDeployment extends TopLevel[AgentBasedDeployment with Double]
  
  /* 4 */ @js.native
  object MachineGroupBasedDeployment extends TopLevel[MachineGroupBasedDeployment with Double]
  
  /* 2 */ @js.native
  object RunOnServer extends TopLevel[RunOnServer with Double]
  
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
}

