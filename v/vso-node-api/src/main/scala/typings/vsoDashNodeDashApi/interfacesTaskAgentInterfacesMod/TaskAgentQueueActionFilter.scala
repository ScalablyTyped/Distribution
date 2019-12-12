package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentQueueActionFilter.Manage
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentQueueActionFilter.None
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentQueueActionFilter.Use
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentQueueActionFilter with Double] = js.native
  /* 2 */ @js.native
  object Manage extends TopLevel[Manage with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 16 */ @js.native
  object Use extends TopLevel[Use with Double]
  
}

