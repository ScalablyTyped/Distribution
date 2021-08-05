package typings.swaggerUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.PureComponent
import typings.swaggerUiReact.swaggerUiReactStrings.full
import typings.swaggerUiReact.swaggerUiReactStrings.list
import typings.swaggerUiReact.swaggerUiReactStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-ui-react", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SwaggerUIProps, js.Object, js.Any]
  
  type Plugin = js.Object | PluginGenerator
  
  type PluginGenerator = js.Function1[/* system */ System, js.Object]
  
  type Request = StringDictionary[js.Any]
  
  type Response = StringDictionary[js.Any]
  
  type SwaggerUI = PureComponent[SwaggerUIProps, js.Object, js.Any]
  
  trait SwaggerUIProps extends StObject {
    
    var deepLinking: js.UndefOr[Boolean] = js.undefined
    
    var defaultModelExpandDepth: js.UndefOr[Double] = js.undefined
    
    var docExpansion: js.UndefOr[list | full | none] = js.undefined
    
    var onComplete: js.UndefOr[js.Function1[/* system */ System, Unit]] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
    
    var requestInterceptor: js.UndefOr[js.Function1[/* req */ Request, Request | js.Promise[Request]]] = js.undefined
    
    var responseInterceptor: js.UndefOr[js.Function1[/* res */ Response, Response | js.Promise[Response]]] = js.undefined
    
    var spec: js.UndefOr[js.Object | String] = js.undefined
    
    var supportedSubmitMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object SwaggerUIProps {
    
    inline def apply(): SwaggerUIProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerUIProps]
    }
    
    extension [Self <: SwaggerUIProps](x: Self) {
      
      inline def setDeepLinking(value: Boolean): Self = StObject.set(x, "deepLinking", value.asInstanceOf[js.Any])
      
      inline def setDeepLinkingUndefined: Self = StObject.set(x, "deepLinking", js.undefined)
      
      inline def setDefaultModelExpandDepth(value: Double): Self = StObject.set(x, "defaultModelExpandDepth", value.asInstanceOf[js.Any])
      
      inline def setDefaultModelExpandDepthUndefined: Self = StObject.set(x, "defaultModelExpandDepth", js.undefined)
      
      inline def setDocExpansion(value: list | full | none): Self = StObject.set(x, "docExpansion", value.asInstanceOf[js.Any])
      
      inline def setDocExpansionUndefined: Self = StObject.set(x, "docExpansion", js.undefined)
      
      inline def setOnComplete(value: /* system */ System => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setRequestInterceptor(value: /* req */ Request => Request | js.Promise[Request]): Self = StObject.set(x, "requestInterceptor", js.Any.fromFunction1(value))
      
      inline def setRequestInterceptorUndefined: Self = StObject.set(x, "requestInterceptor", js.undefined)
      
      inline def setResponseInterceptor(value: /* res */ Response => Response | js.Promise[Response]): Self = StObject.set(x, "responseInterceptor", js.Any.fromFunction1(value))
      
      inline def setResponseInterceptorUndefined: Self = StObject.set(x, "responseInterceptor", js.undefined)
      
      inline def setSpec(value: js.Object | String): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      inline def setSupportedSubmitMethods(value: js.Array[String]): Self = StObject.set(x, "supportedSubmitMethods", value.asInstanceOf[js.Any])
      
      inline def setSupportedSubmitMethodsUndefined: Self = StObject.set(x, "supportedSubmitMethods", js.undefined)
      
      inline def setSupportedSubmitMethodsVarargs(value: String*): Self = StObject.set(x, "supportedSubmitMethods", js.Array(value :_*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type System = js.Any
}
