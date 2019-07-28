package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskAgentStatus extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentStatus")
@js.native
object TaskAgentStatus extends js.Object {
  @js.native
  sealed trait Offline extends TaskAgentStatus
  
  @js.native
  sealed trait Online extends TaskAgentStatus
  
  /* 1 */ val Offline: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentStatus.Offline with Double = js.native
  /* 2 */ val Online: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentStatus.Online with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentStatus with Double] = js.native
}

