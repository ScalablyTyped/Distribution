package typings.winrtUwp.Windows.Web.Http.Filters

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import typings.winrtUwp.Windows.Web.Http.HttpCookieManager
import typings.winrtUwp.Windows.Web.Http.HttpProgress
import typings.winrtUwp.Windows.Web.Http.HttpRequestMessage
import typings.winrtUwp.Windows.Web.Http.HttpResponseMessage
import typings.winrtUwp.Windows.Web.Http.HttpVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The base protocol filter for an HttpClient instance. */
@js.native
trait HttpBaseProtocolFilter extends js.Object {
  
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
  
  /** Closes the HttpBaseProtocolFilter instance and releases allocated resources. */
  def close(): Unit = js.native
  
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
  
  /**
    * Send an HTTP request using the HttpBaseProtocolFilter as an asynchronous operation.
    * @param request The HTTP request message to send.
    * @return The object representing the asynchronous operation.
    */
  def sendRequestAsync(request: HttpRequestMessage): IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
  
  /** Get or set the credentials to be used to authenticate with an HTTP server. */
  var serverCredential: PasswordCredential = js.native
  
  /** Get or set a value that indicates whether the HttpBaseProtocolFilter can use a proxy for sending HTTP requests. */
  var useProxy: Boolean = js.native
}
object HttpBaseProtocolFilter {
  
  @scala.inline
  def apply(
    allowAutoRedirect: Boolean,
    allowUI: Boolean,
    automaticDecompression: Boolean,
    cacheControl: HttpCacheControl,
    clientCertificate: Certificate,
    close: () => Unit,
    cookieManager: HttpCookieManager,
    cookieUsageBehavior: HttpCookieUsageBehavior,
    ignorableServerCertificateErrors: IVector[ChainValidationResult],
    maxConnectionsPerServer: Double,
    maxVersion: HttpVersion,
    proxyCredential: PasswordCredential,
    sendRequestAsync: HttpRequestMessage => IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress],
    serverCredential: PasswordCredential,
    useProxy: Boolean
  ): HttpBaseProtocolFilter = {
    val __obj = js.Dynamic.literal(allowAutoRedirect = allowAutoRedirect.asInstanceOf[js.Any], allowUI = allowUI.asInstanceOf[js.Any], automaticDecompression = automaticDecompression.asInstanceOf[js.Any], cacheControl = cacheControl.asInstanceOf[js.Any], clientCertificate = clientCertificate.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), cookieManager = cookieManager.asInstanceOf[js.Any], cookieUsageBehavior = cookieUsageBehavior.asInstanceOf[js.Any], ignorableServerCertificateErrors = ignorableServerCertificateErrors.asInstanceOf[js.Any], maxConnectionsPerServer = maxConnectionsPerServer.asInstanceOf[js.Any], maxVersion = maxVersion.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], sendRequestAsync = js.Any.fromFunction1(sendRequestAsync), serverCredential = serverCredential.asInstanceOf[js.Any], useProxy = useProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpBaseProtocolFilter]
  }
  
  @scala.inline
  implicit class HttpBaseProtocolFilterOps[Self <: HttpBaseProtocolFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowAutoRedirect(value: Boolean): Self = this.set("allowAutoRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUI(value: Boolean): Self = this.set("allowUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticDecompression(value: Boolean): Self = this.set("automaticDecompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheControl(value: HttpCacheControl): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertificate(value: Certificate): Self = this.set("clientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCookieManager(value: HttpCookieManager): Self = this.set("cookieManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieUsageBehavior(value: HttpCookieUsageBehavior): Self = this.set("cookieUsageBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorableServerCertificateErrors(value: IVector[ChainValidationResult]): Self = this.set("ignorableServerCertificateErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConnectionsPerServer(value: Double): Self = this.set("maxConnectionsPerServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVersion(value: HttpVersion): Self = this.set("maxVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyCredential(value: PasswordCredential): Self = this.set("proxyCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendRequestAsync(
      value: HttpRequestMessage => IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress]
    ): Self = this.set("sendRequestAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setServerCredential(value: PasswordCredential): Self = this.set("serverCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseProxy(value: Boolean): Self = this.set("useProxy", value.asInstanceOf[js.Any])
  }
}
