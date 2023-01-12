package typings.xhr

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.XMLHttpRequest
import typings.xhr.xhrStrings.DELETE
import typings.xhr.xhrStrings.GET
import typings.xhr.xhrStrings.HEAD
import typings.xhr.xhrStrings.OPTIONS
import typings.xhr.xhrStrings.PATCH
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("xhr", JSImport.Default)
  @js.native
  val default: XhrStatic = js.native
  
  trait XhrBaseConfig extends StObject {
    
    var beforeSend: js.UndefOr[js.Function1[/* xhrObject */ XMLHttpRequest, Unit]] = js.undefined
    
    var body: js.UndefOr[String | Any] = js.undefined
    
    var headers: js.UndefOr[XhrHeaders] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[DELETE | GET | HEAD | OPTIONS | POST | PUT | PATCH] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var responseType: js.UndefOr[_empty | arraybuffer | blob | document | json | text] = js.undefined
    
    var sync: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var useXDR: js.UndefOr[Boolean] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
    
    var xhr: js.UndefOr[XMLHttpRequest] = js.undefined
  }
  object XhrBaseConfig {
    
    inline def apply(): XhrBaseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XhrBaseConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XhrBaseConfig] (val x: Self) extends AnyVal {
      
      inline def setBeforeSend(value: /* xhrObject */ XMLHttpRequest => Unit): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
      
      inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
      
      inline def setBody(value: String | Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: XhrHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setMethod(value: DELETE | GET | HEAD | OPTIONS | POST | PUT | PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setResponseType(value: _empty | arraybuffer | blob | document | json | text): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUseXDR(value: Boolean): Self = StObject.set(x, "useXDR", value.asInstanceOf[js.Any])
      
      inline def setUseXDRUndefined: Self = StObject.set(x, "useXDR", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
      
      inline def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  type XhrCallback = js.Function3[/* error */ js.Error, /* response */ XhrResponse, /* body */ Any, Unit]
  
  type XhrHeaders = StringDictionary[String]
  
  @js.native
  trait XhrInstance extends StObject {
    
    def apply(options: XhrUriConfig, callback: XhrCallback): Any = js.native
    def apply(options: XhrUrlConfig, callback: XhrCallback): Any = js.native
    def apply(url: String, callback: XhrCallback): Any = js.native
    def apply(url: String, options: XhrBaseConfig, callback: XhrCallback): Any = js.native
  }
  
  trait XhrResponse extends StObject {
    
    var body: js.Object | String
    
    var headers: XhrHeaders
    
    var method: String
    
    var rawRequest: XMLHttpRequest
    
    var statusCode: Double
    
    var url: String
  }
  object XhrResponse {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: XhrResponse] (val x: Self) extends AnyVal {
      
      inline def setBody(value: js.Object | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: XhrHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setRawRequest(value: XMLHttpRequest): Self = StObject.set(x, "rawRequest", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XhrStatic
    extends StObject
       with XhrInstance {
    
    def del(options: XhrUriConfig, callback: XhrCallback): Any = js.native
    def del(options: XhrUrlConfig, callback: XhrCallback): Any = js.native
    def del(url: String, callback: XhrCallback): Any = js.native
    def del(url: String, options: XhrBaseConfig, callback: XhrCallback): Any = js.native
    @JSName("del")
    var del_Original: XhrInstance = js.native
    
    def get(options: XhrUriConfig, callback: XhrCallback): Any = js.native
    def get(options: XhrUrlConfig, callback: XhrCallback): Any = js.native
    def get(url: String, callback: XhrCallback): Any = js.native
    def get(url: String, options: XhrBaseConfig, callback: XhrCallback): Any = js.native
    @JSName("get")
    var get_Original: XhrInstance = js.native
    
    def head(options: XhrUriConfig, callback: XhrCallback): Any = js.native
    def head(options: XhrUrlConfig, callback: XhrCallback): Any = js.native
    def head(url: String, callback: XhrCallback): Any = js.native
    def head(url: String, options: XhrBaseConfig, callback: XhrCallback): Any = js.native
    @JSName("head")
    var head_Original: XhrInstance = js.native
    
    def patch(options: XhrUriConfig, callback: XhrCallback): Any = js.native
    def patch(options: XhrUrlConfig, callback: XhrCallback): Any = js.native
    def patch(url: String, callback: XhrCallback): Any = js.native
    def patch(url: String, options: XhrBaseConfig, callback: XhrCallback): Any = js.native
    @JSName("patch")
    var patch_Original: XhrInstance = js.native
    
    def post(options: XhrUriConfig, callback: XhrCallback): Any = js.native
    def post(options: XhrUrlConfig, callback: XhrCallback): Any = js.native
    def post(url: String, callback: XhrCallback): Any = js.native
    def post(url: String, options: XhrBaseConfig, callback: XhrCallback): Any = js.native
    @JSName("post")
    var post_Original: XhrInstance = js.native
    
    def put(options: XhrUriConfig, callback: XhrCallback): Any = js.native
    def put(options: XhrUrlConfig, callback: XhrCallback): Any = js.native
    def put(url: String, callback: XhrCallback): Any = js.native
    def put(url: String, options: XhrBaseConfig, callback: XhrCallback): Any = js.native
    @JSName("put")
    var put_Original: XhrInstance = js.native
  }
  
  trait XhrUriConfig
    extends StObject
       with XhrBaseConfig {
    
    var uri: String
  }
  object XhrUriConfig {
    
    inline def apply(uri: String): XhrUriConfig = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[XhrUriConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XhrUriConfig] (val x: Self) extends AnyVal {
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait XhrUrlConfig
    extends StObject
       with XhrBaseConfig {
    
    var url: String
  }
  object XhrUrlConfig {
    
    inline def apply(url: String): XhrUrlConfig = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[XhrUrlConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XhrUrlConfig] (val x: Self) extends AnyVal {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = XhrStatic
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: XhrStatic = default
}
