package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionItems
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def create(data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  /**
               * Adds a new item to an existing subscription. No existing items will be changed or replaced.
               *
               * @returns The created subscription item object is returned if successful. Otherwise, this call throws an error.
               *
               * @param options The options for the new subscription item.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  /**
               * Adds a new item to an existing subscription. No existing items will be changed or replaced.
               *
               * @returns The created subscription item object is returned if successful. Otherwise, this call throws an error.
               *
               * @param options The options for the new subscription item.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  def del(subscriptionItemId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  def del(
    subscriptionItemId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemDeleteOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  /**
               * Deletes an item from the subscription. Removing a subscription item from a subscription will not cancel the subscription.
               *
               * @returns An subscription item object with a deleted flag upon success. Otherwise, this call throws an error, such as if the
               * subscription item has already been deleted.
               *
               * @param subscriptionItemId The identifier of the subscription item to delete.
               * @param data Specify whether to prorate and from when.
               */
  def del(
    subscriptionItemId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemDeleteOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  /**
               * Deletes an item from the subscription. Removing a subscription item from a subscription will not cancel the subscription.
               *
               * @returns An subscription item object with a deleted flag upon success. Otherwise, this call throws an error, such as if the
               * subscription item has already been deleted.
               *
               * @param subscriptionItemId The identifier of the subscription item to delete.
               * @param data Specify whether to prorate and from when.
               */
  def del(
    subscriptionItemId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemDeleteOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  def del(
    subscriptionItemId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemDeleteOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  def del(subscriptionItemId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  def del(
    subscriptionItemId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  def del(
    subscriptionItemId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemListOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  ] = js.native
  /**
               * Returns a list of your subscription items for a given subscription.
               *
               * @returns Returns a list of your subscription items for a given subscription.
               *
               * @param data Filtering options
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  ] = js.native
  /**
               * Returns a list of your subscription items for a given subscription.
               *
               * @returns Returns a list of your subscription items for a given subscription.
               *
               * @param data Filtering options
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  ] = js.native
  def retrieve(subscriptionItemId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  /**
               * Retrieves the subscription item with the given ID.
               *
               * @returns Returns a subscription item if a valid subscription item ID was provided. Throws an error otherwise.
               *
               * @param subscriptionItemId The identifier of the subscription item to retrieve.
               */
  def retrieve(subscriptionItemId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  /**
               * Retrieves the subscription item with the given ID.
               *
               * @returns Returns a subscription item if a valid subscription item ID was provided. Throws an error otherwise.
               *
               * @param subscriptionItemId The identifier of the subscription item to retrieve.
               */
  def retrieve(
    subscriptionItemId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  def retrieve(
    subscriptionItemId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  def update(
    subscriptionItemId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemUpdateOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  /**
               * Updates the plan or quantity of an item on a current subscription.
               *
               * @param subscriptionItemId The identifier of the subscription item to modify.
               * @param data The fields to update
               */
  def update(
    subscriptionItemId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  /**
               * Updates the plan or quantity of an item on a current subscription.
               *
               * @param subscriptionItemId The identifier of the subscription item to modify.
               * @param data The fields to update
               */
  def update(
    subscriptionItemId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
  def update(
    subscriptionItemId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItemUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem] = js.native
}

