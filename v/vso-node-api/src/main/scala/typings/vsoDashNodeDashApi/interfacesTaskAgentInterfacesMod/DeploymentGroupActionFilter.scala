package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
  
  /* 2 */ val Manage: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.DeploymentGroupActionFilter.Manage with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.DeploymentGroupActionFilter.None with Double = js.native
  /* 16 */ val Use: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.DeploymentGroupActionFilter.Use with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentGroupActionFilter with Double] = js.native
}

