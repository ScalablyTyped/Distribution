package typings
package stripeLib.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources")
@js.native
object resourcesNs extends js.Object {
  @js.native
  class Accounts ()
    extends stripeLib.stripeMod.StripeResource {
    def create(data: stripeLib.stripeMod.accountsNs.IAccountCreationOptions): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    /**
      * With Connect, you can create Stripe accounts for your users. To do this, you'll first need to register your platform.
      */
    def create(
      data: stripeLib.stripeMod.accountsNs.IAccountCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def create(
      data: stripeLib.stripeMod.accountsNs.IAccountCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.accountsNs.IAccount]
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def create(
      data: stripeLib.stripeMod.accountsNs.IAccountCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.accountsNs.IAccount]
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def createExternalAccount(accId: java.lang.String, data: stripeLib.stripeMod.accountsNs.IExternalAccountCreationOptions): js.Promise[
        stripeLib.stripeMod.cardsNs.ICard | stripeLib.stripeMod.bankAccountsNs.IBankAccount
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
      data: stripeLib.stripeMod.accountsNs.IExternalAccountCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[
        stripeLib.stripeMod.cardsNs.ICard | stripeLib.stripeMod.bankAccountsNs.IBankAccount
      ] = js.native
    def createExternalAccount(
      accId: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IExternalAccountCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[
          stripeLib.stripeMod.cardsNs.ICard | stripeLib.stripeMod.bankAccountsNs.IBankAccount
        ]
    ): js.Promise[
        stripeLib.stripeMod.cardsNs.ICard | stripeLib.stripeMod.bankAccountsNs.IBankAccount
      ] = js.native
    def createExternalAccount(
      accId: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IExternalAccountCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[
          stripeLib.stripeMod.cardsNs.ICard | stripeLib.stripeMod.bankAccountsNs.IBankAccount
        ]
    ): js.Promise[
        stripeLib.stripeMod.cardsNs.ICard | stripeLib.stripeMod.bankAccountsNs.IBankAccount
      ] = js.native
    /**
      * Creates a single-use login link for an Express account to access their Stripe dashboard.
      * You may only create login links for Express accounts connected to your platform.
      * Returns a login link object if the call succeeded.
      */
    def createLoginLink(accId: java.lang.String): js.Promise[stripeLib.stripeMod.accountsNs.ILoginLink] = js.native
    def createLoginLink(accId: java.lang.String, redirectUrl: java.lang.String): js.Promise[stripeLib.stripeMod.accountsNs.ILoginLink] = js.native
    def createLoginLink(
      accId: java.lang.String,
      redirectUrl: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.accountsNs.ILoginLink]
    ): js.Promise[stripeLib.stripeMod.accountsNs.ILoginLink] = js.native
    def createLoginLink(
      accId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.accountsNs.ILoginLink]
    ): js.Promise[stripeLib.stripeMod.accountsNs.ILoginLink] = js.native
    def del(): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(id: java.lang.String): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    /**
      * With Connect, you may delete Stripe accounts you manage.
      *
      * Managed accounts created using test-mode keys can be deleted at any time. Managed accounts created using live-mode keys may only be
      * deleted once all balances are zero.
      *
      * If you are looking to close your own account, use the data tab in your account settings instead.
      */
    def del(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteExternalAccount(accId: java.lang.String, id: java.lang.String): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    /**
      * You can delete destination bank accounts and cards from a managed account. If a bank account is the default external account for its currency
      * or card's default_for_currency property is true, it can only be deleted if it is the only external account for that currency, and the
      * currency is not the Stripe account's default currency. Otherwise, you must set another external account to be the default for the currency
      * before deleting it.
      */
    def deleteExternalAccount(accId: java.lang.String, id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteExternalAccount(
      accId: java.lang.String,
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteExternalAccount(
      accId: java.lang.String,
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def list(data: stripeLib.stripeMod.IListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    /**
      * Returns a list of accounts connected to your platform via Connect. If you’re not a platform, the list will be empty.
      */
    def list(data: stripeLib.stripeMod.IListOptions, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def list(
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.accountsNs.IAccount]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def list(
      data: stripeLib.stripeMod.IListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.accountsNs.IAccount]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.accountsNs.IAccount]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.accountsNs.IAccount]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def listExternalAccounts(accId: java.lang.String, data: stripeLib.stripeMod.accountsNs.IBankAccountListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    /**
      * You can see a list of the bank accounts belonging to a managed account. Note that the 10 most recent external accounts are always
      * available by default on the corresponding Stripe object. If you need more than those 10, you can use this API method and the limit
      * and starting_after parameters to page through additional bank accounts.
      */
    def listExternalAccounts(
      accId: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IBankAccountListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def listExternalAccounts(
      accId: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IBankAccountListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.bankAccountsNs.IBankAccount]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def listExternalAccounts(
      accId: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IBankAccountListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.bankAccountsNs.IBankAccount]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def listExternalAccounts(accId: java.lang.String, data: stripeLib.stripeMod.accountsNs.ICardListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    /**
      * You can see a list of the cards belonging to a managed account. Note that the 10 most recent external accounts are available on the
      * account object. If you need more than those 10, you can use this API method and the limit and starting_after parameters to page
      * through additional cards.
      */
    def listExternalAccounts(
      accId: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.ICardListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def listExternalAccounts(
      accId: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.ICardListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.cardsNs.ICard]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def listExternalAccounts(
      accId: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.ICardListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.cardsNs.ICard]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def reject(id: java.lang.String, data: stripeLib.stripeMod.accountsNs.IRejectReason): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    /**
      * With Connect, you may flag managed accounts as suspicious.
      *
      * Managed accounts created using test-mode keys can be rejected at any time. Managed accounts created using live-mode keys may only be
      * rejected once all balances are zero.
      */
    def reject(
      id: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IRejectReason,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def reject(
      id: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IRejectReason,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.accountsNs.IAccount]
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def reject(
      id: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IRejectReason,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.accountsNs.IAccount]
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def retrieve(): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def retrieve(id: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    /**
      * Retrieves the details of the account.
      */
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.accountsNs.IAccount]
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.accountsNs.IAccount]
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def retrieve(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def retrieve(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.accountsNs.IAccount]
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def retrieve(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.accountsNs.IAccount]
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def retrieve(options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def retrieve(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.accountsNs.IAccount]
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def retrieve(response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.accountsNs.IAccount]): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def retrieveCard(accId: java.lang.String, cardId: java.lang.String): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    /**
      * You can always see the 10 most recent cards directly on a managed account; this method lets you retrieve details about a specific
      * card stored on the account.
      */
    def retrieveCard(accId: java.lang.String, cardId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def retrieveCard(
      accId: java.lang.String,
      cardId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def retrieveCard(
      accId: java.lang.String,
      cardId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def retrieveExternalAccount(accId: java.lang.String, bankAccId: java.lang.String): js.Promise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    /**
      * By default, you can see the 10 most recent bank accounts stored on a managed account directly on the object, but you can also
      * retrieve details about a specific bank account stored on the Stripe account.
      */
    def retrieveExternalAccount(accId: java.lang.String, bankAccId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def retrieveExternalAccount(
      accId: java.lang.String,
      bankAccId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.bankAccountsNs.IBankAccount]
    ): js.Promise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def retrieveExternalAccount(
      accId: java.lang.String,
      bankAccId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.bankAccountsNs.IBankAccount]
    ): js.Promise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def update(id: java.lang.String, data: stripeLib.stripeMod.accountsNs.IAccountUpdateOptions): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    /**
      * Updates an account by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
      *
      * You may only update accounts that you manage. To update your own account, you can currently only do so via the dashboard.
      * For more information on updating managed accounts, see our guide.
      */
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IAccountUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IAccountUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.accountsNs.IAccount]
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IAccountUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.accountsNs.IAccount]
    ): js.Promise[stripeLib.stripeMod.accountsNs.IAccount] = js.native
    def updateExternalAccount(
      accId: java.lang.String,
      bankAccId: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IExternalAccountUpdateOptions
    ): js.Promise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    /**
      * Updates the metadata of a bank account belonging to a managed account, and optionally sets it as the default for its currency.
      * Other bank account details are not editable by design.
      */
    def updateExternalAccount(
      accId: java.lang.String,
      bankAccId: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IExternalAccountUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def updateExternalAccount(
      accId: java.lang.String,
      bankAccId: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IExternalAccountUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.bankAccountsNs.IBankAccount]
    ): js.Promise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def updateExternalAccount(
      accId: java.lang.String,
      bankAccId: java.lang.String,
      data: stripeLib.stripeMod.accountsNs.IExternalAccountUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.bankAccountsNs.IBankAccount]
    ): js.Promise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def updateExternalAccount(
      accId: java.lang.String,
      cardId: java.lang.String,
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
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
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def updateExternalAccount(
      accId: java.lang.String,
      cardId: java.lang.String,
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def updateExternalAccount(
      accId: java.lang.String,
      cardId: java.lang.String,
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
  }
  
  @js.native
  class ApplicationFeeRefunds ()
    extends stripeLib.stripeMod.StripeResource {
    def create(): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def create(data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefundCreationOptions): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    /**
      * Refunds an application fee that has previously been collected but not yet refunded. Funds will be refunded to the Stripe account that
      * the fee was originally collected from.
      *
      * You can optionally refund only part of an application fee. You can do so as many times as you wish until the entire fee has been refunded.
      *
      * Once entirely refunded, an application fee can't be refunded again. This method will throw an error when called on an already-refunded
      * application fee, or when trying to refund more money than is left on an application fee.
      */
    def create(
      data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefundCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def create(
      data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefundCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def create(
      data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefundCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def create(options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def create(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def create(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def list(data: stripeLib.stripeMod.IListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    /**
      * You can see a list of the refunds belonging to a specific application fee. Note that the 10 most recent refunds are always available
      * by default on the application fee object. If you need more than those 10, you can use this API method and the limit and starting_after
      * parameters to page through additional refunds.
      */
    def list(data: stripeLib.stripeMod.IListOptions, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def list(
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[
          stripeLib.stripeMod.IList[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
        ]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def list(
      data: stripeLib.stripeMod.IListOptions,
      response: stripeLib.stripeMod.IResponseFn[
          stripeLib.stripeMod.IList[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
        ]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[
          stripeLib.stripeMod.IList[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
        ]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[
          stripeLib.stripeMod.IList[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
        ]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def retrieve(refundId: java.lang.String): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    /**
      * By default, you can see the 10 most recent refunds stored directly on the application fee object, but you can also retrieve details
      * about a specific refund stored on the application fee.
      */
    def retrieve(
      refundId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def retrieve(
      refundId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def retrieve(refundId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def retrieve(
      refundId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def retrieve(refundId: java.lang.String, options: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def retrieve(
      refundId: java.lang.String,
      options: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def retrieve(
      refundId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def update(refundId: java.lang.String, data: stripeLib.Anon_Metadata): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    /**
      * Updates the specified application fee refund by setting the values of the parameters passed. Any parameters not provided will be left
      * unchanged.
      *
      * This request only accepts metadata as an argument.
      */
    def update(
      refundId: java.lang.String,
      data: stripeLib.Anon_Metadata,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def update(
      refundId: java.lang.String,
      data: stripeLib.Anon_Metadata,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def update(
      refundId: java.lang.String,
      data: stripeLib.Anon_Metadata,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
  }
  
  @js.native
  class ApplicationFees ()
    extends stripeLib.stripeMod.StripeResource {
    def createRefund(feeId: java.lang.String): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def createRefund(
      feeId: java.lang.String,
      data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefundCreationOptions
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    /**
      * Refunds an application fee that has previously been collected but not yet refunded. Funds will be refunded to the Stripe account that
      * the fee was originally collected from.
      *
      * You can optionally refund only part of an application fee. You can do so as many times as you wish until the entire fee has been refunded.
      *
      * Once entirely refunded, an application fee can't be refunded again. This method will throw an error when called on an already-refunded
      * application fee, or when trying to refund more money than is left on an application fee.
      */
    def createRefund(
      feeId: java.lang.String,
      data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefundCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def createRefund(
      feeId: java.lang.String,
      data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefundCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def createRefund(
      feeId: java.lang.String,
      data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefundCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def createRefund(feeId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def createRefund(
      feeId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def createRefund(
      feeId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    def list(data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    /**
      * Returns a list of application fees you’ve previously collected. The application fees are returned in sorted order, with the most
      * recent fees appearing first.
      */
    def list(
      data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    def list(
      data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.applicationFeesNs.IApplicationFee]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    def list(
      data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.applicationFeesNs.IApplicationFee]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.applicationFeesNs.IApplicationFee]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.applicationFeesNs.IApplicationFee]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    def listRefunds(feeId: java.lang.String): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def listRefunds(feeId: java.lang.String, data: stripeLib.stripeMod.IListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    /**
      * You can see a list of the refunds belonging to a specific application fee. Note that the 10 most recent refunds are always available
      * by default on the application fee object. If you need more than those 10, you can use this API method and the limit and starting_after
      * parameters to page through additional refunds.
      */
    def listRefunds(
      feeId: java.lang.String,
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def listRefunds(
      feeId: java.lang.String,
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[
          stripeLib.stripeMod.IList[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
        ]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def listRefunds(
      feeId: java.lang.String,
      data: stripeLib.stripeMod.IListOptions,
      response: stripeLib.stripeMod.IResponseFn[
          stripeLib.stripeMod.IList[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
        ]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def listRefunds(feeId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def listRefunds(
      feeId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[
          stripeLib.stripeMod.IList[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
        ]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def listRefunds(
      feeId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[
          stripeLib.stripeMod.IList[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
        ]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def refund(feeId: java.lang.String): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def refund(
      feeId: java.lang.String,
      data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefundCreationOptions
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    /**
      * Refunds an application fee that has previously been collected but not yet refunded. Funds will be refunded to the Stripe account that
      * the fee was originally collected from.
      *
      * You can optionally refund only part of an application fee. You can do so as many times as you wish until the entire fee has been refunded.
      *
      * Once entirely refunded, an application fee can't be refunded again. This method will throw an error when called on an already-refunded
      * application fee, or when trying to refund more money than is left on an application fee.
      */
    def refund(
      feeId: java.lang.String,
      data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefundCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def refund(
      feeId: java.lang.String,
      data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefundCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def refund(
      feeId: java.lang.String,
      data: stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefundCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def refund(feeId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def refund(
      feeId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def refund(
      feeId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    def retrieve(id: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    /**
      * Retrieves the details of an application fee that your account has collected. The same information is returned when refunding the
      * application fee.
      */
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFee]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFee]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    def retrieve(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    def retrieve(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFee]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    def retrieve(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFee]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFee] = js.native
    def retrieveRefund(feeId: java.lang.String, refundId: java.lang.String): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    /**
      * By default, you can see the 10 most recent refunds stored directly on the application fee object, but you can also retrieve details
      * about a specific refund stored on the application fee.
      */
    def retrieveRefund(feeId: java.lang.String, refundId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def retrieveRefund(
      feeId: java.lang.String,
      refundId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def retrieveRefund(
      feeId: java.lang.String,
      refundId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def updateRefund(feeId: java.lang.String, refundId: java.lang.String, data: stripeLib.Anon_Metadata): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    /**
      * Updates the specified application fee refund by setting the values of the parameters passed. Any parameters not provided will be left
      * unchanged.
      *
      * This request only accepts metadata as an argument.
      */
    def updateRefund(
      feeId: java.lang.String,
      refundId: java.lang.String,
      data: stripeLib.Anon_Metadata,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def updateRefund(
      feeId: java.lang.String,
      refundId: java.lang.String,
      data: stripeLib.Anon_Metadata,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
    def updateRefund(
      feeId: java.lang.String,
      refundId: java.lang.String,
      data: stripeLib.Anon_Metadata,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund]
    ): js.Promise[stripeLib.stripeMod.applicationFeesNs.IApplicationFeeRefund] = js.native
  }
  
  @js.native
  class Balance ()
    extends stripeLib.stripeMod.StripeResource {
    def listTransactions(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.balanceNs.IBalanceTransaction] = js.native
    def listTransactions(data: stripeLib.stripeMod.balanceNs.IBalanceListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.balanceNs.IBalanceTransaction] = js.native
    def listTransactions(
      data: stripeLib.stripeMod.balanceNs.IBalanceListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.balanceNs.IBalanceTransaction] = js.native
    def listTransactions(
      data: stripeLib.stripeMod.balanceNs.IBalanceListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.balanceNs.IBalanceTransaction]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.balanceNs.IBalanceTransaction] = js.native
    def listTransactions(
      data: stripeLib.stripeMod.balanceNs.IBalanceListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.balanceNs.IBalanceTransaction]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.balanceNs.IBalanceTransaction] = js.native
    def listTransactions(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.balanceNs.IBalanceTransaction] = js.native
    def listTransactions(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.balanceNs.IBalanceTransaction]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.balanceNs.IBalanceTransaction] = js.native
    def listTransactions(response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.balanceNs.IBalanceTransaction]): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.balanceNs.IBalanceTransaction] = js.native
    def retrieve(): js.Promise[stripeLib.stripeMod.balanceNs.IBalance] = js.native
    def retrieve(options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.balanceNs.IBalance] = js.native
    def retrieve(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.balanceNs.IBalance]
    ): js.Promise[stripeLib.stripeMod.balanceNs.IBalance] = js.native
    def retrieve(response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.balanceNs.IBalance]): js.Promise[stripeLib.stripeMod.balanceNs.IBalance] = js.native
    def retrieveTransaction(id: java.lang.String): js.Promise[stripeLib.stripeMod.balanceNs.IBalanceTransaction] = js.native
    def retrieveTransaction(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.balanceNs.IBalanceTransaction] = js.native
    def retrieveTransaction(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.balanceNs.IBalanceTransaction]
    ): js.Promise[stripeLib.stripeMod.balanceNs.IBalanceTransaction] = js.native
    def retrieveTransaction(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.balanceNs.IBalanceTransaction]
    ): js.Promise[stripeLib.stripeMod.balanceNs.IBalanceTransaction] = js.native
  }
  
  @js.native
  class BitcoinReceivers ()
    extends stripeLib.stripeMod.StripeResource {
    def create(data: stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiverCreationOptions): js.Promise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    /**
      * Creates a Bitcoin receiver object that can be used to accept bitcoin payments from your customer. The receiver exposes a Bitcoin address
      * and is created with a bitcoin to USD exchange rate that is valid for 10 minutes.
      */
    def create(
      data: stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiverCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    def create(
      data: stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiverCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver]
    ): js.Promise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    def create(
      data: stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiverCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver]
    ): js.Promise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
     // TODO: Implement placeholder method
    def getMetadata(): scala.Unit = js.native
    def list(data: stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiverListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    /**
      * Returns a list of your receivers. Receivers are returned sorted by creation date, with the most recently created receivers appearing first.
      */
    def list(
      data: stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiverListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    def list(
      data: stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiverListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[
          stripeLib.stripeMod.IList[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver]
        ]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    def list(
      data: stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiverListOptions,
      response: stripeLib.stripeMod.IResponseFn[
          stripeLib.stripeMod.IList[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver]
        ]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    def retrieve(id: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    /**
      * Retrieves the Bitcoin receiver with the given ID.
      */
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver]
    ): js.Promise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver]
    ): js.Promise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    def retrieve(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    def retrieve(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver]
    ): js.Promise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    def retrieve(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver]
    ): js.Promise[stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver] = js.native
    // update(id: string): void; // This does seem to be a method in the library (https://github.com/stripe/stripe-node/blob/master/lib/resources/BitcoinReceivers.js#L12), but isn't in the API documentation.
    def setMetadata(): scala.Unit = js.native
  }
  
  @js.native
  class ChargeRefunds ()
    extends stripeLib.stripeMod.StripeResource {
    /**
      * When you create a new refund, you must specify a charge to create it on.
      *
      * Creating a new refund will refund a charge that has previously been created but not yet refunded.
      * Funds will be refunded to the credit or debit card that was originally charged.
      * The fees you were originally charged are also refunded.
      *
      * You can optionally refund only part of a charge.
      * You can do so as many times as you wish until the entire charge has been refunded.
      *
      * Once entirely refunded, a charge can't be refunded again.
      * This method will throw an error when called on an already-refunded charge, or when trying to refund more money than is left on a charge.
      */
    var create: js.UndefOr[
        (js.Function3[
          /* data */ stripeLib.stripeMod.refundsNs.IRefundCreationOptions, 
          /* options */ stripeLib.stripeMod.HeaderOptions, 
          /* response */ js.UndefOr[stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]], 
          js.Promise[stripeLib.stripeMod.refundsNs.IRefund]
        ]) with (js.Function2[
          /* data */ stripeLib.stripeMod.refundsNs.IRefundCreationOptions, 
          /* response */ js.UndefOr[stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]], 
          js.Promise[stripeLib.stripeMod.refundsNs.IRefund]
        ]) with (js.Function2[
          /* options */ stripeLib.stripeMod.HeaderOptions, 
          /* response */ js.UndefOr[stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]], 
          js.Promise[stripeLib.stripeMod.refundsNs.IRefund]
        ]) with (js.Function1[
          /* response */ js.UndefOr[stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]], 
          js.Promise[stripeLib.stripeMod.refundsNs.IRefund]
        ])
      ] = js.native
    /**
      * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted order,
      * with the most recent refunds appearing first.
      * For convenience, the 10 most recent refunds are always available by default on the charge object.
      */
    var list: js.UndefOr[
        (js.Function3[
          /* data */ stripeLib.stripeMod.refundsNs.IRefundListOptions, 
          /* options */ stripeLib.stripeMod.HeaderOptions, 
          /* response */ js.UndefOr[
            stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.refundsNs.IRefund]]
          ], 
          stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund]
        ]) with (js.Function2[
          /* data */ stripeLib.stripeMod.refundsNs.IRefundListOptions, 
          /* response */ js.UndefOr[
            stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.refundsNs.IRefund]]
          ], 
          stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund]
        ]) with (js.Function2[
          /* options */ stripeLib.stripeMod.HeaderOptions, 
          /* response */ js.UndefOr[
            stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.refundsNs.IRefund]]
          ], 
          stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund]
        ]) with (js.Function1[
          /* response */ js.UndefOr[
            stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.refundsNs.IRefund]]
          ], 
          stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund]
        ])
      ] = js.native
    /**
      * Retrieves the details of an existing refund.
      */
    var retrieve: js.UndefOr[
        (js.Function4[
          /* id */ java.lang.String, 
          /* data */ stripeLib.stripeMod.IDataOptions, 
          /* options */ stripeLib.stripeMod.HeaderOptions, 
          /* response */ js.UndefOr[stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]], 
          js.Promise[stripeLib.stripeMod.refundsNs.IRefund]
        ]) with (js.Function3[
          /* id */ java.lang.String, 
          /* data */ stripeLib.stripeMod.IDataOptions, 
          /* response */ js.UndefOr[stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]], 
          js.Promise[stripeLib.stripeMod.refundsNs.IRefund]
        ]) with (js.Function3[
          /* id */ java.lang.String, 
          /* options */ stripeLib.stripeMod.HeaderOptions, 
          /* response */ js.UndefOr[stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]], 
          js.Promise[stripeLib.stripeMod.refundsNs.IRefund]
        ]) with (js.Function2[
          /* id */ java.lang.String, 
          /* response */ js.UndefOr[stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]], 
          js.Promise[stripeLib.stripeMod.refundsNs.IRefund]
        ])
      ] = js.native
    /**
      * Updates the specified refund by setting the values of the parameters passed.
      * Any parameters not provided will be left unchanged.
      *
      * This request only accepts metadata as an argument.
      */
    var update: js.UndefOr[
        (js.Function4[
          /* id */ java.lang.String, 
          /* data */ stripeLib.stripeMod.IDataOptionsWithMetadata, 
          /* options */ stripeLib.stripeMod.HeaderOptions, 
          /* response */ js.UndefOr[stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]], 
          js.Promise[stripeLib.stripeMod.refundsNs.IRefund]
        ]) with (js.Function3[
          /* id */ java.lang.String, 
          /* data */ stripeLib.stripeMod.IDataOptionsWithMetadata, 
          /* response */ js.UndefOr[stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]], 
          js.Promise[stripeLib.stripeMod.refundsNs.IRefund]
        ])
      ] = js.native
  }
  
  @js.native
  class Charges ()
    extends stripeLib.stripeMod.StripeResource {
    /**
      * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step payment flow, where first
      * you created a charge with the capture option set to false. Uncaptured payments expire exactly seven days after they are
      * created. If they are not captured by that point in time, they will be marked as refunded and will no longer be capturable.
      */
    def capture(id: java.lang.String): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def capture(id: java.lang.String, data: stripeLib.stripeMod.chargesNs.IChargeCaptureOptions): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def capture(
      id: java.lang.String,
      data: stripeLib.stripeMod.chargesNs.IChargeCaptureOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def capture(
      id: java.lang.String,
      data: stripeLib.stripeMod.chargesNs.IChargeCaptureOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.chargesNs.ICharge]
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def create(data: stripeLib.stripeMod.chargesNs.IChargeCreationOptions): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    /**
      * To charge a credit card, you create a charge object. If your API key is in test mode, the supplied card won't actually be charged, though
      * everything else will occur as if in live mode. (Stripe assumes that the charge would have completed successfully).
      *
      * @returns Returns a charge object if the charge succeeded. Throws an error if something goes wrong. A common source of error is an invalid or
      * expired card, or a valid card with insufficient available balance. If the cvc parameter is provided, Stripe will attempt to check the CVC's
      * correctness, and the check's result will be returned. Similarly, If address_line1 or address_zip are provided, Stripe will similarly try to
      * check the validity of those parameters. Some banks do not support checking one or more of these parameters, in which case Stripe will return
      * an 'unavailable' result. Also note that, depending on the bank, charges can succeed even when passed incorrect CVC and address information.
      *
      * @param options Options for creating a charge.
      * @param response A callback to receive the response and newly created charge, or errors if they exist.
      */
    def create(
      data: stripeLib.stripeMod.chargesNs.IChargeCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def create(
      data: stripeLib.stripeMod.chargesNs.IChargeCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.chargesNs.ICharge]
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def create(
      data: stripeLib.stripeMod.chargesNs.IChargeCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.chargesNs.ICharge]
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def createRefund(id: java.lang.String): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def createRefund(id: java.lang.String, data: stripeLib.stripeMod.refundsNs.IRefundCreationOptions): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    /**
      * When you create a new refund, you must specify a charge to create it on. Creating a new refund will refund a charge that has previously
      * been created but not yet refunded. Funds will be refunded to the credit or debit card that was originally charged. The fees you were
      * originally charged are also refunded. You can optionally refund only part of a charge. You can do so as many times as you wish until
      * the entire charge has been refunded. Once entirely refunded, a charge can't be refunded again. This method will throw an error when
      * called on an already-refunded charge, or when trying to refund more money than is left on a charge.
      *
      * @returns Returns the refund object if the refund succeeded. Throws an error if the charge has already been refunded or an invalid
      * charge identifier was provided.
      *
      * @param id The identifier of the charge to be refunded.
      * @param data Options for specifying reasons and refund amount
      * @param response The refund.
      *
      * @deprecated According to source code (https://github.com/stripe/stripe-node/blob/master/lib/resources/Charges.js#L43)
      */
    def createRefund(
      id: java.lang.String,
      data: stripeLib.stripeMod.refundsNs.IRefundCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def createRefund(
      id: java.lang.String,
      data: stripeLib.stripeMod.refundsNs.IRefundCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def createRefund(
      id: java.lang.String,
      data: stripeLib.stripeMod.refundsNs.IRefundCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def createRefund(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def createRefund(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def createRefund(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def list(data: stripeLib.stripeMod.chargesNs.IChargeListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    /**
      * Returns a list of charges you've previously created. The charges are returned in sorted order, with the most recent charges
      * appearing first.
      *
      * @returns An object with a data property that contains an array of up to limit charges, starting after charge starting_after.
      * Each entry in the array is a separate charge object. If no more charges are available, the resulting array will be empty.
      * If you provide a non-existent customer ID, this call throws an error. You can optionally request that the response include
      * the total count of all charges that match your filters. To do so, specify include[]=total_count in your request.
      *
      * @param data Filtering options for the returned items.
      */
    def list(data: stripeLib.stripeMod.chargesNs.IChargeListOptions, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def list(
      data: stripeLib.stripeMod.chargesNs.IChargeListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.chargesNs.ICharge]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def list(
      data: stripeLib.stripeMod.chargesNs.IChargeListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.chargesNs.ICharge]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.chargesNs.ICharge]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.chargesNs.ICharge]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def listRefunds(chargeId: java.lang.String): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def listRefunds(chargeId: java.lang.String, data: stripeLib.stripeMod.IListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    /**
      * You can see a list of the refunds belonging to a specific charge. Note that the 10 most recent refunds are always available by default on
      * the charge object. If you need more than those 10, you can use this API method and the limit and starting_after parameters to page through
      * additional refunds.
      *
      * @returns A object with a data property that contains an array of up to limit refunds, starting after refund starting_after.
      * Each entry in the array is a separate refund object. If no more refunds are available, the resulting array will be empty. If you provide
      * a non-existent customer ID or charge ID, this call throws an error. You can optionally request that the response include the total count
      * of all refunds that match your filters. To do so, specify include[]=total_count in your request.
      *
      * @param chargeId The ID of the charge refunded
      * @param data Used to filter the refunds returned
      */
    def listRefunds(
      chargeId: java.lang.String,
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def listRefunds(
      chargeId: java.lang.String,
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.refundsNs.IRefund]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def listRefunds(
      chargeId: java.lang.String,
      data: stripeLib.stripeMod.IListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.refundsNs.IRefund]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def listRefunds(chargeId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def listRefunds(
      chargeId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.refundsNs.IRefund]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def listRefunds(
      chargeId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.refundsNs.IRefund]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def markAsFraudulent(chargeId: java.lang.String): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def markAsFraudulent(
      chargeId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.chargesNs.ICharge]
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def markAsSafe(chargeId: java.lang.String): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def markAsSafe(
      chargeId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.chargesNs.ICharge]
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def refund(chargeId: java.lang.String): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def refund(chargeId: java.lang.String, data: stripeLib.stripeMod.refundsNs.IRefundCreationOptions): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    /**
      * When you create a new refund, you must specify a charge to create it on.
      * Creating a new refund will refund a charge that has previously been created but not yet refunded. Funds will be refunded to the credit or debit card that was originally charged. The fees you were originally charged are also refunded.
      * You can optionally refund only part of a charge. You can do so as many times as you wish until the entire charge has been refunded.
      * Once entirely refunded, a charge can't be refunded again. This method will throw an error when called on an already-refunded charge, or when trying to refund more money than is left on a charge.
      */
    def refund(
      chargeId: java.lang.String,
      data: stripeLib.stripeMod.refundsNs.IRefundCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def refund(
      chargeId: java.lang.String,
      data: stripeLib.stripeMod.refundsNs.IRefundCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def refund(
      chargeId: java.lang.String,
      data: stripeLib.stripeMod.refundsNs.IRefundCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def refund(chargeId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def refund(
      chargeId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def refund(
      chargeId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def retrieve(id: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    /**
      * Retrieves the details of a charge that has previously been created. Supply the unique charge ID that was returned
      * from your previous request, and Stripe will return the corresponding charge information. The same information is
      * returned when creating or refunding the charge.
      *
      * @param id The identifier of the charge to be retrieved
      * @param response A callback that takes in a potential error and a charge object.
      */
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.chargesNs.ICharge]
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.chargesNs.ICharge]
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def retrieve(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def retrieve(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.chargesNs.ICharge]
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def retrieve(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.chargesNs.ICharge]
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def retrieveRefund(chargeId: java.lang.String, refundId: java.lang.String): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    /**
      * By default, you can see the 10 most recent refunds stored directly on the charge object, but you can also retrieve details about a specific
      * refund stored on the charge.
      *
      * @param chargeId The ID of the charge refunded
      * @param refundId The ID of the refund to retrieve
      */
    def retrieveRefund(chargeId: java.lang.String, refundId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def retrieveRefund(
      chargeId: java.lang.String,
      refundId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def retrieveRefund(
      chargeId: java.lang.String,
      refundId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def update(id: java.lang.String, data: stripeLib.stripeMod.chargesNs.IChargeUpdateOptions): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    /**
      * Updates the specified charge by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
      * This request accepts only the description, metadata, receipt_email and fraud_details as arguments.
      *
      * @param id The identifier of the charge to be updated
      * @param data An object containing the updated properties.
      */
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.chargesNs.IChargeUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.chargesNs.IChargeUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.chargesNs.ICharge]
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.chargesNs.IChargeUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.chargesNs.ICharge]
    ): js.Promise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def updateRefund(
      chargeId: java.lang.String,
      refundId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptionsWithMetadata
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    /**
      * Updates the specified refund by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
      * This request only accepts metadata as an argument.
      *
      * @param chargeId The ID of the charge refunded
      * @param refundId The ID of the refund to update
      */
    def updateRefund(
      chargeId: java.lang.String,
      refundId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptionsWithMetadata,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def updateRefund(
      chargeId: java.lang.String,
      refundId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptionsWithMetadata,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def updateRefund(
      chargeId: java.lang.String,
      refundId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptionsWithMetadata,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
  }
  
  @js.native
  class Checkout ()
    extends stripeLib.stripeMod.StripeResource {
    var sessions: Sessions = js.native
  }
  
  @js.native
  class CountrySpecs ()
    extends stripeLib.stripeMod.StripeResource {
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    def list(data: stripeLib.stripeMod.IListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    /**
      * Lists all Country Spec objects available in the API.
      */
    def list(data: stripeLib.stripeMod.IListOptions, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    def list(
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.countrySpecsNs.ICountrySpec]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    def list(
      data: stripeLib.stripeMod.IListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.countrySpecsNs.ICountrySpec]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.countrySpecsNs.ICountrySpec]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.countrySpecsNs.ICountrySpec]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    def retrieve(id: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    /**
      * Returns a Country Spec for a given Country code.
      *
      * @param retrieve  An ISO country code. Available country codes can be listed with the List Country Specs endpoint.
      */
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.countrySpecsNs.ICountrySpec]
    ): js.Promise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.countrySpecsNs.ICountrySpec]
    ): js.Promise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    def retrieve(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    def retrieve(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.countrySpecsNs.ICountrySpec]
    ): js.Promise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
    def retrieve(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.countrySpecsNs.ICountrySpec]
    ): js.Promise[stripeLib.stripeMod.countrySpecsNs.ICountrySpec] = js.native
  }
  
  @js.native
  class Coupons ()
    extends stripeLib.stripeMod.StripeResource {
    def create(data: stripeLib.stripeMod.couponsNs.ICouponCreationOptions): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
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
    def create(
      data: stripeLib.stripeMod.couponsNs.ICouponCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def create(
      data: stripeLib.stripeMod.couponsNs.ICouponCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.couponsNs.ICoupon]
    ): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def create(
      data: stripeLib.stripeMod.couponsNs.ICouponCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.couponsNs.ICoupon]
    ): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def del(id: java.lang.String): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
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
    def del(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def list(data: stripeLib.stripeMod.IListOptionsCreated): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
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
    def list(data: stripeLib.stripeMod.IListOptionsCreated, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def list(
      data: stripeLib.stripeMod.IListOptionsCreated,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.couponsNs.ICoupon]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def list(
      data: stripeLib.stripeMod.IListOptionsCreated,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.couponsNs.ICoupon]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.couponsNs.ICoupon]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.couponsNs.ICoupon]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def retrieve(id: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    /**
      * Retrieves the coupon with the given ID.
      *
      * @returns Returns a coupon if a valid coupon ID was provided. Throws an error otherwise.
      *
      * @param id The ID of the desired coupon
      */
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.couponsNs.ICoupon]
    ): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.couponsNs.ICoupon]
    ): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def retrieve(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def retrieve(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.couponsNs.ICoupon]
    ): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def retrieve(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.couponsNs.ICoupon]
    ): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def update(id: java.lang.String, data: stripeLib.stripeMod.IDataOptionsWithMetadata): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    /**
      * Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by design, not editable.
      *
      * @returns The newly updated coupon object if the call succeeded. Otherwise, this call throws an error, such as if the coupon has
      * been deleted.
      *
      * @param id The ID of the coupon to be updated
      * @param data Metadata to update
      */
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptionsWithMetadata,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptionsWithMetadata,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.couponsNs.ICoupon]
    ): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptionsWithMetadata,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.couponsNs.ICoupon]
    ): js.Promise[stripeLib.stripeMod.couponsNs.ICoupon] = js.native
  }
  
  @js.native
  class CreditNotes ()
    extends stripeLib.stripeMod.StripeResource {
    def create(data: stripeLib.stripeMod.creditNotesNs.ICreditNoteCreationOptions): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    /**
      * A credit note can be issued for open and paid invoices.
      * When issued for an open invoice, a credit note decreases the invoice’s amount due.
      * When issued for a paid invoice, it is commonly used to refund or credit a specified amount to the customer.
      */
    def create(
      data: stripeLib.stripeMod.creditNotesNs.ICreditNoteCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    def create(
      data: stripeLib.stripeMod.creditNotesNs.ICreditNoteCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.creditNotesNs.ICreditNote]
    ): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    def create(
      data: stripeLib.stripeMod.creditNotesNs.ICreditNoteCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.creditNotesNs.ICreditNote]
    ): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    def list(): js.Promise[stripeLib.stripeMod.IList[stripeLib.stripeMod.creditNotesNs.ICreditNote]] = js.native
    def list(data: stripeLib.stripeMod.creditNotesNs.ICreditNoteListOptions): js.Promise[stripeLib.stripeMod.IList[stripeLib.stripeMod.creditNotesNs.ICreditNote]] = js.native
    /**
      * Returns a list of your credit notes. Credit notes are returned sorted by creation date, with the most recently created credit note
      * items appearing first.
      */
    def list(
      data: stripeLib.stripeMod.creditNotesNs.ICreditNoteListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.IList[stripeLib.stripeMod.creditNotesNs.ICreditNote]] = js.native
    def list(
      data: stripeLib.stripeMod.creditNotesNs.ICreditNoteListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.creditNotesNs.ICreditNote]]
    ): js.Promise[stripeLib.stripeMod.IList[stripeLib.stripeMod.creditNotesNs.ICreditNote]] = js.native
    def list(
      data: stripeLib.stripeMod.creditNotesNs.ICreditNoteListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.creditNotesNs.ICreditNote]]
    ): js.Promise[stripeLib.stripeMod.IList[stripeLib.stripeMod.creditNotesNs.ICreditNote]] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.IList[stripeLib.stripeMod.creditNotesNs.ICreditNote]] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.creditNotesNs.ICreditNote]]
    ): js.Promise[stripeLib.stripeMod.IList[stripeLib.stripeMod.creditNotesNs.ICreditNote]] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.creditNotesNs.ICreditNote]]
    ): js.Promise[stripeLib.stripeMod.IList[stripeLib.stripeMod.creditNotesNs.ICreditNote]] = js.native
    def retrieve(creditNoteId: java.lang.String): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    /**
      * Retrieves the credit note with the given ID.
      */
    def retrieve(creditNoteId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    def retrieve(
      creditNoteId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.creditNotesNs.ICreditNote]
    ): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    def retrieve(
      creditNoteId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.creditNotesNs.ICreditNote]
    ): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    def update(creditNoteId: java.lang.String, data: stripeLib.stripeMod.creditNotesNs.ICreditNoteUpdateOptions): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    /**
      * Updates the memo or metadata on the credit note.
      */
    def update(
      creditNoteId: java.lang.String,
      data: stripeLib.stripeMod.creditNotesNs.ICreditNoteUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    def update(
      creditNoteId: java.lang.String,
      data: stripeLib.stripeMod.creditNotesNs.ICreditNoteUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.creditNotesNs.ICreditNote]
    ): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    def update(
      creditNoteId: java.lang.String,
      data: stripeLib.stripeMod.creditNotesNs.ICreditNoteUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.creditNotesNs.ICreditNote]
    ): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    def voidCreditNote(creditNoteId: java.lang.String): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    /**
      * Marks a credit note as void. Voiding a credit note reverses its adjustment. Voiding is only possible on open invoices.
      */
    def voidCreditNote(creditNoteId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    def voidCreditNote(
      creditNoteId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.creditNotesNs.ICreditNote]
    ): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
    def voidCreditNote(
      creditNoteId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.creditNotesNs.ICreditNote]
    ): js.Promise[stripeLib.stripeMod.creditNotesNs.ICreditNote] = js.native
  }
  
  @js.native
  class CustomerCards ()
    extends stripeLib.stripeMod.StripeResource {
    def create(data: stripeLib.Anon_CardICardSourceCreationOptionsExtended): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    /**
      * When you create a new credit card, you must specify a customer or recipient to create it on. If the card's owner has no default card,
      * then the new card will become the default. However, if the owner already has a default then it will not change. To change the default,
      * you should either update the customer to have a new default_source or update the recipient to have a new default_card.
      *
      * @returns Returns the card object.
      */
    def create(
      data: stripeLib.Anon_CardICardSourceCreationOptionsExtended,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def create(
      data: stripeLib.Anon_CardICardSourceCreationOptionsExtended,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def create(
      data: stripeLib.Anon_CardICardSourceCreationOptionsExtended,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def del(cardId: java.lang.String): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
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
      * @param cardId The ID of the card to be retrieved.
      */
    def del(cardId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      cardId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      cardId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def list(data: stripeLib.stripeMod.IListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    /**
      * You can see a list of the cards belonging to a customer or recipient. Note that the 10 most recent
      * cards are always available by default on the customer or recipient object. If you need more than
      * those 10, you can use this API method and the limit and starting_after parameters to page through
      * additional cards.
      *
      * @returns Returns a list of the cards stored on the customer or recipient. You can optionally request
      * that the response include the total count of all cards for the customer or recipient. To do so,
      * specify include[]=total_count in your request.
      * @param data Filtering options
      */
    def list(data: stripeLib.stripeMod.IListOptions, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def list(
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.cardsNs.ICard]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def list(
      data: stripeLib.stripeMod.IListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.cardsNs.ICard]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.cardsNs.ICard]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.cardsNs.ICard]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def retrieve(cardId: java.lang.String): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    /**
      * By default, you can see the 10 most recent cards stored on a customer or recipient directly on the customer or recipient object, but
      * you can also retrieve details about a specific card stored on the customer or recipient.
      *
      * @returns Returns the card object.
      *
      * @param cardId The ID of the card to be retrieved.
      */
    def retrieve(cardId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def retrieve(
      cardId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def retrieve(
      cardId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def update(cardId: java.lang.String, data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    /**
      * If you need to update only some card details, like the billing address or expiration date, you can do so without having to re-enter the
      * full card details. Stripe also works directly with card networks so that your customers can continue using your service without
      * interruption. When you update a card, Stripe will automatically validate the card.
      *
      * @returns Returns the card object.
      *
      * @param cardId The ID of the card to be retrieved.
      */
    def update(
      cardId: java.lang.String,
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def update(
      cardId: java.lang.String,
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def update(
      cardId: java.lang.String,
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
  }
  
  @js.native
  class CustomerSubscriptions () extends SubscriptionsBase {
    def create(data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCustCreationOptions): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    /**
      * Creates a new subscription on an existing customer.
      *
      * @returns The newly created subscription object if the call succeeded. If the customer has no card or the
      * attempted charge fails, this call throws an error (unless the specified plan is free or has a trial
      * period).
      *
      * @param options The options for the new subscription
      */
    def create(
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCustCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def create(
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCustCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def create(
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCustCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
  }
  
  @js.native
  class Customers ()
    extends stripeLib.stripeMod.StripeResource {
    def cancelSubscription(customerId: java.lang.String, subscriptionId: java.lang.String): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def cancelSubscription(
      customerId: java.lang.String,
      subscriptionId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCancellationOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
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
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCancellationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def cancelSubscription(
      customerId: java.lang.String,
      subscriptionId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCancellationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def cancelSubscription(
      customerId: java.lang.String,
      subscriptionId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCancellationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def cancelSubscription(
      customerId: java.lang.String,
      subscriptionId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def create(data: stripeLib.stripeMod.customersNs.ICustomerCreationOptions): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
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
      data: stripeLib.stripeMod.customersNs.ICustomerCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def create(
      data: stripeLib.stripeMod.customersNs.ICustomerCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.customersNs.ICustomer]
    ): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def create(
      data: stripeLib.stripeMod.customersNs.ICustomerCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.customersNs.ICustomer]
    ): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def createCard(customerId: java.lang.String, data: stripeLib.Anon_CardICardSourceCreationOptionsExtended): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
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
      data: stripeLib.Anon_CardICardSourceCreationOptionsExtended,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def createCard(
      customerId: java.lang.String,
      data: stripeLib.Anon_CardICardSourceCreationOptionsExtended,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def createCard(
      customerId: java.lang.String,
      data: stripeLib.Anon_CardICardSourceCreationOptionsExtended,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def createSource(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.customersNs.ICustomerCardSourceCreationOptions
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
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
      data: stripeLib.stripeMod.customersNs.ICustomerCardSourceCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def createSource(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.customersNs.ICustomerCardSourceCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def createSource(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.customersNs.ICustomerCardSourceCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def createSource(customerId: java.lang.String, data: stripeLib.stripeMod.customersNs.ICustomerSourceCreationOptions): js.Promise[stripeLib.stripeMod.IStripeSource] = js.native
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
      data: stripeLib.stripeMod.customersNs.ICustomerSourceCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.IStripeSource] = js.native
    def createSource(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.customersNs.ICustomerSourceCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IStripeSource]
    ): js.Promise[stripeLib.stripeMod.IStripeSource] = js.native
    def createSource(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.customersNs.ICustomerSourceCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IStripeSource]
    ): js.Promise[stripeLib.stripeMod.IStripeSource] = js.native
    def createSubscription(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCustCreationOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
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
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCustCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def createSubscription(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCustCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def createSubscription(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCustCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def del(id: java.lang.String): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    /**
      * Permanently deletes a customer. It cannot be undone. Also immediately cancels any active subscriptions on the customer.
      *
      * @returns Returns an object with a deleted parameter on success. If the customer ID does not exist, this call throws an error. Unlike
      * other objects, deleted customers can still be retrieved through the API, in order to be able to track the history of customers while
      * still removing their credit card details and preventing any further operations to be performed (such as adding a new subscription).
      *
      * @param id The identifier of the customer to be deleted.
      */
    def del(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteCard(customerId: java.lang.String, cardId: java.lang.String): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
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
    def deleteCard(customerId: java.lang.String, cardId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteCard(
      customerId: java.lang.String,
      cardId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteCard(
      customerId: java.lang.String,
      cardId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteDiscount(customerId: java.lang.String): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    /**
      * Removes the currently applied discount on a customer.
      *
      * @returns An object with a deleted flag set to true upon success. This call throws an error otherwise, such as if no
      * discount exists on this customer.
      *
      * @param customerId The ID of the customer.
      */
    def deleteDiscount(customerId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteDiscount(
      customerId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteDiscount(
      customerId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteSource(customerId: java.lang.String, sourceId: java.lang.String): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
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
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteSource(
      customerId: java.lang.String,
      sourceId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteSource(
      customerId: java.lang.String,
      sourceId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteSubscriptionDiscount(customerId: java.lang.String, subscriptionId: java.lang.String): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
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
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteSubscriptionDiscount(
      customerId: java.lang.String,
      subscriptionId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteSubscriptionDiscount(
      customerId: java.lang.String,
      subscriptionId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def list(data: stripeLib.stripeMod.customersNs.ICustomerListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
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
      data: stripeLib.stripeMod.customersNs.ICustomerListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def list(
      data: stripeLib.stripeMod.customersNs.ICustomerListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.customersNs.ICustomer]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def list(
      data: stripeLib.stripeMod.customersNs.ICustomerListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.customersNs.ICustomer]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.customersNs.ICustomer]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.customersNs.ICustomer]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def listCards(customerId: java.lang.String): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def listCards(customerId: java.lang.String, data: stripeLib.stripeMod.IListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
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
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def listCards(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.cardsNs.ICard]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def listCards(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.IListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.cardsNs.ICard]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def listCards(customerId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def listCards(
      customerId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.cardsNs.ICard]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def listCards(
      customerId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.cardsNs.ICard]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def listSources(customerId: java.lang.String, data: stripeLib.stripeMod.customersNs.IBankAccountSourceListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
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
      data: stripeLib.stripeMod.customersNs.IBankAccountSourceListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def listSources(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.customersNs.IBankAccountSourceListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.bankAccountsNs.IBankAccount]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def listSources(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.customersNs.IBankAccountSourceListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.bankAccountsNs.IBankAccount]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def listSources(customerId: java.lang.String, data: stripeLib.stripeMod.customersNs.ICardSourceListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
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
      data: stripeLib.stripeMod.customersNs.ICardSourceListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def listSources(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.customersNs.ICardSourceListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.cardsNs.ICard]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def listSources(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.customersNs.ICardSourceListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.cardsNs.ICard]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def listSources(customerId: java.lang.String, data: stripeLib.stripeMod.customersNs.ISourceListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def listSources(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.customersNs.ISourceListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def listSources(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.customersNs.ISourceListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.sourcesNs.ISource]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def listSources(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.customersNs.ISourceListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.sourcesNs.ISource]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def listSubscriptions(customerId: java.lang.String): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def listSubscriptions(customerId: java.lang.String, data: stripeLib.stripeMod.IListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
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
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def listSubscriptions(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.subscriptionsNs.ISubscription]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def listSubscriptions(
      customerId: java.lang.String,
      data: stripeLib.stripeMod.IListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.subscriptionsNs.ISubscription]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def listSubscriptions(customerId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def listSubscriptions(
      customerId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.subscriptionsNs.ISubscription]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def listSubscriptions(
      customerId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.subscriptionsNs.ISubscription]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def retrieve(id: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
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
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.customersNs.ICustomer]
    ): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.customersNs.ICustomer]
    ): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def retrieve(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def retrieve(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.customersNs.ICustomer]
    ): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def retrieve(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.customersNs.ICustomer]
    ): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def retrieveCard(customerId: java.lang.String, cardId: java.lang.String): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    /**
      * By default, you can see the 10 most recent cards stored on a customer or recipient directly on the customer or recipient object, but
      * you can also retrieve details about a specific card stored on the customer or recipient.
      *
      * @returns Returns the card object.
      *
      * @param customerId The ID of the customer whose card needs to be retrieved.
      * @param cardId The ID of the card to be retrieved.
      */
    def retrieveCard(customerId: java.lang.String, cardId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def retrieveCard(
      customerId: java.lang.String,
      cardId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def retrieveCard(
      customerId: java.lang.String,
      cardId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def retrieveSource(customerId: java.lang.String, sourceId: java.lang.String): js.Promise[stripeLib.stripeMod.IStripeSource] = js.native
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
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.IStripeSource] = js.native
    def retrieveSource(
      customerId: java.lang.String,
      sourceId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IStripeSource]
    ): js.Promise[stripeLib.stripeMod.IStripeSource] = js.native
    def retrieveSource(
      customerId: java.lang.String,
      sourceId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IStripeSource]
    ): js.Promise[stripeLib.stripeMod.IStripeSource] = js.native
    def retrieveSubscription(customerId: java.lang.String, subscriptionId: java.lang.String): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
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
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def retrieveSubscription(
      customerId: java.lang.String,
      subscriptionId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def retrieveSubscription(
      customerId: java.lang.String,
      subscriptionId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def update(id: java.lang.String, data: stripeLib.stripeMod.customersNs.ICustomerUpdateOptions): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
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
      data: stripeLib.stripeMod.customersNs.ICustomerUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.customersNs.ICustomerUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.customersNs.ICustomer]
    ): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.customersNs.ICustomerUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.customersNs.ICustomer]
    ): js.Promise[stripeLib.stripeMod.customersNs.ICustomer] = js.native
    def updateCard(
      customerId: java.lang.String,
      cardId: java.lang.String,
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
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
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def updateCard(
      customerId: java.lang.String,
      cardId: java.lang.String,
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def updateCard(
      customerId: java.lang.String,
      cardId: java.lang.String,
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def updateSource(
      customerId: java.lang.String,
      sourceId: java.lang.String,
      data: stripeLib.stripeMod.bankAccountsNs.IBankAccountUpdateOptions
    ): js.Promise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
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
      data: stripeLib.stripeMod.bankAccountsNs.IBankAccountUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def updateSource(
      customerId: java.lang.String,
      sourceId: java.lang.String,
      data: stripeLib.stripeMod.bankAccountsNs.IBankAccountUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.bankAccountsNs.IBankAccount]
    ): js.Promise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def updateSource(
      customerId: java.lang.String,
      sourceId: java.lang.String,
      data: stripeLib.stripeMod.bankAccountsNs.IBankAccountUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.bankAccountsNs.IBankAccount]
    ): js.Promise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def updateSource(
      customerId: java.lang.String,
      sourceId: java.lang.String,
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
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
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def updateSource(
      customerId: java.lang.String,
      sourceId: java.lang.String,
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def updateSource(
      customerId: java.lang.String,
      sourceId: java.lang.String,
      data: stripeLib.stripeMod.cardsNs.ICardUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.cardsNs.ICard]
    ): js.Promise[stripeLib.stripeMod.cardsNs.ICard] = js.native
    def updateSubscription(
      customerId: java.lang.String,
      subscriptionId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionUpdateOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
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
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def updateSubscription(
      customerId: java.lang.String,
      subscriptionId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def updateSubscription(
      customerId: java.lang.String,
      subscriptionId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def verifySource(
      customerId: java.lang.String,
      sourceId: java.lang.String,
      data: stripeLib.stripeMod.bankAccountsNs.IBankAccountVerifyOptions
    ): js.Promise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
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
      data: stripeLib.stripeMod.bankAccountsNs.IBankAccountVerifyOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.bankAccountsNs.IBankAccount] = js.native
  }
  
  @js.native
  class Disputes ()
    extends stripeLib.stripeMod.StripeResource {
    def close(disputeId: java.lang.String): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    /**
      * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
      * essentially ‘dismissing’ the dispute, acknowledging it as lost
      *
      * The status of the dispute will change from needs_response to lost.
      *
      * *Closing a dispute is irreversible!*
      */
    def close(disputeId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def close(
      disputeId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.disputesNs.IDispute]
    ): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def close(
      disputeId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.disputesNs.IDispute]
    ): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
     // TODO: Implement placeholder method
    def getMetadata(): scala.Unit = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def list(data: stripeLib.stripeMod.IListOptionsCreated): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    /**
      * Returns a list of your disputes.
      */
    def list(data: stripeLib.stripeMod.IListOptionsCreated, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def list(
      data: stripeLib.stripeMod.IListOptionsCreated,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.disputesNs.IDispute]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def list(
      data: stripeLib.stripeMod.IListOptionsCreated,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.disputesNs.IDispute]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.disputesNs.IDispute]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.disputesNs.IDispute]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def retrieve(disputeId: java.lang.String): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def retrieve(disputeId: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    /**
      * Retrieves the dispute with the given ID.
      */
    def retrieve(
      disputeId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def retrieve(
      disputeId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.disputesNs.IDispute]
    ): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def retrieve(
      disputeId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.disputesNs.IDispute]
    ): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def retrieve(disputeId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def retrieve(
      disputeId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.disputesNs.IDispute]
    ): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def retrieve(
      disputeId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.disputesNs.IDispute]
    ): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def setMetadata(): scala.Unit = js.native
    def update(disputeId: java.lang.String, data: stripeLib.stripeMod.disputesNs.IDisputeUpdateOptions): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    /**
      * When you get a dispute, contacting your customer is always the best first step. If that doesn't work, you can submit evidence in
      * order to help us resolve the dispute in your favor. You can do this in your dashboard, but if you prefer, you can use the API to
      * submit evidence programmatically. Depending on your dispute type, different evidence fields will give you a better chance of winning
      * your dispute. You may want to consult our guide to dispute types to help you figure out which evidence fields to provide:
      * https://stripe.com/help/dispute-types
      *
      * @param data The fields to update
      */
    def update(
      disputeId: java.lang.String,
      data: stripeLib.stripeMod.disputesNs.IDisputeUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def update(
      disputeId: java.lang.String,
      data: stripeLib.stripeMod.disputesNs.IDisputeUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.disputesNs.IDispute]
    ): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
    def update(
      disputeId: java.lang.String,
      data: stripeLib.stripeMod.disputesNs.IDisputeUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.disputesNs.IDispute]
    ): js.Promise[stripeLib.stripeMod.disputesNs.IDispute] = js.native
  }
  
  @js.native
  class EphemeralKeys () extends js.Object {
    def create(
      customer: stripeLib.stripeMod.ephemeralKeysNs.ICustomer,
      stripe_version: stripeLib.stripeMod.ephemeralKeysNs.IStripeVersion
    ): js.Promise[stripeLib.stripeMod.ephemeralKeysNs.IEphemeralKey] = js.native
    def create(
      customer: stripeLib.stripeMod.ephemeralKeysNs.ICustomer,
      stripe_version: stripeLib.stripeMod.ephemeralKeysNs.IStripeVersion,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.ephemeralKeysNs.IEphemeralKey]
    ): js.Promise[stripeLib.stripeMod.ephemeralKeysNs.IEphemeralKey] = js.native
  }
  
  @js.native
  class Events ()
    extends stripeLib.stripeMod.StripeResource {
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    def list(data: stripeLib.stripeMod.eventsNs.IEventListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    /**
      * List events, going back up to 30 days.
      */
    def list(data: stripeLib.stripeMod.eventsNs.IEventListOptions, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    def list(
      data: stripeLib.stripeMod.eventsNs.IEventListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.eventsNs.IEvent]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    def list(
      data: stripeLib.stripeMod.eventsNs.IEventListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.eventsNs.IEvent]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.eventsNs.IEvent]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.eventsNs.IEvent]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    def retrieve(id: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    /**
      * Retrieves the details of an event. Supply the unique identifier of the event, which you might have
      * received in a webhook.
      */
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.eventsNs.IEvent]
    ): js.Promise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.eventsNs.IEvent]
    ): js.Promise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    def retrieve(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    def retrieve(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.eventsNs.IEvent]
    ): js.Promise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
    def retrieve(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.eventsNs.IEvent]
    ): js.Promise[stripeLib.stripeMod.eventsNs.IEvent] = js.native
  }
  
  @js.native
  class FileUploads ()
    extends stripeLib.stripeMod.StripeResource {
    def create(data: stripeLib.stripeMod.fileUploadsNs.IFileUploadCreationOptions): js.Promise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    /**
      * To upload a file to Stripe, you’ll need to send a request of type multipart/form-data.
      * The request should contain the file you would like to upload, as well as the parameters for creating a file.
      *
      * All of Stripe’s officially supported API libraries should have support for sending multipart/form-data.
      */
    def create(
      data: stripeLib.stripeMod.fileUploadsNs.IFileUploadCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def create(
      data: stripeLib.stripeMod.fileUploadsNs.IFileUploadCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.fileUploadsNs.IFileUpdate]
    ): js.Promise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def create(
      data: stripeLib.stripeMod.fileUploadsNs.IFileUploadCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.fileUploadsNs.IFileUpdate]
    ): js.Promise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def list(data: stripeLib.stripeMod.fileUploadsNs.IFileUploadListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    /**
      * Returns a list of the files that you have uploaded to Stripe.
      * The file uploads are returned sorted by creation date, with the most recently created file uploads appearing first.
      */
    def list(
      data: stripeLib.stripeMod.fileUploadsNs.IFileUploadListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def list(
      data: stripeLib.stripeMod.fileUploadsNs.IFileUploadListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.fileUploadsNs.IFileUpdate]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def list(
      data: stripeLib.stripeMod.fileUploadsNs.IFileUploadListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.fileUploadsNs.IFileUpdate]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.fileUploadsNs.IFileUpdate]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.fileUploadsNs.IFileUpdate]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def retrieve(id: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    /**
      * Retrieves the details of an existing file object.
      * Supply the unique file upload ID from a file creation request, and Stripe will return the corresponding transfer information.
      */
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.fileUploadsNs.IFileUpdate]
    ): js.Promise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.fileUploadsNs.IFileUpdate]
    ): js.Promise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def retrieve(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def retrieve(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.fileUploadsNs.IFileUpdate]
    ): js.Promise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
    def retrieve(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.fileUploadsNs.IFileUpdate]
    ): js.Promise[stripeLib.stripeMod.fileUploadsNs.IFileUpdate] = js.native
  }
  
  trait IPlanListOptions
    extends stripeLib.stripeMod.IListOptionsCreated {
    /**
      * Only return plans that are active or inactive (e.g., pass false to list all inactive products).
      */
    var active: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Only return plans for the given product.
      */
    var product: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  class InvoiceItems ()
    extends stripeLib.stripeMod.StripeResource {
    def create(data: stripeLib.stripeMod.invoiceItemsNs.InvoiceItemCreationOptions): js.Promise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    /**
      * Adds an arbitrary charge or credit to the customer’s upcoming invoice.
      */
    def create(
      data: stripeLib.stripeMod.invoiceItemsNs.InvoiceItemCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def create(
      data: stripeLib.stripeMod.invoiceItemsNs.InvoiceItemCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem]
    ): js.Promise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def create(
      data: stripeLib.stripeMod.invoiceItemsNs.InvoiceItemCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem]
    ): js.Promise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def del(invoiceItemId: java.lang.String): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    /**
      * Removes an invoice item from the upcoming invoice. Removing an invoice item is only possible before the invoice it's attached
      * to is closed.
      */
    def del(invoiceItemId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      invoiceItemId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      invoiceItemId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def list(data: stripeLib.stripeMod.invoiceItemsNs.InvoiceItemListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    /**
      * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with the most recently created invoice
      * items appearing first.
      */
    def list(
      data: stripeLib.stripeMod.invoiceItemsNs.InvoiceItemListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def list(
      data: stripeLib.stripeMod.invoiceItemsNs.InvoiceItemListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def list(
      data: stripeLib.stripeMod.invoiceItemsNs.InvoiceItemListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def retrieve(invoiceItemId: java.lang.String): js.Promise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    /**
      * Retrieves the invoice item with the given ID.
      */
    def retrieve(invoiceItemId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def retrieve(
      invoiceItemId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem]
    ): js.Promise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def retrieve(
      invoiceItemId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem]
    ): js.Promise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def update(invoiceItemId: java.lang.String, data: stripeLib.stripeMod.invoiceItemsNs.InvoiceItemUpdateOptions): js.Promise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    /**
      * Updates the amount or description of an invoice item on an upcoming invoice. Updating an invoice item is only possible before the
      * invoice it's attached to is closed.
      */
    def update(
      invoiceItemId: java.lang.String,
      data: stripeLib.stripeMod.invoiceItemsNs.InvoiceItemUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def update(
      invoiceItemId: java.lang.String,
      data: stripeLib.stripeMod.invoiceItemsNs.InvoiceItemUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem]
    ): js.Promise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
    def update(
      invoiceItemId: java.lang.String,
      data: stripeLib.stripeMod.invoiceItemsNs.InvoiceItemUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem]
    ): js.Promise[stripeLib.stripeMod.invoiceItemsNs.InvoiceItem] = js.native
  }
  
  @js.native
  class Invoices ()
    extends stripeLib.stripeMod.StripeResource {
    def create(data: stripeLib.stripeMod.invoicesNs.IInvoiceCreationOptions): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    /**
      * If you need to invoice your customer outside the regular billing cycle, you can create an invoice that
      * pulls in all pending invoice items, including prorations. The customer's billing cycle and regular subscription
      * won't be affected. Once you create the invoice, it'll be picked up and paid automatically, though you can
      * choose to pay it right away: https://stripe.com/docs/api#pay_invoice
      *
      * @returns Returns the invoice object if there are pending invoice items to invoice. Throws an error if there
      * are no pending invoice items or if the customer ID provided is invalid.
      *
      * @param data Options used to create the invoice.
      */
    def create(
      data: stripeLib.stripeMod.invoicesNs.IInvoiceCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def create(
      data: stripeLib.stripeMod.invoicesNs.IInvoiceCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def create(
      data: stripeLib.stripeMod.invoicesNs.IInvoiceCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def finalizeInvoice(id: java.lang.String): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def finalizeInvoice(id: java.lang.String, data: stripeLib.stripeMod.invoicesNs.IInvoiceFinalizeOptions): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    /**
      * Stripe automatically finalizes drafts before sending and attempting payment on invoices. However, if
      * you’d like to finalize a draft invoice manually, you can do so using this method.
      *
      * @returns Returns the invoice object.
      *
      * @param id The ID of the invoice to pay.
      * @param data Additional arguments.
      */
    def finalizeInvoice(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceFinalizeOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def finalizeInvoice(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceFinalizeOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def finalizeInvoice(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceFinalizeOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def finalizeInvoice(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def finalizeInvoice(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def finalizeInvoice(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def list(data: stripeLib.stripeMod.invoicesNs.IInvoiceListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    /**
      * You can list all invoices, or list the invoices for a specific customer. The invoices are returned
      * sorted by creation date, with the most recently created invoices appearing first.
      *
      * @returns A object with a data property that contains an array of invoice objects. Throws an error if the
      * customer ID is invalid.
      *
      * @param data Filtering options
      */
    def list(
      data: stripeLib.stripeMod.invoicesNs.IInvoiceListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def list(
      data: stripeLib.stripeMod.invoicesNs.IInvoiceListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoice]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def list(
      data: stripeLib.stripeMod.invoicesNs.IInvoiceListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoice]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoice]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def listLineItems(id: java.lang.String): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def listLineItems(id: java.lang.String, data: stripeLib.stripeMod.invoicesNs.IInvoiceListLineItemsOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    /**
      * When retrieving an invoice, you'll get a lines property containing the total count of line items and the first
      * handful of those items. There is also a URL where you can retrieve the full (paginated) list of line items.
      *
      * @returns Returns a list of line_item objects.
      *
      * @param id The id of the invoice containing the lines to be retrieved
      * @param data Filtering options
      */
    def listLineItems(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceListLineItemsOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def listLineItems(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceListLineItemsOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def listLineItems(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceListLineItemsOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def listLineItems(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def listLineItems(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def listLineItems(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def listUpcomingLineItems(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def listUpcomingLineItems(data: stripeLib.stripeMod.invoicesNs.IInvoiceListUpcomingLineItemsOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    /**
      * When retrieving an upcoming invoice, you’ll get a lines property containing the total count of line
      * items and the first handful of those items. There is also a URL where you can retrieve the full
      * (paginated) list of line items.
      *
      * @returns Returns a list of line_item objects.
      *
      * @param id The id of the invoice containing the lines to be retrieved
      * @param data Filtering options
      */
    def listUpcomingLineItems(
      data: stripeLib.stripeMod.invoicesNs.IInvoiceListUpcomingLineItemsOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def listUpcomingLineItems(
      data: stripeLib.stripeMod.invoicesNs.IInvoiceListUpcomingLineItemsOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def listUpcomingLineItems(
      data: stripeLib.stripeMod.invoicesNs.IInvoiceListUpcomingLineItemsOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def listUpcomingLineItems(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def listUpcomingLineItems(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def listUpcomingLineItems(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def pay(id: java.lang.String): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def pay(id: java.lang.String, data: stripeLib.stripeMod.invoicesNs.IInvoicePayOptions): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    /**
      * Stripe automatically creates and then attempts to pay invoices for customers on subscriptions. We'll also retry unpaid
      * invoices according to your retry settings. However, if you'd like to attempt to collect payment on an invoice out of the
      * normal retry schedule or for some other reason, you can do so.
      *
      * @returns Returns the invoice object.
      *
      * @param id The ID of the invoice to pay.
      */
    def pay(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoicePayOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def pay(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoicePayOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def pay(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoicePayOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def pay(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def pay(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def pay(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieve(id: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    /**
      * Retrieves the invoice with the given ID. The invoice object contains a
      * lines hash that contains information about the subscriptions and invoice items that have been applied to the
      * invoice, as well as any prorations that Stripe has automatically calculated. Each line on the invoice has an
      * amount attribute that represents the amount actually contributed to the invoice's total. For invoice items and
      * prorations, the amount attribute is the same as for the invoice item or proration respectively. For
      * subscriptions, the amount may be different from the plan's regular price depending on whether the invoice
      * covers a trial period or the invoice period differs from the plan's usual interval. The invoice object has
      * both a subtotal and a total. The subtotal represents the total before any discounts, while the total is the final
      * amount to be charged to the customer after all coupons have been applied. The invoice also has a
      * next_payment_attempt attribute that tells you the next time (as a Unix timestamp) payment for the invoice will be
      * automatically attempted. For invoices that have been closed or that have reached the maximum number of retries
      * (specified in your retry settings), the next_payment_attempt will be null.
      *
      * @returns Returns an invoice object if a valid invoice ID was provided. Throws an error otherwise.
      *
      * @param id The ID of the desired invoice.
      */
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieve(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieve(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieve(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieveLines(id: java.lang.String): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def retrieveLines(id: java.lang.String, data: stripeLib.stripeMod.invoicesNs.IInvoiceLineItemRetrievalOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    /**
      * When retrieving an invoice, you'll get a lines property containing the total count of line items and the first
      * handful of those items. There is also a URL where you can retrieve the full (paginated) list of line items.
      *
      * @returns Returns a list of line_item objects.
      *
      * @param id The id of the invoice containing the lines to be retrieved
      * @param data Filtering options
      */
    def retrieveLines(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceLineItemRetrievalOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def retrieveLines(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceLineItemRetrievalOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def retrieveLines(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceLineItemRetrievalOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def retrieveLines(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def retrieveLines(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    def retrieveLines(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.invoicesNs.IInvoiceLineItem] = js.native
    /**
      * At any time, you can preview the upcoming invoice for a customer. This will show you all the charges that are pending,
      * including subscription renewal charges, invoice item charges, etc. It will also show you any discount that is applicable
      * to the customer. Note that when you are viewing an upcoming invoice, you are simply viewing a preview -- the invoice has
      * not yet been created. As such, the upcoming invoice will not show up in invoice listing calls, and you cannot use the API
      * to pay or edit the invoice. If you want to change the amount that your customer will be billed, you can add, remove, or
      * update pending invoice items, or update the customer's discount.
      *
      * @returns Returns an invoice if a valid customer ID was provided. Throws an error otherwise.
      *
      * @param id The identifier of the customer whose upcoming invoice you'd like to retrieve.
      * @param data Filtering options
      */
    def retrieveUpcoming(
      data: stripeLib.stripeMod.invoicesNs.IInvoiceUpcomingOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieveUpcoming(
      data: stripeLib.stripeMod.invoicesNs.IInvoiceUpcomingOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieveUpcoming(id: java.lang.String): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieveUpcoming(id: java.lang.String, data: stripeLib.stripeMod.invoicesNs.IInvoiceUpcomingOptions): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieveUpcoming(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceUpcomingOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieveUpcoming(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceUpcomingOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieveUpcoming(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceUpcomingOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieveUpcoming(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieveUpcoming(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def retrieveUpcoming(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def update(id: java.lang.String, data: stripeLib.stripeMod.invoicesNs.IInvoiceUpdateOptions): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    /**
      * Until an invoice is paid, it is marked as open (closed=false). If you'd like to stop Stripe from automatically attempting
      * payment on an invoice or would simply like to close the invoice out as no longer owed by the customer, you can update the
      * closed parameter.
      *
      * @returns Returns the invoice object.
      *
      * @param id The ID of the invoice to update
      * @param data Fields to update
      */
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.invoicesNs.IInvoiceUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.invoicesNs.IInvoice]
    ): js.Promise[stripeLib.stripeMod.invoicesNs.IInvoice] = js.native
  }
  
  @js.native
  class Orders () extends js.Object {
    def create(data: stripeLib.stripeMod.ordersNs.IOrderCreationOptions): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    /**
      * Creates a new order object.
      */
    def create(
      data: stripeLib.stripeMod.ordersNs.IOrderCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def create(
      data: stripeLib.stripeMod.ordersNs.IOrderCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.ordersNs.IOrder]
    ): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def create(
      data: stripeLib.stripeMod.ordersNs.IOrderCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.ordersNs.IOrder]
    ): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def list(data: stripeLib.stripeMod.ordersNs.IOrderListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    /**
      * Returns a list of your orders. The orders are returned sorted by creation date, with the most recently created orders appearing first.
      */
    def list(data: stripeLib.stripeMod.ordersNs.IOrderListOptions, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def list(
      data: stripeLib.stripeMod.ordersNs.IOrderListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.ordersNs.IOrder]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def list(
      data: stripeLib.stripeMod.ordersNs.IOrderListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.ordersNs.IOrder]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.ordersNs.IOrder]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.ordersNs.IOrder]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def pay(orderId: java.lang.String, data: stripeLib.stripeMod.ordersNs.IOrderPayOptions): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    /**
      * Pay an order by providing a source to create a payment.
      */
    def pay(
      orderId: java.lang.String,
      data: stripeLib.stripeMod.ordersNs.IOrderPayOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def pay(
      orderId: java.lang.String,
      data: stripeLib.stripeMod.ordersNs.IOrderPayOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.ordersNs.IOrder]
    ): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def pay(
      orderId: java.lang.String,
      data: stripeLib.stripeMod.ordersNs.IOrderPayOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.ordersNs.IOrder]
    ): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def retrieve(orderId: java.lang.String): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def retrieve(orderId: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    /**
      * Retrieves the details of an existing order. Supply the unique order ID from either an order creation request or the order list,
      * and Stripe will return the corresponding order information.
      */
    def retrieve(
      orderId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def retrieve(
      orderId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.ordersNs.IOrder]
    ): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def retrieve(
      orderId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.ordersNs.IOrder]
    ): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def retrieve(orderId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def retrieve(
      orderId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.ordersNs.IOrder]
    ): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def retrieve(
      orderId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.ordersNs.IOrder]
    ): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def update(orderId: java.lang.String, data: stripeLib.stripeMod.ordersNs.IOrderUpdateOptions): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    /**
      * Updates the specific order by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
      * This request accepts only the metadata, and status as arguments.
      */
    def update(
      orderId: java.lang.String,
      data: stripeLib.stripeMod.ordersNs.IOrderUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def update(
      orderId: java.lang.String,
      data: stripeLib.stripeMod.ordersNs.IOrderUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.ordersNs.IOrder]
    ): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
    def update(
      orderId: java.lang.String,
      data: stripeLib.stripeMod.ordersNs.IOrderUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.ordersNs.IOrder]
    ): js.Promise[stripeLib.stripeMod.ordersNs.IOrder] = js.native
  }
  
  @js.native
  class PaymentIntents ()
    extends stripeLib.stripeMod.StripeResource {
    def cancel(paymentIntentId: java.lang.String): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def cancel(paymentIntentId: java.lang.String, data: stripeLib.Anon_Cancellationreason): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    /**
      * A PaymentIntent object can be canceled when it is in one of these statuses: `requires_payment_method`, `requires_capture`, `requires_confirmation`, `requires_action`.
      * Once canceled, no additional charges will be made by the PaymentIntent and any operations on the PaymentIntent will fail with an error. For PaymentIntents with `status='requires_capture'`, the remaining `amount_capturable` will automatically be refunded.
      *
      * @returns Returns a PaymentIntent object if the cancellation succeeded. Returns an error if the PaymentIntent has already been canceled or is not in a cancelable state.
      */
    def cancel(
      paymentIntentId: java.lang.String,
      data: stripeLib.Anon_Cancellationreason,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def cancel(
      paymentIntentId: java.lang.String,
      data: stripeLib.Anon_Cancellationreason,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def cancel(
      paymentIntentId: java.lang.String,
      data: stripeLib.Anon_Cancellationreason,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def cancel(paymentIntentId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def cancel(
      paymentIntentId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def cancel(
      paymentIntentId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def capture(paymentIntentId: java.lang.String): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def capture(
      paymentIntentId: java.lang.String,
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentCaptureOptions
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    /**
      * Capture the funds of an existing uncaptured PaymentIntent where `required_action="requires_capture"`.
      * Uncaptured PaymentIntents will be canceled exactly seven days after they are created.
      *
      * @returns Returns a PaymentIntent object with `status="succeeded"` if the PaymentIntent was capturable. Returns an error if the PaymentIntent was not capturable or an invalid amount to capture was provided.
      */
    def capture(
      paymentIntentId: java.lang.String,
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentCaptureOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def capture(
      paymentIntentId: java.lang.String,
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentCaptureOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def capture(
      paymentIntentId: java.lang.String,
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentCaptureOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def capture(paymentIntentId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def capture(
      paymentIntentId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def capture(
      paymentIntentId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def confirm(paymentIntentId: java.lang.String): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def confirm(
      paymentIntentId: java.lang.String,
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentConfirmOptions
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    /**
      * Confirm that your customer intends to pay with current or provided `source`. Upon confirmation, the PaymentIntent will attempt to initiate a payment.
      *
      * If the selected source requires additional authentication steps, the PaymentIntent will transition to the `requires_action` status and suggest additional actions via `next_source_action`. If payment fails, the PaymentIntent will transition to the `requires_payment_method` status. If payment succeeds, the PaymentIntent will transition to the `succeeded` status (or `requires_capture`, if `capture_method` is set to `manual`).
      *
      * When using a publishable key, the client_secret must be provided to confirm the PaymentIntent.
      */
    def confirm(
      paymentIntentId: java.lang.String,
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentConfirmOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def confirm(
      paymentIntentId: java.lang.String,
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentConfirmOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def confirm(
      paymentIntentId: java.lang.String,
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentConfirmOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def confirm(paymentIntentId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def confirm(
      paymentIntentId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def confirm(
      paymentIntentId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def create(data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentCreationOptions): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    /**
      * Creates a PaymentIntent object.
      */
    def create(
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def create(
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def create(
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def list(data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    /**
      * Returns a list of PaymentIntents.
      *
      * @returns A object with a data property that contains an array of up to limit PaymentIntents, starting after PaymentIntent starting_after. Each entry in the array is a separate PaymentIntent object. If no more PaymentIntents are available, the resulting array will be empty. This request should never throw an error.
      */
    def list(
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def list(
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def list(
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def retrieve(id: java.lang.String, data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentRetrieveOptions): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    /**
      * Retrieves the details of a PaymentIntent that has previously been created.
      * Client-side retrieval using a publishable key is allowed when the client_secret is provided in the query string.
      * When retrieved with a publishable key, only a subset of properties will be returned. Please refer to the payment intent object reference for more details.
      */
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentRetrieveOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentRetrieveOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentRetrieveOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def retrieve(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def retrieve(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def retrieve(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def update(id: java.lang.String, data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentUpdateOptions): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    /**
      * Updates a PaymentIntent object.
      */
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent]
    ): js.Promise[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntent] = js.native
  }
  
  /** https://stripe.com/docs/api/payment_methods */
  @js.native
  class PaymentMethods () extends js.Object {
    def attach(
      paymentMethodId: java.lang.String,
      data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodAttachOptions
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def attach(
      paymentMethodId: java.lang.String,
      data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodAttachOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def attach(
      paymentMethodId: java.lang.String,
      data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodAttachOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod]
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def attach(
      paymentMethodId: java.lang.String,
      data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodAttachOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod]
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def create(data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodCreationOptions): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def create(
      data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def create(
      data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod]
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def create(
      data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod]
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def detach(paymentMethodId: java.lang.String): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def detach(paymentMethodId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def detach(
      paymentMethodId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod]
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def detach(
      paymentMethodId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod]
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def list[T /* <: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodType */](data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodListOptions[T]): stripeLib.stripeMod.IListPromise[
        stdLib.Extract[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod, stripeLib.Anon_Type[T]]
      ] = js.native
    def list[T /* <: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodType */](
      data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodListOptions[T],
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[
        stdLib.Extract[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod, stripeLib.Anon_Type[T]]
      ] = js.native
    def list[T /* <: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodType */](
      data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodListOptions[T],
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod]]
    ): stripeLib.stripeMod.IListPromise[
        stdLib.Extract[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod, stripeLib.Anon_Type[T]]
      ] = js.native
    def list[T /* <: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodType */](
      data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodListOptions[T],
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod]]
    ): stripeLib.stripeMod.IListPromise[
        stdLib.Extract[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod, stripeLib.Anon_Type[T]]
      ] = js.native
    def retrieve(paymentMethodId: java.lang.String): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def retrieve(paymentMethodId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def retrieve(
      paymentMethodId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod]
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def retrieve(
      paymentMethodId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod]
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def update(
      paymentMethodId: java.lang.String,
      data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodUpdateOptions
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def update(
      paymentMethodId: java.lang.String,
      data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def update(
      paymentMethodId: java.lang.String,
      data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod]
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
    def update(
      paymentMethodId: java.lang.String,
      data: stripeLib.stripeMod.paymentMethodsNs.IPaymentMethodUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod]
    ): js.Promise[stripeLib.stripeMod.paymentMethodsNs.IPaymentMethod] = js.native
  }
  
  @js.native
  class Payouts ()
    extends stripeLib.stripeMod.StripeResource {
    def cancel(payoutId: java.lang.String): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    /**
      * A previously created payout can be canceled if it has not yet been paid out. Funds will be refunded to your available balance, and the fees you were originally charged on the payout will be refunded.
      * You may not cancel automatic Stripe payouts.
      */
    def cancel(payoutId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def cancel(
      payoutId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.payoutsNs.IPayout]
    ): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def cancel(
      payoutId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.payoutsNs.IPayout]
    ): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def create(data: stripeLib.stripeMod.payoutsNs.IPayoutCreationOptions): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    /**
      * To send funds to your own bank account, you create a new payout object. Your Stripe balance must be able to cover the payout amount, or you’ll receive an “Insufficient Funds” error.
      *
      * If your API key is in test mode, money won’t actually be sent, though everything else will occur as if in live mode.
      *
      * If you are creating a manual payout on a Stripe account that uses multiple payment source types, you’ll need to specify the source type balance that the payout should draw from.
      * The balance object details available and pending amounts by source type.
      *
      */
    def create(
      data: stripeLib.stripeMod.payoutsNs.IPayoutCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def create(
      data: stripeLib.stripeMod.payoutsNs.IPayoutCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.payoutsNs.IPayout]
    ): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def create(
      data: stripeLib.stripeMod.payoutsNs.IPayoutCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.payoutsNs.IPayout]
    ): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def list(data: stripeLib.stripeMod.payoutsNs.IPayoutListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    /**
      * Returns a list of existing payouts sent to third-party bank accounts or that Stripe has sent you. The payouts are returned in sorted order, with the most recently created payouts appearing first.
      */
    def list(data: stripeLib.stripeMod.payoutsNs.IPayoutListOptions, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def list(
      data: stripeLib.stripeMod.payoutsNs.IPayoutListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.payoutsNs.IPayout]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def list(
      data: stripeLib.stripeMod.payoutsNs.IPayoutListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.payoutsNs.IPayout]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.payoutsNs.IPayout]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.payoutsNs.IPayout]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def retrieve(payoutId: java.lang.String): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    /**
      * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout creation request or the payout list, and Stripe will return the corresponding payout information.
      */
    def retrieve(payoutId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def retrieve(
      payoutId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.payoutsNs.IPayout]
    ): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def retrieve(
      payoutId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.payoutsNs.IPayout]
    ): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def update(payoutId: java.lang.String, data: stripeLib.stripeMod.IDataOptionsWithMetadata): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    /**
      * Updates the specified payout by setting the values of the parameters passed. Any parameters not provided will be left unchanged. This request accepts only the metadata as arguments.
      */
    def update(
      payoutId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptionsWithMetadata,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def update(
      payoutId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptionsWithMetadata,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.payoutsNs.IPayout]
    ): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
    def update(
      payoutId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptionsWithMetadata,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.payoutsNs.IPayout]
    ): js.Promise[stripeLib.stripeMod.payoutsNs.IPayout] = js.native
  }
  
  @js.native
  class Plans ()
    extends stripeLib.stripeMod.StripeResource {
    def create(data: stripeLib.stripeMod.plansNs.IPlanCreationOptions): js.Promise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    /**
      * You can create plans easily via the plan management page of the Stripe dashboard. Plan creation is also
      * accessible via the API if you need to create plans on the fly.
      *
      * @returns The newly created plan
      *
      * @param data Creation options for the new plan.
      */
    def create(data: stripeLib.stripeMod.plansNs.IPlanCreationOptions, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def create(
      data: stripeLib.stripeMod.plansNs.IPlanCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.plansNs.IPlan]
    ): js.Promise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def create(
      data: stripeLib.stripeMod.plansNs.IPlanCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.plansNs.IPlan]
    ): js.Promise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def del(planName: java.lang.String): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    /**
      * You can delete plans via the plan management page of the Stripe dashboard. However, deleting a plan does not affect
      * any current subscribers to the plan; it merely means that new subscribers can't be added to that plan. You can also
      * delete plans via the API.
      *
      * @returns An object with the deleted plan's ID and a deleted flag upon success. Otherwise, this call throws an error, such as if the plan has already been deleted.
      *
      * @param planName The identifier of the plan to be deleted.
      */
    def del(planName: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      planName: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      planName: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def list(data: IPlanListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    /**
      * Returns a list of your plans.
      *
      * @returns An object with a data property that contains an array of up to limit plans, starting after plan starting_after.
      * Each entry in the array is a separate plan object. If no more plans are available, the resulting array will be empty. This
      * request should never throw an error. You can optionally request that the response include the total count of all plans. To
      * do so, specify include[]=total_count in your request.
      */
    def list(data: IPlanListOptions, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def list(
      data: IPlanListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.plansNs.IPlan]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def list(
      data: IPlanListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.plansNs.IPlan]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.plansNs.IPlan]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.plansNs.IPlan]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def retrieve(planName: java.lang.String): js.Promise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    /**
      * Retrieves the plan with the given ID.
      *
      * @returns Returns a plan if a valid plan ID was provided. Throws an error otherwise.
      *
      * @param planName The identifier of the desired plan.
      */
    def retrieve(planName: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def retrieve(
      planName: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.plansNs.IPlan]
    ): js.Promise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def retrieve(
      planName: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.plansNs.IPlan]
    ): js.Promise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def update(planName: java.lang.String, data: stripeLib.stripeMod.plansNs.IPlanUpdateOptions): js.Promise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    /**
      * Updates the name of a plan. Other plan details (price, interval, etc.) are, by design, not editable.
      *
      * @returns The updated plan object is returned upon success. Otherwise, this call throws an error.
      *
      * @param planName The identifier of the plan to update
      * @param data The fields to update
      */
    def update(
      planName: java.lang.String,
      data: stripeLib.stripeMod.plansNs.IPlanUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def update(
      planName: java.lang.String,
      data: stripeLib.stripeMod.plansNs.IPlanUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.plansNs.IPlan]
    ): js.Promise[stripeLib.stripeMod.plansNs.IPlan] = js.native
    def update(
      planName: java.lang.String,
      data: stripeLib.stripeMod.plansNs.IPlanUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.plansNs.IPlan]
    ): js.Promise[stripeLib.stripeMod.plansNs.IPlan] = js.native
  }
  
  @js.native
  class Products () extends js.Object {
    def create(data: stripeLib.stripeMod.productsNs.IProductCreationOptions): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    /**
      * Creates a new product object.
      */
    def create(
      data: stripeLib.stripeMod.productsNs.IProductCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def create(
      data: stripeLib.stripeMod.productsNs.IProductCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.productsNs.IProduct]
    ): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def create(
      data: stripeLib.stripeMod.productsNs.IProductCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.productsNs.IProduct]
    ): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def del(productId: java.lang.String): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    /**
      * Delete a product. Deleting a product is only possible if it has no SKUs associated with it.
      */
    def del(productId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      productId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      productId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def list(data: stripeLib.stripeMod.productsNs.IProductListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    /**
      * Returns a list of your products. The products are returned sorted by creation date, with the most recently created products appearing first.
      */
    def list(
      data: stripeLib.stripeMod.productsNs.IProductListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def list(
      data: stripeLib.stripeMod.productsNs.IProductListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.productsNs.IProduct]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def list(
      data: stripeLib.stripeMod.productsNs.IProductListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.productsNs.IProduct]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.productsNs.IProduct]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.productsNs.IProduct]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def retrieve(productId: java.lang.String): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def retrieve(productId: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    /**
      * Retrieves the details of an existing product. Supply the unique product ID from either a product creation request or the product
      * list, and Stripe will return the corresponding product information.
      */
    def retrieve(
      productId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def retrieve(
      productId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.productsNs.IProduct]
    ): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def retrieve(
      productId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.productsNs.IProduct]
    ): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def retrieve(productId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def retrieve(
      productId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.productsNs.IProduct]
    ): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def retrieve(
      productId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.productsNs.IProduct]
    ): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def update(productId: java.lang.String, data: stripeLib.stripeMod.productsNs.IProductUpdateOptions): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    /**
      * Updates the specific product by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
      *
      * Note that a product's attributes are not editable. Instead, you would need to deactivate the existing product and create a new one
      * with the new attribute values.
      */
    def update(
      productId: java.lang.String,
      data: stripeLib.stripeMod.productsNs.IProductUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def update(
      productId: java.lang.String,
      data: stripeLib.stripeMod.productsNs.IProductUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.productsNs.IProduct]
    ): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
    def update(
      productId: java.lang.String,
      data: stripeLib.stripeMod.productsNs.IProductUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.productsNs.IProduct]
    ): js.Promise[stripeLib.stripeMod.productsNs.IProduct] = js.native
  }
  
  /**
    * @deprecated
    */
  @js.native
  class RecipientCards ()
    extends stripeLib.stripeMod.StripeResource {
    /**
      * @deprecated
      */
    def create(): scala.Unit = js.native
    // options: IDataOptions
    /**
      * @deprecated
      */
    def del(id: java.lang.String): scala.Unit = js.native
    /**
      * @deprecated
      */
    def list(): scala.Unit = js.native
    /**
      * @deprecated
      */
    def retrieve(id: java.lang.String): scala.Unit = js.native
    /**
      * @deprecated
      */
    def update(id: java.lang.String): scala.Unit = js.native
  }
  
  /**
    * @deprecated
    */
  @js.native
  class Recipients ()
    extends stripeLib.stripeMod.StripeResource {
    /**
      * @deprecated
      */
    def create(): scala.Unit = js.native
    // options: IDataOptions
    /**
      * @deprecated
      */
    def del(id: java.lang.String): scala.Unit = js.native
    /**
      * @deprecated
      */
    def list(): scala.Unit = js.native
    /**
      * @deprecated
      */
    def retrieve(id: java.lang.String): scala.Unit = js.native
    /**
      * @deprecated
      */
    def update(id: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class Refunds ()
    extends stripeLib.stripeMod.StripeResource {
    def create(data: stripeLib.stripeMod.refundsNs.IRefundCreationOptionsWithCharge): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    /**
      * When you create a new refund, you must specify a charge to create it on.
      *
      * Creating a new refund will refund a charge that has previously been created but not yet refunded.
      * Funds will be refunded to the credit or debit card that was originally charged.
      * The fees you were originally charged are also refunded.
      *
      * You can optionally refund only part of a charge.
      * You can do so as many times as you wish until the entire charge has been refunded.
      *
      * Once entirely refunded, a charge can't be refunded again.
      * This method will throw an error when called on an already-refunded charge, or when trying to refund more money than is left on a charge.
      */
    def create(
      data: stripeLib.stripeMod.refundsNs.IRefundCreationOptionsWithCharge,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def create(
      data: stripeLib.stripeMod.refundsNs.IRefundCreationOptionsWithCharge,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def create(
      data: stripeLib.stripeMod.refundsNs.IRefundCreationOptionsWithCharge,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def list(data: stripeLib.stripeMod.refundsNs.IRefundListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    /**
      * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted order,
      * with the most recent refunds appearing first.
      * For convenience, the 10 most recent refunds are always available by default on the charge object.
      */
    def list(data: stripeLib.stripeMod.refundsNs.IRefundListOptions, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def list(
      data: stripeLib.stripeMod.refundsNs.IRefundListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.refundsNs.IRefund]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def list(
      data: stripeLib.stripeMod.refundsNs.IRefundListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.refundsNs.IRefund]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.refundsNs.IRefund]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.refundsNs.IRefund]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def retrieve(id: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    /**
      * Retrieves the details of an existing refund.
      */
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def retrieve(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def retrieve(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def retrieve(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def update(id: java.lang.String, data: stripeLib.stripeMod.IDataOptionsWithMetadata): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    /**
      * Updates the specified refund by setting the values of the parameters passed.
      * Any parameters not provided will be left unchanged.
      *
      * This request only accepts metadata as an argument.
      */
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptionsWithMetadata,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptionsWithMetadata,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptionsWithMetadata,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.refundsNs.IRefund]
    ): js.Promise[stripeLib.stripeMod.refundsNs.IRefund] = js.native
  }
  
  @js.native
  class SKUs () extends js.Object {
    def create(data: stripeLib.stripeMod.skusNs.ISkuCreationOptions): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    /**
      * Creates a new SKU associated with a product.
      */
    def create(data: stripeLib.stripeMod.skusNs.ISkuCreationOptions, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def create(
      data: stripeLib.stripeMod.skusNs.ISkuCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.skusNs.ISku]
    ): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def create(
      data: stripeLib.stripeMod.skusNs.ISkuCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.skusNs.ISku]
    ): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def del(skuId: java.lang.String): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    /**
      * Delete a SKU. Deleting a SKU is only possible until it has been used in an order.
      */
    def del(skuId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      skuId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def del(
      skuId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def list(data: stripeLib.stripeMod.skusNs.ISkuListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.skusNs.ISku] = js.native
    /**
      * Returns a list of your SKUs. The SKUs are returned sorted by creation date, with the most recently created SKUs appearing first.
      */
    def list(data: stripeLib.stripeMod.skusNs.ISkuListOptions, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def list(
      data: stripeLib.stripeMod.skusNs.ISkuListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.skusNs.ISku]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def list(
      data: stripeLib.stripeMod.skusNs.ISkuListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.skusNs.ISku]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.skusNs.ISku]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.skusNs.ISku]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def retrieve(skuId: java.lang.String): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def retrieve(skuId: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    /**
      * Retrieves the details of an existing SKU. Supply the unique SKU identifier from either a SKU creation request or from the
      * product, and Stripe will return the corresponding SKU information.
      */
    def retrieve(
      skuId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def retrieve(
      skuId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.skusNs.ISku]
    ): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def retrieve(
      skuId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.skusNs.ISku]
    ): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def retrieve(skuId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def retrieve(
      skuId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.skusNs.ISku]
    ): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def retrieve(
      skuId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.skusNs.ISku]
    ): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def update(skuId: java.lang.String, data: stripeLib.stripeMod.skusNs.ISkuUpdateOptions): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    /**
      * Updates the specific SKU by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
      *
      * Note that a SKU's attributes are not editable. Instead, you would need to deactivate the existing SKU and create a new one with
      * the new attribute values.
      */
    def update(
      skuId: java.lang.String,
      data: stripeLib.stripeMod.skusNs.ISkuUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def update(
      skuId: java.lang.String,
      data: stripeLib.stripeMod.skusNs.ISkuUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.skusNs.ISku]
    ): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
    def update(
      skuId: java.lang.String,
      data: stripeLib.stripeMod.skusNs.ISkuUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.skusNs.ISku]
    ): js.Promise[stripeLib.stripeMod.skusNs.ISku] = js.native
  }
  
  @js.native
  class Sessions ()
    extends stripeLib.stripeMod.StripeResource {
    def create(data: stripeLib.stripeMod.checkoutsNs.sessionsNs.ICheckoutCreationOptions): js.Promise[stripeLib.stripeMod.checkoutsNs.sessionsNs.ICheckoutSession] = js.native
    def create(
      data: stripeLib.stripeMod.checkoutsNs.sessionsNs.ICheckoutCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.checkoutsNs.sessionsNs.ICheckoutSession]
    ): js.Promise[stripeLib.stripeMod.checkoutsNs.sessionsNs.ICheckoutSession] = js.native
    def retrieve(data: java.lang.String): js.Promise[stripeLib.stripeMod.checkoutsNs.sessionsNs.ICheckoutSession] = js.native
    def retrieve(data: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.checkoutsNs.sessionsNs.ICheckoutSession] = js.native
    def retrieve(
      data: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.checkoutsNs.sessionsNs.ICheckoutSession]
    ): js.Promise[stripeLib.stripeMod.checkoutsNs.sessionsNs.ICheckoutSession] = js.native
    def retrieve(
      data: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.checkoutsNs.sessionsNs.ICheckoutSession]
    ): js.Promise[stripeLib.stripeMod.checkoutsNs.sessionsNs.ICheckoutSession] = js.native
  }
  
  @js.native
  class Sources ()
    extends stripeLib.stripeMod.StripeResource {
    def create(data: stripeLib.stripeMod.sourcesNs.ISourceCreationOptions): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    /** Create Source: https://stripe.com/docs/api/sources/create */
    def create(
      data: stripeLib.stripeMod.sourcesNs.ISourceCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def create(
      data: stripeLib.stripeMod.sourcesNs.ISourceCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.sourcesNs.ISource]
    ): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def create(
      data: stripeLib.stripeMod.sourcesNs.ISourceCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.sourcesNs.ISource]
    ): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def retrieve(id: java.lang.String, data: js.UndefOr[scala.Nothing], options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def retrieve(
      id: java.lang.String,
      data: js.UndefOr[scala.Nothing],
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.sourcesNs.ISource]
    ): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def retrieve(id: java.lang.String, data: stripeLib.stripeMod.sourcesNs.ISourceRetrieveOptions): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    /** Retrieve Source: https://stripe.com/docs/api/sources/retrieve */
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.sourcesNs.ISourceRetrieveOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.sourcesNs.ISourceRetrieveOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.sourcesNs.ISource]
    ): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.sourcesNs.ISourceRetrieveOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.sourcesNs.ISource]
    ): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def update(id: java.lang.String, data: stripeLib.stripeMod.sourcesNs.ISourceUpdateOptions): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    /** Update Source: https://stripe.com/docs/api/sources/update */
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.sourcesNs.ISourceUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.sourcesNs.ISourceUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.sourcesNs.ISource]
    ): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.sourcesNs.ISourceUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.sourcesNs.ISource]
    ): js.Promise[stripeLib.stripeMod.sourcesNs.ISource] = js.native
  }
  
  @js.native
  class SubscriptionItems ()
    extends stripeLib.stripeMod.StripeResource {
    def create(data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemCreationOptions): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    /**
      * Adds a new item to an existing subscription. No existing items will be changed or replaced.
      *
      * @returns The created subscription item object is returned if successful. Otherwise, this call throws an error.
      *
      * @param options The options for the new subscription item.
      */
    def create(
      data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def create(
      data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem]
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def create(
      data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem]
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def del(subscriptionItemId: java.lang.String): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def del(
      subscriptionItemId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemDeleteOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
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
      data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemDeleteOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def del(
      subscriptionItemId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemDeleteOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem]
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def del(
      subscriptionItemId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemDeleteOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem]
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def del(subscriptionItemId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def del(
      subscriptionItemId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem]
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def del(
      subscriptionItemId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem]
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def list(data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    /**
      * Returns a list of your subscription items for a given subscription.
      *
      * @returns Returns a list of your subscription items for a given subscription.
      *
      * @param data Filtering options
      */
    def list(
      data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def list(
      data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[
          stripeLib.stripeMod.IList[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem]
        ]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def list(
      data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemListOptions,
      response: stripeLib.stripeMod.IResponseFn[
          stripeLib.stripeMod.IList[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem]
        ]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def retrieve(subscriptionItemId: java.lang.String): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    /**
      * Retrieves the subscription item with the given ID.
      *
      * @returns Returns a subscription item if a valid subscription item ID was provided. Throws an error otherwise.
      *
      * @param subscriptionItemId The identifier of the subscription item to retrieve.
      */
    def retrieve(subscriptionItemId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def retrieve(
      subscriptionItemId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem]
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def retrieve(
      subscriptionItemId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem]
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def update(
      subscriptionItemId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemUpdateOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    /**
      * Updates the plan or quantity of an item on a current subscription.
      *
      * @param subscriptionItemId The identifier of the subscription item to modify.
      * @param data The fields to update
      */
    def update(
      subscriptionItemId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def update(
      subscriptionItemId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem]
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
    def update(
      subscriptionItemId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItemUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem]
    ): js.Promise[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem] = js.native
  }
  
  @js.native
  class Subscriptions () extends SubscriptionsBase {
    def create(data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCreationOptions): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    /**
      * Creates a new subscription on an existing customer.
      *
      * @returns The newly created subscription object if the call succeeded. If the customer has no card or the
      * attempted charge fails, this call throws an error (unless the specified plan is free or has a trial
      * period).
      *
      * @param options The options for the new subscription
      */
    def create(
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def create(
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def create(
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
  }
  
  @js.native
  class SubscriptionsBase ()
    extends stripeLib.stripeMod.StripeResource {
    def del(subscriptionId: java.lang.String): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def del(
      subscriptionId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCancellationOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
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
      * @param subscriptionId The ID of the subscription to cancel.
      * @param data Specify when to cancel the subscription
      */
    def del(
      subscriptionId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCancellationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def del(
      subscriptionId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCancellationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def del(
      subscriptionId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionCancellationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def del(subscriptionId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def del(
      subscriptionId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def del(
      subscriptionId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def deleteDiscount(subscriptionId: java.lang.String): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    /**
      * Removes the currently applied discount on a subscription.
      *
      * @returns An object with a deleted flag set to true upon success. This call throws an error otherwise, such as if no
      * discount exists on this subscription.
      *
      * @param subscriptionId The ID of the subscription.
      */
    def deleteDiscount(subscriptionId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteDiscount(
      subscriptionId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def deleteDiscount(
      subscriptionId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IDeleteConfirmation]
    ): js.Promise[stripeLib.stripeMod.IDeleteConfirmation] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def list(data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    /**
      * You can see a list of the customer's active subscriptions. Note that the 10 most recent active subscriptions are always available
      * by default on the customer object. If you need more than those 10, you can use the limit and starting_after parameters to page
      * through additional subscriptions.
      *
      * @returns Returns a list of the customer's active subscriptions. You can optionally request that the response include the total
      * count of all subscriptions for the customer. To do so, specify include[]=total_count in your request.
      *
      * @param data Filtering options
      */
    def list(
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def list(
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.subscriptionsNs.ISubscription]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def list(
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.subscriptionsNs.ISubscription]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.subscriptionsNs.ISubscription]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.subscriptionsNs.ISubscription]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def retrieve(subscriptionId: java.lang.String): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    /**
      * By default, you can see the 10 most recent active subscriptions stored on a customer directly on the customer
      * object, but you can also retrieve details about a specific active subscription for a customer.
      *
      * @returns Returns the subscription object.
      *
      * @param subscriptionId The ID of the subscription to retrieve
      */
    def retrieve(subscriptionId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def retrieve(
      subscriptionId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def retrieve(
      subscriptionId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def update(
      subscriptionId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionUpdateOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
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
      * @param subscriptionId The ID of the subscription to update.
      * @param data The fields to update
      */
    def update(
      subscriptionId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def update(
      subscriptionId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
    def update(
      subscriptionId: java.lang.String,
      data: stripeLib.stripeMod.subscriptionsNs.ISubscriptionUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.subscriptionsNs.ISubscription]
    ): js.Promise[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.native
  }
  
  @js.native
  class Tokens ()
    extends stripeLib.stripeMod.StripeResource {
    def create(data: stripeLib.stripeMod.tokensNs.IBankAccountTokenCreationOptions): js.Promise[stripeLib.stripeMod.tokensNs.IBankAccountToken] = js.native
    /**
      * Creates a single use token that wraps the details of a bank account. This token can be used
      * in place of a bank account object with any API method. These tokens can only be used once:
      * by attaching them to a recipient or managed account.
      */
    def create(
      data: stripeLib.stripeMod.tokensNs.IBankAccountTokenCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.tokensNs.IBankAccountToken] = js.native
    def create(
      data: stripeLib.stripeMod.tokensNs.IBankAccountTokenCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.tokensNs.IBankAccountToken]
    ): js.Promise[stripeLib.stripeMod.tokensNs.IBankAccountToken] = js.native
    def create(
      data: stripeLib.stripeMod.tokensNs.IBankAccountTokenCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.tokensNs.IBankAccountToken]
    ): js.Promise[stripeLib.stripeMod.tokensNs.IBankAccountToken] = js.native
    def create(data: stripeLib.stripeMod.tokensNs.ICardTokenCreationOptions): js.Promise[stripeLib.stripeMod.tokensNs.ICardToken] = js.native
    /**
      * Creates a single use token that wraps the details of a credit card. This token can be used
      * in place of a credit card object with any API method. These tokens can only be used once:
      * by creating a new charge object, or attaching them to a customer.
      */
    def create(
      data: stripeLib.stripeMod.tokensNs.ICardTokenCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.tokensNs.ICardToken] = js.native
    def create(
      data: stripeLib.stripeMod.tokensNs.ICardTokenCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.tokensNs.ICardToken]
    ): js.Promise[stripeLib.stripeMod.tokensNs.ICardToken] = js.native
    def create(
      data: stripeLib.stripeMod.tokensNs.ICardTokenCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.tokensNs.ICardToken]
    ): js.Promise[stripeLib.stripeMod.tokensNs.ICardToken] = js.native
    def create(data: stripeLib.stripeMod.tokensNs.IPiiTokenCreationOptions): js.Promise[stripeLib.stripeMod.tokensNs.IToken] = js.native
    /**
      * Creates a single use token that wraps the details of personally identifiable information (PII).
      * This token can be used in place of a personal_id_number in the Account Update API method.
      * These tokens can only be used once.
      */
    def create(
      data: stripeLib.stripeMod.tokensNs.IPiiTokenCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.tokensNs.IToken] = js.native
    def create(
      data: stripeLib.stripeMod.tokensNs.IPiiTokenCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.tokensNs.IToken]
    ): js.Promise[stripeLib.stripeMod.tokensNs.IToken] = js.native
    def create(
      data: stripeLib.stripeMod.tokensNs.IPiiTokenCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.tokensNs.IToken]
    ): js.Promise[stripeLib.stripeMod.tokensNs.IToken] = js.native
    def retrieve(tokenId: java.lang.String): js.Promise[stripeLib.stripeMod.tokensNs.IToken] = js.native
    def retrieve(tokenId: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.tokensNs.IToken] = js.native
    /**
      * Retrieves the token with the given ID.
      */
    def retrieve(
      tokenId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.tokensNs.IToken] = js.native
    def retrieve(
      tokenId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.tokensNs.IToken]
    ): js.Promise[stripeLib.stripeMod.tokensNs.IToken] = js.native
    def retrieve(
      tokenId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.tokensNs.IToken]
    ): js.Promise[stripeLib.stripeMod.tokensNs.IToken] = js.native
    def retrieve(tokenId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.tokensNs.IToken] = js.native
    def retrieve(
      tokenId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.tokensNs.IToken]
    ): js.Promise[stripeLib.stripeMod.tokensNs.IToken] = js.native
    def retrieve(
      tokenId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.tokensNs.IToken]
    ): js.Promise[stripeLib.stripeMod.tokensNs.IToken] = js.native
  }
  
  @js.native
  class TransferReversals ()
    extends stripeLib.stripeMod.StripeResource {
    def create(): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    /**
      * When you create a new reversal, you must specify a transfer to create it on.
      *
      * Creating a new reversal on a transfer that has previously been created but not paid out will return the funds to your available balance
      * and refund the fees you were originally charged on the transfer. You may not reverse automatic Stripe transfers.
      *
      * When reversing transfers to Stripe accounts, you can optionally reverse part of the transfer. You can do so as many times as you wish
      * until the entire transfer has been reversed.
      *
      * Once entirely reversed, a transfer can't be reversed again. This method will return an error when called on an already-reversed transfer,
      * or when trying to reverse more money than is left on a transfer.
      */
    def create(
      data: stripeLib.stripeMod.transferReversalsNs.IReversalCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def create(
      data: stripeLib.stripeMod.transferReversalsNs.IReversalCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def create(options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def create(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def create(response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def list(data: stripeLib.stripeMod.IListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    /**
      * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most recent reversals are always available by
      * default on the transfer object. If you need more than those 10, you can use this API method and the limit and starting_after
      * parameters to page through additional reversals.
      */
    def list(data: stripeLib.stripeMod.IListOptions, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def list(
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.transferReversalsNs.IReversal]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def list(
      data: stripeLib.stripeMod.IListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.transferReversalsNs.IReversal]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.transferReversalsNs.IReversal]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.transferReversalsNs.IReversal]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def retrieve(reversalId: java.lang.String): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def retrieve(reversalId: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    /**
      * By default, you can see the 10 most recent reversals stored directly on the transfer object, but you can also retrieve details about a
      * specific reversal stored on the transfer.
      */
    def retrieve(
      reversalId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def retrieve(
      reversalId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def retrieve(
      reversalId: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def retrieve(reversalId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def retrieve(
      reversalId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def retrieve(
      reversalId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def update(reversalId: java.lang.String, data: stripeLib.stripeMod.transferReversalsNs.IReversalUpdateOptions): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    /**
      * Updates the specified reversal by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
      *
      * This request only accepts metadata and description as arguments.
      */
    def update(
      reversalId: java.lang.String,
      data: stripeLib.stripeMod.transferReversalsNs.IReversalUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def update(
      reversalId: java.lang.String,
      data: stripeLib.stripeMod.transferReversalsNs.IReversalUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def update(
      reversalId: java.lang.String,
      data: stripeLib.stripeMod.transferReversalsNs.IReversalUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
  }
  
  @js.native
  class Transfers ()
    extends stripeLib.stripeMod.StripeResource {
    def cancel(id: java.lang.String): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def cancel(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def cancel(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transfersNs.ITransfer]
    ): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def cancel(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transfersNs.ITransfer]
    ): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def create(data: stripeLib.stripeMod.transfersNs.ITransferCreationOptions): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    /**
      * To send funds from your Stripe account to a third-party recipient or to your own bank account, you create a new transfer
      * object. Your Stripe balance must be able to cover the transfer amount, or you'll receive an "Insufficient Funds" error.
      *
      * If your API key is in test mode, money won't actually be sent, though everything else will occur as if in live mode.
      *
      * If you are creating a manual transfer or a special case transfer on a Stripe account that uses multiple payment source
      * types, you'll need to specify the source type balance that the transfer should draw from. The balance object details
      * available and pending amounts by source type.
      */
    def create(
      data: stripeLib.stripeMod.transfersNs.ITransferCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def create(
      data: stripeLib.stripeMod.transfersNs.ITransferCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transfersNs.ITransfer]
    ): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def create(
      data: stripeLib.stripeMod.transfersNs.ITransferCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transfersNs.ITransfer]
    ): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def createReversal(transferId: java.lang.String): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    /**
      * When you create a new reversal, you must specify a transfer to create it on.
      *
      * Creating a new reversal on a transfer that has previously been created but not paid out will return the funds to your available balance
      * and refund the fees you were originally charged on the transfer. You may not reverse automatic Stripe transfers.
      *
      * When reversing transfers to Stripe accounts, you can optionally reverse part of the transfer. You can do so as many times as you wish
      * until the entire transfer has been reversed.
      *
      * Once entirely reversed, a transfer can't be reversed again. This method will return an error when called on an already-reversed transfer,
      * or when trying to reverse more money than is left on a transfer.
      */
    def createReversal(
      transferId: java.lang.String,
      data: stripeLib.stripeMod.transferReversalsNs.IReversalCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def createReversal(
      transferId: java.lang.String,
      data: stripeLib.stripeMod.transferReversalsNs.IReversalCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def createReversal(transferId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def createReversal(
      transferId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def createReversal(
      transferId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
     // TODO: Implement placeholder method
    def getMetadata(): scala.Unit = js.native
    def list(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def list(data: stripeLib.stripeMod.transfersNs.ITransferListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    /**
      * Returns a list of existing transfers sent to third-party bank accounts or that Stripe has sent you. The transfers are
      * returned in sorted order, with the most recently created transfers appearing first.
      */
    def list(
      data: stripeLib.stripeMod.transfersNs.ITransferListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def list(
      data: stripeLib.stripeMod.transfersNs.ITransferListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.transfersNs.ITransfer]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def list(
      data: stripeLib.stripeMod.transfersNs.ITransferListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.transfersNs.ITransfer]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def list(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def list(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.transfersNs.ITransfer]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def list(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.transfersNs.ITransfer]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def listReversals(transferId: java.lang.String): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def listReversals(transferId: java.lang.String, data: stripeLib.stripeMod.IListOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    /**
      * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most recent reversals are always available by
      * default on the transfer object. If you need more than those 10, you can use this API method and the limit and starting_after
      * parameters to page through additional reversals.
      */
    def listReversals(
      transferId: java.lang.String,
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def listReversals(
      transferId: java.lang.String,
      data: stripeLib.stripeMod.IListOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.transferReversalsNs.IReversal]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def listReversals(
      transferId: java.lang.String,
      data: stripeLib.stripeMod.IListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.transferReversalsNs.IReversal]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def listReversals(transferId: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def listReversals(
      transferId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.transferReversalsNs.IReversal]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def listReversals(
      transferId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.transferReversalsNs.IReversal]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
     // TODO: Not sure if this should be a list of balance transactions or charges.
    def listTransactions(): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def listTransactions(options: stripeLib.stripeMod.HeaderOptions): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def listTransactions(
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.chargesNs.ICharge]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def listTransactions(
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.IList[stripeLib.stripeMod.chargesNs.ICharge]]
    ): stripeLib.stripeMod.IListPromise[stripeLib.stripeMod.chargesNs.ICharge] = js.native
    def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def retrieve(id: java.lang.String, data: stripeLib.stripeMod.IDataOptions): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    /**
      * Retrieves the details of an existing transfer. Supply the unique transfer ID from either a transfer creation request or
      * the transfer list, and Stripe will return the corresponding transfer information.
      */
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transfersNs.ITransfer]
    ): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def retrieve(
      id: java.lang.String,
      data: stripeLib.stripeMod.IDataOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transfersNs.ITransfer]
    ): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def retrieve(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def retrieve(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transfersNs.ITransfer]
    ): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def retrieve(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transfersNs.ITransfer]
    ): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def retrieveReversal(transferId: java.lang.String, reversalId: java.lang.String): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    /**
      * By default, you can see the 10 most recent reversals stored directly on the transfer object, but you can also retrieve details about a
      * specific reversal stored on the transfer.
      */
    def retrieveReversal(
      transferId: java.lang.String,
      reversalId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def retrieveReversal(
      transferId: java.lang.String,
      reversalId: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def retrieveReversal(
      transferId: java.lang.String,
      reversalId: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def reverse(id: java.lang.String): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
     // TODO: Not sure if this should be a list of balance transactions or charges.
    /**
      * When you create a new reversal, you must specify a transfer to create it on.
      *
      * Creating a new reversal on a transfer that has previously been created but not paid out will return the funds to your available balance
      * and refund the fees you were originally charged on the transfer. You may not reverse automatic Stripe transfers.
      *
      * When reversing transfers to Stripe accounts, you can optionally reverse part of the transfer. You can do so as many times as you wish
      * until the entire transfer has been reversed.
      *
      * Once entirely reversed, a transfer can't be reversed again. This method will return an error when called on an already-reversed transfer,
      * or when trying to reverse more money than is left on a transfer.
      */
    def reverse(
      id: java.lang.String,
      data: stripeLib.stripeMod.transferReversalsNs.IReversalCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def reverse(
      id: java.lang.String,
      data: stripeLib.stripeMod.transferReversalsNs.IReversalCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def reverse(id: java.lang.String, options: stripeLib.stripeMod.HeaderOptions): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def reverse(
      id: java.lang.String,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def reverse(
      id: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def setMetadata(): scala.Unit = js.native
    def update(id: java.lang.String, data: stripeLib.stripeMod.transfersNs.ITransferUpdateOptions): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    /**
      * Updates the specified transfer by setting the values of the parameters passed. Any parameters not provided will be left
      * unchanged.
      *
      * This request accepts only the description and metadata as arguments.
      */
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.transfersNs.ITransferUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.transfersNs.ITransferUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transfersNs.ITransfer]
    ): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def update(
      id: java.lang.String,
      data: stripeLib.stripeMod.transfersNs.ITransferUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transfersNs.ITransfer]
    ): js.Promise[stripeLib.stripeMod.transfersNs.ITransfer] = js.native
    def updateReversal(
      transferId: java.lang.String,
      reversalId: java.lang.String,
      data: stripeLib.stripeMod.transferReversalsNs.IReversalUpdateOptions
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    /**
      * Updates the specified reversal by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
      *
      * This request only accepts metadata and description as arguments.
      */
    def updateReversal(
      transferId: java.lang.String,
      reversalId: java.lang.String,
      data: stripeLib.stripeMod.transferReversalsNs.IReversalUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def updateReversal(
      transferId: java.lang.String,
      reversalId: java.lang.String,
      data: stripeLib.stripeMod.transferReversalsNs.IReversalUpdateOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
    def updateReversal(
      transferId: java.lang.String,
      reversalId: java.lang.String,
      data: stripeLib.stripeMod.transferReversalsNs.IReversalUpdateOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.transferReversalsNs.IReversal]
    ): js.Promise[stripeLib.stripeMod.transferReversalsNs.IReversal] = js.native
  }
  
  @js.native
  class UsageRecordSummaries ()
    extends stripeLib.stripeMod.StripeResource {
    def list(subscriptionItem: java.lang.String): js.Promise[stripeLib.stripeMod.usageRecordSummariesNs.IUsageRecordSummaries] = js.native
    /**
      * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
      */
    def list(subscriptionItem: java.lang.String, options: stripeLib.stripeMod.IListOptions): js.Promise[stripeLib.stripeMod.usageRecordSummariesNs.IUsageRecordSummaries] = js.native
    def list(
      subscriptionItem: java.lang.String,
      options: stripeLib.stripeMod.IListOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.usageRecordSummariesNs.IUsageRecordSummaries]
    ): js.Promise[stripeLib.stripeMod.usageRecordSummariesNs.IUsageRecordSummaries] = js.native
    def list(
      subscriptionItem: java.lang.String,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.usageRecordSummariesNs.IUsageRecordSummaries]
    ): js.Promise[stripeLib.stripeMod.usageRecordSummariesNs.IUsageRecordSummaries] = js.native
  }
  
  @js.native
  class UsageRecords ()
    extends stripeLib.stripeMod.StripeResource {
    def create(
      subscription: java.lang.String,
      data: stripeLib.stripeMod.usageRecordsNs.IUsageRecordCreationOptions
    ): js.Promise[stripeLib.stripeMod.usageRecordsNs.IUsageRecord] = js.native
    /**
      * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
      */
    def create(
      subscription: java.lang.String,
      data: stripeLib.stripeMod.usageRecordsNs.IUsageRecordCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions
    ): js.Promise[stripeLib.stripeMod.usageRecordsNs.IUsageRecord] = js.native
    def create(
      subscription: java.lang.String,
      data: stripeLib.stripeMod.usageRecordsNs.IUsageRecordCreationOptions,
      options: stripeLib.stripeMod.HeaderOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.usageRecordsNs.IUsageRecord]
    ): js.Promise[stripeLib.stripeMod.usageRecordsNs.IUsageRecord] = js.native
    def create(
      subscription: java.lang.String,
      data: stripeLib.stripeMod.usageRecordsNs.IUsageRecordCreationOptions,
      response: stripeLib.stripeMod.IResponseFn[stripeLib.stripeMod.usageRecordsNs.IUsageRecord]
    ): js.Promise[stripeLib.stripeMod.usageRecordsNs.IUsageRecord] = js.native
  }
  
  @js.native
  class WebHooks () extends js.Object {
    def constructEvent(requestBody: js.Any, signature: java.lang.String, endpointSecret: java.lang.String): stripeLib.stripeMod.eventsNs.IEvent = js.native
    def constructEvent(
      requestBody: js.Any,
      signature: java.lang.String,
      endpointSecret: java.lang.String,
      tolerance: scala.Double
    ): stripeLib.stripeMod.eventsNs.IEvent = js.native
    def constructEvent(requestBody: js.Any, signature: js.Array[java.lang.String], endpointSecret: java.lang.String): stripeLib.stripeMod.eventsNs.IEvent = js.native
    def constructEvent(
      requestBody: js.Any,
      signature: js.Array[java.lang.String],
      endpointSecret: java.lang.String,
      tolerance: scala.Double
    ): stripeLib.stripeMod.eventsNs.IEvent = js.native
  }
  
}

