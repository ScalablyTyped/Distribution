package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentGroupActionFilter extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "DeploymentGroupActionFilter")
@js.native
object DeploymentGroupActionFilter extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentGroupActionFilter with Double] = js.native
  
  @js.native
  sealed trait Manage extends DeploymentGroupActionFilter
  /* 2 */ @js.native
  object Manage extends TopLevel[Manage with Double]
  
  @js.native
  sealed trait None extends DeploymentGroupActionFilter
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Use extends DeploymentGroupActionFilter
  /* 16 */ @js.native
  object Use extends TopLevel[Use with Double]
}
