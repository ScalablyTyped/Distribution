package typings
package vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WidgetScope extends js.Object

@JSImport("vso-node-api/interfaces/DashboardInterfaces", "WidgetScope")
@js.native
object WidgetScope extends js.Object {
  @js.native
  sealed trait Collection_User
    extends vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.WidgetScope
  
  @js.native
  sealed trait Project_Team
    extends vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.WidgetScope
  
  /* 0 */ val Collection_User: Collection_User with scala.Double = js.native
  /* 1 */ val Project_Team: Project_Team with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.WidgetScope with scala.Double
  ] = js.native
}

