package typings.urllib.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions2 extends RequestOptions {
  var isRetry: js.UndefOr[js.Function1[/* res */ HttpClientResponse[_], Boolean]] = js.undefined
  var retry: js.UndefOr[Double] = js.undefined
  var retryDelay: js.UndefOr[Double] = js.undefined
}

object RequestOptions2 {
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
    files: (js.Array[Readable | Buffer | String]) | js.Object | Readable | Buffer | String = null,
    fixJSONCtlChars: js.UndefOr[Boolean] = js.undefined,
    followRedirect: js.UndefOr[Boolean] = js.undefined,
    formatRedirectUrl: (/* a */ js.Any, /* b */ js.Any) => Unit = null,
    gzip: js.UndefOr[Boolean] = js.undefined,
    headers: IncomingHttpHeaders = null,
    httpsAgent: typings.node.httpsMod.Agent = null,
    isRetry: /* res */ HttpClientResponse[_] => Boolean = null,
    key: String | Buffer = null,
    lookup: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit = null,
    maxRedirects: Int | Double = null,
    method: HttpMethod = null,
    nestedQuerystring: js.UndefOr[Boolean] = js.undefined,
    passphrase: String = null,
    pfx: String | Buffer = null,
    proxy: String | StringDictionary[js.Any] = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    retry: Int | Double = null,
    retryDelay: Int | Double = null,
    secureProtocol: String = null,
    stream: Readable = null,
    streaming: js.UndefOr[Boolean] = js.undefined,
    timeout: Double | js.Array[Double] = null,
    timing: js.UndefOr[Boolean] = js.undefined,
    `type`: HttpMethod = null,
    writeStream: Writable = null
  ): RequestOptions2 = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (beforeRequest != null) __obj.updateDynamic("beforeRequest")(js.Any.fromFunction1(beforeRequest))
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkAddress != null) __obj.updateDynamic("checkAddress")(js.Any.fromFunction2(checkAddress))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (!js.isUndefined(consumeWriteStream)) __obj.updateDynamic("consumeWriteStream")(consumeWriteStream.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(dataAsQueryString)) __obj.updateDynamic("dataAsQueryString")(dataAsQueryString.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (digestAuth != null) __obj.updateDynamic("digestAuth")(digestAuth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableProxy)) __obj.updateDynamic("enableProxy")(enableProxy.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(fixJSONCtlChars)) __obj.updateDynamic("fixJSONCtlChars")(fixJSONCtlChars.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect.asInstanceOf[js.Any])
    if (formatRedirectUrl != null) __obj.updateDynamic("formatRedirectUrl")(js.Any.fromFunction2(formatRedirectUrl))
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (httpsAgent != null) __obj.updateDynamic("httpsAgent")(httpsAgent.asInstanceOf[js.Any])
    if (isRetry != null) __obj.updateDynamic("isRetry")(js.Any.fromFunction1(isRetry))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(js.Any.fromFunction3(lookup))
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(nestedQuerystring)) __obj.updateDynamic("nestedQuerystring")(nestedQuerystring.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(retryDelay.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(timing)) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (writeStream != null) __obj.updateDynamic("writeStream")(writeStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions2]
  }
}

