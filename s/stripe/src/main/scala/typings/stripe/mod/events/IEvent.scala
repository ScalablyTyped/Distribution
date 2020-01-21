package typings.stripe.mod.events

import typings.stripe.AnonId
import typings.stripe.AnonKey
import typings.stripe.mod.IResourceObject
import typings.stripe.stripeStrings.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends IResourceObject {
  /**
    * The connected account that originated the event.
    * CONNECT ONLY
    */
  var account: js.UndefOr[String] = js.undefined
  /**
    * The Stripe API version used to render data.
    * Note: this property is populated for events on or after October 31, 2014.
    */
  var api_version: String
  var created: Double
  /**
    * Hash containing data associated with the event.
    */
  var data: AnonKey
  var livemode: Boolean
  /**
    * Value is "event"
    */
  @JSName("object")
  var object_IEvent: event
  /**
    * Number of webhooks yet to be delivered successfully (return a 20x response) to the URLs you’ve specified.
    *
    * positive integer or zero
    */
  var pending_webhooks: Double
  /**
    * Information on the API request that instigated the event.
    */
  var request: AnonId
  /**
    * Description of the event: e.g. invoice.created, charge.refunded, etc.
    */
  var `type`: String
}

object IEvent {
  @scala.inline
  def apply(
    api_version: String,
    created: Double,
    data: AnonKey,
    id: String,
    livemode: Boolean,
    `object`: event,
    pending_webhooks: Double,
    request: AnonId,
    `type`: String,
    account: String = null
  ): IEvent = {
    val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], pending_webhooks = pending_webhooks.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
}

