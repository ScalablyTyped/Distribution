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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes to send HTTP requests and an interface to create filters to target HTTP and REST services in Windows Store apps. */
object Filters {
  
  /** The base protocol filter for an HttpClient instance. */
  @JSGlobal("Windows.Web.Http.Filters.HttpBaseProtocolFilter")
  @js.native
  /** Initializes a new instance of the HttpBaseProtocolFilter class. */
  open class HttpBaseProtocolFilter ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Http.Filters.HttpBaseProtocolFilter {
    
    /** Get or set a value that indicates whether the HttpBaseProtocolFilter should follow redirection responses. */
    /* CompleteClass */
    var allowAutoRedirect: Boolean = js.native
    
    /** Get or set a value that indicates whether the HttpBaseProtocolFilter can prompt for user credentials when requested by the server. */
    /* CompleteClass */
    var allowUI: Boolean = js.native
    
    /** Gets or sets a value that indicates whether the HttpBaseProtocolFilter can automatically decompress the HTTP content response. */
    /* CompleteClass */
    var automaticDecompression: Boolean = js.native
    
    /** Get or set the read and write cache control behavior to be used on the HttpBaseProtocolFilter object. */
    /* CompleteClass */
    var cacheControl: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheControl = js.native
    
    /** Get or set the client SSL certificate that will be sent to the server if the server requests a client certificate. */
    /* CompleteClass */
    var clientCertificate: Certificate = js.native
    
    /** Closes the HttpBaseProtocolFilter instance and releases allocated resources. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Get the HttpCookieManager with the cookies associated with an app. */
    /* CompleteClass */
    var cookieManager: typings.winrtUwp.Windows.Web.Http.HttpCookieManager = js.native
    
    /** Gets or sets the cookie usage behavior. By default, cookies are handled automatically. */
    /* CompleteClass */
    var cookieUsageBehavior: HttpCookieUsageBehavior = js.native
    
    /** Get a vector of SSL server certificate errors that the app might subsequently choose to ignore. */
    /* CompleteClass */
    var ignorableServerCertificateErrors: IVector[ChainValidationResult] = js.native
    
    /** Get or set the maximum number of TCP connections allowed per HTTP server by the HttpBaseProtocolFilter object. */
    /* CompleteClass */
    var maxConnectionsPerServer: Double = js.native
    
    /** Gets or sets the version of the HTTP protocol used. */
    /* CompleteClass */
    var maxVersion: typings.winrtUwp.Windows.Web.Http.HttpVersion = js.native
    
    /** Get or set the credentials to be used to negotiate with an HTTP proxy. */
    /* CompleteClass */
    var proxyCredential: PasswordCredential = js.native
    
    /**
      * Send an HTTP request using the HttpBaseProtocolFilter as an asynchronous operation.
      * @param request The HTTP request message to send.
      * @return The object representing the asynchronous operation.
      */
    /* CompleteClass */
    override def sendRequestAsync(request: typings.winrtUwp.Windows.Web.Http.HttpRequestMessage): IPromiseWithIAsyncOperationWithProgress[typings.winrtUwp.Windows.Web.Http.HttpResponseMessage, HttpProgress] = js.native
    
    /** Get or set the credentials to be used to authenticate with an HTTP server. */
    /* CompleteClass */
    var serverCredential: PasswordCredential = js.native
    
    /** Get or set a value that indicates whether the HttpBaseProtocolFilter can use a proxy for sending HTTP requests. */
    /* CompleteClass */
    var useProxy: Boolean = js.native
  }
  
  /** Provides control of the local HTTP cache for responses to HTTP requests by methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces. */
  /* note: abstract class */ @JSGlobal("Windows.Web.Http.Filters.HttpCacheControl")
  @js.native
  open class HttpCacheControl ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheControl {
    
    /** Get or set the read behavior to use for cache control on the HttpCacheControl object. */
    /* CompleteClass */
    var readBehavior: HttpCacheReadBehavior = js.native
    
    /** Get or set the write behavior to use for cache control on the HttpCacheControl object. */
    /* CompleteClass */
    var writeBehavior: HttpCacheWriteBehavior = js.native
  }
  
  /** Indicates if read requests by class methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces use the local HTTP cache for the response. */
  @JSGlobal("Windows.Web.Http.Filters.HttpCacheReadBehavior")
  @js.native
  object HttpCacheReadBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior & Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior.default & Double = js.native
    
    /* 1 */ val mostRecent: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior.mostRecent & Double = js.native
    
    /* 2 */ val onlyFromCache: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior.onlyFromCache & Double = js.native
  }
  
  /** Indicates if content returned by requests used by class methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces is written to the local HTTP cache. */
  @JSGlobal("Windows.Web.Http.Filters.HttpCacheWriteBehavior")
  @js.native
  object HttpCacheWriteBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior & Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior.default & Double = js.native
    
    /* 1 */ val noCache: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior.noCache & Double = js.native
  }
  
  /** Defines the cookie usage behavior that is used in the CookieUsageBehavior property. */
  @JSGlobal("Windows.Web.Http.Filters.HttpCookieUsageBehavior")
  @js.native
  object HttpCookieUsageBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Web.Http.Filters.HttpCookieUsageBehavior & Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Web.Http.Filters.HttpCookieUsageBehavior.default & Double = js.native
    
    /* 1 */ val noCookies: typings.winrtUwp.Windows.Web.Http.Filters.HttpCookieUsageBehavior.noCookies & Double = js.native
  }
}
