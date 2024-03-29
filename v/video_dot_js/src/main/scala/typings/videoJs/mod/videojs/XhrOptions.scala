package typings.videoJs.mod.videojs

import typings.std.XMLHttpRequest
import typings.videoJs.videoJsStrings.DELETE
import typings.videoJs.videoJsStrings.GET
import typings.videoJs.videoJsStrings.HEAD
import typings.videoJs.videoJsStrings.OPTIONS
import typings.videoJs.videoJsStrings.POST
import typings.videoJs.videoJsStrings.PUT
import typings.videoJs.videoJsStrings._empty
import typings.videoJs.videoJsStrings.arraybuffer
import typings.videoJs.videoJsStrings.blob
import typings.videoJs.videoJsStrings.document
import typings.videoJs.videoJsStrings.json
import typings.videoJs.videoJsStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XhrOptions extends StObject {
  
  var beforeSend: js.UndefOr[js.Function1[/* xhrObject */ XMLHttpRequest, Unit]] = js.undefined
  
  var body: js.UndefOr[Any] = js.undefined
  
  var headers: js.UndefOr[Any] = js.undefined
  
  var json: js.UndefOr[Boolean] = js.undefined
  
  var method: js.UndefOr[DELETE | GET | HEAD | OPTIONS | POST | PUT] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var responseType: js.UndefOr[_empty | arraybuffer | blob | document | json | text] = js.undefined
  
  var sync: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var useXDR: js.UndefOr[Boolean] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  
  var xhr: js.UndefOr[XMLHttpRequest] = js.undefined
}
object XhrOptions {
  
  inline def apply(): XhrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XhrOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XhrOptions] (val x: Self) extends AnyVal {
    
    inline def setBeforeSend(value: /* xhrObject */ XMLHttpRequest => Unit): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
    
    inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setMethod(value: DELETE | GET | HEAD | OPTIONS | POST | PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setResponseType(value: _empty | arraybuffer | blob | document | json | text): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
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
