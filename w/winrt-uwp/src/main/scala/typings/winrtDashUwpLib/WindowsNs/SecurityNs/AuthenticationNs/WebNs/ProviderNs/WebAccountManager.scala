package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for managing web accounts. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager")
@js.native
abstract class WebAccountManager () extends js.Object

/** Provides methods for managing web accounts. */
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
  def addWebAccountAsync(
    webAccountId: java.lang.String,
    webAccountUserName: java.lang.String,
    props: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount] = js.native
  /**
                           * Adds a new web account asynchronously with four inputs.
                           * @param webAccountId The Id for the web account.
                           * @param webAccountUserName The user name for the web account.
                           * @param props Properties for the web account.
                           * @param scope The scope of the web account.
                           * @return When this method completes, it returns the new web account.
                           */
  def addWebAccountAsync(
    webAccountId: java.lang.String,
    webAccountUserName: java.lang.String,
    props: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, java.lang.String],
    scope: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountScope
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount] = js.native
  /**
                           * Clears the view for a web account.
                           * @param webAccount The web account to clear the view for.
                           * @param applicationCallbackUri The callback Uri that indicates the completion of the operation. The broker matches this Uri against every Uri that it is about to navigate to. The broker never navigates to this Uri, instead the broker returns the control back to the application when the user clicks a link or a web server redirection is made.
                           * @return This method does not return a value.
                           */
  def clearViewAsync(
    webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount,
    applicationCallbackUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                           * Clears a web account picture asynchronously.
                           * @param webAccount The web account to clear the picture from.
                           * @return This method does not return a value.
                           */
  def clearWebAccountPictureAsync(webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                           * Deletes a web account asynchronously.
                           * @param webAccount The WebAccount to delete.
                           * @return This method does not return a value.
                           */
  def deleteWebAccountAsync(webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                           * Finds all provider web accounts asynchronously.
                           * @return When this method completes, it returns all provider web accounts.
                           */
  def findAllProviderWebAccountsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                           * Gets the scope of the web account.
                           * @param webAccount The web account to get scope for.
                           * @return The scope of the web account.
                           */
  def getScope(webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount): winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountScope = js.native
  /**
                           * Gets the views for a web account asynchronously.
                           * @param webAccount The web account to get views for.
                           * @return When this method completes, it returns the views for the web account.
                           */
  def getViewsAsync(webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                           * Pulls cookies asynchronously. Use this to enable single sign-on in an app after a user has entered their credentials into a web browser.
                           * @param uriString The Uri to pull cookies from.
                           * @param callerPFN The caller's package family name.
                           * @return This method does not return a value.
                           */
  def pullCookiesAsync(uriString: java.lang.String, callerPFN: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                           * Pushes cookies asynchronously. Use this to enable single sign-on for a web account in a browser after the user has entered their credentials into the app.
                           * @param uri The Uri to push the cookies to.
                           * @param cookies The cookies to push.
                           * @return This method does not return a value.
                           */
  def pushCookiesAsync(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    cookies: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpCookie]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                           * Sets the scope of a web account asynchronously.
                           * @param webAccount The web account to set scope for.
                           * @param scope The scope to set.
                           * @return This method does not return a value.
                           */
  def setScopeAsync(
    webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount,
    scope: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountScope
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                           * Sets the view for a web account asynchronously.
                           * @param webAccount The web account to set the view for.
                           * @param view The view to set.
                           * @return This method does not return a value.
                           */
  def setViewAsync(
    webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount,
    view: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountClientView
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                           * Sets the picture of a web account asynchronously.
                           * @param webAccount The web account to set the picture for.
                           * @param webAccountPicture The picture to set.
                           * @return This method does not return a value.
                           */
  def setWebAccountPictureAsync(
    webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount,
    webAccountPicture: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                           * Updates the properties of a web account asynchronously.
                           * @param webAccount The web account to update.
                           * @param webAccountUserName The username to update.
                           * @param additionalProperties The properties to update.
                           * @return This method does not return a value.
                           */
  def updateWebAccountPropertiesAsync(
    webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount,
    webAccountUserName: java.lang.String,
    additionalProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

