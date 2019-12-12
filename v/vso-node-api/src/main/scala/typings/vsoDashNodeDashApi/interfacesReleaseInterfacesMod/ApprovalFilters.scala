package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalFilters.All
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalFilters.ApprovalSnapshots
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalFilters.AutomatedApprovals
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalFilters.ManualApprovals
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalFilters.None
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalFilters with Double] = js.native
  /* 7 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 4 */ @js.native
  object ApprovalSnapshots extends TopLevel[ApprovalSnapshots with Double]
  
  /* 2 */ @js.native
  object AutomatedApprovals extends TopLevel[AutomatedApprovals with Double]
  
  /* 1 */ @js.native
  object ManualApprovals extends TopLevel[ManualApprovals with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

