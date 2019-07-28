package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
  
  /* 1 */ val Error: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.IssueType.Error with Double = js.native
  /* 2 */ val Warning: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.IssueType.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IssueType with Double] = js.native
}

