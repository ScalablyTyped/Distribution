package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentGroupExpands extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "DeploymentGroupExpands")
@js.native
object DeploymentGroupExpands extends js.Object {
  @js.native
  sealed trait Machines extends DeploymentGroupExpands
  
  @js.native
  sealed trait None extends DeploymentGroupExpands
  
  /* 2 */ val Machines: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.DeploymentGroupExpands.Machines with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.DeploymentGroupExpands.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentGroupExpands with Double] = js.native
}

