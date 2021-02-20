package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DashboardScope extends StObject
@JSImport("vso-node-api/interfaces/DashboardInterfaces", "DashboardScope")
@js.native
object DashboardScope extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DashboardScope with Double] = js.native
  
  @js.native
  sealed trait Collection_User extends DashboardScope
  /* 0 */ val Collection_User: typings.vsoNodeApi.dashboardInterfacesMod.DashboardScope.Collection_User with Double = js.native
  
  @js.native
  sealed trait Project_Team extends DashboardScope
  /* 1 */ val Project_Team: typings.vsoNodeApi.dashboardInterfacesMod.DashboardScope.Project_Team with Double = js.native
}
