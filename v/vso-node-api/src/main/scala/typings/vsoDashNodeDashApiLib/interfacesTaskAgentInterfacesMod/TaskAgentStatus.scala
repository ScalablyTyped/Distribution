package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskAgentStatus extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentStatus")
@js.native
object TaskAgentStatus extends js.Object {
  @js.native
  sealed trait Offline
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentStatus
  
  @js.native
  sealed trait Online
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentStatus
  
  /* 1 */ val Offline: Offline with scala.Double = js.native
  /* 2 */ val Online: Online with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentStatus with scala.Double
  ] = js.native
}

