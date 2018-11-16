package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferReversals
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def create(): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  /**
               * When you create a new reversal, you must specify a transfer to create it on.
               *
               * Creating a new reversal on a transfer that has previously been created but not paid out will return the funds to your available balance
               * and refund the fees you were originally charged on the transfer. You may not reverse automatic Stripe transfers.
               *
               * When reversing transfers to Stripe accounts, you can optionally reverse part of the transfer. You can do so as many times as you wish
               * until the entire transfer has been reversed.
               *
               * Once entirely reversed, a transfer can't be reversed again. This method will return an error when called on an already-reversed transfer,
               * or when trying to reverse more money than is left on a transfer.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversalCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  /**
               * When you create a new reversal, you must specify a transfer to create it on.
               *
               * Creating a new reversal on a transfer that has previously been created but not paid out will return the funds to your available balance
               * and refund the fees you were originally charged on the transfer. You may not reverse automatic Stripe transfers.
               *
               * When reversing transfers to Stripe accounts, you can optionally reverse part of the transfer. You can do so as many times as you wish
               * until the entire transfer has been reversed.
               *
               * Once entirely reversed, a transfer can't be reversed again. This method will return an error when called on an already-reversed transfer,
               * or when trying to reverse more money than is left on a transfer.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversalCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def create(options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def create(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def create(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def list(): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.IListOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
  /**
               * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most recent reversals are always available by
               * default on the transfer object. If you need more than those 10, you can use this API method and the limit and starting_after
               * parameters to page through additional reversals.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
  /**
               * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most recent reversals are always available by
               * default on the transfer object. If you need more than those 10, you can use this API method and the limit and starting_after
               * parameters to page through additional reversals.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
  def retrieve(reversalId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def retrieve(reversalId: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  /**
               * By default, you can see the 10 most recent reversals stored directly on the transfer object, but you can also retrieve details about a
               * specific reversal stored on the transfer.
               */
  def retrieve(
    reversalId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  /**
               * By default, you can see the 10 most recent reversals stored directly on the transfer object, but you can also retrieve details about a
               * specific reversal stored on the transfer.
               */
  def retrieve(
    reversalId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def retrieve(
    reversalId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def retrieve(reversalId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def retrieve(
    reversalId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def retrieve(
    reversalId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def update(
    reversalId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversalUpdateOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  /**
               * Updates the specified reversal by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
               *
               * This request only accepts metadata and description as arguments.
               */
  def update(
    reversalId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversalUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  /**
               * Updates the specified reversal by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
               *
               * This request only accepts metadata and description as arguments.
               */
  def update(
    reversalId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversalUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def update(
    reversalId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversalUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
}

