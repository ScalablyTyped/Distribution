package typings.stripe.mod.issuing.cards

import typings.stripe.mod.issuing.ICreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns a list of Issuing Card objects. The objects are sorted in descending order by creation date,
  * with the most recently created object appearing first.
  */
trait IIssuingCardListOptions extends js.Object {
  /**
    * Only return cards belonging to the Cardholder with the provided ID.
    */
  var cardholder: js.UndefOr[String] = js.undefined
  /**
    * A filter on the list based on the object created field.
    * The value can be a string with an integer Unix timestamp, or it can be a dictionary with the following options:
    */
  var created: js.UndefOr[String | ICreated] = js.undefined
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list.
    * For instance, if you make a list request and receive 100 objects, starting with obj_bar,
    * your subsequent call can include ending_before=obj_bar in order to fetch the previous page of the list.
    */
  var ending_before: js.UndefOr[String] = js.undefined
  /**
    * Only return cards that have the given expiration month.
    */
  var exp_month: js.UndefOr[Double] = js.undefined
  /**
    * Only return cards that have the given expiration year.
    */
  var exp_year: js.UndefOr[Double] = js.undefined
  /**
    * Only return cards that have the given last four digits.
    */
  var last4: js.UndefOr[String] = js.undefined
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * Only return cards that have the given name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Only return cards whose full card number matches that of this card source ID.
    */
  var source: js.UndefOr[String] = js.undefined
  /**
    * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order to fetch the next page of the list.
    */
  var starting_after: js.UndefOr[String] = js.undefined
  /**
    * Only return cards that have the given status. One of active, inactive, canceled, lost, or stolen.
    */
  var status: js.UndefOr[IssuingCardStatus] = js.undefined
  /**
    * Only return cards that have the given type. One of virtual or physical.
    */
  var `type`: js.UndefOr[IssuingCardType] = js.undefined
}

object IIssuingCardListOptions {
  @scala.inline
  def apply(
    cardholder: String = null,
    created: String | ICreated = null,
    ending_before: String = null,
    exp_month: Int | Double = null,
    exp_year: Int | Double = null,
    last4: String = null,
    limit: Int | Double = null,
    name: String = null,
    source: String = null,
    starting_after: String = null,
    status: IssuingCardStatus = null,
    `type`: IssuingCardType = null
  ): IIssuingCardListOptions = {
    val __obj = js.Dynamic.literal()
    if (cardholder != null) __obj.updateDynamic("cardholder")(cardholder.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (exp_month != null) __obj.updateDynamic("exp_month")(exp_month.asInstanceOf[js.Any])
    if (exp_year != null) __obj.updateDynamic("exp_year")(exp_year.asInstanceOf[js.Any])
    if (last4 != null) __obj.updateDynamic("last4")(last4.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCardListOptions]
  }
}

