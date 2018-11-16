package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payouts
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def cancel(payoutId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  /**
               * A previously created payout can be canceled if it has not yet been paid out. Funds will be refunded to your available balance, and the fees you were originally charged on the payout will be refunded.
               * You may not cancel automatic Stripe payouts.
               */
  def cancel(payoutId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  /**
               * A previously created payout can be canceled if it has not yet been paid out. Funds will be refunded to your available balance, and the fees you were originally charged on the payout will be refunded.
               * You may not cancel automatic Stripe payouts.
               */
  def cancel(
    payoutId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  def cancel(
    payoutId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  def create(data: stripeLib.stripeMod.StripeNs.payoutsNs.IPayoutCreationOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  /**
               * To send funds to your own bank account, you create a new payout object. Your Stripe balance must be able to cover the payout amount, or you’ll receive an “Insufficient Funds” error.
               *
               * If your API key is in test mode, money won’t actually be sent, though everything else will occur as if in live mode.
               *
               * If you are creating a manual payout on a Stripe account that uses multiple payment source types, you’ll need to specify the source type balance that the payout should draw from.
               * The balance object details available and pending amounts by source type.
               *
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.payoutsNs.IPayoutCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  /**
               * To send funds to your own bank account, you create a new payout object. Your Stripe balance must be able to cover the payout amount, or you’ll receive an “Insufficient Funds” error.
               *
               * If your API key is in test mode, money won’t actually be sent, though everything else will occur as if in live mode.
               *
               * If you are creating a manual payout on a Stripe account that uses multiple payment source types, you’ll need to specify the source type balance that the payout should draw from.
               * The balance object details available and pending amounts by source type.
               *
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.payoutsNs.IPayoutCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.payoutsNs.IPayoutCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  def list(): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.payoutsNs.IPayoutListOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ] = js.native
  /**
               * Returns a list of existing payouts sent to third-party bank accounts or that Stripe has sent you. The payouts are returned in sorted order, with the most recently created payouts appearing first.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.payoutsNs.IPayoutListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ] = js.native
  /**
               * Returns a list of existing payouts sent to third-party bank accounts or that Stripe has sent you. The payouts are returned in sorted order, with the most recently created payouts appearing first.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.payoutsNs.IPayoutListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.payoutsNs.IPayoutListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ] = js.native
  def retrieve(payoutId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  /**
               * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout creation request or the payout list, and Stripe will return the corresponding payout information.
               */
  def retrieve(payoutId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  /**
               * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout creation request or the payout list, and Stripe will return the corresponding payout information.
               */
  def retrieve(
    payoutId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  def retrieve(
    payoutId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  def update(payoutId: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  /**
               * Updates the specified payout by setting the values of the parameters passed. Any parameters not provided will be left unchanged. This request accepts only the metadata as arguments.
               */
  def update(
    payoutId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  /**
               * Updates the specified payout by setting the values of the parameters passed. Any parameters not provided will be left unchanged. This request accepts only the metadata as arguments.
               */
  def update(
    payoutId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
  def update(
    payoutId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.payoutsNs.IPayout] = js.native
}

