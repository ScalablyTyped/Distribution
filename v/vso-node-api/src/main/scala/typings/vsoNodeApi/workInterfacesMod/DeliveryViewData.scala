package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryViewData
  extends StObject
     with PlanViewData {
  
  /**
    * Work item child id to parenet id map
    */
  var childIdToParentIdMap: NumberDictionary[Double]
  
  /**
    * Filter criteria status of the timeline
    */
  var criteriaStatus: TimelineCriteriaStatus
  
  /**
    * The end date of the delivery view data
    */
  var endDate: js.Date
  
  /**
    * The start date for the delivery view data
    */
  var startDate: js.Date
  
  /**
    * All the team data
    */
  var teams: js.Array[TimelineTeamData]
}
object DeliveryViewData {
  
  inline def apply(
    childIdToParentIdMap: NumberDictionary[Double],
    criteriaStatus: TimelineCriteriaStatus,
    endDate: js.Date,
    id: String,
    revision: Double,
    startDate: js.Date,
    teams: js.Array[TimelineTeamData]
  ): DeliveryViewData = {
    val __obj = js.Dynamic.literal(childIdToParentIdMap = childIdToParentIdMap.asInstanceOf[js.Any], criteriaStatus = criteriaStatus.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryViewData]
  }
  
  extension [Self <: DeliveryViewData](x: Self) {
    
    inline def setChildIdToParentIdMap(value: NumberDictionary[Double]): Self = StObject.set(x, "childIdToParentIdMap", value.asInstanceOf[js.Any])
    
    inline def setCriteriaStatus(value: TimelineCriteriaStatus): Self = StObject.set(x, "criteriaStatus", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setTeams(value: js.Array[TimelineTeamData]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsVarargs(value: TimelineTeamData*): Self = StObject.set(x, "teams", js.Array(value*))
  }
}
