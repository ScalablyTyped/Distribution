package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Web.Http.HttpCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for managing web accounts. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager")
@js.native
abstract class WebAccountManager () extends js.Object

/* static members */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager")
@js.native
object WebAccountManager extends js.Object {
  /**
    * Adds a new web account asynchronously with three inputs.
    * @param webAccountId The Id for the web account.
    * @param webAccountUserName The user name for the web account.
    * @param props Properties for the web account.
    * @return When this method completes, it returns the new web account.
    */
  def addWebAccountAsync(webAccountId: String, webAccountUserName: String, props: IMapView[String, String]): IPromiseWithIAsyncOperation[WebAccount] = js.native
  /**
    * Adds a new web account asynchronously with four inputs.
    * @param webAccountId The Id for the web account.
    * @param webAccountUserName The user name for the web account.
    * @param props Properties for the web account.
    * @param scope The scope of the web account.
    * @return When this method completes, it returns the new web account.
    */
  def addWebAccountAsync(
    webAccountId: String,
    webAccountUserName: String,
    props: IMapView[String, String],
    scope: WebAccountScope
  ): IPromiseWithIAsyncOperation[WebAccount] = js.native
  /**
    * Clears the view for a web account.
    * @param webAccount The web account to clear the view for.
    * @param applicationCallbackUri The callback Uri that indicates the completion of the operation. The broker matches this Uri against every Uri that it is about to navigate to. The broker never navigates to this Uri, instead the broker returns the control back to the application when the user clicks a link or a web server redirection is made.
    * @return This method does not return a value.
    */
  def clearViewAsync(webAccount: WebAccount, applicationCallbackUri: Uri): IPromiseWithIAsyncAction = js.native
  /**
    * Clears a web account picture asynchronously.
    * @param webAccount The web account to clear the picture from.
    * @return This method does not return a value.
    */
  def clearWebAccountPictureAsync(webAccount: WebAccount): IPromiseWithIAsyncAction = js.native
  /**
    * Deletes a web account asynchronously.
    * @param webAccount The WebAccount to delete.
    * @return This method does not return a value.
    */
  def deleteWebAccountAsync(webAccount: WebAccount): IPromiseWithIAsyncAction = js.native
  /**
    * Finds all provider web accounts asynchronously.
    * @return When this method completes, it returns all provider web accounts.
    */
  def findAllProviderWebAccountsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets the scope of the web account.
    * @param webAccount The web account to get scope for.
    * @return The scope of the web account.
    */
  def getScope(webAccount: WebAccount): WebAccountScope = js.native
  /**
    * Gets the views for a web account asynchronously.
    * @param webAccount The web account to get views for.
    * @return When this method completes, it returns the views for the web account.
    */
  def getViewsAsync(webAccount: WebAccount): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Pulls cookies asynchronously. Use this to enable single sign-on in an app after a user has entered their credentials into a web browser.
    * @param uriString The Uri to pull cookies from.
    * @param callerPFN The caller's package family name.
    * @return This method does not return a value.
    */
  def pullCookiesAsync(uriString: String, callerPFN: String): IPromiseWithIAsyncAction = js.native
  /**
    * Pushes cookies asynchronously. Use this to enable single sign-on for a web account in a browser after the user has entered their credentials into the app.
    * @param uri The Uri to push the cookies to.
    * @param cookies The cookies to push.
    * @return This method does not return a value.
    */
  def pushCookiesAsync(uri: Uri, cookies: IVectorView[HttpCookie]): IPromiseWithIAsyncAction = js.native
  /**
    * Sets the scope of a web account asynchronously.
    * @param webAccount The web account to set scope for.
    * @param scope The scope to set.
    * @return This method does not return a value.
    */
  def setScopeAsync(webAccount: WebAccount, scope: WebAccountScope): IPromiseWithIAsyncAction = js.native
  /**
    * Sets the view for a web account asynchronously.
    * @param webAccount The web account to set the view for.
    * @param view The view to set.
    * @return This method does not return a value.
    */
  def setViewAsync(webAccount: WebAccount, view: WebAccountClientView): IPromiseWithIAsyncAction = js.native
  /**
    * Sets the picture of a web account asynchronously.
    * @param webAccount The web account to set the picture for.
    * @param webAccountPicture The picture to set.
    * @return This method does not return a value.
    */
  def setWebAccountPictureAsync(webAccount: WebAccount, webAccountPicture: IRandomAccessStream): IPromiseWithIAsyncAction = js.native
  /**
    * Updates the properties of a web account asynchronously.
    * @param webAccount The web account to update.
    * @param webAccountUserName The username to update.
    * @param additionalProperties The properties to update.
    * @return This method does not return a value.
    */
  def updateWebAccountPropertiesAsync(webAccount: WebAccount, webAccountUserName: String, additionalProperties: IMapView[String, String]): IPromiseWithIAsyncAction = js.native
}

