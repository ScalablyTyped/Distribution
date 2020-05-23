package typings.wreck.anon

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.ClientRequest
import typings.wreck.wreckBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined wreck.wreck.RequestOptions & {  payload ? :any} */
trait RequestOptionspayloadany extends js.Object {
  var agent: js.UndefOr[Http | `false`] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var beforeRedirect: js.UndefOr[
    js.Function6[
      /* redirectMethod */ String, 
      /* statusCode */ Double, 
      /* location */ String, 
      /* resHeaders */ StringDictionary[js.Any], 
      /* redirectOptions */ js.Any, 
      /* next */ js.Function0[js.Object], 
      Unit
    ]
  ] = js.undefined
  var ciphers: js.UndefOr[String] = js.undefined
  var downstreamRes: js.UndefOr[js.Any] = js.undefined
  var events: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var maxBytes: js.UndefOr[Double] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
  var redirect303: js.UndefOr[Boolean] = js.undefined
  var redirected: js.UndefOr[
    js.Function3[/* statusCode */ Double, /* location */ String, /* req */ ClientRequest, Unit]
  ] = js.undefined
  var redirects: js.UndefOr[Double] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  var secureProtocol: js.UndefOr[String] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object RequestOptionspayloadany {
  @scala.inline
  def apply(
    agent: Http | `false` = null,
    baseUrl: String = null,
    beforeRedirect: (/* redirectMethod */ String, /* statusCode */ Double, /* location */ String, /* resHeaders */ StringDictionary[js.Any], /* redirectOptions */ js.Any, /* next */ js.Function0[js.Object]) => Unit = null,
    ciphers: String = null,
    downstreamRes: js.Any = null,
    events: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[js.Any] = null,
    maxBytes: js.UndefOr[Double] = js.undefined,
    payload: js.Any = null,
    redirect303: js.UndefOr[Boolean] = js.undefined,
    redirected: (/* statusCode */ Double, /* location */ String, /* req */ ClientRequest) => Unit = null,
    redirects: js.UndefOr[Double] = js.undefined,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    secureProtocol: String = null,
    socketPath: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): RequestOptionspayloadany = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (beforeRedirect != null) __obj.updateDynamic("beforeRedirect")(js.Any.fromFunction6(beforeRedirect))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (downstreamRes != null) __obj.updateDynamic("downstreamRes")(downstreamRes.asInstanceOf[js.Any])
    if (!js.isUndefined(events)) __obj.updateDynamic("events")(events.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBytes)) __obj.updateDynamic("maxBytes")(maxBytes.get.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(redirect303)) __obj.updateDynamic("redirect303")(redirect303.get.asInstanceOf[js.Any])
    if (redirected != null) __obj.updateDynamic("redirected")(js.Any.fromFunction3(redirected))
    if (!js.isUndefined(redirects)) __obj.updateDynamic("redirects")(redirects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.get.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptionspayloadany]
  }
}

