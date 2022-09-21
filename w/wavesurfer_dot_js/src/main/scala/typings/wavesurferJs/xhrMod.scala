package typings.wavesurferJs

import typings.wavesurferJs.wavesurferJsStrings.arraybuffer
import typings.wavesurferJs.wavesurferJsStrings.blob
import typings.wavesurferJs.wavesurferJsStrings.json
import typings.wavesurferJs.wavesurferJsStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xhrMod {
  
  trait XHROptions extends StObject {
    
    var cache: js.UndefOr[String] = js.undefined
    
    var credentials: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var redirect: js.UndefOr[String] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var requestHeaders: js.UndefOr[js.Array[XHRRequestHeader]] = js.undefined
    
    var responseType: js.UndefOr[arraybuffer | blob | json | text] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object XHROptions {
    
    inline def apply(): XHROptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XHROptions]
    }
    
    extension [Self <: XHROptions](x: Self) {
      
      inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setRequestHeaders(value: js.Array[XHRRequestHeader]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      inline def setRequestHeadersVarargs(value: XHRRequestHeader*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
      
      inline def setResponseType(value: arraybuffer | blob | json | text): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  trait XHRRequestHeader extends StObject {
    
    var key: String
    
    var value: String
  }
  object XHRRequestHeader {
    
    inline def apply(key: String, value: String): XHRRequestHeader = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[XHRRequestHeader]
    }
    
    extension [Self <: XHRRequestHeader](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
