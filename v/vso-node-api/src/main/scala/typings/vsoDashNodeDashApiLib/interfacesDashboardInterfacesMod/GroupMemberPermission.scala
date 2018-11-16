package typings
package vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupMemberPermission extends js.Object

@JSImport("vso-node-api/interfaces/DashboardInterfaces", "GroupMemberPermission")
@js.native
object GroupMemberPermission extends js.Object {
  @js.native
  sealed trait Edit
    extends vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.GroupMemberPermission
  
  @js.native
  sealed trait Manage
    extends vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.GroupMemberPermission
  
  @js.native
  sealed trait ManagePermissions
    extends vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.GroupMemberPermission
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.GroupMemberPermission
  
  /* 1 */ val Edit: Edit with scala.Double = js.native
  /* 2 */ val Manage: Manage with scala.Double = js.native
  /* 3 */ val ManagePermissions: ManagePermissions with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.GroupMemberPermission with scala.Double
  ] = js.native
}

