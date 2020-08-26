package typings.tizenCommonWeb

import typings.tizenCommonWeb.tizenMod.ErrorCallback
import typings.tizenCommonWeb.tizenMod.SuccessCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tizen-common-web/websetting", JSImport.Namespace)
@js.native
object websettingMod extends js.Object {
  @js.native
  trait WebSettingManager extends js.Object {
    /**
      * Sets the custom user agent string for your Web application.
      * The Web view in your Web application can store cookies like a browser.
      * This method allows the user to remove all the cookies saved for the Web application.
      * @param successCallback To be invoked if the requested delete operation succeeds.
      * @param errorCallback To be invoked if the requested delete operation fails.
      * - `UnknownError` - If any error occurs while deleting the cookies.
      * @throw WebAPIException TypeMismatchError
      * @warning http://tizen.org/privilege/websetting(public level privilege) MUST NOT be declared to use this API since 2.4.
      * @since 2.2
      */
    def removeAllCookies(): Unit = js.native
    def removeAllCookies(successCallback: js.UndefOr[scala.Nothing], errorCallback: ErrorCallback): Unit = js.native
    def removeAllCookies(successCallback: SuccessCallback): Unit = js.native
    def removeAllCookies(successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
    /**
      * Sets the custom user agent string for your Web application.
      * This method allows the user to set the user agent string of the Web view in the Web application.
      * By default, the Web view in your application has the same user agent string as the Tizen browser on the device.
      * @param userAgent User agent to set for the Web view in your Web application.
      * @param successCallback To be invoked if the requested setting operation succeeds.
      * @param errorCallback To be invoked if the requested setting operation fails.
      * - `UnknownError` - If any error occurs while setting the user agent string.
      * - `InvalidValuesError` - If any of the input parameters contain an invalid value.
      * @throw WebAPIException TypeMismatchError
      * @since 2.2
      */
    def setUserAgentString(userAgent: String): Unit = js.native
    def setUserAgentString(userAgent: String, successCallback: js.UndefOr[scala.Nothing], errorCallback: ErrorCallback): Unit = js.native
    def setUserAgentString(userAgent: String, successCallback: SuccessCallback): Unit = js.native
    def setUserAgentString(userAgent: String, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  }
  
}

