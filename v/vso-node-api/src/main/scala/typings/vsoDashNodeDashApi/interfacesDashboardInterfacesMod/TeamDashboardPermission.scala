package typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TeamDashboardPermission extends js.Object

@JSImport("vso-node-api/interfaces/DashboardInterfaces", "TeamDashboardPermission")
@js.native
object TeamDashboardPermission extends js.Object {
  @js.native
  sealed trait Create extends TeamDashboardPermission
  
  @js.native
  sealed trait Delete extends TeamDashboardPermission
  
  @js.native
  sealed trait Edit extends TeamDashboardPermission
  
  @js.native
  sealed trait ManagePermissions extends TeamDashboardPermission
  
  @js.native
  sealed trait None extends TeamDashboardPermission
  
  @js.native
  sealed trait Read extends TeamDashboardPermission
  
  /* 2 */ val Create: typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.TeamDashboardPermission.Create with Double = js.native
  /* 8 */ val Delete: typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.TeamDashboardPermission.Delete with Double = js.native
  /* 4 */ val Edit: typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.TeamDashboardPermission.Edit with Double = js.native
  /* 16 */ val ManagePermissions: typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.TeamDashboardPermission.ManagePermissions with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.TeamDashboardPermission.None with Double = js.native
  /* 1 */ val Read: typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.TeamDashboardPermission.Read with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TeamDashboardPermission with Double] = js.native
}

