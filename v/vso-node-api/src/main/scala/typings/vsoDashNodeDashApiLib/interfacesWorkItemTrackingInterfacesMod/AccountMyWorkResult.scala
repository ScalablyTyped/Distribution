package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountMyWorkResult extends js.Object {
  /**
    * True, when length of WorkItemDetails is same as the limit
    */
  var querySizeLimitExceeded: scala.Boolean
  /**
    * WorkItem Details
    */
  var workItemDetails: js.Array[AccountWorkWorkItemModel]
}

object AccountMyWorkResult {
  @scala.inline
  def apply(querySizeLimitExceeded: scala.Boolean, workItemDetails: js.Array[AccountWorkWorkItemModel]): AccountMyWorkResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("querySizeLimitExceeded")(querySizeLimitExceeded)
    __obj.updateDynamic("workItemDetails")(workItemDetails)
    __obj.asInstanceOf[AccountMyWorkResult]
  }
}

