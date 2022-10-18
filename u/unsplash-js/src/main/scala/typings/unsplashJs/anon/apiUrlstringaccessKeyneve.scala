package typings.unsplashJs.anon

import typings.std.AbortSignal
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.unsplashJs.distHelpersRequestMod.InitParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  apiUrl :string,   accessKey :never | undefined} & {  apiVersion :string | undefined,   fetch :{None (input : std.URL, init : std.RequestInit): std.Promise<std.Response>, None (input : std.RequestInfo, init : std.RequestInit): std.Promise<std.Response>, None (input : std.URL): std.Promise<std.Response>, None (input : std.RequestInfo): std.Promise<std.Response>} | undefined} & unsplash-js.unsplash-js/dist/helpers/typescript.OmitStrict<std.RequestInit, 'method' | 'body'> */
trait apiUrlstringaccessKeyneve
  extends StObject
     with InitParams {
  
  var accessKey: js.UndefOr[scala.Nothing] = js.undefined
  
  var apiUrl: String
  
  var apiVersion: js.UndefOr[String] = js.undefined
  
  var cache: js.UndefOr[RequestCache] = js.undefined
  
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  
  var fetch: js.UndefOr[FnCall] = js.undefined
  
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
object apiUrlstringaccessKeyneve {
  
  inline def apply(apiUrl: String): apiUrlstringaccessKeyneve = {
    val __obj = js.Dynamic.literal(apiUrl = apiUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[apiUrlstringaccessKeyneve]
  }
  
  extension [Self <: apiUrlstringaccessKeyneve](x: Self) {
    
    inline def setApiUrl(value: String): Self = StObject.set(x, "apiUrl", value.asInstanceOf[js.Any])
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
    
    inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    
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
