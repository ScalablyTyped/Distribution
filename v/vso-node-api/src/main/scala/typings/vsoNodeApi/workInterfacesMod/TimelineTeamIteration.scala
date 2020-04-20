package typings.vsoNodeApi.workInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineTeamIteration extends js.Object {
  /**
    * The end date of the iteration
    */
  var finishDate: Date
  /**
    * The iteration name
    */
  var name: String
  /**
    * All the partially paged workitems in this iteration.
    */
  var partiallyPagedWorkItems: js.Array[js.Array[_]]
  /**
    * The iteration path
    */
  var path: String
  /**
    * The start date of the iteration
    */
  var startDate: Date
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
    finishDate: Date,
    name: String,
    partiallyPagedWorkItems: js.Array[js.Array[_]],
    path: String,
    startDate: Date,
    status: TimelineIterationStatus,
    workItems: js.Array[js.Array[_]]
  ): TimelineTeamIteration = {
    val __obj = js.Dynamic.literal(finishDate = finishDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partiallyPagedWorkItems = partiallyPagedWorkItems.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineTeamIteration]
  }
}

