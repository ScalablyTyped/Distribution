package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskAgentPoolType extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolType")
@js.native
object TaskAgentPoolType extends js.Object {
  @js.native
  sealed trait Automation extends TaskAgentPoolType
  
  @js.native
  sealed trait Deployment extends TaskAgentPoolType
  
  /* 1 */ val Automation: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolType.Automation with Double = js.native
  /* 2 */ val Deployment: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolType.Deployment with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolType with Double] = js.native
}

