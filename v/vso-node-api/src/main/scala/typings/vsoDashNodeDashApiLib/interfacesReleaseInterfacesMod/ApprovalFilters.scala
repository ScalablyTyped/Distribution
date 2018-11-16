package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

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
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalFilters
  
  /**
       * No approval steps, but approval snapshots (Use with either ManualApprovals or AutomatedApprovals for approval steps)
       */
  @js.native
  sealed trait ApprovalSnapshots
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalFilters
  
  /**
       * Automated approval steps but no approval snapshots (Use with ApprovalSnapshots for snapshots)
       */
  @js.native
  sealed trait AutomatedApprovals
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalFilters
  
  /**
       * Manual approval steps but no approval snapshots (Use with ApprovalSnapshots for snapshots)
       */
  @js.native
  sealed trait ManualApprovals
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalFilters
  
  /**
       * No approvals or approval snapshots
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalFilters
  
  /* 7 */ val All: All with scala.Double = js.native
  /* 4 */ val ApprovalSnapshots: ApprovalSnapshots with scala.Double = js.native
  /* 2 */ val AutomatedApprovals: AutomatedApprovals with scala.Double = js.native
  /* 1 */ val ManualApprovals: ManualApprovals with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalFilters with scala.Double
  ] = js.native
}

