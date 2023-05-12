package typings.twilio

import org.scalablytyped.runtime.StringDictionary
import typings.twilio.libInterfacesMod.HttpMethod
import typings.twilio.twilioStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHttpRequestMod {
  
  @JSImport("twilio/lib/http/request", JSImport.Default)
  @js.native
  open class default[TData] ()
    extends StObject
       with Request[TData] {
    def this(opts: RequestOptions[TData]) = this()
  }
  
  type Headers = StringDictionary[String]
  
  @js.native
  trait Request[TData] extends StObject {
    
    def ANY: Asterisk = js.native
    
    def attributeEqual(lhs: Any, rhs: Any): Boolean = js.native
    
    var auth: String = js.native
    
    var data: TData | Asterisk = js.native
    
    var headers: Headers | Asterisk = js.native
    
    def isEqual(other: Request[Any]): Boolean = js.native
    
    var method: HttpMethod | Asterisk = js.native
    
    var params: js.Object | Asterisk = js.native
    
    var url: String = js.native
  }
  
  trait RequestOptions[TData] extends StObject {
    
    var auth: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[TData | Asterisk] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var method: js.UndefOr[HttpMethod | Asterisk] = js.undefined
    
    var params: js.UndefOr[js.Object | Asterisk] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object RequestOptions {
    
    inline def apply[TData](): RequestOptions[TData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions[TData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions[?], TData] (val x: Self & RequestOptions[TData]) extends AnyVal {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setData(value: TData | Asterisk): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: HttpMethod | Asterisk): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParams(value: js.Object | Asterisk): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
