package typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.WebNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.ValueSet
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebAuthenticationBrokerStatics extends js.Object {
  def authenticateAndContinue(requestUri: Uri): Unit = js.native
  def authenticateAndContinue(requestUri: Uri, callbackUri: Uri): Unit = js.native
  def authenticateAndContinue(requestUri: Uri, callbackUri: Uri, continuationData: ValueSet, options: WebAuthenticationOptions): Unit = js.native
  def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri): IAsyncOperation[WebAuthenticationResult] = js.native
  def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri, callbackUri: Uri): IAsyncOperation[WebAuthenticationResult] = js.native
  def getCurrentApplicationCallbackUri(): Uri = js.native
}

