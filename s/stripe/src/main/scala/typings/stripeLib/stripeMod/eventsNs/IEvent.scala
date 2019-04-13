package typings
package stripeLib.stripeMod.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent
  extends stripeLib.stripeMod.IResourceObject {
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
    val __obj = js.Dynamic.literal(api_version = api_version, created = created, data = data, id = id, livemode = livemode, pending_webhooks = pending_webhooks)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (request != null) __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[IEvent]
  }
}

