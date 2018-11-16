package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disputes
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def close(disputeId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
  /**
               * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
               * essentially ‘dismissing’ the dispute, acknowledging it as lost
               *
               * The status of the dispute will change from needs_response to lost.
               *
               * *Closing a dispute is irreversible!*
               */
  def close(disputeId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
  /**
               * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
               * essentially ‘dismissing’ the dispute, acknowledging it as lost
               *
               * The status of the dispute will change from needs_response to lost.
               *
               * *Closing a dispute is irreversible!*
               */
  def close(
    disputeId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
  def close(
    disputeId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
   //TODO: Implement placeholder method
  def getMetadata(): scala.Unit = js.native
  def list(): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.IListOptionsCreated): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ] = js.native
  /**
               * Returns a list of your disputes.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptionsCreated,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ] = js.native
  /**
               * Returns a list of your disputes.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptionsCreated,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptionsCreated,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ] = js.native
  def retrieve(disputeId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
  def retrieve(disputeId: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
  /**
               * Retrieves the dispute with the given ID.
               */
  def retrieve(
    disputeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
  /**
               * Retrieves the dispute with the given ID.
               */
  def retrieve(
    disputeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
  def retrieve(
    disputeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
  def retrieve(disputeId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
  def retrieve(
    disputeId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
  def retrieve(
    disputeId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
  def setMetadata(): scala.Unit = js.native
  def update(disputeId: java.lang.String, data: stripeLib.stripeMod.StripeNs.disputesNs.IDisputeUpdateOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
  /**
               * When you get a dispute, contacting your customer is always the best first step. If that doesn't work, you can submit evidence in
               * order to help us resolve the dispute in your favor. You can do this in your dashboard, but if you prefer, you can use the API to
               * submit evidence programmatically. Depending on your dispute type, different evidence fields will give you a better chance of winning
               * your dispute. You may want to consult our guide to dispute types to help you figure out which evidence fields to provide:
               * https://stripe.com/help/dispute-types
               *
               * @param data The fields to update
               */
  def update(
    disputeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.disputesNs.IDisputeUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
  /**
               * When you get a dispute, contacting your customer is always the best first step. If that doesn't work, you can submit evidence in
               * order to help us resolve the dispute in your favor. You can do this in your dashboard, but if you prefer, you can use the API to
               * submit evidence programmatically. Depending on your dispute type, different evidence fields will give you a better chance of winning
               * your dispute. You may want to consult our guide to dispute types to help you figure out which evidence fields to provide:
               * https://stripe.com/help/dispute-types
               *
               * @param data The fields to update
               */
  def update(
    disputeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.disputesNs.IDisputeUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
  def update(
    disputeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.disputesNs.IDisputeUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.disputesNs.IDispute]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.disputesNs.IDispute] = js.native
}

