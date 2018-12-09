package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationFees
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def createRefund(feeId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def createRefund(
    feeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefundCreationOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  /**
               * Refunds an application fee that has previously been collected but not yet refunded. Funds will be refunded to the Stripe account that
               * the fee was originally collected from.
               *
               * You can optionally refund only part of an application fee. You can do so as many times as you wish until the entire fee has been refunded.
               *
               * Once entirely refunded, an application fee can't be refunded again. This method will throw an error when called on an already-refunded
               * application fee, or when trying to refund more money than is left on an application fee.
               */
  def createRefund(
    feeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefundCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  /**
               * Refunds an application fee that has previously been collected but not yet refunded. Funds will be refunded to the Stripe account that
               * the fee was originally collected from.
               *
               * You can optionally refund only part of an application fee. You can do so as many times as you wish until the entire fee has been refunded.
               *
               * Once entirely refunded, an application fee can't be refunded again. This method will throw an error when called on an already-refunded
               * application fee, or when trying to refund more money than is left on an application fee.
               */
  def createRefund(
    feeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefundCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def createRefund(
    feeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefundCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def createRefund(feeId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def createRefund(
    feeId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def createRefund(
    feeId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def list(): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeListOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
  ] = js.native
  /**
               * Returns a list of application fees you’ve previously collected. The application fees are returned in sorted order, with the most
               * recent fees appearing first.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
  ] = js.native
  /**
               * Returns a list of application fees you’ve previously collected. The application fees are returned in sorted order, with the most
               * recent fees appearing first.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
  ] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
  ] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
  ] = js.native
  def listRefunds(feeId: java.lang.String): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ] = js.native
  def listRefunds(feeId: java.lang.String, data: stripeLib.stripeMod.StripeNs.IListOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ] = js.native
  /**
               * You can see a list of the refunds belonging to a specific application fee. Note that the 10 most recent refunds are always available
               * by default on the application fee object. If you need more than those 10, you can use this API method and the limit and starting_after
               * parameters to page through additional refunds.
               */
  def listRefunds(
    feeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ] = js.native
  /**
               * You can see a list of the refunds belonging to a specific application fee. Note that the 10 most recent refunds are always available
               * by default on the application fee object. If you need more than those 10, you can use this API method and the limit and starting_after
               * parameters to page through additional refunds.
               */
  def listRefunds(
    feeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ] = js.native
  def listRefunds(
    feeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ] = js.native
  def listRefunds(feeId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ] = js.native
  def listRefunds(
    feeId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ] = js.native
  def listRefunds(
    feeId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ] = js.native
  def refund(feeId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def refund(
    feeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefundCreationOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  /**
               * Refunds an application fee that has previously been collected but not yet refunded. Funds will be refunded to the Stripe account that
               * the fee was originally collected from.
               *
               * You can optionally refund only part of an application fee. You can do so as many times as you wish until the entire fee has been refunded.
               *
               * Once entirely refunded, an application fee can't be refunded again. This method will throw an error when called on an already-refunded
               * application fee, or when trying to refund more money than is left on an application fee.
               */
  def refund(
    feeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefundCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  /**
               * Refunds an application fee that has previously been collected but not yet refunded. Funds will be refunded to the Stripe account that
               * the fee was originally collected from.
               *
               * You can optionally refund only part of an application fee. You can do so as many times as you wish until the entire fee has been refunded.
               *
               * Once entirely refunded, an application fee can't be refunded again. This method will throw an error when called on an already-refunded
               * application fee, or when trying to refund more money than is left on an application fee.
               */
  def refund(
    feeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefundCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def refund(
    feeId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefundCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def refund(feeId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def refund(
    feeId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def refund(
    feeId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def retreiveRefund(feeId: java.lang.String, refundId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  /**
               * By default, you can see the 10 most recent refunds stored directly on the application fee object, but you can also retrieve details
               * about a specific refund stored on the application fee.
               */
  def retreiveRefund(
    feeId: java.lang.String,
    refundId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  /**
               * By default, you can see the 10 most recent refunds stored directly on the application fee object, but you can also retrieve details
               * about a specific refund stored on the application fee.
               */
  def retreiveRefund(
    feeId: java.lang.String,
    refundId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def retreiveRefund(
    feeId: java.lang.String,
    refundId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee] = js.native
  def retrieve(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee] = js.native
  /**
               * Retrieves the details of an application fee that your account has collected. The same information is returned when refunding the
               * application fee.
               */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee] = js.native
  /**
               * Retrieves the details of an application fee that your account has collected. The same information is returned when refunding the
               * application fee.
               */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee] = js.native
  def retrieve(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee] = js.native
  def retrieve(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee] = js.native
  def retrieve(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee] = js.native
  def updateRefund(feeId: java.lang.String, refundId: java.lang.String, data: stripeLib.Anon_Metadata): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  /**
               * Updates the specified application fee refund by setting the values of the parameters passed. Any parameters not provided will be left
               * unchanged.
               *
               * This request only accepts metadata as an argument.
               */
  def updateRefund(
    feeId: java.lang.String,
    refundId: java.lang.String,
    data: stripeLib.Anon_Metadata,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  /**
               * Updates the specified application fee refund by setting the values of the parameters passed. Any parameters not provided will be left
               * unchanged.
               *
               * This request only accepts metadata as an argument.
               */
  def updateRefund(
    feeId: java.lang.String,
    refundId: java.lang.String,
    data: stripeLib.Anon_Metadata,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
  def updateRefund(
    feeId: java.lang.String,
    refundId: java.lang.String,
    data: stripeLib.Anon_Metadata,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund]
  ): js.Promise[stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFeeRefund] = js.native
}

