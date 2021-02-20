package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IDataOptions
import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IList
import typings.stripe.mod.IListOptions
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.Stripe
import typings.stripe.mod.StripeResource
import typings.stripe.mod.charges.ICharge
import typings.stripe.mod.charges.IChargeCaptureOptions
import typings.stripe.mod.charges.IChargeCreationOptions
import typings.stripe.mod.charges.IChargeListOptions
import typings.stripe.mod.charges.IChargeUpdateOptions
import typings.stripe.mod.refunds.IRefund
import typings.stripe.mod.refunds.IRefundCreationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Charges")
@js.native
class Charges protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  /**
    * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step payment flow, where first
    * you created a charge with the capture option set to false. Uncaptured payments expire exactly seven days after they are
    * created. If they are not captured by that point in time, they will be marked as refunded and will no longer be capturable.
    */
  def capture(id: String): js.Promise[ICharge] = js.native
  def capture(
    id: String,
    data: js.UndefOr[scala.Nothing],
    options: js.UndefOr[HeaderOptions],
    response: IResponseFn[ICharge]
  ): js.Promise[ICharge] = js.native
  def capture(id: String, data: js.UndefOr[scala.Nothing], options: HeaderOptions): js.Promise[ICharge] = js.native
  def capture(id: String, data: IChargeCaptureOptions): js.Promise[ICharge] = js.native
  def capture(
    id: String,
    data: IChargeCaptureOptions,
    options: js.UndefOr[HeaderOptions],
    response: IResponseFn[ICharge]
  ): js.Promise[ICharge] = js.native
  def capture(id: String, data: IChargeCaptureOptions, options: HeaderOptions): js.Promise[ICharge] = js.native
  
  def create(data: IChargeCreationOptions): js.Promise[ICharge] = js.native
  /**
    * To charge a credit card, you create a charge object. If your API key is in test mode, the supplied card won't actually be charged, though
    * everything else will occur as if in live mode. (Stripe assumes that the charge would have completed successfully).
    *
    * @returns Returns a charge object if the charge succeeded. Throws an error if something goes wrong. A common source of error is an invalid or
    * expired card, or a valid card with insufficient available balance. If the cvc parameter is provided, Stripe will attempt to check the CVC's
    * correctness, and the check's result will be returned. Similarly, If address_line1 or address_zip are provided, Stripe will similarly try to
    * check the validity of those parameters. Some banks do not support checking one or more of these parameters, in which case Stripe will return
    * an 'unavailable' result. Also note that, depending on the bank, charges can succeed even when passed incorrect CVC and address information.
    *
    * @param options Options for creating a charge.
    * @param response A callback to receive the response and newly created charge, or errors if they exist.
    */
  def create(data: IChargeCreationOptions, options: HeaderOptions): js.Promise[ICharge] = js.native
  def create(data: IChargeCreationOptions, options: HeaderOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
  def create(data: IChargeCreationOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
  
  def createRefund(id: String): js.Promise[IRefund] = js.native
  def createRefund(id: String, data: IRefundCreationOptions): js.Promise[IRefund] = js.native
  /**
    * When you create a new refund, you must specify a charge to create it on. Creating a new refund will refund a charge that has previously
    * been created but not yet refunded. Funds will be refunded to the credit or debit card that was originally charged. The fees you were
    * originally charged are also refunded. You can optionally refund only part of a charge. You can do so as many times as you wish until
    * the entire charge has been refunded. Once entirely refunded, a charge can't be refunded again. This method will throw an error when
    * called on an already-refunded charge, or when trying to refund more money than is left on a charge.
    *
    * @returns Returns the refund object if the refund succeeded. Throws an error if the charge has already been refunded or an invalid
    * charge identifier was provided.
    *
    * @param id The identifier of the charge to be refunded.
    * @param data Options for specifying reasons and refund amount
    * @param response The refund.
    *
    * @deprecated According to source code (https://github.com/stripe/stripe-node/blob/master/lib/resources/Charges.js#L43)
    */
  def createRefund(id: String, data: IRefundCreationOptions, options: HeaderOptions): js.Promise[IRefund] = js.native
  def createRefund(id: String, data: IRefundCreationOptions, options: HeaderOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
  def createRefund(id: String, data: IRefundCreationOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
  def createRefund(id: String, options: HeaderOptions): js.Promise[IRefund] = js.native
  def createRefund(id: String, options: HeaderOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
  def createRefund(id: String, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
  
  def list(): IListPromise[ICharge] = js.native
  def list(data: IChargeListOptions): IListPromise[ICharge] = js.native
  /**
    * Returns a list of charges you've previously created. The charges are returned in sorted order, with the most recent charges
    * appearing first.
    *
    * @returns An object with a data property that contains an array of up to limit charges, starting after charge starting_after.
    * Each entry in the array is a separate charge object. If no more charges are available, the resulting array will be empty.
    * If you provide a non-existent customer ID, this call throws an error. You can optionally request that the response include
    * the total count of all charges that match your filters. To do so, specify include[]=total_count in your request.
    *
    * @param data Filtering options for the returned items.
    */
  def list(data: IChargeListOptions, options: HeaderOptions): IListPromise[ICharge] = js.native
  def list(data: IChargeListOptions, options: HeaderOptions, response: IResponseFn[IList[ICharge]]): IListPromise[ICharge] = js.native
  def list(data: IChargeListOptions, response: IResponseFn[IList[ICharge]]): IListPromise[ICharge] = js.native
  def list(options: HeaderOptions): IListPromise[ICharge] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[ICharge]]): IListPromise[ICharge] = js.native
  def list(response: IResponseFn[IList[ICharge]]): IListPromise[ICharge] = js.native
  
  def listRefunds(chargeId: String): IListPromise[IRefund] = js.native
  def listRefunds(chargeId: String, data: IListOptions): IListPromise[IRefund] = js.native
  /**
    * You can see a list of the refunds belonging to a specific charge. Note that the 10 most recent refunds are always available by default on
    * the charge object. If you need more than those 10, you can use this API method and the limit and starting_after parameters to page through
    * additional refunds.
    *
    * @returns A object with a data property that contains an array of up to limit refunds, starting after refund starting_after.
    * Each entry in the array is a separate refund object. If no more refunds are available, the resulting array will be empty. If you provide
    * a non-existent customer ID or charge ID, this call throws an error. You can optionally request that the response include the total count
    * of all refunds that match your filters. To do so, specify include[]=total_count in your request.
    *
    * @param chargeId The ID of the charge refunded
    * @param data Used to filter the refunds returned
    */
  def listRefunds(chargeId: String, data: IListOptions, options: HeaderOptions): IListPromise[IRefund] = js.native
  def listRefunds(
    chargeId: String,
    data: IListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[IRefund]]
  ): IListPromise[IRefund] = js.native
  def listRefunds(chargeId: String, data: IListOptions, response: IResponseFn[IList[IRefund]]): IListPromise[IRefund] = js.native
  def listRefunds(chargeId: String, options: HeaderOptions): IListPromise[IRefund] = js.native
  def listRefunds(chargeId: String, options: HeaderOptions, response: IResponseFn[IList[IRefund]]): IListPromise[IRefund] = js.native
  def listRefunds(chargeId: String, response: IResponseFn[IList[IRefund]]): IListPromise[IRefund] = js.native
  
  def markAsFraudulent(chargeId: String): js.Promise[ICharge] = js.native
  def markAsFraudulent(chargeId: String, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
  
  def markAsSafe(chargeId: String): js.Promise[ICharge] = js.native
  def markAsSafe(chargeId: String, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
  
  def refund(chargeId: String): js.Promise[IRefund] = js.native
  def refund(chargeId: String, data: IRefundCreationOptions): js.Promise[IRefund] = js.native
  /**
    * When you create a new refund, you must specify a charge to create it on.
    * Creating a new refund will refund a charge that has previously been created but not yet refunded. Funds will be refunded to the credit or debit card that was originally charged. The fees you were originally charged are also refunded.
    * You can optionally refund only part of a charge. You can do so as many times as you wish until the entire charge has been refunded.
    * Once entirely refunded, a charge can't be refunded again. This method will throw an error when called on an already-refunded charge, or when trying to refund more money than is left on a charge.
    */
  def refund(chargeId: String, data: IRefundCreationOptions, options: HeaderOptions): js.Promise[IRefund] = js.native
  def refund(
    chargeId: String,
    data: IRefundCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[IRefund]
  ): js.Promise[IRefund] = js.native
  def refund(chargeId: String, data: IRefundCreationOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
  def refund(chargeId: String, options: HeaderOptions): js.Promise[IRefund] = js.native
  def refund(chargeId: String, options: HeaderOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
  def refund(chargeId: String, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
  
  def retrieve(id: String): js.Promise[ICharge] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[ICharge] = js.native
  /**
    * Retrieves the details of a charge that has previously been created. Supply the unique charge ID that was returned
    * from your previous request, and Stripe will return the corresponding charge information. The same information is
    * returned when creating or refunding the charge.
    *
    * @param id The identifier of the charge to be retrieved
    * @param response A callback that takes in a potential error and a charge object.
    */
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[ICharge] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[ICharge] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
  def retrieve(id: String, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
  
  def retrieveRefund(chargeId: String, refundId: String): js.Promise[IRefund] = js.native
  /**
    * By default, you can see the 10 most recent refunds stored directly on the charge object, but you can also retrieve details about a specific
    * refund stored on the charge.
    *
    * @param chargeId The ID of the charge refunded
    * @param refundId The ID of the refund to retrieve
    */
  def retrieveRefund(chargeId: String, refundId: String, options: HeaderOptions): js.Promise[IRefund] = js.native
  def retrieveRefund(chargeId: String, refundId: String, options: HeaderOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
  def retrieveRefund(chargeId: String, refundId: String, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
  
  def update(id: String, data: IChargeUpdateOptions): js.Promise[ICharge] = js.native
  /**
    * Updates the specified charge by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    * This request accepts only the description, metadata, receipt_email and fraud_details as arguments.
    *
    * @param id The identifier of the charge to be updated
    * @param data An object containing the updated properties.
    */
  def update(id: String, data: IChargeUpdateOptions, options: HeaderOptions): js.Promise[ICharge] = js.native
  def update(id: String, data: IChargeUpdateOptions, options: HeaderOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
  def update(id: String, data: IChargeUpdateOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
  
  def updateRefund(chargeId: String, refundId: String, data: IDataOptionsWithMetadata): js.Promise[IRefund] = js.native
  /**
    * Updates the specified refund by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    * This request only accepts metadata as an argument.
    *
    * @param chargeId The ID of the charge refunded
    * @param refundId The ID of the refund to update
    */
  def updateRefund(chargeId: String, refundId: String, data: IDataOptionsWithMetadata, options: HeaderOptions): js.Promise[IRefund] = js.native
  def updateRefund(
    chargeId: String,
    refundId: String,
    data: IDataOptionsWithMetadata,
    options: HeaderOptions,
    response: IResponseFn[IRefund]
  ): js.Promise[IRefund] = js.native
  def updateRefund(chargeId: String, refundId: String, data: IDataOptionsWithMetadata, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
}
