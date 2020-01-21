package typings.web3CoreHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpProviderOptions extends js.Object {
  var headers: js.UndefOr[js.Array[HttpHeader]] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object HttpProviderOptions {
  @scala.inline
  def apply(
    headers: js.Array[HttpHeader] = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): HttpProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProviderOptions]
  }
}

