package typings
package urllibLib.urllibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions2 extends RequestOptions {
  var isRetry: js.UndefOr[js.Function1[/* res */ HttpClientResponse[_], scala.Boolean]] = js.undefined
  var retry: js.UndefOr[scala.Double] = js.undefined
  var retryDelay: js.UndefOr[scala.Double] = js.undefined
}

object RequestOptions2 {
  @scala.inline
  def apply(
    agent: nodeLib.httpMod.Agent = null,
    auth: java.lang.String = null,
    beforeRequest: /* repeated */ js.Any => scala.Unit = null,
    ca: java.lang.String | nodeLib.Buffer | (js.Array[nodeLib.Buffer | java.lang.String]) = null,
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
    headers: nodeLib.httpMod.IncomingHttpHeaders = null,
    httpsAgent: nodeLib.httpsMod.Agent = null,
    isRetry: /* res */ HttpClientResponse[_] => scala.Boolean = null,
    key: java.lang.String | nodeLib.Buffer = null,
    lookup: nodeLib.netMod.LookupFunction = null,
    maxRedirects: scala.Int | scala.Double = null,
    method: HttpMethod = null,
    nestedQuerystring: js.UndefOr[scala.Boolean] = js.undefined,
    passphrase: java.lang.String = null,
    pfx: java.lang.String | nodeLib.Buffer = null,
    proxy: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    retry: scala.Int | scala.Double = null,
    retryDelay: scala.Int | scala.Double = null,
    secureProtocol: java.lang.String = null,
    stream: nodeLib.streamMod.Readable = null,
    streaming: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Double | js.Array[scala.Double] = null,
    timing: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: HttpMethod = null,
    writeStream: nodeLib.streamMod.Writable = null
  ): RequestOptions2 = {
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
    if (isRetry != null) __obj.updateDynamic("isRetry")(js.Any.fromFunction1(isRetry))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup)
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(nestedQuerystring)) __obj.updateDynamic("nestedQuerystring")(nestedQuerystring)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(retryDelay.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(timing)) __obj.updateDynamic("timing")(timing)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (writeStream != null) __obj.updateDynamic("writeStream")(writeStream)
    __obj.asInstanceOf[RequestOptions2]
  }
}

