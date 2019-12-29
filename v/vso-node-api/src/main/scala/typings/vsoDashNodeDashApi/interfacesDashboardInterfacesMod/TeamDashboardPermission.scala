package typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TeamDashboardPermission with Double] = js.native
  /* 2 */ @js.native
  object Create extends TopLevel[Create with Double]
  
  /* 8 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 4 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  /* 16 */ @js.native
  object ManagePermissions extends TopLevel[ManagePermissions with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Read extends TopLevel[Read with Double]
  
}

