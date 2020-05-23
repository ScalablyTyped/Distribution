package typings.winrtUwp.global.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior
import typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior
import typings.winrtUwp.Windows.Web.Http.Filters.HttpCookieUsageBehavior
import typings.winrtUwp.Windows.Web.Http.HttpProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides classes to send HTTP requests and an interface to create filters to target HTTP and REST services in Windows Store apps. */
@JSGlobal("Windows.Web.Http.Filters")
@js.native
object Filters extends js.Object {
  /** The base protocol filter for an HttpClient instance. */
  @js.native
  /** Initializes a new instance of the HttpBaseProtocolFilter class. */
  class HttpBaseProtocolFilter ()
    extends typings.winrtUwp.Windows.Web.Http.Filters.HttpBaseProtocolFilter {
    /** Get or set a value that indicates whether the HttpBaseProtocolFilter should follow redirection responses. */
    /* CompleteClass */
    override var allowAutoRedirect: Boolean = js.native
    /** Get or set a value that indicates whether the HttpBaseProtocolFilter can prompt for user credentials when requested by the server. */
    /* CompleteClass */
    override var allowUI: Boolean = js.native
    /** Gets or sets a value that indicates whether the HttpBaseProtocolFilter can automatically decompress the HTTP content response. */
    /* CompleteClass */
    override var automaticDecompression: Boolean = js.native
    /** Get or set the read and write cache control behavior to be used on the HttpBaseProtocolFilter object. */
    /* CompleteClass */
    override var cacheControl: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheControl = js.native
    /** Get or set the client SSL certificate that will be sent to the server if the server requests a client certificate. */
    /* CompleteClass */
    override var clientCertificate: Certificate = js.native
    /** Get the HttpCookieManager with the cookies associated with an app. */
    /* CompleteClass */
    override var cookieManager: typings.winrtUwp.Windows.Web.Http.HttpCookieManager = js.native
    /** Gets or sets the cookie usage behavior. By default, cookies are handled automatically. */
    /* CompleteClass */
    override var cookieUsageBehavior: HttpCookieUsageBehavior = js.native
    /** Get a vector of SSL server certificate errors that the app might subsequently choose to ignore. */
    /* CompleteClass */
    override var ignorableServerCertificateErrors: IVector[ChainValidationResult] = js.native
    /** Get or set the maximum number of TCP connections allowed per HTTP server by the HttpBaseProtocolFilter object. */
    /* CompleteClass */
    override var maxConnectionsPerServer: Double = js.native
    /** Gets or sets the version of the HTTP protocol used. */
    /* CompleteClass */
    override var maxVersion: typings.winrtUwp.Windows.Web.Http.HttpVersion = js.native
    /** Get or set the credentials to be used to negotiate with an HTTP proxy. */
    /* CompleteClass */
    override var proxyCredential: PasswordCredential = js.native
    /** Get or set the credentials to be used to authenticate with an HTTP server. */
    /* CompleteClass */
    override var serverCredential: PasswordCredential = js.native
    /** Get or set a value that indicates whether the HttpBaseProtocolFilter can use a proxy for sending HTTP requests. */
    /* CompleteClass */
    override var useProxy: Boolean = js.native
    /** Closes the HttpBaseProtocolFilter instance and releases allocated resources. */
    /* CompleteClass */
    override def close(): Unit = js.native
    /**
      * Send an HTTP request using the HttpBaseProtocolFilter as an asynchronous operation.
      * @param request The HTTP request message to send.
      * @return The object representing the asynchronous operation.
      */
    /* CompleteClass */
    override def sendRequestAsync(request: typings.winrtUwp.Windows.Web.Http.HttpRequestMessage): IPromiseWithIAsyncOperationWithProgress[typings.winrtUwp.Windows.Web.Http.HttpResponseMessage, HttpProgress] = js.native
  }
  
  /** Provides control of the local HTTP cache for responses to HTTP requests by methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces. */
  @js.native
  abstract class HttpCacheControl ()
    extends typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheControl {
    /** Get or set the read behavior to use for cache control on the HttpCacheControl object. */
    /* CompleteClass */
    override var readBehavior: HttpCacheReadBehavior = js.native
    /** Get or set the write behavior to use for cache control on the HttpCacheControl object. */
    /* CompleteClass */
    override var writeBehavior: HttpCacheWriteBehavior = js.native
  }
  
  /** Indicates if read requests by class methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces use the local HTTP cache for the response. */
  @js.native
  object HttpCacheReadBehavior extends js.Object {
    /* 0 */ val default: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior.default with Double = js.native
    /* 1 */ val mostRecent: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior.mostRecent with Double = js.native
    /* 2 */ val onlyFromCache: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior.onlyFromCache with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior with Double] = js.native
  }
  
  /** Indicates if content returned by requests used by class methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces is written to the local HTTP cache. */
  @js.native
  object HttpCacheWriteBehavior extends js.Object {
    /* 0 */ val default: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior.default with Double = js.native
    /* 1 */ val noCache: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior.noCache with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior with Double] = js.native
  }
  
  /** Defines the cookie usage behavior that is used in the CookieUsageBehavior property. */
  @js.native
  object HttpCookieUsageBehavior extends js.Object {
    /* 0 */ val default: typings.winrtUwp.Windows.Web.Http.Filters.HttpCookieUsageBehavior.default with Double = js.native
    /* 1 */ val noCookies: typings.winrtUwp.Windows.Web.Http.Filters.HttpCookieUsageBehavior.noCookies with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Web.Http.Filters.HttpCookieUsageBehavior with Double] = js.native
  }
  
}

