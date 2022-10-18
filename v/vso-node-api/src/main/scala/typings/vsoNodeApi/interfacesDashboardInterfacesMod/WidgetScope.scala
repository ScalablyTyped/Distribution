package typings.vsoNodeApi.interfacesDashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WidgetScope extends StObject
@JSImport("vso-node-api/interfaces/DashboardInterfaces", "WidgetScope")
@js.native
object WidgetScope extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WidgetScope & Double] = js.native
  
  @js.native
  sealed trait Collection_User
    extends StObject
       with WidgetScope
  /* 0 */ val Collection_User: typings.vsoNodeApi.interfacesDashboardInterfacesMod.WidgetScope.Collection_User & Double = js.native
  
  @js.native
  sealed trait Project_Team
    extends StObject
       with WidgetScope
  /* 1 */ val Project_Team: typings.vsoNodeApi.interfacesDashboardInterfacesMod.WidgetScope.Project_Team & Double = js.native
}
