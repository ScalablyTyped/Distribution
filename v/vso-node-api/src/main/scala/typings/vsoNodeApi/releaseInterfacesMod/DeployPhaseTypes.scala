package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeployPhaseTypes extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeployPhaseTypes")
@js.native
object DeployPhaseTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeployPhaseTypes with Double] = js.native
  
  @js.native
  sealed trait AgentBasedDeployment extends DeployPhaseTypes
  /* 1 */ @js.native
  object AgentBasedDeployment extends TopLevel[AgentBasedDeployment with Double]
  
  @js.native
  sealed trait MachineGroupBasedDeployment extends DeployPhaseTypes
  /* 4 */ @js.native
  object MachineGroupBasedDeployment extends TopLevel[MachineGroupBasedDeployment with Double]
  
  @js.native
  sealed trait RunOnServer extends DeployPhaseTypes
  /* 2 */ @js.native
  object RunOnServer extends TopLevel[RunOnServer with Double]
  
  @js.native
  sealed trait Undefined extends DeployPhaseTypes
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
}
