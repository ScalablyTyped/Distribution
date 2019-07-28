package typings.urllib.urllibMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.netMod.LookupFunction
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /** HTTP Agent object.Set false if you does not use agent. */
  var agent: js.UndefOr[Agent] = js.undefined
  /** username:password used in HTTP Basic Authorization. */
  var auth: js.UndefOr[String] = js.undefined
  /** Before request hook, you can change every thing here. */
  var beforeRequest: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /**
    * An array of strings or Buffers of trusted certificates.
    * If this is omitted several well known "root" CAs will be used, like VeriSign.
    * These are used to authorize connections.
    * Notes: This is necessary only if the server uses the self - signed certificate
    */
  var ca: js.UndefOr[String | Buffer | (js.Array[Buffer | String])] = js.undefined
  /**
    * A string or Buffer containing the certificate key of the client in PEM format.
    * Notes: This is necessary only if using the client certificate authentication
    */
  var cert: js.UndefOr[String | Buffer] = js.undefined
  /**
    * check request address to protect from SSRF and similar attacks.
    * It receive two arguments(ip and family) and should return true or false to identified the address is legal or not.
    * It rely on lookup and have the same version requirement.
    */
  var checkAddress: js.UndefOr[js.Function2[/* ip */ String, /* family */ Double | String, Boolean]] = js.undefined
  /** A string describing the ciphers to use or exclude. */
  var ciphers: js.UndefOr[String] = js.undefined
  /** consume the writeStream, invoke the callback after writeStream close. */
  var consumeWriteStream: js.UndefOr[Boolean] = js.undefined
  /** Manually set the content of payload. If set, data will be ignored. */
  var content: js.UndefOr[String | Buffer] = js.undefined
  /** Type of request data.Could be json.If it's json, will auto set Content-Type: application/json header. */
  var contentType: js.UndefOr[String] = js.undefined
  /** Data to be sent. Will be stringify automatically. */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Force convert data to query string. */
  var dataAsQueryString: js.UndefOr[Boolean] = js.undefined
  /**
    * Type of response data. Could be text or json.
    * If it's text, the callbacked data would be a String.
    * If it's json, the data of callback would be a parsed JSON Object
    * and will auto set Accept: application/json header. Default callbacked data would be a Buffer.
    */
  var dataType: js.UndefOr[String] = js.undefined
  /** username:password used in HTTP Digest Authorization. */
  var digestAuth: js.UndefOr[String] = js.undefined
  /** Enable proxy request, default is false. */
  var enableProxy: js.UndefOr[Boolean] = js.undefined
  /** Fix the control characters (U+0000 through U+001F) before JSON parse response. Default is false. */
  var fixJSONCtlChars: js.UndefOr[Boolean] = js.undefined
  /** follow HTTP 3xx responses as redirects. defaults to false. */
  var followRedirect: js.UndefOr[Boolean] = js.undefined
  /** Format the redirect url by your self. Default is url.resolve(from, to). */
  var formatRedirectUrl: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Unit]] = js.undefined
  /** Accept gzip response content and auto decode it, default is false. */
  var gzip: js.UndefOr[Boolean] = js.undefined
  /** Request headers. */
  var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
  /** HTTPS Agent object. Set false if you does not use agent. */
  var httpsAgent: js.UndefOr[typings.node.httpsMod.Agent] = js.undefined
  /**
    * A string or Buffer containing the private key of the client in PEM format.
    * Notes: This is necessary only if using the client certificate authentication
    */
  var key: js.UndefOr[String | Buffer] = js.undefined
  /**
    * Custom DNS lookup function, default is dns.lookup.
    * Require node >= 4.0.0(for http protocol) and node >=8(for https protocol)
    */
  var lookup: js.UndefOr[LookupFunction] = js.undefined
  /** The maximum number of redirects to follow, defaults to 10. */
  var maxRedirects: js.UndefOr[Double] = js.undefined
  /** Request method, defaults to GET. Could be GET, POST, DELETE or PUT. Alias 'type'. */
  var method: js.UndefOr[HttpMethod] = js.undefined
  /**
    * urllib default use querystring to stringify form data which don't support nested object,
    * will use qs instead of querystring to support nested object by set this option to true.
    */
  var nestedQuerystring: js.UndefOr[Boolean] = js.undefined
  /** A string of passphrase for the private key or pfx. */
  var passphrase: js.UndefOr[String] = js.undefined
  /** A string or Buffer containing the private key, certificate and CA certs of the server in PFX or PKCS12 format. */
  var pfx: js.UndefOr[String | Buffer] = js.undefined
  /** proxy agent uri or options, default is null. */
  var proxy: js.UndefOr[String | StringDictionary[js.Any]] = js.undefined
  /**
    * If true, the server certificate is verified against the list of supplied CAs.
    * An 'error' event is emitted if verification fails.Default: true.
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  /** The SSL method to use, e.g.SSLv3_method to force SSL version 3. */
  var secureProtocol: js.UndefOr[String] = js.undefined
  /** Stream to be pipe to the remote.If set, data and content will be ignored. */
  var stream: js.UndefOr[Readable] = js.undefined
  /** let you get the res object when request connected, default false. alias customResponse */
  var streaming: js.UndefOr[Boolean] = js.undefined
  /**
    * Request timeout in milliseconds for connecting phase and response receiving phase.
    * Defaults to exports.
    * TIMEOUT, both are 5s.You can use timeout: 5000 to tell urllib use same timeout on two phase or set them seperately such as
    * timeout: [3000, 5000], which will set connecting timeout to 3s and response 5s.
    */
  var timeout: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /** Enable timing or not, default is false. */
  var timing: js.UndefOr[Boolean] = js.undefined
  /** Alias method  */
  var `type`: js.UndefOr[HttpMethod] = js.undefined
  /**
    * A writable stream to be piped by the response stream.
    * Responding data will be write to this stream and callback
    * will be called with data set null after finished writing.
    */
  var writeStream: js.UndefOr[Writable] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    agent: Agent = null,
    auth: String = null,
    beforeRequest: /* repeated */ js.Any => Unit = null,
    ca: String | Buffer | (js.Array[Buffer | String]) = null,
    cert: String | Buffer = null,
    checkAddress: (/* ip */ String, /* family */ Double | String) => Boolean = null,
    ciphers: String = null,
    consumeWriteStream: js.UndefOr[Boolean] = js.undefined,
    content: String | Buffer = null,
    contentType: String = null,
    data: js.Any = null,
    dataAsQueryString: js.UndefOr[Boolean] = js.undefined,
    dataType: String = null,
    digestAuth: String = null,
    enableProxy: js.UndefOr[Boolean] = js.undefined,
    fixJSONCtlChars: js.UndefOr[Boolean] = js.undefined,
    followRedirect: js.UndefOr[Boolean] = js.undefined,
    formatRedirectUrl: (/* a */ js.Any, /* b */ js.Any) => Unit = null,
    gzip: js.UndefOr[Boolean] = js.undefined,
    headers: IncomingHttpHeaders = null,
    httpsAgent: typings.node.httpsMod.Agent = null,
    key: String | Buffer = null,
    lookup: LookupFunction = null,
    maxRedirects: Int | Double = null,
    method: HttpMethod = null,
    nestedQuerystring: js.UndefOr[Boolean] = js.undefined,
    passphrase: String = null,
    pfx: String | Buffer = null,
    proxy: String | StringDictionary[js.Any] = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    secureProtocol: String = null,
    stream: Readable = null,
    streaming: js.UndefOr[Boolean] = js.undefined,
    timeout: Double | js.Array[Double] = null,
    timing: js.UndefOr[Boolean] = js.undefined,
    `type`: HttpMethod = null,
    writeStream: Writable = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (beforeRequest != null) __obj.updateDynamic("beforeRequest")(js.Any.fromFunction1(beforeRequest))
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkAddress != null) __obj.updateDynamic("checkAddress")(js.Any.fromFunction2(checkAddress))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (!js.isUndefined(consumeWriteStream)) __obj.updateDynamic("consumeWriteStream")(consumeWriteStream)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(dataAsQueryString)) __obj.updateDynamic("dataAsQueryString")(dataAsQueryString)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (digestAuth != null) __obj.updateDynamic("digestAuth")(digestAuth)
    if (!js.isUndefined(enableProxy)) __obj.updateDynamic("enableProxy")(enableProxy)
    if (!js.isUndefined(fixJSONCtlChars)) __obj.updateDynamic("fixJSONCtlChars")(fixJSONCtlChars)
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect)
    if (formatRedirectUrl != null) __obj.updateDynamic("formatRedirectUrl")(js.Any.fromFunction2(formatRedirectUrl))
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (httpsAgent != null) __obj.updateDynamic("httpsAgent")(httpsAgent)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup)
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(nestedQuerystring)) __obj.updateDynamic("nestedQuerystring")(nestedQuerystring)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(timing)) __obj.updateDynamic("timing")(timing)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (writeStream != null) __obj.updateDynamic("writeStream")(writeStream)
    __obj.asInstanceOf[RequestOptions]
  }
}

