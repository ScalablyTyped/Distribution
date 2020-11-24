package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TeamDashboardPermission extends js.Object
@JSImport("vso-node-api/interfaces/DashboardInterfaces", "TeamDashboardPermission")
@js.native
object TeamDashboardPermission extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TeamDashboardPermission with Double] = js.native
  
  @js.native
  sealed trait Create extends TeamDashboardPermission
  /* 2 */ @js.native
  object Create extends TopLevel[Create with Double]
  
  @js.native
  sealed trait Delete extends TeamDashboardPermission
  /* 8 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  @js.native
  sealed trait Edit extends TeamDashboardPermission
  /* 4 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  @js.native
  sealed trait ManagePermissions extends TeamDashboardPermission
  /* 16 */ @js.native
  object ManagePermissions extends TopLevel[ManagePermissions with Double]
  
  @js.native
  sealed trait None extends TeamDashboardPermission
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Read extends TeamDashboardPermission
  /* 1 */ @js.native
  object Read extends TopLevel[Read with Double]
}
