package typings.stripe.mod.bitcoinReceivers

import typings.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBitcoinReceiverListOptions extends IListOptions {
  /**
    * Filter for active receivers.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Filter for filled receivers.
    */
  var filled: js.UndefOr[Boolean] = js.native
  /**
    * Filter for receivers with uncaptured funds.
    */
  var uncaptured_funds: js.UndefOr[Boolean] = js.native
}

object IBitcoinReceiverListOptions {
  @scala.inline
  def apply(): IBitcoinReceiverListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBitcoinReceiverListOptions]
  }
  @scala.inline
  implicit class IBitcoinReceiverListOptionsOps[Self <: IBitcoinReceiverListOptions] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setFilled(value: Boolean): Self = this.set("filled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilled: Self = this.set("filled", js.undefined)
    @scala.inline
    def setUncaptured_funds(value: Boolean): Self = this.set("uncaptured_funds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUncaptured_funds: Self = this.set("uncaptured_funds", js.undefined)
  }
  
}

