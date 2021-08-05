package typings.wpapi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.File
import typings.wpapi.anon.Self
import typings.wpapi.anon.Type
import typings.wpapi.wpapiStrings.asc
import typings.wpapi.wpapiStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * REST API Client for WordPress
    *
    * @see http://wp-api.org/node-wpapi/api-reference/wpapi/1.1.2/WPAPI.html
    */
  @JSImport("wpapi", JSImport.Namespace)
  @js.native
  /**
    * Construct a REST API client instance object to create
    *
    * @param options An options hash to configure the instance
    */
  class ^ ()
    extends StObject
       with WPAPI {
    def this(options: WPAPIOptions) = this()
  }
  @JSImport("wpapi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The base WordPress API request
    *
    * @see http://wp-api.org/node-wpapi/api-reference/wpapi/1.1.2/WPRequest.html
    */
  @JSImport("wpapi", "WPRequest")
  @js.native
  class WPRequest protected ()
    extends StObject
       with /**
    * A request can define its parameter methods, like .id(), .date(),
    * .author(). They are usually decided by WPAPI routes configuration
    * object.
    */
  /* customParamsMethod */ StringDictionary[js.Any] {
    /**
      * WPRequest is the base API request object constructor
      *
      * @param options A hash of options for the WPRequest instance
      */
    def this(options: WPAPIOptions) = this()
    
    /**
      * Set a request to use authentication, and optionally provide auth
      * credentials. If auth credentials were already specified when the WPAPI
      * instance was created, calling .auth on the request chain will set
      * that request to use the existing credentials.
      *
      * @param credentials An authentication credentials object
      */
    def auth(): WPRequest = js.native
    def auth(credentials: Credentials): WPRequest = js.native
    
    /**
      * Set the context of the request. Used primarily to expose private
      * values on a request object by setting the context to "edit".
      *
      * @param context The context to set on the request
      */
    def context(context: String): WPRequest = js.native
    
    /**
      * Create the specified resource with the provided data
      *
      * This is the public interface for creating POST requests
      *
      * @param data The data for the POST request
      * @param callback A callback to invoke with the results of the POST
      * request
      */
    def create(data: js.Any): js.Promise[js.Any] = js.native
    def create(data: js.Any, callback: WPRequestCallback): js.Promise[js.Any] = js.native
    
    /**
      * Delete the specified resource
      *
      * @param data Data to send along with the DELETE request
      * @param callback A callback to invoke with the results of the DELETE
      * request
      */
    def delete(): js.Promise[js.Any] = js.native
    def delete(data: js.Any): js.Promise[js.Any] = js.native
    def delete(data: js.Any, callback: WPRequestCallback): js.Promise[js.Any] = js.native
    def delete(data: Unit, callback: WPRequestCallback): js.Promise[js.Any] = js.native
    
    /**
      * Convenience wrapper for .context( 'edit' )
      */
    def edit(): WPRequest = js.native
    
    /**
      * Return embedded resources as part of the response payload.
      */
    def embed(): WPRequest = js.native
    
    def exclude(ids: js.Array[Double]): WPRequest = js.native
    /**
      * Exclude specific resource IDs in the response collection.
      *
      * @param ids An ID or array of IDs to exclude
      */
    def exclude(ids: Double): WPRequest = js.native
    
    /**
      * Specify a file or a file buffer to attach to the request, for use
      * when creating a new Media item
      *
      * @param file A path to a file (in Node) or an file object (Node or
      * Browser) to attach to the request
      * @param name An (optional) filename to use for the file
      */
    def file(file: String): WPRequest = js.native
    def file(file: String, name: String): WPRequest = js.native
    def file(file: File): WPRequest = js.native
    def file(file: File, name: String): WPRequest = js.native
    
    /**
      * Get the headers for the specified resource
      *
      * @param callback A callback to invoke with the results of the HEAD
      * request
      */
    def get(): js.Promise[js.Any] = js.native
    def get(callback: WPRequestCallback): js.Promise[js.Any] = js.native
    
    /**
      * Set the id of resource.
      *
      * @param id An ID of item
      */
    def id(id: Double): WPRequest = js.native
    
    def include(ids: js.Array[Double]): WPRequest = js.native
    /**
      * Include specific resource IDs in the response collection.
      *
      * @param ids An ID or array of IDs to include
      */
    def include(ids: Double): WPRequest = js.native
    
    /**
      * Set the namespace of the request, e.g. to specify the API root for
      * routes registered by wp core v2 ("wp/v2") or by any given plugin. Any
      * previously- set namespace will be overwritten by subsequent calls to
      * the method.
      *
      * @param namespace A namespace string, e.g. "wp/v2"
      */
    def namespace(namespace: String): WPRequest = js.native
    
    /**
      * Set an arbitrary offset to retrieve items from a specific point in a
      * collection.
      *
      * @param offsetNumber The number of items by which to offset the response
      */
    def offset(offsetNumber: Double): WPRequest = js.native
    
    /**
      * Change the sort direction of a returned collection
      *
      * @param direction The order to use when sorting the response
      */
    @JSName("order")
    def order_asc(direction: asc): WPRequest = js.native
    @JSName("order")
    def order_desc(direction: desc): WPRequest = js.native
    
    /**
      * Order a collection by a specific field
      *
      * @param field The field by which to order the response
      */
    def orderby(field: String): WPRequest = js.native
    
    /**
      * Set the pagination of a request. Use in conjunction with .perPage()
      * for explicit pagination handling. (The number of pages in a response
      * can be retrieved from the response's _paging.totalPages property.)
      *
      * @param pageNumber The page number of results to retrieve
      */
    def page(pageNumber: Double): WPRequest = js.native
    
    /**
      * Set a parameter to render into the final query URI.
      *
      * @param props The name of the parameter to set, or an object containing
      * parameter keys and their corresponding values
      * @param value The value of the parameter being set
      */
    def param(props: String): WPRequest = js.native
    def param(props: String, value: String): WPRequest = js.native
    def param(props: String, value: js.Array[js.Any]): WPRequest = js.native
    def param(props: String, value: Double): WPRequest = js.native
    def param(props: StringDictionary[String | Double | js.Array[js.Any]]): WPRequest = js.native
    def param(props: StringDictionary[String | Double | js.Array[js.Any]], value: String): WPRequest = js.native
    def param(props: StringDictionary[String | Double | js.Array[js.Any]], value: js.Array[js.Any]): WPRequest = js.native
    def param(props: StringDictionary[String | Double | js.Array[js.Any]], value: Double): WPRequest = js.native
    
    /**
      * Set the number of items to be returned in a page of responses.
      *
      * @param itemsPerPage The number of items to return in one page of
      * results
      */
    def perPage(itemsPerPage: Double): WPRequest = js.native
    
    /**
      * Filter results to those matching the specified search terms.
      *
      * @param searchString A string to search for within post content
      */
    def search(searchString: String): WPRequest = js.native
    
    /**
      * Specify one or more headers to send with the dispatched HTTP request.
      *
      * @param headers The name of the header to set, or an object of header
      * names and their associated string values
      * @param value The value of the header being set
      */
    def setHeaders(headers: String): WPRequest = js.native
    def setHeaders(headers: String, value: String): WPRequest = js.native
    def setHeaders(headers: StringDictionary[String]): WPRequest = js.native
    def setHeaders(headers: StringDictionary[String], value: String): WPRequest = js.native
    
    def setPathPart(level: String, value: String): WPRequest = js.native
    def setPathPart(level: String, value: Double): WPRequest = js.native
    def setPathPart(level: Double, value: String): WPRequest = js.native
    /**
      * Set a component of the resource URL itself (as opposed to a query
      * parameter)
      *
      * If a path component has already been set at this level, throw an
      * error: requests are meant to be transient, so any re-writing of a
      * previously-set path part value is likely to be a mistake.
      *
      * @param level A "level" of the path to set, e.g. "1" or "2"
      * @param value The value to set at that path part level
      */
    def setPathPart(level: Double, value: Double): WPRequest = js.native
    
    /**
      * Query a collection for members with a specific slug.
      *
      * @param slug A post slug (slug), e.g. "hello-world"
      */
    def slug(slug: String): WPRequest = js.native
    
    /**
      * Calling .then on a query chain will invoke the query as a GET and
      * return a promise
      *
      * @param successCallback A callback to handle the data returned from
      * the GET request
      * @param failureCallback A callback to handle any errors encountered
      * by the request
      */
    def `then`(): js.Promise[js.Any] = js.native
    def `then`(successCallback: js.Function1[/* data */ js.Any, Unit]): js.Promise[js.Any] = js.native
    def `then`(
      successCallback: js.Function1[/* data */ js.Any, Unit],
      failureCallback: js.Function1[/* error */ Error, Unit]
    ): js.Promise[js.Any] = js.native
    def `then`(successCallback: Unit, failureCallback: js.Function1[/* error */ Error, Unit]): js.Promise[js.Any] = js.native
    
    /**
      * Update the specified resource with the provided data
      *
      * This is the public interface for creating PATCH requests
      *
      * @param data The data for the PATCH request
      * @param callback A callback to invoke with the results of the PATCH
      * request
      */
    def update(data: js.Any): js.Promise[js.Any] = js.native
    def update(data: js.Any, callback: WPRequestCallback): js.Promise[js.Any] = js.native
    
    /**
      * Validate whether the specified path parts are valid for this endpoint
      *
      * "Path parts" are non-query-string URL segments, like "some" "path" in
      * the URL mydomain.com/some/path?and=a&query=string&too. Because a well
      * -formed path is necessary to execute a successful API request, we
      * throw an error if the user has omitted a value (such as /some/[missing
      * component]/url) or has provided a path part value that does not match
      * the regular expression the API uses to goven that segment.
      */
    def validatePath(): WPRequest = js.native
  }
  
  /**
    * Take an arbitrary WordPress site, deduce the WP REST API root endpoint,
    * query that endpoint, and parse the response JSON. Use the returned JSON
    * response to instantiate a WPAPI instance bound to the provided site.
    *
    * @param url A URL within a REST API-enabled WordPress website
    */
  /* static member */
  inline def discover(url: String): js.Promise[WPAPI] = ^.asInstanceOf[js.Dynamic].applyDynamic("discover")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WPAPI]]
  
  /** Authentication credentials */
  trait Credentials extends StObject {
    
    /** A WP nonce for use with cookie authentication */
    var nonce: js.UndefOr[String] = js.undefined
    
    /** A WP-API Basic HTTP Authentication password */
    var password: js.UndefOr[String] = js.undefined
    
    /** A WP-API Basic HTTP Authentication username */
    var username: js.UndefOr[String] = js.undefined
  }
  object Credentials {
    
    inline def apply(): Credentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait HTTPArgument extends StObject {
    
    var default: js.UndefOr[String | Double] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var `enum`: js.UndefOr[js.Array[String]] = js.undefined
    
    var items: js.UndefOr[Type] = js.undefined
    
    var required: Boolean
    
    var `type`: js.UndefOr[HTTPArgumentType] = js.undefined
  }
  object HTTPArgument {
    
    inline def apply(required: Boolean): HTTPArgument = {
      val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTTPArgument]
    }
    
    extension [Self <: HTTPArgument](x: Self) {
      
      inline def setDefault(value: String | Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      inline def setItems(value: Type): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setType(value: HTTPArgumentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wpapi.wpapiStrings.string
    - typings.wpapi.wpapiStrings.integer
    - typings.wpapi.wpapiStrings.number
    - typings.wpapi.wpapiStrings.boolean
    - typings.wpapi.wpapiStrings.`object`
    - typings.wpapi.wpapiStrings.array
  */
  trait HTTPArgumentType extends StObject
  object HTTPArgumentType {
    
    inline def array: typings.wpapi.wpapiStrings.array = "array".asInstanceOf[typings.wpapi.wpapiStrings.array]
    
    inline def boolean: typings.wpapi.wpapiStrings.boolean = "boolean".asInstanceOf[typings.wpapi.wpapiStrings.boolean]
    
    inline def integer: typings.wpapi.wpapiStrings.integer = "integer".asInstanceOf[typings.wpapi.wpapiStrings.integer]
    
    inline def number: typings.wpapi.wpapiStrings.number = "number".asInstanceOf[typings.wpapi.wpapiStrings.number]
    
    inline def `object`: typings.wpapi.wpapiStrings.`object` = "object".asInstanceOf[typings.wpapi.wpapiStrings.`object`]
    
    inline def string: typings.wpapi.wpapiStrings.string = "string".asInstanceOf[typings.wpapi.wpapiStrings.string]
  }
  
  trait HTTPEndpoint extends StObject {
    
    var args: StringDictionary[HTTPArgument]
    
    var methods: js.Array[HTTPMethod]
  }
  object HTTPEndpoint {
    
    inline def apply(args: StringDictionary[HTTPArgument], methods: js.Array[HTTPMethod]): HTTPEndpoint = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTTPEndpoint]
    }
    
    extension [Self <: HTTPEndpoint](x: Self) {
      
      inline def setArgs(value: StringDictionary[HTTPArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: js.Array[HTTPMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsVarargs(value: HTTPMethod*): Self = StObject.set(x, "methods", js.Array(value :_*))
    }
  }
  
  type HTTPHeaders = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wpapi.wpapiStrings.GET
    - typings.wpapi.wpapiStrings.POST
    - typings.wpapi.wpapiStrings.PUT
    - typings.wpapi.wpapiStrings.PATCH
    - typings.wpapi.wpapiStrings.DELETE
  */
  trait HTTPMethod extends StObject
  object HTTPMethod {
    
    inline def DELETE: typings.wpapi.wpapiStrings.DELETE = "DELETE".asInstanceOf[typings.wpapi.wpapiStrings.DELETE]
    
    inline def GET: typings.wpapi.wpapiStrings.GET = "GET".asInstanceOf[typings.wpapi.wpapiStrings.GET]
    
    inline def PATCH: typings.wpapi.wpapiStrings.PATCH = "PATCH".asInstanceOf[typings.wpapi.wpapiStrings.PATCH]
    
    inline def POST: typings.wpapi.wpapiStrings.POST = "POST".asInstanceOf[typings.wpapi.wpapiStrings.POST]
    
    inline def PUT: typings.wpapi.wpapiStrings.PUT = "PUT".asInstanceOf[typings.wpapi.wpapiStrings.PUT]
  }
  
  trait RegisterRouteOptions extends StObject {
    
    var methods: js.UndefOr[js.Array[HTTPMethod]] = js.undefined
    
    var mixins: js.UndefOr[StringDictionary[js.Function1[/* val */ js.Any, js.Any]]] = js.undefined
    
    var params: js.UndefOr[js.Array[String]] = js.undefined
  }
  object RegisterRouteOptions {
    
    inline def apply(): RegisterRouteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterRouteOptions]
    }
    
    extension [Self <: RegisterRouteOptions](x: Self) {
      
      inline def setMethods(value: js.Array[HTTPMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: HTTPMethod*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      inline def setMixins(value: StringDictionary[js.Function1[/* val */ js.Any, js.Any]]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setParams(value: js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value :_*))
    }
  }
  
  trait Route extends StObject {
    
    var _links: js.UndefOr[Self] = js.undefined
    
    var endpoints: js.Array[HTTPEndpoint]
    
    var methods: js.Array[HTTPMethod]
    
    var namespace: String
  }
  object Route {
    
    inline def apply(endpoints: js.Array[HTTPEndpoint], methods: js.Array[HTTPMethod], namespace: String): Route = {
      val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route]
    }
    
    extension [Self <: Route](x: Self) {
      
      inline def setEndpoints(value: js.Array[HTTPEndpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsVarargs(value: HTTPEndpoint*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
      
      inline def setMethods(value: js.Array[HTTPMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsVarargs(value: HTTPMethod*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def set_links(value: Self): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
      
      inline def set_linksUndefined: Self = StObject.set(x, "_links", js.undefined)
    }
  }
  
  type Routes = StringDictionary[Route]
  
  trait Transport extends StObject {
    
    var delete: js.UndefOr[TransportFunction] = js.undefined
    
    var get: js.UndefOr[TransportFunction] = js.undefined
    
    var head: js.UndefOr[TransportFunction] = js.undefined
    
    var post: js.UndefOr[TransportFunction] = js.undefined
    
    var put: js.UndefOr[TransportFunction] = js.undefined
  }
  object Transport {
    
    inline def apply(): Transport = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Transport]
    }
    
    extension [Self <: Transport](x: Self) {
      
      inline def setDelete(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setGet(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setHead(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = StObject.set(x, "head", js.Any.fromFunction2(value))
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setPost(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = StObject.set(x, "post", js.Any.fromFunction2(value))
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPut(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
      
      inline def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
    }
  }
  
  type TransportFunction = js.Function2[/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback], js.Promise[js.Any]]
  
  /**
    * REST API Client for WordPress
    *
    * @see http://wp-api.org/node-wpapi/api-reference/wpapi/1.1.2/WPAPI.html
    */
  @js.native
  trait WPAPI
    extends StObject
       with /**
    * A request can define its parameter methods, like .id(), .date(),
    * .author(). They are usually decided by WPAPI routes configuration
    * object.
    */
  /* customParamsMethod */ StringDictionary[js.Any] {
    
    /**
      * Set the authentication to use for a WPAPI site handler instance. Accepts
      * basic HTTP authentication credentials (string username & password) or a
      * Nonce (for cookie authentication) by default; may be overloaded to accept
      * OAuth credentials in the future.
      *
      * @param credentials An authentication credentials object
      */
    def auth(): WPAPI = js.native
    def auth(credentials: Credentials): WPAPI = js.native
    
    /**
      * Deduce request methods from a provided API root JSON response object's
      * routes dictionary, and assign those methods to the current instance. If
      * no routes dictionary is provided then the instance will be bootstrapped
      * with route handlers for the default API endpoints only.
      *
      * This method is called automatically during WPAPI instance creation.
      *
      * @param routes The "routes" object from the JSON object returned from the
      * root API endpoint of a WP site, which should be a dictionary of route
      * definition objects keyed by the route's regex pattern
      */
    def bootstrap(routes: Routes): WPAPI = js.native
    
    /** Start a request against /categories endpoint */
    def categories(): WPRequest = js.native
    
    /** Start a request against /comments endpoints */
    def comments(): WPRequest = js.native
    
    /** Start a request against /media endpoints */
    def media(): WPRequest = js.native
    
    /**
      * Access API endpoint handlers from a particular API namespace object
      *
      * @param namespace A namespace string
      */
    def namespace(namespace: String): WPAPI = js.native
    
    /** Start a request against /pages endpoints */
    def pages(): WPRequest = js.native
    
    /** Start a request against /posts endpoints */
    def posts(): WPRequest = js.native
    
    /**
      * Create and return a handler for an arbitrary WP REST API endpoint.
      *
      * @param namespace A namespace string, e.g. 'myplugin/v1'
      * @param restBase A REST route string, e.g. '/author/(?P\d+)'
      * @param options An (optional) options object
      */
    def registerRoute(namespace: String, restBase: String): WPRequestFactory = js.native
    def registerRoute(namespace: String, restBase: String, options: RegisterRouteOptions): WPRequestFactory = js.native
    
    /**
      * Generate a query against an arbitrary path on the current endpoint. This
      * is useful for requesting resources at custom WP-API endpoints, such as
      * WooCommerce's /products.
      *
      * @param relativePath An endpoint-relative path to which to bind the request
      */
    def root(): WPRequest = js.native
    def root(relativePath: String): WPRequest = js.native
    
    /**
      * Set the default headers to use for all HTTP requests created from this
      * WPAPI site instance. Accepts a header name and its associated value as
      * two strings, or multiple headers as an object of name-value pairs.
      *
      * @param headers
      */
    def setHeaders(headers: HTTPHeaders): WPAPI = js.native
    
    /** Start a request against /settings endpoints */
    def settings(): WPRequest = js.native
    
    /**
      * Convenience method for making a new WPAPI instance
      *
      * @param endpoint The URI for a WP-API endpoint
      * @param routes The "routes" object from the JSON object returned from the
      * root API endpoint of a WP site, which should be a dictionary of route
      * definition objects keyed by the route's regex pattern
      */
    def site(endpoint: String, routes: Routes): WPAPI = js.native
    
    /** Start a request against /statuses endpoints */
    def statuses(): WPRequest = js.native
    
    /** Start a request against /tags endpoints */
    def tags(): WPRequest = js.native
    
    /** Start a request against /taxonomies endpoints */
    def taxonomies(): WPRequest = js.native
    
    /**
      * Set custom transport methods to use when making HTTP requests against the
      * API.
      *
      * Pass an object with a function for one or many of "get", "post", "put",
      * "delete" and "head" and that function will be called when making that
      * type of request. The provided transport functions should take a WPRequest
      * handler instance (e.g. the result of a wp.posts()... chain or any other
      * chaining request handler) as their first argument; a data object as their
      * second argument (for POST, PUT and DELETE requests); and an optional
      * callback as their final argument. Transport methods should invoke the
      * callback with the response data (or error, as appropriate), and should
      * also return a Promise.
      *
      * @param transport A dictionary of HTTP transport methods
      */
    def transport(transport: Transport): WPAPI = js.native
    
    /** Start a request against /types endpoints */
    def types(): WPRequest = js.native
    
    /**
      * Generate a request against a completely arbitrary endpoint, with no
      * assumptions about or mutation of path, filtering, or query parameters.
      * This request is not restricted to the endpoint specified during WPAPI
      * object instantiation.
      *
      * @param url The URL to request
      */
    def url(url: String): WPRequest = js.native
    
    /** Start a request against /users endpoints */
    def users(): WPRequest = js.native
  }
  
  trait WPAPIOptions
    extends StObject
       with Credentials {
    
    /** The URI for a WP-API endpoint */
    var endpoint: String
    
    /**
      * A dictionary of API routes with which to bootstrap the WPAPI instance:
      * the instance will be initialized with default routes only if this
      * property is omitted
      */
    var routes: js.UndefOr[Routes] = js.undefined
    
    /**
      * An optional dictionary of HTTP transport methods (.get, .post, .put,
      * .delete, .head) to use instead of the defaults, e.g. to use a
      * different HTTP library than superagent
      */
    var transport: js.UndefOr[Transport] = js.undefined
  }
  object WPAPIOptions {
    
    inline def apply(endpoint: String): WPAPIOptions = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[WPAPIOptions]
    }
    
    extension [Self <: WPAPIOptions](x: Self) {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setRoutes(value: Routes): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  type WPRequestCallback = js.Function2[/* error */ Error, /* data */ js.Any, Unit]
  
  type WPRequestFactory = js.Function0[WPRequest]
  
  trait WPRequestOptions
    extends StObject
       with Credentials {
    
    /** The URI for a WP-API endpoint */
    var endpoint: String
    
    /**
      * An dictionary of HTTP transport methods (.get, .post, .put,
      * .delete, .head) to use instead of the defaults, e.g. to use a
      * different HTTP library than superagent
      */
    var transport: js.UndefOr[Transport] = js.undefined
  }
  object WPRequestOptions {
    
    inline def apply(endpoint: String): WPRequestOptions = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[WPRequestOptions]
    }
    
    extension [Self <: WPRequestOptions](x: Self) {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
}
