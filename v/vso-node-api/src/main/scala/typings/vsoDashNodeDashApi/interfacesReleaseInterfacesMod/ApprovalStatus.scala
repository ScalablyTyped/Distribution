package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApprovalStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalStatus")
@js.native
object ApprovalStatus extends js.Object {
  @js.native
  sealed trait Approved extends ApprovalStatus
  
  @js.native
  sealed trait Canceled extends ApprovalStatus
  
  @js.native
  sealed trait Pending extends ApprovalStatus
  
  @js.native
  sealed trait Reassigned extends ApprovalStatus
  
  @js.native
  sealed trait Rejected extends ApprovalStatus
  
  @js.native
  sealed trait Skipped extends ApprovalStatus
  
  @js.native
  sealed trait Undefined extends ApprovalStatus
  
  /* 2 */ val Approved: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalStatus.Approved with Double = js.native
  /* 7 */ val Canceled: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalStatus.Canceled with Double = js.native
  /* 1 */ val Pending: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalStatus.Pending with Double = js.native
  /* 6 */ val Reassigned: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalStatus.Reassigned with Double = js.native
  /* 4 */ val Rejected: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalStatus.Rejected with Double = js.native
  /* 8 */ val Skipped: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalStatus.Skipped with Double = js.native
  /* 0 */ val Undefined: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalStatus.Undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalStatus with Double] = js.native
}

