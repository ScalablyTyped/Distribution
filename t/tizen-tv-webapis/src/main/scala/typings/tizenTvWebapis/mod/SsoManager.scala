package typings.tizenTvWebapis.mod

import typings.tizenTvWebapis.anon.SSOLOGIN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SsoManager extends StObject {
  
  /**
    * Defines constants for login status.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var SsoLoginState: SSOLOGIN = js.native
  
  /**
    * Retrieves the SSO login status.
    *
    * @returns SsoLoginState Login state
    *
    * @privilegeLevel Partner
    *
    * @privilegeName http://developer.samsung.com/privilege/sso.partner
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getLoginStatus(): SsoLoginState = js.native
  
  /**
    * Retrieves the UID.
    *
    * The UID is considered personally-identifying information and must be handled according to the privacy regulations for each country.
    * It must not be used for any purpose other than as an input parameter for the Samsung Checkout API.
    * Whenever the UID value is sent outside the TV device, a secure protocol, such as HTTPS, must be used.
    *
    * @returns DOMString UID
    *
    * @privilegeLevel Partner
    *
    * @privilegeName http://developer.samsung.com/privilege/sso.partner
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if the user is not signed in.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getLoginUid(): String = js.native
  
  /**
    * Retrieves the plugin version number.
    *
    * @returns DOMString Version
    *
    * @privilegeLevel Partner
    *
    * @privilegeName http://developer.samsung.com/privilege/sso.partner
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getVersion(): String = js.native
  
  /**
    * Shows the SSO login or logout page, and returns the SSO login or logout information.
    *
    * @param widgetName Widget name
    *
    * @param onsuccess Callback method to invoke when the account page is shown
    *
    * @param onerror Callback method to invoke if an error has occurred. It provides the status, error name, and error message.
    * SecurityError, if the application does not have the privilege to call this method
    *
    * @returns void
    *
    * @privilegeLevel Partner
    *
    * @privilegeName http://developer.samsung.com/privilege/sso.partner
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def showAccountView(widgetName: String, onsuccess: SsoCallDataSuccessCallback): Unit = js.native
  def showAccountView(widgetName: String, onsuccess: SsoCallDataSuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Shows the SSO account creation screen.
    *
    * @param onsuccess Callback method to invoke when the CreateAccountPage was closed. User can get number data(0).
    *
    * @param onerror Callback method to invoke if an error has occurred. It provides the status, error name, and error message.
    * SecurityError, if the application does not have the privilege to call this method.
    *
    * @returns void
    *
    * @privilegeLevel Partner
    *
    * @privilegeName http://developer.samsung.com/privilege/sso.partner
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def showCreateAccountView(onsuccess: SsoNumSuccessCallback): Unit = js.native
  def showCreateAccountView(onsuccess: SsoNumSuccessCallback, onerror: ErrorCallback): Unit = js.native
}
