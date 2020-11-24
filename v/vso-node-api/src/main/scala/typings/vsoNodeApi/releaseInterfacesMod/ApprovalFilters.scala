package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApprovalFilters extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalFilters")
@js.native
object ApprovalFilters extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalFilters with Double] = js.native
  
  /**
    * All approval steps and approval snapshots
    */
  @js.native
  sealed trait All extends ApprovalFilters
  /* 7 */ @js.native
  object All extends TopLevel[All with Double]
  
  /**
    * No approval steps, but approval snapshots (Use with either ManualApprovals or AutomatedApprovals for approval steps)
    */
  @js.native
  sealed trait ApprovalSnapshots extends ApprovalFilters
  /* 4 */ @js.native
  object ApprovalSnapshots extends TopLevel[ApprovalSnapshots with Double]
  
  /**
    * Automated approval steps but no approval snapshots (Use with ApprovalSnapshots for snapshots)
    */
  @js.native
  sealed trait AutomatedApprovals extends ApprovalFilters
  /* 2 */ @js.native
  object AutomatedApprovals extends TopLevel[AutomatedApprovals with Double]
  
  /**
    * Manual approval steps but no approval snapshots (Use with ApprovalSnapshots for snapshots)
    */
  @js.native
  sealed trait ManualApprovals extends ApprovalFilters
  /* 1 */ @js.native
  object ManualApprovals extends TopLevel[ManualApprovals with Double]
  
  /**
    * No approvals or approval snapshots
    */
  @js.native
  sealed trait None extends ApprovalFilters
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
