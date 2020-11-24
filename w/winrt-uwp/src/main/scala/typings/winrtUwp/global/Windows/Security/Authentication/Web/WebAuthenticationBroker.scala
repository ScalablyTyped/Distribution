package typings.winrtUwp.global.Windows.Security.Authentication.Web

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Starts the authentication operation. You can call the methods of this class multiple times in a single application or across multiple applications at the same time. */
@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker")
@js.native
abstract class WebAuthenticationBroker ()
  extends typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationBroker
/* static members */
@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker")
@js.native
object WebAuthenticationBroker extends js.Object {
  
  /**
    * Starts the authentication operation with one input.
    * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
    */
  def authenticateAndContinue(requestUri: Uri): Unit = js.native
  /**
    * Starts the authentication operation with two inputs.
    * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
    * @param callbackUri The callback URI that indicates the completion of the web authentication. The broker matches this URI against every URI that it is about to navigate to. The broker never navigates to this URI, instead the broker returns the control back to the application when the user clicks a link or a web server redirection is made.
    */
  def authenticateAndContinue(requestUri: Uri, callbackUri: Uri): Unit = js.native
  /**
    * Starts the authentication operation with four inputs.
    * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
    * @param callbackUri The callback URI that indicates the completion of the web authentication. The broker matches this URI against every URI that it is about to navigate to. The broker never navigates to this URI, instead the broker returns the control back to the application when the user clicks a link or a web server redirection is made.
    * @param continuationData Continuation data to be passed as part of the authentication operation.
    * @param options The options for the authentication operation.
    */
  def authenticateAndContinue(
    requestUri: Uri,
    callbackUri: Uri,
    continuationData: ValueSet,
    options: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions
  ): Unit = js.native
  
  /**
    * Starts the asynchronous authentication operation with two inputs. You can call this method multiple times in a single application or across multiple applications at the same time.
    * @param options The options for the authentication operation.
    * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
    * @return The way to query the status and get the results of the authentication operation. If you are getting an invalid parameter error, the most common cause is that you are not using HTTPS for the requestUri parameter.
    */
  def authenticateAsync(
    options: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions,
    requestUri: Uri
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult] = js.native
  /**
    * Starts the asynchronous authentication operation with three inputs. You can call this method multiple times in a single application or across multiple applications at the same time.
    * @param options The options for the authentication operation.
    * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
    * @param callbackUri The callback URI that indicates the completion of the web authentication. The broker matches this URI against every URI that it is about to navigate to. The broker never navigates to this URI, instead the broker returns the control back to the application when the user clicks a link or a web server redirection is made.
    * @return The way to query the status and get the results of the authentication operation. If you are getting an invalid parameter error, the most common cause is that you are not using HTTPS for the requestUri parameter.
    */
  def authenticateAsync(
    options: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions,
    requestUri: Uri,
    callbackUri: Uri
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult] = js.native
  
  /**
    * Starts the asynchronous authentication operation silently (no UI will be shown) with one input. You can call this method multiple times in a single application or across multiple applications at the same time.
    * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
    * @return The way to query the status and get the results of the authentication operation. If you are getting an invalid parameter error, the most common cause is that you are not using HTTPS for the requestUri parameter.
    */
  def authenticateSilentlyAsync(requestUri: Uri): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult] = js.native
  /**
    * Starts the asynchronous authentication operation silently (no UI will be shown) with two inputs. You can call this method multiple times in a single application or across multiple applications at the same time.
    * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
    * @param options The options for the authentication operation.
    * @return The way to query the status and get the results of the authentication operation. If you are getting an invalid parameter error, the most common cause is that you are not using HTTPS for the requestUri parameter.
    */
  def authenticateSilentlyAsync(
    requestUri: Uri,
    options: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult] = js.native
  
  /**
    * Gets the current application callback URI.
    * @return The URI of the current application.
    */
  def getCurrentApplicationCallbackUri(): Uri = js.native
}
