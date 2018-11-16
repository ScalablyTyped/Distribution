package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Refunds
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def create(data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundCreationOptionsWithCharge): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  /**
               * When you create a new refund, you must specify a charge to create it on.
               *
               * Creating a new refund will refund a charge that has previously been created but not yet refunded.
               * Funds will be refunded to the credit or debit card that was originally charged.
               * The fees you were originally charged are also refunded.
               *
               * You can optionally refund only part of a charge.
               * You can do so as many times as you wish until the entire charge has been refunded.
               *
               * Once entirely refunded, a charge can't be refunded again.
               * This method will throw an error when called on an already-refunded charge, or when trying to refund more money than is left on a charge.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundCreationOptionsWithCharge,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  /**
               * When you create a new refund, you must specify a charge to create it on.
               *
               * Creating a new refund will refund a charge that has previously been created but not yet refunded.
               * Funds will be refunded to the credit or debit card that was originally charged.
               * The fees you were originally charged are also refunded.
               *
               * You can optionally refund only part of a charge.
               * You can do so as many times as you wish until the entire charge has been refunded.
               *
               * Once entirely refunded, a charge can't be refunded again.
               * This method will throw an error when called on an already-refunded charge, or when trying to refund more money than is left on a charge.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundCreationOptionsWithCharge,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundCreationOptionsWithCharge,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def list(): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundListOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  /**
               * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted order,
               * with the most recent refunds appearing first.
               * For convenience, the 10 most recent refunds are always available by default on the charge object.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  /**
               * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted order,
               * with the most recent refunds appearing first.
               * For convenience, the 10 most recent refunds are always available by default on the charge object.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  def retrieve(id: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def retrieve(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  /**
               * Retrieves the details of an existing refund.
               */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  /**
               * Retrieves the details of an existing refund.
               */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def retrieve(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def retrieve(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def retrieve(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def update(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  /**
               * Updates the specified refund by setting the values of the parameters passed.
               * Any parameters not provided will be left unchanged.
               *
               * This request only accepts metadata as an argument.
               */
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  /**
               * Updates the specified refund by setting the values of the parameters passed.
               * Any parameters not provided will be left unchanged.
               *
               * This request only accepts metadata as an argument.
               */
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
}

