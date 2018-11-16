package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskAgentPoolType extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolType")
@js.native
object TaskAgentPoolType extends js.Object {
  @js.native
  sealed trait Automation
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolType
  
  @js.native
  sealed trait Deployment
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolType
  
  /* 1 */ val Automation: Automation with scala.Double = js.native
  /* 2 */ val Deployment: Deployment with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolType with scala.Double
  ] = js.native
}

