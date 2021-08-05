package typings.winrtUwp.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IClosable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes to send HTTP requests and an interface to create filters to target HTTP and REST services in Windows Store apps. */
object Filters {
  
  @js.native
  sealed trait HttpCacheReadBehavior extends StObject
  /** Indicates if read requests by class methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces use the local HTTP cache for the response. */
  @JSGlobal("Windows.Web.Http.Filters.HttpCacheReadBehavior")
  @js.native
  object HttpCacheReadBehavior extends StObject {
    
    /** Always use the cache algorithm specified in RFC 2616 by the IETF to optimize network bandwidth. */
    @js.native
    sealed trait default
      extends StObject
         with HttpCacheReadBehavior
    
    /** Use the local HTTP cache if possible but always ask the server if more recent content is available. */
    @js.native
    sealed trait mostRecent
      extends StObject
         with HttpCacheReadBehavior
    
    /** Only use data from the local HTTP cache. This is the offline behavior. */
    @js.native
    sealed trait onlyFromCache
      extends StObject
         with HttpCacheReadBehavior
  }
  
  @js.native
  sealed trait HttpCacheWriteBehavior extends StObject
  /** Indicates if content returned by requests used by class methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces is written to the local HTTP cache. */
  @JSGlobal("Windows.Web.Http.Filters.HttpCacheWriteBehavior")
  @js.native
  object HttpCacheWriteBehavior extends StObject {
    
    /** Use the default behavior of WinInet. This usually results in writing the response to the local HTTP cache. */
    @js.native
    sealed trait default
      extends StObject
         with HttpCacheWriteBehavior
    
    /** Never write the response to the local HTTP cache. */
    @js.native
    sealed trait noCache
      extends StObject
         with HttpCacheWriteBehavior
  }
  
  @js.native
  sealed trait HttpCookieUsageBehavior extends StObject
  /** Defines the cookie usage behavior that is used in the CookieUsageBehavior property. */
  @JSGlobal("Windows.Web.Http.Filters.HttpCookieUsageBehavior")
  @js.native
  object HttpCookieUsageBehavior extends StObject {
    
    /** Automatically handle cookies. */
    @js.native
    sealed trait default
      extends StObject
         with HttpCookieUsageBehavior
    
    /** Do not handle cookies automatically. */
    @js.native
    sealed trait noCookies
      extends StObject
         with HttpCookieUsageBehavior
  }
  
  /** The base protocol filter for an HttpClient instance. */
  trait HttpBaseProtocolFilter extends StObject {
    
    /** Get or set a value that indicates whether the HttpBaseProtocolFilter should follow redirection responses. */
    var allowAutoRedirect: Boolean
    
    /** Get or set a value that indicates whether the HttpBaseProtocolFilter can prompt for user credentials when requested by the server. */
    var allowUI: Boolean
    
    /** Gets or sets a value that indicates whether the HttpBaseProtocolFilter can automatically decompress the HTTP content response. */
    var automaticDecompression: Boolean
    
    /** Get or set the read and write cache control behavior to be used on the HttpBaseProtocolFilter object. */
    var cacheControl: HttpCacheControl
    
    /** Get or set the client SSL certificate that will be sent to the server if the server requests a client certificate. */
    var clientCertificate: Certificate
    
    /** Closes the HttpBaseProtocolFilter instance and releases allocated resources. */
    def close(): Unit
    
    /** Get the HttpCookieManager with the cookies associated with an app. */
    var cookieManager: HttpCookieManager
    
    /** Gets or sets the cookie usage behavior. By default, cookies are handled automatically. */
    var cookieUsageBehavior: HttpCookieUsageBehavior
    
    /** Get a vector of SSL server certificate errors that the app might subsequently choose to ignore. */
    var ignorableServerCertificateErrors: IVector[ChainValidationResult]
    
    /** Get or set the maximum number of TCP connections allowed per HTTP server by the HttpBaseProtocolFilter object. */
    var maxConnectionsPerServer: Double
    
    /** Gets or sets the version of the HTTP protocol used. */
    var maxVersion: HttpVersion
    
    /** Get or set the credentials to be used to negotiate with an HTTP proxy. */
    var proxyCredential: PasswordCredential
    
    /**
      * Send an HTTP request using the HttpBaseProtocolFilter as an asynchronous operation.
      * @param request The HTTP request message to send.
      * @return The object representing the asynchronous operation.
      */
    def sendRequestAsync(request: HttpRequestMessage): IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress]
    
