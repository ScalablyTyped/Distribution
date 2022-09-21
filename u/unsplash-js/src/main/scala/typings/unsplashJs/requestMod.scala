package typings.unsplashJs

import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.Parameters
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.unsplashJs.anon.ResponseResponse
import typings.unsplashJs.responseMod.ApiResponse
import typings.unsplashJs.responseMod.HandleResponse
import typings.unsplashJs.urlMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("unsplash-js/dist/helpers/request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRequestHandler[Args](fn: js.Function1[/* a */ Args, BaseRequestParams]): HandleRequest[Args] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequestHandler")(fn.asInstanceOf[js.Any]).asInstanceOf[HandleRequest[Args]]
  
  @JSImport("unsplash-js/dist/helpers/request", "initMakeRequest")
  @js.native
  val initMakeRequest: InitMakeRequest_ = js.native
  
  inline def makeEndpoint[PathnameParams, RequestArgs, ResponseType_1](endpoint: Endpoint[PathnameParams, RequestArgs, ResponseType_1]): Endpoint[PathnameParams, RequestArgs, ResponseType_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeEndpoint")(endpoint.asInstanceOf[js.Any]).asInstanceOf[Endpoint[PathnameParams, RequestArgs, ResponseType_1]]
  
  /* Inlined parent unsplash-js.unsplash-js/dist/helpers/typescript.OmitStrict<std.RequestInit, keyof unsplash-js.unsplash-js/dist/helpers/request.FetchParams> */
  trait AdditionalFetchOptions extends StObject {
    
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    var window: js.UndefOr[Null] = js.undefined
  }
  object AdditionalFetchOptions {
    
    inline def apply(): AdditionalFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalFetchOptions]
    }
    
    extension [Self <: AdditionalFetchOptions](x: Self) {
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  /**
    * The params generated by the library
    */
  /* Inlined unsplash-js.unsplash-js/dist/helpers/url.BuildUrlParams & unsplash-js.unsplash-js/dist/helpers/request.FetchParams & std.Pick<std.RequestInit, 'headers'> */
  trait BaseRequestParams extends StObject {
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var pathname: String
    
    var query: Query
  }
  object BaseRequestParams {
    
    inline def apply(pathname: String, query: Query): BaseRequestParams = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseRequestParams]
    }
    
    extension [Self <: BaseRequestParams](x: Self) {
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined unsplash-js.unsplash-js/dist/helpers/request.BaseRequestParams & unsplash-js.unsplash-js/dist/helpers/request.AdditionalFetchOptions */
  trait CompleteRequestParams extends StObject {
    
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    var pathname: String
    
    var query: Query
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    var window: js.UndefOr[Null] = js.undefined
  }
  object CompleteRequestParams {
    
    inline def apply(pathname: String, query: Query): CompleteRequestParams = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompleteRequestParams]
    }
    
    extension [Self <: CompleteRequestParams](x: Self) {
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  trait Endpoint[PathnameParams, RequestArgs, ResponseType]
    extends StObject
       with RequestGenerator[RequestArgs, ResponseType] {
    
    def getPathname(params: PathnameParams): String
  }
  object Endpoint {
    
    inline def apply[PathnameParams, RequestArgs, ResponseType](
      getPathname: PathnameParams => String,
      handleRequest: (RequestArgs, /* additionalFetchOptions */ js.UndefOr[AdditionalFetchOptions]) => CompleteRequestParams,
      handleResponse: /* args */ ResponseResponse => js.Promise[ResponseType]
    ): Endpoint[PathnameParams, RequestArgs, ResponseType] = {
      val __obj = js.Dynamic.literal(getPathname = js.Any.fromFunction1(getPathname), handleRequest = js.Any.fromFunction2(handleRequest), handleResponse = js.Any.fromFunction1(handleResponse))
      __obj.asInstanceOf[Endpoint[PathnameParams, RequestArgs, ResponseType]]
    }
    
    extension [Self <: Endpoint[?, ?, ?], PathnameParams, RequestArgs, ResponseType](x: Self & (Endpoint[PathnameParams, RequestArgs, ResponseType])) {
      
      inline def setGetPathname(value: PathnameParams => String): Self = StObject.set(x, "getPathname", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Pick<std.RequestInit, 'method'> */
  trait FetchParams extends StObject {
    
    var method: js.UndefOr[String] = js.undefined
  }
  object FetchParams {
    
    inline def apply(): FetchParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchParams]
    }
    
    extension [Self <: FetchParams](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  type GeneratedRequestFunction[Args, ResponseType] = js.Function1[/* a */ Parameters[HandleRequest[Args]], js.Promise[ApiResponse[ResponseType]]]
  
  type HandleRequest[Args] = js.Function2[
    /* a */ Args, 
    /* additionalFetchOptions */ js.UndefOr[AdditionalFetchOptions], 
    CompleteRequestParams
  ]
  
  type InitMakeRequest_ = js.Function1[
    /* args */ InitParams, 
    js.Function1[/* handlers */ RequestGenerator[Any, Any], GeneratedRequestFunction[Any, Any]]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.anon.accessKeystringapiUrlneve
    - typings.unsplashJs.anon.apiUrlstringaccessKeyneve
  */
  trait InitParams extends StObject
  object InitParams {
    
    inline def accessKeystringapiUrlneve(accessKey: String): typings.unsplashJs.anon.accessKeystringapiUrlneve = {
      val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.unsplashJs.anon.accessKeystringapiUrlneve]
    }
    
    inline def apiUrlstringaccessKeyneve(apiUrl: String): typings.unsplashJs.anon.apiUrlstringaccessKeyneve = {
      val __obj = js.Dynamic.literal(apiUrl = apiUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.unsplashJs.anon.apiUrlstringaccessKeyneve]
    }
  }
  
  trait RequestGenerator[Args, ResponseType] extends StObject {
    
    def handleRequest(a: Args): CompleteRequestParams
    def handleRequest(a: Args, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams
    @JSName("handleRequest")
    var handleRequest_Original: HandleRequest[Args]
    
    def handleResponse(args: ResponseResponse): js.Promise[ResponseType]
    @JSName("handleResponse")
    var handleResponse_Original: HandleResponse[ResponseType]
  }
  object RequestGenerator {
    
    inline def apply[Args, ResponseType](
      handleRequest: (Args, /* additionalFetchOptions */ js.UndefOr[AdditionalFetchOptions]) => CompleteRequestParams,
      handleResponse: /* args */ ResponseResponse => js.Promise[ResponseType]
    ): RequestGenerator[Args, ResponseType] = {
      val __obj = js.Dynamic.literal(handleRequest = js.Any.fromFunction2(handleRequest), handleResponse = js.Any.fromFunction1(handleResponse))
      __obj.asInstanceOf[RequestGenerator[Args, ResponseType]]
    }
    
    extension [Self <: RequestGenerator[?, ?], Args, ResponseType](x: Self & (RequestGenerator[Args, ResponseType])) {
      
      inline def setHandleRequest(
        value: (Args, /* additionalFetchOptions */ js.UndefOr[AdditionalFetchOptions]) => CompleteRequestParams
      ): Self = StObject.set(x, "handleRequest", js.Any.fromFunction2(value))
      
      inline def setHandleResponse(value: /* args */ ResponseResponse => js.Promise[ResponseType]): Self = StObject.set(x, "handleResponse", js.Any.fromFunction1(value))
    }
  }
}
