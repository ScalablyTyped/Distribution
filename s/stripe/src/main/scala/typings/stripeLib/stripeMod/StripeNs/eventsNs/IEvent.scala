package typings
package stripeLib.stripeMod.StripeNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
    * The Stripe API version used to render data.
    * Note: this property is populated for events on or after October 31, 2014.
    */
  var api_version: java.lang.String
  var created: scala.Double
  /**
    * Hash containing data associated with the event.
    */
  var data: stripeLib.Anon_Object
  var livemode: scala.Boolean
  /**
    * Value is "event"
    */
  @JSName("object")
  var object_IEvent: stripeLib.stripeLibStrings.event
  /**
    * Number of webhooks yet to be delivered successfully (return a 20x response) to the URLs you’ve specified.
    *
    * positive integer or zero
    */
  var pending_webhooks: scala.Double
  /**
    * ID of the API request that caused the event. If null, the event was
    * automatic (e.g. Stripe’s automatic subscription handling). Request logs are
    * available in the dashboard but currently not in the API. Note: this property
    * is populated for events on or after April 23, 2013.
    */
  var request: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Description of the event: e.g. invoice.created, charge.refunded, etc.
    */
  var `type`: java.lang.String
}

object IEvent {
  @scala.inline
  def apply(
    api_version: java.lang.String,
    created: scala.Double,
    data: stripeLib.Anon_Object,
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: stripeLib.stripeLibStrings.event,
    pending_webhooks: scala.Double,
    `type`: java.lang.String,
    request: java.lang.String = null
  ): IEvent = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`)
    __obj.updateDynamic("api_version")(api_version)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("livemode")(livemode)
    __obj.updateDynamic("pending_webhooks")(pending_webhooks)
    if (request != null) __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[IEvent]
  }
}