    /** Get or set the credentials to be used to authenticate with an HTTP server. */
    var serverCredential: PasswordCredential
    
    /** Get or set a value that indicates whether the HttpBaseProtocolFilter can use a proxy for sending HTTP requests. */
    var useProxy: Boolean
  }
  object HttpBaseProtocolFilter {
    
    inline def apply(
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
    
    extension [Self <: HttpBaseProtocolFilter](x: Self) {
      
      inline def setAllowAutoRedirect(value: Boolean): Self = StObject.set(x, "allowAutoRedirect", value.asInstanceOf[js.Any])
      
      inline def setAllowUI(value: Boolean): Self = StObject.set(x, "allowUI", value.asInstanceOf[js.Any])
      
      inline def setAutomaticDecompression(value: Boolean): Self = StObject.set(x, "automaticDecompression", value.asInstanceOf[js.Any])
      
      inline def setCacheControl(value: HttpCacheControl): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      inline def setClientCertificate(value: Certificate): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setCookieManager(value: HttpCookieManager): Self = StObject.set(x, "cookieManager", value.asInstanceOf[js.Any])
      
      inline def setCookieUsageBehavior(value: HttpCookieUsageBehavior): Self = StObject.set(x, "cookieUsageBehavior", value.asInstanceOf[js.Any])
      
      inline def setIgnorableServerCertificateErrors(value: IVector[ChainValidationResult]): Self = StObject.set(x, "ignorableServerCertificateErrors", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionsPerServer(value: Double): Self = StObject.set(x, "maxConnectionsPerServer", value.asInstanceOf[js.Any])
      
      inline def setMaxVersion(value: HttpVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      inline def setProxyCredential(value: PasswordCredential): Self = StObject.set(x, "proxyCredential", value.asInstanceOf[js.Any])
      
      inline def setSendRequestAsync(
        value: HttpRequestMessage => IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress]
      ): Self = StObject.set(x, "sendRequestAsync", js.Any.fromFunction1(value))
      
      inline def setServerCredential(value: PasswordCredential): Self = StObject.set(x, "serverCredential", value.asInstanceOf[js.Any])
      
      inline def setUseProxy(value: Boolean): Self = StObject.set(x, "useProxy", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides control of the local HTTP cache for responses to HTTP requests by methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces. */
  trait HttpCacheControl extends StObject {
    
    /** Get or set the read behavior to use for cache control on the HttpCacheControl object. */
    var readBehavior: HttpCacheReadBehavior
    
    /** Get or set the write behavior to use for cache control on the HttpCacheControl object. */
    var writeBehavior: HttpCacheWriteBehavior
  }
  object HttpCacheControl {
    
    inline def apply(readBehavior: HttpCacheReadBehavior, writeBehavior: HttpCacheWriteBehavior): HttpCacheControl = {
      val __obj = js.Dynamic.literal(readBehavior = readBehavior.asInstanceOf[js.Any], writeBehavior = writeBehavior.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpCacheControl]
    }
    
    extension [Self <: HttpCacheControl](x: Self) {
      
      inline def setReadBehavior(value: HttpCacheReadBehavior): Self = StObject.set(x, "readBehavior", value.asInstanceOf[js.Any])
      
      inline def setWriteBehavior(value: HttpCacheWriteBehavior): Self = StObject.set(x, "writeBehavior", value.asInstanceOf[js.Any])
    }
  }
  
  /** An interface used to implement custom filters for an HttpClient instance. */
  trait IHttpFilter
    extends StObject
       with IClosable {
    
    /**
      * Send an HTTP request on the IHttpFilter instance as an asynchronous operation.
      * @param request The HTTP request message to send.
      * @return The object representing the asynchronous operation.
      */
    def sendRequestAsync(request: HttpRequestMessage): IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress]
  }
  object IHttpFilter {
    
    inline def apply(
      close: () => Unit,
      sendRequestAsync: HttpRequestMessage => IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress]
    ): IHttpFilter = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), sendRequestAsync = js.Any.fromFunction1(sendRequestAsync))
      __obj.asInstanceOf[IHttpFilter]
    }
    
    extension [Self <: IHttpFilter](x: Self) {
      
      inline def setSendRequestAsync(
        value: HttpRequestMessage => IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress]
      ): Self = StObject.set(x, "sendRequestAsync", js.Any.fromFunction1(value))
    }
  }
}
