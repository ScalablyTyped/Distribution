package typings.tizenTvWebapis.ssoMod

import typings.tizenTvWebapis.webapisMod.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SsoManager extends js.Object {
  
  /**
    * Retrieves the SSO login status.
    * @returns  `SsoLoginState` A object of the current login state.
    * @privilegeLevel Partner
    * @privilegeName http://developer.samsung.com/privilege/sso.partner
    * @throw `TypeMismatchError`, `NotSupportedError`, `InvalidValuesError`, `SecurityError`, `UnknownError`
    * @since 2.3
    */
  def getLoginStatus(): SsoLoginState = js.native
  
  /**
    * Retrieves the UID.
    * The UID is considered personally-identifying information and must be handled according to the privacy regulations for each country.
    * It must not be used for any purpose other than as an input parameter for the Samsung Checkout API.
    * Whenever the UID value is sent outside the TV device, a secure protocol, such as HTTPS, must be used.
    * @returns string UID
    * @privilegeLevel Partner
    * @privilegeName http://developer.samsung.com/privilege/sso.partner
    * @throw `TypeMismatchError`, `NotSupportedError`, `InvalidValuesError`, `InvalidStateError`, `SecurityError`, `UnknownError`
    * @since 2.3
    */
  def getLoginUid(): String = js.native
  
  /**
    * Retrieves the plugin version number.
    * @returns string The version of the sso
    * @privilegeLevel Partner
    * @privilegeName http://developer.samsung.com/privilege/sso.partner
    * @throw `TypeMismatchError`, `NotSupportedError`, `InvalidValuesError`, `SecurityError`, `UnknownError`
    * @since 2.3
    */
  def getVersion(): String = js.native
  
  /**
    * Shows the SSO login or logout page, and returns the SSO login or logout information.
    * @param widgetName Widget name
    * @param onsuccess Callback method to invoke when the account page is shown
    * @param onerror Callback method to invoke if an error has occurred. It provides the status, error name, and error message.
    * @privilegeLevel Partner
    * @privilegeName http://developer.samsung.com/privilege/sso.partner
    * @throw `SecurityError`, `TypeMismatchError`, `NotSupportedError`, `InvalidValuesError`, `UnknownError`
    * @since 2.3
    */
  def showAccountView(widgetName: String, onsuccess: SsoCallDataSuccessCallback): Unit = js.native
  def showAccountView(widgetName: String, onsuccess: SsoCallDataSuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Shows the SSO account creation screen.
    * @param onsuccess Callback method to invoke when the CreateAccountPage is shown
    * @param onerror Callback method to invoke if an error has occurred. It provides the status, error name, and error message.
    * @privilegeLevel Partner
    * @privilegeName http://developer.samsung.com/privilege/sso.partner
    * @throw `TypeMismatchError`, `NotSupportedError`, `InvalidValuesError`, `UnknownError`
    * @since 2.3
    */
  def showCreateAccountView(onsuccess: SsoStringSuccessCallback): Unit = js.native
  def showCreateAccountView(onsuccess: SsoStringSuccessCallback, onerror: ErrorCallback): Unit = js.native
}
