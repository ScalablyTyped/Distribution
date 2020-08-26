package typings.urllib.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.netMod.LookupFunction
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
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
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgent(value: Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setBeforeRequest(value: /* repeated */ js.Any => Unit): Self = this.set("beforeRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeRequest: Self = this.set("beforeRequest", js.undefined)
    @scala.inline
    def setCaVarargs(value: (Buffer | String)*): Self = this.set("ca", js.Array(value :_*))
    @scala.inline
    def setCa(value: String | Buffer | (js.Array[Buffer | String])): Self = this.set("ca", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    @scala.inline
    def setCert(value: String | Buffer): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setCheckAddress(value: (/* ip */ String, /* family */ Double | String) => Boolean): Self = this.set("checkAddress", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCheckAddress: Self = this.set("checkAddress", js.undefined)
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    @scala.inline
    def setConsumeWriteStream(value: Boolean): Self = this.set("consumeWriteStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumeWriteStream: Self = this.set("consumeWriteStream", js.undefined)
    @scala.inline
    def setContent(value: String | Buffer): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataAsQueryString(value: Boolean): Self = this.set("dataAsQueryString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataAsQueryString: Self = this.set("dataAsQueryString", js.undefined)
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setDigestAuth(value: String): Self = this.set("digestAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigestAuth: Self = this.set("digestAuth", js.undefined)
    @scala.inline
    def setEnableProxy(value: Boolean): Self = this.set("enableProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableProxy: Self = this.set("enableProxy", js.undefined)
    @scala.inline
    def setFilesVarargs(value: (Readable | Buffer | String)*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: (js.Array[Readable | Buffer | String]) | js.Object | Readable | Buffer | String): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setFixJSONCtlChars(value: Boolean): Self = this.set("fixJSONCtlChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixJSONCtlChars: Self = this.set("fixJSONCtlChars", js.undefined)
    @scala.inline
    def setFollowRedirect(value: Boolean): Self = this.set("followRedirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowRedirect: Self = this.set("followRedirect", js.undefined)
    @scala.inline
    def setFormatRedirectUrl(value: (/* a */ js.Any, /* b */ js.Any) => Unit): Self = this.set("formatRedirectUrl", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormatRedirectUrl: Self = this.set("formatRedirectUrl", js.undefined)
    @scala.inline
    def setGzip(value: Boolean): Self = this.set("gzip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    @scala.inline
    def setHeaders(value: IncomingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHttpsAgent(value: typings.node.httpsMod.Agent): Self = this.set("httpsAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpsAgent: Self = this.set("httpsAgent", js.undefined)
    @scala.inline
    def setKeepHeaderCase(value: Boolean): Self = this.set("keepHeaderCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepHeaderCase: Self = this.set("keepHeaderCase", js.undefined)
    @scala.inline
    def setKey(value: String | Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLookup(
      value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = this.set("lookup", js.Any.fromFunction3(value))
    @scala.inline
    def deleteLookup: Self = this.set("lookup", js.undefined)
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    @scala.inline
    def setMethod(value: HttpMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setNestedQuerystring(value: Boolean): Self = this.set("nestedQuerystring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestedQuerystring: Self = this.set("nestedQuerystring", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    @scala.inline
    def setPfx(value: String | Buffer): Self = this.set("pfx", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    @scala.inline
    def setProxy(value: String | StringDictionary[js.Any]): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    @scala.inline
    def setSecureProtocol(value: String): Self = this.set("secureProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureProtocol: Self = this.set("secureProtocol", js.undefined)
    @scala.inline
    def setStream(value: Readable): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    @scala.inline
    def setStreaming(value: Boolean): Self = this.set("streaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreaming: Self = this.set("streaming", js.undefined)
    @scala.inline
    def setTimeoutVarargs(value: Double*): Self = this.set("timeout", js.Array(value :_*))
    @scala.inline
    def setTimeout(value: Double | js.Array[Double]): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTiming(value: Boolean): Self = this.set("timing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
    @scala.inline
    def setType(value: HttpMethod): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWriteStream(value: Writable): Self = this.set("writeStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteStream: Self = this.set("writeStream", js.undefined)
  }
  
}

