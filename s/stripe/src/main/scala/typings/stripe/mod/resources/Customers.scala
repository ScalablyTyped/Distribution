package typings.stripe.mod.resources

import typings.stripe.anon.Card
import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IDataOptions
import typings.stripe.mod.IDeleteConfirmation
import typings.stripe.mod.IList
import typings.stripe.mod.IListOptions
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.IStripeSource
import typings.stripe.mod.StripeResource
import typings.stripe.mod.bankAccounts.IBankAccount
import typings.stripe.mod.bankAccounts.IBankAccountUpdateOptions
import typings.stripe.mod.bankAccounts.IBankAccountVerifyOptions
import typings.stripe.mod.cards.ICard
import typings.stripe.mod.cards.ICardUpdateOptions
import typings.stripe.mod.customerBalanceTransactions.ICustomerBalanceTransaction
import typings.stripe.mod.customerBalanceTransactions.ICustomerBalanceTransactionCreationOptions
import typings.stripe.mod.customerBalanceTransactions.ICustomerBalanceTransactionUpdateOptions
import typings.stripe.mod.customerTaxIds.ITaxId
import typings.stripe.mod.customerTaxIds.ITaxIdCreationOptions
import typings.stripe.mod.customers.IBankAccountSourceListOptions
import typings.stripe.mod.customers.ICardSourceListOptions
import typings.stripe.mod.customers.ICustomer
import typings.stripe.mod.customers.ICustomerBankAccountSourceCreationOptions
import typings.stripe.mod.customers.ICustomerCardSourceCreationOptions
import typings.stripe.mod.customers.ICustomerCreationOptions
import typings.stripe.mod.customers.ICustomerListOptions
import typings.stripe.mod.customers.ICustomerSourceCreationOptions
import typings.stripe.mod.customers.ICustomerUpdateOptions
import typings.stripe.mod.customers.ISourceListOptions
import typings.stripe.mod.sources.ISource
import typings.stripe.mod.subscriptions.ISubscription
import typings.stripe.mod.subscriptions.ISubscriptionCancellationOptions
import typings.stripe.mod.subscriptions.ISubscriptionCustCreationOptions
import typings.stripe.mod.subscriptions.ISubscriptionUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Customers")
@js.native
class Customers () extends StripeResource {
  
