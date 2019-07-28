package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.FiltersNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
import typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.Certificate
import typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpCookieManager
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpProgress
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpRequestMessage
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpResponseMessage
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The base protocol filter for an HttpClient instance. */
@JSGlobal("Windows.Web.Http.Filters.HttpBaseProtocolFilter")
@js.native
/** Initializes a new instance of the HttpBaseProtocolFilter class. */
class HttpBaseProtocolFilter () extends js.Object {
  /** Get or set a value that indicates whether the HttpBaseProtocolFilter should follow redirection responses. */
  var allowAutoRedirect: Boolean = js.native
  /** Get or set a value that indicates whether the HttpBaseProtocolFilter can prompt for user credentials when requested by the server. */
  var allowUI: Boolean = js.native
  /** Gets or sets a value that indicates whether the HttpBaseProtocolFilter can automatically decompress the HTTP content response. */
  var automaticDecompression: Boolean = js.native
  /** Get or set the read and write cache control behavior to be used on the HttpBaseProtocolFilter object. */
  var cacheControl: HttpCacheControl = js.native
  /** Get or set the client SSL certificate that will be sent to the server if the server requests a client certificate. */
  var clientCertificate: Certificate = js.native
  /** Get the HttpCookieManager with the cookies associated with an app. */
  var cookieManager: HttpCookieManager = js.native
  /** Gets or sets the cookie usage behavior. By default, cookies are handled automatically. */
  var cookieUsageBehavior: HttpCookieUsageBehavior = js.native
  /** Get a vector of SSL server certificate errors that the app might subsequently choose to ignore. */
  var ignorableServerCertificateErrors: IVector[ChainValidationResult] = js.native
  /** Get or set the maximum number of TCP connections allowed per HTTP server by the HttpBaseProtocolFilter object. */
  var maxConnectionsPerServer: Double = js.native
  /** Gets or sets the version of the HTTP protocol used. */
  var maxVersion: HttpVersion = js.native
  /** Get or set the credentials to be used to negotiate with an HTTP proxy. */
  var proxyCredential: PasswordCredential = js.native
  /** Get or set the credentials to be used to authenticate with an HTTP server. */
  var serverCredential: PasswordCredential = js.native
  /** Get or set a value that indicates whether the HttpBaseProtocolFilter can use a proxy for sending HTTP requests. */
  var useProxy: Boolean = js.native
  /** Closes the HttpBaseProtocolFilter instance and releases allocated resources. */
  def close(): Unit = js.native
  /**
    * Send an HTTP request using the HttpBaseProtocolFilter as an asynchronous operation.
    * @param request The HTTP request message to send.
    * @return The object representing the asynchronous operation.
    */
  def sendRequestAsync(request: HttpRequestMessage): IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
}

