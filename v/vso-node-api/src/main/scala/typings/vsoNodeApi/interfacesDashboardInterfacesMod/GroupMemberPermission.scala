package typings.vsoNodeApi.interfacesDashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupMemberPermission extends StObject
@JSImport("vso-node-api/interfaces/DashboardInterfaces", "GroupMemberPermission")
@js.native
object GroupMemberPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupMemberPermission & Double] = js.native
  
  @js.native
  sealed trait Edit
    extends StObject
       with GroupMemberPermission
  /* 1 */ val Edit: typings.vsoNodeApi.interfacesDashboardInterfacesMod.GroupMemberPermission.Edit & Double = js.native
  
  @js.native
  sealed trait Manage
    extends StObject
       with GroupMemberPermission
  /* 2 */ val Manage: typings.vsoNodeApi.interfacesDashboardInterfacesMod.GroupMemberPermission.Manage & Double = js.native
  
  @js.native
  sealed trait ManagePermissions
    extends StObject
       with GroupMemberPermission
  /* 3 */ val ManagePermissions: typings.vsoNodeApi.interfacesDashboardInterfacesMod.GroupMemberPermission.ManagePermissions & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with GroupMemberPermission
  /* 0 */ val None: typings.vsoNodeApi.interfacesDashboardInterfacesMod.GroupMemberPermission.None & Double = js.native
}
