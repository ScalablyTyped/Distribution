package typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
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
  def this(webAccountProvider: WebAccountProvider, userName: String, state: WebAccountState) = this()
  /** Gets the Id of the web account. */
  var id: String = js.native
  /** Gets the properties of the web account. */
  var properties: IMapView[String, String] = js.native
  /** Gets the connected state of the web account. */
  var state: WebAccountState = js.native
  /** Gets the username for the web account. */
  var userName: String = js.native
  /** Gets the web authentication provider for the account. */
  var webAccountProvider: WebAccountProvider = js.native
  /**
    * Gets the web account's picture asynchronously.
    * @param desizedSize The desired size of the web account picture.
    * @return When this method completes, it returns the web account's picture.
    */
  def getPictureAsync(desizedSize: WebAccountPictureSize): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
  /**
    * Signs the web account out asynchronously. This clears all cached tokens associated with the account, and tells the provider to invalidate any tokens associated with the account for this app.
    * @return This method does not return a value.
    */
  def signOutAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Signs the web account out asynchronously. This clears all cached tokens associated with the account, and tells the provider to invalidate any tokens associated with the account for this app.
    * @param clientId The Id of the client.
    * @return This method does not return a value.
    */
  def signOutAsync(clientId: String): IPromiseWithIAsyncAction = js.native
}

