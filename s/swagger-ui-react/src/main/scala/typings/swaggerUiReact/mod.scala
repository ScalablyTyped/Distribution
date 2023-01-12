package typings.swaggerUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.PureComponent
import typings.swaggerUiReact.swaggerUiReactStrings.example
import typings.swaggerUiReact.swaggerUiReactStrings.full
import typings.swaggerUiReact.swaggerUiReactStrings.list
import typings.swaggerUiReact.swaggerUiReactStrings.model
import typings.swaggerUiReact.swaggerUiReactStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-ui-react", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SwaggerUIProps, js.Object, Any]
  
  type Plugin = js.Object | PluginGenerator
  
  type PluginGenerator = js.Function1[/* system */ System, js.Object]
  
  type Preset = js.Function0[Any]
  
  type Request = StringDictionary[Any]
  
  type Response = StringDictionary[Any]
  
  type SwaggerUI = PureComponent[SwaggerUIProps, js.Object, Any]
  
  trait SwaggerUIProps extends StObject {
    
    var deepLinking: js.UndefOr[Boolean] = js.undefined
    
    var defaultModelExpandDepth: js.UndefOr[Double] = js.undefined
    
    var defaultModelRendering: js.UndefOr[example | model] = js.undefined
    
    var defaultModelsExpandDepth: js.UndefOr[Double] = js.undefined
    
    var displayOperationId: js.UndefOr[Boolean] = js.undefined
    
    var displayRequestDuration: js.UndefOr[Boolean] = js.undefined
    
    var docExpansion: js.UndefOr[list | full | none] = js.undefined
    
    var filter: js.UndefOr[String | Boolean] = js.undefined
    
    var layout: js.UndefOr[String] = js.undefined
    
    var onComplete: js.UndefOr[js.Function1[/* system */ System, Unit]] = js.undefined
    
    var persistAuthorization: js.UndefOr[Boolean] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
    
    var presets: js.UndefOr[js.Array[Preset]] = js.undefined
    
    var queryConfigEnabled: js.UndefOr[Boolean] = js.undefined
    
    var requestInterceptor: js.UndefOr[js.Function1[/* req */ Request, Request | js.Promise[Request]]] = js.undefined
    
    var requestSnippets: js.UndefOr[js.Object] = js.undefined
    
    var requestSnippetsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var responseInterceptor: js.UndefOr[js.Function1[/* res */ Response, Response | js.Promise[Response]]] = js.undefined
    
    var showExtensions: js.UndefOr[Boolean] = js.undefined
    
    var showMutatedRequest: js.UndefOr[Boolean] = js.undefined
    
    var spec: js.UndefOr[js.Object | String] = js.undefined
    
    var supportedSubmitMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    var tryItOutEnabled: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object SwaggerUIProps {
    
    inline def apply(): SwaggerUIProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerUIProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwaggerUIProps] (val x: Self) extends AnyVal {
      
      inline def setDeepLinking(value: Boolean): Self = StObject.set(x, "deepLinking", value.asInstanceOf[js.Any])
      
      inline def setDeepLinkingUndefined: Self = StObject.set(x, "deepLinking", js.undefined)
      
      inline def setDefaultModelExpandDepth(value: Double): Self = StObject.set(x, "defaultModelExpandDepth", value.asInstanceOf[js.Any])
      
      inline def setDefaultModelExpandDepthUndefined: Self = StObject.set(x, "defaultModelExpandDepth", js.undefined)
      
      inline def setDefaultModelRendering(value: example | model): Self = StObject.set(x, "defaultModelRendering", value.asInstanceOf[js.Any])
      
      inline def setDefaultModelRenderingUndefined: Self = StObject.set(x, "defaultModelRendering", js.undefined)
      
      inline def setDefaultModelsExpandDepth(value: Double): Self = StObject.set(x, "defaultModelsExpandDepth", value.asInstanceOf[js.Any])
      
      inline def setDefaultModelsExpandDepthUndefined: Self = StObject.set(x, "defaultModelsExpandDepth", js.undefined)
      
      inline def setDisplayOperationId(value: Boolean): Self = StObject.set(x, "displayOperationId", value.asInstanceOf[js.Any])
      
      inline def setDisplayOperationIdUndefined: Self = StObject.set(x, "displayOperationId", js.undefined)
      
      inline def setDisplayRequestDuration(value: Boolean): Self = StObject.set(x, "displayRequestDuration", value.asInstanceOf[js.Any])
      
      inline def setDisplayRequestDurationUndefined: Self = StObject.set(x, "displayRequestDuration", js.undefined)
      
      inline def setDocExpansion(value: list | full | none): Self = StObject.set(x, "docExpansion", value.asInstanceOf[js.Any])
      
      inline def setDocExpansionUndefined: Self = StObject.set(x, "docExpansion", js.undefined)
      
      inline def setFilter(value: String | Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setOnComplete(value: /* system */ System => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setPersistAuthorization(value: Boolean): Self = StObject.set(x, "persistAuthorization", value.asInstanceOf[js.Any])
      
      inline def setPersistAuthorizationUndefined: Self = StObject.set(x, "persistAuthorization", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPresets(value: js.Array[Preset]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      inline def setPresetsVarargs(value: Preset*): Self = StObject.set(x, "presets", js.Array(value*))
      
      inline def setQueryConfigEnabled(value: Boolean): Self = StObject.set(x, "queryConfigEnabled", value.asInstanceOf[js.Any])
      
      inline def setQueryConfigEnabledUndefined: Self = StObject.set(x, "queryConfigEnabled", js.undefined)
      
      inline def setRequestInterceptor(value: /* req */ Request => Request | js.Promise[Request]): Self = StObject.set(x, "requestInterceptor", js.Any.fromFunction1(value))
      
      inline def setRequestInterceptorUndefined: Self = StObject.set(x, "requestInterceptor", js.undefined)
      
      inline def setRequestSnippets(value: js.Object): Self = StObject.set(x, "requestSnippets", value.asInstanceOf[js.Any])
      
      inline def setRequestSnippetsEnabled(value: Boolean): Self = StObject.set(x, "requestSnippetsEnabled", value.asInstanceOf[js.Any])
      
      inline def setRequestSnippetsEnabledUndefined: Self = StObject.set(x, "requestSnippetsEnabled", js.undefined)
      
      inline def setRequestSnippetsUndefined: Self = StObject.set(x, "requestSnippets", js.undefined)
      
      inline def setResponseInterceptor(value: /* res */ Response => Response | js.Promise[Response]): Self = StObject.set(x, "responseInterceptor", js.Any.fromFunction1(value))
      
      inline def setResponseInterceptorUndefined: Self = StObject.set(x, "responseInterceptor", js.undefined)
      
      inline def setShowExtensions(value: Boolean): Self = StObject.set(x, "showExtensions", value.asInstanceOf[js.Any])
      
      inline def setShowExtensionsUndefined: Self = StObject.set(x, "showExtensions", js.undefined)
      
      inline def setShowMutatedRequest(value: Boolean): Self = StObject.set(x, "showMutatedRequest", value.asInstanceOf[js.Any])
      
      inline def setShowMutatedRequestUndefined: Self = StObject.set(x, "showMutatedRequest", js.undefined)
      
      inline def setSpec(value: js.Object | String): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      inline def setSupportedSubmitMethods(value: js.Array[String]): Self = StObject.set(x, "supportedSubmitMethods", value.asInstanceOf[js.Any])
      
      inline def setSupportedSubmitMethodsUndefined: Self = StObject.set(x, "supportedSubmitMethods", js.undefined)
      
      inline def setSupportedSubmitMethodsVarargs(value: String*): Self = StObject.set(x, "supportedSubmitMethods", js.Array(value*))
      
      inline def setTryItOutEnabled(value: Boolean): Self = StObject.set(x, "tryItOutEnabled", value.asInstanceOf[js.Any])
      
      inline def setTryItOutEnabledUndefined: Self = StObject.set(x, "tryItOutEnabled", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  type System = Any
}
