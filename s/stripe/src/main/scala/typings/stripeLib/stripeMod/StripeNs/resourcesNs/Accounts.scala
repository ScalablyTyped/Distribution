package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accounts
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def create(data: stripeLib.stripeMod.StripeNs.accountsNs.IAccountCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  /**
    * With Connect, you can create Stripe accounts for your users. To do this, you'll first need to register your platform.
    */
  def create(
    data: stripeLib.stripeMod.StripeNs.accountsNs.IAccountCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.accountsNs.IAccountCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.accountsNs.IAccountCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def createExternalAccount(
    accId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IExternalAccountCreationOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
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
  def createExternalAccount(
    accId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IExternalAccountCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
  ] = js.native
  def createExternalAccount(
    accId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IExternalAccountCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
  ] = js.native
  def createExternalAccount(
    accId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IExternalAccountCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
  ] = js.native
  def del(): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def del(id: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
    * With Connect, you may delete Stripe accounts you manage.
    *
    * Managed accounts created using test-mode keys can be deleted at any time. Managed accounts created using live-mode keys may only be
    * deleted once all balances are zero.
    *
    * If you are looking to close your own account, use the data tab in your account settings instead.
    */
  def del(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def del(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def del(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def del(options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def del(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def del(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def deleteExternalAccount(accId: java.lang.String, id: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
    * You can delete destination bank accounts and cards from a managed account. If a bank account is the default external account for its currency
    * or card's default_for_currency property is true, it can only be deleted if it is the only external account for that currency, and the
    * currency is not the Stripe account's default currency. Otherwise, you must set another external account to be the default for the currency
    * before deleting it.
    */
  def deleteExternalAccount(accId: java.lang.String, id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def deleteExternalAccount(
    accId: java.lang.String,
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def deleteExternalAccount(
    accId: java.lang.String,
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def list(): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.IListOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ] = js.native
  /**
    * Returns a list of accounts connected to your platform via Connect. If you’re not a platform, the list will be empty.
    */
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ] = js.native
  def listExternalAccounts(accId: java.lang.String, data: stripeLib.stripeMod.StripeNs.accountsNs.IBankAccountListOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
  ] = js.native
  /**
    * You can see a list of the bank accounts belonging to a managed account. Note that the 10 most recent external accounts are always
    * available by default on the corresponding Stripe object. If you need more than those 10, you can use this API method and the limit
    * and starting_after parameters to page through additional bank accounts.
    */
  def listExternalAccounts(
    accId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IBankAccountListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
  ] = js.native
  def listExternalAccounts(
    accId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IBankAccountListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
  ] = js.native
  def listExternalAccounts(
    accId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IBankAccountListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
  ] = js.native
  def listExternalAccounts(accId: java.lang.String, data: stripeLib.stripeMod.StripeNs.accountsNs.ICardListOptions): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  /**
    * You can see a list of the cards belonging to a managed account. Note that the 10 most recent external accounts are available on the
    * account object. If you need more than those 10, you can use this API method and the limit and starting_after parameters to page
    * through additional cards.
    */
  def listExternalAccounts(
    accId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.ICardListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def listExternalAccounts(
    accId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.ICardListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def listExternalAccounts(
    accId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.ICardListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.cardsNs.ICard]] = js.native
  def reject(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.accountsNs.IRejectReason): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  /**
    * With Connect, you may flag managed accounts as suspicious.
    *
    * Managed accounts created using test-mode keys can be rejected at any time. Managed accounts created using live-mode keys may only be
    * rejected once all balances are zero.
    */
  def reject(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IRejectReason,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def reject(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IRejectReason,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def reject(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IRejectReason,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def retrieve(): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def retrieve(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  /**
    * Retrieves the details of the account.
    */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def retrieve(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def retrieve(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def retrieve(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def retrieve(options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def retrieve(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def retrieve(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def retrieveCard(accId: java.lang.String, cardId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
    * You can always see the 10 most recent cards directly on a managed account; this method lets you retrieve details about a specific
    * card stored on the account.
    */
  def retrieveCard(
    accId: java.lang.String,
    cardId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def retrieveCard(
    accId: java.lang.String,
    cardId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): js.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def retrieveCard(
    accId: java.lang.String,
    cardId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): js.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def retrieveExternalAccount(accId: java.lang.String, bankAccId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount] = js.native
  /**
    * By default, you can see the 10 most recent bank accounts stored on a managed account directly on the object, but you can also
    * retrieve details about a specific bank account stored on the Stripe account.
    */
  def retrieveExternalAccount(
    accId: java.lang.String,
    bankAccId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount] = js.native
  def retrieveExternalAccount(
    accId: java.lang.String,
    bankAccId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount] = js.native
  def retrieveExternalAccount(
    accId: java.lang.String,
    bankAccId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount] = js.native
  def update(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.accountsNs.IAccountUpdateOptions): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  /**
    * Updates an account by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    *
    * You may only update accounts that you manage. To update your own account, you can currently only do so via the dashboard.
    * For more information on updating managed accounts, see our guide.
    */
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IAccountUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IAccountUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IAccountUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.accountsNs.IAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.native
  def updateExternalAccount(
    accId: java.lang.String,
    bankAccId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IExternalAccountUpdateOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount] = js.native
  /**
    * Updates the metadata of a bank account belonging to a managed account, and optionally sets it as the default for its currency.
    * Other bank account details are not editable by design.
    */
  def updateExternalAccount(
    accId: java.lang.String,
    bankAccId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IExternalAccountUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount] = js.native
  def updateExternalAccount(
    accId: java.lang.String,
    bankAccId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IExternalAccountUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount] = js.native
  def updateExternalAccount(
    accId: java.lang.String,
    bankAccId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.accountsNs.IExternalAccountUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount]
  ): js.Promise[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount] = js.native
  def updateExternalAccount(
    accId: java.lang.String,
    cardId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  /**
    * If you need to update only some card details, like the billing address or expiration date, you can do so without having to re-enter the
    * full card details. Stripe also works directly with card networks so that your customers can continue using your service without
    * interruption.
    *
    * When you update a card, Stripe will automatically validate the card.
    */
  def updateExternalAccount(
    accId: java.lang.String,
    cardId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def updateExternalAccount(
    accId: java.lang.String,
    cardId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): js.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
  def updateExternalAccount(
    accId: java.lang.String,
    cardId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.cardsNs.ICardUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.cardsNs.ICard]
  ): js.Promise[stripeLib.stripeMod.StripeNs.cardsNs.ICard] = js.native
}

