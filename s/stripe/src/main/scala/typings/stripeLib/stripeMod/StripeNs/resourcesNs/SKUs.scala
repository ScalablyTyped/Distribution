package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SKUs extends js.Object {
  def create(data: stripeLib.stripeMod.StripeNs.skusNs.ISkuCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  /**
               * Creates a new SKU associated with a product.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.skusNs.ISkuCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  /**
               * Creates a new SKU associated with a product.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.skusNs.ISkuCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.skusNs.ISku]
  ): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.skusNs.ISkuCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.skusNs.ISku]
  ): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  def del(skuId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
               * Delete a SKU. Deleting a SKU is only possible until it has been used in an order.
               */
  def del(skuId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
               * Delete a SKU. Deleting a SKU is only possible until it has been used in an order.
               */
  def del(
    skuId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def del(
    skuId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def list(): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.skusNs.ISku]] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.skusNs.ISkuListOptions): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.skusNs.ISku]] = js.native
  /**
               * Returns a list of your SKUs. The SKUs are returned sorted by creation date, with the most recently created SKUs appearing first.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.skusNs.ISkuListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.skusNs.ISku]] = js.native
  /**
               * Returns a list of your SKUs. The SKUs are returned sorted by creation date, with the most recently created SKUs appearing first.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.skusNs.ISkuListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.skusNs.ISku]]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.skusNs.ISku]] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.skusNs.ISkuListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.skusNs.ISku]]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.skusNs.ISku]] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.skusNs.ISku]] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.skusNs.ISku]]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.skusNs.ISku]] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.skusNs.ISku]]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.skusNs.ISku]] = js.native
  def retrieve(skuId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  def retrieve(skuId: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  /**
               * Retrieves the details of an existing SKU. Supply the unique SKU identifier from either a SKU creation request or from the
               * product, and Stripe will return the corresponding SKU information.
               */
  def retrieve(
    skuId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  /**
               * Retrieves the details of an existing SKU. Supply the unique SKU identifier from either a SKU creation request or from the
               * product, and Stripe will return the corresponding SKU information.
               */
  def retrieve(
    skuId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.skusNs.ISku]
  ): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  def retrieve(
    skuId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.skusNs.ISku]
  ): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  def retrieve(skuId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  def retrieve(
    skuId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.skusNs.ISku]
  ): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  def retrieve(
    skuId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.skusNs.ISku]
  ): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  def update(skuId: java.lang.String, data: stripeLib.stripeMod.StripeNs.skusNs.ISkuUpdateOptions): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  /**
               * Updates the specific SKU by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
               *
               * Note that a SKU's attributes are not editable. Instead, you would need to deactivate the existing SKU and create a new one with
               * the new attribute values.
               */
  def update(
    skuId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.skusNs.ISkuUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  /**
               * Updates the specific SKU by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
               *
               * Note that a SKU's attributes are not editable. Instead, you would need to deactivate the existing SKU and create a new one with
               * the new attribute values.
               */
  def update(
    skuId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.skusNs.ISkuUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.skusNs.ISku]
  ): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
  def update(
    skuId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.skusNs.ISkuUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.skusNs.ISku]
  ): js.Promise[stripeLib.stripeMod.StripeNs.skusNs.ISku] = js.native
}

