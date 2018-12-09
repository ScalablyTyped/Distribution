package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Products extends js.Object {
  def create(data: stripeLib.stripeMod.StripeNs.productsNs.IProductCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  /**
               * Creates a new product object.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.productsNs.IProductCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  /**
               * Creates a new product object.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.productsNs.IProductCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.productsNs.IProductCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  def del(productId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
               * Delete a product. Deleting a product is only possible if it has no SKUs associated with it.
               */
  def del(productId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
               * Delete a product. Deleting a product is only possible if it has no SKUs associated with it.
               */
  def del(
    productId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def del(
    productId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def list(): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.productsNs.IProductListOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ] = js.native
  /**
               * Returns a list of your products. The products are returned sorted by creation date, with the most recently created products appearing first.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.productsNs.IProductListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ] = js.native
  /**
               * Returns a list of your products. The products are returned sorted by creation date, with the most recently created products appearing first.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.productsNs.IProductListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.productsNs.IProductListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ] = js.native
  def retrieve(productId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  def retrieve(productId: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  /**
               * Retrieves the details of an existing product. Supply the unique product ID from either a product creation request or the product
               * list, and Stripe will return the corresponding product information.
               */
  def retrieve(
    productId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  /**
               * Retrieves the details of an existing product. Supply the unique product ID from either a product creation request or the product
               * list, and Stripe will return the corresponding product information.
               */
  def retrieve(
    productId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  def retrieve(
    productId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  def retrieve(productId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  def retrieve(
    productId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  def retrieve(
    productId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  def update(productId: java.lang.String, data: stripeLib.stripeMod.StripeNs.productsNs.IProductUpdateOptions): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  /**
               * Updates the specific product by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
               *
               * Note that a product's attributes are not editable. Instead, you would need to deactivate the existing product and create a new one
               * with the new attribute values.
               */
  def update(
    productId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.productsNs.IProductUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  /**
               * Updates the specific product by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
               *
               * Note that a product's attributes are not editable. Instead, you would need to deactivate the existing product and create a new one
               * with the new attribute values.
               */
  def update(
    productId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.productsNs.IProductUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
  def update(
    productId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.productsNs.IProductUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.productsNs.IProduct]
  ): js.Promise[stripeLib.stripeMod.StripeNs.productsNs.IProduct] = js.native
}

