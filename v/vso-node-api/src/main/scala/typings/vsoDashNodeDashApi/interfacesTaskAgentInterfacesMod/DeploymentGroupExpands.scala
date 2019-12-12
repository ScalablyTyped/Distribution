package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.DeploymentGroupExpands.Machines
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.DeploymentGroupExpands.None
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentGroupExpands with Double] = js.native
  /* 2 */ @js.native
  object Machines extends TopLevel[Machines with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

