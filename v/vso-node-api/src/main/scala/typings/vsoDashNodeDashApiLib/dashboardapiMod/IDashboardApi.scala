package typings
package vsoDashNodeDashApiLib.dashboardapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDashboardApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def createDashboard(
    dashboard: vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.Dashboard,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.Dashboard] = js.native
  def createWidget(
    widget: vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.Widget,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    dashboardId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.Widget] = js.native
  def deleteDashboard(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    dashboardId: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def deleteWidget(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    dashboardId: java.lang.String,
    widgetId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.Dashboard] = js.native
  def getDashboard(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    dashboardId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.Dashboard] = js.native
  def getDashboards(teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext): stdLib.Promise[vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.DashboardGroup] = js.native
  def getWidget(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    dashboardId: java.lang.String,
    widgetId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.Widget] = js.native
  def getWidgetMetadata(contributionId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.WidgetMetadataResponse] = js.native
  def getWidgetTypes(scope: vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.WidgetScope): stdLib.Promise[vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.WidgetTypesResponse] = js.native
  def replaceDashboard(
    dashboard: vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.Dashboard,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    dashboardId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.Dashboard] = js.native
  def replaceDashboards(
    group: vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.DashboardGroup,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.DashboardGroup] = js.native
  def replaceWidget(
    widget: vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.Widget,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    dashboardId: java.lang.String,
    widgetId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.Widget] = js.native
  def updateWidget(
    widget: vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.Widget,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    dashboardId: java.lang.String,
    widgetId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod.Widget] = js.native
}

