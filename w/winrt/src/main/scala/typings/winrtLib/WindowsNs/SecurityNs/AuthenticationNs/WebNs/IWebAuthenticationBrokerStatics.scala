package typings
package winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebAuthenticationBrokerStatics extends js.Object {
  def authenticateAndContinue(requestUri: winrtLib.WindowsNs.FoundationNs.Uri): scala.Unit = js.native
  def authenticateAndContinue(requestUri: winrtLib.WindowsNs.FoundationNs.Uri, callbackUri: winrtLib.WindowsNs.FoundationNs.Uri): scala.Unit = js.native
  def authenticateAndContinue(
    requestUri: winrtLib.WindowsNs.FoundationNs.Uri,
    callbackUri: winrtLib.WindowsNs.FoundationNs.Uri,
    continuationData: winrtLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet,
    options: WebAuthenticationOptions
  ): scala.Unit = js.native
  def authenticateAsync(options: WebAuthenticationOptions, requestUri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[WebAuthenticationResult] = js.native
  def authenticateAsync(
    options: WebAuthenticationOptions,
    requestUri: winrtLib.WindowsNs.FoundationNs.Uri,
    callbackUri: winrtLib.WindowsNs.FoundationNs.Uri
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[WebAuthenticationResult] = js.native
  def getCurrentApplicationCallbackUri(): winrtLib.WindowsNs.FoundationNs.Uri = js.native
}

