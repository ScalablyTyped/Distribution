package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountMyWorkResult extends js.Object {
  /**
    * True, when length of WorkItemDetails is same as the limit
    */
  var querySizeLimitExceeded: Boolean = js.native
  /**
    * WorkItem Details
    */
  var workItemDetails: js.Array[AccountWorkWorkItemModel] = js.native
}

object AccountMyWorkResult {
  @scala.inline
  def apply(querySizeLimitExceeded: Boolean, workItemDetails: js.Array[AccountWorkWorkItemModel]): AccountMyWorkResult = {
    val __obj = js.Dynamic.literal(querySizeLimitExceeded = querySizeLimitExceeded.asInstanceOf[js.Any], workItemDetails = workItemDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountMyWorkResult]
  }
  @scala.inline
  implicit class AccountMyWorkResultOps[Self <: AccountMyWorkResult] (val x: Self) extends AnyVal {
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
    def setQuerySizeLimitExceeded(value: Boolean): Self = this.set("querySizeLimitExceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkItemDetailsVarargs(value: AccountWorkWorkItemModel*): Self = this.set("workItemDetails", js.Array(value :_*))
    @scala.inline
    def setWorkItemDetails(value: js.Array[AccountWorkWorkItemModel]): Self = this.set("workItemDetails", value.asInstanceOf[js.Any])
  }
  
}

