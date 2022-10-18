package typings.vsoNodeApi.interfacesDashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DashboardScope extends StObject
@JSImport("vso-node-api/interfaces/DashboardInterfaces", "DashboardScope")
@js.native
object DashboardScope extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DashboardScope & Double] = js.native
  
  @js.native
  sealed trait Collection_User
    extends StObject
       with DashboardScope
  /* 0 */ val Collection_User: typings.vsoNodeApi.interfacesDashboardInterfacesMod.DashboardScope.Collection_User & Double = js.native
  
  @js.native
  sealed trait Project_Team
    extends StObject
       with DashboardScope
  /* 1 */ val Project_Team: typings.vsoNodeApi.interfacesDashboardInterfacesMod.DashboardScope.Project_Team & Double = js.native
}
