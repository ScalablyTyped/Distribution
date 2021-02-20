package typings.thenRequest

import org.scalablytyped.runtime.StringDictionary
import typings.httpBasic.cachedResponseMod.CachedResponse
import typings.httpBasic.icacheMod.ICache
import typings.httpResponseObject.mod.^
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.ReadableStream
import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingHttpHeaders
import typings.thenRequest.thenRequestStrings.file
import typings.thenRequest.thenRequestStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @js.native
  trait Options extends StObject {
    
    var agent: js.UndefOr[Boolean | Agent] = js.native
    
    var allowRedirectHeaders: js.UndefOr[js.Array[String]] = js.native
    
    var body: js.UndefOr[String | Buffer | ReadableStream] = js.native
    
    var cache: js.UndefOr[file | memory | ICache] = js.native
    
    var canCache: js.UndefOr[js.Function2[/* res */ ^[ReadableStream], /* defaultValue */ Boolean, Boolean]] = js.native
    
    var followRedirects: js.UndefOr[Boolean] = js.native
    
    var form: js.UndefOr[typings.formData.mod.^] = js.native
    
    var gzip: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.native
    
    var isExpired: js.UndefOr[
        js.Function2[/* cachedResponse */ CachedResponse, /* defaultValue */ Boolean, Boolean]
      ] = js.native
    
    var isMatch: js.UndefOr[
        js.Function3[
          /* requestHeaders */ IncomingHttpHeaders, 
          /* cachedResponse */ CachedResponse, 
          /* defaultValue */ Boolean, 
          Boolean
        ]
      ] = js.native
    
    var json: js.UndefOr[js.Any] = js.native
    
    var maxRedirects: js.UndefOr[Double] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var qs: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var retry: js.UndefOr[
        Boolean | (js.Function3[
          /* err */ ErrnoException | Null, 
          /* res */ (^[ReadableStream | Buffer | String]) | Unit, 
          /* attemptNumber */ Double, 
          Boolean
        ])
      ] = js.native
    
    var retryDelay: js.UndefOr[
        Double | (js.Function3[
          /* err */ ErrnoException | Null, 
          /* res */ (^[ReadableStream | Buffer | String]) | Unit, 
          /* attemptNumber */ Double, 
          Double
        ])
      ] = js.native
    
    var socketTimeout: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Boolean | Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAllowRedirectHeaders(value: js.Array[String]): Self = StObject.set(x, "allowRedirectHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRedirectHeadersUndefined: Self = StObject.set(x, "allowRedirectHeaders", js.undefined)
      
      @scala.inline
      def setAllowRedirectHeadersVarargs(value: String*): Self = StObject.set(x, "allowRedirectHeaders", js.Array(value :_*))
      
      @scala.inline
      def setBody(value: String | Buffer | ReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCache(value: file | memory | ICache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCanCache(value: (/* res */ ^[ReadableStream], /* defaultValue */ Boolean) => Boolean): Self = StObject.set(x, "canCache", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanCacheUndefined: Self = StObject.set(x, "canCache", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setForm(value: typings.formData.mod.^): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIsExpired(value: (/* cachedResponse */ CachedResponse, /* defaultValue */ Boolean) => Boolean): Self = StObject.set(x, "isExpired", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsExpiredUndefined: Self = StObject.set(x, "isExpired", js.undefined)
      
      @scala.inline
      def setIsMatch(
        value: (/* requestHeaders */ IncomingHttpHeaders, /* cachedResponse */ CachedResponse, /* defaultValue */ Boolean) => Boolean
      ): Self = StObject.set(x, "isMatch", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIsMatchUndefined: Self = StObject.set(x, "isMatch", js.undefined)
      
      @scala.inline
      def setJson(value: js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setQs(value: StringDictionary[js.Any]): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      @scala.inline
      def setRetry(
        value: Boolean | (js.Function3[
              /* err */ ErrnoException | Null, 
              /* res */ (^[ReadableStream | Buffer | String]) | Unit, 
              /* attemptNumber */ Double, 
              Boolean
            ])
      ): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelay(
        value: Double | (js.Function3[
              /* err */ ErrnoException | Null, 
              /* res */ (^[ReadableStream | Buffer | String]) | Unit, 
              /* attemptNumber */ Double, 
              Double
            ])
      ): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelayFunction3(
        value: (/* err */ ErrnoException | Null, /* res */ (^[ReadableStream | Buffer | String]) | Unit, /* attemptNumber */ Double) => Double
      ): Self = StObject.set(x, "retryDelay", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      @scala.inline
      def setRetryFunction3(
        value: (/* err */ ErrnoException | Null, /* res */ (^[ReadableStream | Buffer | String]) | Unit, /* attemptNumber */ Double) => Boolean
      ): Self = StObject.set(x, "retry", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
