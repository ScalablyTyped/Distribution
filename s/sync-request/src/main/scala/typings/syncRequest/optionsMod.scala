package typings.syncRequest

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.syncRequest.formDataMod.FormData
import typings.syncRequest.formDataMod.FormDataEntry
import typings.syncRequest.syncRequestStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  /* Inlined parent std.Pick<then-request.then-request.Options, 'allowRedirectHeaders' | 'followRedirects' | 'gzip' | 'headers' | 'maxRedirects' | 'maxRetries' | 'qs' | 'json'> */
  trait BaseOptions extends StObject {
    
    var agent: js.UndefOr[Boolean] = js.undefined
    
    var allowRedirectHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    var body: js.UndefOr[String | Buffer] = js.undefined
    
    var cache: js.UndefOr[file] = js.undefined
    
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    var json: js.UndefOr[js.Any] = js.undefined
    
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var qs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var retry: js.UndefOr[Boolean] = js.undefined
    
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    var socketTimeout: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object BaseOptions {
    
    @scala.inline
    def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAllowRedirectHeaders(value: js.Array[String]): Self = StObject.set(x, "allowRedirectHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRedirectHeadersUndefined: Self = StObject.set(x, "allowRedirectHeaders", js.undefined)
      
      @scala.inline
      def setAllowRedirectHeadersVarargs(value: String*): Self = StObject.set(x, "allowRedirectHeaders", js.Array(value :_*))
      
      @scala.inline
      def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCache(value: file): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
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
      def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
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
  
  trait MessageOptions
    extends StObject
       with BaseOptions {
    
    var form: js.UndefOr[js.Array[FormDataEntry]] = js.undefined
  }
  object MessageOptions {
    
    @scala.inline
    def apply(): MessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageOptions]
    }
    
    @scala.inline
    implicit class MessageOptionsMutableBuilder[Self <: MessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForm(value: js.Array[FormDataEntry]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setFormVarargs(value: FormDataEntry*): Self = StObject.set(x, "form", js.Array(value :_*))
    }
  }
  
  trait Options
    extends StObject
       with BaseOptions {
    
    var form: js.UndefOr[FormData] = js.undefined
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
      def setForm(value: FormData): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    }
  }
}
