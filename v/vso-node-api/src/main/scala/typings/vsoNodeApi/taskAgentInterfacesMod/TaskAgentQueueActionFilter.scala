package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentQueueActionFilter extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentQueueActionFilter")
@js.native
object TaskAgentQueueActionFilter extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentQueueActionFilter with Double] = js.native
  
  @js.native
  sealed trait Manage extends TaskAgentQueueActionFilter
  /* 2 */ @js.native
  object Manage extends TopLevel[Manage with Double]
  
  @js.native
  sealed trait None extends TaskAgentQueueActionFilter
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Use extends TaskAgentQueueActionFilter
  /* 16 */ @js.native
  object Use extends TopLevel[Use with Double]
}
