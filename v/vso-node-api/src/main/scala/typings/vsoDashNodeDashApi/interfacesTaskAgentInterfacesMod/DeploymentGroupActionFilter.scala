package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentGroupActionFilter extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "DeploymentGroupActionFilter")
@js.native
object DeploymentGroupActionFilter extends js.Object {
  @js.native
  sealed trait Manage extends DeploymentGroupActionFilter
  
  @js.native
  sealed trait None extends DeploymentGroupActionFilter
  
  @js.native
  sealed trait Use extends DeploymentGroupActionFilter
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentGroupActionFilter with Double] = js.native
  /* 2 */ @js.native
  object Manage extends TopLevel[Manage with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 16 */ @js.native
  object Use extends TopLevel[Use with Double]
  
}

