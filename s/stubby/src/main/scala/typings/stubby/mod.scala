package typings.stubby

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Server
import typings.node.tlsMod.TlsOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stubby", "Stubby")
  @js.native
  class Stubby () extends StObject {
    
    var adminPortal: Server = js.native
    
    /** Simulates a DELETE request to the admin portal, with the callback receiving the resultant data. */
    def delete(id: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    var endpoints: Endpoints = js.native
    
    /** Simulates a GET request to the admin portal, with the callback receiving the resultant data. */
    def get(callback: js.Function2[/* err */ js.UndefOr[Error], /* endpoints */ Endpoints, Unit]): Unit = js.native
    def get(id: String, callback: js.Function2[/* err */ js.UndefOr[Error], /* endpoint */ Endpoint, Unit]): Unit = js.native
    
    /** Simulates a POST request to the admin portal, with the callback receiving the resultant data. */
    def post(data: Endpoint, callback: js.Function2[/* err */ js.UndefOr[Error], /* endpoint */ Endpoint, Unit]): Unit = js.native
    
    /** Simulates a PUT request to the admin portal, with the callback receiving the resultant data. */
    def put(id: String, data: Endpoint, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    /** Starts stubby's stubs and admin portals. Executes `callback` afterward. */
    def start(): Unit = js.native
    def start(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    def start(options: StubbyOptions): Unit = js.native
    def start(options: StubbyOptions, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    /** Closes the connections and ports being used by stubby's stubs and admin portals. Executes callback afterward. */
    def stop(): Unit = js.native
    def stop(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    var stubsPortal: Server = js.native
    
    var tlsPortal: typings.node.tlsMod.Server = js.native
  }
  
  trait Endpoint extends StObject {
    
    def matches(request: StubbyRequest): StubbyRequest | Null
  }
  object Endpoint {
    
    @scala.inline
    def apply(matches: StubbyRequest => StubbyRequest | Null): Endpoint = {
      val __obj = js.Dynamic.literal(matches = js.Any.fromFunction1(matches))
      __obj.asInstanceOf[Endpoint]
    }
    
    @scala.inline
    implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatches(value: StubbyRequest => StubbyRequest | Null): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Endpoints extends StObject {
    
    def create(
      endpoint: js.Array[StubbyData],
      callback: js.Function2[/* err */ js.UndefOr[Error], /* endpoint */ Endpoint, Unit],
      datadir: String
    ): Unit = js.native
    def create(
      endpoint: StubbyData,
      callback: js.Function2[/* err */ js.UndefOr[Error], /* endpoint */ Endpoint, Unit],
      datadir: String
    ): Unit = js.native
    
    def delete(id: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def gather(callback: js.Function2[/* err */ js.UndefOr[Error], /* endpoints */ js.Array[Endpoint], Unit]): Unit = js.native
    
    def retrieve(id: String, callback: js.Function2[/* err */ js.UndefOr[Error], /* endpoint */ Endpoint, Unit]): Unit = js.native
    
    def update(id: String, data: StubbyData, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  }
  
  trait StubbyCommonOptions extends StObject {
    
    /** additional options to pass to the underlying tls server */
    var _httpsOptions: js.UndefOr[TlsOptions] = js.undefined
    
    /** port number to run the admin portal */
    var admin: js.UndefOr[Double] = js.undefined
    
    /** JavaScript Object/Array containing endpoint data */
    var data: js.UndefOr[StubbyData | js.Array[StubbyData]] = js.undefined
    
    var datadir: js.UndefOr[String] = js.undefined
    
    /** address/hostname at which to run stubby */
    var location: js.UndefOr[String] = js.undefined
    
    /** defaults to `true`. Pass in `false` to have console output (if available) */
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    /** port number to run the stubs portal */
    var stubs: js.UndefOr[Double] = js.undefined
    
    /** port number to run the stubs portal over https */
    var tls: js.UndefOr[Double] = js.undefined
    
    /** filename to monitor and load as stubby's data when changes occur */
    var watch: js.UndefOr[String] = js.undefined
  }
  object StubbyCommonOptions {
    
    @scala.inline
    def apply(): StubbyCommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StubbyCommonOptions]
    }
    
    @scala.inline
    implicit class StubbyCommonOptionsMutableBuilder[Self <: StubbyCommonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmin(value: Double): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
      
      @scala.inline
      def setData(value: StubbyData | js.Array[StubbyData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: StubbyData*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDatadir(value: String): Self = StObject.set(x, "datadir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatadirUndefined: Self = StObject.set(x, "datadir", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setStubs(value: Double): Self = StObject.set(x, "stubs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStubsUndefined: Self = StObject.set(x, "stubs", js.undefined)
      
      @scala.inline
      def setTls(value: Double): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      @scala.inline
      def setWatch(value: String): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      
      @scala.inline
      def set_httpsOptions(value: TlsOptions): Self = StObject.set(x, "_httpsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_httpsOptionsUndefined: Self = StObject.set(x, "_httpsOptions", js.undefined)
    }
  }
  
  trait StubbyData extends StObject {
    
    /**
      * This object is used to match an incoming request to stubby against the
      * available endpoints that have been configured.
      */
    var request: StubbyRequest
    
    /**
      * Assuming a match has been made against the given `request` object, data from
      * `response` is used to build the stubbed response back to the client.
      *
      * **ALSO**: The `response` property can also be a yaml sequence of responses
      * that cycle as each request is made.
      *
      * **ALSO**: The `response` property can also be a url (string) or sequence
      * of object/urls. The url will be used to record a response object to be
      * used in calls to stubby. When used this way, data from the `request`
      * portion of the endpoint will be used to assemble a request to the url
      * given as the `response`.
      */
    var response: js.UndefOr[String | StubbyResponse | (js.Array[String | StubbyResponse])] = js.undefined
  }
  object StubbyData {
    
    @scala.inline
    def apply(request: StubbyRequest): StubbyData = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[StubbyData]
    }
    
    @scala.inline
    implicit class StubbyDataMutableBuilder[Self <: StubbyData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: StubbyRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: String | StubbyResponse | (js.Array[String | StubbyResponse])): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      @scala.inline
      def setResponseVarargs(value: (String | StubbyResponse)*): Self = StObject.set(x, "response", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stubby.stubbyStrings.GET
    - typings.stubby.stubbyStrings.PUT
    - typings.stubby.stubbyStrings.POST
    - typings.stubby.stubbyStrings.HEAD
    - typings.stubby.stubbyStrings.PATCH
    - typings.stubby.stubbyStrings.TRACE
    - typings.stubby.stubbyStrings.DELETE
    - typings.stubby.stubbyStrings.CONNECT
    - typings.stubby.stubbyStrings.OPTIONS
  */
  trait StubbyMethod extends StObject
  object StubbyMethod {
    
    @scala.inline
    def CONNECT: typings.stubby.stubbyStrings.CONNECT = "CONNECT".asInstanceOf[typings.stubby.stubbyStrings.CONNECT]
    
    @scala.inline
    def DELETE: typings.stubby.stubbyStrings.DELETE = "DELETE".asInstanceOf[typings.stubby.stubbyStrings.DELETE]
    
    @scala.inline
    def GET: typings.stubby.stubbyStrings.GET = "GET".asInstanceOf[typings.stubby.stubbyStrings.GET]
    
    @scala.inline
    def HEAD: typings.stubby.stubbyStrings.HEAD = "HEAD".asInstanceOf[typings.stubby.stubbyStrings.HEAD]
    
    @scala.inline
    def OPTIONS: typings.stubby.stubbyStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.stubby.stubbyStrings.OPTIONS]
    
    @scala.inline
    def PATCH: typings.stubby.stubbyStrings.PATCH = "PATCH".asInstanceOf[typings.stubby.stubbyStrings.PATCH]
    
    @scala.inline
    def POST: typings.stubby.stubbyStrings.POST = "POST".asInstanceOf[typings.stubby.stubbyStrings.POST]
    
    @scala.inline
    def PUT: typings.stubby.stubbyStrings.PUT = "PUT".asInstanceOf[typings.stubby.stubbyStrings.PUT]
    
    @scala.inline
    def TRACE: typings.stubby.stubbyStrings.TRACE = "TRACE".asInstanceOf[typings.stubby.stubbyStrings.TRACE]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stubby.mod.StubbyWithKeyCertOptions
    - typings.stubby.mod.StubbyWithPfxOptions
  */
  trait StubbyOptions extends StObject
  object StubbyOptions {
    
    @scala.inline
    def StubbyWithKeyCertOptions(
      cert: String | Buffer | (js.Array[String | Buffer]),
      key: String | Buffer | (js.Array[Buffer | js.Object])
    ): typings.stubby.mod.StubbyWithKeyCertOptions = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stubby.mod.StubbyWithKeyCertOptions]
    }
    
    @scala.inline
    def StubbyWithPfxOptions(): typings.stubby.mod.StubbyWithPfxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.stubby.mod.StubbyWithPfxOptions]
    }
  }
  
  trait StubbyRequest extends StObject {
    
    /**
      * - if supplied, replaces `post` with the contents of the locally given
      *   file.
      *   - paths are relative from where the `--data` file is located
      * - if the file is not found when the request is made, falls back to `post`
      *   for matching.
      * - allows you to split up stubby data across multiple files
      */
    var file: js.UndefOr[String] = js.undefined
    
    /**
      * - values are full-fledged **regular expressions**
      * - if omitted, stubby ignores headers for the given url.
      * - case-insensitive matching of header names.
      * - a hashmap of header/value pairs similar to `query`.
      */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * - not used if `post` or `file` are present.
      * - will be parsed into a JavaScript object.
      * - allows you to specify a JSON string that will be deeply compared with a
      *   JSON request
      */
    var json: js.UndefOr[String] = js.undefined
    
    /**
      * - defaults to `GET`.
      * - case-insensitive.
      * - can be any of the following:
      *   - HEAD
      *   - GET
      *   - POST
      *   - PUT
      *   - DELETE
      *   - etc.
      * - it can also be an array of values.
      */
    var method: js.UndefOr[StubbyMethod | js.Array[StubbyMethod]] = js.undefined
    
    /**
      * - is a full-fledged **regular expression**
      * - if omitted, any post data is ignored.
      * - the body contents of the server request, such as form data.
      */
    var post: js.UndefOr[String] = js.undefined
    
    /**
      * - values are full-fledged **regular expressions**
      * - if omitted, stubby ignores query parameters for the given url.
      * - a yaml hashmap of variable/value pairs.
      * - allows the query parameters to appear in any order in a uri
      * - The following will match either of these:
      *   - /with/parameters?search=search+terms&filter=month
      *   - /with/parameters?filter=month&search=search+terms
      *
      * **NOTE**: repeated querystring keys (often array representations) will
      * have their values converted to a comma-separated list.
      */
    var query: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * - is a full-fledged **regular expression**
      * - This is the only required property of an endpoint.
      * - signify the url after the base host and port (i.e. after
      *   `localhost:8882`).
      * - any query parameters are stripped (so don't include them, that's what
      *   `query` is for).
      *   - `/url?some=value&another=value` becomes `/url`
      * - no checking is done for URI-encoding compliance.
      *   - If it's invalid, it won't ever trigger a match.
      */
    var url: String
  }
  object StubbyRequest {
    
    @scala.inline
    def apply(url: String): StubbyRequest = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[StubbyRequest]
    }
    
    @scala.inline
    implicit class StubbyRequestMutableBuilder[Self <: StubbyRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setMethod(value: StubbyMethod | js.Array[StubbyMethod]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMethodVarargs(value: StubbyMethod*): Self = StObject.set(x, "method", js.Array(value :_*))
      
      @scala.inline
      def setPost(value: String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      @scala.inline
      def setQuery(value: StringDictionary[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait StubbyResponse extends StObject {
    
    /**
      * - contents of the response body
      * - defaults to an empty content body
      */
    var body: js.UndefOr[String] = js.undefined
    
    /**
      * - similar to `request.file`, but the contents of the file are used as the
      *   `body`.
      */
    var file: js.UndefOr[String] = js.undefined
    
    /**
      * - similar to `request.headers` except that these are sent back to the
      *   client.
      */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * - time to wait, in milliseconds, before sending back the response
      * - good for testing timeouts, or slow connections
      */
    var latency: js.UndefOr[Double] = js.undefined
    
    /**
      * - the HTTP status code of the response.
      * - integer or integer-like string.
      * - defaults to `200`.
      */
    var status: js.UndefOr[Double | String] = js.undefined
  }
  object StubbyResponse {
    
    @scala.inline
    def apply(): StubbyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StubbyResponse]
    }
    
    @scala.inline
    implicit class StubbyResponseMutableBuilder[Self <: StubbyResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
      
      @scala.inline
      def setStatus(value: Double | String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait StubbyWithKeyCertOptions
    extends StObject
       with StubbyCommonOptions
       with StubbyOptions {
    
    // tslint:disable-line:ban-types
    /** certificate file contents (in PEM format) */
    var cert: String | Buffer | (js.Array[String | Buffer])
    
    /** keyfile contents (in PEM format) */
    var key: String | Buffer | (js.Array[Buffer | js.Object])
  }
  object StubbyWithKeyCertOptions {
    
    @scala.inline
    def apply(
      cert: String | Buffer | (js.Array[String | Buffer]),
      key: String | Buffer | (js.Array[Buffer | js.Object])
    ): StubbyWithKeyCertOptions = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[StubbyWithKeyCertOptions]
    }
    
    @scala.inline
    implicit class StubbyWithKeyCertOptionsMutableBuilder[Self <: StubbyWithKeyCertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: String | Buffer | (js.Array[Buffer | js.Object])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyVarargs(value: (Buffer | js.Object)*): Self = StObject.set(x, "key", js.Array(value :_*))
    }
  }
  
  trait StubbyWithPfxOptions
    extends StObject
       with StubbyCommonOptions
       with StubbyOptions {
    
    /** pfx file contents (mutually exclusive with key/cert options) */
    var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | js.Object])] = js.undefined
  }
  object StubbyWithPfxOptions {
    
    @scala.inline
    def apply(): StubbyWithPfxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StubbyWithPfxOptions]
    }
    
    @scala.inline
    implicit class StubbyWithPfxOptionsMutableBuilder[Self <: StubbyWithPfxOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPfx(value: String | Buffer | (js.Array[String | Buffer | js.Object])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setPfxVarargs(value: (String | Buffer | js.Object)*): Self = StObject.set(x, "pfx", js.Array(value :_*))
    }
  }
}
