package typings.stripe.mod.issuing.cardholders

import typings.stripe.mod.issuing.ICreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardholderListOptions extends js.Object {
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp, or it can be a
    * dictionary with the following options:
    */
  var created: js.UndefOr[String | ICreated] = js.undefined
  /**
    * Only return cardholders that have the given email address.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in order to fetch the previous page of the list.
    */
  var ending_before: js.UndefOr[String] = js.undefined
  /**
    * Only return the default cardholder.
    */
  var is_default: js.UndefOr[Boolean] = js.undefined
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * Only return cardholders that have the given phone number.
    */
  var phone_number: js.UndefOr[String] = js.undefined
  /**
    * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order to fetch the next page of the list.
    */
  var starting_after: js.UndefOr[String] = js.undefined
  /**
    * Only return cardholders that have the given status. One of active, inactive, or blocked.
    */
  var status: js.UndefOr[CardholderStatus] = js.undefined
  /**
    * Only return cardholders that have the given type. One of individual or business_entity.
    */
  var `type`: js.UndefOr[CardholderType] = js.undefined
}

object ICardholderListOptions {
  @scala.inline
  def apply(
    created: String | ICreated = null,
    email: String = null,
    ending_before: String = null,
    is_default: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    phone_number: String = null,
    starting_after: String = null,
    status: CardholderStatus = null,
    `type`: CardholderType = null
  ): ICardholderListOptions = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (!js.isUndefined(is_default)) __obj.updateDynamic("is_default")(is_default.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholderListOptions]
  }
}

