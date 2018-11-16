package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The base protocol filter for an HttpClient instance. */
@JSGlobal("Windows.Web.Http.Filters.HttpBaseProtocolFilter")
@js.native
class HttpBaseProtocolFilter () extends js.Object {
  /** Get or set a value that indicates whether the HttpBaseProtocolFilter should follow redirection responses. */
  var allowAutoRedirect: scala.Boolean = js.native
  /** Get or set a value that indicates whether the HttpBaseProtocolFilter can prompt for user credentials when requested by the server. */
  var allowUI: scala.Boolean = js.native
  /** Gets or sets a value that indicates whether the HttpBaseProtocolFilter can automatically decompress the HTTP content response. */
  var automaticDecompression: scala.Boolean = js.native
  /** Get or set the read and write cache control behavior to be used on the HttpBaseProtocolFilter object. */
  var cacheControl: HttpCacheControl = js.native
  /** Get or set the client SSL certificate that will be sent to the server if the server requests a client certificate. */
  var clientCertificate: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.Certificate = js.native
  /** Get the HttpCookieManager with the cookies associated with an app. */
  var cookieManager: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpCookieManager = js.native
  /** Gets or sets the cookie usage behavior. By default, cookies are handled automatically. */
  var cookieUsageBehavior: HttpCookieUsageBehavior = js.native
  /** Get a vector of SSL server certificate errors that the app might subsequently choose to ignore. */
  var ignorableServerCertificateErrors: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  ] = js.native
  /** Get or set the maximum number of TCP connections allowed per HTTP server by the HttpBaseProtocolFilter object. */
  var maxConnectionsPerServer: scala.Double = js.native
  /** Gets or sets the version of the HTTP protocol used. */
  var maxVersion: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpVersion = js.native
  /** Get or set the credentials to be used to negotiate with an HTTP proxy. */
  var proxyCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /** Get or set the credentials to be used to authenticate with an HTTP server. */
  var serverCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /** Get or set a value that indicates whether the HttpBaseProtocolFilter can use a proxy for sending HTTP requests. */
  var useProxy: scala.Boolean = js.native
  /** Closes the HttpBaseProtocolFilter instance and releases allocated resources. */
  def close(): scala.Unit = js.native
  /**
                       * Send an HTTP request using the HttpBaseProtocolFilter as an asynchronous operation.
                       * @param request The HTTP request message to send.
                       * @return The object representing the asynchronous operation.
                       */
  def sendRequestAsync(request: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpRequestMessage): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[
    winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpResponseMessage, 
    winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgress
  ] = js.native
}

