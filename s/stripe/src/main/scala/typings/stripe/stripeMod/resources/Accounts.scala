package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.HeaderOptions
import typings.stripe.stripeMod.IDataOptions
import typings.stripe.stripeMod.IDeleteConfirmation
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IListOptions
import typings.stripe.stripeMod.IListPromise
import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.StripeResource
import typings.stripe.stripeMod.accounts.IAccount
import typings.stripe.stripeMod.accounts.IAccountCreationOptions
import typings.stripe.stripeMod.accounts.IAccountUpdateOptions
import typings.stripe.stripeMod.accounts.IBankAccountListOptions
import typings.stripe.stripeMod.accounts.ICardListOptions
import typings.stripe.stripeMod.accounts.IExternalAccountCreationOptions
import typings.stripe.stripeMod.accounts.IExternalAccountUpdateOptions
import typings.stripe.stripeMod.accounts.ILoginLink
import typings.stripe.stripeMod.accounts.IRejectReason
import typings.stripe.stripeMod.cards.ICardUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Accounts")
@js.native
class Accounts () extends StripeResource {
  def create(data: IAccountCreationOptions): js.Promise[IAccount] = js.native
  /**
    * With Connect, you can create Stripe accounts for your users. To do this, you'll first need to register your platform.
    */
  def create(data: IAccountCreationOptions, options: HeaderOptions): js.Promise[IAccount] = js.native
  def create(data: IAccountCreationOptions, options: HeaderOptions, response: IResponseFn[IAccount]): js.Promise[IAccount] = js.native
  def create(data: IAccountCreationOptions, response: IResponseFn[IAccount]): js.Promise[IAccount] = js.native
  def createExternalAccount(accId: String, data: IExternalAccountCreationOptions): js.Promise[
    typings.stripe.stripeMod.cards.ICard | typings.stripe.stripeMod.bankAccounts.IBankAccount
  ] = js.native
  /**
    * When you create a new bank account or credit card, you must specify a managed account to create it on.
    *
    * If the bank account's owner has no other external account in the bank account's currency, the new bank account will become the
    * default for that currency. However, if the owner already has a bank account for that currency, the new account will only become
    * the default if the default_for_currency parameter is set to true.
    *
    * If the account has no default destination card, then the new card will become the default. However, if the owner already has a
    * default then it will not change. To change the default, you should set default_for_currency to true when creating a card for a
    * managed account.
    */
  def createExternalAccount(accId: String, data: IExternalAccountCreationOptions, options: HeaderOptions): js.Promise[
    typings.stripe.stripeMod.cards.ICard | typings.stripe.stripeMod.bankAccounts.IBankAccount
  ] = js.native
  def createExternalAccount(
    accId: String,
    data: IExternalAccountCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[
      typings.stripe.stripeMod.cards.ICard | typings.stripe.stripeMod.bankAccounts.IBankAccount
    ]
  ): js.Promise[
    typings.stripe.stripeMod.cards.ICard | typings.stripe.stripeMod.bankAccounts.IBankAccount
  ] = js.native
  def createExternalAccount(
    accId: String,
    data: IExternalAccountCreationOptions,
    response: IResponseFn[
      typings.stripe.stripeMod.cards.ICard | typings.stripe.stripeMod.bankAccounts.IBankAccount
    ]
  ): js.Promise[
    typings.stripe.stripeMod.cards.ICard | typings.stripe.stripeMod.bankAccounts.IBankAccount
  ] = js.native
  /**
    * Creates a single-use login link for an Express account to access their Stripe dashboard.
    * You may only create login links for Express accounts connected to your platform.
    * Returns a login link object if the call succeeded.
    */
  def createLoginLink(accId: String): js.Promise[ILoginLink] = js.native
  def createLoginLink(accId: String, redirectUrl: String): js.Promise[ILoginLink] = js.native
  def createLoginLink(accId: String, redirectUrl: String, response: IResponseFn[ILoginLink]): js.Promise[ILoginLink] = js.native
  def createLoginLink(accId: String, response: IResponseFn[ILoginLink]): js.Promise[ILoginLink] = js.native
  def del(): js.Promise[IDeleteConfirmation] = js.native
  def del(id: String): js.Promise[IDeleteConfirmation] = js.native
  /**
    * With Connect, you may delete Stripe accounts you manage.
    *
    * Managed accounts created using test-mode keys can be deleted at any time. Managed accounts created using live-mode keys may only be
    * deleted once all balances are zero.
    *
    * If you are looking to close your own account, use the data tab in your account settings instead.
    */
  def del(id: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def del(id: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def del(id: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def del(options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def del(options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def del(response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def deleteExternalAccount(accId: String, id: String): js.Promise[IDeleteConfirmation] = js.native
  /**
    * You can delete destination bank accounts and cards from a managed account. If a bank account is the default external account for its currency
    * or card's default_for_currency property is true, it can only be deleted if it is the only external account for that currency, and the
    * currency is not the Stripe account's default currency. Otherwise, you must set another external account to be the default for the currency
    * before deleting it.
    */
  def deleteExternalAccount(accId: String, id: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def deleteExternalAccount(accId: String, id: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def deleteExternalAccount(accId: String, id: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def list(): IListPromise[IAccount] = js.native
  def list(data: IListOptions): IListPromise[IAccount] = js.native
  /**
    * Returns a list of accounts connected to your platform via Connect. If you’re not a platform, the list will be empty.
    */
  def list(data: IListOptions, options: HeaderOptions): IListPromise[IAccount] = js.native
  def list(data: IListOptions, options: HeaderOptions, response: IResponseFn[IList[IAccount]]): IListPromise[IAccount] = js.native
  def list(data: IListOptions, response: IResponseFn[IList[IAccount]]): IListPromise[IAccount] = js.native
  def list(options: HeaderOptions): IListPromise[IAccount] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IAccount]]): IListPromise[IAccount] = js.native
  def list(response: IResponseFn[IList[IAccount]]): IListPromise[IAccount] = js.native
  def listExternalAccounts(accId: String, data: IBankAccountListOptions): IListPromise[typings.stripe.stripeMod.bankAccounts.IBankAccount] = js.native
  /**
    * You can see a list of the bank accounts belonging to a managed account. Note that the 10 most recent external accounts are always
    * available by default on the corresponding Stripe object. If you need more than those 10, you can use this API method and the limit
    * and starting_after parameters to page through additional bank accounts.
    */
  def listExternalAccounts(accId: String, data: IBankAccountListOptions, options: HeaderOptions): IListPromise[typings.stripe.stripeMod.bankAccounts.IBankAccount] = js.native
  def listExternalAccounts(
    accId: String,
    data: IBankAccountListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[typings.stripe.stripeMod.bankAccounts.IBankAccount]]
  ): IListPromise[typings.stripe.stripeMod.bankAccounts.IBankAccount] = js.native
  def listExternalAccounts(
    accId: String,
    data: IBankAccountListOptions,
    response: IResponseFn[IList[typings.stripe.stripeMod.bankAccounts.IBankAccount]]
  ): IListPromise[typings.stripe.stripeMod.bankAccounts.IBankAccount] = js.native
  def listExternalAccounts(accId: String, data: ICardListOptions): IListPromise[typings.stripe.stripeMod.cards.ICard] = js.native
  /**
    * You can see a list of the cards belonging to a managed account. Note that the 10 most recent external accounts are available on the
    * account object. If you need more than those 10, you can use this API method and the limit and starting_after parameters to page
    * through additional cards.
    */
  def listExternalAccounts(accId: String, data: ICardListOptions, options: HeaderOptions): IListPromise[typings.stripe.stripeMod.cards.ICard] = js.native
  def listExternalAccounts(
    accId: String,
    data: ICardListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[typings.stripe.stripeMod.cards.ICard]]
  ): IListPromise[typings.stripe.stripeMod.cards.ICard] = js.native
  def listExternalAccounts(
    accId: String,
    data: ICardListOptions,
    response: IResponseFn[IList[typings.stripe.stripeMod.cards.ICard]]
  ): IListPromise[typings.stripe.stripeMod.cards.ICard] = js.native
  def reject(id: String, data: IRejectReason): js.Promise[IAccount] = js.native
  /**
    * With Connect, you may flag managed accounts as suspicious.
    *
    * Managed accounts created using test-mode keys can be rejected at any time. Managed accounts created using live-mode keys may only be
    * rejected once all balances are zero.
    */
  def reject(id: String, data: IRejectReason, options: HeaderOptions): js.Promise[IAccount] = js.native
  def reject(id: String, data: IRejectReason, options: HeaderOptions, response: IResponseFn[IAccount]): js.Promise[IAccount] = js.native
  def reject(id: String, data: IRejectReason, response: IResponseFn[IAccount]): js.Promise[IAccount] = js.native
  def retrieve(): js.Promise[IAccount] = js.native
  def retrieve(id: String): js.Promise[IAccount] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[IAccount] = js.native
  /**
    * Retrieves the details of the account.
    */
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IAccount] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IAccount]): js.Promise[IAccount] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[IAccount]): js.Promise[IAccount] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[IAccount] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IAccount]): js.Promise[IAccount] = js.native
  def retrieve(id: String, response: IResponseFn[IAccount]): js.Promise[IAccount] = js.native
  def retrieve(options: HeaderOptions): js.Promise[IAccount] = js.native
  def retrieve(options: HeaderOptions, response: IResponseFn[IAccount]): js.Promise[IAccount] = js.native
  def retrieve(response: IResponseFn[IAccount]): js.Promise[IAccount] = js.native
  def retrieveCard(accId: String, cardId: String): js.Promise[typings.stripe.stripeMod.cards.ICard] = js.native
  /**
    * You can always see the 10 most recent cards directly on a managed account; this method lets you retrieve details about a specific
    * card stored on the account.
    */
  def retrieveCard(accId: String, cardId: String, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.cards.ICard] = js.native
  def retrieveCard(
    accId: String,
    cardId: String,
    options: HeaderOptions,
    response: IResponseFn[typings.stripe.stripeMod.cards.ICard]
  ): js.Promise[typings.stripe.stripeMod.cards.ICard] = js.native
  def retrieveCard(accId: String, cardId: String, response: IResponseFn[typings.stripe.stripeMod.cards.ICard]): js.Promise[typings.stripe.stripeMod.cards.ICard] = js.native
  def retrieveExternalAccount(accId: String, bankAccId: String): js.Promise[typings.stripe.stripeMod.bankAccounts.IBankAccount] = js.native
  /**
    * By default, you can see the 10 most recent bank accounts stored on a managed account directly on the object, but you can also
    * retrieve details about a specific bank account stored on the Stripe account.
    */
  def retrieveExternalAccount(accId: String, bankAccId: String, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.bankAccounts.IBankAccount] = js.native
  def retrieveExternalAccount(
    accId: String,
    bankAccId: String,
    options: HeaderOptions,
    response: IResponseFn[typings.stripe.stripeMod.bankAccounts.IBankAccount]
  ): js.Promise[typings.stripe.stripeMod.bankAccounts.IBankAccount] = js.native
  def retrieveExternalAccount(
    accId: String,
    bankAccId: String,
    response: IResponseFn[typings.stripe.stripeMod.bankAccounts.IBankAccount]
  ): js.Promise[typings.stripe.stripeMod.bankAccounts.IBankAccount] = js.native
  def update(id: String, data: IAccountUpdateOptions): js.Promise[IAccount] = js.native
  /**
    * Updates an account by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    *
    * You may only update accounts that you manage. To update your own account, you can currently only do so via the dashboard.
    * For more information on updating managed accounts, see our guide.
    */
  def update(id: String, data: IAccountUpdateOptions, options: HeaderOptions): js.Promise[IAccount] = js.native
  def update(id: String, data: IAccountUpdateOptions, options: HeaderOptions, response: IResponseFn[IAccount]): js.Promise[IAccount] = js.native
  def update(id: String, data: IAccountUpdateOptions, response: IResponseFn[IAccount]): js.Promise[IAccount] = js.native
  def updateExternalAccount(accId: String, bankAccId: String, data: IExternalAccountUpdateOptions): js.Promise[typings.stripe.stripeMod.bankAccounts.IBankAccount] = js.native
  /**
    * Updates the metadata of a bank account belonging to a managed account, and optionally sets it as the default for its currency.
    * Other bank account details are not editable by design.
    */
  def updateExternalAccount(accId: String, bankAccId: String, data: IExternalAccountUpdateOptions, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.bankAccounts.IBankAccount] = js.native
  def updateExternalAccount(
    accId: String,
    bankAccId: String,
    data: IExternalAccountUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[typings.stripe.stripeMod.bankAccounts.IBankAccount]
  ): js.Promise[typings.stripe.stripeMod.bankAccounts.IBankAccount] = js.native
  def updateExternalAccount(
    accId: String,
    bankAccId: String,
    data: IExternalAccountUpdateOptions,
    response: IResponseFn[typings.stripe.stripeMod.bankAccounts.IBankAccount]
  ): js.Promise[typings.stripe.stripeMod.bankAccounts.IBankAccount] = js.native
  def updateExternalAccount(accId: String, cardId: String, data: ICardUpdateOptions): js.Promise[typings.stripe.stripeMod.cards.ICard] = js.native
  /**
    * If you need to update only some card details, like the billing address or expiration date, you can do so without having to re-enter the
    * full card details. Stripe also works directly with card networks so that your customers can continue using your service without
    * interruption.
    *
    * When you update a card, Stripe will automatically validate the card.
    */
  def updateExternalAccount(accId: String, cardId: String, data: ICardUpdateOptions, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.cards.ICard] = js.native
  def updateExternalAccount(
    accId: String,
    cardId: String,
    data: ICardUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[typings.stripe.stripeMod.cards.ICard]
  ): js.Promise[typings.stripe.stripeMod.cards.ICard] = js.native
  def updateExternalAccount(
    accId: String,
    cardId: String,
    data: ICardUpdateOptions,
    response: IResponseFn[typings.stripe.stripeMod.cards.ICard]
  ): js.Promise[typings.stripe.stripeMod.cards.ICard] = js.native
}

