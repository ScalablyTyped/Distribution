package typings.twilio

import org.scalablytyped.runtime.StringDictionary
import typings.twilio.libInterfacesMod.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseRequestClientMod {
  
  @JSImport("twilio/lib/base/RequestClient", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with RequestClient {
    def this(opts: RequestClientOptions) = this()
    
    /**
      * Make an HTTP request
      * @param opts The options https.Agent takes in
      */
    /* CompleteClass */
    override def request[TData](opts: RequestOptions[TData, js.Object]): js.Promise[typings.twilio.libHttpResponseMod.^[TData]] = js.native
  }
  
  type Headers = StringDictionary[String]
  
  trait RequestClient extends StObject {
    
    /**
      * Make an HTTP request
      * @param opts The options https.Agent takes in
      */
    def request[TData](opts: RequestOptions[TData, js.Object]): js.Promise[typings.twilio.libHttpResponseMod.^[TData]]
  }
  object RequestClient {
    
    inline def apply(request: RequestOptions[Any, js.Object] => js.Promise[typings.twilio.libHttpResponseMod.^[Any]]): RequestClient = {
      val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
      __obj.asInstanceOf[RequestClient]
    }
    
    extension [Self <: RequestClient](x: Self) {
      
      inline def setRequest(value: RequestOptions[Any, js.Object] => js.Promise[typings.twilio.libHttpResponseMod.^[Any]]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    }
  }
  
  trait RequestClientOptions extends StObject {
    
    /**
      * https.Agent keepAlive option
      */
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * https.Agent keepAliveMSecs option
      */
    var keepAliveMsecs: js.UndefOr[Double] = js.undefined
    
    /**
      * https.Agent maxFreeSockets option
      */
    var maxFreeSockets: js.UndefOr[Double] = js.undefined
    
    /**
      * https.Agent maxSockets option
      */
    var maxSockets: js.UndefOr[Double] = js.undefined
    
    /**
      * https.Agent maxTotalSockets option
      */
    var maxTotalSockets: js.UndefOr[Double] = js.undefined
    
    /**
      * https.Agent scheduling option
      */
    var scheduling: js.UndefOr[String] = js.undefined
    
    /**
      * A timeout in milliseconds. This will be used as the HTTPS agent's socket
      * timeout, AND as the default request timeout.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object RequestClientOptions {
    
    inline def apply(): RequestClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestClientOptions]
    }
    
    extension [Self <: RequestClientOptions](x: Self) {
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMsecs(value: Double): Self = StObject.set(x, "keepAliveMsecs", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMsecsUndefined: Self = StObject.set(x, "keepAliveMsecs", js.undefined)
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setMaxFreeSockets(value: Double): Self = StObject.set(x, "maxFreeSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxFreeSocketsUndefined: Self = StObject.set(x, "maxFreeSockets", js.undefined)
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      inline def setMaxTotalSockets(value: Double): Self = StObject.set(x, "maxTotalSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxTotalSocketsUndefined: Self = StObject.set(x, "maxTotalSockets", js.undefined)
      
      inline def setScheduling(value: String): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
      
      inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait RequestOptions[TData, TParams] extends StObject {
    
    /**
      * Should the client follow redirects
      */
    var allowRedirects: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The form data that should be submitted
      */
    var data: js.UndefOr[TData] = js.undefined
    
    /**
      * Set to true to use the forever-agent
      */
    var forever: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The request headers
      */
    var headers: js.UndefOr[Headers] = js.undefined
    
    /**
      * The HTTP method
      */
    var method: HttpMethod
    
    /**
      * The object of params added as query string to the request
      */
    var params: js.UndefOr[TParams] = js.undefined
    
    /**
      * The password used for auth
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * The request timeout in milliseconds
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The request URI
      */
    var uri: String
    
    /**
      * The username used for auth
      */
    var username: js.UndefOr[String] = js.undefined
  }
  object RequestOptions {
    
    inline def apply[TData, TParams](method: HttpMethod, uri: String): RequestOptions[TData, TParams] = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions[TData, TParams]]
    }
    
    extension [Self <: RequestOptions[?, ?], TData, TParams](x: Self & (RequestOptions[TData, TParams])) {
      
      inline def setAllowRedirects(value: Boolean): Self = StObject.set(x, "allowRedirects", value.asInstanceOf[js.Any])
      
      inline def setAllowRedirectsUndefined: Self = StObject.set(x, "allowRedirects", js.undefined)
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setForever(value: Boolean): Self = StObject.set(x, "forever", value.asInstanceOf[js.Any])
      
      inline def setForeverUndefined: Self = StObject.set(x, "forever", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: TParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
