package typings.twilio

import typings.twilio.libInterfacesMod.HttpMethod
import typings.twilio.twilioStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHttpRequestMod {
  
  @JSImport("twilio/lib/http/request", JSImport.Namespace)
  @js.native
  open class ^[TData] protected ()
    extends StObject
       with Request[TData] {
    def this(opts: RequestOptions[TData]) = this()
    
    /* CompleteClass */
    override def attributeEqual(lhs: Any, rhs: Any): Boolean = js.native
    
    /* CompleteClass */
    override def isEqual(other: Request[Any]): Boolean = js.native
  }
  
  trait Request[TData] extends StObject {
    
    def attributeEqual(lhs: Any, rhs: Any): Boolean
    
    def isEqual(other: Request[Any]): Boolean
  }
  object Request {
    
    inline def apply[TData](attributeEqual: (Any, Any) => Boolean, isEqual: Request[Any] => Boolean): Request[TData] = {
      val __obj = js.Dynamic.literal(attributeEqual = js.Any.fromFunction2(attributeEqual), isEqual = js.Any.fromFunction1(isEqual))
      __obj.asInstanceOf[Request[TData]]
    }
    
    extension [Self <: Request[?], TData](x: Self & Request[TData]) {
      
      inline def setAttributeEqual(value: (Any, Any) => Boolean): Self = StObject.set(x, "attributeEqual", js.Any.fromFunction2(value))
      
      inline def setIsEqual(value: Request[Any] => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    }
  }
  
  trait RequestOptions[TData] extends StObject {
    
    var auth: js.UndefOr[String] = js.undefined
    
    var ca: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[TData | Asterisk] = js.undefined
    
    var headers: js.UndefOr[js.Object | Asterisk] = js.undefined
    
    var method: js.UndefOr[HttpMethod | Asterisk] = js.undefined
    
    var params: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object RequestOptions {
    
    inline def apply[TData](): RequestOptions[TData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions[TData]]
    }
    
    extension [Self <: RequestOptions[?], TData](x: Self & RequestOptions[TData]) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setData(value: TData | Asterisk): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: js.Object | Asterisk): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: HttpMethod | Asterisk): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
