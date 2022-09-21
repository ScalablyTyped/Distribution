package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingManager extends StObject {
  
  /**
    * Updates the apply status of purchase item to DPI server.
    *
    * @param appId Application ID
    *
    * @param customId Same value as "OrderCustomID" parameter for the BuyItem API (Samsung Account UID)
    *
    * @param invoiceId Invoice ID of purchased Item that you want to update apply status
    *
    * @param countryCode TV country code
    *
    * @param serverType Billing server type
    *
    * @param onsuccess Returns purchase apply status if there is no internal error occurs until client to server data communication
    * apiResult, can still contains error when billing server confirms that the given parameters does not have expected value or have problem while processing it
    * when CPStatus value from apiResult is "100000", it means server communication is done properly and other values are valid in returns
    *
    * @param onerror Optional callback method to invoke if an internal error occurs before the client to server data communication
    * SecurityError, if the application does not have the privilege to call this method.
    * UnknownError, if any other error occurs.
    *
    * @returns void
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/billing
    *
    * @throw WebAPIException with error type TypeMismatchError, if any of input parameter is not compatible with its expected type
    *
    * @throw WebAPIException with error type InvalidValuesError, if serverType contains an invalid value
    *
    * @since 4.0
    *
    * @version 3.0
    *
    * @note Since tizen version 6.0, if serverType contains an invalid value, TypeMismatchError is thrown instead of InvalidValuesError.
    *
    * @note 서버 통신 시 필요한 Secret Key가 노출되면 안됨. (SDK제약사항)
    *
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
  
  /**
    * Enables implementing the Samsung Checkout Client module within the application. After authenticating the purchase information through the application, the user can proceed to purchase payment.
    *
    * @param appId Application ID
    *
    * @param serverType Billing server type
    *
    * @param paymentDetails Payment parameters
    * OrderItemID[MANDATORY]/OrderTitle[MANDATORY]/OrderTotal[MANDATORY]/OrderCurrencyID[MANDATORY]/OrderID[OPTIONAL]/OrderCustomID[MANDATORY]
    *
    * @param onsuccess Returns "payResult" and "payDetail" if there is no internal error occurs until client to server data communication.
    * payResult, can still contains error when billing server confirms that the given parameters does not have expected value or have problem while processing it
    * payDetail, can have additional data when it's returned, such as InvoiceID. Please refer to the development guide of "buyItem" for details
    *
    * @param onerror Optional callback method to invoke if an internal error occurs before the client to server data communication
    * SecurityError, if the application does not have the privilege to call this method
    * UnknownError, if other error occur, such as internal error or "billing client already running" error
    *
    * @returns void
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/billing
    *
    * @throw WebAPIException with error type TypeMismatchError, if any of input parameter is not compatible with its expected type
    *
    * @throw WebAPIException with error type InvalidValuesError, if serverType contains an invalid value
    *
    * @since 2.4
    *
    * @version 1.0
    *
    * @note Since tizen version 6.0, if serverType contains an invalid value, TypeMismatchError is thrown instead of InvalidValuesError.
    *
    * @note 서버 통신 시 필요한 Secret Key가 노출되면 안됨. (SDK제약사항)
    *
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
  
  /**
    * Cancels a subscription product.
    *
    * @param appId Application ID
    *
    * @param invoiceId Invoice ID of subscription that you want to cancel
    *
    * @param customId Same value as "OrderCustomID" parameter for the BuyItem API (Samsung Account UID)
    *
    * @param countryCode TV country code
    *
    * @param serverType Billing server type
    *
    * @param onsuccess Returns the subscription cancellation status if there is no internal error occurs until client to server data communication.
    * apiResult, can still contains error when billing server confirms that the given parameters does not have expected value or have problem while processing it
    * when CPStatus value from apiResult is "100000", it means server communication is done properly and other values are valid in returns
    *
    * @param onerror Optional callback method to invoke if an error occurs before the client to server data communication.
    * SecurityError, if the application does not have the privilege to call this method.
    * UnknownError, if any other error occurs.
    *
    * @returns void
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/billing
    *
    * @throw WebAPIException with error type TypeMismatchError, if any of input parameter is not compatible with its expected type
    *
    * @throw WebAPIException with error type InvalidValuesError, if serverType contains an invalid value
    *
    * @since 4.0
    *
    * @version 3.0
    *
    * @note Since tizen version 6.0, if serverType contains an invalid value, TypeMismatchError is thrown instead of InvalidValuesError.
    *
    * @note 서버 통신 시 필요한 Secret Key가 노출되면 안됨. (SDK제약사항)
    *
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
  
  /**
    * Retrieves the list of products registered on the Billing (DPI) server.
    *
    * @param appId Application ID
    *
    * @param countryCode TV country code
    *
    * @param pageSize Number of products retrieved per page (maximum 100)
    *
    * @param pageNumber Requested page number (1 ~ N)
    *
    * @param checkValue Security check value. Required parameters = "appId" + "countryCode"
    * The check value is used by the DPI service to verify API requests. It is a Base64 hash generated by applying the HMAC SHA256 algorithm on a concatenated string of parameters using the DPI security key.
    * You can see the example how to generate checkValue from the following Code example.
    * You can use any open library to generate the HMAC SHA256 hash. The following example uses the CryptoJS library
    *
    * @param serverType Billing server type
    *
    * @param onsuccess Returns the product list if there is no internal error occurs until client to server data communication
    * apiResult, can still contains error when billing server confirms that the given parameters does not have expected value or have problem while processing it
    * when CPStatus value from apiResult is "100000", it means server communication is done properly and other values are valid in returns
    *
    * @param onerror Optional callback method to invoke if an internal error occurs before the client to server data communication
    * SecurityError, if the application does not have the privilege to call this method.
    * UnknownError, if any other error occurs.
    *
    * @returns void
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/billing
    *
    * @throw WebAPIException with error type TypeMismatchError, if any of input parameter is not compatible with its expected type
    *
    * @throw WebAPIException with error type InvalidValuesError, if serverType contains an invalid value
    *
    * @since 4.0
    *
    * @version 3.0
    *
    * @note Since tizen version 6.0, if serverType contains an invalid value, TypeMismatchError is thrown instead of InvalidValuesError.
    *
    * @note 서버 통신 시 필요한 Secret Key가 노출되면 안됨. (SDK제약사항)
    *
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
  
  /**
    * Get Service Country availability for Samsung Checkout
    *
    * @param appId Application ID
    *
    * @param countryCodes to check. Multiple countrycodes available. (Add as array, only Uppercase allowed) ex) countrycodes=["DE","US","KR"]
    *
    * @param checkValue Security check value. Required parameters = "appId" + "countryCodes"
    * The check value is used by the DPI service to verify API requests. It is a Base64 hash generated by applying the HMAC SHA256 algorithm on a concatenated string of parameters using the DPI security key.
    * You can see the example how to generate checkValue from the following Code example.
    * You can use any open library to generate the HMAC SHA256 hash. The following example uses the CryptoJS library
    *
    * @param serverType Billing server type
    *
    * @param onsuccess Returns the service availability status of each country if there is no internal error occurs until client to server data communication.
    * apiResult, can still contains error when billing server confirms that the given parameters does not have expected value or have problem while processing it
    * when CPStatus value from apiResult is "100000", it means server communication is done properly and other values are valid in returns
    *
    * @param onerror Optional callback method to invoke if an internal error occurs before the client to server data communication
    * SecurityError, if the application does not have the privilege to call this method.
    * UnknownError, if any other error occurs.
    *
    * @returns void
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/billing
    *
    * @throw WebAPIException with error type TypeMismatchError, if any of input parameter is not compatible with its expected type
    *
    * @throw WebAPIException with error type InvalidValuesError, if serverType contains an invalid value
    *
    * @since 5.5
    *
    * @version 5.5
    *
    * @note Since tizen version 6.0, if serverType contains an invalid value, TypeMismatchError is thrown instead of InvalidValuesError.
    *
    * @note 서버 통신 시 필요한 Secret Key가 노출되면 안됨. (SDK제약사항)
    *
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
  
  /**
    * Retrieves the user's purchase list.
    *
    * @param appId Application ID
    *
    * @param customId Same value as "OrderCustomID" parameter for the BuyItem API (Samsung Account UID)
    *
    * @param countryCode TV country code
    *
    * @param pageNumber Requested page number (1 ~ N)
    *
    * @param checkValue Security check value. Required parameters = "appId" + "customId" + "countryCode" + "ItemType" + "pageNumber"
    * ItemType, MUST use 2 as value ("all items")
    * The check value is used by the DPI service to verify API requests. It is a Base64 hash generated by applying the HMAC SHA256 algorithm on a concatenated string of parameters using the DPI security key.
    * You can see the example how to generate checkValue from the following Code example.
    * You can use any open library to generate the HMAC SHA256 hash. The following example uses the CryptoJS library
    *
    * @param serverType Billing server type
    *
    * @param onsuccess Returns the purchase list if there is no internal error occurs until client to server data communication
    * apiResult, can still contains error when billing server confirms that the given parameters does not have expected value or have problem while processing it
    * when CPStatus value from apiResult is "100000", it means server communication is done properly and other values are valid in returns
    *
    * @param onerror Optional callback method to invoke if an internal error occurs before the client to server data communication
    * SecurityError, if the application does not have the privilege to call this method.
    * UnknownError, if any other error occurs.
    *
    * @returns void
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/billing
    *
    * @throw WebAPIException with error type TypeMismatchError, if any of input parameter is not compatible with its expected type
    *
    * @throw WebAPIException with error type InvalidValuesError, if serverType contains an invalid value
    *
    * @since 4.0
    *
    * @version 3.0
    *
    * @note Since tizen version 6.0, if serverType contains an invalid value, TypeMismatchError is thrown instead of InvalidValuesError.
    *
    * @note 서버 통신 시 필요한 Secret Key가 노출되면 안됨. (SDK제약사항)
    *
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
  
  /**
    * Retrieves the Billing API version.
    *
    * @returns Billing API version
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/billing
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @since 4.0
    *
    * @version 3.0
    *
    * @note 서버 통신 시 필요한 Secret Key가 노출되면 안됨. (SDK제약사항)
    *
    */
  def getVersion(): String = js.native
  
  /**
    * Checks whether the Billing server is available. However, this api will be replaced by getServiceCountryAvailability after deprecation
    *
    * @param serverType Billing server
    *
    * @param onsuccess Returns the server availability
    *
    * @param onerror Optional callback method to invoke if an internal error occurs before the client to server data communication
    * SecurityError, if the application does not have the privilege to call this method.
    * UnknownError, if any other error occurs.
    *
    * @returns void
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/billing
    *
    * @throw WebAPIException with error type TypeMismatchError, if any of input parameter is not compatible with its expected type
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @since 4.0
    *
    * @version 3.0
    *
    * @note `deprecated` 5.5
    *
    * @note 서버 통신 시 필요한 Secret Key가 노출되면 안됨. (SDK제약사항)
    *
    */
  def isServiceAvailable(serverType: TVServerType, onsuccess: BillingIsServiceAvailableCallback): Unit = js.native
  def isServiceAvailable(serverType: TVServerType, onsuccess: BillingIsServiceAvailableCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Checks whether a purchase, corresponding to a specific "InvoiceID", was successful.
    *
    * @param appId Application ID
    *
    * @param customId Same value as "OrderCustomID" parameter for the BuyItem API (Samsung Account UID)
    *
    * @param invoiceId Invoice ID that you want to verify whether a purchase was successful
    *
    * @param countryCode TV country code
    *
    * @param serverType Billing server type
    *
    * @param onsuccess Returns the payment status if there is no internal error occurs until client to server data communication.
    * apiResult, can still contains error when billing server confirms that the given parameters does not have expected value or have problem while processing it
    * when CPStatus value from apiResult is "100000", it means server communication is done properly and other values are valid in returns
    *
    * @param onerror Optional callback method to invoke if an internal error occurs before the client to server data communication
    * SecurityError, if the application does not have the privilege to call this method.
    * UnknownError, if any other error occurs.
    *
    * @returns void
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/billing
    *
    * @throw WebAPIException with error type TypeMismatchError, if any of input parameter is not compatible with its expected type
    *
    * @throw WebAPIException with error type InvalidValuesError, if serverType contains an invalid value
    *
    * @since 4.0
    *
    * @version 3.0
    *
    * @note Since tizen version 6.0, if serverType contains an invalid value, TypeMismatchError is thrown instead of InvalidValuesError.
    *
    * @note 서버 통신 시 필요한 Secret Key가 노출되면 안됨. (SDK제약사항)
    *
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
}
