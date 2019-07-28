package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskAgentPoolActionFilter extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolActionFilter")
@js.native
object TaskAgentPoolActionFilter extends js.Object {
  @js.native
  sealed trait Manage extends TaskAgentPoolActionFilter
  
  @js.native
  sealed trait None extends TaskAgentPoolActionFilter
  
  @js.native
  sealed trait Use extends TaskAgentPoolActionFilter
  
  /* 2 */ val Manage: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolActionFilter.Manage with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolActionFilter.None with Double = js.native
  /* 16 */ val Use: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolActionFilter.Use with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolActionFilter with Double] = js.native
}

