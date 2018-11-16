package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies an account from a web account provider. */
@JSGlobal("Windows.Security.Credentials.WebAccount")
@js.native
class WebAccount protected () extends js.Object {
  /**
                   * Creates an instance of the WebAccount class.
                   * @param webAccountProvider The web account provider associated with the web account.
                   * @param userName The user name of the web account.
                   * @param state The state of the web account.
                   */
  def this(webAccountProvider: WebAccountProvider, userName: java.lang.String, state: WebAccountState) = this()
  /** Gets the Id of the web account. */
  var id: java.lang.String = js.native
  /** Gets the properties of the web account. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, java.lang.String] = js.native
  /** Gets the connected state of the web account. */
  var state: WebAccountState = js.native
  /** Gets the username for the web account. */
  var userName: java.lang.String = js.native
  /** Gets the web authentication provider for the account. */
  var webAccountProvider: WebAccountProvider = js.native
  /**
                   * Gets the web account's picture asynchronously.
                   * @param desizedSize The desired size of the web account picture.
                   * @return When this method completes, it returns the web account's picture.
                   */
  def getPictureAsync(desizedSize: WebAccountPictureSize): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream] = js.native
  /**
                   * Signs the web account out asynchronously. This clears all cached tokens associated with the account, and tells the provider to invalidate any tokens associated with the account for this app.
                   * @return This method does not return a value.
                   */
  def signOutAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Signs the web account out asynchronously. This clears all cached tokens associated with the account, and tells the provider to invalidate any tokens associated with the account for this app.
                   * @param clientId The Id of the client.
                   * @return This method does not return a value.
                   */
  def signOutAsync(clientId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

