package typings
package vsoDashNodeDashApiLib.workapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWorkApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def createPlan(
    postedPlan: vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.CreatePlan,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.Plan] = js.native
  def deletePlan(project: java.lang.String, id: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteTeamIteration(teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext, id: java.lang.String): js.Promise[scala.Unit] = js.native
  def getBacklogConfigurations(teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BacklogConfiguration] = js.native
  def getBoard(teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext, id: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.Board] = js.native
  def getBoardCardRuleSettings(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    board: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardCardRuleSettings] = js.native
  def getBoardCardSettings(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    board: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardCardSettings] = js.native
  def getBoardChart(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    board: java.lang.String,
    name: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardChart] = js.native
  def getBoardCharts(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    board: java.lang.String
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardChartReference]] = js.native
  def getBoardColumns(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    board: java.lang.String
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardColumn]] = js.native
  def getBoardMappingParentItems(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    childBacklogContextCategoryRefName: java.lang.String,
    workitemIds: js.Array[scala.Double]
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.ParentChildWIMap]] = js.native
  def getBoardRows(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    board: java.lang.String
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardRow]] = js.native
  def getBoardUserSettings(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    board: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardUserSettings] = js.native
  def getBoards(teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardReference]] = js.native
  def getCapacities(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    iterationId: java.lang.String
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamMemberCapacity]] = js.native
  def getCapacity(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    iterationId: java.lang.String,
    teamMemberId: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamMemberCapacity] = js.native
  def getColumnSuggestedValues(): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardSuggestedValue]] = js.native
  def getColumnSuggestedValues(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardSuggestedValue]] = js.native
  def getDeliveryTimelineData(project: java.lang.String, id: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.DeliveryViewData] = js.native
  def getDeliveryTimelineData(project: java.lang.String, id: java.lang.String, revision: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.DeliveryViewData] = js.native
  def getDeliveryTimelineData(project: java.lang.String, id: java.lang.String, revision: scala.Double, startDate: stdLib.Date): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.DeliveryViewData] = js.native
  def getDeliveryTimelineData(
    project: java.lang.String,
    id: java.lang.String,
    revision: scala.Double,
    startDate: stdLib.Date,
    endDate: stdLib.Date
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.DeliveryViewData] = js.native
  def getPlan(project: java.lang.String, id: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.Plan] = js.native
  def getPlans(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.Plan]] = js.native
  def getProcessConfiguration(project: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.ProcessConfiguration] = js.native
  def getRowSuggestedValues(): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardSuggestedValue]] = js.native
  def getRowSuggestedValues(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardSuggestedValue]] = js.native
  def getTeamDaysOff(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    iterationId: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamSettingsDaysOff] = js.native
  def getTeamFieldValues(teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamFieldValues] = js.native
  def getTeamIteration(teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext, id: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamSettingsIteration] = js.native
  def getTeamIterations(teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamSettingsIteration]
  ] = js.native
  def getTeamIterations(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    timeframe: java.lang.String
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamSettingsIteration]
  ] = js.native
  def getTeamSettings(teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamSetting] = js.native
  def postTeamIteration(
    iteration: vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamSettingsIteration,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamSettingsIteration] = js.native
  def replaceCapacities(
    capacities: js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamMemberCapacity],
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    iterationId: java.lang.String
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamMemberCapacity]] = js.native
  def setBoardOptions(
    options: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    id: java.lang.String
  ): js.Promise[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.native
  def updateBoardCardRuleSettings(
    boardCardRuleSettings: vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardCardRuleSettings,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    board: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardCardRuleSettings] = js.native
  def updateBoardCardSettings(
    boardCardSettingsToSave: vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardCardSettings,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    board: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardCardSettings] = js.native
  def updateBoardChart(
    chart: vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardChart,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    board: java.lang.String,
    name: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardChart] = js.native
  def updateBoardColumns(
    boardColumns: js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardColumn],
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    board: java.lang.String
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardColumn]] = js.native
  def updateBoardRows(
    boardRows: js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardRow],
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    board: java.lang.String
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardRow]] = js.native
  def updateBoardUserSettings(
    boardUserSettings: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    board: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardUserSettings] = js.native
  def updateCapacity(
    patch: vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.CapacityPatch,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    iterationId: java.lang.String,
    teamMemberId: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamMemberCapacity] = js.native
  def updatePlan(
    updatedPlan: vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.UpdatePlan,
    project: java.lang.String,
    id: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.Plan] = js.native
  def updateTeamDaysOff(
    daysOffPatch: vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamSettingsDaysOffPatch,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    iterationId: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamSettingsDaysOff] = js.native
  def updateTeamFieldValues(
    patch: vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamFieldValuesPatch,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamFieldValues] = js.native
  def updateTeamSettings(
    teamSettingsPatch: vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamSettingsPatch,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TeamSetting] = js.native
}

