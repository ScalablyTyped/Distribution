package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentGroupExpands extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "DeploymentGroupExpands")
@js.native
object DeploymentGroupExpands extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentGroupExpands with Double] = js.native
  
  @js.native
  sealed trait Machines extends DeploymentGroupExpands
  /* 2 */ @js.native
  object Machines extends TopLevel[Machines with Double]
  
  @js.native
  sealed trait None extends DeploymentGroupExpands
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
