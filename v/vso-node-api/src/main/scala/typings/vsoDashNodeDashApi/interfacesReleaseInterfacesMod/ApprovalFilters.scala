package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApprovalFilters extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalFilters")
@js.native
object ApprovalFilters extends js.Object {
  /**
    * All approval steps and approval snapshots
    */
  @js.native
  sealed trait All extends ApprovalFilters
  
  /**
    * No approval steps, but approval snapshots (Use with either ManualApprovals or AutomatedApprovals for approval steps)
    */
  @js.native
  sealed trait ApprovalSnapshots extends ApprovalFilters
  
  /**
    * Automated approval steps but no approval snapshots (Use with ApprovalSnapshots for snapshots)
    */
  @js.native
  sealed trait AutomatedApprovals extends ApprovalFilters
  
  /**
    * Manual approval steps but no approval snapshots (Use with ApprovalSnapshots for snapshots)
    */
  @js.native
  sealed trait ManualApprovals extends ApprovalFilters
  
  /**
    * No approvals or approval snapshots
    */
  @js.native
  sealed trait None extends ApprovalFilters
  
  /* 7 */ val All: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalFilters.All with Double = js.native
  /* 4 */ val ApprovalSnapshots: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalFilters.ApprovalSnapshots with Double = js.native
  /* 2 */ val AutomatedApprovals: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalFilters.AutomatedApprovals with Double = js.native
  /* 1 */ val ManualApprovals: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalFilters.ManualApprovals with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalFilters.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalFilters with Double] = js.native
}

