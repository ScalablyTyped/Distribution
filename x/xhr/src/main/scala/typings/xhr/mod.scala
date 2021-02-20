package typings.xhr

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.XMLHttpRequest
import typings.xhr.xhrStrings.DELETE
import typings.xhr.xhrStrings.GET
import typings.xhr.xhrStrings.HEAD
import typings.xhr.xhrStrings.OPTIONS
import typings.xhr.xhrStrings.POST
import typings.xhr.xhrStrings.PUT
import typings.xhr.xhrStrings._empty
import typings.xhr.xhrStrings.arraybuffer
import typings.xhr.xhrStrings.blob
import typings.xhr.xhrStrings.document
import typings.xhr.xhrStrings.json
import typings.xhr.xhrStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("xhr", JSImport.Default)
  @js.native
  val default: XhrStatic = js.native
  
  @js.native
  trait XhrBaseConfig extends StObject {
    
    var beforeSend: js.UndefOr[js.Function1[/* xhrObject */ XMLHttpRequest, Unit]] = js.native
    
    var body: js.UndefOr[String | js.Any] = js.native
    
    var headers: js.UndefOr[XhrHeaders] = js.native
    
    var json: js.UndefOr[Boolean] = js.native
    
    var method: js.UndefOr[DELETE | GET | HEAD | OPTIONS | POST | PUT] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var responseType: js.UndefOr[_empty | arraybuffer | blob | document | json | text] = js.native
    
    var sync: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var useXDR: js.UndefOr[Boolean] = js.native
    
    var username: js.UndefOr[String] = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
    
    var xhr: js.UndefOr[XMLHttpRequest] = js.native
  }
  object XhrBaseConfig {
    
    @scala.inline
    def apply(): XhrBaseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XhrBaseConfig]
    }
    
    @scala.inline
    implicit class XhrBaseConfigMutableBuilder[Self <: XhrBaseConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforeSend(value: /* xhrObject */ XMLHttpRequest => Unit): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
      
      @scala.inline
      def setBody(value: String | js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: XhrHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setMethod(value: DELETE | GET | HEAD | OPTIONS | POST | PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setResponseType(value: _empty | arraybuffer | blob | document | json | text): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUseXDR(value: Boolean): Self = StObject.set(x, "useXDR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseXDRUndefined: Self = StObject.set(x, "useXDR", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
      
      @scala.inline
      def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  type XhrCallback = js.Function3[/* error */ Error, /* response */ XhrResponse, /* body */ js.Any, Unit]
  
  type XhrHeaders = StringDictionary[String]
  
  @js.native
  trait XhrInstance extends StObject {
    
    def apply(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
    def apply(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
    def apply(url: String, callback: XhrCallback): js.Any = js.native
    def apply(url: String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
  }
  
  @js.native
  trait XhrResponse extends StObject {
    
    var body: js.Object | String = js.native
    
    var headers: XhrHeaders = js.native
    
    var method: String = js.native
    
    var rawRequest: XMLHttpRequest = js.native
    
    var statusCode: Double = js.native
    
    var url: String = js.native
  }
  object XhrResponse {
    
    @scala.inline
    def apply(
      body: js.Object | String,
      headers: XhrHeaders,
      method: String,
      rawRequest: XMLHttpRequest,
      statusCode: Double,
      url: String
    ): XhrResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], rawRequest = rawRequest.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[XhrResponse]
    }
    
    @scala.inline
    implicit class XhrResponseMutableBuilder[Self <: XhrResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Object | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: XhrHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawRequest(value: XMLHttpRequest): Self = StObject.set(x, "rawRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XhrStatic extends XhrInstance {
    
    def del(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
    def del(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
    def del(url: String, callback: XhrCallback): js.Any = js.native
    def del(url: String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
    @JSName("del")
    var del_Original: XhrInstance = js.native
    
    def get(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
    def get(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
    def get(url: String, callback: XhrCallback): js.Any = js.native
    def get(url: String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
    @JSName("get")
    var get_Original: XhrInstance = js.native
    
    def head(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
    def head(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
    def head(url: String, callback: XhrCallback): js.Any = js.native
    def head(url: String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
    @JSName("head")
    var head_Original: XhrInstance = js.native
    
    def patch(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
    def patch(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
    def patch(url: String, callback: XhrCallback): js.Any = js.native
    def patch(url: String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
    @JSName("patch")
    var patch_Original: XhrInstance = js.native
    
    def post(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
    def post(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
    def post(url: String, callback: XhrCallback): js.Any = js.native
    def post(url: String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
    @JSName("post")
    var post_Original: XhrInstance = js.native
    
    def put(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
    def put(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
    def put(url: String, callback: XhrCallback): js.Any = js.native
    def put(url: String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
    @JSName("put")
    var put_Original: XhrInstance = js.native
  }
  
  @js.native
  trait XhrUriConfig extends XhrBaseConfig {
    
    var uri: String = js.native
  }
  object XhrUriConfig {
    
    @scala.inline
    def apply(uri: String): XhrUriConfig = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[XhrUriConfig]
    }
    
    @scala.inline
    implicit class XhrUriConfigMutableBuilder[Self <: XhrUriConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XhrUrlConfig extends XhrBaseConfig {
    
    var url: String = js.native
  }
  object XhrUrlConfig {
    
    @scala.inline
    def apply(url: String): XhrUrlConfig = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[XhrUrlConfig]
    }
    
    @scala.inline
    implicit class XhrUrlConfigMutableBuilder[Self <: XhrUrlConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = XhrStatic
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: XhrStatic = default
}
