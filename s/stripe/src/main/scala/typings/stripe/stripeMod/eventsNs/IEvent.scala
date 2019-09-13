package typings.stripe.stripeMod.eventsNs

import typings.stripe.Anon_Id
import typings.stripe.Anon_Object
import typings.stripe.stripeMod.IResourceObject
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
  var data: Anon_Object
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
  var request: Anon_Id
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
    data: Anon_Object,
    id: String,
    livemode: Boolean,
    `object`: event,
    pending_webhooks: Double,
    request: Anon_Id,
    `type`: String,
    account: String = null
  ): IEvent = {
    val __obj = js.Dynamic.literal(api_version = api_version, created = created, data = data, id = id, livemode = livemode, pending_webhooks = pending_webhooks, request = request)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (account != null) __obj.updateDynamic("account")(account)
    __obj.asInstanceOf[IEvent]
  }
}

