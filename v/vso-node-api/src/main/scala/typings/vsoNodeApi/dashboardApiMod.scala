package typings.vsoNodeApi

import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.interfacesCoreInterfacesMod.TeamContext
import typings.vsoNodeApi.interfacesDashboardInterfacesMod.Dashboard
import typings.vsoNodeApi.interfacesDashboardInterfacesMod.DashboardGroup
import typings.vsoNodeApi.interfacesDashboardInterfacesMod.Widget
import typings.vsoNodeApi.interfacesDashboardInterfacesMod.WidgetMetadataResponse
import typings.vsoNodeApi.interfacesDashboardInterfacesMod.WidgetScope
import typings.vsoNodeApi.interfacesDashboardInterfacesMod.WidgetTypesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dashboardApiMod {
  
  @JSImport("vso-node-api/DashboardApi", "DashboardApi")
  @js.native
  open class DashboardApi protected () extends IDashboardApi {
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
