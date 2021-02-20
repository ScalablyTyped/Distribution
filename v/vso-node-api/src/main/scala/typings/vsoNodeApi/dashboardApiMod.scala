package typings.vsoNodeApi

import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.coreInterfacesMod.TeamContext
import typings.vsoNodeApi.dashboardInterfacesMod.Dashboard
import typings.vsoNodeApi.dashboardInterfacesMod.DashboardGroup
import typings.vsoNodeApi.dashboardInterfacesMod.Widget
import typings.vsoNodeApi.dashboardInterfacesMod.WidgetMetadataResponse
import typings.vsoNodeApi.dashboardInterfacesMod.WidgetScope
import typings.vsoNodeApi.dashboardInterfacesMod.WidgetTypesResponse
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dashboardApiMod {
  
  @JSImport("vso-node-api/DashboardApi", "DashboardApi")
  @js.native
  class DashboardApi protected () extends IDashboardApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait IDashboardApi extends ClientApiBase {
    
    def createDashboard(dashboard: Dashboard, teamContext: TeamContext): js.Promise[Dashboard] = js.native
    
    def createWidget(widget: Widget, teamContext: TeamContext, dashboardId: String): js.Promise[Widget] = js.native
    
    def deleteDashboard(teamContext: TeamContext, dashboardId: String): js.Promise[Unit] = js.native
    
    def deleteWidget(teamContext: TeamContext, dashboardId: String, widgetId: String): js.Promise[Dashboard] = js.native
    
    def getDashboard(teamContext: TeamContext, dashboardId: String): js.Promise[Dashboard] = js.native
    
    def getDashboards(teamContext: TeamContext): js.Promise[DashboardGroup] = js.native
    
    def getWidget(teamContext: TeamContext, dashboardId: String, widgetId: String): js.Promise[Widget] = js.native
    
    def getWidgetMetadata(contributionId: String): js.Promise[WidgetMetadataResponse] = js.native
    
    def getWidgetTypes(scope: WidgetScope): js.Promise[WidgetTypesResponse] = js.native
    
    def replaceDashboard(dashboard: Dashboard, teamContext: TeamContext, dashboardId: String): js.Promise[Dashboard] = js.native
    
    def replaceDashboards(group: DashboardGroup, teamContext: TeamContext): js.Promise[DashboardGroup] = js.native
    
    def replaceWidget(widget: Widget, teamContext: TeamContext, dashboardId: String, widgetId: String): js.Promise[Widget] = js.native
    
    def updateWidget(widget: Widget, teamContext: TeamContext, dashboardId: String, widgetId: String): js.Promise[Widget] = js.native
  }
}
