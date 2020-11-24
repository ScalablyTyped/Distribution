package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupMemberPermission extends js.Object
@JSImport("vso-node-api/interfaces/DashboardInterfaces", "GroupMemberPermission")
@js.native
object GroupMemberPermission extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupMemberPermission with Double] = js.native
  
  @js.native
  sealed trait Edit extends GroupMemberPermission
  /* 1 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  @js.native
  sealed trait Manage extends GroupMemberPermission
  /* 2 */ @js.native
  object Manage extends TopLevel[Manage with Double]
  
  @js.native
  sealed trait ManagePermissions extends GroupMemberPermission
  /* 3 */ @js.native
  object ManagePermissions extends TopLevel[ManagePermissions with Double]
  
  @js.native
  sealed trait None extends GroupMemberPermission
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
