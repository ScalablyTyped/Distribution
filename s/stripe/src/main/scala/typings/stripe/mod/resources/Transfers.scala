package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IDataOptions
import typings.stripe.mod.IList
import typings.stripe.mod.IListOptions
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.StripeResource
import typings.stripe.mod.charges.ICharge
import typings.stripe.mod.transferReversals.IReversal
import typings.stripe.mod.transferReversals.IReversalCreationOptions
import typings.stripe.mod.transferReversals.IReversalUpdateOptions
import typings.stripe.mod.transfers.ITransfer
import typings.stripe.mod.transfers.ITransferCreationOptions
import typings.stripe.mod.transfers.ITransferListOptions
import typings.stripe.mod.transfers.ITransferUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Transfers")
@js.native
class Transfers () extends StripeResource {
  
  def cancel(id: String): js.Promise[ITransfer] = js.native
  def cancel(id: String, options: HeaderOptions): js.Promise[ITransfer] = js.native
  def cancel(id: String, options: HeaderOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
  def cancel(id: String, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
  
  def create(data: ITransferCreationOptions): js.Promise[ITransfer] = js.native
  /**
    * To send funds from your Stripe account to a third-party recipient or to your own bank account, you create a new transfer
    * object. Your Stripe balance must be able to cover the transfer amount, or you'll receive an "Insufficient Funds" error.
    *
    * If your API key is in test mode, money won't actually be sent, though everything else will occur as if in live mode.
    *
    * If you are creating a manual transfer or a special case transfer on a Stripe account that uses multiple payment source
    * types, you'll need to specify the source type balance that the transfer should draw from. The balance object details
    * available and pending amounts by source type.
    */
  def create(data: ITransferCreationOptions, options: HeaderOptions): js.Promise[ITransfer] = js.native
  def create(data: ITransferCreationOptions, options: HeaderOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
  def create(data: ITransferCreationOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
  
  def createReversal(transferId: String): js.Promise[IReversal] = js.native
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
  def createReversal(transferId: String, data: IReversalCreationOptions, options: HeaderOptions): js.Promise[IReversal] = js.native
  def createReversal(
    transferId: String,
    data: IReversalCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[IReversal]
  ): js.Promise[IReversal] = js.native
  def createReversal(transferId: String, options: HeaderOptions): js.Promise[IReversal] = js.native
  def createReversal(transferId: String, options: HeaderOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
  def createReversal(transferId: String, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
  
   // TODO: Implement placeholder method
  def getMetadata(): Unit = js.native
  
  def list(): IListPromise[ITransfer] = js.native
  def list(data: ITransferListOptions): IListPromise[ITransfer] = js.native
  /**
    * Returns a list of existing transfers sent to third-party bank accounts or that Stripe has sent you. The transfers are
    * returned in sorted order, with the most recently created transfers appearing first.
    */
  def list(data: ITransferListOptions, options: HeaderOptions): IListPromise[ITransfer] = js.native
  def list(data: ITransferListOptions, options: HeaderOptions, response: IResponseFn[IList[ITransfer]]): IListPromise[ITransfer] = js.native
  def list(data: ITransferListOptions, response: IResponseFn[IList[ITransfer]]): IListPromise[ITransfer] = js.native
  def list(options: HeaderOptions): IListPromise[ITransfer] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[ITransfer]]): IListPromise[ITransfer] = js.native
  def list(response: IResponseFn[IList[ITransfer]]): IListPromise[ITransfer] = js.native
  
  def listReversals(transferId: String): IListPromise[IReversal] = js.native
  def listReversals(transferId: String, data: IListOptions): IListPromise[IReversal] = js.native
  /**
    * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most recent reversals are always available by
    * default on the transfer object. If you need more than those 10, you can use this API method and the limit and starting_after
    * parameters to page through additional reversals.
    */
  def listReversals(transferId: String, data: IListOptions, options: HeaderOptions): IListPromise[IReversal] = js.native
  def listReversals(
    transferId: String,
    data: IListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[IReversal]]
  ): IListPromise[IReversal] = js.native
  def listReversals(transferId: String, data: IListOptions, response: IResponseFn[IList[IReversal]]): IListPromise[IReversal] = js.native
  def listReversals(transferId: String, options: HeaderOptions): IListPromise[IReversal] = js.native
  def listReversals(transferId: String, options: HeaderOptions, response: IResponseFn[IList[IReversal]]): IListPromise[IReversal] = js.native
  def listReversals(transferId: String, response: IResponseFn[IList[IReversal]]): IListPromise[IReversal] = js.native
  
   // TODO: Not sure if this should be a list of balance transactions or charges.
  def listTransactions(): IListPromise[ICharge] = js.native
  def listTransactions(options: HeaderOptions): IListPromise[ICharge] = js.native
  def listTransactions(options: HeaderOptions, response: IResponseFn[IList[ICharge]]): IListPromise[ICharge] = js.native
  def listTransactions(response: IResponseFn[IList[ICharge]]): IListPromise[ICharge] = js.native
  
  def retrieve(id: String): js.Promise[ITransfer] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[ITransfer] = js.native
  /**
    * Retrieves the details of an existing transfer. Supply the unique transfer ID from either a transfer creation request or
    * the transfer list, and Stripe will return the corresponding transfer information.
    */
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[ITransfer] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[ITransfer] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
  def retrieve(id: String, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
  
  def retrieveReversal(transferId: String, reversalId: String): js.Promise[IReversal] = js.native
  /**
    * By default, you can see the 10 most recent reversals stored directly on the transfer object, but you can also retrieve details about a
    * specific reversal stored on the transfer.
    */
  def retrieveReversal(transferId: String, reversalId: String, options: HeaderOptions): js.Promise[IReversal] = js.native
  def retrieveReversal(transferId: String, reversalId: String, options: HeaderOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
  def retrieveReversal(transferId: String, reversalId: String, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
  
  def reverse(id: String): js.Promise[IReversal] = js.native
   // TODO: Not sure if this should be a list of balance transactions or charges.
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
  def reverse(id: String, data: IReversalCreationOptions, options: HeaderOptions): js.Promise[IReversal] = js.native
  def reverse(
    id: String,
    data: IReversalCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[IReversal]
  ): js.Promise[IReversal] = js.native
  def reverse(id: String, options: HeaderOptions): js.Promise[IReversal] = js.native
  def reverse(id: String, options: HeaderOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
  def reverse(id: String, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
  
  def setMetadata(): Unit = js.native
  
  def update(id: String, data: ITransferUpdateOptions): js.Promise[ITransfer] = js.native
  /**
    * Updates the specified transfer by setting the values of the parameters passed. Any parameters not provided will be left
    * unchanged.
    *
    * This request accepts only the description and metadata as arguments.
    */
  def update(id: String, data: ITransferUpdateOptions, options: HeaderOptions): js.Promise[ITransfer] = js.native
  def update(id: String, data: ITransferUpdateOptions, options: HeaderOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
  def update(id: String, data: ITransferUpdateOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
  
  def updateReversal(transferId: String, reversalId: String, data: IReversalUpdateOptions): js.Promise[IReversal] = js.native
  /**
    * Updates the specified reversal by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    *
    * This request only accepts metadata and description as arguments.
    */
  def updateReversal(transferId: String, reversalId: String, data: IReversalUpdateOptions, options: HeaderOptions): js.Promise[IReversal] = js.native
  def updateReversal(
    transferId: String,
    reversalId: String,
    data: IReversalUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[IReversal]
  ): js.Promise[IReversal] = js.native
  def updateReversal(
    transferId: String,
    reversalId: String,
    data: IReversalUpdateOptions,
    response: IResponseFn[IReversal]
  ): js.Promise[IReversal] = js.native
}
