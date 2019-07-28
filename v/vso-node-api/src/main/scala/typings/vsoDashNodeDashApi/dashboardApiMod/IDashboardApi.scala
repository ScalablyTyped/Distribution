package typings.vsoDashNodeDashApi.dashboardApiMod

import typings.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamContext
import typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.Dashboard
import typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.DashboardGroup
import typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.Widget
import typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.WidgetMetadataResponse
import typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.WidgetScope
import typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.WidgetTypesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

