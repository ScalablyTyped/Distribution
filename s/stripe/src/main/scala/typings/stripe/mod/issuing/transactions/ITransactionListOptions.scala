package typings.stripe.mod.issuing.transactions

import typings.stripe.mod.issuing.ICreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransactionListOptions extends js.Object {
  /**
    * Only return issuing transactions that belong to the given card.
    */
  var card: js.UndefOr[String] = js.native
  /**
    * Only return authorizations belonging to the given cardholder.
    */
  var cardholder: js.UndefOr[String] = js.native
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with the following options:
    */
  var created: js.UndefOr[ICreated] = js.native
  /**
    * Only return transactions that originate from a given dispute.
    */
  var dispute: js.UndefOr[String] = js.native
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in order to fetch the previous page of the list.
    */
  var ending_before: js.UndefOr[String] = js.native
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Only return transactions that are associated with the given settlement.
    */
  var settlement: js.UndefOr[String] = js.native
  /**
    * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order to fetch the next page of the list.
    */
  var starting_after: js.UndefOr[String] = js.native
}

object ITransactionListOptions {
  @scala.inline
  def apply(): ITransactionListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionListOptions]
  }
  @scala.inline
  implicit class ITransactionListOptionsOps[Self <: ITransactionListOptions] (val x: Self) extends AnyVal {
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
    def setCard(value: String): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setCardholder(value: String): Self = this.set("cardholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardholder: Self = this.set("cardholder", js.undefined)
    @scala.inline
    def setCreated(value: ICreated): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDispute(value: String): Self = this.set("dispute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDispute: Self = this.set("dispute", js.undefined)
    @scala.inline
    def setEnding_before(value: String): Self = this.set("ending_before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnding_before: Self = this.set("ending_before", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setSettlement(value: String): Self = this.set("settlement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettlement: Self = this.set("settlement", js.undefined)
    @scala.inline
    def setStarting_after(value: String): Self = this.set("starting_after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarting_after: Self = this.set("starting_after", js.undefined)
  }
  
}

