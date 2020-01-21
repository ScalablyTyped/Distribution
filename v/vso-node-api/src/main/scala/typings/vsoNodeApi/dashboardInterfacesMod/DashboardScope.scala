package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DashboardScope extends js.Object

@JSImport("vso-node-api/interfaces/DashboardInterfaces", "DashboardScope")
@js.native
object DashboardScope extends js.Object {
  @js.native
  sealed trait Collection_User extends DashboardScope
  
  @js.native
  sealed trait Project_Team extends DashboardScope
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DashboardScope with Double] = js.native
  /* 0 */ @js.native
  object Collection_User extends TopLevel[Collection_User with Double]
  
  /* 1 */ @js.native
  object Project_Team extends TopLevel[Project_Team with Double]
  
}

