package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeliveryViewData extends PlanViewData {
  /**
       * Work item child id to parenet id map
       */
  var childIdToParentIdMap: ScalablyTyped.runtime.NumberDictionary[scala.Double]
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

