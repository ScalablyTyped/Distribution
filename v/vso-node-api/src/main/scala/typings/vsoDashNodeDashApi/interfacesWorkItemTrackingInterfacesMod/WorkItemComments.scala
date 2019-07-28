package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

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
    val __obj = js.Dynamic.literal(comments = comments, count = count, fromRevisionCount = fromRevisionCount, totalCount = totalCount)
  
    __obj.asInstanceOf[WorkItemComments]
  }
}

