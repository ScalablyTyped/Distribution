package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VariableGroupActionFilter extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "VariableGroupActionFilter")
@js.native
object VariableGroupActionFilter extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VariableGroupActionFilter with Double] = js.native
  
  @js.native
  sealed trait Manage extends VariableGroupActionFilter
  /* 2 */ @js.native
  object Manage extends TopLevel[Manage with Double]
  
  @js.native
  sealed trait None extends VariableGroupActionFilter
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Use extends VariableGroupActionFilter
  /* 16 */ @js.native
  object Use extends TopLevel[Use with Double]
}
