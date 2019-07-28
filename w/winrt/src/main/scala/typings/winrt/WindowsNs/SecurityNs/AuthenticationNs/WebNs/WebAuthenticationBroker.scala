package typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.WebNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.ValueSet
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker")
@js.native
class WebAuthenticationBroker () extends js.Object

/* static members */
@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker")
@js.native
object WebAuthenticationBroker extends js.Object {
  def authenticateAndContinue(requestUri: Uri): Unit = js.native
  def authenticateAndContinue(requestUri: Uri, callbackUri: Uri): Unit = js.native
  def authenticateAndContinue(requestUri: Uri, callbackUri: Uri, continuationData: ValueSet, options: WebAuthenticationOptions): Unit = js.native
  def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri): IAsyncOperation[WebAuthenticationResult] = js.native
  def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri, callbackUri: Uri): IAsyncOperation[WebAuthenticationResult] = js.native
  def getCurrentApplicationCallbackUri(): Uri = js.native
}

