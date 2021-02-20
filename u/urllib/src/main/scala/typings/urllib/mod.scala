package typings.urllib

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.LookupFunction
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.node.urlMod.URL_
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("urllib", "HttpClient")
  @js.native
  class HttpClient[O /* <: RequestOptions */] () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def curl[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
    def curl[T](url: String, callback: Callback[T]): Unit = js.native
    def curl[T](url: String, options: O): js.Promise[HttpClientResponse[T]] = js.native
    def curl[T](url: String, options: O, callback: Callback[T]): Unit = js.native
    def curl[T](url: URL_): js.Promise[HttpClientResponse[T]] = js.native
    def curl[T](url: URL_, callback: Callback[T]): Unit = js.native
    def curl[T](url: URL_, options: O): js.Promise[HttpClientResponse[T]] = js.native
    def curl[T](url: URL_, options: O, callback: Callback[T]): Unit = js.native
    
    def request[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
    def request[T](url: String, callback: Callback[T]): Unit = js.native
    def request[T](url: String, options: O): js.Promise[HttpClientResponse[T]] = js.native
    def request[T](url: String, options: O, callback: Callback[T]): Unit = js.native
    def request[T](url: URL_): js.Promise[HttpClientResponse[T]] = js.native
    def request[T](url: URL_, callback: Callback[T]): Unit = js.native
    def request[T](url: URL_, options: O): js.Promise[HttpClientResponse[T]] = js.native
    def request[T](url: URL_, options: O, callback: Callback[T]): Unit = js.native
    
    def requestThunk(url: String): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
    def requestThunk(url: String, options: O): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
    def requestThunk(url: URL_): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
    def requestThunk(url: URL_, options: O): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
  }
  
  @JSImport("urllib", "HttpClient2")
  @js.native
  class HttpClient2 () extends HttpClient[RequestOptions2] {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("urllib", "TIMEOUT")
  @js.native
  val TIMEOUT: Double = js.native
  
  @JSImport("urllib", "TIMEOUTS")
  @js.native
  val TIMEOUTS: js.Tuple2[Double, Double] = js.native
  
  @JSImport("urllib", "USER_AGENT")
  @js.native
  val USER_AGENT: String = js.native
  
  @JSImport("urllib", "agent")
  @js.native
  val agent: Agent = js.native
  
  @JSImport("urllib", "create")
  @js.native
  def create(): HttpClient[RequestOptions] = js.native
  @JSImport("urllib", "create")
  @js.native
  def create(options: RequestOptions): HttpClient[RequestOptions] = js.native
  
  @JSImport("urllib", "curl")
  @js.native
  def curl[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
  @JSImport("urllib", "curl")
  @js.native
  def curl[T](url: String, callback: Callback[T]): Unit = js.native
  @JSImport("urllib", "curl")
  @js.native
  def curl[T](url: String, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  @JSImport("urllib", "curl")
  @js.native
  def curl[T](url: String, options: RequestOptions, callback: Callback[T]): Unit = js.native
  @JSImport("urllib", "curl")
  @js.native
  def curl[T](url: URL_): js.Promise[HttpClientResponse[T]] = js.native
  @JSImport("urllib", "curl")
  @js.native
  def curl[T](url: URL_, callback: Callback[T]): Unit = js.native
  @JSImport("urllib", "curl")
  @js.native
  def curl[T](url: URL_, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  @JSImport("urllib", "curl")
  @js.native
  def curl[T](url: URL_, options: RequestOptions, callback: Callback[T]): Unit = js.native
  
  @JSImport("urllib", "httpsAgent")
  @js.native
  val httpsAgent: typings.node.httpsMod.Agent = js.native
  
  @JSImport("urllib", "request")
  @js.native
  def request[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
  @JSImport("urllib", "request")
  @js.native
  def request[T](url: String, callback: Callback[T]): Unit = js.native
  @JSImport("urllib", "request")
  @js.native
  def request[T](url: String, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  @JSImport("urllib", "request")
  @js.native
  def request[T](url: String, options: RequestOptions, callback: Callback[T]): Unit = js.native
  @JSImport("urllib", "request")
  @js.native
  def request[T](url: URL_): js.Promise[HttpClientResponse[T]] = js.native
  @JSImport("urllib", "request")
  @js.native
  def request[T](url: URL_, callback: Callback[T]): Unit = js.native
  @JSImport("urllib", "request")
  @js.native
  def request[T](url: URL_, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  @JSImport("urllib", "request")
  @js.native
  def request[T](url: URL_, options: RequestOptions, callback: Callback[T]): Unit = js.native
  
  @JSImport("urllib", "requestThunk")
  @js.native
  def requestThunk[T](url: String): js.Function1[/* callback */ Callback[T], Unit] = js.native
  @JSImport("urllib", "requestThunk")
  @js.native
  def requestThunk[T](url: String, options: RequestOptions): js.Function1[/* callback */ Callback[T], Unit] = js.native
  @JSImport("urllib", "requestThunk")
  @js.native
  def requestThunk[T](url: URL_): js.Function1[/* callback */ Callback[T], Unit] = js.native
  @JSImport("urllib", "requestThunk")
  @js.native
  def requestThunk[T](url: URL_, options: RequestOptions): js.Function1[/* callback */ Callback[T], Unit] = js.native
  
  @JSImport("urllib", "requestWithCallback")
  @js.native
  def requestWithCallback[T](url: String, callback: Callback[T]): Unit = js.native
  @JSImport("urllib", "requestWithCallback")
  @js.native
  def requestWithCallback[T](url: String, options: RequestOptions, callback: Callback[T]): Unit = js.native
  @JSImport("urllib", "requestWithCallback")
  @js.native
  def requestWithCallback[T](url: URL_, callback: Callback[T]): Unit = js.native
  @JSImport("urllib", "requestWithCallback")
  @js.native
  def requestWithCallback[T](url: URL_, options: RequestOptions, callback: Callback[T]): Unit = js.native
  
  type Callback[T] = js.Function3[/* err */ Error, /* data */ T, /* res */ IncomingMessage, Unit]
  
  @js.native
  trait HttpClientResponse[T] extends StObject {
    
    var data: T = js.native
    
    var headers: OutgoingHttpHeaders = js.native
    
    var res: IncomingMessage = js.native
    
    var status: Double = js.native
  }
  object HttpClientResponse {
    
    @scala.inline
    def apply[T](data: T, headers: OutgoingHttpHeaders, res: IncomingMessage, status: Double): HttpClientResponse[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpClientResponse[T]]
    }
    
    @scala.inline
    implicit class HttpClientResponseMutableBuilder[Self <: HttpClientResponse[_], T] (val x: Self with HttpClientResponse[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRes(value: IncomingMessage): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.urllib.urllibStrings.GET
    - typings.urllib.urllibStrings.POST
    - typings.urllib.urllibStrings.DELETE
    - typings.urllib.urllibStrings.PUT
    - typings.urllib.urllibStrings.HEAD
    - typings.urllib.urllibStrings.OPTIONS
    - typings.urllib.urllibStrings.PATCH
    - typings.urllib.urllibStrings.TRACE
    - typings.urllib.urllibStrings.CONNECT
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    @scala.inline
    def CONNECT: typings.urllib.urllibStrings.CONNECT = "CONNECT".asInstanceOf[typings.urllib.urllibStrings.CONNECT]
    
    @scala.inline
    def DELETE: typings.urllib.urllibStrings.DELETE = "DELETE".asInstanceOf[typings.urllib.urllibStrings.DELETE]
    
    @scala.inline
    def GET: typings.urllib.urllibStrings.GET = "GET".asInstanceOf[typings.urllib.urllibStrings.GET]
    
    @scala.inline
    def HEAD: typings.urllib.urllibStrings.HEAD = "HEAD".asInstanceOf[typings.urllib.urllibStrings.HEAD]
    
    @scala.inline
    def OPTIONS: typings.urllib.urllibStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.urllib.urllibStrings.OPTIONS]
    
    @scala.inline
    def PATCH: typings.urllib.urllibStrings.PATCH = "PATCH".asInstanceOf[typings.urllib.urllibStrings.PATCH]
    
    @scala.inline
    def POST: typings.urllib.urllibStrings.POST = "POST".asInstanceOf[typings.urllib.urllibStrings.POST]
    
    @scala.inline
    def PUT: typings.urllib.urllibStrings.PUT = "PUT".asInstanceOf[typings.urllib.urllibStrings.PUT]
    
    @scala.inline
    def TRACE: typings.urllib.urllibStrings.TRACE = "TRACE".asInstanceOf[typings.urllib.urllibStrings.TRACE]
  }
  
  @js.native
  trait RequestOptions extends StObject {
    
    /** HTTP Agent object.Set false if you does not use agent. */
    var agent: js.UndefOr[Agent] = js.native
    
    /** username:password used in HTTP Basic Authorization. */
    var auth: js.UndefOr[String] = js.native
    
    /** Before request hook, you can change every thing here. */
    var beforeRequest: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    /**
      * An array of strings or Buffers of trusted certificates.
      * If this is omitted several well known "root" CAs will be used, like VeriSign.
      * These are used to authorize connections.
      * Notes: This is necessary only if the server uses the self - signed certificate
      */
    var ca: js.UndefOr[String | Buffer | (js.Array[Buffer | String])] = js.native
    
    /**
      * A string or Buffer containing the certificate key of the client in PEM format.
      * Notes: This is necessary only if using the client certificate authentication
      */
    var cert: js.UndefOr[String | Buffer] = js.native
    
    /**
      * check request address to protect from SSRF and similar attacks.
      * It receive two arguments(ip and family) and should return true or false to identified the address is legal or not.
      * It rely on lookup and have the same version requirement.
      */
    var checkAddress: js.UndefOr[js.Function2[/* ip */ String, /* family */ Double | String, Boolean]] = js.native
    
    /** A string describing the ciphers to use or exclude. */
    var ciphers: js.UndefOr[String] = js.native
    
    /** consume the writeStream, invoke the callback after writeStream close. */
    var consumeWriteStream: js.UndefOr[Boolean] = js.native
    
    /** Manually set the content of payload. If set, data will be ignored. */
    var content: js.UndefOr[String | Buffer] = js.native
    
    /** Type of request data.Could be json.If it's json, will auto set Content-Type: application/json header. */
    var contentType: js.UndefOr[String] = js.native
    
    /** Data to be sent. Will be stringify automatically. */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Force convert data to query string. */
    var dataAsQueryString: js.UndefOr[Boolean] = js.native
    
    /**
      * Type of response data. Could be text or json.
      * If it's text, the callbacked data would be a String.
      * If it's json, the data of callback would be a parsed JSON Object
      * and will auto set Accept: application/json header. Default callbacked data would be a Buffer.
      */
    var dataType: js.UndefOr[String] = js.native
    
    /** username:password used in HTTP Digest Authorization. */
    var digestAuth: js.UndefOr[String] = js.native
    
    /** Enable proxy request, default is false. */
    var enableProxy: js.UndefOr[Boolean] = js.native
    
    /** 
      * The files will send with multipart/form-data format, base on formstream.
      * If method not set, will use POST method by default.
      */
    var files: js.UndefOr[(js.Array[Readable | Buffer | String]) | js.Object | Readable | Buffer | String] = js.native
    
    /** Fix the control characters (U+0000 through U+001F) before JSON parse response. Default is false. */
    var fixJSONCtlChars: js.UndefOr[Boolean] = js.native
    
    /** follow HTTP 3xx responses as redirects. defaults to false. */
    var followRedirect: js.UndefOr[Boolean] = js.native
    
    /** Format the redirect url by your self. Default is url.resolve(from, to). */
    var formatRedirectUrl: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Unit]] = js.native
    
    /** Accept gzip response content and auto decode it, default is false. */
    var gzip: js.UndefOr[Boolean] = js.native
    
    /** Request headers. */
    var headers: js.UndefOr[IncomingHttpHeaders] = js.native
    
    /** HTTPS Agent object. Set false if you does not use agent. */
    var httpsAgent: js.UndefOr[typings.node.httpsMod.Agent] = js.native
    
    /** by default will convert header keys to lowercase */
    var keepHeaderCase: js.UndefOr[Boolean] = js.native
    
    /**
      * A string or Buffer containing the private key of the client in PEM format.
      * Notes: This is necessary only if using the client certificate authentication
      */
    var key: js.UndefOr[String | Buffer] = js.native
    
    /**
      * Custom DNS lookup function, default is dns.lookup.
      * Require node >= 4.0.0(for http protocol) and node >=8(for https protocol)
      */
    var lookup: js.UndefOr[LookupFunction] = js.native
    
    /** The maximum number of redirects to follow, defaults to 10. */
    var maxRedirects: js.UndefOr[Double] = js.native
    
    /** Request method, defaults to GET. Could be GET, POST, DELETE or PUT. Alias 'type'. */
    var method: js.UndefOr[HttpMethod] = js.native
    
    /**
      * urllib default use querystring to stringify form data which don't support nested object,
      * will use qs instead of querystring to support nested object by set this option to true.
      */
    var nestedQuerystring: js.UndefOr[Boolean] = js.native
    
    /** A string of passphrase for the private key or pfx. */
    var passphrase: js.UndefOr[String] = js.native
    
    /** A string or Buffer containing the private key, certificate and CA certs of the server in PFX or PKCS12 format. */
    var pfx: js.UndefOr[String | Buffer] = js.native
    
    /** proxy agent uri or options, default is null. */
    var proxy: js.UndefOr[String | StringDictionary[js.Any]] = js.native
    
    /**
      * If true, the server certificate is verified against the list of supplied CAs.
      * An 'error' event is emitted if verification fails.Default: true.
      */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    /** The SSL method to use, e.g.SSLv3_method to force SSL version 3. */
    var secureProtocol: js.UndefOr[String] = js.native
    
    /** Stream to be pipe to the remote.If set, data and content will be ignored. */
    var stream: js.UndefOr[Readable] = js.native
    
    /** let you get the res object when request connected, default false. alias customResponse */
    var streaming: js.UndefOr[Boolean] = js.native
    
    /**
      * Request timeout in milliseconds for connecting phase and response receiving phase.
      * Defaults to exports.
      * TIMEOUT, both are 5s.You can use timeout: 5000 to tell urllib use same timeout on two phase or set them seperately such as
      * timeout: [3000, 5000], which will set connecting timeout to 3s and response 5s.
      */
    var timeout: js.UndefOr[Double | js.Array[Double]] = js.native
    
    /** Enable timing or not, default is false. */
    var timing: js.UndefOr[Boolean] = js.native
    
    /** Alias method  */
    var `type`: js.UndefOr[HttpMethod] = js.native
    
    /**
      * A writable stream to be piped by the response stream.
      * Responding data will be write to this stream and callback
      * will be called with data set null after finished writing.
      */
    var writeStream: js.UndefOr[Writable] = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setBeforeRequest(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "beforeRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeRequestUndefined: Self = StObject.set(x, "beforeRequest", js.undefined)
      
      @scala.inline
      def setCa(value: String | Buffer | (js.Array[Buffer | String])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: (Buffer | String)*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCert(value: String | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCheckAddress(value: (/* ip */ String, /* family */ Double | String) => Boolean): Self = StObject.set(x, "checkAddress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCheckAddressUndefined: Self = StObject.set(x, "checkAddress", js.undefined)
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setConsumeWriteStream(value: Boolean): Self = StObject.set(x, "consumeWriteStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumeWriteStreamUndefined: Self = StObject.set(x, "consumeWriteStream", js.undefined)
      
      @scala.inline
      def setContent(value: String | Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataAsQueryString(value: Boolean): Self = StObject.set(x, "dataAsQueryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataAsQueryStringUndefined: Self = StObject.set(x, "dataAsQueryString", js.undefined)
      
      @scala.inline
      def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDigestAuth(value: String): Self = StObject.set(x, "digestAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigestAuthUndefined: Self = StObject.set(x, "digestAuth", js.undefined)
      
      @scala.inline
      def setEnableProxy(value: Boolean): Self = StObject.set(x, "enableProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableProxyUndefined: Self = StObject.set(x, "enableProxy", js.undefined)
      
      @scala.inline
      def setFiles(value: (js.Array[Readable | Buffer | String]) | js.Object | Readable | Buffer | String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: (Readable | Buffer | String)*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setFixJSONCtlChars(value: Boolean): Self = StObject.set(x, "fixJSONCtlChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixJSONCtlCharsUndefined: Self = StObject.set(x, "fixJSONCtlChars", js.undefined)
      
      @scala.inline
      def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      @scala.inline
      def setFormatRedirectUrl(value: (/* a */ js.Any, /* b */ js.Any) => Unit): Self = StObject.set(x, "formatRedirectUrl", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatRedirectUrlUndefined: Self = StObject.set(x, "formatRedirectUrl", js.undefined)
      
      @scala.inline
      def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHttpsAgent(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
      
      @scala.inline
      def setKeepHeaderCase(value: Boolean): Self = StObject.set(x, "keepHeaderCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepHeaderCaseUndefined: Self = StObject.set(x, "keepHeaderCase", js.undefined)
      
      @scala.inline
      def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLookup(
        value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setNestedQuerystring(value: Boolean): Self = StObject.set(x, "nestedQuerystring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedQuerystringUndefined: Self = StObject.set(x, "nestedQuerystring", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPfx(value: String | Buffer): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setProxy(value: String | StringDictionary[js.Any]): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      @scala.inline
      def setStream(value: Readable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setStreaming(value: Boolean): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double | js.Array[Double]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTimeoutVarargs(value: Double*): Self = StObject.set(x, "timeout", js.Array(value :_*))
      
      @scala.inline
      def setTiming(value: Boolean): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
      
      @scala.inline
      def setType(value: HttpMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWriteStream(value: Writable): Self = StObject.set(x, "writeStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteStreamUndefined: Self = StObject.set(x, "writeStream", js.undefined)
    }
  }
  
  @js.native
  trait RequestOptions2 extends RequestOptions {
    
    var isRetry: js.UndefOr[js.Function1[/* res */ HttpClientResponse[_], Boolean]] = js.native
    
    var retry: js.UndefOr[Double] = js.native
    
    var retryDelay: js.UndefOr[Double] = js.native
  }
  object RequestOptions2 {
    
    @scala.inline
    def apply(): RequestOptions2 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions2]
    }
    
    @scala.inline
    implicit class RequestOptions2MutableBuilder[Self <: RequestOptions2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsRetry(value: /* res */ HttpClientResponse[_] => Boolean): Self = StObject.set(x, "isRetry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsRetryUndefined: Self = StObject.set(x, "isRetry", js.undefined)
      
      @scala.inline
      def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    }
  }
}
