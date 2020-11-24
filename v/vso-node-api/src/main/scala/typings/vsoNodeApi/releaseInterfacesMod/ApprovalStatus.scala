package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApprovalStatus extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalStatus")
@js.native
object ApprovalStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalStatus with Double] = js.native
  
  @js.native
  sealed trait Approved extends ApprovalStatus
  /* 2 */ @js.native
  object Approved extends TopLevel[Approved with Double]
  
  @js.native
  sealed trait Canceled extends ApprovalStatus
  /* 7 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  @js.native
  sealed trait Pending extends ApprovalStatus
  /* 1 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  @js.native
  sealed trait Reassigned extends ApprovalStatus
  /* 6 */ @js.native
  object Reassigned extends TopLevel[Reassigned with Double]
  
  @js.native
  sealed trait Rejected extends ApprovalStatus
  /* 4 */ @js.native
  object Rejected extends TopLevel[Rejected with Double]
  
  @js.native
  sealed trait Skipped extends ApprovalStatus
  /* 8 */ @js.native
  object Skipped extends TopLevel[Skipped with Double]
  
  @js.native
  sealed trait Undefined extends ApprovalStatus
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
}
