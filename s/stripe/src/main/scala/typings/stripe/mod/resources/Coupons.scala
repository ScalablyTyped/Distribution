package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IDataOptions
import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IDeleteConfirmation
import typings.stripe.mod.IList
import typings.stripe.mod.IListOptionsCreated
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.Stripe
import typings.stripe.mod.StripeResource
import typings.stripe.mod.coupons.ICoupon
import typings.stripe.mod.coupons.ICouponCreationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Coupons")
@js.native
class Coupons protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  def create(data: ICouponCreationOptions): js.Promise[ICoupon] = js.native
  /**
    * You can create coupons easily via the coupon management page of the Stripe dashboard. Coupon creation is also accessible via the API if
    * you need to create coupons on the fly. A coupon has either a percent_off or an amount_off and currency. If you set an amount_off, that
    * amount will be subtracted from any invoice's subtotal. For example, an invoice with a subtotal of $10 will have a final total of $0 if
    * a coupon with an amount_off of 2000 is applied to it and an invoice with a subtotal of $30 will have a final total of $10 if a coupon
    * with an amount_off of 2000 is applied to it.
    *
    * @returns Returns the coupon object.
    *
    * @param data Options for creating the coupon.
    */
  def create(data: ICouponCreationOptions, options: HeaderOptions): js.Promise[ICoupon] = js.native
  def create(data: ICouponCreationOptions, options: HeaderOptions, response: IResponseFn[ICoupon]): js.Promise[ICoupon] = js.native
  def create(data: ICouponCreationOptions, response: IResponseFn[ICoupon]): js.Promise[ICoupon] = js.native
  
  def del(id: String): js.Promise[IDeleteConfirmation] = js.native
  /**
    * You can delete coupons via the coupon management page of the Stripe dashboard. However, deleting a coupon does not affect any
    * customers who have already applied the coupon; it means that new customers can't redeem the coupon. You can also delete coupons
    * via the API.
    *
    * @returns An object with the deleted coupon's ID and a deleted flag upon success. Otherwise, this call throws an error, such as
    * if the coupon has already been deleted.
    *
    * @param id The ID of the coupon to be deleted.
    */
  def del(id: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def del(id: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def del(id: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  
  def list(): IListPromise[ICoupon] = js.native
  def list(data: IListOptionsCreated): IListPromise[ICoupon] = js.native
  /**
    * Returns a list of your coupons.
    *
    * @returns A object with a data property that contains an array of up to limit coupons, starting after coupon starting_after. Each
    * entry in the array is a separate coupon object. If no more coupons are available, the resulting array will be empty. This request
    * should never throw an error. You can optionally request that the response include the total count of all coupons. To do so, specify
    * include[]=total_count in your request.
    *
    * @param data Filtering options for the list.
    */
  def list(data: IListOptionsCreated, options: HeaderOptions): IListPromise[ICoupon] = js.native
  def list(data: IListOptionsCreated, options: HeaderOptions, response: IResponseFn[IList[ICoupon]]): IListPromise[ICoupon] = js.native
  def list(data: IListOptionsCreated, response: IResponseFn[IList[ICoupon]]): IListPromise[ICoupon] = js.native
  def list(options: HeaderOptions): IListPromise[ICoupon] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[ICoupon]]): IListPromise[ICoupon] = js.native
  def list(response: IResponseFn[IList[ICoupon]]): IListPromise[ICoupon] = js.native
  
  def retrieve(id: String): js.Promise[ICoupon] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[ICoupon] = js.native
  /**
    * Retrieves the coupon with the given ID.
    *
    * @returns Returns a coupon if a valid coupon ID was provided. Throws an error otherwise.
    *
    * @param id The ID of the desired coupon
    */
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[ICoupon] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[ICoupon]): js.Promise[ICoupon] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[ICoupon]): js.Promise[ICoupon] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[ICoupon] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[ICoupon]): js.Promise[ICoupon] = js.native
  def retrieve(id: String, response: IResponseFn[ICoupon]): js.Promise[ICoupon] = js.native
  
  def update(id: String, data: IDataOptionsWithMetadata): js.Promise[ICoupon] = js.native
  /**
    * Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by design, not editable.
    *
    * @returns The newly updated coupon object if the call succeeded. Otherwise, this call throws an error, such as if the coupon has
    * been deleted.
    *
    * @param id The ID of the coupon to be updated
    * @param data Metadata to update
    */
  def update(id: String, data: IDataOptionsWithMetadata, options: HeaderOptions): js.Promise[ICoupon] = js.native
  def update(id: String, data: IDataOptionsWithMetadata, options: HeaderOptions, response: IResponseFn[ICoupon]): js.Promise[ICoupon] = js.native
  def update(id: String, data: IDataOptionsWithMetadata, response: IResponseFn[ICoupon]): js.Promise[ICoupon] = js.native
}
