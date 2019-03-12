package typings
package urllibLib.urllibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /** HTTP Agent object.Set false if you does not use agent. */
  var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  /** username:password used in HTTP Basic Authorization. */
  var auth: js.UndefOr[java.lang.String] = js.undefined
  /** Before request hook, you can change every thing here. */
  var beforeRequest: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  /**
    * An array of strings or Buffers of trusted certificates.
    * If this is omitted several well known "root" CAs will be used, like VeriSign.
    * These are used to authorize connections.
    * Notes: This is necessary only if the server uses the self - signed certificate
    */
  var ca: js.UndefOr[
    java.lang.String | nodeLib.Buffer | js.Array[java.lang.String] | js.Array[nodeLib.Buffer]
  ] = js.undefined
  /**
    * A string or Buffer containing the certificate key of the client in PEM format.
    * Notes: This is necessary only if using the client certificate authentication
    */
  var cert: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /**
    * check request address to protect from SSRF and similar attacks.
    * It receive two arguments(ip and family) and should return true or false to identified the address is legal or not.
    * It rely on lookup and have the same version requirement.
    */
  var checkAddress: js.UndefOr[
    js.Function2[
      /* ip */ java.lang.String, 
      /* family */ scala.Double | java.lang.String, 
      scala.Boolean
    ]
  ] = js.undefined
  /** A string describing the ciphers to use or exclude. */
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  /** consume the writeStream, invoke the callback after writeStream close. */
  var consumeWriteStream: js.UndefOr[scala.Boolean] = js.undefined
  /** Manually set the content of payload. If set, data will be ignored. */
  var content: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /** Type of request data.Could be json.If it's json, will auto set Content-Type: application/json header. */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /** Data to be sent. Will be stringify automatically. */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Force convert data to query string. */
  var dataAsQueryString: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type of response data. Could be text or json.
    * If it's text, the callbacked data would be a String.
    * If it's json, the data of callback would be a parsed JSON Object
    * and will auto set Accept: application/json header. Default callbacked data would be a Buffer.
    */
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  /** username:password used in HTTP Digest Authorization. */
  var digestAuth: js.UndefOr[java.lang.String] = js.undefined
  /** Enable proxy request, default is false. */
  var enableProxy: js.UndefOr[scala.Boolean] = js.undefined
  /** Fix the control characters (U+0000 through U+001F) before JSON parse response. Default is false. */
  var fixJSONCtlChars: js.UndefOr[scala.Boolean] = js.undefined
  /** follow HTTP 3xx responses as redirects. defaults to false. */
  var followRedirect: js.UndefOr[scala.Boolean] = js.undefined
  /** Format the redirect url by your self. Default is url.resolve(from, to). */
  var formatRedirectUrl: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Unit]] = js.undefined
  /** Accept gzip response content and auto decode it, default is false. */
  var gzip: js.UndefOr[scala.Boolean] = js.undefined
  /** Request headers. */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /** HTTPS Agent object. Set false if you does not use agent. */
  var httpsAgent: js.UndefOr[nodeLib.httpsMod.Agent] = js.undefined
  /**
    * A string or Buffer containing the private key of the client in PEM format.
    * Notes: This is necessary only if using the client certificate authentication
    */
  var key: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /**
    * Custom DNS lookup function, default is dns.lookup.
    * Require node >= 4.0.0(for http protocol) and node >=8(for https protocol)
    */
  var lookup: js.UndefOr[nodeLib.netMod.LookupFunction] = js.undefined
  /** The maximum number of redirects to follow, defaults to 10. */
  var maxRedirects: js.UndefOr[scala.Double] = js.undefined
  /** Request method, defaults to GET. Could be GET, POST, DELETE or PUT. Alias 'type'. */
  var method: js.UndefOr[
    urllibLib.urllibLibStrings.GET | urllibLib.urllibLibStrings.POST | urllibLib.urllibLibStrings.DELETE | urllibLib.urllibLibStrings.PUT
  ] = js.undefined
  /**
    * urllib default use querystring to stringify form data which don't support nested object,
    * will use qs instead of querystring to support nested object by set this option to true.
    */
  var nestedQuerystring: js.UndefOr[scala.Boolean] = js.undefined
  /** A string of passphrase for the private key or pfx. */
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  /** A string or Buffer containing the private key, certificate and CA certs of the server in PFX or PKCS12 format. */
  var pfx: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /** proxy agent uri or options, default is null. */
  var proxy: js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * If true, the server certificate is verified against the list of supplied CAs.
    * An 'error' event is emitted if verification fails.Default: true.
    */
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  /** The SSL method to use, e.g.SSLv3_method to force SSL version 3. */
  var secureProtocol: js.UndefOr[java.lang.String] = js.undefined
  /** Stream to be pipe to the remote.If set, data and content will be ignored. */
  var stream: js.UndefOr[nodeLib.streamMod.Readable] = js.undefined
  /** let you get the res object when request connected, default false. alias customResponse */
  var streaming: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Request timeout in milliseconds for connecting phase and response receiving phase.
    * Defaults to exports.
    * TIMEOUT, both are 5s.You can use timeout: 5000 to tell urllib use same timeout on two phase or set them seperately such as
    * timeout: [3000, 5000], which will set connecting timeout to 3s and response 5s.
    */
  var timeout: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  /** Enable timing or not, default is false. */
  var timing: js.UndefOr[scala.Boolean] = js.undefined
  /** Alias method  */
  var `type`: js.UndefOr[
    urllibLib.urllibLibStrings.GET | urllibLib.urllibLibStrings.POST | urllibLib.urllibLibStrings.DELETE | urllibLib.urllibLibStrings.PUT
  ] = js.undefined
  /**
    * A writable stream to be piped by the response stream.
    * Responding data will be write to this stream and callback
    * will be called with data set null after finished writing.
    */
  var writeStream: js.UndefOr[nodeLib.streamMod.Writable] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    agent: nodeLib.httpMod.Agent = null,
    auth: java.lang.String = null,
    beforeRequest: /* repeated */ js.Any => scala.Unit = null,
    ca: java.lang.String | nodeLib.Buffer | js.Array[java.lang.String] | js.Array[nodeLib.Buffer] = null,
    cert: java.lang.String | nodeLib.Buffer = null,
    checkAddress: (/* ip */ java.lang.String, /* family */ scala.Double | java.lang.String) => scala.Boolean = null,
    ciphers: java.lang.String = null,
    consumeWriteStream: js.UndefOr[scala.Boolean] = js.undefined,
    content: java.lang.String | nodeLib.Buffer = null,
    contentType: java.lang.String = null,
    data: js.Any = null,
    dataAsQueryString: js.UndefOr[scala.Boolean] = js.undefined,
    dataType: java.lang.String = null,
    digestAuth: java.lang.String = null,
    enableProxy: js.UndefOr[scala.Boolean] = js.undefined,
    fixJSONCtlChars: js.UndefOr[scala.Boolean] = js.undefined,
    followRedirect: js.UndefOr[scala.Boolean] = js.undefined,
    formatRedirectUrl: (/* a */ js.Any, /* b */ js.Any) => scala.Unit = null,
    gzip: js.UndefOr[scala.Boolean] = js.undefined,
    headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    httpsAgent: nodeLib.httpsMod.Agent = null,
    key: java.lang.String | nodeLib.Buffer = null,
    lookup: nodeLib.netMod.LookupFunction = null,
    maxRedirects: scala.Int | scala.Double = null,
    method: urllibLib.urllibLibStrings.GET | urllibLib.urllibLibStrings.POST | urllibLib.urllibLibStrings.DELETE | urllibLib.urllibLibStrings.PUT = null,
    nestedQuerystring: js.UndefOr[scala.Boolean] = js.undefined,
    passphrase: java.lang.String = null,
    pfx: java.lang.String | nodeLib.Buffer = null,
    proxy: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    secureProtocol: java.lang.String = null,
    stream: nodeLib.streamMod.Readable = null,
    streaming: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Double | js.Array[scala.Double] = null,
    timing: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: urllibLib.urllibLibStrings.GET | urllibLib.urllibLibStrings.POST | urllibLib.urllibLibStrings.DELETE | urllibLib.urllibLibStrings.PUT = null,
    writeStream: nodeLib.streamMod.Writable = null
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
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
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
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (writeStream != null) __obj.updateDynamic("writeStream")(writeStream)
    __obj.asInstanceOf[RequestOptions]
  }
}

