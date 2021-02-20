package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentGroupExpands extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "DeploymentGroupExpands")
@js.native
object DeploymentGroupExpands extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentGroupExpands with Double] = js.native
  
  @js.native
  sealed trait Machines extends DeploymentGroupExpands
  /* 2 */ val Machines: typings.vsoNodeApi.taskAgentInterfacesMod.DeploymentGroupExpands.Machines with Double = js.native
  
  @js.native
  sealed trait None extends DeploymentGroupExpands
  /* 0 */ val None: typings.vsoNodeApi.taskAgentInterfacesMod.DeploymentGroupExpands.None with Double = js.native
}
