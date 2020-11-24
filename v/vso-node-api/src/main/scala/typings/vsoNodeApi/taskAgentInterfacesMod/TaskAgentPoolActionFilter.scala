package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolActionFilter extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolActionFilter")
@js.native
object TaskAgentPoolActionFilter extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolActionFilter with Double] = js.native
  
  @js.native
  sealed trait Manage extends TaskAgentPoolActionFilter
  /* 2 */ @js.native
  object Manage extends TopLevel[Manage with Double]
  
  @js.native
  sealed trait None extends TaskAgentPoolActionFilter
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Use extends TaskAgentPoolActionFilter
  /* 16 */ @js.native
  object Use extends TopLevel[Use with Double]
}
