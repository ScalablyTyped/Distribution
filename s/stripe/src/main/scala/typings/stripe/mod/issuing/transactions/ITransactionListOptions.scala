package typings.stripe.mod.issuing.transactions

import typings.stripe.mod.issuing.ICreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransactionListOptions extends js.Object {
  /**
    * Only return issuing transactions that belong to the given card.
    */
  var card: js.UndefOr[String] = js.undefined
  /**
    * Only return authorizations belonging to the given cardholder.
    */
  var cardholder: js.UndefOr[String] = js.undefined
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with the following options:
    */
  var created: js.UndefOr[ICreated] = js.undefined
  /**
    * Only return transactions that originate from a given dispute.
    */
  var dispute: js.UndefOr[String] = js.undefined
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in order to fetch the previous page of the list.
    */
  var ending_before: js.UndefOr[String] = js.undefined
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * Only return transactions that are associated with the given settlement.
    */
  var settlement: js.UndefOr[String] = js.undefined
  /**
    * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order to fetch the next page of the list.
    */
  var starting_after: js.UndefOr[String] = js.undefined
}

object ITransactionListOptions {
  @scala.inline
  def apply(
    card: String = null,
    cardholder: String = null,
    created: ICreated = null,
    dispute: String = null,
    ending_before: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    settlement: String = null,
    starting_after: String = null
  ): ITransactionListOptions = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (cardholder != null) __obj.updateDynamic("cardholder")(cardholder.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (dispute != null) __obj.updateDynamic("dispute")(dispute.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (settlement != null) __obj.updateDynamic("settlement")(settlement.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransactionListOptions]
  }
}

