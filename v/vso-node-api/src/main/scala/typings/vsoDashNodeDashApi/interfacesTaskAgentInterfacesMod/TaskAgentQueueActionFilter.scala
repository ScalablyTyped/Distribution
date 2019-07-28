package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskAgentQueueActionFilter extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentQueueActionFilter")
@js.native
object TaskAgentQueueActionFilter extends js.Object {
  @js.native
  sealed trait Manage extends TaskAgentQueueActionFilter
  
  @js.native
  sealed trait None extends TaskAgentQueueActionFilter
  
  @js.native
  sealed trait Use extends TaskAgentQueueActionFilter
  
  /* 2 */ val Manage: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentQueueActionFilter.Manage with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentQueueActionFilter.None with Double = js.native
  /* 16 */ val Use: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentQueueActionFilter.Use with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentQueueActionFilter with Double] = js.native
}

