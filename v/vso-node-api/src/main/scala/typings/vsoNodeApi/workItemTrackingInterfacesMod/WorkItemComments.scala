package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemComments extends js.Object {
  /**
    * Comments collection.
    */
  var comments: js.Array[WorkItemComment]
  /**
    * The count of comments.
    */
  var count: Double
  /**
    * Count of comments from the revision.
    */
  var fromRevisionCount: Double
  /**
    * Total count of comments.
    */
  var totalCount: Double
}

object WorkItemComments {
  @scala.inline
  def apply(comments: js.Array[WorkItemComment], count: Double, fromRevisionCount: Double, totalCount: Double): WorkItemComments = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], fromRevisionCount = fromRevisionCount.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemComments]
  }
}

