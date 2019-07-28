package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryViewData extends PlanViewData {
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
  var endDate: Date
  /**
    * The start date for the delivery view data
    */
  var startDate: Date
  /**
    * All the team data
    */
  var teams: js.Array[TimelineTeamData]
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
    val __obj = js.Dynamic.literal(childIdToParentIdMap = childIdToParentIdMap, criteriaStatus = criteriaStatus, endDate = endDate, id = id, revision = revision, startDate = startDate, teams = teams)
  
    __obj.asInstanceOf[DeliveryViewData]
  }
}

