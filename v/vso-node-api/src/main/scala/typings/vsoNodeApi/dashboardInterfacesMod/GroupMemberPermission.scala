package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupMemberPermission extends StObject
@JSImport("vso-node-api/interfaces/DashboardInterfaces", "GroupMemberPermission")
@js.native
object GroupMemberPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupMemberPermission with Double] = js.native
  
  @js.native
  sealed trait Edit extends GroupMemberPermission
  /* 1 */ val Edit: typings.vsoNodeApi.dashboardInterfacesMod.GroupMemberPermission.Edit with Double = js.native
  
  @js.native
  sealed trait Manage extends GroupMemberPermission
  /* 2 */ val Manage: typings.vsoNodeApi.dashboardInterfacesMod.GroupMemberPermission.Manage with Double = js.native
  
  @js.native
  sealed trait ManagePermissions extends GroupMemberPermission
  /* 3 */ val ManagePermissions: typings.vsoNodeApi.dashboardInterfacesMod.GroupMemberPermission.ManagePermissions with Double = js.native
  
  @js.native
  sealed trait None extends GroupMemberPermission
  /* 0 */ val None: typings.vsoNodeApi.dashboardInterfacesMod.GroupMemberPermission.None with Double = js.native
}
