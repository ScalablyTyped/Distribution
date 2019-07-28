package typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WidgetScope extends js.Object

@JSImport("vso-node-api/interfaces/DashboardInterfaces", "WidgetScope")
@js.native
object WidgetScope extends js.Object {
  @js.native
  sealed trait Collection_User extends WidgetScope
  
  @js.native
  sealed trait Project_Team extends WidgetScope
  
  /* 0 */ val Collection_User: typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.WidgetScope.Collection_User with Double = js.native
  /* 1 */ val Project_Team: typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.WidgetScope.Project_Team with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WidgetScope with Double] = js.native
}

