package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "Account")
@js.native
open class Account_ protected () extends StObject {
  def this(provider: AccountProvider) = this()
  def this(provider: AccountProvider, accountInitDict: AccountInit) = this()
  
  /**
    * Gets the extended data for the account as an array, asynchronously.
    * Returns an empty array if there is no extended data.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/account.read
    *
    * @param successCallback Callback method that is invoked when an asynchronous call completes successfully.
    * @param errorCallback Callback method that is invoked when an error occurs.
    * @throw WebAPIException with error type TypeMismatchError, if any of the input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type NotFoundError, if account ID is null.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getExtendedData(key: String): String = js.native
  def getExtendedData(successCallback: AccountExtendedDataArraySuccessCallback): Unit = js.native
  def getExtendedData(successCallback: AccountExtendedDataArraySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Name, identifier or URI of the icon.
    * By default, this attribute is set to null.
    */
  var iconUri: String | Null = js.native
  
  /**
    * Identifier for the account.
    * By default, this attribute is set to null.
    */
  val id: AccountId | Null = js.native
  
  /**
    * Reference to the provider.
    * There is one provider for each account.
    * A given provider can be referenced from many accounts.
    */
  val provider: AccountProvider = js.native
  
  /**
    * Adds the specified key and value to the extended data.
    *
    * If the specified key already exists, the corresponding value is overwritten with the specified value.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/account.write
    *
    * @param key Key of the extended data.
    * @param value Value of the extended data.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type NotFoundError, if account ID is null.
    */
  def setExtendedData(key: String, value: String): Unit = js.native
  
  /**
    * Account user name.
    * By default, this attribute is set to null.
    */
  var userName: String | Null = js.native
}
