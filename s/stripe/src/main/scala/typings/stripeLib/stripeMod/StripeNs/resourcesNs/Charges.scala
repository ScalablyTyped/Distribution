package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Charges
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  /**
    * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step payment flow, where first
    * you created a charge with the capture option set to false. Uncaptured payments expire exactly seven days after they are
    * created. If they are not captured by that point in time, they will be marked as refunded and will no longer be capturable.
    */
  def capture(id: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def capture(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeCaptureOptions): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def capture(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeCaptureOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def capture(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeCaptureOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def create(data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
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
  def create(
    data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def createRefund(id: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def createRefund(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
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
  def createRefund(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def createRefund(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def createRefund(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def createRefund(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def createRefund(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def createRefund(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def list(): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeListOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ] = js.native
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
  def list(
    data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ] = js.native
  def listRefunds(chargeId: java.lang.String): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  def listRefunds(chargeId: java.lang.String, data: stripeLib.stripeMod.StripeNs.IListOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
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
  def listRefunds(
    chargeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  def listRefunds(
    chargeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  def listRefunds(
    chargeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  def listRefunds(chargeId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  def listRefunds(
    chargeId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  def listRefunds(
    chargeId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ] = js.native
  def markAsFraudulent(chargeId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def markAsFraudulent(
    chargeId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def markAsSafe(chargeId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def markAsSafe(
    chargeId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def refund(chargeId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def refund(chargeId: java.lang.String, data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  /**
    * When you create a new refund, you must specify a charge to create it on.
    * Creating a new refund will refund a charge that has previously been created but not yet refunded. Funds will be refunded to the credit or debit card that was originally charged. The fees you were originally charged are also refunded.
    * You can optionally refund only part of a charge. You can do so as many times as you wish until the entire charge has been refunded.
    * Once entirely refunded, a charge can't be refunded again. This method will throw an error when called on an already-refunded charge, or when trying to refund more money than is left on a charge.
    */
  def refund(
    chargeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def refund(
    chargeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def refund(
    chargeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.refundsNs.IRefundCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def refund(chargeId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def refund(
    chargeId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def refund(
    chargeId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def retrieve(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  /**
    * Retrieves the details of a charge that has previously been created. Supply the unique charge ID that was returned
    * from your previous request, and Stripe will return the corresponding charge information. The same information is
    * returned when creating or refunding the charge.
    *
    * @param id The identifier of the charge to be retrieved
    * @param response A callback that takes in a potential error and a charge object.
    */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def retrieve(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def retrieve(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def retrieve(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def retrieveRefund(chargeId: java.lang.String, refundId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  /**
    * By default, you can see the 10 most recent refunds stored directly on the charge object, but you can also retrieve details about a specific
    * refund stored on the charge.
    *
    * @param chargeId The ID of the charge refunded
    * @param refundId The ID of the refund to retrieve
    */
  def retrieveRefund(
    chargeId: java.lang.String,
    refundId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def retrieveRefund(
    chargeId: java.lang.String,
    refundId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def retrieveRefund(
    chargeId: java.lang.String,
    refundId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def update(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeUpdateOptions): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  /**
    * Updates the specified charge by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    * This request accepts only the description, metadata, receipt_emailand fraud_details as arguments.
    *
    * @param id The identifier of the charge to be updated
    * @param data An object containing the updated properties.
    */
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.chargesNs.IChargeUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.chargesNs.ICharge]
  ): js.Promise[stripeLib.stripeMod.StripeNs.chargesNs.ICharge] = js.native
  def updateRefund(
    chargeId: java.lang.String,
    refundId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  /**
    * Updates the specified refund by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    * This request only accepts metadata as an argument.
    *
    * @param chargeId The ID of the charge refunded
    * @param refundId The ID of the refund to update
    */
  def updateRefund(
    chargeId: java.lang.String,
    refundId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def updateRefund(
    chargeId: java.lang.String,
    refundId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
  def updateRefund(
    chargeId: java.lang.String,
    refundId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund] = js.native
}

