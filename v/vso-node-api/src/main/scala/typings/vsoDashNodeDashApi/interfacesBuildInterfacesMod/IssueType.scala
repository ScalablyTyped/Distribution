package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.IssueType.Error
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.IssueType.Warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IssueType extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "IssueType")
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

