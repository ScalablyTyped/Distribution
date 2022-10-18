package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeployPhaseTypes extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeployPhaseTypes")
@js.native
object DeployPhaseTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeployPhaseTypes & Double] = js.native
  
  @js.native
  sealed trait AgentBasedDeployment
    extends StObject
       with DeployPhaseTypes
  /* 1 */ val AgentBasedDeployment: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeployPhaseTypes.AgentBasedDeployment & Double = js.native
  
  @js.native
  sealed trait MachineGroupBasedDeployment
    extends StObject
       with DeployPhaseTypes
  /* 4 */ val MachineGroupBasedDeployment: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeployPhaseTypes.MachineGroupBasedDeployment & Double = js.native
  
  @js.native
  sealed trait RunOnServer
    extends StObject
       with DeployPhaseTypes
  /* 2 */ val RunOnServer: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeployPhaseTypes.RunOnServer & Double = js.native
  
  @js.native
  sealed trait Undefined
    extends StObject
       with DeployPhaseTypes
  /* 0 */ val Undefined: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeployPhaseTypes.Undefined & Double = js.native
}
