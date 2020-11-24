package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Date
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
  implicit class DeliveryViewDataOps[Self <: DeliveryViewData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildIdToParentIdMap(value: NumberDictionary[Double]): Self = this.set("childIdToParentIdMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaStatus(value: TimelineCriteriaStatus): Self = this.set("criteriaStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsVarargs(value: TimelineTeamData*): Self = this.set("teams", js.Array(value :_*))
    
    @scala.inline
    def setTeams(value: js.Array[TimelineTeamData]): Self = this.set("teams", value.asInstanceOf[js.Any])
  }
}
