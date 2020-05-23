package typings.web3ProvidersHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpProviderOptions extends js.Object {
  var agent: js.UndefOr[HttpProviderAgent] = js.undefined
  var headers: js.UndefOr[js.Array[HttpHeader]] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object HttpProviderOptions {
  @scala.inline
  def apply(
    agent: HttpProviderAgent = null,
    headers: js.Array[HttpHeader] = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): HttpProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProviderOptions]
  }
}

