package typings
package vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TeamDashboardPermission extends js.Object

@JSImport("vso-node-api/interfaces/DashboardInterfaces", "TeamDashboardPermission")
@js.native
object TeamDashboardPermission extends js.Object {
  @js.native
  sealed trait Create
    extends vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.TeamDashboardPermission
  
  @js.native
  sealed trait Delete
    extends vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.TeamDashboardPermission
  
  @js.native
  sealed trait Edit
    extends vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.TeamDashboardPermission
  
  @js.native
  sealed trait ManagePermissions
    extends vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.TeamDashboardPermission
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.TeamDashboardPermission
  
  @js.native
  sealed trait Read
    extends vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.TeamDashboardPermission
  
  /* 2 */ val Create: Create with scala.Double = js.native
  /* 8 */ val Delete: Delete with scala.Double = js.native
  /* 4 */ val Edit: Edit with scala.Double = js.native
  /* 16 */ val ManagePermissions: ManagePermissions with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Read: Read with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.TeamDashboardPermission with scala.Double
  ] = js.native
}

