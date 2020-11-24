package typings.syncRequest.optionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.syncRequest.syncRequestStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<then-request.then-request.Options, 'allowRedirectHeaders' | 'followRedirects' | 'gzip' | 'headers' | 'maxRedirects' | 'maxRetries' | 'qs' | 'json'> */
@js.native
trait BaseOptions extends js.Object {
  
  var agent: js.UndefOr[Boolean] = js.native
  
  var allowRedirectHeaders: js.UndefOr[js.Array[String]] = js.native
  
  var body: js.UndefOr[String | Buffer] = js.native
  
  var cache: js.UndefOr[file] = js.native
  
  var followRedirects: js.UndefOr[Boolean] = js.native
  
  var gzip: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[IncomingHttpHeaders] = js.native
  
  var json: js.UndefOr[js.Any] = js.native
  
  var maxRedirects: js.UndefOr[Double] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
  
  var qs: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var retry: js.UndefOr[Boolean] = js.native
  
  var retryDelay: js.UndefOr[Double] = js.native
  
  var socketTimeout: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object BaseOptions {
  
  @scala.inline
  def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
    
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
    def setAgent(value: Boolean): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setAllowRedirectHeadersVarargs(value: String*): Self = this.set("allowRedirectHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowRedirectHeaders(value: js.Array[String]): Self = this.set("allowRedirectHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRedirectHeaders: Self = this.set("allowRedirectHeaders", js.undefined)
    
    @scala.inline
    def setBody(value: String | Buffer): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCache(value: file): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = this.set("followRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowRedirects: Self = this.set("followRedirects", js.undefined)
    
    @scala.inline
    def setGzip(value: Boolean): Self = this.set("gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    
    @scala.inline
    def setHeaders(value: IncomingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
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
    def setRetry(value: Boolean): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    
    @scala.inline
    def setRetryDelay(value: Double): Self = this.set("retryDelay", value.asInstanceOf[js.Any])
    
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
