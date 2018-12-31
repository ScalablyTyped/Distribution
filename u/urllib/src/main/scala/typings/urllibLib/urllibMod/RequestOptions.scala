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

