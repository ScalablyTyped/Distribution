package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DashboardScope extends js.Object
@JSImport("vso-node-api/interfaces/DashboardInterfaces", "DashboardScope")
@js.native
object DashboardScope extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DashboardScope with Double] = js.native
  
  @js.native
  sealed trait Collection_User extends DashboardScope
  /* 0 */ @js.native
  object Collection_User extends TopLevel[Collection_User with Double]
  
  @js.native
  sealed trait Project_Team extends DashboardScope
  /* 1 */ @js.native
  object Project_Team extends TopLevel[Project_Team with Double]
}
