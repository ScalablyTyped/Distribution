package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IssueType extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "IssueType")
@js.native
object IssueType extends js.Object {
  @js.native
  sealed trait Error extends IssueType
  
  @js.native
  sealed trait Warning extends IssueType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IssueType with Double] = js.native
  /* 1 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 2 */ @js.native
  object Warning extends TopLevel[Warning with Double]
  
}

