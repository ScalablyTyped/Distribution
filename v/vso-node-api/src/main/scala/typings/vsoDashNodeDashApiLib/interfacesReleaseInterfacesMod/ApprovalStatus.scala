package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApprovalStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalStatus")
@js.native
object ApprovalStatus extends js.Object {
  @js.native
  sealed trait Approved
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalStatus
  
  @js.native
  sealed trait Canceled
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalStatus
  
  @js.native
  sealed trait Pending
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalStatus
  
  @js.native
  sealed trait Reassigned
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalStatus
  
  @js.native
  sealed trait Rejected
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalStatus
  
  @js.native
  sealed trait Skipped
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalStatus
  
  @js.native
  sealed trait Undefined
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalStatus
  
  /* 2 */ val Approved: Approved with scala.Double = js.native
  /* 7 */ val Canceled: Canceled with scala.Double = js.native
  /* 1 */ val Pending: Pending with scala.Double = js.native
  /* 6 */ val Reassigned: Reassigned with scala.Double = js.native
  /* 4 */ val Rejected: Rejected with scala.Double = js.native
  /* 8 */ val Skipped: Skipped with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalStatus with scala.Double
  ] = js.native
}

