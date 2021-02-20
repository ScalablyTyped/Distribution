package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IDataOptions
import typings.stripe.mod.IList
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.orders.IOrder
import typings.stripe.mod.orders.IOrderCreationOptions
import typings.stripe.mod.orders.IOrderListOptions
import typings.stripe.mod.orders.IOrderPayOptions
import typings.stripe.mod.orders.IOrderUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Orders")
@js.native
class Orders () extends StObject {
  
  def create(data: IOrderCreationOptions): js.Promise[IOrder] = js.native
  /**
    * Creates a new order object.
    */
  def create(data: IOrderCreationOptions, options: HeaderOptions): js.Promise[IOrder] = js.native
  def create(data: IOrderCreationOptions, options: HeaderOptions, response: IResponseFn[IOrder]): js.Promise[IOrder] = js.native
  def create(data: IOrderCreationOptions, response: IResponseFn[IOrder]): js.Promise[IOrder] = js.native
  
  def list(): IListPromise[IOrder] = js.native
  def list(data: IOrderListOptions): IListPromise[IOrder] = js.native
  /**
    * Returns a list of your orders. The orders are returned sorted by creation date, with the most recently created orders appearing first.
    */
  def list(data: IOrderListOptions, options: HeaderOptions): IListPromise[IOrder] = js.native
  def list(data: IOrderListOptions, options: HeaderOptions, response: IResponseFn[IList[IOrder]]): IListPromise[IOrder] = js.native
  def list(data: IOrderListOptions, response: IResponseFn[IList[IOrder]]): IListPromise[IOrder] = js.native
  def list(options: HeaderOptions): IListPromise[IOrder] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IOrder]]): IListPromise[IOrder] = js.native
  def list(response: IResponseFn[IList[IOrder]]): IListPromise[IOrder] = js.native
  
  def pay(orderId: String, data: IOrderPayOptions): js.Promise[IOrder] = js.native
  /**
    * Pay an order by providing a source to create a payment.
    */
  def pay(orderId: String, data: IOrderPayOptions, options: HeaderOptions): js.Promise[IOrder] = js.native
  def pay(orderId: String, data: IOrderPayOptions, options: HeaderOptions, response: IResponseFn[IOrder]): js.Promise[IOrder] = js.native
  def pay(orderId: String, data: IOrderPayOptions, response: IResponseFn[IOrder]): js.Promise[IOrder] = js.native
  
  def retrieve(orderId: String): js.Promise[IOrder] = js.native
  def retrieve(orderId: String, data: IDataOptions): js.Promise[IOrder] = js.native
  /**
    * Retrieves the details of an existing order. Supply the unique order ID from either an order creation request or the order list,
    * and Stripe will return the corresponding order information.
    */
  def retrieve(orderId: String, data: IDataOptions, options: HeaderOptions): js.Promise[IOrder] = js.native
  def retrieve(orderId: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IOrder]): js.Promise[IOrder] = js.native
  def retrieve(orderId: String, data: IDataOptions, response: IResponseFn[IOrder]): js.Promise[IOrder] = js.native
  def retrieve(orderId: String, options: HeaderOptions): js.Promise[IOrder] = js.native
  def retrieve(orderId: String, options: HeaderOptions, response: IResponseFn[IOrder]): js.Promise[IOrder] = js.native
  def retrieve(orderId: String, response: IResponseFn[IOrder]): js.Promise[IOrder] = js.native
  
  def update(orderId: String, data: IOrderUpdateOptions): js.Promise[IOrder] = js.native
  /**
    * Updates the specific order by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    * This request accepts only the metadata, and status as arguments.
    */
  def update(orderId: String, data: IOrderUpdateOptions, options: HeaderOptions): js.Promise[IOrder] = js.native
  def update(orderId: String, data: IOrderUpdateOptions, options: HeaderOptions, response: IResponseFn[IOrder]): js.Promise[IOrder] = js.native
  def update(orderId: String, data: IOrderUpdateOptions, response: IResponseFn[IOrder]): js.Promise[IOrder] = js.native
}
