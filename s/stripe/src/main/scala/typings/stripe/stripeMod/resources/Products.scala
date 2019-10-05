package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.HeaderOptions
import typings.stripe.stripeMod.IDataOptions
import typings.stripe.stripeMod.IDeleteConfirmation
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IListPromise
import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.products.IProduct
import typings.stripe.stripeMod.products.IProductCreationOptions
import typings.stripe.stripeMod.products.IProductListOptions
import typings.stripe.stripeMod.products.IProductUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Products")
@js.native
class Products () extends js.Object {
  def create(data: IProductCreationOptions): js.Promise[IProduct] = js.native
  /**
    * Creates a new product object.
    */
  def create(data: IProductCreationOptions, options: HeaderOptions): js.Promise[IProduct] = js.native
  def create(data: IProductCreationOptions, options: HeaderOptions, response: IResponseFn[IProduct]): js.Promise[IProduct] = js.native
  def create(data: IProductCreationOptions, response: IResponseFn[IProduct]): js.Promise[IProduct] = js.native
  def del(productId: String): js.Promise[IDeleteConfirmation] = js.native
  /**
    * Delete a product. Deleting a product is only possible if it has no SKUs associated with it.
    */
  def del(productId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def del(productId: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def del(productId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def list(): IListPromise[IProduct] = js.native
  def list(data: IProductListOptions): IListPromise[IProduct] = js.native
  /**
    * Returns a list of your products. The products are returned sorted by creation date, with the most recently created products appearing first.
    */
  def list(data: IProductListOptions, options: HeaderOptions): IListPromise[IProduct] = js.native
  def list(data: IProductListOptions, options: HeaderOptions, response: IResponseFn[IList[IProduct]]): IListPromise[IProduct] = js.native
  def list(data: IProductListOptions, response: IResponseFn[IList[IProduct]]): IListPromise[IProduct] = js.native
  def list(options: HeaderOptions): IListPromise[IProduct] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IProduct]]): IListPromise[IProduct] = js.native
  def list(response: IResponseFn[IList[IProduct]]): IListPromise[IProduct] = js.native
  def retrieve(productId: String): js.Promise[IProduct] = js.native
  def retrieve(productId: String, data: IDataOptions): js.Promise[IProduct] = js.native
  /**
    * Retrieves the details of an existing product. Supply the unique product ID from either a product creation request or the product
    * list, and Stripe will return the corresponding product information.
    */
  def retrieve(productId: String, data: IDataOptions, options: HeaderOptions): js.Promise[IProduct] = js.native
  def retrieve(productId: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IProduct]): js.Promise[IProduct] = js.native
  def retrieve(productId: String, data: IDataOptions, response: IResponseFn[IProduct]): js.Promise[IProduct] = js.native
  def retrieve(productId: String, options: HeaderOptions): js.Promise[IProduct] = js.native
  def retrieve(productId: String, options: HeaderOptions, response: IResponseFn[IProduct]): js.Promise[IProduct] = js.native
  def retrieve(productId: String, response: IResponseFn[IProduct]): js.Promise[IProduct] = js.native
  def update(productId: String, data: IProductUpdateOptions): js.Promise[IProduct] = js.native
  /**
    * Updates the specific product by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    *
    * Note that a product's attributes are not editable. Instead, you would need to deactivate the existing product and create a new one
    * with the new attribute values.
    */
  def update(productId: String, data: IProductUpdateOptions, options: HeaderOptions): js.Promise[IProduct] = js.native
  def update(
    productId: String,
    data: IProductUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[IProduct]
  ): js.Promise[IProduct] = js.native
  def update(productId: String, data: IProductUpdateOptions, response: IResponseFn[IProduct]): js.Promise[IProduct] = js.native
}