  def cancelSubscription(customerId: String, subscriptionId: String): js.Promise[ISubscription] = js.native
  def cancelSubscription(customerId: String, subscriptionId: String, data: ISubscriptionCancellationOptions): js.Promise[ISubscription] = js.native
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
    customerId: String,
    subscriptionId: String,
    data: ISubscriptionCancellationOptions,
    options: HeaderOptions
  ): js.Promise[ISubscription] = js.native
  def cancelSubscription(
    customerId: String,
    subscriptionId: String,
    data: ISubscriptionCancellationOptions,
    options: HeaderOptions,
    response: IResponseFn[ISubscription]
  ): js.Promise[ISubscription] = js.native
  def cancelSubscription(
    customerId: String,
    subscriptionId: String,
    data: ISubscriptionCancellationOptions,
    response: IResponseFn[ISubscription]
  ): js.Promise[ISubscription] = js.native
  def cancelSubscription(customerId: String, subscriptionId: String, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
  
  def create(data: ICustomerCreationOptions): js.Promise[ICustomer] = js.native
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
  def create(data: ICustomerCreationOptions, options: HeaderOptions): js.Promise[ICustomer] = js.native
  def create(data: ICustomerCreationOptions, options: HeaderOptions, response: IResponseFn[ICustomer]): js.Promise[ICustomer] = js.native
  def create(data: ICustomerCreationOptions, response: IResponseFn[ICustomer]): js.Promise[ICustomer] = js.native
  
  def createBalanceTransaction(customerId: String, data: ICustomerBalanceTransactionCreationOptions): js.Promise[ICustomerBalanceTransaction] = js.native
  /**
    * Creates an immutable transaction that updates the customer’s balance.
    */
  def createBalanceTransaction(customerId: String, data: ICustomerBalanceTransactionCreationOptions, options: HeaderOptions): js.Promise[ICustomerBalanceTransaction] = js.native
  def createBalanceTransaction(
    customerId: String,
    data: ICustomerBalanceTransactionCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[ICustomerBalanceTransaction]
  ): js.Promise[ICustomerBalanceTransaction] = js.native
  def createBalanceTransaction(
    customerId: String,
    data: ICustomerBalanceTransactionCreationOptions,
    response: IResponseFn[ICustomerBalanceTransaction]
  ): js.Promise[ICustomerBalanceTransaction] = js.native
  
  def createCard(customerId: String, data: Card): js.Promise[ICard] = js.native
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
  def createCard(customerId: String, data: Card, options: HeaderOptions): js.Promise[ICard] = js.native
  def createCard(customerId: String, data: Card, options: HeaderOptions, response: IResponseFn[ICard]): js.Promise[ICard] = js.native
  def createCard(customerId: String, data: Card, response: IResponseFn[ICard]): js.Promise[ICard] = js.native
  
  def createSource(customerId: String, data: ICustomerBankAccountSourceCreationOptions): js.Promise[IBankAccount] = js.native
  /**
    * When adding a bank account to a customer, the parameter name is source. When
    * adding to an account, the parameter name is external_account. The
    * value can either be a token, like the ones returned by our Stripe.js, or a
    * dictionary containing a user’s bank account details.
    *
    * @returns Returns the bank account object.
    *
    * @param customerId The customer ID to which to add the bank account.
    */
  def createSource(customerId: String, data: ICustomerBankAccountSourceCreationOptions, options: HeaderOptions): js.Promise[IBankAccount] = js.native
  def createSource(
    customerId: String,
    data: ICustomerBankAccountSourceCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[IBankAccount]
  ): js.Promise[IBankAccount] = js.native
  def createSource(
    customerId: String,
    data: ICustomerBankAccountSourceCreationOptions,
    response: IResponseFn[IBankAccount]
  ): js.Promise[IBankAccount] = js.native
  def createSource(customerId: String, data: ICustomerCardSourceCreationOptions): js.Promise[ICard] = js.native
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
  def createSource(customerId: String, data: ICustomerCardSourceCreationOptions, options: HeaderOptions): js.Promise[ICard] = js.native
  def createSource(
    customerId: String,
    data: ICustomerCardSourceCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[ICard]
  ): js.Promise[ICard] = js.native
  def createSource(customerId: String, data: ICustomerCardSourceCreationOptions, response: IResponseFn[ICard]): js.Promise[ICard] = js.native
  def createSource(customerId: String, data: ICustomerSourceCreationOptions): js.Promise[IStripeSource] = js.native
  /**
    * When adding a card or bank account to a customer, the parameter name is source. When
    * adding to an account, the parameter name is external_account. The
    * value can either be a token, like the ones returned by our Stripe.js, or a
    * dictionary containing a user’s credit card or bank account details.
    * Stripe will automatically validate the card.
    *
    * @returns Returns the card or bank account object.
    *
    * @param customerId The customer ID to which to add the card or bank account.
    */
  def createSource(customerId: String, data: ICustomerSourceCreationOptions, options: HeaderOptions): js.Promise[IStripeSource] = js.native
  def createSource(
    customerId: String,
    data: ICustomerSourceCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[IStripeSource]
  ): js.Promise[IStripeSource] = js.native
  def createSource(customerId: String, data: ICustomerSourceCreationOptions, response: IResponseFn[IStripeSource]): js.Promise[IStripeSource] = js.native
  
  def createSubscription(customerId: String, data: ISubscriptionCustCreationOptions): js.Promise[ISubscription] = js.native
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
  def createSubscription(customerId: String, data: ISubscriptionCustCreationOptions, options: HeaderOptions): js.Promise[ISubscription] = js.native
  def createSubscription(
    customerId: String,
    data: ISubscriptionCustCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[ISubscription]
  ): js.Promise[ISubscription] = js.native
  def createSubscription(customerId: String, data: ISubscriptionCustCreationOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
  
  def createTaxId(customerId: String, data: ITaxIdCreationOptions): js.Promise[ITaxId] = js.native
  def createTaxId(customerId: String, data: ITaxIdCreationOptions, options: HeaderOptions): js.Promise[ITaxId] = js.native
  def createTaxId(
    customerId: String,
    data: ITaxIdCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[ISubscription]
  ): js.Promise[ITaxId] = js.native
  def createTaxId(customerId: String, data: ITaxIdCreationOptions, response: IResponseFn[ISubscription]): js.Promise[ITaxId] = js.native
  
  def del(id: String): js.Promise[IDeleteConfirmation] = js.native
  /**
    * Permanently deletes a customer. It cannot be undone. Also immediately cancels any active subscriptions on the customer.
    *
    * @returns Returns an object with a deleted parameter on success. If the customer ID does not exist, this call throws an error. Unlike
    * other objects, deleted customers can still be retrieved through the API, in order to be able to track the history of customers while
    * still removing their credit card details and preventing any further operations to be performed (such as adding a new subscription).
    *
    * @param id The identifier of the customer to be deleted.
    */
  def del(id: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def del(id: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def del(id: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  
  def deleteCard(customerId: String, cardId: String): js.Promise[IDeleteConfirmation] = js.native
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
  def deleteCard(customerId: String, cardId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def deleteCard(
    customerId: String,
    cardId: String,
    options: HeaderOptions,
    response: IResponseFn[IDeleteConfirmation]
  ): js.Promise[IDeleteConfirmation] = js.native
  def deleteCard(customerId: String, cardId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  
  def deleteDiscount(customerId: String): js.Promise[IDeleteConfirmation] = js.native
  /**
    * Removes the currently applied discount on a customer.
    *
    * @returns An object with a deleted flag set to true upon success. This call throws an error otherwise, such as if no
    * discount exists on this customer.
    *
    * @param customerId The ID of the customer.
    */
  def deleteDiscount(customerId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def deleteDiscount(customerId: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def deleteDiscount(customerId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  
  def deleteSource(customerId: String, sourceId: String): js.Promise[IDeleteConfirmation] = js.native
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
  def deleteSource(customerId: String, sourceId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def deleteSource(
    customerId: String,
    sourceId: String,
    options: HeaderOptions,
    response: IResponseFn[IDeleteConfirmation]
  ): js.Promise[IDeleteConfirmation] = js.native
  def deleteSource(customerId: String, sourceId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  
  def deleteSubscriptionDiscount(customerId: String, subscriptionId: String): js.Promise[IDeleteConfirmation] = js.native
  /**
    * Removes the currently applied discount on a subscription.
    *
    * @returns An object with a deleted flag set to true upon success. This call throws an error otherwise, such as if no
    * discount exists on this subscription.
    *
    * @param customerId The ID of the customer.
    * @param subscriptionId The ID of the subscription.
    */
  def deleteSubscriptionDiscount(customerId: String, subscriptionId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def deleteSubscriptionDiscount(
    customerId: String,
    subscriptionId: String,
    options: HeaderOptions,
    response: IResponseFn[IDeleteConfirmation]
  ): js.Promise[IDeleteConfirmation] = js.native
  def deleteSubscriptionDiscount(customerId: String, subscriptionId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  
  def deleteTaxId(customerId: String, taxId: String): js.Promise[IDeleteConfirmation] = js.native
  def deleteTaxId(customerId: String, taxId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def deleteTaxId(
    customerId: String,
    taxId: String,
    options: HeaderOptions,
    response: IResponseFn[IDeleteConfirmation]
  ): js.Promise[IDeleteConfirmation] = js.native
  def deleteTaxId(customerId: String, taxId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  
  def list(): IListPromise[ICustomer] = js.native
  def list(data: ICustomerListOptions): IListPromise[ICustomer] = js.native
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
  def list(data: ICustomerListOptions, options: HeaderOptions): IListPromise[ICustomer] = js.native
  def list(data: ICustomerListOptions, options: HeaderOptions, response: IResponseFn[IList[ICustomer]]): IListPromise[ICustomer] = js.native
  def list(data: ICustomerListOptions, response: IResponseFn[IList[ICustomer]]): IListPromise[ICustomer] = js.native
  def list(options: HeaderOptions): IListPromise[ICustomer] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[ICustomer]]): IListPromise[ICustomer] = js.native
  def list(response: IResponseFn[IList[ICustomer]]): IListPromise[ICustomer] = js.native
  
  def listBalanceTransactions(customerId: String): IListPromise[ICustomerBalanceTransaction] = js.native
  def listBalanceTransactions(customerId: String, data: IListOptions): IListPromise[ICustomerBalanceTransaction] = js.native
  /**
    * Returns a list of transactions that updated the customer’s balance.
    */
  def listBalanceTransactions(customerId: String, data: IListOptions, options: HeaderOptions): IListPromise[ICustomerBalanceTransaction] = js.native
  def listBalanceTransactions(
    customerId: String,
    data: IListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[ICustomerBalanceTransaction]]
  ): IListPromise[ICustomerBalanceTransaction] = js.native
  def listBalanceTransactions(customerId: String, data: IListOptions, response: IResponseFn[IList[ICustomerBalanceTransaction]]): IListPromise[ICustomerBalanceTransaction] = js.native
  def listBalanceTransactions(customerId: String, options: HeaderOptions): IListPromise[ICustomerBalanceTransaction] = js.native
  def listBalanceTransactions(
    customerId: String,
    options: HeaderOptions,
    response: IResponseFn[IList[ICustomerBalanceTransaction]]
  ): IListPromise[ICustomerBalanceTransaction] = js.native
  def listBalanceTransactions(customerId: String, response: IResponseFn[IList[ICustomerBalanceTransaction]]): IListPromise[ICustomerBalanceTransaction] = js.native
  
  def listCards(customerId: String): IListPromise[ICard] = js.native
  def listCards(customerId: String, data: IListOptions): IListPromise[ICard] = js.native
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
  def listCards(customerId: String, data: IListOptions, options: HeaderOptions): IListPromise[ICard] = js.native
  def listCards(
    customerId: String,
    data: IListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[ICard]]
  ): IListPromise[ICard] = js.native
  def listCards(customerId: String, data: IListOptions, response: IResponseFn[IList[ICard]]): IListPromise[ICard] = js.native
  def listCards(customerId: String, options: HeaderOptions): IListPromise[ICard] = js.native
  def listCards(customerId: String, options: HeaderOptions, response: IResponseFn[IList[ICard]]): IListPromise[ICard] = js.native
  def listCards(customerId: String, response: IResponseFn[IList[ICard]]): IListPromise[ICard] = js.native
  
  def listSources(customerId: String, data: IBankAccountSourceListOptions): IListPromise[IBankAccount] = js.native
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
  def listSources(customerId: String, data: IBankAccountSourceListOptions, options: HeaderOptions): IListPromise[IBankAccount] = js.native
  def listSources(
    customerId: String,
    data: IBankAccountSourceListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[IBankAccount]]
  ): IListPromise[IBankAccount] = js.native
  def listSources(
    customerId: String,
    data: IBankAccountSourceListOptions,
    response: IResponseFn[IList[IBankAccount]]
  ): IListPromise[IBankAccount] = js.native
  def listSources(customerId: String, data: ICardSourceListOptions): IListPromise[ICard] = js.native
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
  def listSources(customerId: String, data: ICardSourceListOptions, options: HeaderOptions): IListPromise[ICard] = js.native
  def listSources(
    customerId: String,
    data: ICardSourceListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[ICard]]
  ): IListPromise[ICard] = js.native
  def listSources(customerId: String, data: ICardSourceListOptions, response: IResponseFn[IList[ICard]]): IListPromise[ICard] = js.native
  def listSources(customerId: String, data: ISourceListOptions): IListPromise[ISource] = js.native
  def listSources(customerId: String, data: ISourceListOptions, options: HeaderOptions): IListPromise[ISource] = js.native
  def listSources(
    customerId: String,
    data: ISourceListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[ISource]]
  ): IListPromise[ISource] = js.native
  def listSources(customerId: String, data: ISourceListOptions, response: IResponseFn[IList[ISource]]): IListPromise[ISource] = js.native
  
  def listSubscriptions(customerId: String): IListPromise[ISubscription] = js.native
  def listSubscriptions(customerId: String, data: IListOptions): IListPromise[ISubscription] = js.native
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
  def listSubscriptions(customerId: String, data: IListOptions, options: HeaderOptions): IListPromise[ISubscription] = js.native
  def listSubscriptions(
    customerId: String,
    data: IListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[ISubscription]]
  ): IListPromise[ISubscription] = js.native
  def listSubscriptions(customerId: String, data: IListOptions, response: IResponseFn[IList[ISubscription]]): IListPromise[ISubscription] = js.native
  def listSubscriptions(customerId: String, options: HeaderOptions): IListPromise[ISubscription] = js.native
  def listSubscriptions(customerId: String, options: HeaderOptions, response: IResponseFn[IList[ISubscription]]): IListPromise[ISubscription] = js.native
  def listSubscriptions(customerId: String, response: IResponseFn[IList[ISubscription]]): IListPromise[ISubscription] = js.native
  
  def listTaxIds(customerId: String): IListPromise[ISubscription] = js.native
  def listTaxIds(customerId: String, data: IListOptions): IListPromise[ISource] = js.native
  def listTaxIds(customerId: String, data: IListOptions, options: HeaderOptions): IListPromise[ISource] = js.native
  def listTaxIds(
    customerId: String,
    data: IListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[ISource]]
  ): IListPromise[ISource] = js.native
  def listTaxIds(customerId: String, data: IListOptions, response: IResponseFn[IList[ISource]]): IListPromise[ISource] = js.native
  def listTaxIds(customerId: String, options: HeaderOptions): IListPromise[ISubscription] = js.native
  def listTaxIds(customerId: String, options: HeaderOptions, response: IResponseFn[IList[ISubscription]]): IListPromise[ISubscription] = js.native
  def listTaxIds(customerId: String, response: IResponseFn[IList[ISubscription]]): IListPromise[ISubscription] = js.native
  
  def retrieve(id: String): js.Promise[ICustomer] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[ICustomer] = js.native
  /**
    * Retrieves the details of an existing customer. You need only supply the unique customer identifier that was returned upon customer
    * creation.
    *
    * @returns Returns a customer object if a valid identifier was provided. When requesting the ID of a customer that has been deleted,
    * a subset of the customer's information will be returned, including a "deleted" property, which will be true.
    *
    * @param id The identifier of the customer to be retrieved.
    */
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[ICustomer] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[ICustomer]): js.Promise[ICustomer] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[ICustomer]): js.Promise[ICustomer] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[ICustomer] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[ICustomer]): js.Promise[ICustomer] = js.native
  def retrieve(id: String, response: IResponseFn[ICustomer]): js.Promise[ICustomer] = js.native
  
  def retrieveBalanceTransaction(customerId: String, transactionId: String): js.Promise[ICustomerBalanceTransaction] = js.native
  /**
    * Retrieves a specific transaction that updated the customer’s balance.
    */
  def retrieveBalanceTransaction(customerId: String, transactionId: String, options: HeaderOptions): js.Promise[ICustomerBalanceTransaction] = js.native
  def retrieveBalanceTransaction(
    customerId: String,
    transactionId: String,
    options: HeaderOptions,
    response: IResponseFn[ICustomerBalanceTransaction]
  ): js.Promise[ICustomerBalanceTransaction] = js.native
  def retrieveBalanceTransaction(customerId: String, transactionId: String, response: IResponseFn[ICustomerBalanceTransaction]): js.Promise[ICustomerBalanceTransaction] = js.native
  
  def retrieveCard(customerId: String, cardId: String): js.Promise[ICard] = js.native
  /**
    * By default, you can see the 10 most recent cards stored on a customer or recipient directly on the customer or recipient object, but
    * you can also retrieve details about a specific card stored on the customer or recipient.
    *
    * @returns Returns the card object.
    *
    * @param customerId The ID of the customer whose card needs to be retrieved.
    * @param cardId The ID of the card to be retrieved.
    */
  def retrieveCard(customerId: String, cardId: String, options: HeaderOptions): js.Promise[ICard] = js.native
  def retrieveCard(customerId: String, cardId: String, options: HeaderOptions, response: IResponseFn[ICard]): js.Promise[ICard] = js.native
  def retrieveCard(customerId: String, cardId: String, response: IResponseFn[ICard]): js.Promise[ICard] = js.native
  
  def retrieveSource(customerId: String, sourceId: String): js.Promise[IStripeSource] = js.native
  /**
    * By default, you can see the 10 most recent cards/bank accounts stored on a customer or recipient directly on the customer or recipient object, but
    * you can also retrieve details about a specific card/bank account stored on the customer or recipient.
    *
    * @returns Returns the card/bank account object.
    *
    * @param customerId The ID of the customer whose card needs to be retrieved.
    * @param sourceId The ID of the source to be retrieved.
    */
  def retrieveSource(customerId: String, sourceId: String, options: HeaderOptions): js.Promise[IStripeSource] = js.native
  def retrieveSource(customerId: String, sourceId: String, options: HeaderOptions, response: IResponseFn[IStripeSource]): js.Promise[IStripeSource] = js.native
  def retrieveSource(customerId: String, sourceId: String, response: IResponseFn[IStripeSource]): js.Promise[IStripeSource] = js.native
  
  def retrieveSubscription(customerId: String, subscriptionId: String): js.Promise[ISubscription] = js.native
  /**
    * By default, you can see the 10 most recent active subscriptions stored on a customer directly on the customer
    * object, but you can also retrieve details about a specific active subscription for a customer.
    *
    * @returns Returns the subscription object.
    *
    * @param customerId The customer ID for the subscription
    * @param subscriptionId The ID of the subscription to retrieve
    */
  def retrieveSubscription(customerId: String, subscriptionId: String, options: HeaderOptions): js.Promise[ISubscription] = js.native
  def retrieveSubscription(
    customerId: String,
    subscriptionId: String,
    options: HeaderOptions,
    response: IResponseFn[ISubscription]
  ): js.Promise[ISubscription] = js.native
  def retrieveSubscription(customerId: String, subscriptionId: String, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
  
  def retrieveTaxId(customerId: String, taxId: String): js.Promise[IStripeSource] = js.native
  def retrieveTaxId(customerId: String, taxId: String, options: HeaderOptions): js.Promise[IStripeSource] = js.native
  def retrieveTaxId(customerId: String, taxId: String, options: HeaderOptions, response: IResponseFn[IStripeSource]): js.Promise[IStripeSource] = js.native
  def retrieveTaxId(customerId: String, taxId: String, response: IResponseFn[IStripeSource]): js.Promise[IStripeSource] = js.native
  
  def update(id: String, data: ICustomerUpdateOptions): js.Promise[ICustomer] = js.native
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
  def update(id: String, data: ICustomerUpdateOptions, options: HeaderOptions): js.Promise[ICustomer] = js.native
  def update(id: String, data: ICustomerUpdateOptions, options: HeaderOptions, response: IResponseFn[ICustomer]): js.Promise[ICustomer] = js.native
  def update(id: String, data: ICustomerUpdateOptions, response: IResponseFn[ICustomer]): js.Promise[ICustomer] = js.native
  
  def updateBalanceTransaction(customerId: String, transactionId: String, data: ICustomerBalanceTransactionUpdateOptions): js.Promise[ICustomerBalanceTransaction] = js.native
  /**
    * Most customer balance transaction fields are immutable, but you may update its description and metadata.
    */
  def updateBalanceTransaction(
    customerId: String,
    transactionId: String,
    data: ICustomerBalanceTransactionUpdateOptions,
    options: HeaderOptions
  ): js.Promise[ICustomerBalanceTransaction] = js.native
  def updateBalanceTransaction(
    customerId: String,
    transactionId: String,
    data: ICustomerBalanceTransactionUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[ICustomerBalanceTransaction]
  ): js.Promise[ICustomerBalanceTransaction] = js.native
  def updateBalanceTransaction(
    customerId: String,
    transactionId: String,
    data: ICustomerBalanceTransactionUpdateOptions,
    response: IResponseFn[ICustomerBalanceTransaction]
  ): js.Promise[ICustomerBalanceTransaction] = js.native
  
  def updateCard(customerId: String, cardId: String, data: ICardUpdateOptions): js.Promise[ICard] = js.native
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
  def updateCard(customerId: String, cardId: String, data: ICardUpdateOptions, options: HeaderOptions): js.Promise[ICard] = js.native
  def updateCard(
    customerId: String,
    cardId: String,
    data: ICardUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[ICard]
  ): js.Promise[ICard] = js.native
  def updateCard(customerId: String, cardId: String, data: ICardUpdateOptions, response: IResponseFn[ICard]): js.Promise[ICard] = js.native
  
  def updateSource(customerId: String, sourceId: String, data: IBankAccountUpdateOptions): js.Promise[IBankAccount] = js.native
  /**
    * Updates the metadata, account_holder_name, and account_holder_type of a bank account belonging to a Customer. Other bank account details
    * are not editable by design.
    *
    * @returns Returns the bank account object.
    *
    * @param customerId The ID of the customer whose card needs to be retrieved.
    * @param sourceId The ID of the bank account to be updated.
    */
  def updateSource(customerId: String, sourceId: String, data: IBankAccountUpdateOptions, options: HeaderOptions): js.Promise[IBankAccount] = js.native
  def updateSource(
    customerId: String,
    sourceId: String,
    data: IBankAccountUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[IBankAccount]
  ): js.Promise[IBankAccount] = js.native
  def updateSource(
    customerId: String,
    sourceId: String,
    data: IBankAccountUpdateOptions,
    response: IResponseFn[IBankAccount]
  ): js.Promise[IBankAccount] = js.native
  def updateSource(customerId: String, sourceId: String, data: ICardUpdateOptions): js.Promise[ICard] = js.native
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
  def updateSource(customerId: String, sourceId: String, data: ICardUpdateOptions, options: HeaderOptions): js.Promise[ICard] = js.native
  def updateSource(
    customerId: String,
    sourceId: String,
    data: ICardUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[ICard]
  ): js.Promise[ICard] = js.native
  def updateSource(customerId: String, sourceId: String, data: ICardUpdateOptions, response: IResponseFn[ICard]): js.Promise[ICard] = js.native
  
  def updateSubscription(customerId: String, subscriptionId: String, data: ISubscriptionUpdateOptions): js.Promise[ISubscription] = js.native
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
    customerId: String,
    subscriptionId: String,
    data: ISubscriptionUpdateOptions,
    options: HeaderOptions
  ): js.Promise[ISubscription] = js.native
  def updateSubscription(
    customerId: String,
    subscriptionId: String,
    data: ISubscriptionUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[ISubscription]
  ): js.Promise[ISubscription] = js.native
  def updateSubscription(
    customerId: String,
    subscriptionId: String,
    data: ISubscriptionUpdateOptions,
    response: IResponseFn[ISubscription]
  ): js.Promise[ISubscription] = js.native
  
  def verifySource(customerId: String, sourceId: String, data: IBankAccountVerifyOptions): js.Promise[IBankAccount] = js.native
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
  def verifySource(customerId: String, sourceId: String, data: IBankAccountVerifyOptions, options: HeaderOptions): js.Promise[IBankAccount] = js.native
}
