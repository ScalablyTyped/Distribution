package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApprovalFilters extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalFilters")
@js.native
object ApprovalFilters extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalFilters & Double] = js.native
  
  /**
    * All approval steps and approval snapshots
    */
  @js.native
  sealed trait All
    extends StObject
       with ApprovalFilters
  /* 7 */ val All: typings.vsoNodeApi.releaseInterfacesMod.ApprovalFilters.All & Double = js.native
  
  /**
    * No approval steps, but approval snapshots (Use with either ManualApprovals or AutomatedApprovals for approval steps)
    */
  @js.native
  sealed trait ApprovalSnapshots
    extends StObject
       with ApprovalFilters
  /* 4 */ val ApprovalSnapshots: typings.vsoNodeApi.releaseInterfacesMod.ApprovalFilters.ApprovalSnapshots & Double = js.native
  
  /**
    * Automated approval steps but no approval snapshots (Use with ApprovalSnapshots for snapshots)
    */
  @js.native
  sealed trait AutomatedApprovals
    extends StObject
       with ApprovalFilters
  /* 2 */ val AutomatedApprovals: typings.vsoNodeApi.releaseInterfacesMod.ApprovalFilters.AutomatedApprovals & Double = js.native
  
  /**
    * Manual approval steps but no approval snapshots (Use with ApprovalSnapshots for snapshots)
    */
  @js.native
  sealed trait ManualApprovals
    extends StObject
       with ApprovalFilters
  /* 1 */ val ManualApprovals: typings.vsoNodeApi.releaseInterfacesMod.ApprovalFilters.ManualApprovals & Double = js.native
  
  /**
    * No approvals or approval snapshots
    */
  @js.native
  sealed trait None
    extends StObject
       with ApprovalFilters
  /* 0 */ val None: typings.vsoNodeApi.releaseInterfacesMod.ApprovalFilters.None & Double = js.native
}
