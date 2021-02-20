package typings.tizenTvWebapis

import typings.tizenTvWebapis.tizenTvWebapisStrings.DEV
import typings.tizenTvWebapis.tizenTvWebapisStrings.PRD
import typings.tizenTvWebapis.webapisMod.ErrorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object billingMod {
  
  @js.native
  sealed trait TVServerType extends StObject
  @JSImport("tizen-tv-webapis/billing", "TVServerType")
  @js.native
  object TVServerType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TVServerType with String] = js.native
    
    @js.native
    sealed trait DEV extends TVServerType
    /* "DEV" */ val DEV: typings.tizenTvWebapis.billingMod.TVServerType.DEV with String = js.native
    
    @js.native
    sealed trait PRD extends TVServerType
    /* "PRD" */ val PRD: typings.tizenTvWebapis.billingMod.TVServerType.PRD with String = js.native
  }
  
  @js.native
  trait ApplyInvoiceData extends StObject {
    
    var apiResult: String = js.native
  }
  object ApplyInvoiceData {
    
    @scala.inline
    def apply(apiResult: String): ApplyInvoiceData = {
      val __obj = js.Dynamic.literal(apiResult = apiResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyInvoiceData]
    }
    
    @scala.inline
    implicit class ApplyInvoiceDataMutableBuilder[Self <: ApplyInvoiceData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiResult(value: String): Self = StObject.set(x, "apiResult", value.asInstanceOf[js.Any])
    }
  }
  
  type BillingApplyInvoiceCallback = js.Function1[/* data */ ApplyInvoiceData, Unit]
  
  @js.native
  trait BillingBuyData extends StObject {
    
    /**
      * Payment information. It is same with paymentDetails param of buyItem.
      */
    var payDetail: String = js.native
    
    /**
      * Payment result
      */
    var payResult: String = js.native
  }
  object BillingBuyData {
    
    @scala.inline
    def apply(payDetail: String, payResult: String): BillingBuyData = {
      val __obj = js.Dynamic.literal(payDetail = payDetail.asInstanceOf[js.Any], payResult = payResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[BillingBuyData]
    }
    
    @scala.inline
    implicit class BillingBuyDataMutableBuilder[Self <: BillingBuyData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayDetail(value: String): Self = StObject.set(x, "payDetail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayResult(value: String): Self = StObject.set(x, "payResult", value.asInstanceOf[js.Any])
    }
  }
  
  type BillingBuyDataSuccessCallback = js.Function1[/* data */ BillingBuyData, Unit]
  
  type BillingCancelSubscriptionCallback = js.Function1[/* data */ CancelSubscriptionData, Unit]
  
  type BillingGetServiceCountryAvailabilityCallback = js.Function1[/* data */ ServiceCountryAvailabilityData, Unit]
  
  type BillingGetUserPurchaseListCallback = js.Function1[/* data */ UserPurchaseData, Unit]
  
  type BillingIsServiceAvailableCallback = js.Function1[/* data */ ServiceAvailableData, Unit]
  
  @js.native
  trait BillingManager extends StObject {
    
    /**
      * Recodes the apply status of purchase item to DPI server.
      * @param appId Application ID
      * @param customId Same value as "OrderCustomID" parameter for the BuyItem API (Samsung Account UID)
      * @param invoiceId Invoice ID
      * @param countryCode TV country code
      * @param serverType Billing server type
      * @param onsuccess Returns purchase apply status if there is no internal error occurs until client to server data communication
      * apiResult, can still contains error when billing server confirms that the given parameters does not have expected value or have problem while processing it
      * when CPStatus value from apiResult is "100000", it means server communication is done properly and other values are valid in returns
      * @param onerror Optional callback method to invoke if an internal error occurs before the client to server data communication
      * SecurityError, if the application does not have the privilege to call this method.
      * UnknownError, if any other error occurs.
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/billing
      * @throw WebAPIException TypeMismatchError, InvalidValuesError
      * @since 4.0
      */
    def applyInvoice(
      appId: String,
      customId: String,
      invoiceId: String,
      countryCode: String,
      serverType: TVServerType,
      onsuccess: BillingApplyInvoiceCallback
    ): Unit = js.native
    def applyInvoice(
      appId: String,
      customId: String,
      invoiceId: String,
      countryCode: String,
      serverType: TVServerType,
      onsuccess: BillingApplyInvoiceCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    @JSName("applyInvoice")
    def applyInvoice_DEV(
      appId: String,
      customId: String,
      invoiceId: String,
      countryCode: String,
      serverType: DEV,
      onsuccess: BillingApplyInvoiceCallback
    ): Unit = js.native
    @JSName("applyInvoice")
    def applyInvoice_DEV(
      appId: String,
      customId: String,
      invoiceId: String,
      countryCode: String,
      serverType: DEV,
      onsuccess: BillingApplyInvoiceCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    @JSName("applyInvoice")
    def applyInvoice_PRD(
      appId: String,
      customId: String,
      invoiceId: String,
      countryCode: String,
      serverType: PRD,
      onsuccess: BillingApplyInvoiceCallback
    ): Unit = js.native
    @JSName("applyInvoice")
    def applyInvoice_PRD(
      appId: String,
      customId: String,
      invoiceId: String,
      countryCode: String,
      serverType: PRD,
      onsuccess: BillingApplyInvoiceCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    
    /**
      * Enables implementing the Samsung Checkout Client module within the application. After authenticating the purchase information through the application, the user can proceed to purchase payment.
      * @param appId Application ID
      * @param serverType Billing server type
      * @param paymentDetails Payment parameters
      * OrderItemID[MANDATORY]/OrderTitle[MANDATORY]/OrderTotal[MANDATORY]/OrderCurrencyID[MANDATORY]/OrderID[OPTIONAL]/OrderCustomID[MANDATORY]
      * @param onsuccess Returns "payResult" and "payDetail" if there is no internal error occurs until client to server data communication.
      * payResult, can still contains error when billing server confirms that the given parameters does not have expected value or have problem while processing it
      * payDetail, can have additional data when it's returned, such as InvoiceID. Please refer to the development guide of "buyItem" for details
      * @param onerror Optional callback method to invoke if an internal error occurs before the client to server data communication
      * SecurityError, if the application does not have the privilege to call this method
      * UnknownError, if other error occur, such as internal error or "billing client already running" error
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/billing
      * @throw WebAPIException TypeMismatchError, InvalidValuesError
      * @since 2.4
      */
    def buyItem(
      appId: String,
      serverType: TVServerType,
      paymentDetails: String,
      onsuccess: BillingBuyDataSuccessCallback
    ): Unit = js.native
    def buyItem(
      appId: String,
      serverType: TVServerType,
      paymentDetails: String,
      onsuccess: BillingBuyDataSuccessCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    @JSName("buyItem")
    def buyItem_DEV(appId: String, serverType: DEV, paymentDetails: String, onsuccess: BillingBuyDataSuccessCallback): Unit = js.native
    @JSName("buyItem")
    def buyItem_DEV(
      appId: String,
      serverType: DEV,
      paymentDetails: String,
      onsuccess: BillingBuyDataSuccessCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    @JSName("buyItem")
    def buyItem_PRD(appId: String, serverType: PRD, paymentDetails: String, onsuccess: BillingBuyDataSuccessCallback): Unit = js.native
    @JSName("buyItem")
    def buyItem_PRD(
      appId: String,
      serverType: PRD,
      paymentDetails: String,
      onsuccess: BillingBuyDataSuccessCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    
    /**
      * Cancels a subscription product.
      * @param appId Application ID
      * @param invoiceId Invoice ID
      * @param customId Same value as "OrderCustomID" parameter for the BuyItem API (Samsung Account UID)
      * @param countryCode TV country code
      * @param serverType Billing server type
      * @param onsuccess Returns the subscription cancellation status if there is no internal error occurs until client to server data communication.
      * apiResult, can still contains error when billing server confirms that the given parameters does not have expected value or have problem while processing it
      * when CPStatus value from apiResult is "100000", it means server communication is done properly and other values are valid in returns
      * @param onerror Optional callback method to invoke if an error occurs before the client to server data communication.
      * SecurityError, if the application does not have the privilege to call this method.
      * UnknownError, if any other error occurs.
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/billing
      * @throw WebAPIException TypeMismatchError, InvalidValuesError
      * @since 4.0
      */
    def cancelSubscription(
      appId: String,
      invoiceId: String,
      customId: String,
      countryCode: String,
      serverType: TVServerType,
      onsuccess: BillingCancelSubscriptionCallback
    ): Unit = js.native
    def cancelSubscription(
      appId: String,
      invoiceId: String,
      customId: String,
      countryCode: String,
      serverType: TVServerType,
      onsuccess: BillingCancelSubscriptionCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    @JSName("cancelSubscription")
    def cancelSubscription_DEV(
      appId: String,
      invoiceId: String,
      customId: String,
      countryCode: String,
      serverType: DEV,
      onsuccess: BillingCancelSubscriptionCallback
    ): Unit = js.native
    @JSName("cancelSubscription")
    def cancelSubscription_DEV(
      appId: String,
      invoiceId: String,
      customId: String,
      countryCode: String,
      serverType: DEV,
      onsuccess: BillingCancelSubscriptionCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    @JSName("cancelSubscription")
    def cancelSubscription_PRD(
      appId: String,
      invoiceId: String,
      customId: String,
      countryCode: String,
      serverType: PRD,
      onsuccess: BillingCancelSubscriptionCallback
    ): Unit = js.native
    @JSName("cancelSubscription")
    def cancelSubscription_PRD(
      appId: String,
      invoiceId: String,
      customId: String,
      countryCode: String,
      serverType: PRD,
      onsuccess: BillingCancelSubscriptionCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    
    /**
      * Retrieves the list of products registered on the Billing (DPI) server.
      * @param appId Application ID
      * @param countryCode TV country code
      * @param pageSize Number of products retrieved per page (maximum 100)
      * @param pageNumber Requested page number (1 ~ N)
      * @param checkValue Security check value. Required parameters = "AppID" + "CountryCode"
      * @param serverType Billing server type
      * @param onsuccess Returns the product list if there is no internal error occurs until client to server data communication
      * apiResult, can still contains error when billing server confirms that the given parameters does not have expected value or have problem while processing it
      * when CPStatus value from apiResult is "100000", it means server communication is done properly and other values are valid in returns
      * @param onerror Optional callback method to invoke if an internal error occurs before the client to server data communication
      * SecurityError, if the application does not have the privilege to call this method.
      * UnknownError, if any other error occurs.
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/billing
      * @throw WebAPIException TypeMismatchError, InvalidValuesError
      * @since 4.0
      */
    def getProductsList(
      appId: String,
      countryCode: String,
      pageSize: String,
      pageNumber: String,
      checkValue: String,
      serverType: TVServerType,
      onsuccess: BillingProductsListCallback
    ): Unit = js.native
    def getProductsList(
      appId: String,
      countryCode: String,
      pageSize: String,
      pageNumber: String,
      checkValue: String,
      serverType: TVServerType,
      onsuccess: BillingProductsListCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    @JSName("getProductsList")
    def getProductsList_DEV(
      appId: String,
      countryCode: String,
      pageSize: String,
      pageNumber: String,
      checkValue: String,
      serverType: DEV,
      onsuccess: BillingProductsListCallback
    ): Unit = js.native
    @JSName("getProductsList")
    def getProductsList_DEV(
      appId: String,
      countryCode: String,
      pageSize: String,
      pageNumber: String,
      checkValue: String,
      serverType: DEV,
      onsuccess: BillingProductsListCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    @JSName("getProductsList")
    def getProductsList_PRD(
      appId: String,
      countryCode: String,
      pageSize: String,
      pageNumber: String,
      checkValue: String,
      serverType: PRD,
      onsuccess: BillingProductsListCallback
    ): Unit = js.native
    @JSName("getProductsList")
    def getProductsList_PRD(
      appId: String,
      countryCode: String,
      pageSize: String,
      pageNumber: String,
      checkValue: String,
      serverType: PRD,
      onsuccess: BillingProductsListCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    
    /**
      * Get Service Country availability for Samsung Checkout
      * @param appId Application ID
      * @param countryCodes to check. Multiple countrycodes available. (Add as array, only Uppercase allowed) ex) countrycodes=["DE","US","KR"]
      * @param checkValue Security check value. Required parameters = "AppID" + "CountryCodes"
      * @param serverType Billing server type
      * @param onsuccess Returns the service availability status of each country if there is no internal error occurs until client to server data communication.
      * apiResult, can still contains error when billing server confirms that the given parameters does not have expected value or have problem while processing it
      * when CPStatus value from apiResult is "100000", it means server communication is done properly and other values are valid in returns
      * @param onerror Optional callback method to invoke if an internal error occurs before the client to server data communication
      * SecurityError, if the application does not have the privilege to call this method.
      * UnknownError, if any other error occurs.
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/billing
      * @throw WebAPIException TypeMismatchError, InvalidValuesError
      * @since 5.5
      */
    def getServiceCountryAvailability(
      appId: String,
      countryCodes: js.Array[String],
      checkValue: String,
      serverType: TVServerType,
      onsuccess: BillingGetServiceCountryAvailabilityCallback
    ): Unit = js.native
    def getServiceCountryAvailability(
      appId: String,
      countryCodes: js.Array[String],
      checkValue: String,
      serverType: TVServerType,
      onsuccess: BillingGetServiceCountryAvailabilityCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    @JSName("getServiceCountryAvailability")
    def getServiceCountryAvailability_DEV(
      appId: String,
      countryCodes: js.Array[String],
      checkValue: String,
      serverType: DEV,
      onsuccess: BillingGetServiceCountryAvailabilityCallback
    ): Unit = js.native
    @JSName("getServiceCountryAvailability")
    def getServiceCountryAvailability_DEV(
      appId: String,
      countryCodes: js.Array[String],
      checkValue: String,
      serverType: DEV,
      onsuccess: BillingGetServiceCountryAvailabilityCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    @JSName("getServiceCountryAvailability")
    def getServiceCountryAvailability_PRD(
      appId: String,
      countryCodes: js.Array[String],
      checkValue: String,
      serverType: PRD,
      onsuccess: BillingGetServiceCountryAvailabilityCallback
    ): Unit = js.native
    @JSName("getServiceCountryAvailability")
    def getServiceCountryAvailability_PRD(
      appId: String,
      countryCodes: js.Array[String],
      checkValue: String,
      serverType: PRD,
      onsuccess: BillingGetServiceCountryAvailabilityCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    
    /**
      * Retrieves the user's purchase list.
      * @param appId Application ID
      * @param customId Same value as "OrderCustomID" parameter for the BuyItem API (Samsung Account UID)
      * @param countryCode TV country code
      * @param pageNumber Requested page number (1 ~ N)
      * @param checkValue Security check value. Required parameters = "AppID" + "CountryCode"
      * @param serverType Billing server type
      * @param onsuccess Returns the purchase list if there is no internal error occurs until client to server data communication
      * apiResult, can still contains error when billing server confirms that the given parameters does not have expected value or have problem while processing it
      * when CPStatus value from apiResult is "100000", it means server communication is done properly and other values are valid in returns
      * @param onerror Optional callback method to invoke if an internal error occurs before the client to server data communication
      * SecurityError, if the application does not have the privilege to call this method.
      * UnknownError, if any other error occurs.
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/billing
      * @throw WebAPIException TypeMismatchError, InvalidValuesError
      * @since 4.0
      */
    def getUserPurchaseList(
      appId: String,
      customId: String,
      countryCode: String,
      pageNumber: String,
      checkValue: String,
      serverType: TVServerType,
      onsuccess: BillingGetUserPurchaseListCallback
    ): Unit = js.native
    def getUserPurchaseList(
      appId: String,
      customId: String,
      countryCode: String,
      pageNumber: String,
      checkValue: String,
      serverType: TVServerType,
      onsuccess: BillingGetUserPurchaseListCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    @JSName("getUserPurchaseList")
    def getUserPurchaseList_DEV(
      appId: String,
      customId: String,
      countryCode: String,
      pageNumber: String,
      checkValue: String,
      serverType: DEV,
      onsuccess: BillingGetUserPurchaseListCallback
    ): Unit = js.native
    @JSName("getUserPurchaseList")
    def getUserPurchaseList_DEV(
      appId: String,
      customId: String,
      countryCode: String,
      pageNumber: String,
      checkValue: String,
      serverType: DEV,
      onsuccess: BillingGetUserPurchaseListCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    @JSName("getUserPurchaseList")
    def getUserPurchaseList_PRD(
      appId: String,
      customId: String,
      countryCode: String,
      pageNumber: String,
      checkValue: String,
      serverType: PRD,
      onsuccess: BillingGetUserPurchaseListCallback
    ): Unit = js.native
    @JSName("getUserPurchaseList")
    def getUserPurchaseList_PRD(
      appId: String,
      customId: String,
      countryCode: String,
      pageNumber: String,
      checkValue: String,
      serverType: PRD,
      onsuccess: BillingGetUserPurchaseListCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    
    /**
      * Retrieves the Billing API version.
      * @returns Billing API version
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/billing
      * @throw WebAPIException SecurityError, UnknownError
      * @since 4.0
      */
    def getVersion(): String = js.native
    
    /**
      * descEng Checks whether the Billing server is available. However, this api will be replaced by getServiceCountryAvailability after deprecation
      * @param serverType Billing server
      * @param onsuccess Returns the server availability
      * @param onerror Optional callback method to invoke if an internal error occurs before the client to server data communication
      * SecurityError, if the application does not have the privilege to call this method.
      * UnknownError, if any other error occurs.
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/billing
      * @throw WebAPIException TypeMismatchError, InvalidValuesError
      * @since 4.0
      * @note `deprecated` 5.5
      */
    def isServiceAvailable(serverType: TVServerType, onsuccess: BillingIsServiceAvailableCallback): Unit = js.native
    def isServiceAvailable(serverType: TVServerType, onsuccess: BillingIsServiceAvailableCallback, onerror: ErrorCallback): Unit = js.native
    @JSName("isServiceAvailable")
    def isServiceAvailable_DEV(serverType: DEV, onsuccess: BillingIsServiceAvailableCallback): Unit = js.native
    @JSName("isServiceAvailable")
    def isServiceAvailable_DEV(serverType: DEV, onsuccess: BillingIsServiceAvailableCallback, onerror: ErrorCallback): Unit = js.native
    @JSName("isServiceAvailable")
    def isServiceAvailable_PRD(serverType: PRD, onsuccess: BillingIsServiceAvailableCallback): Unit = js.native
    @JSName("isServiceAvailable")
    def isServiceAvailable_PRD(serverType: PRD, onsuccess: BillingIsServiceAvailableCallback, onerror: ErrorCallback): Unit = js.native
    
    /**
      * Checks whether a purchase, corresponding to a specific "InvoiceID", was successful.
      * @param appId Application ID
      * @param customId Same value as "OrderCustomID" parameter for the BuyItem API (Samsung Account UID)
      * @param invoiceId Invoice ID
      * @param countryCode TV country code
      * @param serverType Billing server type
      * @param onsuccess Returns the payment status if there is no internal error occurs until client to server data communication.
      * apiResult, can still contains error when billing server confirms that the given parameters does not have expected value or have problem while processing it
      * when CPStatus value from apiResult is "100000", it means server communication is done properly and other values are valid in returns
      * @param onerror Optional callback method to invoke if an internal error occurs before the client to server data communication
      * SecurityError, if the application does not have the privilege to call this method.
      * UnknownError, if any other error occurs.
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/billing
      * @throw WebAPIException TypeMismatchError, InvalidValuesError
      * @since 4.0
      */
    def verifyInvoice(
      appId: String,
      customId: String,
      invoiceId: String,
      countryCode: String,
      serverType: TVServerType,
      onsuccess: BillingVerifyInvoiceCallback
    ): Unit = js.native
    def verifyInvoice(
      appId: String,
      customId: String,
      invoiceId: String,
      countryCode: String,
      serverType: TVServerType,
      onsuccess: BillingVerifyInvoiceCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    @JSName("verifyInvoice")
    def verifyInvoice_DEV(
      appId: String,
      customId: String,
      invoiceId: String,
      countryCode: String,
      serverType: DEV,
      onsuccess: BillingVerifyInvoiceCallback
    ): Unit = js.native
    @JSName("verifyInvoice")
    def verifyInvoice_DEV(
      appId: String,
      customId: String,
      invoiceId: String,
      countryCode: String,
      serverType: DEV,
      onsuccess: BillingVerifyInvoiceCallback,
      onerror: ErrorCallback
    ): Unit = js.native
    @JSName("verifyInvoice")
    def verifyInvoice_PRD(
      appId: String,
      customId: String,
      invoiceId: String,
      countryCode: String,
      serverType: PRD,
      onsuccess: BillingVerifyInvoiceCallback
    ): Unit = js.native
    @JSName("verifyInvoice")
    def verifyInvoice_PRD(
      appId: String,
      customId: String,
      invoiceId: String,
      countryCode: String,
      serverType: PRD,
      onsuccess: BillingVerifyInvoiceCallback,
      onerror: ErrorCallback
    ): Unit = js.native
  }
  
  type BillingProductsListCallback = js.Function1[/* data */ ProductsListData, Unit]
  
  type BillingVerifyInvoiceCallback = js.Function1[/* data */ VerifyInvoiceData, Unit]
  
  @js.native
  trait CancelSubscriptionData extends StObject {
    
    var apiResult: String = js.native
  }
  object CancelSubscriptionData {
    
    @scala.inline
    def apply(apiResult: String): CancelSubscriptionData = {
      val __obj = js.Dynamic.literal(apiResult = apiResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelSubscriptionData]
    }
    
    @scala.inline
    implicit class CancelSubscriptionDataMutableBuilder[Self <: CancelSubscriptionData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiResult(value: String): Self = StObject.set(x, "apiResult", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProductsListData extends StObject {
    
    var apiResult: String = js.native
  }
  object ProductsListData {
    
    @scala.inline
    def apply(apiResult: String): ProductsListData = {
      val __obj = js.Dynamic.literal(apiResult = apiResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductsListData]
    }
    
    @scala.inline
    implicit class ProductsListDataMutableBuilder[Self <: ProductsListData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiResult(value: String): Self = StObject.set(x, "apiResult", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServiceAvailableData extends StObject {
    
    var apiResult: String = js.native
  }
  object ServiceAvailableData {
    
    @scala.inline
    def apply(apiResult: String): ServiceAvailableData = {
      val __obj = js.Dynamic.literal(apiResult = apiResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceAvailableData]
    }
    
    @scala.inline
    implicit class ServiceAvailableDataMutableBuilder[Self <: ServiceAvailableData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiResult(value: String): Self = StObject.set(x, "apiResult", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServiceCountryAvailabilityData extends StObject {
    
    var apiResult: String = js.native
  }
  object ServiceCountryAvailabilityData {
    
    @scala.inline
    def apply(apiResult: String): ServiceCountryAvailabilityData = {
      val __obj = js.Dynamic.literal(apiResult = apiResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceCountryAvailabilityData]
    }
    
    @scala.inline
    implicit class ServiceCountryAvailabilityDataMutableBuilder[Self <: ServiceCountryAvailabilityData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiResult(value: String): Self = StObject.set(x, "apiResult", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserPurchaseData extends StObject {
    
    var apiResult: String = js.native
  }
  object UserPurchaseData {
    
    @scala.inline
    def apply(apiResult: String): UserPurchaseData = {
      val __obj = js.Dynamic.literal(apiResult = apiResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserPurchaseData]
    }
    
    @scala.inline
    implicit class UserPurchaseDataMutableBuilder[Self <: UserPurchaseData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiResult(value: String): Self = StObject.set(x, "apiResult", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VerifyInvoiceData extends StObject {
    
    var apiResult: String = js.native
  }
  object VerifyInvoiceData {
    
    @scala.inline
    def apply(apiResult: String): VerifyInvoiceData = {
      val __obj = js.Dynamic.literal(apiResult = apiResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyInvoiceData]
    }
    
    @scala.inline
    implicit class VerifyInvoiceDataMutableBuilder[Self <: VerifyInvoiceData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiResult(value: String): Self = StObject.set(x, "apiResult", value.asInstanceOf[js.Any])
    }
  }
}
