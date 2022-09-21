package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSettingManager extends StObject {
  
  /**
    * Removes all the cookies saved for the Web view in your Web application.
    *
    * The Web view in your Web application can store cookies like a browser. This method allows the user to remove all the cookies saved for the Web application.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   UnknownError - If any error occurs while deleting the cookies.
    *
    *
    * @param successCallback To be invoked if the requested delete operation succeeds.
    * @param errorCallback To be invoked if the requested delete operation fails.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    *
    * @warning http://tizen.org/privilege/websetting(public level privilege) **MUST NOT** be declared to use this API since 2.4.
    */
  def removeAllCookies(): Unit = js.native
  def removeAllCookies(successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def removeAllCookies(successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def removeAllCookies(successCallback: SuccessCallback): Unit = js.native
  def removeAllCookies(successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Sets the custom user agent string for your Web application.
    *
    * This method allows the user to set the user agent string of the Web view in the Web application. By default, the Web view in your application
    * has the same user agent string as the Tizen browser on the device.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   UnknownError - If any error occurs while setting the user agent string.
    * *   InvalidValuesError - If any of the input parameters contain an invalid value.
    *
    *
    * @param userAgent User agent to set for the Web view in your Web application.
    * @param successCallback To be invoked if the requested setting operation succeeds.
    * @param errorCallback To be invoked if the requested setting operation fails.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    */
  def setUserAgentString(userAgent: String): Unit = js.native
  def setUserAgentString(userAgent: String, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def setUserAgentString(userAgent: String, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def setUserAgentString(userAgent: String, successCallback: SuccessCallback): Unit = js.native
  def setUserAgentString(userAgent: String, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
}
