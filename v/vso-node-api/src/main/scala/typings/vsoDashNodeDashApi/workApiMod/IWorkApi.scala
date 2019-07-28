package typings.vsoDashNodeDashApi.workApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamContext
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BacklogConfiguration
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.Board
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardCardRuleSettings
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardCardSettings
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardChart
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardChartReference
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardColumn
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardReference
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardRow
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardSuggestedValue
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardUserSettings
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.CapacityPatch
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.CreatePlan
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.DeliveryViewData
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.ParentChildWIMap
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.Plan
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.ProcessConfiguration
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamFieldValues
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamFieldValuesPatch
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamMemberCapacity
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamSetting
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamSettingsDaysOff
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamSettingsDaysOffPatch
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamSettingsIteration
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamSettingsPatch
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.UpdatePlan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWorkApi extends ClientApiBase {
  def createPlan(postedPlan: CreatePlan, project: String): js.Promise[Plan] = js.native
  def deletePlan(project: String, id: String): js.Promise[Unit] = js.native
  def deleteTeamIteration(teamContext: TeamContext, id: String): js.Promise[Unit] = js.native
  def getBacklogConfigurations(teamContext: TeamContext): js.Promise[BacklogConfiguration] = js.native
  def getBoard(teamContext: TeamContext, id: String): js.Promise[Board] = js.native
  def getBoardCardRuleSettings(teamContext: TeamContext, board: String): js.Promise[BoardCardRuleSettings] = js.native
  def getBoardCardSettings(teamContext: TeamContext, board: String): js.Promise[BoardCardSettings] = js.native
  def getBoardChart(teamContext: TeamContext, board: String, name: String): js.Promise[BoardChart] = js.native
  def getBoardCharts(teamContext: TeamContext, board: String): js.Promise[js.Array[BoardChartReference]] = js.native
  def getBoardColumns(teamContext: TeamContext, board: String): js.Promise[js.Array[BoardColumn]] = js.native
  def getBoardMappingParentItems(
    teamContext: TeamContext,
    childBacklogContextCategoryRefName: String,
    workitemIds: js.Array[Double]
  ): js.Promise[js.Array[ParentChildWIMap]] = js.native
  def getBoardRows(teamContext: TeamContext, board: String): js.Promise[js.Array[BoardRow]] = js.native
  def getBoardUserSettings(teamContext: TeamContext, board: String): js.Promise[BoardUserSettings] = js.native
  def getBoards(teamContext: TeamContext): js.Promise[js.Array[BoardReference]] = js.native
  def getCapacities(teamContext: TeamContext, iterationId: String): js.Promise[js.Array[TeamMemberCapacity]] = js.native
  def getCapacity(teamContext: TeamContext, iterationId: String, teamMemberId: String): js.Promise[TeamMemberCapacity] = js.native
  def getColumnSuggestedValues(): js.Promise[js.Array[BoardSuggestedValue]] = js.native
  def getColumnSuggestedValues(project: String): js.Promise[js.Array[BoardSuggestedValue]] = js.native
  def getDeliveryTimelineData(project: String, id: String): js.Promise[DeliveryViewData] = js.native
  def getDeliveryTimelineData(project: String, id: String, revision: Double): js.Promise[DeliveryViewData] = js.native
  def getDeliveryTimelineData(project: String, id: String, revision: Double, startDate: Date): js.Promise[DeliveryViewData] = js.native
  def getDeliveryTimelineData(project: String, id: String, revision: Double, startDate: Date, endDate: Date): js.Promise[DeliveryViewData] = js.native
  def getPlan(project: String, id: String): js.Promise[Plan] = js.native
  def getPlans(project: String): js.Promise[js.Array[Plan]] = js.native
  def getProcessConfiguration(project: String): js.Promise[ProcessConfiguration] = js.native
  def getRowSuggestedValues(): js.Promise[js.Array[BoardSuggestedValue]] = js.native
  def getRowSuggestedValues(project: String): js.Promise[js.Array[BoardSuggestedValue]] = js.native
  def getTeamDaysOff(teamContext: TeamContext, iterationId: String): js.Promise[TeamSettingsDaysOff] = js.native
  def getTeamFieldValues(teamContext: TeamContext): js.Promise[TeamFieldValues] = js.native
  def getTeamIteration(teamContext: TeamContext, id: String): js.Promise[TeamSettingsIteration] = js.native
  def getTeamIterations(teamContext: TeamContext): js.Promise[js.Array[TeamSettingsIteration]] = js.native
  def getTeamIterations(teamContext: TeamContext, timeframe: String): js.Promise[js.Array[TeamSettingsIteration]] = js.native
  def getTeamSettings(teamContext: TeamContext): js.Promise[TeamSetting] = js.native
  def postTeamIteration(iteration: TeamSettingsIteration, teamContext: TeamContext): js.Promise[TeamSettingsIteration] = js.native
  def replaceCapacities(capacities: js.Array[TeamMemberCapacity], teamContext: TeamContext, iterationId: String): js.Promise[js.Array[TeamMemberCapacity]] = js.native
  def setBoardOptions(options: StringDictionary[String], teamContext: TeamContext, id: String): js.Promise[StringDictionary[String]] = js.native
  def updateBoardCardRuleSettings(boardCardRuleSettings: BoardCardRuleSettings, teamContext: TeamContext, board: String): js.Promise[BoardCardRuleSettings] = js.native
  def updateBoardCardSettings(boardCardSettingsToSave: BoardCardSettings, teamContext: TeamContext, board: String): js.Promise[BoardCardSettings] = js.native
  def updateBoardChart(chart: BoardChart, teamContext: TeamContext, board: String, name: String): js.Promise[BoardChart] = js.native
  def updateBoardColumns(boardColumns: js.Array[BoardColumn], teamContext: TeamContext, board: String): js.Promise[js.Array[BoardColumn]] = js.native
  def updateBoardRows(boardRows: js.Array[BoardRow], teamContext: TeamContext, board: String): js.Promise[js.Array[BoardRow]] = js.native
  def updateBoardUserSettings(boardUserSettings: StringDictionary[String], teamContext: TeamContext, board: String): js.Promise[BoardUserSettings] = js.native
  def updateCapacity(patch: CapacityPatch, teamContext: TeamContext, iterationId: String, teamMemberId: String): js.Promise[TeamMemberCapacity] = js.native
  def updatePlan(updatedPlan: UpdatePlan, project: String, id: String): js.Promise[Plan] = js.native
  def updateTeamDaysOff(daysOffPatch: TeamSettingsDaysOffPatch, teamContext: TeamContext, iterationId: String): js.Promise[TeamSettingsDaysOff] = js.native
  def updateTeamFieldValues(patch: TeamFieldValuesPatch, teamContext: TeamContext): js.Promise[TeamFieldValues] = js.native
  def updateTeamSettings(teamSettingsPatch: TeamSettingsPatch, teamContext: TeamContext): js.Promise[TeamSetting] = js.native
}

