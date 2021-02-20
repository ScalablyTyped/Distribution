package typings.stripe.mod.resources

import typings.stripe.anon.Metadata
import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IDataOptions
import typings.stripe.mod.IList
import typings.stripe.mod.IListOptions
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.Stripe
import typings.stripe.mod.StripeResource
import typings.stripe.mod.applicationFees.IApplicationFee
import typings.stripe.mod.applicationFees.IApplicationFeeListOptions
import typings.stripe.mod.applicationFees.IApplicationFeeRefund
import typings.stripe.mod.applicationFees.IApplicationFeeRefundCreationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.ApplicationFees")
@js.native
class ApplicationFees protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  def createRefund(feeId: String): js.Promise[IApplicationFeeRefund] = js.native
  def createRefund(feeId: String, data: IApplicationFeeRefundCreationOptions): js.Promise[IApplicationFeeRefund] = js.native
  /**
    * Refunds an application fee that has previously been collected but not yet refunded. Funds will be refunded to the Stripe account that
    * the fee was originally collected from.
    *
    * You can optionally refund only part of an application fee. You can do so as many times as you wish until the entire fee has been refunded.
    *
    * Once entirely refunded, an application fee can't be refunded again. This method will throw an error when called on an already-refunded
    * application fee, or when trying to refund more money than is left on an application fee.
    */
  def createRefund(feeId: String, data: IApplicationFeeRefundCreationOptions, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
  def createRefund(
    feeId: String,
    data: IApplicationFeeRefundCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[IApplicationFeeRefund]
  ): js.Promise[IApplicationFeeRefund] = js.native
  def createRefund(
    feeId: String,
    data: IApplicationFeeRefundCreationOptions,
    response: IResponseFn[IApplicationFeeRefund]
  ): js.Promise[IApplicationFeeRefund] = js.native
  def createRefund(feeId: String, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
  def createRefund(feeId: String, options: HeaderOptions, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
  def createRefund(feeId: String, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
  
  def list(): IListPromise[IApplicationFee] = js.native
  def list(data: IApplicationFeeListOptions): IListPromise[IApplicationFee] = js.native
  /**
    * Returns a list of application fees you’ve previously collected. The application fees are returned in sorted order, with the most
    * recent fees appearing first.
    */
  def list(data: IApplicationFeeListOptions, options: HeaderOptions): IListPromise[IApplicationFee] = js.native
  def list(
    data: IApplicationFeeListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[IApplicationFee]]
  ): IListPromise[IApplicationFee] = js.native
  def list(data: IApplicationFeeListOptions, response: IResponseFn[IList[IApplicationFee]]): IListPromise[IApplicationFee] = js.native
  def list(options: HeaderOptions): IListPromise[IApplicationFee] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IApplicationFee]]): IListPromise[IApplicationFee] = js.native
  def list(response: IResponseFn[IList[IApplicationFee]]): IListPromise[IApplicationFee] = js.native
  
  def listRefunds(feeId: String): IListPromise[IApplicationFeeRefund] = js.native
  def listRefunds(feeId: String, data: IListOptions): IListPromise[IApplicationFeeRefund] = js.native
  /**
    * You can see a list of the refunds belonging to a specific application fee. Note that the 10 most recent refunds are always available
    * by default on the application fee object. If you need more than those 10, you can use this API method and the limit and starting_after
    * parameters to page through additional refunds.
    */
  def listRefunds(feeId: String, data: IListOptions, options: HeaderOptions): IListPromise[IApplicationFeeRefund] = js.native
  def listRefunds(
    feeId: String,
    data: IListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[IApplicationFeeRefund]]
  ): IListPromise[IApplicationFeeRefund] = js.native
  def listRefunds(feeId: String, data: IListOptions, response: IResponseFn[IList[IApplicationFeeRefund]]): IListPromise[IApplicationFeeRefund] = js.native
  def listRefunds(feeId: String, options: HeaderOptions): IListPromise[IApplicationFeeRefund] = js.native
  def listRefunds(feeId: String, options: HeaderOptions, response: IResponseFn[IList[IApplicationFeeRefund]]): IListPromise[IApplicationFeeRefund] = js.native
  def listRefunds(feeId: String, response: IResponseFn[IList[IApplicationFeeRefund]]): IListPromise[IApplicationFeeRefund] = js.native
  
  def refund(feeId: String): js.Promise[IApplicationFeeRefund] = js.native
  def refund(feeId: String, data: IApplicationFeeRefundCreationOptions): js.Promise[IApplicationFeeRefund] = js.native
  /**
    * Refunds an application fee that has previously been collected but not yet refunded. Funds will be refunded to the Stripe account that
    * the fee was originally collected from.
    *
    * You can optionally refund only part of an application fee. You can do so as many times as you wish until the entire fee has been refunded.
    *
    * Once entirely refunded, an application fee can't be refunded again. This method will throw an error when called on an already-refunded
    * application fee, or when trying to refund more money than is left on an application fee.
    */
  def refund(feeId: String, data: IApplicationFeeRefundCreationOptions, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
  def refund(
    feeId: String,
    data: IApplicationFeeRefundCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[IApplicationFeeRefund]
  ): js.Promise[IApplicationFeeRefund] = js.native
  def refund(
    feeId: String,
    data: IApplicationFeeRefundCreationOptions,
    response: IResponseFn[IApplicationFeeRefund]
  ): js.Promise[IApplicationFeeRefund] = js.native
  def refund(feeId: String, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
  def refund(feeId: String, options: HeaderOptions, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
  def refund(feeId: String, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
  
  def retrieve(id: String): js.Promise[IApplicationFee] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[IApplicationFee] = js.native
  /**
    * Retrieves the details of an application fee that your account has collected. The same information is returned when refunding the
    * application fee.
    */
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IApplicationFee] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IApplicationFee]): js.Promise[IApplicationFee] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[IApplicationFee]): js.Promise[IApplicationFee] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[IApplicationFee] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IApplicationFee]): js.Promise[IApplicationFee] = js.native
  def retrieve(id: String, response: IResponseFn[IApplicationFee]): js.Promise[IApplicationFee] = js.native
  
  def retrieveRefund(feeId: String, refundId: String): js.Promise[IApplicationFeeRefund] = js.native
  /**
    * By default, you can see the 10 most recent refunds stored directly on the application fee object, but you can also retrieve details
    * about a specific refund stored on the application fee.
    */
  def retrieveRefund(feeId: String, refundId: String, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
  def retrieveRefund(
    feeId: String,
    refundId: String,
    options: HeaderOptions,
    response: IResponseFn[IApplicationFeeRefund]
  ): js.Promise[IApplicationFeeRefund] = js.native
  def retrieveRefund(feeId: String, refundId: String, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
  
  def updateRefund(feeId: String, refundId: String, data: Metadata): js.Promise[IApplicationFeeRefund] = js.native
  /**
    * Updates the specified application fee refund by setting the values of the parameters passed. Any parameters not provided will be left
    * unchanged.
    *
    * This request only accepts metadata as an argument.
    */
  def updateRefund(feeId: String, refundId: String, data: Metadata, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
  def updateRefund(
    feeId: String,
    refundId: String,
    data: Metadata,
    options: HeaderOptions,
    response: IResponseFn[IApplicationFeeRefund]
  ): js.Promise[IApplicationFeeRefund] = js.native
  def updateRefund(feeId: String, refundId: String, data: Metadata, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
}
