package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApprovalStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalStatus")
@js.native
object ApprovalStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalStatus & Double] = js.native
  
  @js.native
  sealed trait Approved
    extends StObject
       with ApprovalStatus
  /* 2 */ val Approved: typings.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Approved & Double = js.native
  
  @js.native
  sealed trait Canceled
    extends StObject
       with ApprovalStatus
  /* 7 */ val Canceled: typings.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Canceled & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with ApprovalStatus
  /* 1 */ val Pending: typings.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Pending & Double = js.native
  
  @js.native
  sealed trait Reassigned
    extends StObject
       with ApprovalStatus
  /* 6 */ val Reassigned: typings.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Reassigned & Double = js.native
  
  @js.native
  sealed trait Rejected
    extends StObject
       with ApprovalStatus
  /* 4 */ val Rejected: typings.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Rejected & Double = js.native
  
  @js.native
  sealed trait Skipped
    extends StObject
       with ApprovalStatus
  /* 8 */ val Skipped: typings.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Skipped & Double = js.native
  
  @js.native
  sealed trait Undefined
    extends StObject
       with ApprovalStatus
  /* 0 */ val Undefined: typings.vsoNodeApi.releaseInterfacesMod.ApprovalStatus.Undefined & Double = js.native
}
