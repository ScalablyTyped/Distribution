package typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod

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
  
  /* 0 */ val Collection_User: typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.DashboardScope.Collection_User with Double = js.native
  /* 1 */ val Project_Team: typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.DashboardScope.Project_Team with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DashboardScope with Double] = js.native
}

