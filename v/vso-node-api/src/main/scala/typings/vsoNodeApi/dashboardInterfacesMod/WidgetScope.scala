package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WidgetScope extends StObject
@JSImport("vso-node-api/interfaces/DashboardInterfaces", "WidgetScope")
@js.native
object WidgetScope extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WidgetScope with Double] = js.native
  
  @js.native
  sealed trait Collection_User extends WidgetScope
  /* 0 */ val Collection_User: typings.vsoNodeApi.dashboardInterfacesMod.WidgetScope.Collection_User with Double = js.native
  
  @js.native
  sealed trait Project_Team extends WidgetScope
  /* 1 */ val Project_Team: typings.vsoNodeApi.dashboardInterfacesMod.WidgetScope.Project_Team with Double = js.native
}
