package typings.vsoNodeApi

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.coreInterfacesMod.TeamContext
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.workInterfacesMod.BacklogConfiguration
import typings.vsoNodeApi.workInterfacesMod.Board
import typings.vsoNodeApi.workInterfacesMod.BoardCardRuleSettings
import typings.vsoNodeApi.workInterfacesMod.BoardCardSettings
import typings.vsoNodeApi.workInterfacesMod.BoardChart
import typings.vsoNodeApi.workInterfacesMod.BoardChartReference
import typings.vsoNodeApi.workInterfacesMod.BoardColumn
import typings.vsoNodeApi.workInterfacesMod.BoardReference
import typings.vsoNodeApi.workInterfacesMod.BoardRow
import typings.vsoNodeApi.workInterfacesMod.BoardSuggestedValue
import typings.vsoNodeApi.workInterfacesMod.BoardUserSettings
import typings.vsoNodeApi.workInterfacesMod.CapacityPatch
import typings.vsoNodeApi.workInterfacesMod.CreatePlan
import typings.vsoNodeApi.workInterfacesMod.DeliveryViewData
import typings.vsoNodeApi.workInterfacesMod.ParentChildWIMap
import typings.vsoNodeApi.workInterfacesMod.Plan
import typings.vsoNodeApi.workInterfacesMod.ProcessConfiguration
import typings.vsoNodeApi.workInterfacesMod.TeamFieldValues
import typings.vsoNodeApi.workInterfacesMod.TeamFieldValuesPatch
import typings.vsoNodeApi.workInterfacesMod.TeamMemberCapacity
import typings.vsoNodeApi.workInterfacesMod.TeamSetting
import typings.vsoNodeApi.workInterfacesMod.TeamSettingsDaysOff
import typings.vsoNodeApi.workInterfacesMod.TeamSettingsDaysOffPatch
import typings.vsoNodeApi.workInterfacesMod.TeamSettingsIteration
import typings.vsoNodeApi.workInterfacesMod.TeamSettingsPatch
import typings.vsoNodeApi.workInterfacesMod.UpdatePlan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workApiMod {
  
  @JSImport("vso-node-api/WorkApi", "WorkApi")
  @js.native
  open class WorkApi protected () extends IWorkApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
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
    def getDeliveryTimelineData(project: String, id: String, revision: Double, startDate: js.Date): js.Promise[DeliveryViewData] = js.native
    def getDeliveryTimelineData(project: String, id: String, revision: Double, startDate: js.Date, endDate: js.Date): js.Promise[DeliveryViewData] = js.native
    def getDeliveryTimelineData(project: String, id: String, revision: Double, startDate: Unit, endDate: js.Date): js.Promise[DeliveryViewData] = js.native
    def getDeliveryTimelineData(project: String, id: String, revision: Unit, startDate: js.Date): js.Promise[DeliveryViewData] = js.native
    def getDeliveryTimelineData(project: String, id: String, revision: Unit, startDate: js.Date, endDate: js.Date): js.Promise[DeliveryViewData] = js.native
    def getDeliveryTimelineData(project: String, id: String, revision: Unit, startDate: Unit, endDate: js.Date): js.Promise[DeliveryViewData] = js.native
    
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
}
