package typings.stripe.stripeMod

import typings.std.Extract
import typings.stripe.Anon_Cancellationreason
import typings.stripe.Anon_CancellationreasonSetupIntentCancelationReason
import typings.stripe.Anon_CardICardSourceCreationOptionsExtended
import typings.stripe.Anon_Metadata
import typings.stripe.Anon_Type
import typings.stripe.stripeMod.accountsNs.IAccount
import typings.stripe.stripeMod.accountsNs.IAccountCreationOptions
import typings.stripe.stripeMod.accountsNs.IAccountUpdateOptions
import typings.stripe.stripeMod.accountsNs.IBankAccountListOptions
import typings.stripe.stripeMod.accountsNs.ICardListOptions
import typings.stripe.stripeMod.accountsNs.IExternalAccountCreationOptions
import typings.stripe.stripeMod.accountsNs.IExternalAccountUpdateOptions
import typings.stripe.stripeMod.accountsNs.ILoginLink
import typings.stripe.stripeMod.accountsNs.IRejectReason
import typings.stripe.stripeMod.applicationFeesNs.IApplicationFee
import typings.stripe.stripeMod.applicationFeesNs.IApplicationFeeListOptions
import typings.stripe.stripeMod.applicationFeesNs.IApplicationFeeRefund
import typings.stripe.stripeMod.applicationFeesNs.IApplicationFeeRefundCreationOptions
import typings.stripe.stripeMod.balanceNs.IBalance
import typings.stripe.stripeMod.balanceNs.IBalanceListOptions
import typings.stripe.stripeMod.balanceNs.IBalanceTransaction
import typings.stripe.stripeMod.bankAccountsNs.IBankAccountUpdateOptions
import typings.stripe.stripeMod.bankAccountsNs.IBankAccountVerifyOptions
import typings.stripe.stripeMod.bitcoinReceiversNs.IBitcoinReceiver
import typings.stripe.stripeMod.bitcoinReceiversNs.IBitcoinReceiverCreationOptions
import typings.stripe.stripeMod.bitcoinReceiversNs.IBitcoinReceiverListOptions
import typings.stripe.stripeMod.cardsNs.ICardUpdateOptions
import typings.stripe.stripeMod.chargesNs.ICharge
import typings.stripe.stripeMod.chargesNs.IChargeCaptureOptions
import typings.stripe.stripeMod.chargesNs.IChargeCreationOptions
import typings.stripe.stripeMod.chargesNs.IChargeListOptions
import typings.stripe.stripeMod.chargesNs.IChargeUpdateOptions
import typings.stripe.stripeMod.checkoutsNs.sessionsNs.ICheckoutCreationOptions
import typings.stripe.stripeMod.checkoutsNs.sessionsNs.ICheckoutSession
import typings.stripe.stripeMod.countrySpecsNs.ICountrySpec
import typings.stripe.stripeMod.couponsNs.ICoupon
import typings.stripe.stripeMod.couponsNs.ICouponCreationOptions
import typings.stripe.stripeMod.creditNotesNs.ICreditNote
import typings.stripe.stripeMod.creditNotesNs.ICreditNoteCreationOptions
import typings.stripe.stripeMod.creditNotesNs.ICreditNoteListOptions
import typings.stripe.stripeMod.creditNotesNs.ICreditNoteUpdateOptions
import typings.stripe.stripeMod.customersNs.IBankAccountSourceListOptions
import typings.stripe.stripeMod.customersNs.ICardSourceListOptions
import typings.stripe.stripeMod.customersNs.ICustomer
import typings.stripe.stripeMod.customersNs.ICustomerCardSourceCreationOptions
import typings.stripe.stripeMod.customersNs.ICustomerCreationOptions
import typings.stripe.stripeMod.customersNs.ICustomerListOptions
import typings.stripe.stripeMod.customersNs.ICustomerSourceCreationOptions
import typings.stripe.stripeMod.customersNs.ICustomerUpdateOptions
import typings.stripe.stripeMod.customersNs.ISourceListOptions
import typings.stripe.stripeMod.disputesNs.IDispute
import typings.stripe.stripeMod.disputesNs.IDisputeUpdateOptions
import typings.stripe.stripeMod.ephemeralKeysNs.IEphemeralKey
import typings.stripe.stripeMod.ephemeralKeysNs.IStripeVersion
import typings.stripe.stripeMod.eventsNs.IEvent
import typings.stripe.stripeMod.eventsNs.IEventListOptions
import typings.stripe.stripeMod.fileUploadsNs.IFileUpdate
import typings.stripe.stripeMod.fileUploadsNs.IFileUploadCreationOptions
import typings.stripe.stripeMod.fileUploadsNs.IFileUploadListOptions
import typings.stripe.stripeMod.invoiceItemsNs.InvoiceItem
import typings.stripe.stripeMod.invoiceItemsNs.InvoiceItemCreationOptions
import typings.stripe.stripeMod.invoiceItemsNs.InvoiceItemListOptions
import typings.stripe.stripeMod.invoiceItemsNs.InvoiceItemUpdateOptions
import typings.stripe.stripeMod.invoicesNs.IInvoice
import typings.stripe.stripeMod.invoicesNs.IInvoiceCreationOptions
import typings.stripe.stripeMod.invoicesNs.IInvoiceFinalizeOptions
import typings.stripe.stripeMod.invoicesNs.IInvoiceLineItem
import typings.stripe.stripeMod.invoicesNs.IInvoiceLineItemRetrievalOptions
import typings.stripe.stripeMod.invoicesNs.IInvoiceListLineItemsOptions
import typings.stripe.stripeMod.invoicesNs.IInvoiceListOptions
import typings.stripe.stripeMod.invoicesNs.IInvoiceListUpcomingLineItemsOptions
import typings.stripe.stripeMod.invoicesNs.IInvoicePayOptions
import typings.stripe.stripeMod.invoicesNs.IInvoiceUpcomingOptions
import typings.stripe.stripeMod.invoicesNs.IInvoiceUpdateOptions
import typings.stripe.stripeMod.ordersNs.IOrder
import typings.stripe.stripeMod.ordersNs.IOrderCreationOptions
import typings.stripe.stripeMod.ordersNs.IOrderListOptions
import typings.stripe.stripeMod.ordersNs.IOrderPayOptions
import typings.stripe.stripeMod.ordersNs.IOrderUpdateOptions
import typings.stripe.stripeMod.paymentIntentsNs.IPaymentIntent
import typings.stripe.stripeMod.paymentIntentsNs.IPaymentIntentCaptureOptions
import typings.stripe.stripeMod.paymentIntentsNs.IPaymentIntentConfirmOptions
import typings.stripe.stripeMod.paymentIntentsNs.IPaymentIntentCreationOptions
import typings.stripe.stripeMod.paymentIntentsNs.IPaymentIntentListOptions
import typings.stripe.stripeMod.paymentIntentsNs.IPaymentIntentRetrieveOptions
import typings.stripe.stripeMod.paymentIntentsNs.IPaymentIntentUpdateOptions
import typings.stripe.stripeMod.paymentMethodsNs.IPaymentMethod
import typings.stripe.stripeMod.paymentMethodsNs.IPaymentMethodAttachOptions
import typings.stripe.stripeMod.paymentMethodsNs.IPaymentMethodCreationOptions
import typings.stripe.stripeMod.paymentMethodsNs.IPaymentMethodListOptions
import typings.stripe.stripeMod.paymentMethodsNs.IPaymentMethodType
import typings.stripe.stripeMod.paymentMethodsNs.IPaymentMethodUpdateOptions
import typings.stripe.stripeMod.payoutsNs.IPayout
import typings.stripe.stripeMod.payoutsNs.IPayoutCreationOptions
import typings.stripe.stripeMod.payoutsNs.IPayoutListOptions
import typings.stripe.stripeMod.plansNs.IPlan
import typings.stripe.stripeMod.plansNs.IPlanCreationOptions
import typings.stripe.stripeMod.plansNs.IPlanUpdateOptions
import typings.stripe.stripeMod.productsNs.IProduct
import typings.stripe.stripeMod.productsNs.IProductCreationOptions
import typings.stripe.stripeMod.productsNs.IProductListOptions
import typings.stripe.stripeMod.productsNs.IProductUpdateOptions
import typings.stripe.stripeMod.refundsNs.IRefund
import typings.stripe.stripeMod.refundsNs.IRefundCreationOptions
import typings.stripe.stripeMod.refundsNs.IRefundCreationOptionsWithCharge
import typings.stripe.stripeMod.refundsNs.IRefundListOptions
import typings.stripe.stripeMod.resourcesNs.IPlanListOptions
import typings.stripe.stripeMod.resourcesNs.Sessions
import typings.stripe.stripeMod.resourcesNs.SubscriptionsBase
import typings.stripe.stripeMod.setupIntentsNs.ISetupIntent
import typings.stripe.stripeMod.setupIntentsNs.ISetupIntentConfirmOptions
import typings.stripe.stripeMod.setupIntentsNs.ISetupIntentCreationOptions
import typings.stripe.stripeMod.setupIntentsNs.ISetupIntentListOptions
import typings.stripe.stripeMod.setupIntentsNs.ISetupIntentRetrieveOptions
import typings.stripe.stripeMod.setupIntentsNs.ISetupIntentUpdateOptions
import typings.stripe.stripeMod.skusNs.ISku
import typings.stripe.stripeMod.skusNs.ISkuCreationOptions
import typings.stripe.stripeMod.skusNs.ISkuListOptions
import typings.stripe.stripeMod.skusNs.ISkuUpdateOptions
import typings.stripe.stripeMod.sourcesNs.ISourceCreationOptions
import typings.stripe.stripeMod.sourcesNs.ISourceRetrieveOptions
import typings.stripe.stripeMod.sourcesNs.ISourceUpdateOptions
import typings.stripe.stripeMod.subscriptionItemsNs.ISubscriptionItem
import typings.stripe.stripeMod.subscriptionItemsNs.ISubscriptionItemCreationOptions
import typings.stripe.stripeMod.subscriptionItemsNs.ISubscriptionItemDeleteOptions
import typings.stripe.stripeMod.subscriptionItemsNs.ISubscriptionItemListOptions
import typings.stripe.stripeMod.subscriptionItemsNs.ISubscriptionItemUpdateOptions
import typings.stripe.stripeMod.subscriptionsNs.ISubscription
import typings.stripe.stripeMod.subscriptionsNs.ISubscriptionCancellationOptions
import typings.stripe.stripeMod.subscriptionsNs.ISubscriptionCreationOptions
import typings.stripe.stripeMod.subscriptionsNs.ISubscriptionCustCreationOptions
import typings.stripe.stripeMod.subscriptionsNs.ISubscriptionListOptions
import typings.stripe.stripeMod.subscriptionsNs.ISubscriptionUpdateOptions
import typings.stripe.stripeMod.tokensNs.IBankAccountToken
import typings.stripe.stripeMod.tokensNs.IBankAccountTokenCreationOptions
import typings.stripe.stripeMod.tokensNs.ICardToken
import typings.stripe.stripeMod.tokensNs.ICardTokenCreationOptions
import typings.stripe.stripeMod.tokensNs.IPiiTokenCreationOptions
import typings.stripe.stripeMod.tokensNs.IToken
import typings.stripe.stripeMod.transferReversalsNs.IReversal
import typings.stripe.stripeMod.transferReversalsNs.IReversalCreationOptions
import typings.stripe.stripeMod.transferReversalsNs.IReversalUpdateOptions
import typings.stripe.stripeMod.transfersNs.ITransfer
import typings.stripe.stripeMod.transfersNs.ITransferCreationOptions
import typings.stripe.stripeMod.transfersNs.ITransferListOptions
import typings.stripe.stripeMod.transfersNs.ITransferUpdateOptions
import typings.stripe.stripeMod.usageRecordSummariesNs.IUsageRecordSummaries
import typings.stripe.stripeMod.usageRecordsNs.IUsageRecord
import typings.stripe.stripeMod.usageRecordsNs.IUsageRecordCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources")
@js.native
object resourcesNs extends js.Object {
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
        typings.stripe.stripeMod.cardsNs.ICard | typings.stripe.stripeMod.bankAccountsNs.IBankAccount
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
        typings.stripe.stripeMod.cardsNs.ICard | typings.stripe.stripeMod.bankAccountsNs.IBankAccount
      ] = js.native
    def createExternalAccount(
      accId: String,
      data: IExternalAccountCreationOptions,
      options: HeaderOptions,
      response: IResponseFn[
          typings.stripe.stripeMod.cardsNs.ICard | typings.stripe.stripeMod.bankAccountsNs.IBankAccount
        ]
    ): js.Promise[
        typings.stripe.stripeMod.cardsNs.ICard | typings.stripe.stripeMod.bankAccountsNs.IBankAccount
      ] = js.native
    def createExternalAccount(
      accId: String,
      data: IExternalAccountCreationOptions,
      response: IResponseFn[
          typings.stripe.stripeMod.cardsNs.ICard | typings.stripe.stripeMod.bankAccountsNs.IBankAccount
        ]
    ): js.Promise[
        typings.stripe.stripeMod.cardsNs.ICard | typings.stripe.stripeMod.bankAccountsNs.IBankAccount
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
    def listExternalAccounts(accId: String, data: IBankAccountListOptions): IListPromise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    /**
      * You can see a list of the bank accounts belonging to a managed account. Note that the 10 most recent external accounts are always
      * available by default on the corresponding Stripe object. If you need more than those 10, you can use this API method and the limit
      * and starting_after parameters to page through additional bank accounts.
      */
    def listExternalAccounts(accId: String, data: IBankAccountListOptions, options: HeaderOptions): IListPromise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def listExternalAccounts(
      accId: String,
      data: IBankAccountListOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[typings.stripe.stripeMod.bankAccountsNs.IBankAccount]]
    ): IListPromise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def listExternalAccounts(
      accId: String,
      data: IBankAccountListOptions,
      response: IResponseFn[IList[typings.stripe.stripeMod.bankAccountsNs.IBankAccount]]
    ): IListPromise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def listExternalAccounts(accId: String, data: ICardListOptions): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    /**
      * You can see a list of the cards belonging to a managed account. Note that the 10 most recent external accounts are available on the
      * account object. If you need more than those 10, you can use this API method and the limit and starting_after parameters to page
      * through additional cards.
      */
    def listExternalAccounts(accId: String, data: ICardListOptions, options: HeaderOptions): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def listExternalAccounts(
      accId: String,
      data: ICardListOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[typings.stripe.stripeMod.cardsNs.ICard]]
    ): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def listExternalAccounts(
      accId: String,
      data: ICardListOptions,
      response: IResponseFn[IList[typings.stripe.stripeMod.cardsNs.ICard]]
    ): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
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
    def retrieveCard(accId: String, cardId: String): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    /**
      * You can always see the 10 most recent cards directly on a managed account; this method lets you retrieve details about a specific
      * card stored on the account.
      */
    def retrieveCard(accId: String, cardId: String, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def retrieveCard(
      accId: String,
      cardId: String,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def retrieveCard(accId: String, cardId: String, response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def retrieveExternalAccount(accId: String, bankAccId: String): js.Promise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    /**
      * By default, you can see the 10 most recent bank accounts stored on a managed account directly on the object, but you can also
      * retrieve details about a specific bank account stored on the Stripe account.
      */
    def retrieveExternalAccount(accId: String, bankAccId: String, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def retrieveExternalAccount(
      accId: String,
      bankAccId: String,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.bankAccountsNs.IBankAccount]
    ): js.Promise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def retrieveExternalAccount(
      accId: String,
      bankAccId: String,
      response: IResponseFn[typings.stripe.stripeMod.bankAccountsNs.IBankAccount]
    ): js.Promise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
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
    def updateExternalAccount(accId: String, bankAccId: String, data: IExternalAccountUpdateOptions): js.Promise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    /**
      * Updates the metadata of a bank account belonging to a managed account, and optionally sets it as the default for its currency.
      * Other bank account details are not editable by design.
      */
    def updateExternalAccount(accId: String, bankAccId: String, data: IExternalAccountUpdateOptions, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def updateExternalAccount(
      accId: String,
      bankAccId: String,
      data: IExternalAccountUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.bankAccountsNs.IBankAccount]
    ): js.Promise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def updateExternalAccount(
      accId: String,
      bankAccId: String,
      data: IExternalAccountUpdateOptions,
      response: IResponseFn[typings.stripe.stripeMod.bankAccountsNs.IBankAccount]
    ): js.Promise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def updateExternalAccount(accId: String, cardId: String, data: ICardUpdateOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    /**
      * If you need to update only some card details, like the billing address or expiration date, you can do so without having to re-enter the
      * full card details. Stripe also works directly with card networks so that your customers can continue using your service without
      * interruption.
      *
      * When you update a card, Stripe will automatically validate the card.
      */
    def updateExternalAccount(accId: String, cardId: String, data: ICardUpdateOptions, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def updateExternalAccount(
      accId: String,
      cardId: String,
      data: ICardUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def updateExternalAccount(
      accId: String,
      cardId: String,
      data: ICardUpdateOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
  }
  
  @js.native
  class ApplicationFeeRefunds () extends StripeResource {
    def create(): js.Promise[IApplicationFeeRefund] = js.native
    def create(data: IApplicationFeeRefundCreationOptions): js.Promise[IApplicationFeeRefund] = js.native
    /**
      * Refunds an application fee that has previously been collected but not yet refunded. Funds will be refunded to the Stripe account that
      * the fee was originally collected from.
      *
      * You can optionally refund only part of an application fee. You can do so as many times as you wish until the entire fee has been refunded.
      *
      * Once entirely refunded, an application fee can't be refunded again. This method will throw an error when called on an already-refunded
      * application fee, or when trying to refund more money than is left on an application fee.
      */
    def create(data: IApplicationFeeRefundCreationOptions, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
    def create(
      data: IApplicationFeeRefundCreationOptions,
      options: HeaderOptions,
      response: IResponseFn[IApplicationFeeRefund]
    ): js.Promise[IApplicationFeeRefund] = js.native
    def create(data: IApplicationFeeRefundCreationOptions, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
    def create(options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
    def create(options: HeaderOptions, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
    def create(response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
    def list(): IListPromise[IApplicationFeeRefund] = js.native
    def list(data: IListOptions): IListPromise[IApplicationFeeRefund] = js.native
    /**
      * You can see a list of the refunds belonging to a specific application fee. Note that the 10 most recent refunds are always available
      * by default on the application fee object. If you need more than those 10, you can use this API method and the limit and starting_after
      * parameters to page through additional refunds.
      */
    def list(data: IListOptions, options: HeaderOptions): IListPromise[IApplicationFeeRefund] = js.native
    def list(data: IListOptions, options: HeaderOptions, response: IResponseFn[IList[IApplicationFeeRefund]]): IListPromise[IApplicationFeeRefund] = js.native
    def list(data: IListOptions, response: IResponseFn[IList[IApplicationFeeRefund]]): IListPromise[IApplicationFeeRefund] = js.native
    def list(options: HeaderOptions): IListPromise[IApplicationFeeRefund] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[IApplicationFeeRefund]]): IListPromise[IApplicationFeeRefund] = js.native
    def list(response: IResponseFn[IList[IApplicationFeeRefund]]): IListPromise[IApplicationFeeRefund] = js.native
    def retrieve(refundId: String): js.Promise[IApplicationFeeRefund] = js.native
    /**
      * By default, you can see the 10 most recent refunds stored directly on the application fee object, but you can also retrieve details
      * about a specific refund stored on the application fee.
      */
    def retrieve(refundId: String, data: IDataOptions, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
    def retrieve(
      refundId: String,
      data: IDataOptions,
      options: HeaderOptions,
      response: IResponseFn[IApplicationFeeRefund]
    ): js.Promise[IApplicationFeeRefund] = js.native
    def retrieve(refundId: String, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
    def retrieve(refundId: String, options: HeaderOptions, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
    def retrieve(refundId: String, options: IDataOptions): js.Promise[IApplicationFeeRefund] = js.native
    def retrieve(refundId: String, options: IDataOptions, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
    def retrieve(refundId: String, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
    def update(refundId: String, data: Anon_Metadata): js.Promise[IApplicationFeeRefund] = js.native
    /**
      * Updates the specified application fee refund by setting the values of the parameters passed. Any parameters not provided will be left
      * unchanged.
      *
      * This request only accepts metadata as an argument.
      */
    def update(refundId: String, data: Anon_Metadata, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
    def update(
      refundId: String,
      data: Anon_Metadata,
      options: HeaderOptions,
      response: IResponseFn[IApplicationFeeRefund]
    ): js.Promise[IApplicationFeeRefund] = js.native
    def update(refundId: String, data: Anon_Metadata, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
  }
  
  @js.native
  class ApplicationFees () extends StripeResource {
    def createRefund(feeId: String): js.Promise[IApplicationFeeRefund] = js.native
    def createRefund(feeId: String, data: IApplicationFeeRefundCreationOptions): js.Promise[IApplicationFeeRefund] = js.native
    /**
      * Refunds an application fee that has previously been collected but not yet refunded. Funds will be refunded to the Stripe account that
      * the fee was originally collected from.
      *
      * You can optionally refund only part of an application fee. You can do so as many times as you wish until the entire fee has been refunded.
      *
      * Once entirely refunded, an application fee can't be refunded again. This method will throw an error when called on an already-refunded
      * application fee, or when trying to refund more money than is left on an application fee.
      */
    def createRefund(feeId: String, data: IApplicationFeeRefundCreationOptions, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
    def createRefund(
      feeId: String,
      data: IApplicationFeeRefundCreationOptions,
      options: HeaderOptions,
      response: IResponseFn[IApplicationFeeRefund]
    ): js.Promise[IApplicationFeeRefund] = js.native
    def createRefund(
      feeId: String,
      data: IApplicationFeeRefundCreationOptions,
      response: IResponseFn[IApplicationFeeRefund]
    ): js.Promise[IApplicationFeeRefund] = js.native
    def createRefund(feeId: String, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
    def createRefund(feeId: String, options: HeaderOptions, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
    def createRefund(feeId: String, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
    def list(): IListPromise[IApplicationFee] = js.native
    def list(data: IApplicationFeeListOptions): IListPromise[IApplicationFee] = js.native
    /**
      * Returns a list of application fees you’ve previously collected. The application fees are returned in sorted order, with the most
      * recent fees appearing first.
      */
    def list(data: IApplicationFeeListOptions, options: HeaderOptions): IListPromise[IApplicationFee] = js.native
    def list(
      data: IApplicationFeeListOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[IApplicationFee]]
    ): IListPromise[IApplicationFee] = js.native
    def list(data: IApplicationFeeListOptions, response: IResponseFn[IList[IApplicationFee]]): IListPromise[IApplicationFee] = js.native
    def list(options: HeaderOptions): IListPromise[IApplicationFee] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[IApplicationFee]]): IListPromise[IApplicationFee] = js.native
    def list(response: IResponseFn[IList[IApplicationFee]]): IListPromise[IApplicationFee] = js.native
    def listRefunds(feeId: String): IListPromise[IApplicationFeeRefund] = js.native
    def listRefunds(feeId: String, data: IListOptions): IListPromise[IApplicationFeeRefund] = js.native
    /**
      * You can see a list of the refunds belonging to a specific application fee. Note that the 10 most recent refunds are always available
      * by default on the application fee object. If you need more than those 10, you can use this API method and the limit and starting_after
      * parameters to page through additional refunds.
      */
    def listRefunds(feeId: String, data: IListOptions, options: HeaderOptions): IListPromise[IApplicationFeeRefund] = js.native
    def listRefunds(
      feeId: String,
      data: IListOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[IApplicationFeeRefund]]
    ): IListPromise[IApplicationFeeRefund] = js.native
    def listRefunds(feeId: String, data: IListOptions, response: IResponseFn[IList[IApplicationFeeRefund]]): IListPromise[IApplicationFeeRefund] = js.native
    def listRefunds(feeId: String, options: HeaderOptions): IListPromise[IApplicationFeeRefund] = js.native
    def listRefunds(feeId: String, options: HeaderOptions, response: IResponseFn[IList[IApplicationFeeRefund]]): IListPromise[IApplicationFeeRefund] = js.native
    def listRefunds(feeId: String, response: IResponseFn[IList[IApplicationFeeRefund]]): IListPromise[IApplicationFeeRefund] = js.native
    def refund(feeId: String): js.Promise[IApplicationFeeRefund] = js.native
    def refund(feeId: String, data: IApplicationFeeRefundCreationOptions): js.Promise[IApplicationFeeRefund] = js.native
    /**
      * Refunds an application fee that has previously been collected but not yet refunded. Funds will be refunded to the Stripe account that
      * the fee was originally collected from.
      *
      * You can optionally refund only part of an application fee. You can do so as many times as you wish until the entire fee has been refunded.
      *
      * Once entirely refunded, an application fee can't be refunded again. This method will throw an error when called on an already-refunded
      * application fee, or when trying to refund more money than is left on an application fee.
      */
    def refund(feeId: String, data: IApplicationFeeRefundCreationOptions, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
    def refund(
      feeId: String,
      data: IApplicationFeeRefundCreationOptions,
      options: HeaderOptions,
      response: IResponseFn[IApplicationFeeRefund]
    ): js.Promise[IApplicationFeeRefund] = js.native
    def refund(
      feeId: String,
      data: IApplicationFeeRefundCreationOptions,
      response: IResponseFn[IApplicationFeeRefund]
    ): js.Promise[IApplicationFeeRefund] = js.native
    def refund(feeId: String, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
    def refund(feeId: String, options: HeaderOptions, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
    def refund(feeId: String, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
    def retrieve(id: String): js.Promise[IApplicationFee] = js.native
    def retrieve(id: String, data: IDataOptions): js.Promise[IApplicationFee] = js.native
    /**
      * Retrieves the details of an application fee that your account has collected. The same information is returned when refunding the
      * application fee.
      */
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IApplicationFee] = js.native
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IApplicationFee]): js.Promise[IApplicationFee] = js.native
    def retrieve(id: String, data: IDataOptions, response: IResponseFn[IApplicationFee]): js.Promise[IApplicationFee] = js.native
    def retrieve(id: String, options: HeaderOptions): js.Promise[IApplicationFee] = js.native
    def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IApplicationFee]): js.Promise[IApplicationFee] = js.native
    def retrieve(id: String, response: IResponseFn[IApplicationFee]): js.Promise[IApplicationFee] = js.native
    def retrieveRefund(feeId: String, refundId: String): js.Promise[IApplicationFeeRefund] = js.native
    /**
      * By default, you can see the 10 most recent refunds stored directly on the application fee object, but you can also retrieve details
      * about a specific refund stored on the application fee.
      */
    def retrieveRefund(feeId: String, refundId: String, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
    def retrieveRefund(
      feeId: String,
      refundId: String,
      options: HeaderOptions,
      response: IResponseFn[IApplicationFeeRefund]
    ): js.Promise[IApplicationFeeRefund] = js.native
    def retrieveRefund(feeId: String, refundId: String, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
    def updateRefund(feeId: String, refundId: String, data: Anon_Metadata): js.Promise[IApplicationFeeRefund] = js.native
    /**
      * Updates the specified application fee refund by setting the values of the parameters passed. Any parameters not provided will be left
      * unchanged.
      *
      * This request only accepts metadata as an argument.
      */
    def updateRefund(feeId: String, refundId: String, data: Anon_Metadata, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
    def updateRefund(
      feeId: String,
      refundId: String,
      data: Anon_Metadata,
      options: HeaderOptions,
      response: IResponseFn[IApplicationFeeRefund]
    ): js.Promise[IApplicationFeeRefund] = js.native
    def updateRefund(feeId: String, refundId: String, data: Anon_Metadata, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
  }
  
  @js.native
  class Balance () extends StripeResource {
    def listTransactions(): IListPromise[IBalanceTransaction] = js.native
    def listTransactions(data: IBalanceListOptions): IListPromise[IBalanceTransaction] = js.native
    /*
      * @deprecated
      */
    def listTransactions(data: IBalanceListOptions, options: HeaderOptions): IListPromise[IBalanceTransaction] = js.native
    def listTransactions(data: IBalanceListOptions, options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
    def listTransactions(data: IBalanceListOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
    def listTransactions(options: HeaderOptions): IListPromise[IBalanceTransaction] = js.native
    def listTransactions(options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
    def listTransactions(response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
    def retrieve(): js.Promise[IBalance] = js.native
    def retrieve(options: HeaderOptions): js.Promise[IBalance] = js.native
    def retrieve(options: HeaderOptions, response: IResponseFn[IBalance]): js.Promise[IBalance] = js.native
    def retrieve(response: IResponseFn[IBalance]): js.Promise[IBalance] = js.native
    def retrieveTransaction(id: String): js.Promise[IBalanceTransaction] = js.native
    /*
      * @deprecated
      */
    def retrieveTransaction(id: String, options: HeaderOptions): js.Promise[IBalanceTransaction] = js.native
    def retrieveTransaction(id: String, options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): js.Promise[IBalanceTransaction] = js.native
    def retrieveTransaction(id: String, response: IResponseFn[IBalanceTransaction]): js.Promise[IBalanceTransaction] = js.native
  }
  
  @js.native
  class BalanceTransaction () extends StripeResource {
    def list(): IListPromise[IBalanceTransaction] = js.native
    def list(data: IBalanceListOptions): IListPromise[IBalanceTransaction] = js.native
    def list(data: IBalanceListOptions, options: HeaderOptions): IListPromise[IBalanceTransaction] = js.native
    def list(data: IBalanceListOptions, options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
    def list(data: IBalanceListOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
    def list(options: HeaderOptions): IListPromise[IBalanceTransaction] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
    def list(response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
    def retrieve(id: String): js.Promise[IBalanceTransaction] = js.native
    def retrieve(id: String, options: HeaderOptions): js.Promise[IBalanceTransaction] = js.native
    def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): js.Promise[IBalanceTransaction] = js.native
    def retrieve(id: String, response: IResponseFn[IBalanceTransaction]): js.Promise[IBalanceTransaction] = js.native
  }
  
  @js.native
  class BitcoinReceivers () extends StripeResource {
    def create(data: IBitcoinReceiverCreationOptions): js.Promise[IBitcoinReceiver] = js.native
    /**
      * Creates a Bitcoin receiver object that can be used to accept bitcoin payments from your customer. The receiver exposes a Bitcoin address
      * and is created with a bitcoin to USD exchange rate that is valid for 10 minutes.
      */
    def create(data: IBitcoinReceiverCreationOptions, options: HeaderOptions): js.Promise[IBitcoinReceiver] = js.native
    def create(
      data: IBitcoinReceiverCreationOptions,
      options: HeaderOptions,
      response: IResponseFn[IBitcoinReceiver]
    ): js.Promise[IBitcoinReceiver] = js.native
    def create(data: IBitcoinReceiverCreationOptions, response: IResponseFn[IBitcoinReceiver]): js.Promise[IBitcoinReceiver] = js.native
     // TODO: Implement placeholder method
    def getMetadata(): Unit = js.native
    def list(data: IBitcoinReceiverListOptions): IListPromise[IBitcoinReceiver] = js.native
    /**
      * Returns a list of your receivers. Receivers are returned sorted by creation date, with the most recently created receivers appearing first.
      */
    def list(data: IBitcoinReceiverListOptions, options: HeaderOptions): IListPromise[IBitcoinReceiver] = js.native
    def list(
      data: IBitcoinReceiverListOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[IBitcoinReceiver]]
    ): IListPromise[IBitcoinReceiver] = js.native
    def list(data: IBitcoinReceiverListOptions, response: IResponseFn[IList[IBitcoinReceiver]]): IListPromise[IBitcoinReceiver] = js.native
    def retrieve(id: String): js.Promise[IBitcoinReceiver] = js.native
    def retrieve(id: String, data: IDataOptions): js.Promise[IBitcoinReceiver] = js.native
    /**
      * Retrieves the Bitcoin receiver with the given ID.
      */
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IBitcoinReceiver] = js.native
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IBitcoinReceiver]): js.Promise[IBitcoinReceiver] = js.native
    def retrieve(id: String, data: IDataOptions, response: IResponseFn[IBitcoinReceiver]): js.Promise[IBitcoinReceiver] = js.native
    def retrieve(id: String, options: HeaderOptions): js.Promise[IBitcoinReceiver] = js.native
    def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IBitcoinReceiver]): js.Promise[IBitcoinReceiver] = js.native
    def retrieve(id: String, response: IResponseFn[IBitcoinReceiver]): js.Promise[IBitcoinReceiver] = js.native
    // update(id: string): void; // This does seem to be a method in the library (https://github.com/stripe/stripe-node/blob/master/lib/resources/BitcoinReceivers.js#L12), but isn't in the API documentation.
    def setMetadata(): Unit = js.native
  }
  
  @js.native
  class ChargeRefunds () extends StripeResource {
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
          /* data */ IRefundCreationOptions, 
          /* options */ HeaderOptions, 
          /* response */ js.UndefOr[IResponseFn[IRefund]], 
          js.Promise[IRefund]
        ]) with (js.Function2[
          /* data */ IRefundCreationOptions, 
          /* response */ js.UndefOr[IResponseFn[IRefund]], 
          js.Promise[IRefund]
        ]) with (js.Function2[
          /* options */ HeaderOptions, 
          /* response */ js.UndefOr[IResponseFn[IRefund]], 
          js.Promise[IRefund]
        ]) with (js.Function1[/* response */ js.UndefOr[IResponseFn[IRefund]], js.Promise[IRefund]])
      ] = js.native
    /**
      * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted order,
      * with the most recent refunds appearing first.
      * For convenience, the 10 most recent refunds are always available by default on the charge object.
      */
    var list: js.UndefOr[
        (js.Function3[
          /* data */ IRefundListOptions, 
          /* options */ HeaderOptions, 
          /* response */ js.UndefOr[IResponseFn[IList[IRefund]]], 
          IListPromise[IRefund]
        ]) with (js.Function2[
          /* data */ IRefundListOptions, 
          /* response */ js.UndefOr[IResponseFn[IList[IRefund]]], 
          IListPromise[IRefund]
        ]) with (js.Function2[
          /* options */ HeaderOptions, 
          /* response */ js.UndefOr[IResponseFn[IList[IRefund]]], 
          IListPromise[IRefund]
        ]) with (js.Function1[/* response */ js.UndefOr[IResponseFn[IList[IRefund]]], IListPromise[IRefund]])
      ] = js.native
    /**
      * Retrieves the details of an existing refund.
      */
    var retrieve: js.UndefOr[
        (js.Function4[
          /* id */ String, 
          /* data */ IDataOptions, 
          /* options */ HeaderOptions, 
          /* response */ js.UndefOr[IResponseFn[IRefund]], 
          js.Promise[IRefund]
        ]) with (js.Function3[
          /* id */ String, 
          /* data */ IDataOptions, 
          /* response */ js.UndefOr[IResponseFn[IRefund]], 
          js.Promise[IRefund]
        ]) with (js.Function3[
          /* id */ String, 
          /* options */ HeaderOptions, 
          /* response */ js.UndefOr[IResponseFn[IRefund]], 
          js.Promise[IRefund]
        ]) with (js.Function2[
          /* id */ String, 
          /* response */ js.UndefOr[IResponseFn[IRefund]], 
          js.Promise[IRefund]
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
          /* id */ String, 
          /* data */ IDataOptionsWithMetadata, 
          /* options */ HeaderOptions, 
          /* response */ js.UndefOr[IResponseFn[IRefund]], 
          js.Promise[IRefund]
        ]) with (js.Function3[
          /* id */ String, 
          /* data */ IDataOptionsWithMetadata, 
          /* response */ js.UndefOr[IResponseFn[IRefund]], 
          js.Promise[IRefund]
        ])
      ] = js.native
  }
  
  @js.native
  class Charges () extends StripeResource {
    /**
      * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step payment flow, where first
      * you created a charge with the capture option set to false. Uncaptured payments expire exactly seven days after they are
      * created. If they are not captured by that point in time, they will be marked as refunded and will no longer be capturable.
      */
    def capture(id: String): js.Promise[ICharge] = js.native
    def capture(id: String, data: IChargeCaptureOptions): js.Promise[ICharge] = js.native
    def capture(id: String, data: IChargeCaptureOptions, options: HeaderOptions): js.Promise[ICharge] = js.native
    def capture(id: String, data: IChargeCaptureOptions, options: HeaderOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
    def create(data: IChargeCreationOptions): js.Promise[ICharge] = js.native
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
    def create(data: IChargeCreationOptions, options: HeaderOptions): js.Promise[ICharge] = js.native
    def create(data: IChargeCreationOptions, options: HeaderOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
    def create(data: IChargeCreationOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
    def createRefund(id: String): js.Promise[IRefund] = js.native
    def createRefund(id: String, data: IRefundCreationOptions): js.Promise[IRefund] = js.native
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
    def createRefund(id: String, data: IRefundCreationOptions, options: HeaderOptions): js.Promise[IRefund] = js.native
    def createRefund(id: String, data: IRefundCreationOptions, options: HeaderOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def createRefund(id: String, data: IRefundCreationOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def createRefund(id: String, options: HeaderOptions): js.Promise[IRefund] = js.native
    def createRefund(id: String, options: HeaderOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def createRefund(id: String, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def list(): IListPromise[ICharge] = js.native
    def list(data: IChargeListOptions): IListPromise[ICharge] = js.native
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
    def list(data: IChargeListOptions, options: HeaderOptions): IListPromise[ICharge] = js.native
    def list(data: IChargeListOptions, options: HeaderOptions, response: IResponseFn[IList[ICharge]]): IListPromise[ICharge] = js.native
    def list(data: IChargeListOptions, response: IResponseFn[IList[ICharge]]): IListPromise[ICharge] = js.native
    def list(options: HeaderOptions): IListPromise[ICharge] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[ICharge]]): IListPromise[ICharge] = js.native
    def list(response: IResponseFn[IList[ICharge]]): IListPromise[ICharge] = js.native
    def listRefunds(chargeId: String): IListPromise[IRefund] = js.native
    def listRefunds(chargeId: String, data: IListOptions): IListPromise[IRefund] = js.native
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
    def listRefunds(chargeId: String, data: IListOptions, options: HeaderOptions): IListPromise[IRefund] = js.native
    def listRefunds(
      chargeId: String,
      data: IListOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[IRefund]]
    ): IListPromise[IRefund] = js.native
    def listRefunds(chargeId: String, data: IListOptions, response: IResponseFn[IList[IRefund]]): IListPromise[IRefund] = js.native
    def listRefunds(chargeId: String, options: HeaderOptions): IListPromise[IRefund] = js.native
    def listRefunds(chargeId: String, options: HeaderOptions, response: IResponseFn[IList[IRefund]]): IListPromise[IRefund] = js.native
    def listRefunds(chargeId: String, response: IResponseFn[IList[IRefund]]): IListPromise[IRefund] = js.native
    def markAsFraudulent(chargeId: String): js.Promise[ICharge] = js.native
    def markAsFraudulent(chargeId: String, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
    def markAsSafe(chargeId: String): js.Promise[ICharge] = js.native
    def markAsSafe(chargeId: String, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
    def refund(chargeId: String): js.Promise[IRefund] = js.native
    def refund(chargeId: String, data: IRefundCreationOptions): js.Promise[IRefund] = js.native
    /**
      * When you create a new refund, you must specify a charge to create it on.
      * Creating a new refund will refund a charge that has previously been created but not yet refunded. Funds will be refunded to the credit or debit card that was originally charged. The fees you were originally charged are also refunded.
      * You can optionally refund only part of a charge. You can do so as many times as you wish until the entire charge has been refunded.
      * Once entirely refunded, a charge can't be refunded again. This method will throw an error when called on an already-refunded charge, or when trying to refund more money than is left on a charge.
      */
    def refund(chargeId: String, data: IRefundCreationOptions, options: HeaderOptions): js.Promise[IRefund] = js.native
    def refund(
      chargeId: String,
      data: IRefundCreationOptions,
      options: HeaderOptions,
      response: IResponseFn[IRefund]
    ): js.Promise[IRefund] = js.native
    def refund(chargeId: String, data: IRefundCreationOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def refund(chargeId: String, options: HeaderOptions): js.Promise[IRefund] = js.native
    def refund(chargeId: String, options: HeaderOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def refund(chargeId: String, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def retrieve(id: String): js.Promise[ICharge] = js.native
    def retrieve(id: String, data: IDataOptions): js.Promise[ICharge] = js.native
    /**
      * Retrieves the details of a charge that has previously been created. Supply the unique charge ID that was returned
      * from your previous request, and Stripe will return the corresponding charge information. The same information is
      * returned when creating or refunding the charge.
      *
      * @param id The identifier of the charge to be retrieved
      * @param response A callback that takes in a potential error and a charge object.
      */
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[ICharge] = js.native
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
    def retrieve(id: String, data: IDataOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
    def retrieve(id: String, options: HeaderOptions): js.Promise[ICharge] = js.native
    def retrieve(id: String, options: HeaderOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
    def retrieve(id: String, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
    def retrieveRefund(chargeId: String, refundId: String): js.Promise[IRefund] = js.native
    /**
      * By default, you can see the 10 most recent refunds stored directly on the charge object, but you can also retrieve details about a specific
      * refund stored on the charge.
      *
      * @param chargeId The ID of the charge refunded
      * @param refundId The ID of the refund to retrieve
      */
    def retrieveRefund(chargeId: String, refundId: String, options: HeaderOptions): js.Promise[IRefund] = js.native
    def retrieveRefund(chargeId: String, refundId: String, options: HeaderOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def retrieveRefund(chargeId: String, refundId: String, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def update(id: String, data: IChargeUpdateOptions): js.Promise[ICharge] = js.native
    /**
      * Updates the specified charge by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
      * This request accepts only the description, metadata, receipt_email and fraud_details as arguments.
      *
      * @param id The identifier of the charge to be updated
      * @param data An object containing the updated properties.
      */
    def update(id: String, data: IChargeUpdateOptions, options: HeaderOptions): js.Promise[ICharge] = js.native
    def update(id: String, data: IChargeUpdateOptions, options: HeaderOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
    def update(id: String, data: IChargeUpdateOptions, response: IResponseFn[ICharge]): js.Promise[ICharge] = js.native
    def updateRefund(chargeId: String, refundId: String, data: IDataOptionsWithMetadata): js.Promise[IRefund] = js.native
    /**
      * Updates the specified refund by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
      * This request only accepts metadata as an argument.
      *
      * @param chargeId The ID of the charge refunded
      * @param refundId The ID of the refund to update
      */
    def updateRefund(chargeId: String, refundId: String, data: IDataOptionsWithMetadata, options: HeaderOptions): js.Promise[IRefund] = js.native
    def updateRefund(
      chargeId: String,
      refundId: String,
      data: IDataOptionsWithMetadata,
      options: HeaderOptions,
      response: IResponseFn[IRefund]
    ): js.Promise[IRefund] = js.native
    def updateRefund(chargeId: String, refundId: String, data: IDataOptionsWithMetadata, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
  }
  
  @js.native
  class Checkout () extends StripeResource {
    var sessions: Sessions = js.native
  }
  
  @js.native
  class CountrySpecs () extends StripeResource {
    def list(): IListPromise[ICountrySpec] = js.native
    def list(data: IListOptions): IListPromise[ICountrySpec] = js.native
    /**
      * Lists all Country Spec objects available in the API.
      */
    def list(data: IListOptions, options: HeaderOptions): IListPromise[ICountrySpec] = js.native
    def list(data: IListOptions, options: HeaderOptions, response: IResponseFn[IList[ICountrySpec]]): IListPromise[ICountrySpec] = js.native
    def list(data: IListOptions, response: IResponseFn[IList[ICountrySpec]]): IListPromise[ICountrySpec] = js.native
    def list(options: HeaderOptions): IListPromise[ICountrySpec] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[ICountrySpec]]): IListPromise[ICountrySpec] = js.native
    def list(response: IResponseFn[IList[ICountrySpec]]): IListPromise[ICountrySpec] = js.native
    def retrieve(id: String): js.Promise[ICountrySpec] = js.native
    def retrieve(id: String, data: IDataOptions): js.Promise[ICountrySpec] = js.native
    /**
      * Returns a Country Spec for a given Country code.
      *
      * @param retrieve  An ISO country code. Available country codes can be listed with the List Country Specs endpoint.
      */
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[ICountrySpec] = js.native
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[ICountrySpec]): js.Promise[ICountrySpec] = js.native
    def retrieve(id: String, data: IDataOptions, response: IResponseFn[ICountrySpec]): js.Promise[ICountrySpec] = js.native
    def retrieve(id: String, options: HeaderOptions): js.Promise[ICountrySpec] = js.native
    def retrieve(id: String, options: HeaderOptions, response: IResponseFn[ICountrySpec]): js.Promise[ICountrySpec] = js.native
    def retrieve(id: String, response: IResponseFn[ICountrySpec]): js.Promise[ICountrySpec] = js.native
  }
  
  @js.native
  class Coupons () extends StripeResource {
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
  
  @js.native
  class CreditNotes () extends StripeResource {
    def create(data: ICreditNoteCreationOptions): js.Promise[ICreditNote] = js.native
    /**
      * A credit note can be issued for open and paid invoices.
      * When issued for an open invoice, a credit note decreases the invoice’s amount due.
      * When issued for a paid invoice, it is commonly used to refund or credit a specified amount to the customer.
      */
    def create(data: ICreditNoteCreationOptions, options: HeaderOptions): js.Promise[ICreditNote] = js.native
    def create(data: ICreditNoteCreationOptions, options: HeaderOptions, response: IResponseFn[ICreditNote]): js.Promise[ICreditNote] = js.native
    def create(data: ICreditNoteCreationOptions, response: IResponseFn[ICreditNote]): js.Promise[ICreditNote] = js.native
    def list(): js.Promise[IList[ICreditNote]] = js.native
    def list(data: ICreditNoteListOptions): js.Promise[IList[ICreditNote]] = js.native
    /**
      * Returns a list of your credit notes. Credit notes are returned sorted by creation date, with the most recently created credit note
      * items appearing first.
      */
    def list(data: ICreditNoteListOptions, options: HeaderOptions): js.Promise[IList[ICreditNote]] = js.native
    def list(data: ICreditNoteListOptions, options: HeaderOptions, response: IResponseFn[IList[ICreditNote]]): js.Promise[IList[ICreditNote]] = js.native
    def list(data: ICreditNoteListOptions, response: IResponseFn[IList[ICreditNote]]): js.Promise[IList[ICreditNote]] = js.native
    def list(options: HeaderOptions): js.Promise[IList[ICreditNote]] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[ICreditNote]]): js.Promise[IList[ICreditNote]] = js.native
    def list(response: IResponseFn[IList[ICreditNote]]): js.Promise[IList[ICreditNote]] = js.native
    def retrieve(creditNoteId: String): js.Promise[ICreditNote] = js.native
    /**
      * Retrieves the credit note with the given ID.
      */
    def retrieve(creditNoteId: String, options: HeaderOptions): js.Promise[ICreditNote] = js.native
    def retrieve(creditNoteId: String, options: HeaderOptions, response: IResponseFn[ICreditNote]): js.Promise[ICreditNote] = js.native
    def retrieve(creditNoteId: String, response: IResponseFn[ICreditNote]): js.Promise[ICreditNote] = js.native
    def update(creditNoteId: String, data: ICreditNoteUpdateOptions): js.Promise[ICreditNote] = js.native
    /**
      * Updates the memo or metadata on the credit note.
      */
    def update(creditNoteId: String, data: ICreditNoteUpdateOptions, options: HeaderOptions): js.Promise[ICreditNote] = js.native
    def update(
      creditNoteId: String,
      data: ICreditNoteUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[ICreditNote]
    ): js.Promise[ICreditNote] = js.native
    def update(creditNoteId: String, data: ICreditNoteUpdateOptions, response: IResponseFn[ICreditNote]): js.Promise[ICreditNote] = js.native
    def voidCreditNote(creditNoteId: String): js.Promise[ICreditNote] = js.native
    /**
      * Marks a credit note as void. Voiding a credit note reverses its adjustment. Voiding is only possible on open invoices.
      */
    def voidCreditNote(creditNoteId: String, options: HeaderOptions): js.Promise[ICreditNote] = js.native
    def voidCreditNote(creditNoteId: String, options: HeaderOptions, response: IResponseFn[ICreditNote]): js.Promise[ICreditNote] = js.native
    def voidCreditNote(creditNoteId: String, response: IResponseFn[ICreditNote]): js.Promise[ICreditNote] = js.native
  }
  
  @js.native
  class CustomerCards () extends StripeResource {
    def create(data: Anon_CardICardSourceCreationOptionsExtended): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    /**
      * When you create a new credit card, you must specify a customer or recipient to create it on. If the card's owner has no default card,
      * then the new card will become the default. However, if the owner already has a default then it will not change. To change the default,
      * you should either update the customer to have a new default_source or update the recipient to have a new default_card.
      *
      * @returns Returns the card object.
      */
    def create(data: Anon_CardICardSourceCreationOptionsExtended, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def create(
      data: Anon_CardICardSourceCreationOptionsExtended,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def create(
      data: Anon_CardICardSourceCreationOptionsExtended,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def del(cardId: String): js.Promise[IDeleteConfirmation] = js.native
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
    def del(cardId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
    def del(cardId: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
    def del(cardId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
    def list(): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def list(data: IListOptions): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
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
    def list(data: IListOptions, options: HeaderOptions): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def list(
      data: IListOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[typings.stripe.stripeMod.cardsNs.ICard]]
    ): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def list(data: IListOptions, response: IResponseFn[IList[typings.stripe.stripeMod.cardsNs.ICard]]): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def list(options: HeaderOptions): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[typings.stripe.stripeMod.cardsNs.ICard]]): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def list(response: IResponseFn[IList[typings.stripe.stripeMod.cardsNs.ICard]]): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def retrieve(cardId: String): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    /**
      * By default, you can see the 10 most recent cards stored on a customer or recipient directly on the customer or recipient object, but
      * you can also retrieve details about a specific card stored on the customer or recipient.
      *
      * @returns Returns the card object.
      *
      * @param cardId The ID of the card to be retrieved.
      */
    def retrieve(cardId: String, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def retrieve(
      cardId: String,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def retrieve(cardId: String, response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def update(cardId: String, data: ICardUpdateOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    /**
      * If you need to update only some card details, like the billing address or expiration date, you can do so without having to re-enter the
      * full card details. Stripe also works directly with card networks so that your customers can continue using your service without
      * interruption. When you update a card, Stripe will automatically validate the card.
      *
      * @returns Returns the card object.
      *
      * @param cardId The ID of the card to be retrieved.
      */
    def update(cardId: String, data: ICardUpdateOptions, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def update(
      cardId: String,
      data: ICardUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def update(
      cardId: String,
      data: ICardUpdateOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
  }
  
  @js.native
  class CustomerSubscriptions () extends SubscriptionsBase {
    def create(data: ISubscriptionCustCreationOptions): js.Promise[ISubscription] = js.native
    /**
      * Creates a new subscription on an existing customer.
      *
      * @returns The newly created subscription object if the call succeeded. If the customer has no card or the
      * attempted charge fails, this call throws an error (unless the specified plan is free or has a trial
      * period).
      *
      * @param options The options for the new subscription
      */
    def create(data: ISubscriptionCustCreationOptions, options: HeaderOptions): js.Promise[ISubscription] = js.native
    def create(
      data: ISubscriptionCustCreationOptions,
      options: HeaderOptions,
      response: IResponseFn[ISubscription]
    ): js.Promise[ISubscription] = js.native
    def create(data: ISubscriptionCustCreationOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
  }
  
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
    def createCard(customerId: String, data: Anon_CardICardSourceCreationOptionsExtended): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
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
    def createCard(customerId: String, data: Anon_CardICardSourceCreationOptionsExtended, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def createCard(
      customerId: String,
      data: Anon_CardICardSourceCreationOptionsExtended,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def createCard(
      customerId: String,
      data: Anon_CardICardSourceCreationOptionsExtended,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def createSource(customerId: String, data: ICustomerCardSourceCreationOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
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
    def createSource(customerId: String, data: ICustomerCardSourceCreationOptions, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def createSource(
      customerId: String,
      data: ICustomerCardSourceCreationOptions,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def createSource(
      customerId: String,
      data: ICustomerCardSourceCreationOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def createSource(customerId: String, data: ICustomerSourceCreationOptions): js.Promise[IStripeSource] = js.native
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
    def listCards(customerId: String): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def listCards(customerId: String, data: IListOptions): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
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
    def listCards(customerId: String, data: IListOptions, options: HeaderOptions): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def listCards(
      customerId: String,
      data: IListOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[typings.stripe.stripeMod.cardsNs.ICard]]
    ): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def listCards(
      customerId: String,
      data: IListOptions,
      response: IResponseFn[IList[typings.stripe.stripeMod.cardsNs.ICard]]
    ): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def listCards(customerId: String, options: HeaderOptions): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def listCards(
      customerId: String,
      options: HeaderOptions,
      response: IResponseFn[IList[typings.stripe.stripeMod.cardsNs.ICard]]
    ): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def listCards(customerId: String, response: IResponseFn[IList[typings.stripe.stripeMod.cardsNs.ICard]]): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def listSources(customerId: String, data: IBankAccountSourceListOptions): IListPromise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
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
    def listSources(customerId: String, data: IBankAccountSourceListOptions, options: HeaderOptions): IListPromise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def listSources(
      customerId: String,
      data: IBankAccountSourceListOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[typings.stripe.stripeMod.bankAccountsNs.IBankAccount]]
    ): IListPromise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def listSources(
      customerId: String,
      data: IBankAccountSourceListOptions,
      response: IResponseFn[IList[typings.stripe.stripeMod.bankAccountsNs.IBankAccount]]
    ): IListPromise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def listSources(customerId: String, data: ICardSourceListOptions): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
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
    def listSources(customerId: String, data: ICardSourceListOptions, options: HeaderOptions): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def listSources(
      customerId: String,
      data: ICardSourceListOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[typings.stripe.stripeMod.cardsNs.ICard]]
    ): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def listSources(
      customerId: String,
      data: ICardSourceListOptions,
      response: IResponseFn[IList[typings.stripe.stripeMod.cardsNs.ICard]]
    ): IListPromise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def listSources(customerId: String, data: ISourceListOptions): IListPromise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    def listSources(customerId: String, data: ISourceListOptions, options: HeaderOptions): IListPromise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    def listSources(
      customerId: String,
      data: ISourceListOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[typings.stripe.stripeMod.sourcesNs.ISource]]
    ): IListPromise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    def listSources(
      customerId: String,
      data: ISourceListOptions,
      response: IResponseFn[IList[typings.stripe.stripeMod.sourcesNs.ISource]]
    ): IListPromise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
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
    def retrieveCard(customerId: String, cardId: String): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    /**
      * By default, you can see the 10 most recent cards stored on a customer or recipient directly on the customer or recipient object, but
      * you can also retrieve details about a specific card stored on the customer or recipient.
      *
      * @returns Returns the card object.
      *
      * @param customerId The ID of the customer whose card needs to be retrieved.
      * @param cardId The ID of the card to be retrieved.
      */
    def retrieveCard(customerId: String, cardId: String, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def retrieveCard(
      customerId: String,
      cardId: String,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def retrieveCard(customerId: String, cardId: String, response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
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
    def updateCard(customerId: String, cardId: String, data: ICardUpdateOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
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
    def updateCard(customerId: String, cardId: String, data: ICardUpdateOptions, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def updateCard(
      customerId: String,
      cardId: String,
      data: ICardUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def updateCard(
      customerId: String,
      cardId: String,
      data: ICardUpdateOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def updateSource(customerId: String, sourceId: String, data: IBankAccountUpdateOptions): js.Promise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    /**
      * Updates the metadata, account_holder_name, and account_holder_type of a bank account belonging to a Customer. Other bank account details
      * are not editable by design.
      *
      * @returns Returns the bank account object.
      *
      * @param customerId The ID of the customer whose card needs to be retrieved.
      * @param sourceId The ID of the bank account to be updated.
      */
    def updateSource(customerId: String, sourceId: String, data: IBankAccountUpdateOptions, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def updateSource(
      customerId: String,
      sourceId: String,
      data: IBankAccountUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.bankAccountsNs.IBankAccount]
    ): js.Promise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def updateSource(
      customerId: String,
      sourceId: String,
      data: IBankAccountUpdateOptions,
      response: IResponseFn[typings.stripe.stripeMod.bankAccountsNs.IBankAccount]
    ): js.Promise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
    def updateSource(customerId: String, sourceId: String, data: ICardUpdateOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
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
    def updateSource(customerId: String, sourceId: String, data: ICardUpdateOptions, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def updateSource(
      customerId: String,
      sourceId: String,
      data: ICardUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
    def updateSource(
      customerId: String,
      sourceId: String,
      data: ICardUpdateOptions,
      response: IResponseFn[typings.stripe.stripeMod.cardsNs.ICard]
    ): js.Promise[typings.stripe.stripeMod.cardsNs.ICard] = js.native
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
    def verifySource(customerId: String, sourceId: String, data: IBankAccountVerifyOptions): js.Promise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
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
    def verifySource(customerId: String, sourceId: String, data: IBankAccountVerifyOptions, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.bankAccountsNs.IBankAccount] = js.native
  }
  
  @js.native
  class Disputes () extends StripeResource {
    def close(disputeId: String): js.Promise[IDispute] = js.native
    /**
      * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
      * essentially ‘dismissing’ the dispute, acknowledging it as lost
      *
      * The status of the dispute will change from needs_response to lost.
      *
      * *Closing a dispute is irreversible!*
      */
    def close(disputeId: String, options: HeaderOptions): js.Promise[IDispute] = js.native
    def close(disputeId: String, options: HeaderOptions, response: IResponseFn[IDispute]): js.Promise[IDispute] = js.native
    def close(disputeId: String, response: IResponseFn[IDispute]): js.Promise[IDispute] = js.native
     // TODO: Implement placeholder method
    def getMetadata(): Unit = js.native
    def list(): IListPromise[IDispute] = js.native
    def list(data: IListOptionsCreated): IListPromise[IDispute] = js.native
    /**
      * Returns a list of your disputes.
      */
    def list(data: IListOptionsCreated, options: HeaderOptions): IListPromise[IDispute] = js.native
    def list(data: IListOptionsCreated, options: HeaderOptions, response: IResponseFn[IList[IDispute]]): IListPromise[IDispute] = js.native
    def list(data: IListOptionsCreated, response: IResponseFn[IList[IDispute]]): IListPromise[IDispute] = js.native
    def list(options: HeaderOptions): IListPromise[IDispute] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[IDispute]]): IListPromise[IDispute] = js.native
    def list(response: IResponseFn[IList[IDispute]]): IListPromise[IDispute] = js.native
    def retrieve(disputeId: String): js.Promise[IDispute] = js.native
    def retrieve(disputeId: String, data: IDataOptions): js.Promise[IDispute] = js.native
    /**
      * Retrieves the dispute with the given ID.
      */
    def retrieve(disputeId: String, data: IDataOptions, options: HeaderOptions): js.Promise[IDispute] = js.native
    def retrieve(disputeId: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IDispute]): js.Promise[IDispute] = js.native
    def retrieve(disputeId: String, data: IDataOptions, response: IResponseFn[IDispute]): js.Promise[IDispute] = js.native
    def retrieve(disputeId: String, options: HeaderOptions): js.Promise[IDispute] = js.native
    def retrieve(disputeId: String, options: HeaderOptions, response: IResponseFn[IDispute]): js.Promise[IDispute] = js.native
    def retrieve(disputeId: String, response: IResponseFn[IDispute]): js.Promise[IDispute] = js.native
    def setMetadata(): Unit = js.native
    def update(disputeId: String, data: IDisputeUpdateOptions): js.Promise[IDispute] = js.native
    /**
      * When you get a dispute, contacting your customer is always the best first step. If that doesn't work, you can submit evidence in
      * order to help us resolve the dispute in your favor. You can do this in your dashboard, but if you prefer, you can use the API to
      * submit evidence programmatically. Depending on your dispute type, different evidence fields will give you a better chance of winning
      * your dispute. You may want to consult our guide to dispute types to help you figure out which evidence fields to provide:
      * https://stripe.com/help/dispute-types
      *
      * @param data The fields to update
      */
    def update(disputeId: String, data: IDisputeUpdateOptions, options: HeaderOptions): js.Promise[IDispute] = js.native
    def update(
      disputeId: String,
      data: IDisputeUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[IDispute]
    ): js.Promise[IDispute] = js.native
    def update(disputeId: String, data: IDisputeUpdateOptions, response: IResponseFn[IDispute]): js.Promise[IDispute] = js.native
  }
  
  @js.native
  class EphemeralKeys () extends js.Object {
    def create(customer: typings.stripe.stripeMod.ephemeralKeysNs.ICustomer, stripe_version: IStripeVersion): js.Promise[IEphemeralKey] = js.native
    def create(
      customer: typings.stripe.stripeMod.ephemeralKeysNs.ICustomer,
      stripe_version: IStripeVersion,
      response: IResponseFn[IEphemeralKey]
    ): js.Promise[IEphemeralKey] = js.native
  }
  
  @js.native
  class Events () extends StripeResource {
    def list(): IListPromise[IEvent] = js.native
    def list(data: IEventListOptions): IListPromise[IEvent] = js.native
    /**
      * List events, going back up to 30 days.
      */
    def list(data: IEventListOptions, options: HeaderOptions): IListPromise[IEvent] = js.native
    def list(data: IEventListOptions, options: HeaderOptions, response: IResponseFn[IList[IEvent]]): IListPromise[IEvent] = js.native
    def list(data: IEventListOptions, response: IResponseFn[IList[IEvent]]): IListPromise[IEvent] = js.native
    def list(options: HeaderOptions): IListPromise[IEvent] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[IEvent]]): IListPromise[IEvent] = js.native
    def list(response: IResponseFn[IList[IEvent]]): IListPromise[IEvent] = js.native
    def retrieve(id: String): js.Promise[IEvent] = js.native
    def retrieve(id: String, data: IDataOptions): js.Promise[IEvent] = js.native
    /**
      * Retrieves the details of an event. Supply the unique identifier of the event, which you might have
      * received in a webhook.
      */
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IEvent] = js.native
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IEvent]): js.Promise[IEvent] = js.native
    def retrieve(id: String, data: IDataOptions, response: IResponseFn[IEvent]): js.Promise[IEvent] = js.native
    def retrieve(id: String, options: HeaderOptions): js.Promise[IEvent] = js.native
    def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IEvent]): js.Promise[IEvent] = js.native
    def retrieve(id: String, response: IResponseFn[IEvent]): js.Promise[IEvent] = js.native
  }
  
  @js.native
  class FileUploads () extends StripeResource {
    def create(data: IFileUploadCreationOptions): js.Promise[IFileUpdate] = js.native
    /**
      * To upload a file to Stripe, you’ll need to send a request of type multipart/form-data.
      * The request should contain the file you would like to upload, as well as the parameters for creating a file.
      *
      * All of Stripe’s officially supported API libraries should have support for sending multipart/form-data.
      */
    def create(data: IFileUploadCreationOptions, options: HeaderOptions): js.Promise[IFileUpdate] = js.native
    def create(data: IFileUploadCreationOptions, options: HeaderOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
    def create(data: IFileUploadCreationOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
    def list(): IListPromise[IFileUpdate] = js.native
    def list(data: IFileUploadListOptions): IListPromise[IFileUpdate] = js.native
    /**
      * Returns a list of the files that you have uploaded to Stripe.
      * The file uploads are returned sorted by creation date, with the most recently created file uploads appearing first.
      */
    def list(data: IFileUploadListOptions, options: HeaderOptions): IListPromise[IFileUpdate] = js.native
    def list(data: IFileUploadListOptions, options: HeaderOptions, response: IResponseFn[IList[IFileUpdate]]): IListPromise[IFileUpdate] = js.native
    def list(data: IFileUploadListOptions, response: IResponseFn[IList[IFileUpdate]]): IListPromise[IFileUpdate] = js.native
    def list(options: HeaderOptions): IListPromise[IFileUpdate] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[IFileUpdate]]): IListPromise[IFileUpdate] = js.native
    def list(response: IResponseFn[IList[IFileUpdate]]): IListPromise[IFileUpdate] = js.native
    def retrieve(id: String): js.Promise[IFileUpdate] = js.native
    def retrieve(id: String, data: IDataOptions): js.Promise[IFileUpdate] = js.native
    /**
      * Retrieves the details of an existing file object.
      * Supply the unique file upload ID from a file creation request, and Stripe will return the corresponding transfer information.
      */
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IFileUpdate] = js.native
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
    def retrieve(id: String, data: IDataOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
    def retrieve(id: String, options: HeaderOptions): js.Promise[IFileUpdate] = js.native
    def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
    def retrieve(id: String, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
  }
  
  trait IPlanListOptions extends IListOptionsCreated {
    /**
      * Only return plans that are active or inactive (e.g., pass false to list all inactive products).
      */
    var active: js.UndefOr[Boolean] = js.undefined
    /**
      * Only return plans for the given product.
      */
    var product: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  class InvoiceItems () extends StripeResource {
    def create(data: InvoiceItemCreationOptions): js.Promise[InvoiceItem] = js.native
    /**
      * Adds an arbitrary charge or credit to the customer’s upcoming invoice.
      */
    def create(data: InvoiceItemCreationOptions, options: HeaderOptions): js.Promise[InvoiceItem] = js.native
    def create(data: InvoiceItemCreationOptions, options: HeaderOptions, response: IResponseFn[InvoiceItem]): js.Promise[InvoiceItem] = js.native
    def create(data: InvoiceItemCreationOptions, response: IResponseFn[InvoiceItem]): js.Promise[InvoiceItem] = js.native
    def del(invoiceItemId: String): js.Promise[IDeleteConfirmation] = js.native
    /**
      * Removes an invoice item from the upcoming invoice. Removing an invoice item is only possible before the invoice it's attached
      * to is closed.
      */
    def del(invoiceItemId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
    def del(invoiceItemId: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
    def del(invoiceItemId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
    def list(): IListPromise[InvoiceItem] = js.native
    def list(data: InvoiceItemListOptions): IListPromise[InvoiceItem] = js.native
    /**
      * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with the most recently created invoice
      * items appearing first.
      */
    def list(data: InvoiceItemListOptions, options: HeaderOptions): IListPromise[InvoiceItem] = js.native
    def list(data: InvoiceItemListOptions, options: HeaderOptions, response: IResponseFn[IList[InvoiceItem]]): IListPromise[InvoiceItem] = js.native
    def list(data: InvoiceItemListOptions, response: IResponseFn[IList[InvoiceItem]]): IListPromise[InvoiceItem] = js.native
    def list(options: HeaderOptions): IListPromise[InvoiceItem] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[InvoiceItem]]): IListPromise[InvoiceItem] = js.native
    def list(response: IResponseFn[IList[InvoiceItem]]): IListPromise[InvoiceItem] = js.native
    def retrieve(invoiceItemId: String): js.Promise[InvoiceItem] = js.native
    /**
      * Retrieves the invoice item with the given ID.
      */
    def retrieve(invoiceItemId: String, options: HeaderOptions): js.Promise[InvoiceItem] = js.native
    def retrieve(invoiceItemId: String, options: HeaderOptions, response: IResponseFn[InvoiceItem]): js.Promise[InvoiceItem] = js.native
    def retrieve(invoiceItemId: String, response: IResponseFn[InvoiceItem]): js.Promise[InvoiceItem] = js.native
    def update(invoiceItemId: String, data: InvoiceItemUpdateOptions): js.Promise[InvoiceItem] = js.native
    /**
      * Updates the amount or description of an invoice item on an upcoming invoice. Updating an invoice item is only possible before the
      * invoice it's attached to is closed.
      */
    def update(invoiceItemId: String, data: InvoiceItemUpdateOptions, options: HeaderOptions): js.Promise[InvoiceItem] = js.native
    def update(
      invoiceItemId: String,
      data: InvoiceItemUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[InvoiceItem]
    ): js.Promise[InvoiceItem] = js.native
    def update(invoiceItemId: String, data: InvoiceItemUpdateOptions, response: IResponseFn[InvoiceItem]): js.Promise[InvoiceItem] = js.native
  }
  
  @js.native
  class Invoices () extends StripeResource {
    def create(data: IInvoiceCreationOptions): js.Promise[IInvoice] = js.native
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
    def create(data: IInvoiceCreationOptions, options: HeaderOptions): js.Promise[IInvoice] = js.native
    def create(data: IInvoiceCreationOptions, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def create(data: IInvoiceCreationOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def finalizeInvoice(id: String): js.Promise[IInvoice] = js.native
    def finalizeInvoice(id: String, data: IInvoiceFinalizeOptions): js.Promise[IInvoice] = js.native
    /**
      * Stripe automatically finalizes drafts before sending and attempting payment on invoices. However, if
      * you’d like to finalize a draft invoice manually, you can do so using this method.
      *
      * @returns Returns the invoice object.
      *
      * @param id The ID of the invoice to pay.
      * @param data Additional arguments.
      */
    def finalizeInvoice(id: String, data: IInvoiceFinalizeOptions, options: HeaderOptions): js.Promise[IInvoice] = js.native
    def finalizeInvoice(id: String, data: IInvoiceFinalizeOptions, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def finalizeInvoice(id: String, data: IInvoiceFinalizeOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def finalizeInvoice(id: String, options: HeaderOptions): js.Promise[IInvoice] = js.native
    def finalizeInvoice(id: String, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def finalizeInvoice(id: String, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def list(): IListPromise[IInvoice] = js.native
    def list(data: IInvoiceListOptions): IListPromise[IInvoice] = js.native
    /**
      * You can list all invoices, or list the invoices for a specific customer. The invoices are returned
      * sorted by creation date, with the most recently created invoices appearing first.
      *
      * @returns A object with a data property that contains an array of invoice objects. Throws an error if the
      * customer ID is invalid.
      *
      * @param data Filtering options
      */
    def list(data: IInvoiceListOptions, options: HeaderOptions): IListPromise[IInvoice] = js.native
    def list(data: IInvoiceListOptions, options: HeaderOptions, response: IResponseFn[IList[IInvoice]]): IListPromise[IInvoice] = js.native
    def list(data: IInvoiceListOptions, response: IResponseFn[IList[IInvoice]]): IListPromise[IInvoice] = js.native
    def list(response: IResponseFn[IList[IInvoice]]): IListPromise[IInvoice] = js.native
    def listLineItems(id: String): IListPromise[IInvoiceLineItem] = js.native
    def listLineItems(id: String, data: IInvoiceListLineItemsOptions): IListPromise[IInvoiceLineItem] = js.native
    /**
      * When retrieving an invoice, you'll get a lines property containing the total count of line items and the first
      * handful of those items. There is also a URL where you can retrieve the full (paginated) list of line items.
      *
      * @returns Returns a list of line_item objects.
      *
      * @param id The id of the invoice containing the lines to be retrieved
      * @param data Filtering options
      */
    def listLineItems(id: String, data: IInvoiceListLineItemsOptions, options: HeaderOptions): IListPromise[IInvoiceLineItem] = js.native
    def listLineItems(
      id: String,
      data: IInvoiceListLineItemsOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[IInvoiceLineItem]]
    ): IListPromise[IInvoiceLineItem] = js.native
    def listLineItems(id: String, data: IInvoiceListLineItemsOptions, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
    def listLineItems(id: String, options: HeaderOptions): IListPromise[IInvoiceLineItem] = js.native
    def listLineItems(id: String, options: HeaderOptions, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
    def listLineItems(id: String, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
    def listUpcomingLineItems(): IListPromise[IInvoiceLineItem] = js.native
    def listUpcomingLineItems(data: IInvoiceListUpcomingLineItemsOptions): IListPromise[IInvoiceLineItem] = js.native
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
    def listUpcomingLineItems(data: IInvoiceListUpcomingLineItemsOptions, options: HeaderOptions): IListPromise[IInvoiceLineItem] = js.native
    def listUpcomingLineItems(
      data: IInvoiceListUpcomingLineItemsOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[IInvoiceLineItem]]
    ): IListPromise[IInvoiceLineItem] = js.native
    def listUpcomingLineItems(data: IInvoiceListUpcomingLineItemsOptions, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
    def listUpcomingLineItems(options: HeaderOptions): IListPromise[IInvoiceLineItem] = js.native
    def listUpcomingLineItems(options: HeaderOptions, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
    def listUpcomingLineItems(response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
    def pay(id: String): js.Promise[IInvoice] = js.native
    def pay(id: String, data: IInvoicePayOptions): js.Promise[IInvoice] = js.native
    /**
      * Stripe automatically creates and then attempts to pay invoices for customers on subscriptions. We'll also retry unpaid
      * invoices according to your retry settings. However, if you'd like to attempt to collect payment on an invoice out of the
      * normal retry schedule or for some other reason, you can do so.
      *
      * @returns Returns the invoice object.
      *
      * @param id The ID of the invoice to pay.
      */
    def pay(id: String, data: IInvoicePayOptions, options: HeaderOptions): js.Promise[IInvoice] = js.native
    def pay(id: String, data: IInvoicePayOptions, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def pay(id: String, data: IInvoicePayOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def pay(id: String, options: HeaderOptions): js.Promise[IInvoice] = js.native
    def pay(id: String, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def pay(id: String, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def retrieve(id: String): js.Promise[IInvoice] = js.native
    def retrieve(id: String, data: IDataOptions): js.Promise[IInvoice] = js.native
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
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IInvoice] = js.native
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def retrieve(id: String, data: IDataOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def retrieve(id: String, options: HeaderOptions): js.Promise[IInvoice] = js.native
    def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def retrieve(id: String, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def retrieveLines(id: String): IListPromise[IInvoiceLineItem] = js.native
    def retrieveLines(id: String, data: IInvoiceLineItemRetrievalOptions): IListPromise[IInvoiceLineItem] = js.native
    /**
      * When retrieving an invoice, you'll get a lines property containing the total count of line items and the first
      * handful of those items. There is also a URL where you can retrieve the full (paginated) list of line items.
      *
      * @returns Returns a list of line_item objects.
      *
      * @param id The id of the invoice containing the lines to be retrieved
      * @param data Filtering options
      */
    def retrieveLines(id: String, data: IInvoiceLineItemRetrievalOptions, options: HeaderOptions): IListPromise[IInvoiceLineItem] = js.native
    def retrieveLines(
      id: String,
      data: IInvoiceLineItemRetrievalOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[IInvoiceLineItem]]
    ): IListPromise[IInvoiceLineItem] = js.native
    def retrieveLines(id: String, data: IInvoiceLineItemRetrievalOptions, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
    def retrieveLines(id: String, options: HeaderOptions): IListPromise[IInvoiceLineItem] = js.native
    def retrieveLines(id: String, options: HeaderOptions, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
    def retrieveLines(id: String, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
    def retrieveUpcoming(data: IInvoiceUpcomingOptions): js.Promise[IInvoice] = js.native
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
    def retrieveUpcoming(data: IInvoiceUpcomingOptions, options: HeaderOptions): js.Promise[IInvoice] = js.native
    def retrieveUpcoming(data: IInvoiceUpcomingOptions, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def retrieveUpcoming(data: IInvoiceUpcomingOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def retrieveUpcoming(id: String): js.Promise[IInvoice] = js.native
    def retrieveUpcoming(id: String, data: IInvoiceUpcomingOptions): js.Promise[IInvoice] = js.native
    def retrieveUpcoming(id: String, data: IInvoiceUpcomingOptions, options: HeaderOptions): js.Promise[IInvoice] = js.native
    def retrieveUpcoming(id: String, data: IInvoiceUpcomingOptions, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def retrieveUpcoming(id: String, data: IInvoiceUpcomingOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def retrieveUpcoming(id: String, options: HeaderOptions): js.Promise[IInvoice] = js.native
    def retrieveUpcoming(id: String, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def retrieveUpcoming(id: String, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def sendInvoice(id: String): js.Promise[IInvoice] = js.native
    /**
      * Stripe will automatically send invoices to customers according to your subscriptions settings.
      * However, if you’d like to manually send an invoice to your customer out of the normal schedule, you can do so.
      * When sending invoices that have already been paid, there will be no reference to the payment in the email.
      *
      * Requests made in test-mode result in no emails being sent, despite sending an invoice.sent event.
      *
      * @returns Returns the invoice object
      *
      * @param invoice The ID of the invoice to send
      */
    def sendInvoice(id: String, options: HeaderOptions): js.Promise[IInvoice] = js.native
    def sendInvoice(id: String, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def sendInvoice(id: String, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def update(id: String, data: IInvoiceUpdateOptions): js.Promise[IInvoice] = js.native
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
    def update(id: String, data: IInvoiceUpdateOptions, options: HeaderOptions): js.Promise[IInvoice] = js.native
    def update(id: String, data: IInvoiceUpdateOptions, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
    def update(id: String, data: IInvoiceUpdateOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  }
  
  @js.native
  class Orders () extends js.Object {
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
  
  @js.native
  class PaymentIntents () extends StripeResource {
    def cancel(paymentIntentId: String): js.Promise[IPaymentIntent] = js.native
    def cancel(paymentIntentId: String, data: Anon_Cancellationreason): js.Promise[IPaymentIntent] = js.native
    /**
      * A PaymentIntent object can be canceled when it is in one of these statuses: `requires_payment_method`, `requires_capture`, `requires_confirmation`, `requires_action`.
      * Once canceled, no additional charges will be made by the PaymentIntent and any operations on the PaymentIntent will fail with an error. For PaymentIntents with `status='requires_capture'`, the remaining `amount_capturable` will automatically be refunded.
      *
      * @returns Returns a PaymentIntent object if the cancellation succeeded. Returns an error if the PaymentIntent has already been canceled or is not in a cancelable state.
      */
    def cancel(paymentIntentId: String, data: Anon_Cancellationreason, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
    def cancel(
      paymentIntentId: String,
      data: Anon_Cancellationreason,
      options: HeaderOptions,
      response: IResponseFn[IPaymentIntent]
    ): js.Promise[IPaymentIntent] = js.native
    def cancel(paymentIntentId: String, data: Anon_Cancellationreason, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
    def cancel(paymentIntentId: String, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
    def cancel(paymentIntentId: String, options: HeaderOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
    def cancel(paymentIntentId: String, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
    def capture(paymentIntentId: String): js.Promise[IPaymentIntent] = js.native
    def capture(paymentIntentId: String, data: IPaymentIntentCaptureOptions): js.Promise[IPaymentIntent] = js.native
    /**
      * Capture the funds of an existing uncaptured PaymentIntent where `required_action="requires_capture"`.
      * Uncaptured PaymentIntents will be canceled exactly seven days after they are created.
      *
      * @returns Returns a PaymentIntent object with `status="succeeded"` if the PaymentIntent was capturable. Returns an error if the PaymentIntent was not capturable or an invalid amount to capture was provided.
      */
    def capture(paymentIntentId: String, data: IPaymentIntentCaptureOptions, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
    def capture(
      paymentIntentId: String,
      data: IPaymentIntentCaptureOptions,
      options: HeaderOptions,
      response: IResponseFn[IPaymentIntent]
    ): js.Promise[IPaymentIntent] = js.native
    def capture(paymentIntentId: String, data: IPaymentIntentCaptureOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
    def capture(paymentIntentId: String, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
    def capture(paymentIntentId: String, options: HeaderOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
    def capture(paymentIntentId: String, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
    def confirm(paymentIntentId: String): js.Promise[IPaymentIntent] = js.native
    def confirm(paymentIntentId: String, data: IPaymentIntentConfirmOptions): js.Promise[IPaymentIntent] = js.native
    /**
      * Confirm that your customer intends to pay with current or provided `source`. Upon confirmation, the PaymentIntent will attempt to initiate a payment.
      *
      * If the selected source requires additional authentication steps, the PaymentIntent will transition to the `requires_action` status and suggest additional actions via `next_source_action`. If payment fails, the PaymentIntent will transition to the `requires_payment_method` status. If payment succeeds, the PaymentIntent will transition to the `succeeded` status (or `requires_capture`, if `capture_method` is set to `manual`).
      *
      * When using a publishable key, the client_secret must be provided to confirm the PaymentIntent.
      */
    def confirm(paymentIntentId: String, data: IPaymentIntentConfirmOptions, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
    def confirm(
      paymentIntentId: String,
      data: IPaymentIntentConfirmOptions,
      options: HeaderOptions,
      response: IResponseFn[IPaymentIntent]
    ): js.Promise[IPaymentIntent] = js.native
    def confirm(paymentIntentId: String, data: IPaymentIntentConfirmOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
    def confirm(paymentIntentId: String, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
    def confirm(paymentIntentId: String, options: HeaderOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
    def confirm(paymentIntentId: String, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
    def create(data: IPaymentIntentCreationOptions): js.Promise[IPaymentIntent] = js.native
    /**
      * Creates a PaymentIntent object.
      */
    def create(data: IPaymentIntentCreationOptions, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
    def create(data: IPaymentIntentCreationOptions, options: HeaderOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
    def create(data: IPaymentIntentCreationOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
    def list(): IListPromise[IPaymentIntent] = js.native
    def list(data: IPaymentIntentListOptions): IListPromise[IPaymentIntent] = js.native
    /**
      * Returns a list of PaymentIntents.
      *
      * @returns A object with a data property that contains an array of up to limit PaymentIntents, starting after PaymentIntent starting_after. Each entry in the array is a separate PaymentIntent object. If no more PaymentIntents are available, the resulting array will be empty. This request should never throw an error.
      */
    def list(data: IPaymentIntentListOptions, options: HeaderOptions): IListPromise[IPaymentIntent] = js.native
    def list(
      data: IPaymentIntentListOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[IPaymentIntent]]
    ): IListPromise[IPaymentIntent] = js.native
    def list(data: IPaymentIntentListOptions, response: IResponseFn[IList[IPaymentIntent]]): IListPromise[IPaymentIntent] = js.native
    def list(options: HeaderOptions): IListPromise[IPaymentIntent] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[IPaymentIntent]]): IListPromise[IPaymentIntent] = js.native
    def list(response: IResponseFn[IList[IPaymentIntent]]): IListPromise[IPaymentIntent] = js.native
    def retrieve(id: String): js.Promise[IPaymentIntent] = js.native
    def retrieve(id: String, data: IPaymentIntentRetrieveOptions): js.Promise[IPaymentIntent] = js.native
    /**
      * Retrieves the details of a PaymentIntent that has previously been created.
      * Client-side retrieval using a publishable key is allowed when the client_secret is provided in the query string.
      * When retrieved with a publishable key, only a subset of properties will be returned. Please refer to the payment intent object reference for more details.
      */
    def retrieve(id: String, data: IPaymentIntentRetrieveOptions, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
    def retrieve(
      id: String,
      data: IPaymentIntentRetrieveOptions,
      options: HeaderOptions,
      response: IResponseFn[IPaymentIntent]
    ): js.Promise[IPaymentIntent] = js.native
    def retrieve(id: String, data: IPaymentIntentRetrieveOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
    def retrieve(id: String, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
    def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
    def retrieve(id: String, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
    def update(id: String, data: IPaymentIntentUpdateOptions): js.Promise[IPaymentIntent] = js.native
    /**
      * Updates a PaymentIntent object.
      */
    def update(id: String, data: IPaymentIntentUpdateOptions, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
    def update(
      id: String,
      data: IPaymentIntentUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[IPaymentIntent]
    ): js.Promise[IPaymentIntent] = js.native
    def update(id: String, data: IPaymentIntentUpdateOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  }
  
  /** https://stripe.com/docs/api/payment_methods */
  @js.native
  class PaymentMethods () extends js.Object {
    def attach(paymentMethodId: String, data: IPaymentMethodAttachOptions): js.Promise[IPaymentMethod] = js.native
    def attach(paymentMethodId: String, data: IPaymentMethodAttachOptions, options: HeaderOptions): js.Promise[IPaymentMethod] = js.native
    def attach(
      paymentMethodId: String,
      data: IPaymentMethodAttachOptions,
      options: HeaderOptions,
      response: IResponseFn[IPaymentMethod]
    ): js.Promise[IPaymentMethod] = js.native
    def attach(paymentMethodId: String, data: IPaymentMethodAttachOptions, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
    def create(data: IPaymentMethodCreationOptions): js.Promise[IPaymentMethod] = js.native
    def create(data: IPaymentMethodCreationOptions, options: HeaderOptions): js.Promise[IPaymentMethod] = js.native
    def create(data: IPaymentMethodCreationOptions, options: HeaderOptions, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
    def create(data: IPaymentMethodCreationOptions, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
    def detach(paymentMethodId: String): js.Promise[IPaymentMethod] = js.native
    def detach(paymentMethodId: String, options: HeaderOptions): js.Promise[IPaymentMethod] = js.native
    def detach(paymentMethodId: String, options: HeaderOptions, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
    def detach(paymentMethodId: String, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
    def list[T /* <: IPaymentMethodType */](data: IPaymentMethodListOptions[T]): IListPromise[Extract[IPaymentMethod, Anon_Type[T]]] = js.native
    def list[T /* <: IPaymentMethodType */](data: IPaymentMethodListOptions[T], options: HeaderOptions): IListPromise[Extract[IPaymentMethod, Anon_Type[T]]] = js.native
    def list[T /* <: IPaymentMethodType */](
      data: IPaymentMethodListOptions[T],
      options: HeaderOptions,
      response: IResponseFn[IList[IPaymentMethod]]
    ): IListPromise[Extract[IPaymentMethod, Anon_Type[T]]] = js.native
    def list[T /* <: IPaymentMethodType */](data: IPaymentMethodListOptions[T], response: IResponseFn[IList[IPaymentMethod]]): IListPromise[Extract[IPaymentMethod, Anon_Type[T]]] = js.native
    def retrieve(paymentMethodId: String): js.Promise[IPaymentMethod] = js.native
    def retrieve(paymentMethodId: String, options: HeaderOptions): js.Promise[IPaymentMethod] = js.native
    def retrieve(paymentMethodId: String, options: HeaderOptions, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
    def retrieve(paymentMethodId: String, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
    def update(paymentMethodId: String, data: IPaymentMethodUpdateOptions): js.Promise[IPaymentMethod] = js.native
    def update(paymentMethodId: String, data: IPaymentMethodUpdateOptions, options: HeaderOptions): js.Promise[IPaymentMethod] = js.native
    def update(
      paymentMethodId: String,
      data: IPaymentMethodUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[IPaymentMethod]
    ): js.Promise[IPaymentMethod] = js.native
    def update(paymentMethodId: String, data: IPaymentMethodUpdateOptions, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
  }
  
  @js.native
  class Payouts () extends StripeResource {
    def cancel(payoutId: String): js.Promise[IPayout] = js.native
    /**
      * A previously created payout can be canceled if it has not yet been paid out. Funds will be refunded to your available balance, and the fees you were originally charged on the payout will be refunded.
      * You may not cancel automatic Stripe payouts.
      */
    def cancel(payoutId: String, options: HeaderOptions): js.Promise[IPayout] = js.native
    def cancel(payoutId: String, options: HeaderOptions, response: IResponseFn[IPayout]): js.Promise[IPayout] = js.native
    def cancel(payoutId: String, response: IResponseFn[IPayout]): js.Promise[IPayout] = js.native
    def create(data: IPayoutCreationOptions): js.Promise[IPayout] = js.native
    /**
      * To send funds to your own bank account, you create a new payout object. Your Stripe balance must be able to cover the payout amount, or you’ll receive an “Insufficient Funds” error.
      *
      * If your API key is in test mode, money won’t actually be sent, though everything else will occur as if in live mode.
      *
      * If you are creating a manual payout on a Stripe account that uses multiple payment source types, you’ll need to specify the source type balance that the payout should draw from.
      * The balance object details available and pending amounts by source type.
      *
      */
    def create(data: IPayoutCreationOptions, options: HeaderOptions): js.Promise[IPayout] = js.native
    def create(data: IPayoutCreationOptions, options: HeaderOptions, response: IResponseFn[IPayout]): js.Promise[IPayout] = js.native
    def create(data: IPayoutCreationOptions, response: IResponseFn[IPayout]): js.Promise[IPayout] = js.native
    def list(): IListPromise[IPayout] = js.native
    def list(data: IPayoutListOptions): IListPromise[IPayout] = js.native
    /**
      * Returns a list of existing payouts sent to third-party bank accounts or that Stripe has sent you. The payouts are returned in sorted order, with the most recently created payouts appearing first.
      */
    def list(data: IPayoutListOptions, options: HeaderOptions): IListPromise[IPayout] = js.native
    def list(data: IPayoutListOptions, options: HeaderOptions, response: IResponseFn[IList[IPayout]]): IListPromise[IPayout] = js.native
    def list(data: IPayoutListOptions, response: IResponseFn[IList[IPayout]]): IListPromise[IPayout] = js.native
    def list(options: HeaderOptions): IListPromise[IPayout] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[IPayout]]): IListPromise[IPayout] = js.native
    def list(response: IResponseFn[IList[IPayout]]): IListPromise[IPayout] = js.native
    def retrieve(payoutId: String): js.Promise[IPayout] = js.native
    /**
      * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout creation request or the payout list, and Stripe will return the corresponding payout information.
      */
    def retrieve(payoutId: String, options: HeaderOptions): js.Promise[IPayout] = js.native
    def retrieve(payoutId: String, options: HeaderOptions, response: IResponseFn[IPayout]): js.Promise[IPayout] = js.native
    def retrieve(payoutId: String, response: IResponseFn[IPayout]): js.Promise[IPayout] = js.native
    def update(payoutId: String, data: IDataOptionsWithMetadata): js.Promise[IPayout] = js.native
    /**
      * Updates the specified payout by setting the values of the parameters passed. Any parameters not provided will be left unchanged. This request accepts only the metadata as arguments.
      */
    def update(payoutId: String, data: IDataOptionsWithMetadata, options: HeaderOptions): js.Promise[IPayout] = js.native
    def update(
      payoutId: String,
      data: IDataOptionsWithMetadata,
      options: HeaderOptions,
      response: IResponseFn[IPayout]
    ): js.Promise[IPayout] = js.native
    def update(payoutId: String, data: IDataOptionsWithMetadata, response: IResponseFn[IPayout]): js.Promise[IPayout] = js.native
  }
  
  @js.native
  class Plans () extends StripeResource {
    def create(data: IPlanCreationOptions): js.Promise[IPlan] = js.native
    /**
      * You can create plans easily via the plan management page of the Stripe dashboard. Plan creation is also
      * accessible via the API if you need to create plans on the fly.
      *
      * @returns The newly created plan
      *
      * @param data Creation options for the new plan.
      */
    def create(data: IPlanCreationOptions, options: HeaderOptions): js.Promise[IPlan] = js.native
    def create(data: IPlanCreationOptions, options: HeaderOptions, response: IResponseFn[IPlan]): js.Promise[IPlan] = js.native
    def create(data: IPlanCreationOptions, response: IResponseFn[IPlan]): js.Promise[IPlan] = js.native
    def del(planName: String): js.Promise[IDeleteConfirmation] = js.native
    /**
      * You can delete plans via the plan management page of the Stripe dashboard. However, deleting a plan does not affect
      * any current subscribers to the plan; it merely means that new subscribers can't be added to that plan. You can also
      * delete plans via the API.
      *
      * @returns An object with the deleted plan's ID and a deleted flag upon success. Otherwise, this call throws an error, such as if the plan has already been deleted.
      *
      * @param planName The identifier of the plan to be deleted.
      */
    def del(planName: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
    def del(planName: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
    def del(planName: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
    def list(): IListPromise[IPlan] = js.native
    def list(data: IPlanListOptions): IListPromise[IPlan] = js.native
    /**
      * Returns a list of your plans.
      *
      * @returns An object with a data property that contains an array of up to limit plans, starting after plan starting_after.
      * Each entry in the array is a separate plan object. If no more plans are available, the resulting array will be empty. This
      * request should never throw an error. You can optionally request that the response include the total count of all plans. To
      * do so, specify include[]=total_count in your request.
      */
    def list(data: IPlanListOptions, options: HeaderOptions): IListPromise[IPlan] = js.native
    def list(data: IPlanListOptions, options: HeaderOptions, response: IResponseFn[IList[IPlan]]): IListPromise[IPlan] = js.native
    def list(data: IPlanListOptions, response: IResponseFn[IList[IPlan]]): IListPromise[IPlan] = js.native
    def list(options: HeaderOptions): IListPromise[IPlan] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[IPlan]]): IListPromise[IPlan] = js.native
    def list(response: IResponseFn[IList[IPlan]]): IListPromise[IPlan] = js.native
    def retrieve(planName: String): js.Promise[IPlan] = js.native
    /**
      * Retrieves the plan with the given ID.
      *
      * @returns Returns a plan if a valid plan ID was provided. Throws an error otherwise.
      *
      * @param planName The identifier of the desired plan.
      */
    def retrieve(planName: String, options: HeaderOptions): js.Promise[IPlan] = js.native
    def retrieve(planName: String, options: HeaderOptions, response: IResponseFn[IPlan]): js.Promise[IPlan] = js.native
    def retrieve(planName: String, response: IResponseFn[IPlan]): js.Promise[IPlan] = js.native
    def update(planName: String, data: IPlanUpdateOptions): js.Promise[IPlan] = js.native
    /**
      * Updates the name of a plan. Other plan details (price, interval, etc.) are, by design, not editable.
      *
      * @returns The updated plan object is returned upon success. Otherwise, this call throws an error.
      *
      * @param planName The identifier of the plan to update
      * @param data The fields to update
      */
    def update(planName: String, data: IPlanUpdateOptions, options: HeaderOptions): js.Promise[IPlan] = js.native
    def update(planName: String, data: IPlanUpdateOptions, options: HeaderOptions, response: IResponseFn[IPlan]): js.Promise[IPlan] = js.native
    def update(planName: String, data: IPlanUpdateOptions, response: IResponseFn[IPlan]): js.Promise[IPlan] = js.native
  }
  
  @js.native
  class Products () extends js.Object {
    def create(data: IProductCreationOptions): js.Promise[IProduct] = js.native
    /**
      * Creates a new product object.
      */
    def create(data: IProductCreationOptions, options: HeaderOptions): js.Promise[IProduct] = js.native
    def create(data: IProductCreationOptions, options: HeaderOptions, response: IResponseFn[IProduct]): js.Promise[IProduct] = js.native
    def create(data: IProductCreationOptions, response: IResponseFn[IProduct]): js.Promise[IProduct] = js.native
    def del(productId: String): js.Promise[IDeleteConfirmation] = js.native
    /**
      * Delete a product. Deleting a product is only possible if it has no SKUs associated with it.
      */
    def del(productId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
    def del(productId: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
    def del(productId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
    def list(): IListPromise[IProduct] = js.native
    def list(data: IProductListOptions): IListPromise[IProduct] = js.native
    /**
      * Returns a list of your products. The products are returned sorted by creation date, with the most recently created products appearing first.
      */
    def list(data: IProductListOptions, options: HeaderOptions): IListPromise[IProduct] = js.native
    def list(data: IProductListOptions, options: HeaderOptions, response: IResponseFn[IList[IProduct]]): IListPromise[IProduct] = js.native
    def list(data: IProductListOptions, response: IResponseFn[IList[IProduct]]): IListPromise[IProduct] = js.native
    def list(options: HeaderOptions): IListPromise[IProduct] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[IProduct]]): IListPromise[IProduct] = js.native
    def list(response: IResponseFn[IList[IProduct]]): IListPromise[IProduct] = js.native
    def retrieve(productId: String): js.Promise[IProduct] = js.native
    def retrieve(productId: String, data: IDataOptions): js.Promise[IProduct] = js.native
    /**
      * Retrieves the details of an existing product. Supply the unique product ID from either a product creation request or the product
      * list, and Stripe will return the corresponding product information.
      */
    def retrieve(productId: String, data: IDataOptions, options: HeaderOptions): js.Promise[IProduct] = js.native
    def retrieve(productId: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IProduct]): js.Promise[IProduct] = js.native
    def retrieve(productId: String, data: IDataOptions, response: IResponseFn[IProduct]): js.Promise[IProduct] = js.native
    def retrieve(productId: String, options: HeaderOptions): js.Promise[IProduct] = js.native
    def retrieve(productId: String, options: HeaderOptions, response: IResponseFn[IProduct]): js.Promise[IProduct] = js.native
    def retrieve(productId: String, response: IResponseFn[IProduct]): js.Promise[IProduct] = js.native
    def update(productId: String, data: IProductUpdateOptions): js.Promise[IProduct] = js.native
    /**
      * Updates the specific product by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
      *
      * Note that a product's attributes are not editable. Instead, you would need to deactivate the existing product and create a new one
      * with the new attribute values.
      */
    def update(productId: String, data: IProductUpdateOptions, options: HeaderOptions): js.Promise[IProduct] = js.native
    def update(
      productId: String,
      data: IProductUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[IProduct]
    ): js.Promise[IProduct] = js.native
    def update(productId: String, data: IProductUpdateOptions, response: IResponseFn[IProduct]): js.Promise[IProduct] = js.native
  }
  
  /**
    * @deprecated
    */
  @js.native
  class RecipientCards () extends StripeResource {
    /**
      * @deprecated
      */
    def create(): Unit = js.native
    // options: IDataOptions
    /**
      * @deprecated
      */
    def del(id: String): Unit = js.native
    /**
      * @deprecated
      */
    def list(): Unit = js.native
    /**
      * @deprecated
      */
    def retrieve(id: String): Unit = js.native
    /**
      * @deprecated
      */
    def update(id: String): Unit = js.native
  }
  
  /**
    * @deprecated
    */
  @js.native
  class Recipients () extends StripeResource {
    /**
      * @deprecated
      */
    def create(): Unit = js.native
    // options: IDataOptions
    /**
      * @deprecated
      */
    def del(id: String): Unit = js.native
    /**
      * @deprecated
      */
    def list(): Unit = js.native
    /**
      * @deprecated
      */
    def retrieve(id: String): Unit = js.native
    /**
      * @deprecated
      */
    def update(id: String): Unit = js.native
  }
  
  @js.native
  class Refunds () extends StripeResource {
    def create(data: IRefundCreationOptionsWithCharge): js.Promise[IRefund] = js.native
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
    def create(data: IRefundCreationOptionsWithCharge, options: HeaderOptions): js.Promise[IRefund] = js.native
    def create(data: IRefundCreationOptionsWithCharge, options: HeaderOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def create(data: IRefundCreationOptionsWithCharge, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def list(): IListPromise[IRefund] = js.native
    def list(data: IRefundListOptions): IListPromise[IRefund] = js.native
    /**
      * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted order,
      * with the most recent refunds appearing first.
      * For convenience, the 10 most recent refunds are always available by default on the charge object.
      */
    def list(data: IRefundListOptions, options: HeaderOptions): IListPromise[IRefund] = js.native
    def list(data: IRefundListOptions, options: HeaderOptions, response: IResponseFn[IList[IRefund]]): IListPromise[IRefund] = js.native
    def list(data: IRefundListOptions, response: IResponseFn[IList[IRefund]]): IListPromise[IRefund] = js.native
    def list(options: HeaderOptions): IListPromise[IRefund] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[IRefund]]): IListPromise[IRefund] = js.native
    def list(response: IResponseFn[IList[IRefund]]): IListPromise[IRefund] = js.native
    def retrieve(id: String): js.Promise[IRefund] = js.native
    def retrieve(id: String, data: IDataOptions): js.Promise[IRefund] = js.native
    /**
      * Retrieves the details of an existing refund.
      */
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IRefund] = js.native
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def retrieve(id: String, data: IDataOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def retrieve(id: String, options: HeaderOptions): js.Promise[IRefund] = js.native
    def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def retrieve(id: String, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def update(id: String, data: IDataOptionsWithMetadata): js.Promise[IRefund] = js.native
    /**
      * Updates the specified refund by setting the values of the parameters passed.
      * Any parameters not provided will be left unchanged.
      *
      * This request only accepts metadata as an argument.
      */
    def update(id: String, data: IDataOptionsWithMetadata, options: HeaderOptions): js.Promise[IRefund] = js.native
    def update(id: String, data: IDataOptionsWithMetadata, options: HeaderOptions, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
    def update(id: String, data: IDataOptionsWithMetadata, response: IResponseFn[IRefund]): js.Promise[IRefund] = js.native
  }
  
  @js.native
  class SKUs () extends js.Object {
    def create(data: ISkuCreationOptions): js.Promise[ISku] = js.native
    /**
      * Creates a new SKU associated with a product.
      */
    def create(data: ISkuCreationOptions, options: HeaderOptions): js.Promise[ISku] = js.native
    def create(data: ISkuCreationOptions, options: HeaderOptions, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
    def create(data: ISkuCreationOptions, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
    def del(skuId: String): js.Promise[IDeleteConfirmation] = js.native
    /**
      * Delete a SKU. Deleting a SKU is only possible until it has been used in an order.
      */
    def del(skuId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
    def del(skuId: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
    def del(skuId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
    def list(): IListPromise[ISku] = js.native
    def list(data: ISkuListOptions): IListPromise[ISku] = js.native
    /**
      * Returns a list of your SKUs. The SKUs are returned sorted by creation date, with the most recently created SKUs appearing first.
      */
    def list(data: ISkuListOptions, options: HeaderOptions): IListPromise[ISku] = js.native
    def list(data: ISkuListOptions, options: HeaderOptions, response: IResponseFn[IList[ISku]]): IListPromise[ISku] = js.native
    def list(data: ISkuListOptions, response: IResponseFn[IList[ISku]]): IListPromise[ISku] = js.native
    def list(options: HeaderOptions): IListPromise[ISku] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[ISku]]): IListPromise[ISku] = js.native
    def list(response: IResponseFn[IList[ISku]]): IListPromise[ISku] = js.native
    def retrieve(skuId: String): js.Promise[ISku] = js.native
    def retrieve(skuId: String, data: IDataOptions): js.Promise[ISku] = js.native
    /**
      * Retrieves the details of an existing SKU. Supply the unique SKU identifier from either a SKU creation request or from the
      * product, and Stripe will return the corresponding SKU information.
      */
    def retrieve(skuId: String, data: IDataOptions, options: HeaderOptions): js.Promise[ISku] = js.native
    def retrieve(skuId: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
    def retrieve(skuId: String, data: IDataOptions, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
    def retrieve(skuId: String, options: HeaderOptions): js.Promise[ISku] = js.native
    def retrieve(skuId: String, options: HeaderOptions, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
    def retrieve(skuId: String, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
    def update(skuId: String, data: ISkuUpdateOptions): js.Promise[ISku] = js.native
    /**
      * Updates the specific SKU by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
      *
      * Note that a SKU's attributes are not editable. Instead, you would need to deactivate the existing SKU and create a new one with
      * the new attribute values.
      */
    def update(skuId: String, data: ISkuUpdateOptions, options: HeaderOptions): js.Promise[ISku] = js.native
    def update(skuId: String, data: ISkuUpdateOptions, options: HeaderOptions, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
    def update(skuId: String, data: ISkuUpdateOptions, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
  }
  
  @js.native
  class Sessions () extends StripeResource {
    def create(data: ICheckoutCreationOptions): js.Promise[ICheckoutSession] = js.native
    def create(data: ICheckoutCreationOptions, response: IResponseFn[ICheckoutSession]): js.Promise[ICheckoutSession] = js.native
    def retrieve(data: String): js.Promise[ICheckoutSession] = js.native
    def retrieve(data: String, options: HeaderOptions): js.Promise[ICheckoutSession] = js.native
    def retrieve(data: String, options: HeaderOptions, response: IResponseFn[ICheckoutSession]): js.Promise[ICheckoutSession] = js.native
    def retrieve(data: String, response: IResponseFn[ICheckoutSession]): js.Promise[ICheckoutSession] = js.native
  }
  
  @js.native
  class SetupIntents () extends StripeResource {
    def cancel(intent: String): js.Promise[ISetupIntent] = js.native
    def cancel(intent: String, data: Anon_CancellationreasonSetupIntentCancelationReason): js.Promise[ISetupIntent] = js.native
    /**
      * A SetupIntent object can be canceled when it is in one of these statuses:
      * `requires_payment_method`, `requires_capture`, `requires_confirmation`, `requires_action`.
      *
      * Once canceled, setup is abandoned and any operations on the SetupIntent will fail
      * with an error.
      *
      * @returns Returns a SetupIntent object if the cancellation succeeded. Returns an error if the SetupIntent has already been canceled or is not in a cancelable state.
      */
    def cancel(intent: String, data: Anon_CancellationreasonSetupIntentCancelationReason, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
    def cancel(
      intent: String,
      data: Anon_CancellationreasonSetupIntentCancelationReason,
      options: HeaderOptions,
      response: IResponseFn[ISetupIntent]
    ): js.Promise[ISetupIntent] = js.native
    def cancel(
      intent: String,
      data: Anon_CancellationreasonSetupIntentCancelationReason,
      response: IResponseFn[ISetupIntent]
    ): js.Promise[ISetupIntent] = js.native
    def cancel(intent: String, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
    def cancel(intent: String, options: HeaderOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
    def cancel(intent: String, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
    def confirm(intent: String): js.Promise[ISetupIntent] = js.native
    def confirm(intent: String, data: ISetupIntentConfirmOptions): js.Promise[ISetupIntent] = js.native
    /**
      * Confirm that your customer intends to set up the current or provided payment method.
      * For example, you would confirm a SetupIntent when a customer hits the “Save” button
      * on a payment method management page on your website.
      *
      * If the selected payment method does not require any additional steps from the customer,
      * the SetupIntent will transition to the `succeeded` status.
      *
      * Otherwise, it will transition to the `requires_action` status and suggest additional
      * actions via `next_action`. If setup fails, the SetupIntent will transition to the
      * `requires_payment_method` status.
      */
    def confirm(intent: String, data: ISetupIntentConfirmOptions, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
    def confirm(
      intent: String,
      data: ISetupIntentConfirmOptions,
      options: HeaderOptions,
      response: IResponseFn[ISetupIntent]
    ): js.Promise[ISetupIntent] = js.native
    def confirm(intent: String, data: ISetupIntentConfirmOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
    def confirm(intent: String, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
    def confirm(intent: String, options: HeaderOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
    def confirm(intent: String, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
    def create(data: ISetupIntentCreationOptions): js.Promise[ISetupIntent] = js.native
    /**
      * Creates a SetupIntent object.
      *
      * After the SetupIntent is created, attach a payment method and confirm to collect
      * any required permissions to charge the payment method later.
      */
    def create(data: ISetupIntentCreationOptions, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
    def create(data: ISetupIntentCreationOptions, options: HeaderOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
    def create(data: ISetupIntentCreationOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
    def list(): IListPromise[ISetupIntent] = js.native
    def list(data: ISetupIntentListOptions): IListPromise[ISetupIntent] = js.native
    /**
      * Returns a list of SetupIntents.
      *
      * @returns An object with a data property that contains an array of up to limit SetupIntents, starting after SetupIntent starting_after. Each entry in the array is a separate SetupIntent object. If no more SetupIntents are available, the resulting array will be empty. This request should never throw an error.
      */
    def list(data: ISetupIntentListOptions, options: HeaderOptions): IListPromise[ISetupIntent] = js.native
    def list(data: ISetupIntentListOptions, options: HeaderOptions, response: IResponseFn[IList[ISetupIntent]]): IListPromise[ISetupIntent] = js.native
    def list(data: ISetupIntentListOptions, response: IResponseFn[IList[ISetupIntent]]): IListPromise[ISetupIntent] = js.native
    def list(options: HeaderOptions): IListPromise[ISetupIntent] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[ISetupIntent]]): IListPromise[ISetupIntent] = js.native
    def list(response: IResponseFn[IList[ISetupIntent]]): IListPromise[ISetupIntent] = js.native
    def retrieve(intent: String): js.Promise[ISetupIntent] = js.native
    def retrieve(intent: String, data: ISetupIntentRetrieveOptions): js.Promise[ISetupIntent] = js.native
    /**
      * Retrieves the details of a SetupIntent that has previously been created.
      *
      * Client-side retrieval using a publishable key is allowed when the `client_secret`
      * is provided in the query string.
      *
      * When retrieved with a publishable key, only a subset of properties will be returned.
      * Please refer to the SetupIntent object reference for more details.
      */
    def retrieve(intent: String, data: ISetupIntentRetrieveOptions, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
    def retrieve(
      intent: String,
      data: ISetupIntentRetrieveOptions,
      options: HeaderOptions,
      response: IResponseFn[ISetupIntent]
    ): js.Promise[ISetupIntent] = js.native
    def retrieve(intent: String, data: ISetupIntentRetrieveOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
    def retrieve(intent: String, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
    def retrieve(intent: String, options: HeaderOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
    def retrieve(intent: String, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
    def update(intent: String, data: ISetupIntentUpdateOptions): js.Promise[ISetupIntent] = js.native
    /**
      * Updates a SetupIntent object.
      */
    def update(intent: String, data: ISetupIntentUpdateOptions, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
    def update(
      intent: String,
      data: ISetupIntentUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[ISetupIntent]
    ): js.Promise[ISetupIntent] = js.native
    def update(intent: String, data: ISetupIntentUpdateOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
  }
  
  @js.native
  class Sources () extends StripeResource {
    def create(data: ISourceCreationOptions): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    /** Create Source: https://stripe.com/docs/api/sources/create */
    def create(data: ISourceCreationOptions, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    def create(
      data: ISourceCreationOptions,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.sourcesNs.ISource]
    ): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    def create(data: ISourceCreationOptions, response: IResponseFn[typings.stripe.stripeMod.sourcesNs.ISource]): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    def retrieve(id: String): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    def retrieve(id: String, data: js.UndefOr[scala.Nothing], options: HeaderOptions): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    def retrieve(
      id: String,
      data: js.UndefOr[scala.Nothing],
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.sourcesNs.ISource]
    ): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    def retrieve(id: String, data: ISourceRetrieveOptions): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    /** Retrieve Source: https://stripe.com/docs/api/sources/retrieve */
    def retrieve(id: String, data: ISourceRetrieveOptions, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    def retrieve(
      id: String,
      data: ISourceRetrieveOptions,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.sourcesNs.ISource]
    ): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    def retrieve(
      id: String,
      data: ISourceRetrieveOptions,
      response: IResponseFn[typings.stripe.stripeMod.sourcesNs.ISource]
    ): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    def update(id: String, data: ISourceUpdateOptions): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    /** Update Source: https://stripe.com/docs/api/sources/update */
    def update(id: String, data: ISourceUpdateOptions, options: HeaderOptions): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    def update(
      id: String,
      data: ISourceUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[typings.stripe.stripeMod.sourcesNs.ISource]
    ): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
    def update(
      id: String,
      data: ISourceUpdateOptions,
      response: IResponseFn[typings.stripe.stripeMod.sourcesNs.ISource]
    ): js.Promise[typings.stripe.stripeMod.sourcesNs.ISource] = js.native
  }
  
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
  
  @js.native
  class Subscriptions () extends SubscriptionsBase {
    def create(data: ISubscriptionCreationOptions): js.Promise[ISubscription] = js.native
    /**
      * Creates a new subscription on an existing customer.
      *
      * @returns The newly created subscription object if the call succeeded. If the customer has no card or the
      * attempted charge fails, this call throws an error (unless the specified plan is free or has a trial
      * period).
      *
      * @param options The options for the new subscription
      */
    def create(data: ISubscriptionCreationOptions, options: HeaderOptions): js.Promise[ISubscription] = js.native
    def create(data: ISubscriptionCreationOptions, options: HeaderOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
    def create(data: ISubscriptionCreationOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
  }
  
  @js.native
  class SubscriptionsBase () extends StripeResource {
    def del(subscriptionId: String): js.Promise[ISubscription] = js.native
    def del(subscriptionId: String, data: ISubscriptionCancellationOptions): js.Promise[ISubscription] = js.native
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
    def del(subscriptionId: String, data: ISubscriptionCancellationOptions, options: HeaderOptions): js.Promise[ISubscription] = js.native
    def del(
      subscriptionId: String,
      data: ISubscriptionCancellationOptions,
      options: HeaderOptions,
      response: IResponseFn[ISubscription]
    ): js.Promise[ISubscription] = js.native
    def del(
      subscriptionId: String,
      data: ISubscriptionCancellationOptions,
      response: IResponseFn[ISubscription]
    ): js.Promise[ISubscription] = js.native
    def del(subscriptionId: String, options: HeaderOptions): js.Promise[ISubscription] = js.native
    def del(subscriptionId: String, options: HeaderOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
    def del(subscriptionId: String, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
    def deleteDiscount(subscriptionId: String): js.Promise[IDeleteConfirmation] = js.native
    /**
      * Removes the currently applied discount on a subscription.
      *
      * @returns An object with a deleted flag set to true upon success. This call throws an error otherwise, such as if no
      * discount exists on this subscription.
      *
      * @param subscriptionId The ID of the subscription.
      */
    def deleteDiscount(subscriptionId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
    def deleteDiscount(subscriptionId: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
    def deleteDiscount(subscriptionId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
    def list(): IListPromise[ISubscription] = js.native
    def list(data: ISubscriptionListOptions): IListPromise[ISubscription] = js.native
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
    def list(data: ISubscriptionListOptions, options: HeaderOptions): IListPromise[ISubscription] = js.native
    def list(
      data: ISubscriptionListOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[ISubscription]]
    ): IListPromise[ISubscription] = js.native
    def list(data: ISubscriptionListOptions, response: IResponseFn[IList[ISubscription]]): IListPromise[ISubscription] = js.native
    def list(options: HeaderOptions): IListPromise[ISubscription] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[ISubscription]]): IListPromise[ISubscription] = js.native
    def list(response: IResponseFn[IList[ISubscription]]): IListPromise[ISubscription] = js.native
    def retrieve(subscriptionId: String): js.Promise[ISubscription] = js.native
    /**
      * By default, you can see the 10 most recent active subscriptions stored on a customer directly on the customer
      * object, but you can also retrieve details about a specific active subscription for a customer.
      *
      * @returns Returns the subscription object.
      *
      * @param subscriptionId The ID of the subscription to retrieve
      */
    def retrieve(subscriptionId: String, options: HeaderOptions): js.Promise[ISubscription] = js.native
    def retrieve(subscriptionId: String, options: HeaderOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
    def retrieve(subscriptionId: String, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
    def update(subscriptionId: String, data: ISubscriptionUpdateOptions): js.Promise[ISubscription] = js.native
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
    def update(subscriptionId: String, data: ISubscriptionUpdateOptions, options: HeaderOptions): js.Promise[ISubscription] = js.native
    def update(
      subscriptionId: String,
      data: ISubscriptionUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[ISubscription]
    ): js.Promise[ISubscription] = js.native
    def update(subscriptionId: String, data: ISubscriptionUpdateOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
  }
  
  @js.native
  class Tokens () extends StripeResource {
    def create(data: IBankAccountTokenCreationOptions): js.Promise[IBankAccountToken] = js.native
    /**
      * Creates a single use token that wraps the details of a bank account. This token can be used
      * in place of a bank account object with any API method. These tokens can only be used once:
      * by attaching them to a recipient or managed account.
      */
    def create(data: IBankAccountTokenCreationOptions, options: HeaderOptions): js.Promise[IBankAccountToken] = js.native
    def create(
      data: IBankAccountTokenCreationOptions,
      options: HeaderOptions,
      response: IResponseFn[IBankAccountToken]
    ): js.Promise[IBankAccountToken] = js.native
    def create(data: IBankAccountTokenCreationOptions, response: IResponseFn[IBankAccountToken]): js.Promise[IBankAccountToken] = js.native
    def create(data: ICardTokenCreationOptions): js.Promise[ICardToken] = js.native
    /**
      * Creates a single use token that wraps the details of a credit card. This token can be used
      * in place of a credit card object with any API method. These tokens can only be used once:
      * by creating a new charge object, or attaching them to a customer.
      */
    def create(data: ICardTokenCreationOptions, options: HeaderOptions): js.Promise[ICardToken] = js.native
    def create(data: ICardTokenCreationOptions, options: HeaderOptions, response: IResponseFn[ICardToken]): js.Promise[ICardToken] = js.native
    def create(data: ICardTokenCreationOptions, response: IResponseFn[ICardToken]): js.Promise[ICardToken] = js.native
    def create(data: IPiiTokenCreationOptions): js.Promise[IToken] = js.native
    /**
      * Creates a single use token that wraps the details of personally identifiable information (PII).
      * This token can be used in place of a personal_id_number in the Account Update API method.
      * These tokens can only be used once.
      */
    def create(data: IPiiTokenCreationOptions, options: HeaderOptions): js.Promise[IToken] = js.native
    def create(data: IPiiTokenCreationOptions, options: HeaderOptions, response: IResponseFn[IToken]): js.Promise[IToken] = js.native
    def create(data: IPiiTokenCreationOptions, response: IResponseFn[IToken]): js.Promise[IToken] = js.native
    def retrieve(tokenId: String): js.Promise[IToken] = js.native
    def retrieve(tokenId: String, data: IDataOptions): js.Promise[IToken] = js.native
    /**
      * Retrieves the token with the given ID.
      */
    def retrieve(tokenId: String, data: IDataOptions, options: HeaderOptions): js.Promise[IToken] = js.native
    def retrieve(tokenId: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IToken]): js.Promise[IToken] = js.native
    def retrieve(tokenId: String, data: IDataOptions, response: IResponseFn[IToken]): js.Promise[IToken] = js.native
    def retrieve(tokenId: String, options: HeaderOptions): js.Promise[IToken] = js.native
    def retrieve(tokenId: String, options: HeaderOptions, response: IResponseFn[IToken]): js.Promise[IToken] = js.native
    def retrieve(tokenId: String, response: IResponseFn[IToken]): js.Promise[IToken] = js.native
  }
  
  @js.native
  class TransferReversals () extends StripeResource {
    def create(): js.Promise[IReversal] = js.native
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
    def create(data: IReversalCreationOptions, options: HeaderOptions): js.Promise[IReversal] = js.native
    def create(data: IReversalCreationOptions, options: HeaderOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
    def create(options: HeaderOptions): js.Promise[IReversal] = js.native
    def create(options: HeaderOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
    def create(response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
    def list(): IListPromise[IReversal] = js.native
    def list(data: IListOptions): IListPromise[IReversal] = js.native
    /**
      * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most recent reversals are always available by
      * default on the transfer object. If you need more than those 10, you can use this API method and the limit and starting_after
      * parameters to page through additional reversals.
      */
    def list(data: IListOptions, options: HeaderOptions): IListPromise[IReversal] = js.native
    def list(data: IListOptions, options: HeaderOptions, response: IResponseFn[IList[IReversal]]): IListPromise[IReversal] = js.native
    def list(data: IListOptions, response: IResponseFn[IList[IReversal]]): IListPromise[IReversal] = js.native
    def list(options: HeaderOptions): IListPromise[IReversal] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[IReversal]]): IListPromise[IReversal] = js.native
    def list(response: IResponseFn[IList[IReversal]]): IListPromise[IReversal] = js.native
    def retrieve(reversalId: String): js.Promise[IReversal] = js.native
    def retrieve(reversalId: String, data: IDataOptions): js.Promise[IReversal] = js.native
    /**
      * By default, you can see the 10 most recent reversals stored directly on the transfer object, but you can also retrieve details about a
      * specific reversal stored on the transfer.
      */
    def retrieve(reversalId: String, data: IDataOptions, options: HeaderOptions): js.Promise[IReversal] = js.native
    def retrieve(reversalId: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
    def retrieve(reversalId: String, data: IDataOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
    def retrieve(reversalId: String, options: HeaderOptions): js.Promise[IReversal] = js.native
    def retrieve(reversalId: String, options: HeaderOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
    def retrieve(reversalId: String, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
    def update(reversalId: String, data: IReversalUpdateOptions): js.Promise[IReversal] = js.native
    /**
      * Updates the specified reversal by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
      *
      * This request only accepts metadata and description as arguments.
      */
    def update(reversalId: String, data: IReversalUpdateOptions, options: HeaderOptions): js.Promise[IReversal] = js.native
    def update(
      reversalId: String,
      data: IReversalUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[IReversal]
    ): js.Promise[IReversal] = js.native
    def update(reversalId: String, data: IReversalUpdateOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
  }
  
  @js.native
  class Transfers () extends StripeResource {
    def cancel(id: String): js.Promise[ITransfer] = js.native
    def cancel(id: String, options: HeaderOptions): js.Promise[ITransfer] = js.native
    def cancel(id: String, options: HeaderOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
    def cancel(id: String, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
    def create(data: ITransferCreationOptions): js.Promise[ITransfer] = js.native
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
    def create(data: ITransferCreationOptions, options: HeaderOptions): js.Promise[ITransfer] = js.native
    def create(data: ITransferCreationOptions, options: HeaderOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
    def create(data: ITransferCreationOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
    def createReversal(transferId: String): js.Promise[IReversal] = js.native
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
    def createReversal(transferId: String, data: IReversalCreationOptions, options: HeaderOptions): js.Promise[IReversal] = js.native
    def createReversal(
      transferId: String,
      data: IReversalCreationOptions,
      options: HeaderOptions,
      response: IResponseFn[IReversal]
    ): js.Promise[IReversal] = js.native
    def createReversal(transferId: String, options: HeaderOptions): js.Promise[IReversal] = js.native
    def createReversal(transferId: String, options: HeaderOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
    def createReversal(transferId: String, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
     // TODO: Implement placeholder method
    def getMetadata(): Unit = js.native
    def list(): IListPromise[ITransfer] = js.native
    def list(data: ITransferListOptions): IListPromise[ITransfer] = js.native
    /**
      * Returns a list of existing transfers sent to third-party bank accounts or that Stripe has sent you. The transfers are
      * returned in sorted order, with the most recently created transfers appearing first.
      */
    def list(data: ITransferListOptions, options: HeaderOptions): IListPromise[ITransfer] = js.native
    def list(data: ITransferListOptions, options: HeaderOptions, response: IResponseFn[IList[ITransfer]]): IListPromise[ITransfer] = js.native
    def list(data: ITransferListOptions, response: IResponseFn[IList[ITransfer]]): IListPromise[ITransfer] = js.native
    def list(options: HeaderOptions): IListPromise[ITransfer] = js.native
    def list(options: HeaderOptions, response: IResponseFn[IList[ITransfer]]): IListPromise[ITransfer] = js.native
    def list(response: IResponseFn[IList[ITransfer]]): IListPromise[ITransfer] = js.native
    def listReversals(transferId: String): IListPromise[IReversal] = js.native
    def listReversals(transferId: String, data: IListOptions): IListPromise[IReversal] = js.native
    /**
      * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most recent reversals are always available by
      * default on the transfer object. If you need more than those 10, you can use this API method and the limit and starting_after
      * parameters to page through additional reversals.
      */
    def listReversals(transferId: String, data: IListOptions, options: HeaderOptions): IListPromise[IReversal] = js.native
    def listReversals(
      transferId: String,
      data: IListOptions,
      options: HeaderOptions,
      response: IResponseFn[IList[IReversal]]
    ): IListPromise[IReversal] = js.native
    def listReversals(transferId: String, data: IListOptions, response: IResponseFn[IList[IReversal]]): IListPromise[IReversal] = js.native
    def listReversals(transferId: String, options: HeaderOptions): IListPromise[IReversal] = js.native
    def listReversals(transferId: String, options: HeaderOptions, response: IResponseFn[IList[IReversal]]): IListPromise[IReversal] = js.native
    def listReversals(transferId: String, response: IResponseFn[IList[IReversal]]): IListPromise[IReversal] = js.native
     // TODO: Not sure if this should be a list of balance transactions or charges.
    def listTransactions(): IListPromise[ICharge] = js.native
    def listTransactions(options: HeaderOptions): IListPromise[ICharge] = js.native
    def listTransactions(options: HeaderOptions, response: IResponseFn[IList[ICharge]]): IListPromise[ICharge] = js.native
    def listTransactions(response: IResponseFn[IList[ICharge]]): IListPromise[ICharge] = js.native
    def retrieve(id: String): js.Promise[ITransfer] = js.native
    def retrieve(id: String, data: IDataOptions): js.Promise[ITransfer] = js.native
    /**
      * Retrieves the details of an existing transfer. Supply the unique transfer ID from either a transfer creation request or
      * the transfer list, and Stripe will return the corresponding transfer information.
      */
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[ITransfer] = js.native
    def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
    def retrieve(id: String, data: IDataOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
    def retrieve(id: String, options: HeaderOptions): js.Promise[ITransfer] = js.native
    def retrieve(id: String, options: HeaderOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
    def retrieve(id: String, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
    def retrieveReversal(transferId: String, reversalId: String): js.Promise[IReversal] = js.native
    /**
      * By default, you can see the 10 most recent reversals stored directly on the transfer object, but you can also retrieve details about a
      * specific reversal stored on the transfer.
      */
    def retrieveReversal(transferId: String, reversalId: String, options: HeaderOptions): js.Promise[IReversal] = js.native
    def retrieveReversal(transferId: String, reversalId: String, options: HeaderOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
    def retrieveReversal(transferId: String, reversalId: String, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
    def reverse(id: String): js.Promise[IReversal] = js.native
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
    def reverse(id: String, data: IReversalCreationOptions, options: HeaderOptions): js.Promise[IReversal] = js.native
    def reverse(
      id: String,
      data: IReversalCreationOptions,
      options: HeaderOptions,
      response: IResponseFn[IReversal]
    ): js.Promise[IReversal] = js.native
    def reverse(id: String, options: HeaderOptions): js.Promise[IReversal] = js.native
    def reverse(id: String, options: HeaderOptions, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
    def reverse(id: String, response: IResponseFn[IReversal]): js.Promise[IReversal] = js.native
    def setMetadata(): Unit = js.native
    def update(id: String, data: ITransferUpdateOptions): js.Promise[ITransfer] = js.native
    /**
      * Updates the specified transfer by setting the values of the parameters passed. Any parameters not provided will be left
      * unchanged.
      *
      * This request accepts only the description and metadata as arguments.
      */
    def update(id: String, data: ITransferUpdateOptions, options: HeaderOptions): js.Promise[ITransfer] = js.native
    def update(id: String, data: ITransferUpdateOptions, options: HeaderOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
    def update(id: String, data: ITransferUpdateOptions, response: IResponseFn[ITransfer]): js.Promise[ITransfer] = js.native
    def updateReversal(transferId: String, reversalId: String, data: IReversalUpdateOptions): js.Promise[IReversal] = js.native
    /**
      * Updates the specified reversal by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
      *
      * This request only accepts metadata and description as arguments.
      */
    def updateReversal(transferId: String, reversalId: String, data: IReversalUpdateOptions, options: HeaderOptions): js.Promise[IReversal] = js.native
    def updateReversal(
      transferId: String,
      reversalId: String,
      data: IReversalUpdateOptions,
      options: HeaderOptions,
      response: IResponseFn[IReversal]
    ): js.Promise[IReversal] = js.native
    def updateReversal(
      transferId: String,
      reversalId: String,
      data: IReversalUpdateOptions,
      response: IResponseFn[IReversal]
    ): js.Promise[IReversal] = js.native
  }
  
  @js.native
  class UsageRecordSummaries () extends StripeResource {
    def list(subscriptionItem: String): js.Promise[IUsageRecordSummaries] = js.native
    /**
      * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
      */
    def list(subscriptionItem: String, options: IListOptions): js.Promise[IUsageRecordSummaries] = js.native
    def list(subscriptionItem: String, options: IListOptions, response: IResponseFn[IUsageRecordSummaries]): js.Promise[IUsageRecordSummaries] = js.native
    def list(subscriptionItem: String, response: IResponseFn[IUsageRecordSummaries]): js.Promise[IUsageRecordSummaries] = js.native
  }
  
  @js.native
  class UsageRecords () extends StripeResource {
    def create(subscription: String, data: IUsageRecordCreationOptions): js.Promise[IUsageRecord] = js.native
    /**
      * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
      */
    def create(subscription: String, data: IUsageRecordCreationOptions, options: HeaderOptions): js.Promise[IUsageRecord] = js.native
    def create(
      subscription: String,
      data: IUsageRecordCreationOptions,
      options: HeaderOptions,
      response: IResponseFn[IUsageRecord]
    ): js.Promise[IUsageRecord] = js.native
    def create(subscription: String, data: IUsageRecordCreationOptions, response: IResponseFn[IUsageRecord]): js.Promise[IUsageRecord] = js.native
  }
  
  @js.native
  class WebHooks () extends js.Object {
    def constructEvent(requestBody: js.Any, signature: String, endpointSecret: String): IEvent = js.native
    def constructEvent(requestBody: js.Any, signature: String, endpointSecret: String, tolerance: Double): IEvent = js.native
    def constructEvent(requestBody: js.Any, signature: js.Array[String], endpointSecret: String): IEvent = js.native
    def constructEvent(requestBody: js.Any, signature: js.Array[String], endpointSecret: String, tolerance: Double): IEvent = js.native
  }
  
}

