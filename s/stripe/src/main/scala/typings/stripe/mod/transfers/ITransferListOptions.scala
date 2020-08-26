package typings.stripe.mod.transfers

import typings.stripe.mod.IDateFilter
import typings.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransferListOptions extends IListOptionsCreated {
  var date: js.UndefOr[IDateFilter] = js.native
  /**
    * Only return transfers for the destination specified by this
    * account ID.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * Only return transfers with the specified transfer group.
    */
  var transfer_group: js.UndefOr[String | Null] = js.native
}

object ITransferListOptions {
  @scala.inline
  def apply(): ITransferListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransferListOptions]
  }
  @scala.inline
  implicit class ITransferListOptionsOps[Self <: ITransferListOptions] (val x: Self) extends AnyVal {
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
    def setDate(value: IDateFilter): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setTransfer_group(value: String): Self = this.set("transfer_group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransfer_group: Self = this.set("transfer_group", js.undefined)
    @scala.inline
    def setTransfer_groupNull: Self = this.set("transfer_group", null)
  }
  
}

