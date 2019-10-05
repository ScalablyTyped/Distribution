package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.HeaderOptions
import typings.stripe.stripeMod.IDataOptions
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IListOptions
import typings.stripe.stripeMod.IListPromise
import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.StripeResource
import typings.stripe.stripeMod.transferReversals.IReversal
import typings.stripe.stripeMod.transferReversals.IReversalCreationOptions
import typings.stripe.stripeMod.transferReversals.IReversalUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.TransferReversals")
@js.native
class TransferReversals () extends StripeResource {
  def create(): js.Promise[IReversal] = js.native
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
  def create(data: IReversalCreationOptions, options: HeaderOptions): js.Promise[IReversal] = js.native
  def create(data: IReversalCreationOptions, options: HeaderOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
  def create(options: HeaderOptions): js.Promise[IReversal] = js.native
  def create(options: HeaderOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
  def create(response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
  def list(): IListPromise[IReversal] = js.native
  def list(data: IListOptions): IListPromise[IReversal] = js.native
  /**
    * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most recent reversals are always available by
    * default on the transfer object. If you need more than those 10, you can use this API method and the limit and starting_after
    * parameters to page through additional reversals.
    */
  def list(data: IListOptions, options: HeaderOptions): IListPromise[IReversal] = js.native
  def list(data: IListOptions, options: HeaderOptions, response: IResponseFn[IList[IReversal]]): IListPromise[IReversal] = js.native
  def list(data: IListOptions, response: IResponseFn[IList[IReversal]]): IListPromise[IReversal] = js.native
  def list(options: HeaderOptions): IListPromise[IReversal] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IReversal]]): IListPromise[IReversal] = js.native
  def list(response: IResponseFn[IList[IReversal]]): IListPromise[IReversal] = js.native
  def retrieve(reversalId: String): js.Promise[IReversal] = js.native
  def retrieve(reversalId: String, data: IDataOptions): js.Promise[IReversal] = js.native
  /**
    * By default, you can see the 10 most recent reversals stored directly on the transfer object, but you can also retrieve details about a
    * specific reversal stored on the transfer.
    */
  def retrieve(reversalId: String, data: IDataOptions, options: HeaderOptions): js.Promise[IReversal] = js.native
  def retrieve(reversalId: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
  def retrieve(reversalId: String, data: IDataOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
  def retrieve(reversalId: String, options: HeaderOptions): js.Promise[IReversal] = js.native
  def retrieve(reversalId: String, options: HeaderOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
  def retrieve(reversalId: String, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
  def update(reversalId: String, data: IReversalUpdateOptions): js.Promise[IReversal] = js.native
  /**
    * Updates the specified reversal by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    *
    * This request only accepts metadata and description as arguments.
    */
  def update(reversalId: String, data: IReversalUpdateOptions, options: HeaderOptions): js.Promise[IReversal] = js.native
  def update(
    reversalId: String,
    data: IReversalUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[IReversal]
  ): js.Promise[IReversal] = js.native
  def update(reversalId: String, data: IReversalUpdateOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
}

