package typings.thenRequest.optionsMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAgent(value: Boolean | Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setAllowRedirectHeadersVarargs(value: String*): Self = this.set("allowRedirectHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowRedirectHeaders(value: js.Array[String]): Self = this.set("allowRedirectHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRedirectHeaders: Self = this.set("allowRedirectHeaders", js.undefined)
    
    @scala.inline
    def setBody(value: String | Buffer | ReadableStream): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCache(value: file | memory | ICache): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCanCache(value: (/* res */ ^[ReadableStream], /* defaultValue */ Boolean) => Boolean): Self = this.set("canCache", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCanCache: Self = this.set("canCache", js.undefined)
    
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = this.set("followRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowRedirects: Self = this.set("followRedirects", js.undefined)
    
    @scala.inline
    def setForm(value: typings.formData.mod.^): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setGzip(value: Boolean): Self = this.set("gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    
    @scala.inline
    def setHeaders(value: IncomingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIsExpired(value: (/* cachedResponse */ CachedResponse, /* defaultValue */ Boolean) => Boolean): Self = this.set("isExpired", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsExpired: Self = this.set("isExpired", js.undefined)
    
    @scala.inline
    def setIsMatch(
      value: (/* requestHeaders */ IncomingHttpHeaders, /* cachedResponse */ CachedResponse, /* defaultValue */ Boolean) => Boolean
    ): Self = this.set("isMatch", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteIsMatch: Self = this.set("isMatch", js.undefined)
    
    @scala.inline
    def setJson(value: js.Any): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setQs(value: StringDictionary[js.Any]): Self = this.set("qs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQs: Self = this.set("qs", js.undefined)
    
    @scala.inline
    def setRetryFunction3(
      value: (/* err */ ErrnoException | Null, /* res */ (^[ReadableStream | Buffer | String]) | Unit, /* attemptNumber */ Double) => Boolean
    ): Self = this.set("retry", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRetry(
      value: Boolean | (js.Function3[
          /* err */ ErrnoException | Null, 
          /* res */ (^[ReadableStream | Buffer | String]) | Unit, 
          /* attemptNumber */ Double, 
          Boolean
        ])
    ): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    
    @scala.inline
    def setRetryDelayFunction3(
      value: (/* err */ ErrnoException | Null, /* res */ (^[ReadableStream | Buffer | String]) | Unit, /* attemptNumber */ Double) => Double
    ): Self = this.set("retryDelay", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRetryDelay(
      value: Double | (js.Function3[
          /* err */ ErrnoException | Null, 
          /* res */ (^[ReadableStream | Buffer | String]) | Unit, 
          /* attemptNumber */ Double, 
          Double
        ])
    ): Self = this.set("retryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDelay: Self = this.set("retryDelay", js.undefined)
    
    @scala.inline
    def setSocketTimeout(value: Double): Self = this.set("socketTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketTimeout: Self = this.set("socketTimeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
