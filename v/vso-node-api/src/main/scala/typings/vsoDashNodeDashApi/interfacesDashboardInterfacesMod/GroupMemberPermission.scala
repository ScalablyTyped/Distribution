package typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.GroupMemberPermission.Edit
import typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.GroupMemberPermission.Manage
import typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.GroupMemberPermission.ManagePermissions
import typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.GroupMemberPermission.None
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupMemberPermission with Double] = js.native
  /* 1 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  /* 2 */ @js.native
  object Manage extends TopLevel[Manage with Double]
  
  /* 3 */ @js.native
  object ManagePermissions extends TopLevel[ManagePermissions with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

