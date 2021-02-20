package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliveryViewData extends PlanViewData {
  
  /**
    * Work item child id to parenet id map
    */
  var childIdToParentIdMap: NumberDictionary[Double] = js.native
  
  /**
    * Filter criteria status of the timeline
    */
  var criteriaStatus: TimelineCriteriaStatus = js.native
  
  /**
    * The end date of the delivery view data
    */
  var endDate: Date = js.native
  
  /**
    * The start date for the delivery view data
    */
  var startDate: Date = js.native
  
  /**
    * All the team data
    */
  var teams: js.Array[TimelineTeamData] = js.native
}
object DeliveryViewData {
  
  @scala.inline
  def apply(
    childIdToParentIdMap: NumberDictionary[Double],
    criteriaStatus: TimelineCriteriaStatus,
    endDate: Date,
    id: String,
    revision: Double,
    startDate: Date,
    teams: js.Array[TimelineTeamData]
  ): DeliveryViewData = {
    val __obj = js.Dynamic.literal(childIdToParentIdMap = childIdToParentIdMap.asInstanceOf[js.Any], criteriaStatus = criteriaStatus.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryViewData]
  }
  
  @scala.inline
  implicit class DeliveryViewDataMutableBuilder[Self <: DeliveryViewData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildIdToParentIdMap(value: NumberDictionary[Double]): Self = StObject.set(x, "childIdToParentIdMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaStatus(value: TimelineCriteriaStatus): Self = StObject.set(x, "criteriaStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeams(value: js.Array[TimelineTeamData]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsVarargs(value: TimelineTeamData*): Self = StObject.set(x, "teams", js.Array(value :_*))
  }
}
