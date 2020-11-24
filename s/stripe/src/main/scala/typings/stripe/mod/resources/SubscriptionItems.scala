package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IList
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.StripeResource
import typings.stripe.mod.subscriptionItems.ISubscriptionItem
import typings.stripe.mod.subscriptionItems.ISubscriptionItemCreationOptions
import typings.stripe.mod.subscriptionItems.ISubscriptionItemDeleteOptions
import typings.stripe.mod.subscriptionItems.ISubscriptionItemListOptions
import typings.stripe.mod.subscriptionItems.ISubscriptionItemUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.SubscriptionItems")
@js.native
class SubscriptionItems () extends StripeResource {
  
  def create(data: ISubscriptionItemCreationOptions): js.Promise[ISubscriptionItem] = js.native
  /**
    * Adds a new item to an existing subscription. No existing items will be changed or replaced.
    *
    * @returns The created subscription item object is returned if successful. Otherwise, this call throws an error.
    *
    * @param options The options for the new subscription item.
    */
  def create(data: ISubscriptionItemCreationOptions, options: HeaderOptions): js.Promise[ISubscriptionItem] = js.native
  def create(
    data: ISubscriptionItemCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[ISubscriptionItem]
  ): js.Promise[ISubscriptionItem] = js.native
  def create(data: ISubscriptionItemCreationOptions, response: IResponseFn[ISubscriptionItem]): js.Promise[ISubscriptionItem] = js.native
  
  def del(subscriptionItemId: String): js.Promise[ISubscriptionItem] = js.native
  def del(subscriptionItemId: String, data: ISubscriptionItemDeleteOptions): js.Promise[ISubscriptionItem] = js.native
  /**
    * Deletes an item from the subscription. Removing a subscription item from a subscription will not cancel the subscription.
    *
    * @returns An subscription item object with a deleted flag upon success. Otherwise, this call throws an error, such as if the
    * subscription item has already been deleted.
    *
    * @param subscriptionItemId The identifier of the subscription item to delete.
    * @param data Specify whether to prorate and from when.
    */
  def del(subscriptionItemId: String, data: ISubscriptionItemDeleteOptions, options: HeaderOptions): js.Promise[ISubscriptionItem] = js.native
  def del(
    subscriptionItemId: String,
    data: ISubscriptionItemDeleteOptions,
    options: HeaderOptions,
    response: IResponseFn[ISubscriptionItem]
  ): js.Promise[ISubscriptionItem] = js.native
  def del(
    subscriptionItemId: String,
    data: ISubscriptionItemDeleteOptions,
    response: IResponseFn[ISubscriptionItem]
  ): js.Promise[ISubscriptionItem] = js.native
  def del(subscriptionItemId: String, options: HeaderOptions): js.Promise[ISubscriptionItem] = js.native
  def del(subscriptionItemId: String, options: HeaderOptions, response: IResponseFn[ISubscriptionItem]): js.Promise[ISubscriptionItem] = js.native
  def del(subscriptionItemId: String, response: IResponseFn[ISubscriptionItem]): js.Promise[ISubscriptionItem] = js.native
  
  def list(data: ISubscriptionItemListOptions): IListPromise[ISubscriptionItem] = js.native
  /**
    * Returns a list of your subscription items for a given subscription.
    *
    * @returns Returns a list of your subscription items for a given subscription.
    *
    * @param data Filtering options
    */
  def list(data: ISubscriptionItemListOptions, options: HeaderOptions): IListPromise[ISubscriptionItem] = js.native
  def list(
    data: ISubscriptionItemListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[ISubscriptionItem]]
  ): IListPromise[ISubscriptionItem] = js.native
  def list(data: ISubscriptionItemListOptions, response: IResponseFn[IList[ISubscriptionItem]]): IListPromise[ISubscriptionItem] = js.native
  
  def retrieve(subscriptionItemId: String): js.Promise[ISubscriptionItem] = js.native
  /**
    * Retrieves the subscription item with the given ID.
    *
    * @returns Returns a subscription item if a valid subscription item ID was provided. Throws an error otherwise.
    *
    * @param subscriptionItemId The identifier of the subscription item to retrieve.
    */
  def retrieve(subscriptionItemId: String, options: HeaderOptions): js.Promise[ISubscriptionItem] = js.native
  def retrieve(subscriptionItemId: String, options: HeaderOptions, response: IResponseFn[ISubscriptionItem]): js.Promise[ISubscriptionItem] = js.native
  def retrieve(subscriptionItemId: String, response: IResponseFn[ISubscriptionItem]): js.Promise[ISubscriptionItem] = js.native
  
  def update(subscriptionItemId: String, data: ISubscriptionItemUpdateOptions): js.Promise[ISubscriptionItem] = js.native
  /**
    * Updates the plan or quantity of an item on a current subscription.
    *
    * @param subscriptionItemId The identifier of the subscription item to modify.
    * @param data The fields to update
    */
  def update(subscriptionItemId: String, data: ISubscriptionItemUpdateOptions, options: HeaderOptions): js.Promise[ISubscriptionItem] = js.native
  def update(
    subscriptionItemId: String,
    data: ISubscriptionItemUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[ISubscriptionItem]
  ): js.Promise[ISubscriptionItem] = js.native
  def update(
    subscriptionItemId: String,
    data: ISubscriptionItemUpdateOptions,
    response: IResponseFn[ISubscriptionItem]
  ): js.Promise[ISubscriptionItem] = js.native
}
