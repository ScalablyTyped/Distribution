package typings.thenRequest

import org.scalablytyped.runtime.StringDictionary
import typings.httpBasic.libCachedResponseMod.CachedResponse
import typings.httpBasic.libIcacheMod.ICache
import typings.httpResponseObject.mod.^
import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingHttpHeaders
import typings.thenRequest.thenRequestStrings.file
import typings.thenRequest.thenRequestStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptionsMod {
  
  trait Options extends StObject {
    
    var agent: js.UndefOr[Boolean | Agent] = js.undefined
    
    var allowRedirectHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    var body: js.UndefOr[String | Buffer | ReadableStream] = js.undefined
    
    var cache: js.UndefOr[file | memory | ICache] = js.undefined
    
    var canCache: js.UndefOr[js.Function2[/* res */ ^[ReadableStream], /* defaultValue */ Boolean, Boolean]] = js.undefined
    
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    var form: js.UndefOr[typings.formData.mod.^] = js.undefined
    
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    var isExpired: js.UndefOr[
        js.Function2[/* cachedResponse */ CachedResponse, /* defaultValue */ Boolean, Boolean]
      ] = js.undefined
    
    var isMatch: js.UndefOr[
        js.Function3[
          /* requestHeaders */ IncomingHttpHeaders, 
          /* cachedResponse */ CachedResponse, 
          /* defaultValue */ Boolean, 
          Boolean
        ]
      ] = js.undefined
    
    var json: js.UndefOr[Any] = js.undefined
    
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var qs: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var retry: js.UndefOr[
        Boolean | (js.Function3[
          /* err */ ErrnoException | Null, 
          /* res */ (^[ReadableStream | Buffer | String]) | Unit, 
          /* attemptNumber */ Double, 
          Boolean
        ])
      ] = js.undefined
    
    var retryDelay: js.UndefOr[
        Double | (js.Function3[
          /* err */ ErrnoException | Null, 
          /* res */ (^[ReadableStream | Buffer | String]) | Unit, 
          /* attemptNumber */ Double, 
          Double
        ])
      ] = js.undefined
    
    var socketTimeout: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Boolean | Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAllowRedirectHeaders(value: js.Array[String]): Self = StObject.set(x, "allowRedirectHeaders", value.asInstanceOf[js.Any])
      
      inline def setAllowRedirectHeadersUndefined: Self = StObject.set(x, "allowRedirectHeaders", js.undefined)
      
      inline def setAllowRedirectHeadersVarargs(value: String*): Self = StObject.set(x, "allowRedirectHeaders", js.Array(value*))
      
      inline def setBody(value: String | Buffer | ReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: file | memory | ICache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCanCache(value: (/* res */ ^[ReadableStream], /* defaultValue */ Boolean) => Boolean): Self = StObject.set(x, "canCache", js.Any.fromFunction2(value))
      
      inline def setCanCacheUndefined: Self = StObject.set(x, "canCache", js.undefined)
      
      inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      inline def setForm(value: typings.formData.mod.^): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIsExpired(value: (/* cachedResponse */ CachedResponse, /* defaultValue */ Boolean) => Boolean): Self = StObject.set(x, "isExpired", js.Any.fromFunction2(value))
      
      inline def setIsExpiredUndefined: Self = StObject.set(x, "isExpired", js.undefined)
      
      inline def setIsMatch(
        value: (/* requestHeaders */ IncomingHttpHeaders, /* cachedResponse */ CachedResponse, /* defaultValue */ Boolean) => Boolean
      ): Self = StObject.set(x, "isMatch", js.Any.fromFunction3(value))
      
      inline def setIsMatchUndefined: Self = StObject.set(x, "isMatch", js.undefined)
      
      inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setQs(value: StringDictionary[Any]): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      inline def setRetry(
        value: Boolean | (js.Function3[
              /* err */ ErrnoException | Null, 
              /* res */ (^[ReadableStream | Buffer | String]) | Unit, 
              /* attemptNumber */ Double, 
              Boolean
            ])
      ): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryDelay(
        value: Double | (js.Function3[
              /* err */ ErrnoException | Null, 
              /* res */ (^[ReadableStream | Buffer | String]) | Unit, 
              /* attemptNumber */ Double, 
              Double
            ])
      ): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayFunction3(
        value: (/* err */ ErrnoException | Null, /* res */ (^[ReadableStream | Buffer | String]) | Unit, /* attemptNumber */ Double) => Double
      ): Self = StObject.set(x, "retryDelay", js.Any.fromFunction3(value))
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setRetryFunction3(
        value: (/* err */ ErrnoException | Null, /* res */ (^[ReadableStream | Buffer | String]) | Unit, /* attemptNumber */ Double) => Boolean
      ): Self = StObject.set(x, "retry", js.Any.fromFunction3(value))
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
