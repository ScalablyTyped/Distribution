package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transfers
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def cancel(id: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  def cancel(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  def cancel(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  def cancel(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  def create(data: stripeLib.stripeMod.StripeNs.transfersNs.ITransferCreationOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
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
  def create(
    data: stripeLib.stripeMod.StripeNs.transfersNs.ITransferCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
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
  def create(
    data: stripeLib.stripeMod.StripeNs.transfersNs.ITransferCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.transfersNs.ITransferCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  def createReversal(transferId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
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
  def createReversal(
    transferId: java.lang.String,
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
  def createReversal(
    transferId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversalCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def createReversal(transferId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def createReversal(
    transferId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def createReversal(
    transferId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
   //TODO: Implement placeholder method
  def getMetadata(): scala.Unit = js.native
  def list(): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.transfersNs.ITransferListOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ] = js.native
  /**
               * Returns a list of existing transfers sent to third-party bank accounts or that Stripe has sent you. The transfers are
               * returned in sorted order, with the most recently created transfers appearing first.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.transfersNs.ITransferListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ] = js.native
  /**
               * Returns a list of existing transfers sent to third-party bank accounts or that Stripe has sent you. The transfers are
               * returned in sorted order, with the most recently created transfers appearing first.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.transfersNs.ITransferListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.transfersNs.ITransferListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ] = js.native
  def listReversals(transferId: java.lang.String): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
  def listReversals(transferId: java.lang.String, data: stripeLib.stripeMod.StripeNs.IListOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
  /**
               * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most recent reversals are always available by
               * default on the transfer object. If you need more than those 10, you can use this API method and the limit and starting_after
               * parameters to page through additional reversals.
               */
  def listReversals(
    transferId: java.lang.String,
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
  def listReversals(
    transferId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
  def listReversals(
    transferId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
  def listReversals(transferId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
  def listReversals(
    transferId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
  def listReversals(
    transferId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ] = js.native
   //TODO: Not sure if this should be a list of balance transactions or charges.
  def listTransactions(): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ] = js.native
  def listTransactions(options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ] = js.native
  def listTransactions(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ] = js.native
   //TODO: Not sure if this should be a list of balance transactions or charges.
  def listTransactions(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ] = js.native
  def retrieve(id: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  def retrieve(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  /**
               * Retrieves the details of an existing transfer. Supply the unique transfer ID from either a transfer creation request or
               * the transfer list, and Stripe will return the corresponding transfer information.
               */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  /**
               * Retrieves the details of an existing transfer. Supply the unique transfer ID from either a transfer creation request or
               * the transfer list, and Stripe will return the corresponding transfer information.
               */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  def retrieve(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  def retrieve(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  def retrieve(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  def retrieveReversal(transferId: java.lang.String, reversalId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  /**
               * By default, you can see the 10 most recent reversals stored directly on the transfer object, but you can also retrieve details about a
               * specific reversal stored on the transfer.
               */
  def retrieveReversal(
    transferId: java.lang.String,
    reversalId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  /**
               * By default, you can see the 10 most recent reversals stored directly on the transfer object, but you can also retrieve details about a
               * specific reversal stored on the transfer.
               */
  def retrieveReversal(
    transferId: java.lang.String,
    reversalId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def retrieveReversal(
    transferId: java.lang.String,
    reversalId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def reverse(id: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
   //TODO: Not sure if this should be a list of balance transactions or charges.
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
  def reverse(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversalCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
   //TODO: Not sure if this should be a list of balance transactions or charges.
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
  def reverse(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversalCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def reverse(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def reverse(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def reverse(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def setMetadata(): scala.Unit = js.native
  def update(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.transfersNs.ITransferUpdateOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  /**
               * Updates the specified transfer by setting the values of the parameters passed. Any parameters not provided will be left
               * unchanged.
               *
               * This request accepts only the description and metadata as arguments.
               */
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.transfersNs.ITransferUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  /**
               * Updates the specified transfer by setting the values of the parameters passed. Any parameters not provided will be left
               * unchanged.
               *
               * This request accepts only the description and metadata as arguments.
               */
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.transfersNs.ITransferUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.transfersNs.ITransferUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.native
  def updateReversal(
    transferId: java.lang.String,
    reversalId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversalUpdateOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  /**
               * Updates the specified reversal by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
               *
               * This request only accepts metadata and description as arguments.
               */
  def updateReversal(
    transferId: java.lang.String,
    reversalId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversalUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  /**
               * Updates the specified reversal by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
               *
               * This request only accepts metadata and description as arguments.
               */
  def updateReversal(
    transferId: java.lang.String,
    reversalId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversalUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
  def updateReversal(
    transferId: java.lang.String,
    reversalId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversalUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.transferReversalsNs.IReversal] = js.native
}

