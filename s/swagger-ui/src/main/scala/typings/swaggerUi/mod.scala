package typings.swaggerUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.swaggerUi.anon.Activate
import typings.swaggerUi.anon.AfterLoad
import typings.swaggerUi.anon.DefaultExpanded
import typings.swaggerUi.anon.Name
import typings.swaggerUi.swaggerUiBooleans.`false`
import typings.swaggerUi.swaggerUiStrings.example
import typings.swaggerUi.swaggerUiStrings.full
import typings.swaggerUi.swaggerUiStrings.list
import typings.swaggerUi.swaggerUiStrings.model
import typings.swaggerUi.swaggerUiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: SwaggerUIOptions): SwaggerUI = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[SwaggerUI]
  
  @JSImport("swagger-ui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Indexable = StringDictionary[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.swaggerUi.swaggerUiStrings.legacy
    - typings.swaggerUi.swaggerUiStrings.chain
  */
  trait PluginLoadType extends StObject
  object PluginLoadType {
    
    inline def chain: typings.swaggerUi.swaggerUiStrings.chain = "chain".asInstanceOf[typings.swaggerUi.swaggerUiStrings.chain]
    
    inline def legacy: typings.swaggerUi.swaggerUiStrings.legacy = "legacy".asInstanceOf[typings.swaggerUi.swaggerUiStrings.legacy]
  }
  
  trait PluginsOptions extends StObject {
    
    /**
      * Control behavior of plugins when targeting the same component with wrapComponent.<br/>
      * - `legacy` (default) : last plugin takes precedence over the others<br/>
      * - `chain` : chain wrapComponents when targeting the same core component,
      *  allowing multiple plugins to wrap the same component
      * @default 'legacy'
      */
    var pluginLoadType: js.UndefOr[PluginLoadType] = js.undefined
  }
  object PluginsOptions {
    
    inline def apply(): PluginsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginsOptions] (val x: Self) extends AnyVal {
      
      inline def setPluginLoadType(value: PluginLoadType): Self = StObject.set(x, "pluginLoadType", value.asInstanceOf[js.Any])
      
      inline def setPluginLoadTypeUndefined: Self = StObject.set(x, "pluginLoadType", js.undefined)
    }
  }
  
  type Request = StringDictionary[Any]
  
  type Response = StringDictionary[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.swaggerUi.swaggerUiStrings.alpha
    - typings.swaggerUi.swaggerUiStrings.method
    - js.Function2[/ * name1 * / java.lang.String, / * name2 * / java.lang.String, scala.Double]
  */
  type SorterLike = _SorterLike | (js.Function2[/* name1 */ String, /* name2 */ String, Double])
  
  /* Rewritten from type alias, can be one of: 
    - typings.swaggerUi.swaggerUiStrings.get
    - typings.swaggerUi.swaggerUiStrings.put
    - typings.swaggerUi.swaggerUiStrings.post
    - typings.swaggerUi.swaggerUiStrings.delete
    - typings.swaggerUi.swaggerUiStrings.options
    - typings.swaggerUi.swaggerUiStrings.head
    - typings.swaggerUi.swaggerUiStrings.patch
    - typings.swaggerUi.swaggerUiStrings.trace
  */
  trait SupportedHTTPMethods extends StObject
  object SupportedHTTPMethods {
    
    inline def delete: typings.swaggerUi.swaggerUiStrings.delete = "delete".asInstanceOf[typings.swaggerUi.swaggerUiStrings.delete]
    
    inline def get: typings.swaggerUi.swaggerUiStrings.get = "get".asInstanceOf[typings.swaggerUi.swaggerUiStrings.get]
    
    inline def head: typings.swaggerUi.swaggerUiStrings.head = "head".asInstanceOf[typings.swaggerUi.swaggerUiStrings.head]
    
    inline def options: typings.swaggerUi.swaggerUiStrings.options = "options".asInstanceOf[typings.swaggerUi.swaggerUiStrings.options]
    
    inline def patch: typings.swaggerUi.swaggerUiStrings.patch = "patch".asInstanceOf[typings.swaggerUi.swaggerUiStrings.patch]
    
    inline def post: typings.swaggerUi.swaggerUiStrings.post = "post".asInstanceOf[typings.swaggerUi.swaggerUiStrings.post]
    
    inline def put: typings.swaggerUi.swaggerUiStrings.put = "put".asInstanceOf[typings.swaggerUi.swaggerUiStrings.put]
    
    inline def trace: typings.swaggerUi.swaggerUiStrings.trace = "trace".asInstanceOf[typings.swaggerUi.swaggerUiStrings.trace]
  }
  
  trait SwaggerUI extends StObject {
    
    /**
      * Provide Swagger UI with information about your OAuth server - see the
      * OAuth 2.0 documentation for more information.
      *
      * @param options
      */
    def initOAuth(options: Any): Unit
    
    /**
      * Programmatically set values for an API key or Bearer authorization scheme.
      * In case of OpenAPI 3.0 Bearer scheme, apiKeyValue must contain just the token
      * itself without the Bearer prefix.
      *
      * @param authDefinitionKey
      * @param apiKeyValue
      */
    def preauthorizeApiKey(authDefinitionKey: Any, apiKeyValue: Any): Any
    
    /**
      * Programmatically set values for a Basic authorization scheme.
      *
      * @param authDefinitionKey
      * @param username
      * @param password
      */
    def preauthorizeBasic(authDefinitionKey: Any, username: Any, password: Any): Any
  }
  object SwaggerUI {
    
    inline def apply(
      initOAuth: Any => Unit,
      preauthorizeApiKey: (Any, Any) => Any,
      preauthorizeBasic: (Any, Any, Any) => Any
    ): SwaggerUI = {
      val __obj = js.Dynamic.literal(initOAuth = js.Any.fromFunction1(initOAuth), preauthorizeApiKey = js.Any.fromFunction2(preauthorizeApiKey), preauthorizeBasic = js.Any.fromFunction3(preauthorizeBasic))
      __obj.asInstanceOf[SwaggerUI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwaggerUI] (val x: Self) extends AnyVal {
      
      inline def setInitOAuth(value: Any => Unit): Self = StObject.set(x, "initOAuth", js.Any.fromFunction1(value))
      
      inline def setPreauthorizeApiKey(value: (Any, Any) => Any): Self = StObject.set(x, "preauthorizeApiKey", js.Any.fromFunction2(value))
      
      inline def setPreauthorizeBasic(value: (Any, Any, Any) => Any): Self = StObject.set(x, "preauthorizeBasic", js.Any.fromFunction3(value))
    }
  }
  
  trait SwaggerUIOptions extends StObject {
    
    // Core
    /**
      * URL to fetch external configuration document from.
      */
    var configUrl: js.UndefOr[String] = js.undefined
    
    // Display
    /**
      * If set to true, enables deep linking for tags and operations.
      * See the Deep Linking documentation for more information.
      */
    var deepLinking: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default expansion depth for the model on the model-example section.
      */
    var defaultModelExpandDepth: js.UndefOr[Double] = js.undefined
    
    /**
      * Controls how the model is shown when the API is first rendered.
      * (The user can always switch the rendering for a given model by clicking the
      * 'Model' and 'Example Value' links.)
      */
    var defaultModelRendering: js.UndefOr[example | model] = js.undefined
    
    /**
      * The default expansion depth for models (set to -1 completely hide the models).
      */
    var defaultModelsExpandDepth: js.UndefOr[Double] = js.undefined
    
    /**
      * Controls the display of operationId in operations list. The default is false.
      */
    var displayOperationId: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls the display of the request duration (in milliseconds) for "Try it out" requests.
      */
    var displayRequestDuration: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls the default expansion setting for the operations and tags.
      * It can be 'list' (expands only the tags), 'full' (expands the tags and operations)
      * or 'none' (expands nothing).
      */
    var docExpansion: js.UndefOr[list | full | none] = js.undefined
    
    /**
      *  REQUIRED if dom_id is not provided. The HTML DOM element inside which SwaggerUI will put its user interface. Overrides dom_id.
      */
    var domNode: js.UndefOr[HTMLElement | Null] = js.undefined
    
    /**
      * REQUIRED if domNode is not provided. The ID of a DOM element inside which SwaggerUI will put its user interface.
      */
    var dom_id: js.UndefOr[String] = js.undefined
    
    /**
      * If set, enables filtering.
      * The top bar will show an edit box that you can use to filter the tagged operations that are shown.
      * Can be Boolean to enable or disable, or a string, in which case filtering will be enabled
      * using that string as the filter expression.
      * Filtering is case sensitive matching the filter expression anywhere inside the tag.
      */
    var filter: js.UndefOr[Boolean | String] = js.undefined
    
    // Plugin system
    /**
      * The name of a component available via the plugin system to use as the top-level layout
      * for Swagger UI.
      */
    var layout: js.UndefOr[String] = js.undefined
    
    /**
      * If set, limits the number of tagged operations displayed to at most this many.
      * The default is to show all operations.
      */
    var maxDisplayedTags: js.UndefOr[Double] = js.undefined
    
    // Macros
    /**
      * Function to set default values to each property in model.
      * Accepts one argument modelPropertyMacro(property), property is immutable
      */
    var modelPropertyMacro: js.UndefOr[js.Function1[/* propName */ Any, Any]] = js.undefined
    
    // Network
    /**
      * OAuth redirect URL.
      */
    var oauth2RedirectUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Provides a mechanism to be notified when Swagger UI has finished rendering a newly provided definition.
      */
    var onComplete: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * Apply a sort to the operation list of each API.
      * It can be 'alpha' (sort by paths alphanumerically),
      * 'method' (sort by HTTP method) or a function (see Array.prototype.sort() to know how sort function works).
      * Default is the order returned by the server unchanged.
      */
    var operationsSorter: js.UndefOr[SorterLike] = js.undefined
    
    /**
      * Function to set default value to parameters.
      * Accepts two arguments parameterMacro(operation, parameter).
      * Operation and parameter are objects passed for context, both remain immutable
      */
    var parameterMacro: js.UndefOr[js.Function2[/* operation */ Any, /* parameter */ Any, Any]] = js.undefined
    
    // Authorization
    /**
      * If set to true, it persists authorization data and it would not be lost on browser close/refresh
      */
    var persistAuthorization: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An array of plugin functions to use in Swagger UI.
      */
    var plugins: js.UndefOr[js.Array[SwaggerUIPlugin]] = js.undefined
    
    /**
      * A Javascript object to configure plugin integration and behaviors
      */
    var pluginsOptions: js.UndefOr[PluginsOptions] = js.undefined
    
    /**
      * An array of presets to use in Swagger UI.
      * Usually, you'll want to include ApisPreset if you use this option.
      */
    var presets: js.UndefOr[js.Array[SwaggerUIPlugin]] = js.undefined
    
    /**
      * MUST be a function. Function to intercept remote definition,
      * "Try it out", and OAuth 2.0 requests.
      * Accepts one argument requestInterceptor(request) and must return the modified request,
      * or a Promise that resolves to the modified request.
      */
    var requestInterceptor: js.UndefOr[js.Function1[/* a */ Request, Request | js.Promise[Request]]] = js.undefined
    
    /**
      * This is the default configuration section for the the requestSnippets plugin.
      */
    var requestSnippets: js.UndefOr[DefaultExpanded] = js.undefined
    
    /**
      * MUST be a function. Function to intercept remote definition,
      * "Try it out", and OAuth 2.0 responses.
      * Accepts one argument responseInterceptor(response) and must return the modified response,
      * or a Promise that resolves to the modified response.
      */
    var responseInterceptor: js.UndefOr[js.Function1[/* a */ Response, Response | js.Promise[Response]]] = js.undefined
    
    /**
      * Controls the display of extensions (pattern, maxLength, minLength, maximum, minimum) fields
      * and values for Parameters.
      */
    var showCommonExtensions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls the display of vendor extension (x-) fields and values for Operations,
      * Parameters, Responses, and Schema.
      */
    var showExtensions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true, uses the mutated request returned from a requestInterceptor
      * to produce the curl command in the UI, otherwise the request
      * beforethe requestInterceptor was applied is used.
      */
    var showMutatedRequest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A JavaScript object describing the OpenAPI definition. When used, the url parameter will not be parsed. This is useful for testing manually-generated definitions without hosting them
      */
    var spec: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * List of HTTP methods that have the "Try it out" feature enabled.
      * An empty array disables "Try it out" for all operations.
      * This does not filter the operations from the display.
      */
    var supportedSubmitMethods: js.UndefOr[js.Array[SupportedHTTPMethods]] = js.undefined
    
    /**
      * Set to false to deactivate syntax highlighting of payloads and cURL command,
      * can be otherwise an object with the activate and theme properties.
      */
    var syntaxHighlight: js.UndefOr[`false` | Activate] = js.undefined
    
    /**
      * Apply a sort to the tag list of each API.
      * It can be 'alpha' (sort by paths alphanumerically)
      * or a function (see Array.prototype.sort() to learn how to write a sort function).
      * Two tag name strings are passed to the sorter for each pass.
      * Default is the order determined by Swagger UI.
      */
    var tagsSorter: js.UndefOr[SorterLike] = js.undefined
    
    /**
      * Controls whether the "Try it out" section should be enabled by default.
      */
    var tryItOutEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The URL pointing to API definition (normally swagger.json or swagger.yaml). Will be ignored if urls or spec is used.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * An array of API definition objects ([{url: "<url1>", name: "<name1>"},{url: "<url2>", name: "<name2>"}])
      * used by Topbar plugin. When used and Topbar plugin is enabled, the url parameter will not be parsed.
      * Names and URLs must be unique among all items in this array, since they're used as identifiers.
      */
    var urls: js.UndefOr[js.Array[Name]] = js.undefined
    
    /**
      * When enabled, sanitizer will leave style, class and data-* attributes untouched
      * on all HTML Elements declared inside markdown strings.
      * This parameter is Deprecated and will be removed in 4.0.0.
      * @deprecated
      */
    var useUnsafeMarkdown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, Swagger UI attempts to validate specs against swagger.io's online validator.
      * You can use this parameter to set a different validator URL,
      * for example for locally deployed validators (Validator Badge).
      * Setting it to either none, 127.0.0.1 or localhost will disable validation.
      */
    var validatorUrl: js.UndefOr[String] = js.undefined
    
    /**
      * If set to true, enables passing credentials, as defined in the Fetch standard,
      * in CORS requests that are sent by the browser.
      * Note that Swagger UI cannot currently set cookies cross-domain (see swagger-js#1163)
      * - as a result, you will have to rely on browser-supplied
      * cookies (which this setting enables sending) that Swagger UI cannot control.
      */
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object SwaggerUIOptions {
    
    inline def apply(): SwaggerUIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerUIOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwaggerUIOptions] (val x: Self) extends AnyVal {
      
      inline def setConfigUrl(value: String): Self = StObject.set(x, "configUrl", value.asInstanceOf[js.Any])
      
      inline def setConfigUrlUndefined: Self = StObject.set(x, "configUrl", js.undefined)
      
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
      
      inline def setDomNode(value: HTMLElement): Self = StObject.set(x, "domNode", value.asInstanceOf[js.Any])
      
      inline def setDomNodeNull: Self = StObject.set(x, "domNode", null)
      
      inline def setDomNodeUndefined: Self = StObject.set(x, "domNode", js.undefined)
      
      inline def setDom_id(value: String): Self = StObject.set(x, "dom_id", value.asInstanceOf[js.Any])
      
      inline def setDom_idUndefined: Self = StObject.set(x, "dom_id", js.undefined)
      
      inline def setFilter(value: Boolean | String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMaxDisplayedTags(value: Double): Self = StObject.set(x, "maxDisplayedTags", value.asInstanceOf[js.Any])
      
      inline def setMaxDisplayedTagsUndefined: Self = StObject.set(x, "maxDisplayedTags", js.undefined)
      
      inline def setModelPropertyMacro(value: /* propName */ Any => Any): Self = StObject.set(x, "modelPropertyMacro", js.Any.fromFunction1(value))
      
      inline def setModelPropertyMacroUndefined: Self = StObject.set(x, "modelPropertyMacro", js.undefined)
      
      inline def setOauth2RedirectUrl(value: String): Self = StObject.set(x, "oauth2RedirectUrl", value.asInstanceOf[js.Any])
      
      inline def setOauth2RedirectUrlUndefined: Self = StObject.set(x, "oauth2RedirectUrl", js.undefined)
      
      inline def setOnComplete(value: () => Any): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOperationsSorter(value: SorterLike): Self = StObject.set(x, "operationsSorter", value.asInstanceOf[js.Any])
      
      inline def setOperationsSorterFunction2(value: (/* name1 */ String, /* name2 */ String) => Double): Self = StObject.set(x, "operationsSorter", js.Any.fromFunction2(value))
      
      inline def setOperationsSorterUndefined: Self = StObject.set(x, "operationsSorter", js.undefined)
      
      inline def setParameterMacro(value: (/* operation */ Any, /* parameter */ Any) => Any): Self = StObject.set(x, "parameterMacro", js.Any.fromFunction2(value))
      
      inline def setParameterMacroUndefined: Self = StObject.set(x, "parameterMacro", js.undefined)
      
      inline def setPersistAuthorization(value: Boolean): Self = StObject.set(x, "persistAuthorization", value.asInstanceOf[js.Any])
      
      inline def setPersistAuthorizationUndefined: Self = StObject.set(x, "persistAuthorization", js.undefined)
      
      inline def setPlugins(value: js.Array[SwaggerUIPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsOptions(value: PluginsOptions): Self = StObject.set(x, "pluginsOptions", value.asInstanceOf[js.Any])
      
      inline def setPluginsOptionsUndefined: Self = StObject.set(x, "pluginsOptions", js.undefined)
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: SwaggerUIPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPresets(value: js.Array[SwaggerUIPlugin]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      inline def setPresetsVarargs(value: SwaggerUIPlugin*): Self = StObject.set(x, "presets", js.Array(value*))
      
      inline def setRequestInterceptor(value: /* a */ Request => Request | js.Promise[Request]): Self = StObject.set(x, "requestInterceptor", js.Any.fromFunction1(value))
      
      inline def setRequestInterceptorUndefined: Self = StObject.set(x, "requestInterceptor", js.undefined)
      
      inline def setRequestSnippets(value: DefaultExpanded): Self = StObject.set(x, "requestSnippets", value.asInstanceOf[js.Any])
      
      inline def setRequestSnippetsUndefined: Self = StObject.set(x, "requestSnippets", js.undefined)
      
      inline def setResponseInterceptor(value: /* a */ Response => Response | js.Promise[Response]): Self = StObject.set(x, "responseInterceptor", js.Any.fromFunction1(value))
      
      inline def setResponseInterceptorUndefined: Self = StObject.set(x, "responseInterceptor", js.undefined)
      
      inline def setShowCommonExtensions(value: Boolean): Self = StObject.set(x, "showCommonExtensions", value.asInstanceOf[js.Any])
      
      inline def setShowCommonExtensionsUndefined: Self = StObject.set(x, "showCommonExtensions", js.undefined)
      
      inline def setShowExtensions(value: Boolean): Self = StObject.set(x, "showExtensions", value.asInstanceOf[js.Any])
      
      inline def setShowExtensionsUndefined: Self = StObject.set(x, "showExtensions", js.undefined)
      
      inline def setShowMutatedRequest(value: Boolean): Self = StObject.set(x, "showMutatedRequest", value.asInstanceOf[js.Any])
      
      inline def setShowMutatedRequestUndefined: Self = StObject.set(x, "showMutatedRequest", js.undefined)
      
      inline def setSpec(value: StringDictionary[Any]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      inline def setSupportedSubmitMethods(value: js.Array[SupportedHTTPMethods]): Self = StObject.set(x, "supportedSubmitMethods", value.asInstanceOf[js.Any])
      
      inline def setSupportedSubmitMethodsUndefined: Self = StObject.set(x, "supportedSubmitMethods", js.undefined)
      
      inline def setSupportedSubmitMethodsVarargs(value: SupportedHTTPMethods*): Self = StObject.set(x, "supportedSubmitMethods", js.Array(value*))
      
      inline def setSyntaxHighlight(value: `false` | Activate): Self = StObject.set(x, "syntaxHighlight", value.asInstanceOf[js.Any])
      
      inline def setSyntaxHighlightUndefined: Self = StObject.set(x, "syntaxHighlight", js.undefined)
      
      inline def setTagsSorter(value: SorterLike): Self = StObject.set(x, "tagsSorter", value.asInstanceOf[js.Any])
      
      inline def setTagsSorterFunction2(value: (/* name1 */ String, /* name2 */ String) => Double): Self = StObject.set(x, "tagsSorter", js.Any.fromFunction2(value))
      
      inline def setTagsSorterUndefined: Self = StObject.set(x, "tagsSorter", js.undefined)
      
      inline def setTryItOutEnabled(value: Boolean): Self = StObject.set(x, "tryItOutEnabled", value.asInstanceOf[js.Any])
      
      inline def setTryItOutEnabledUndefined: Self = StObject.set(x, "tryItOutEnabled", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrls(value: js.Array[Name]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      inline def setUrlsVarargs(value: Name*): Self = StObject.set(x, "urls", js.Array(value*))
      
      inline def setUseUnsafeMarkdown(value: Boolean): Self = StObject.set(x, "useUnsafeMarkdown", value.asInstanceOf[js.Any])
      
      inline def setUseUnsafeMarkdownUndefined: Self = StObject.set(x, "useUnsafeMarkdown", js.undefined)
      
      inline def setValidatorUrl(value: String): Self = StObject.set(x, "validatorUrl", value.asInstanceOf[js.Any])
      
      inline def setValidatorUrlUndefined: Self = StObject.set(x, "validatorUrl", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  /**
    * See https://swagger.io/docs/open-source-tools/swagger-ui/customization/plugin-api/
    */
  type SwaggerUIPlugin = js.Function1[/* system */ Any, AfterLoad]
  
  trait _SorterLike extends StObject
}
