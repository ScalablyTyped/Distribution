package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IssueSource extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "IssueSource")
@js.native
object IssueSource extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IssueSource with Double] = js.native
  
  @js.native
  sealed trait None extends IssueSource
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait System extends IssueSource
  /* 2 */ @js.native
  object System extends TopLevel[System with Double]
  
  @js.native
  sealed trait User extends IssueSource
  /* 1 */ @js.native
  object User extends TopLevel[User with Double]
}
