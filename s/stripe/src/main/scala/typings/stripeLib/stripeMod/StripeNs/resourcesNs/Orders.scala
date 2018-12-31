package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Orders extends js.Object {
  def create(data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  /**
    * Creates a new order object.
    */
  def create(
    data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]
  ): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]
  ): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def list(): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderListOptions): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]] = js.native
  /**
    * Returns a list of your orders. The orders are returned sorted by creation date, with the most recently created orders appearing first.
    */
  def list(
    data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]] = js.native
  def pay(orderId: java.lang.String, data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderPayOptions): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  /**
    * Pay an order by providing a source to create a payment.
    */
  def pay(
    orderId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderPayOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def pay(
    orderId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderPayOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]
  ): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def pay(
    orderId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderPayOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]
  ): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def retrieve(orderId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def retrieve(orderId: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  /**
    * Retrieves the details of an existing order. Supply the unique order ID from either an order creation request or the order list,
    * and Stripe will return the corresponding order information.
    */
  def retrieve(
    orderId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def retrieve(
    orderId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]
  ): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def retrieve(
    orderId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]
  ): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def retrieve(orderId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def retrieve(
    orderId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]
  ): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def retrieve(
    orderId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]
  ): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def update(orderId: java.lang.String, data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderUpdateOptions): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  /**
    * Updates the specific order by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    * This request accepts only the metadata, and status as arguments.
    */
  def update(
    orderId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def update(
    orderId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]
  ): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
  def update(
    orderId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.ordersNs.IOrderUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.ordersNs.IOrder]
  ): js.Promise[stripeLib.stripeMod.StripeNs.ordersNs.IOrder] = js.native
}

