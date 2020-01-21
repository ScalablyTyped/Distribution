package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IssueSource extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "IssueSource")
@js.native
object IssueSource extends js.Object {
  @js.native
  sealed trait None extends IssueSource
  
  @js.native
  sealed trait System extends IssueSource
  
  @js.native
  sealed trait User extends IssueSource
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IssueSource with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object System extends TopLevel[System with Double]
  
  /* 1 */ @js.native
  object User extends TopLevel[User with Double]
  
}

