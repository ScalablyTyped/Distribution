package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineTeamIteration extends js.Object {
  /**
    * The end date of the iteration
    */
  var finishDate: stdLib.Date
  /**
    * The iteration name
    */
  var name: java.lang.String
  /**
    * All the partially paged workitems in this iteration.
    */
  var partiallyPagedWorkItems: js.Array[js.Array[_]]
  /**
    * The iteration path
    */
  var path: java.lang.String
  /**
    * The start date of the iteration
    */
  var startDate: stdLib.Date
  /**
    * The status of this iteration
    */
  var status: TimelineIterationStatus
  /**
    * The work items that have been paged in this iteration
    */
  var workItems: js.Array[js.Array[_]]
}

object TimelineTeamIteration {
  @scala.inline
  def apply(
    finishDate: stdLib.Date,
    name: java.lang.String,
    partiallyPagedWorkItems: js.Array[js.Array[_]],
    path: java.lang.String,
    startDate: stdLib.Date,
    status: TimelineIterationStatus,
    workItems: js.Array[js.Array[_]]
  ): TimelineTeamIteration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("finishDate")(finishDate)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("partiallyPagedWorkItems")(partiallyPagedWorkItems)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("startDate")(startDate)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("workItems")(workItems)
    __obj.asInstanceOf[TimelineTeamIteration]
  }
}

