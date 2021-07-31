package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentGroupExpands extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "DeploymentGroupExpands")
@js.native
object DeploymentGroupExpands extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentGroupExpands & Double] = js.native
  
  @js.native
  sealed trait Machines
    extends StObject
       with DeploymentGroupExpands
  /* 2 */ val Machines: typings.vsoNodeApi.taskAgentInterfacesMod.DeploymentGroupExpands.Machines & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with DeploymentGroupExpands
  /* 0 */ val None: typings.vsoNodeApi.taskAgentInterfacesMod.DeploymentGroupExpands.None & Double = js.native
}
