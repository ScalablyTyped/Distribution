package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentGroupExpands extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "DeploymentGroupExpands")
@js.native
object DeploymentGroupExpands extends js.Object {
  @js.native
  sealed trait Machines
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroupExpands
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroupExpands
  
  /* 2 */ val Machines: Machines with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroupExpands with scala.Double
  ] = js.native
}

