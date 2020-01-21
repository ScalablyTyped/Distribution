package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolActionFilter with Double] = js.native
  /* 2 */ @js.native
  object Manage extends TopLevel[Manage with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 16 */ @js.native
  object Use extends TopLevel[Use with Double]
  
}

