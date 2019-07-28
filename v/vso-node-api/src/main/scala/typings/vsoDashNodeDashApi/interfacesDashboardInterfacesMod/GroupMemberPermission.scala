package typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupMemberPermission extends js.Object

@JSImport("vso-node-api/interfaces/DashboardInterfaces", "GroupMemberPermission")
@js.native
object GroupMemberPermission extends js.Object {
  @js.native
  sealed trait Edit extends GroupMemberPermission
  
  @js.native
  sealed trait Manage extends GroupMemberPermission
  
  @js.native
  sealed trait ManagePermissions extends GroupMemberPermission
  
  @js.native
  sealed trait None extends GroupMemberPermission
  
  /* 1 */ val Edit: typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.GroupMemberPermission.Edit with Double = js.native
  /* 2 */ val Manage: typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.GroupMemberPermission.Manage with Double = js.native
  /* 3 */ val ManagePermissions: typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.GroupMemberPermission.ManagePermissions with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.GroupMemberPermission.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupMemberPermission with Double] = js.native
}

