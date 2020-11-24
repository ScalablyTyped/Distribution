package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IssueType extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "IssueType")
@js.native
object IssueType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IssueType with Double] = js.native
  
  @js.native
  sealed trait Error extends IssueType
  /* 1 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Warning extends IssueType
  /* 2 */ @js.native
  object Warning extends TopLevel[Warning with Double]
}
