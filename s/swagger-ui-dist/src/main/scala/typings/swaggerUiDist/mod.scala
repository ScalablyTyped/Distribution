package typings.swaggerUiDist

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.swaggerUiDist.swaggerUiDistStrings.full
import typings.swaggerUiDist.swaggerUiDistStrings.list
import typings.swaggerUiDist.swaggerUiDistStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait SwaggerUIBundle
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    def apply(): Any = js.native
    def apply(a: SwaggerConfigs): Any = js.native
    
    def getConfigs(): SwaggerConfigs = js.native
  }
  @JSImport("swagger-ui-dist", "SwaggerUIBundle")
  @js.native
  val SwaggerUIBundle: typings.swaggerUiDist.mod.SwaggerUIBundle = js.native
  
  @JSImport("swagger-ui-dist", "SwaggerUIStandalonePreset")
  @js.native
  val SwaggerUIStandalonePreset: Any = js.native
  
  @JSImport("swagger-ui-dist", "absolutePath")
  @js.native
  val absolutePath: js.Function0[String] = js.native
  
  @JSImport("swagger-ui-dist", "getAbsoluteFSPath")
  @js.native
  val getAbsoluteFSPath: js.Function0[String] = js.native
  
  type Spec = StringDictionary[Any]
  
  trait SwaggerConfigs
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    /**
      * URL to fetch external configuration document from.
      */
    var configUrl: js.UndefOr[String] = js.undefined
    
    /**
      * If set to true, enables deep linking for tags and operations. See the Deep Linking documentation for more information.
      */
    var deepLinking: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls the default expansion setting for the operations and tags. It can be 'list' (expands only the tags), 'full' (expands the tags and operations) or 'none' (expands nothing).
      */
    var docExpansion: js.UndefOr[list | full | none] = js.undefined
    
    /**
      *  REQUIRED if dom_id is not provided. The HTML DOM element inside which SwaggerUI will put its user interface. Overrides dom_id.
      */
    var domNode: js.UndefOr[String | HTMLElement | Null] = js.undefined
    
    /**
      * REQUIRED if domNode is not provided. The ID of a DOM element inside which SwaggerUI will put its user interface.
      */
    var dom_id: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The name of a component available via the plugin system to use as the top-level layout for Swagger UI.
      */
    var layout: js.UndefOr[String] = js.undefined
    
    /**
      * If set, limits the number of tagged operations displayed to at most this many. The default is to show all operations.
      */
    var maxDisplayedTags: js.UndefOr[Double] = js.undefined
    
    /**
      * Apply a sort to the operation list of each API.
      * It can be 'alpha' (sort by paths alphanumerically), 'method' (sort by HTTP method) or a function (see Array.prototype.sort() to know how sort function works).
      * Default is the order returned by the server unchanged.
      */
    var operationsSorter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * An array of plugin functions to use in Swagger UI.
      */
    var plugins: js.UndefOr[Any] = js.undefined
    
    /**
      * An array of presets to use in Swagger UI. Usually, you'll want to include ApisPreset if you use this option.
      */
    var presets: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      *  Function to intercept remote definition, "Try it out", and OAuth 2.0 requests.
      *  Accepts one argument requestInterceptor(request) and must return the modified request, or a Promise that resolves to the modified request.
      */
    var requestInterceptor: js.UndefOr[js.Function1[/* request */ SwaggerRequest, SwaggerRequest]] = js.undefined
    
    /**
      *  Function to intercept remote definition, "Try it out", and OAuth 2.0 responses.
      *  Accepts one argument responseInterceptor(response) and must return the modified response, or a Promise that resolves to the modified response.
      */
    var responseInterceptor: js.UndefOr[js.Function1[/* response */ SwaggerResponse, SwaggerResponse]] = js.undefined
    
    /**
      * A JavaScript object describing the OpenAPI definition. When used, the url parameter will not be parsed. This is useful for testing manually-generated definitions without hosting them.
      */
    var spec: js.UndefOr[Spec] = js.undefined
    
    /**
      * The URL pointing to API definition (normally swagger.json or swagger.yaml). Will be ignored if urls or spec is used.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * An array of API definition objects ([{url: "<url1>", name: "<name1>"},{url: "<url2>", name: "<name2>"}]) used by Topbar plugin. When used and Topbar plugin is enabled,
      * the url parameter will not be parsed. Names and URLs must be unique among all items in this array,
      * since they're used as identifiers.
      */
    var urls: js.UndefOr[js.Array[Url]] = js.undefined
  }
  object SwaggerConfigs {
    
    inline def apply(): SwaggerConfigs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerConfigs]
    }
    
    extension [Self <: SwaggerConfigs](x: Self) {
      
      inline def setConfigUrl(value: String): Self = StObject.set(x, "configUrl", value.asInstanceOf[js.Any])
      
      inline def setConfigUrlUndefined: Self = StObject.set(x, "configUrl", js.undefined)
      
      inline def setDeepLinking(value: Boolean): Self = StObject.set(x, "deepLinking", value.asInstanceOf[js.Any])
      
      inline def setDeepLinkingUndefined: Self = StObject.set(x, "deepLinking", js.undefined)
      
      inline def setDocExpansion(value: list | full | none): Self = StObject.set(x, "docExpansion", value.asInstanceOf[js.Any])
      
      inline def setDocExpansionUndefined: Self = StObject.set(x, "docExpansion", js.undefined)
      
      inline def setDomNode(value: String | HTMLElement): Self = StObject.set(x, "domNode", value.asInstanceOf[js.Any])
      
      inline def setDomNodeNull: Self = StObject.set(x, "domNode", null)
      
      inline def setDomNodeUndefined: Self = StObject.set(x, "domNode", js.undefined)
      
      inline def setDom_id(value: String): Self = StObject.set(x, "dom_id", value.asInstanceOf[js.Any])
      
      inline def setDom_idNull: Self = StObject.set(x, "dom_id", null)
      
      inline def setDom_idUndefined: Self = StObject.set(x, "dom_id", js.undefined)
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMaxDisplayedTags(value: Double): Self = StObject.set(x, "maxDisplayedTags", value.asInstanceOf[js.Any])
      
      inline def setMaxDisplayedTagsUndefined: Self = StObject.set(x, "maxDisplayedTags", js.undefined)
      
      inline def setOperationsSorter(value: () => Unit): Self = StObject.set(x, "operationsSorter", js.Any.fromFunction0(value))
      
      inline def setOperationsSorterUndefined: Self = StObject.set(x, "operationsSorter", js.undefined)
      
      inline def setPlugins(value: Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPresets(value: js.Array[Any]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      inline def setPresetsVarargs(value: Any*): Self = StObject.set(x, "presets", js.Array(value*))
      
      inline def setRequestInterceptor(value: /* request */ SwaggerRequest => SwaggerRequest): Self = StObject.set(x, "requestInterceptor", js.Any.fromFunction1(value))
      
      inline def setRequestInterceptorUndefined: Self = StObject.set(x, "requestInterceptor", js.undefined)
      
      inline def setResponseInterceptor(value: /* response */ SwaggerResponse => SwaggerResponse): Self = StObject.set(x, "responseInterceptor", js.Any.fromFunction1(value))
      
      inline def setResponseInterceptorUndefined: Self = StObject.set(x, "responseInterceptor", js.undefined)
      
      inline def setSpec(value: Spec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrls(value: js.Array[Url]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      inline def setUrlsVarargs(value: Url*): Self = StObject.set(x, "urls", js.Array(value*))
    }
  }
  
  trait SwaggerRequest
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    var credentials: String
    
    var url: String
  }
  object SwaggerRequest {
    
    inline def apply(credentials: String, url: String): SwaggerRequest = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwaggerRequest]
    }
    
    extension [Self <: SwaggerRequest](x: Self) {
      
      inline def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type SwaggerResponse = StringDictionary[Any]
  
  trait Url extends StObject {
    
    var name: String
    
    var url: String
  }
  object Url {
    
    inline def apply(name: String, url: String): Url = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
