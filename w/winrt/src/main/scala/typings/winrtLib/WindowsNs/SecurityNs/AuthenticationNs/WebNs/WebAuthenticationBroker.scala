package typings
package winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker")
@js.native
class WebAuthenticationBroker () extends js.Object

@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker")
@js.native
object WebAuthenticationBroker extends js.Object {
  def authenticateAndContinue(requestUri: winrtLib.WindowsNs.FoundationNs.Uri): scala.Unit = js.native
  def authenticateAndContinue(requestUri: winrtLib.WindowsNs.FoundationNs.Uri, callbackUri: winrtLib.WindowsNs.FoundationNs.Uri): scala.Unit = js.native
  def authenticateAndContinue(
    requestUri: winrtLib.WindowsNs.FoundationNs.Uri,
    callbackUri: winrtLib.WindowsNs.FoundationNs.Uri,
    continuationData: winrtLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet,
    options: winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions
  ): scala.Unit = js.native
  def authenticateAsync(
    options: winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions,
    requestUri: winrtLib.WindowsNs.FoundationNs.Uri
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationResult] = js.native
  def authenticateAsync(
    options: winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions,
    requestUri: winrtLib.WindowsNs.FoundationNs.Uri,
    callbackUri: winrtLib.WindowsNs.FoundationNs.Uri
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationResult] = js.native
  def getCurrentApplicationCallbackUri(): winrtLib.WindowsNs.FoundationNs.Uri = js.native
}

