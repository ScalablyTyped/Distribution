package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountMyWorkResult extends js.Object {
  /**
    * True, when length of WorkItemDetails is same as the limit
    */
  var querySizeLimitExceeded: Boolean
  /**
    * WorkItem Details
    */
  var workItemDetails: js.Array[AccountWorkWorkItemModel]
}

object AccountMyWorkResult {
  @scala.inline
  def apply(querySizeLimitExceeded: Boolean, workItemDetails: js.Array[AccountWorkWorkItemModel]): AccountMyWorkResult = {
    val __obj = js.Dynamic.literal(querySizeLimitExceeded = querySizeLimitExceeded.asInstanceOf[js.Any], workItemDetails = workItemDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountMyWorkResult]
  }
}

