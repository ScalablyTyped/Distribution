package typings.wordpressApiFetch

import typings.std.Record
import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type APIFetchMiddleware = js.Function2[
    /* options */ APIFetchOptions, 
    /* next */ js.Function1[/* nextOptions */ APIFetchOptions, js.Promise[Any]], 
    js.Promise[Any]
  ]
  
  trait APIFetchOptions
    extends StObject
       with RequestInit {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    @JSName("headers")
    var headers_APIFetchOptions: js.UndefOr[Record[String, String]] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
    
    /**
      * @default true
      */
    var parse: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object APIFetchOptions {
    
    inline def apply(): APIFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APIFetchOptions]
    }
    
    extension [Self <: APIFetchOptions](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setParse(value: Boolean): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
