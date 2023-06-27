package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountManager extends StObject {
  
  /**
    * Adds an account to the account database.
    *
    * If the account is added successfully, an accountId and provider are newly assigned when the function returns.
    *
    * This method can be used only by an account provider application.
    * If the application is registered as provider, it will be launched to authenticate the account.
    * You should implement the appcontrol for the account provider.
    * For more details, see
    * [Account Provider](/application/web/guides/personal/account#retrieving-providers)
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/account.write
    *
    * @param account Account object to be added.
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def add(account: Account_): Unit = js.native
  
  /**
    * Adds an account listener for watching changes to accounts.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/account.read
    *
    * @param callback Callback method that is invoked for the events about accounts such as adding or removing an account.
    * @returns Identifier to clear the watch subscription for account changes.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addAccountListener(callback: AccountChangeCallback): Double = js.native
  
  /**
    * Gets the Account object with the given identifier.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/account.read
    *
    * @param accountId Account identifier.
    * @returns Object with the given identifier or null.
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getAccount(accountId: AccountId): Account_ | Null = js.native
  
  /**
    * Gets the accounts associated with the provider that has a specified applicationId, asynchronously.
    * If you want to get all accounts, omit the applicationId argument.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/account.read
    *
    * @param successCallback Callback method that is invoked when an asynchronous call completes successfully.
    * @param errorCallback Callback method that is invoked when an error occurs.
    * @param applicationId ApplicationId of the provider application.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getAccounts(successCallback: AccountArraySuccessCallback): Unit = js.native
  def getAccounts(successCallback: AccountArraySuccessCallback, errorCallback: Null, applicationId: String): Unit = js.native
  def getAccounts(successCallback: AccountArraySuccessCallback, errorCallback: Unit, applicationId: String): Unit = js.native
  def getAccounts(successCallback: AccountArraySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  def getAccounts(successCallback: AccountArraySuccessCallback, errorCallback: ErrorCallback, applicationId: String): Unit = js.native
  
  /**
    * Gets the account provider with the given application identifier.
    *
    * You can register your application as an account provider by writing account related information in config.xml.
    * For more details, see
    * [Account Provider](/application/web/guides/personal/account#retrieving-providers)
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/account.read
    *
    * @param applicationId Identifier of the account provider application.
    * @returns Object with the given applicationId or null.
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getProvider(applicationId: ApplicationId): AccountProvider | Null = js.native
  
  /**
    * Gets the providers with the given capabilities, asynchronously.
    * If you want to get all the providers, omit the capability argument.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/account.read
    *
    * @param successCallback Callback method that is invoked when an asynchronous call completes successfully.
    * @param errorCallback Callback method that is invoked when an error occurs.
    * @param capability Predefined capability or the vendor-specific capability in IRI format.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getProviders(successCallback: AccountProviderArraySuccessCallback): Unit = js.native
  def getProviders(successCallback: AccountProviderArraySuccessCallback, errorCallback: Null, capability: String): Unit = js.native
  def getProviders(successCallback: AccountProviderArraySuccessCallback, errorCallback: Unit, capability: String): Unit = js.native
  def getProviders(successCallback: AccountProviderArraySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  def getProviders(
    successCallback: AccountProviderArraySuccessCallback,
    errorCallback: ErrorCallback,
    capability: String
  ): Unit = js.native
  
  /**
    * Removes an account from the account database.
    *
    * Removes the account in the database that corresponds to the specified identifier.
    * The function will throw an exception if it failed to remove the specified account.
    *
    * This method can be used by an account provider application.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/account.write
    *
    * @param accountId Identifier of the account to remove.
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def remove(accountId: AccountId): Unit = js.native
  
  /**
    * Removes the previously registered listener.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/account.read
    *
    * @param accountListenerId Identifier of the listener for the account changes.
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def removeAccountListener(accountListenerId: Double): Unit = js.native
  
  /**
    * Updates an account.
    *
    * This method can be used only an account provider application.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/account.write
    *
    * @param account Account object to update.
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def update(account: Account_): Unit = js.native
}
