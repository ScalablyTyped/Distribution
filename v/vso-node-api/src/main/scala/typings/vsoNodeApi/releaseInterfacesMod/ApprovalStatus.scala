package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApprovalStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalStatus")
@js.native
object ApprovalStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalStatus with Double] = js.native
  
  @js.native
  sealed trait Approved extends ApprovalStatus
  /* 2 */ val Approved: typings.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Approved with Double = js.native
  
  @js.native
  sealed trait Canceled extends ApprovalStatus
  /* 7 */ val Canceled: typings.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Canceled with Double = js.native
  
  @js.native
  sealed trait Pending extends ApprovalStatus
  /* 1 */ val Pending: typings.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Pending with Double = js.native
  
  @js.native
  sealed trait Reassigned extends ApprovalStatus
  /* 6 */ val Reassigned: typings.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Reassigned with Double = js.native
  
  @js.native
  sealed trait Rejected extends ApprovalStatus
  /* 4 */ val Rejected: typings.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Rejected with Double = js.native
  
  @js.native
  sealed trait Skipped extends ApprovalStatus
  /* 8 */ val Skipped: typings.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Skipped with Double = js.native
  
  @js.native
  sealed trait Undefined extends ApprovalStatus
  /* 0 */ val Undefined: typings.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Undefined with Double = js.native
}
