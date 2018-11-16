package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def list(): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.eventsNs.IEventListOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]] = js.native
  /**
               * List events, going back up to 30 days.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.eventsNs.IEventListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]] = js.native
  /**
               * List events, going back up to 30 days.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.eventsNs.IEventListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.eventsNs.IEventListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]] = js.native
  def retrieve(id: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.eventsNs.IEvent] = js.native
  def retrieve(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.eventsNs.IEvent] = js.native
  /**
               * Retrieves the details of an event. Supply the unique identifier of the event, which you might have
               * received in a webhook.
               */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.eventsNs.IEvent] = js.native
  /**
               * Retrieves the details of an event. Supply the unique identifier of the event, which you might have
               * received in a webhook.
               */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.eventsNs.IEvent] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.eventsNs.IEvent] = js.native
  def retrieve(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.eventsNs.IEvent] = js.native
  def retrieve(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.eventsNs.IEvent] = js.native
  def retrieve(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.eventsNs.IEvent]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.eventsNs.IEvent] = js.native
}

