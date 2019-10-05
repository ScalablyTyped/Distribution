package typings.winrtDashUwp.Windows.Web.Http

import typings.winrtDashUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Add or delete an HttpCookie or view the cookies associated with an app. */
@JSGlobal("Windows.Web.Http.HttpCookieManager")
@js.native
abstract class HttpCookieManager () extends js.Object {
  /**
    * Delete an HttpCookie from the cookies associated with an app.
    * @param cookie The HttpCookie to delete.
    */
  def deleteCookie(cookie: HttpCookie): Unit = js.native
  /**
    * Gets an HttpCookieCollection that contains the HttpCookie instances that are associated with a specific URI.
    * @param uri The URI of the HttpCookie instances desired.
    * @return The HttpCookieCollection that contains the HttpCookie instances that are associated with a specific URI.
    */
  def getCookies(uri: Uri): HttpCookieCollection = js.native
  /**
    * Add or change an HttpCookie in the cookies associated with an app that is sent on future requests.
    * @param cookie The HttpCookie to change or add.
    * @return true if the HttpCookie replaced an existing cookie; otherwise false.
    */
  def setCookie(cookie: HttpCookie): Boolean = js.native
  /**
    * Add or change an HttpCookie in the cookies associated with an app.
    * @param cookie The HttpCookie to change or add.
    * @param thirdParty A value that indicates whether the HttpCookie is a third party HTTP cookie.
    * @return true if the HttpCookie replaced an existing cookie; otherwise false.
    */
  def setCookie(cookie: HttpCookie, thirdParty: Boolean): Boolean = js.native
}

