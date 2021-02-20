package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentGroupActionFilter extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "DeploymentGroupActionFilter")
@js.native
object DeploymentGroupActionFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentGroupActionFilter with Double] = js.native
  
  @js.native
  sealed trait Manage extends DeploymentGroupActionFilter
  /* 2 */ val Manage: typings.vsoNodeApi.taskAgentInterfacesMod.DeploymentGroupActionFilter.Manage with Double = js.native
  
  @js.native
  sealed trait None extends DeploymentGroupActionFilter
  /* 0 */ val None: typings.vsoNodeApi.taskAgentInterfacesMod.DeploymentGroupActionFilter.None with Double = js.native
  
  @js.native
  sealed trait Use extends DeploymentGroupActionFilter
  /* 16 */ val Use: typings.vsoNodeApi.taskAgentInterfacesMod.DeploymentGroupActionFilter.Use with Double = js.native
}
