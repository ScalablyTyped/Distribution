package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeployPhaseTypes extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeployPhaseTypes")
@js.native
object DeployPhaseTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeployPhaseTypes with Double] = js.native
  
  @js.native
  sealed trait AgentBasedDeployment extends DeployPhaseTypes
  /* 1 */ val AgentBasedDeployment: typings.vsoNodeApi.releaseInterfacesMod.DeployPhaseTypes.AgentBasedDeployment with Double = js.native
  
  @js.native
  sealed trait MachineGroupBasedDeployment extends DeployPhaseTypes
  /* 4 */ val MachineGroupBasedDeployment: typings.vsoNodeApi.releaseInterfacesMod.DeployPhaseTypes.MachineGroupBasedDeployment with Double = js.native
  
  @js.native
  sealed trait RunOnServer extends DeployPhaseTypes
  /* 2 */ val RunOnServer: typings.vsoNodeApi.releaseInterfacesMod.DeployPhaseTypes.RunOnServer with Double = js.native
  
  @js.native
  sealed trait Undefined extends DeployPhaseTypes
  /* 0 */ val Undefined: typings.vsoNodeApi.releaseInterfacesMod.DeployPhaseTypes.Undefined with Double = js.native
}
