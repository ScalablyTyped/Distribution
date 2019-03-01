package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryViewData extends PlanViewData {
  /**
    * Work item child id to parenet id map
    */
  var childIdToParentIdMap: org.scalablytyped.runtime.NumberDictionary[scala.Double]
  /**
    * Filter criteria status of the timeline
    */
  var criteriaStatus: TimelineCriteriaStatus
  /**
    * The end date of the delivery view data
    */
  var endDate: stdLib.Date
  /**
    * The start date for the delivery view data
    */
  var startDate: stdLib.Date
  /**
    * All the team data
    */
  var teams: js.Array[TimelineTeamData]
}

object DeliveryViewData {
  @scala.inline
  def apply(
    childIdToParentIdMap: org.scalablytyped.runtime.NumberDictionary[scala.Double],
    criteriaStatus: TimelineCriteriaStatus,
    endDate: stdLib.Date,
    id: java.lang.String,
    revision: scala.Double,
    startDate: stdLib.Date,
    teams: js.Array[TimelineTeamData]
  ): DeliveryViewData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childIdToParentIdMap")(childIdToParentIdMap)
    __obj.updateDynamic("criteriaStatus")(criteriaStatus)
    __obj.updateDynamic("endDate")(endDate)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("startDate")(startDate)
    __obj.updateDynamic("teams")(teams)
    __obj.asInstanceOf[DeliveryViewData]
  }
}

