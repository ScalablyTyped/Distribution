package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Customers
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def cancelSubscription(customerId: java.lang.String, subscriptionId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  def cancelSubscription(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionCancellationOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  /**
               * Cancels a customer's subscription. If you set the at_period_end parameter to true, the subscription will remain active until
               * the end of the period, at which point it will be canceled and not renewed. By default, the subscription is terminated
               * immediately. In either case, the customer will not be charged again for the subscription. Note, however, that any pending
               * invoice items that you've created will still be charged for at the end of the period unless manually deleted. If you've set
               * the subscription to cancel at period end, any pending prorations will also be left in place and collected at the end of the
               * period, but if the subscription is set to cancel immediately, pending prorations will be removed. By default, all unpaid
               * invoices for the customer will be closed upon subscription cancellation. We do this in order to prevent unexpected payment
               * retries once the customer has canceled a subscription. However, you can reopen the invoices manually after subscription
               * cancellation to have us proceed with automatic retries, or you could even re-attempt payment yourself on all unpaid invoices
               * before allowing the customer to cancel the subscription at all.
               *
               * @returns The canceled subscription object. Its subscription status will be set to "canceled" unless you've set at_period_end
               * to true when canceling, in which case the status will remain "active" but the cancel_at_period_end attribute will change to true.
               *
               * @param customerId The ID of the customer whose subscription needs to be cancelled.
               * @param subscriptionId The ID of the subscription to cancel.
               * @param data Specify when to cancel the subscription
               */
  def cancelSubscription(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionCancellationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  /**
               * Cancels a customer's subscription. If you set the at_period_end parameter to true, the subscription will remain active until
               * the end of the period, at which point it will be canceled and not renewed. By default, the subscription is terminated
               * immediately. In either case, the customer will not be charged again for the subscription. Note, however, that any pending
               * invoice items that you've created will still be charged for at the end of the period unless manually deleted. If you've set
               * the subscription to cancel at period end, any pending prorations will also be left in place and collected at the end of the
               * period, but if the subscription is set to cancel immediately, pending prorations will be removed. By default, all unpaid
               * invoices for the customer will be closed upon subscription cancellation. We do this in order to prevent unexpected payment
               * retries once the customer has canceled a subscription. However, you can reopen the invoices manually after subscription
               * cancellation to have us proceed with automatic retries, or you could even re-attempt payment yourself on all unpaid invoices
               * before allowing the customer to cancel the subscription at all.
               *
               * @returns The canceled subscription object. Its subscription status will be set to "canceled" unless you've set at_period_end
               * to true when canceling, in which case the status will remain "active" but the cancel_at_period_end attribute will change to true.
               *
               * @param customerId The ID of the customer whose subscription needs to be cancelled.
               * @param subscriptionId The ID of the subscription to cancel.
               * @param data Specify when to cancel the subscription
               */
  def cancelSubscription(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionCancellationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  def cancelSubscription(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionCancellationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  def cancelSubscription(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  def create(data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerCreationOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  /**
               * Creates a new customer object.
               *
               * @returns Returns a customer object if the call succeeded. The returned object will have information about subscriptions, discount,
               * and payment sources, if that information has been provided. If a non-free plan is specified and a source is not provided (unless
               * the plan has a trial period), the call will throw an error. If a non-existent plan or a non-existent or expired coupon is provided,
               * the call will throw an error. If a source has been attached to the customer, the returned customer object will have a default_source
               * attribute, which is an ID that can be expanded into the full source details when retrieving the customer.
               *
               * @param data The options for the new customer
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  /**
               * Creates a new customer object.
               *
               * @returns Returns a customer object if the call succeeded. The returned object will have information about subscriptions, discount,
               * and payment sources, if that information has been provided. If a non-free plan is specified and a source is not provided (unless
               * the plan has a trial period), the call will throw an error. If a non-existent plan or a non-existent or expired coupon is provided,
               * the call will throw an error. If a source has been attached to the customer, the returned customer object will have a default_source
               * attribute, which is an ID that can be expanded into the full source details when retrieving the customer.
               *
               * @param data The options for the new customer
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  def createCard(customerId: java.lang.String, data: stripeLib.Anon_Card): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * When you create a new credit card, you must specify a customer or recipient to create it on. If the card's owner has no default card,
               * then the new card will become the default. However, if the owner already has a default then it will not change. To change the default,
               * you should either update the customer to have a new default_source or update the recipient to have a new default_card.
               *
               * @returns Returns the card object.
               *
               * @param customerId The customer ID to which to add the card.
               *
               * @deprecated
               */
  def createCard(
    customerId: java.lang.String,
    data: stripeLib.Anon_Card,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * When you create a new credit card, you must specify a customer or recipient to create it on. If the card's owner has no default card,
               * then the new card will become the default. However, if the owner already has a default then it will not change. To change the default,
               * you should either update the customer to have a new default_source or update the recipient to have a new default_card.
               *
               * @returns Returns the card object.
               *
               * @param customerId The customer ID to which to add the card.
               *
               * @deprecated
               */
  def createCard(
    customerId: java.lang.String,
    data: stripeLib.Anon_Card,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def createCard(
    customerId: java.lang.String,
    data: stripeLib.Anon_Card,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def createSource(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerCardSourceCreationOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * When adding a card to a customer, the parameter name is source. When
               * adding to an account, the parameter name is external_account. The
               * value can either be a token, like the ones returned by our Stripe.js, or a
               * dictionary containing a user's credit card details.
               * Stripe will automatically validate the card.
               *
               * @returns Returns the card object.
               *
               * @param customerId The customer ID to which to add the card.
               */
  def createSource(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerCardSourceCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * When adding a card to a customer, the parameter name is source. When
               * adding to an account, the parameter name is external_account. The
               * value can either be a token, like the ones returned by our Stripe.js, or a
               * dictionary containing a user's credit card details.
               * Stripe will automatically validate the card.
               *
               * @returns Returns the card object.
               *
               * @param customerId The customer ID to which to add the card.
               */
  def createSource(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerCardSourceCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def createSource(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerCardSourceCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def createSource(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerSourceCreationOptions
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
  ] = js.native
  /**
               * When adding a card to a customer, the parameter name is source. When
               * adding to an account, the parameter name is external_account. The
               * value can either be a token, like the ones returned by our Stripe.js, or a
               * dictionary containing a user’s credit card details.
               * Stripe will automatically validate the card.
               *
               * @returns Returns the card or bank account object.
               *
               * @param customerId The customer ID to which to add the card.
               */
  def createSource(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerSourceCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
  ] = js.native
  /**
               * When adding a card to a customer, the parameter name is source. When
               * adding to an account, the parameter name is external_account. The
               * value can either be a token, like the ones returned by our Stripe.js, or a
               * dictionary containing a user’s credit card details.
               * Stripe will automatically validate the card.
               *
               * @returns Returns the card or bank account object.
               *
               * @param customerId The customer ID to which to add the card.
               */
  def createSource(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerSourceCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
  ] = js.native
  def createSource(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerSourceCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
  ] = js.native
  def createSubscription(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionCustCreationOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  /**
               * Creates a new subscription on an existing customer.
               *
               * @returns The newly created subscription object if the call succeeded. If the customer has no card or the
               * attempted charge fails, this call throws an error (unless the specified plan is free or has a trial
               * period).
               *
               * @param customerId The customer to which the add the subscription.
               * @param options The options for the new subscription
               */
  def createSubscription(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionCustCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  /**
               * Creates a new subscription on an existing customer.
               *
               * @returns The newly created subscription object if the call succeeded. If the customer has no card or the
               * attempted charge fails, this call throws an error (unless the specified plan is free or has a trial
               * period).
               *
               * @param customerId The customer to which the add the subscription.
               * @param options The options for the new subscription
               */
  def createSubscription(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionCustCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  def createSubscription(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionCustCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  def del(id: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
               * Permanently deletes a customer. It cannot be undone. Also immediately cancels any active subscriptions on the customer.
               *
               * @returns Returns an object with a deleted parameter on success. If the customer ID does not exist, this call throws an error. Unlike
               * other objects, deleted customers can still be retrieved through the API, in order to be able to track the history of customers while
               * still removing their credit card details and preventing any further operations to be performed (such as adding a new subscription).
               *
               * @param id The identifier of the customer to be deleted.
               */
  def del(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
               * Permanently deletes a customer. It cannot be undone. Also immediately cancels any active subscriptions on the customer.
               *
               * @returns Returns an object with a deleted parameter on success. If the customer ID does not exist, this call throws an error. Unlike
               * other objects, deleted customers can still be retrieved through the API, in order to be able to track the history of customers while
               * still removing their credit card details and preventing any further operations to be performed (such as adding a new subscription).
               *
               * @param id The identifier of the customer to be deleted.
               */
  def del(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def del(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def deleteCard(customerId: java.lang.String, cardId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
               * You can delete cards from a customer or recipient. If you delete a card that is currently the
               * default source on a customer, then the most recently added source will become the new default.
               * If you delete a card that is the last remaining source on the customer then the default_source
               * attribute will become null. Similarly, if you delete the default card on a recipient, then the
               * most recently added card will become the new default. If you delete the last remaining card on
               * a recipient, then the default_card attribute will become null. Note that for cards belonging to
               * customers, you may want to prevent customers on paid subscriptions from deleting all cards on
               * file so that there is at least one default card for the next invoice payment attempt.
               *
               * @returns Returns the deleted card object.
               *
               * @param customerId The ID of the customer whose card needs to be retrieved.
               * @param cardId The ID of the card to be retrieved.
               */
  def deleteCard(
    customerId: java.lang.String,
    cardId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
               * You can delete cards from a customer or recipient. If you delete a card that is currently the
               * default source on a customer, then the most recently added source will become the new default.
               * If you delete a card that is the last remaining source on the customer then the default_source
               * attribute will become null. Similarly, if you delete the default card on a recipient, then the
               * most recently added card will become the new default. If you delete the last remaining card on
               * a recipient, then the default_card attribute will become null. Note that for cards belonging to
               * customers, you may want to prevent customers on paid subscriptions from deleting all cards on
               * file so that there is at least one default card for the next invoice payment attempt.
               *
               * @returns Returns the deleted card object.
               *
               * @param customerId The ID of the customer whose card needs to be retrieved.
               * @param cardId The ID of the card to be retrieved.
               */
  def deleteCard(
    customerId: java.lang.String,
    cardId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def deleteCard(
    customerId: java.lang.String,
    cardId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def deleteDiscount(customerId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
               * Removes the currently applied discount on a customer.
               *
               * @returns An object with a deleted flag set to true upon success. This call throws an error otherwise, such as if no
               * discount exists on this customer.
               *
               * @param customerId The ID of the customer.
               */
  def deleteDiscount(customerId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
               * Removes the currently applied discount on a customer.
               *
               * @returns An object with a deleted flag set to true upon success. This call throws an error otherwise, such as if no
               * discount exists on this customer.
               *
               * @param customerId The ID of the customer.
               */
  def deleteDiscount(
    customerId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def deleteDiscount(
    customerId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def deleteSource(customerId: java.lang.String, sourceId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
               * You can delete cards or bank accounts from a customer or recipient. If you delete a card or bank account that is currently the
               * default source on a customer, then the most recently added source will become the new default.
               * If you delete a card or bank account that is the last remaining source on the customer then the default_source
               * attribute will become null. Similarly, if you delete the default card or bank account on a recipient, then the
               * most recently added source will become the new default. If you delete the last remaining source on
               * a recipient, then the default_card attribute will become null. Note that for sources belonging to
               * customers, you may want to prevent customers on paid subscriptions from deleting all sources on
               * file so that there is at least one default source for the next invoice payment attempt.
               *
               * @returns Returns a confirmation object.
               *
               * @param customerId The ID of the customer whose source needs to be deleted.
               * @param sourceId The ID of the source to be deleted.
               */
  def deleteSource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
               * You can delete cards or bank accounts from a customer or recipient. If you delete a card or bank account that is currently the
               * default source on a customer, then the most recently added source will become the new default.
               * If you delete a card or bank account that is the last remaining source on the customer then the default_source
               * attribute will become null. Similarly, if you delete the default card or bank account on a recipient, then the
               * most recently added source will become the new default. If you delete the last remaining source on
               * a recipient, then the default_card attribute will become null. Note that for sources belonging to
               * customers, you may want to prevent customers on paid subscriptions from deleting all sources on
               * file so that there is at least one default source for the next invoice payment attempt.
               *
               * @returns Returns a confirmation object.
               *
               * @param customerId The ID of the customer whose source needs to be deleted.
               * @param sourceId The ID of the source to be deleted.
               */
  def deleteSource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def deleteSource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def deleteSubscriptionDiscount(customerId: java.lang.String, subscriptionId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
               * Removes the currently applied discount on a subscription.
               *
               * @returns An object with a deleted flag set to true upon success. This call throws an error otherwise, such as if no
               * discount exists on this subscription.
               *
               * @param customerId The ID of the customer.
               * @param subscriptionId The ID of the subscription.
               */
  def deleteSubscriptionDiscount(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
               * Removes the currently applied discount on a subscription.
               *
               * @returns An object with a deleted flag set to true upon success. This call throws an error otherwise, such as if no
               * discount exists on this subscription.
               *
               * @param customerId The ID of the customer.
               * @param subscriptionId The ID of the subscription.
               */
  def deleteSubscriptionDiscount(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def deleteSubscriptionDiscount(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def list(): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerListOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ] = js.native
  /**
               * Returns a list of your customers. The customers are returned sorted by creation date, with the most recently created customers
               * appearing first.
               *
               * @returns A object with a data property that contains an array of up to limit customers, starting after customer starting_after.
               * Each entry in the array is a separate customer object. If no more customers are available, the resulting array will be empty.
               * This request should never throw an error. You can optionally request that the response include the total count of all customers
               * that match your filters. To do so, specify include[]=total_count in your request.
               *
               * @param data Allows you to filter the customers you want.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ] = js.native
  /**
               * Returns a list of your customers. The customers are returned sorted by creation date, with the most recently created customers
               * appearing first.
               *
               * @returns A object with a data property that contains an array of up to limit customers, starting after customer starting_after.
               * Each entry in the array is a separate customer object. If no more customers are available, the resulting array will be empty.
               * This request should never throw an error. You can optionally request that the response include the total count of all customers
               * that match your filters. To do so, specify include[]=total_count in your request.
               *
               * @param data Allows you to filter the customers you want.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ] = js.native
  def listCards(customerId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def listCards(customerId: java.lang.String, data: stripeLib.stripeMod.StripeNs.IListOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  /**
               * You can see a list of the cards belonging to a customer or recipient. Note that the 10 most recent
               * cards are always available by default on the customer or recipient object. If you need more than
               * those 10, you can use this API method and the limit and starting_after parameters to page through
               * additional cards.
               *
               * @returns Returns a list of the cards stored on the customer or recipient. You can optionally request
               * that the response include the total count of all cards for the customer or recipient. To do so,
               * specify include[]=total_count in your request.
               *
               * @param customerId The ID of the customer whose cards will be retrieved
               * @param data Filtering options
               */
  def listCards(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  /**
               * You can see a list of the cards belonging to a customer or recipient. Note that the 10 most recent
               * cards are always available by default on the customer or recipient object. If you need more than
               * those 10, you can use this API method and the limit and starting_after parameters to page through
               * additional cards.
               *
               * @returns Returns a list of the cards stored on the customer or recipient. You can optionally request
               * that the response include the total count of all cards for the customer or recipient. To do so,
               * specify include[]=total_count in your request.
               *
               * @param customerId The ID of the customer whose cards will be retrieved
               * @param data Filtering options
               */
  def listCards(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def listCards(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def listCards(customerId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def listCards(
    customerId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def listCards(
    customerId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def listSources(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.IBankAccountSourceListOptions
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
  ] = js.native
  /**
               * You can see a list of the bank accounts belonging to a customer or recipient. Note that the 10 most recent
               * bank accounts are always available by default on the customer or recipient object. If you need more than
               * those 10, you can use this API method and the limit and starting_after parameters to page through
               * additional cards.
               *
               * @returns Returns a list of the bank accounts stored on the customer or recipient. You can optionally request
               * that the response include the total count of all bank accounts for the customer or recipient. To do so,
               * specify include[]=total_count in your request.
               *
               * @param customerId The ID of the customer whose cards will be retrieved
               * @param data Filtering options
               */
  def listSources(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.IBankAccountSourceListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
  ] = js.native
  /**
               * You can see a list of the bank accounts belonging to a customer or recipient. Note that the 10 most recent
               * bank accounts are always available by default on the customer or recipient object. If you need more than
               * those 10, you can use this API method and the limit and starting_after parameters to page through
               * additional cards.
               *
               * @returns Returns a list of the bank accounts stored on the customer or recipient. You can optionally request
               * that the response include the total count of all bank accounts for the customer or recipient. To do so,
               * specify include[]=total_count in your request.
               *
               * @param customerId The ID of the customer whose cards will be retrieved
               * @param data Filtering options
               */
  def listSources(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.IBankAccountSourceListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
  ] = js.native
  def listSources(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.IBankAccountSourceListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
  ] = js.native
  def listSources(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICardSourceListOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  /**
               * You can see a list of the cards belonging to a customer or recipient. Note that the 10 most recent
               * cards are always available by default on the customer or recipient object. If you need more than
               * those 10, you can use this API method and the limit and starting_after parameters to page through
               * additional cards.
               *
               * @returns Returns a list of the cards stored on the customer or recipient. You can optionally request
               * that the response include the total count of all cards for the customer or recipient. To do so,
               * specify include[]=total_count in your request.
               *
               * @param customerId The ID of the customer whose cards will be retrieved
               * @param data Filtering options
               */
  def listSources(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICardSourceListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  /**
               * You can see a list of the cards belonging to a customer or recipient. Note that the 10 most recent
               * cards are always available by default on the customer or recipient object. If you need more than
               * those 10, you can use this API method and the limit and starting_after parameters to page through
               * additional cards.
               *
               * @returns Returns a list of the cards stored on the customer or recipient. You can optionally request
               * that the response include the total count of all cards for the customer or recipient. To do so,
               * specify include[]=total_count in your request.
               *
               * @param customerId The ID of the customer whose cards will be retrieved
               * @param data Filtering options
               */
  def listSources(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICardSourceListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def listSources(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICardSourceListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def listSubscriptions(customerId: java.lang.String): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ] = js.native
  def listSubscriptions(customerId: java.lang.String, data: stripeLib.stripeMod.StripeNs.IListOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ] = js.native
  /**
               * You can see a list of the customer's active subscriptions. Note that the 10 most recent active subscriptions are always available
               * by default on the customer object. If you need more than those 10, you can use the limit and starting_after parameters to page
               * through additional subscriptions.
               *
               * @returns Returns a list of the customer's active subscriptions. You can optionally request that the response include the total
               * count of all subscriptions for the customer. To do so, specify include[]=total_count in your request.
               *
               * @param customerId The ID of the customer whose subscriptions will be retrieved
               * @param data Filtering options
               */
  def listSubscriptions(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ] = js.native
  /**
               * You can see a list of the customer's active subscriptions. Note that the 10 most recent active subscriptions are always available
               * by default on the customer object. If you need more than those 10, you can use the limit and starting_after parameters to page
               * through additional subscriptions.
               *
               * @returns Returns a list of the customer's active subscriptions. You can optionally request that the response include the total
               * count of all subscriptions for the customer. To do so, specify include[]=total_count in your request.
               *
               * @param customerId The ID of the customer whose subscriptions will be retrieved
               * @param data Filtering options
               */
  def listSubscriptions(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ] = js.native
  def listSubscriptions(
    customerId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ] = js.native
  def listSubscriptions(customerId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ] = js.native
  def listSubscriptions(
    customerId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ] = js.native
  def listSubscriptions(
    customerId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ] = js.native
  def retrieve(id: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  def retrieve(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  /**
               * Retrieves the details of an existing customer. You need only supply the unique customer identifier that was returned upon customer
               * creation.
               *
               * @returns Returns a customer object if a valid identifier was provided. When requesting the ID of a customer that has been deleted,
               * a subset of the customer's information will be returned, including a "deleted" property, which will be true.
               *
               * @param id The identifier of the customer to be retrieved.
               */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  /**
               * Retrieves the details of an existing customer. You need only supply the unique customer identifier that was returned upon customer
               * creation.
               *
               * @returns Returns a customer object if a valid identifier was provided. When requesting the ID of a customer that has been deleted,
               * a subset of the customer's information will be returned, including a "deleted" property, which will be true.
               *
               * @param id The identifier of the customer to be retrieved.
               */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  def retrieve(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  def retrieve(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  def retrieve(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  def retrieveCard(customerId: java.lang.String, cardId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * By default, you can see the 10 most recent cards stored on a customer or recipient directly on the customer or recipient object, but
               * you can also retrieve details about a specific card stored on the customer or recipient.
               *
               * @returns Returns the card object.
               *
               * @param customerId The ID of the customer whose card needs to be retrieved.
               * @param cardId The ID of the card to be retrieved.
               */
  def retrieveCard(
    customerId: java.lang.String,
    cardId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * By default, you can see the 10 most recent cards stored on a customer or recipient directly on the customer or recipient object, but
               * you can also retrieve details about a specific card stored on the customer or recipient.
               *
               * @returns Returns the card object.
               *
               * @param customerId The ID of the customer whose card needs to be retrieved.
               * @param cardId The ID of the card to be retrieved.
               */
  def retrieveCard(
    customerId: java.lang.String,
    cardId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def retrieveCard(
    customerId: java.lang.String,
    cardId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def retrieveSource(customerId: java.lang.String, sourceId: java.lang.String): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
  ] = js.native
  /**
               * By default, you can see the 10 most recent cards/bank accounts stored on a customer or recipient directly on the customer or recipient object, but
               * you can also retrieve details about a specific card/bank account stored on the customer or recipient.
               *
               * @returns Returns the card/bank account object.
               *
               * @param customerId The ID of the customer whose card needs to be retrieved.
               * @param sourceId The ID of the source to be retrieved.
               */
  def retrieveSource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
  ] = js.native
  /**
               * By default, you can see the 10 most recent cards/bank accounts stored on a customer or recipient directly on the customer or recipient object, but
               * you can also retrieve details about a specific card/bank account stored on the customer or recipient.
               *
               * @returns Returns the card/bank account object.
               *
               * @param customerId The ID of the customer whose card needs to be retrieved.
               * @param sourceId The ID of the source to be retrieved.
               */
  def retrieveSource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
  ] = js.native
  def retrieveSource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
  ] = js.native
  def retrieveSubscription(customerId: java.lang.String, subscriptionId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  /**
               * By default, you can see the 10 most recent active subscriptions stored on a customer directly on the customer
               * object, but you can also retrieve details about a specific active subscription for a customer.
               *
               * @returns Returns the subscription object.
               *
               * @param customerId The customer ID for the subscription
               * @param subscriptionId The ID of the subscription to retrieve
               */
  def retrieveSubscription(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  /**
               * By default, you can see the 10 most recent active subscriptions stored on a customer directly on the customer
               * object, but you can also retrieve details about a specific active subscription for a customer.
               *
               * @returns Returns the subscription object.
               *
               * @param customerId The customer ID for the subscription
               * @param subscriptionId The ID of the subscription to retrieve
               */
  def retrieveSubscription(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  def retrieveSubscription(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  def update(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerUpdateOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  /**
               * Updates the specified customer by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
               * For example, if you pass the card parameter, that becomes the customer's active card to be used for all charges in the future.
               * When you update a customer to a new valid card: for each of the customer's current subscriptions, if the subscription is in the
               * past_due state, then the latest unpaid, unclosed invoice for the subscription will be retried (note that this retry will not count
               * as an automatic retry, and will not affect the next regularly scheduled payment for the invoice). (Note also that no invoices
               * pertaining to subscriptions in the unpaid state, or invoices pertaining to canceled subscriptions, will be retried as a result
               * of updating the customer's card.) This request accepts mostly the same arguments as the customer creation call.
               *
               * @returns Returns the customer object if the update succeeded. Throws an error if update parameters are invalid (e.g. specifying
               * an invalid coupon or an invalid card).
               *
               * @param id The identifier of the customer to be retrieved.
               */
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  /**
               * Updates the specified customer by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
               * For example, if you pass the card parameter, that becomes the customer's active card to be used for all charges in the future.
               * When you update a customer to a new valid card: for each of the customer's current subscriptions, if the subscription is in the
               * past_due state, then the latest unpaid, unclosed invoice for the subscription will be retried (note that this retry will not count
               * as an automatic retry, and will not affect the next regularly scheduled payment for the invoice). (Note also that no invoices
               * pertaining to subscriptions in the unpaid state, or invoices pertaining to canceled subscriptions, will be retried as a result
               * of updating the customer's card.) This request accepts mostly the same arguments as the customer creation call.
               *
               * @returns Returns the customer object if the update succeeded. Throws an error if update parameters are invalid (e.g. specifying
               * an invalid coupon or an invalid card).
               *
               * @param id The identifier of the customer to be retrieved.
               */
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.customersNs.ICustomerUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.customersNs.ICustomer]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.customersNs.ICustomer] = js.native
  def updateCard(
    customerId: java.lang.String,
    cardId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * If you need to update only some card details, like the billing address or expiration date, you can do so without having to re-enter the
               * full card details. Stripe also works directly with card networks so that your customers can continue using your service without
               * interruption. When you update a card, Stripe will automatically validate the card.
               *
               * @returns Returns the card object.
               *
               * @param customerId The ID of the customer whose card needs to be retrieved.
               * @param cardId The ID of the card to be retrieved.
               */
  def updateCard(
    customerId: java.lang.String,
    cardId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * If you need to update only some card details, like the billing address or expiration date, you can do so without having to re-enter the
               * full card details. Stripe also works directly with card networks so that your customers can continue using your service without
               * interruption. When you update a card, Stripe will automatically validate the card.
               *
               * @returns Returns the card object.
               *
               * @param customerId The ID of the customer whose card needs to be retrieved.
               * @param cardId The ID of the card to be retrieved.
               */
  def updateCard(
    customerId: java.lang.String,
    cardId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def updateCard(
    customerId: java.lang.String,
    cardId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def updateSource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccountUpdateOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount] = js.native
  /**
               * Updates the metadata, account_holder_name, and account_holder_type of a bank account belonging to a Customer. Other bank account details
               * are not editable by design.
               *
               * @returns Returns the bank account object.
               *
               * @param customerId The ID of the customer whose card needs to be retrieved.
               * @param sourceId The ID of the bank account to be updated.
               */
  def updateSource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccountUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * Updates the metadata, account_holder_name, and account_holder_type of a bank account belonging to a Customer. Other bank account details
               * are not editable by design.
               *
               * @returns Returns the bank account object.
               *
               * @param customerId The ID of the customer whose card needs to be retrieved.
               * @param sourceId The ID of the bank account to be updated.
               */
  def updateSource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccountUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def updateSource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccountUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount] = js.native
  def updateSource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * If you need to update only some card details, like the billing address or expiration date, you can do so without having to re-enter the
               * full card details. Stripe also works directly with card networks so that your customers can continue using your service without
               * interruption. When you update a card, Stripe will automatically validate the card.
               *
               * @returns Returns the card object.
               *
               * @param customerId The ID of the customer whose card needs to be retrieved.
               * @param sourceId The ID of the card to be retrieved.
               */
  def updateSource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
               * If you need to update only some card details, like the billing address or expiration date, you can do so without having to re-enter the
               * full card details. Stripe also works directly with card networks so that your customers can continue using your service without
               * interruption. When you update a card, Stripe will automatically validate the card.
               *
               * @returns Returns the card object.
               *
               * @param customerId The ID of the customer whose card needs to be retrieved.
               * @param sourceId The ID of the card to be retrieved.
               */
  def updateSource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def updateSource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def updateSubscription(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionUpdateOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  /**
               * Updates an existing subscription on a customer to match the specified parameters. When changing plans or quantities,
               * we will optionally prorate the price we charge next month to make up for any price changes.
               *
               * By default, we prorate subscription changes. For example, if a customer signs up on May 1 for a $10 plan, she'll be billed
               * $10 immediately. If she then switches to a $20 plan on May 15, on June 1 she'll be billed $25 ($20 for a renewal of her
               * subscription and a $5 prorating adjustment for the previous month). Similarly, a downgrade will generate a credit to be
               * applied to the next invoice. We also prorate when you make quantity changes. Switching plans does not change the billing
               * date or generate an immediate charge unless you're switching between different intervals (e.g. monthly to yearly), in which
               * case we apply a credit for the time unused on the old plan and charge for the new plan starting right away, resetting the
               * billing date. (Note that if we charge for the new plan, and that payment fails, the plan change will not go into effect). If
               * you'd like to charge for an upgrade immediately, just pass prorate as true as usual, and then invoice the customer as soon
               * as you make the subscription change. That'll collect the proration adjustments into a new invoice, and Stripe will automatically
               * attempt to pay the invoice. If you don't want to prorate at all, set the prorate option to false and the customer would be billed
               * $10 on May 1 and $20 on June 1. Similarly, if you set prorate to false when switching between different billing intervals
               * (monthly to yearly, for example), we won't generate any credits for the old subscription's unused time, although we will still
               * reset the billing date and bill immediately for the new subscription.
               *
               * @returns The newly updated subscription object if the call succeeded. If a charge is required for the update, and
               * the charge fails, this call raises throws an error, and the subscription update does not go into effect.
               *
               * @param customerId The ID of the customer whose subscription needs to be updated.
               * @param subscriptionId The ID of the subscription to update.
               * @param data The fields to update
               */
  def updateSubscription(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  /**
               * Updates an existing subscription on a customer to match the specified parameters. When changing plans or quantities,
               * we will optionally prorate the price we charge next month to make up for any price changes.
               *
               * By default, we prorate subscription changes. For example, if a customer signs up on May 1 for a $10 plan, she'll be billed
               * $10 immediately. If she then switches to a $20 plan on May 15, on June 1 she'll be billed $25 ($20 for a renewal of her
               * subscription and a $5 prorating adjustment for the previous month). Similarly, a downgrade will generate a credit to be
               * applied to the next invoice. We also prorate when you make quantity changes. Switching plans does not change the billing
               * date or generate an immediate charge unless you're switching between different intervals (e.g. monthly to yearly), in which
               * case we apply a credit for the time unused on the old plan and charge for the new plan starting right away, resetting the
               * billing date. (Note that if we charge for the new plan, and that payment fails, the plan change will not go into effect). If
               * you'd like to charge for an upgrade immediately, just pass prorate as true as usual, and then invoice the customer as soon
               * as you make the subscription change. That'll collect the proration adjustments into a new invoice, and Stripe will automatically
               * attempt to pay the invoice. If you don't want to prorate at all, set the prorate option to false and the customer would be billed
               * $10 on May 1 and $20 on June 1. Similarly, if you set prorate to false when switching between different billing intervals
               * (monthly to yearly, for example), we won't generate any credits for the old subscription's unused time, although we will still
               * reset the billing date and bill immediately for the new subscription.
               *
               * @returns The newly updated subscription object if the call succeeded. If a charge is required for the update, and
               * the charge fails, this call raises throws an error, and the subscription update does not go into effect.
               *
               * @param customerId The ID of the customer whose subscription needs to be updated.
               * @param subscriptionId The ID of the subscription to update.
               * @param data The fields to update
               */
  def updateSubscription(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  def updateSubscription(
    customerId: java.lang.String,
    subscriptionId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscriptionUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription] = js.native
  def verifySource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccountVerifyOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount] = js.native
  /**
               * A customer's bank account must first be verified before it can be charged. Stripe supports instant verification using Plaid for many of
               * the most popular banks. If your customer's bank is not supported or you do not wish to integrate with Plaid, you must manually verify
               * the customer's bank account using the API.
               *
               * @returns Returns the bank account object.
               *
               * @param customerId The ID of the customer whose source needs to be verified.
               * @param sourceId The ID of the source to be verified.
               */
  def verifySource(
    customerId: java.lang.String,
    sourceId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccountVerifyOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount] = js.native
}

