package typings.vsoNodeApi.vsoBaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestOptions extends js.Object {
  var cert: js.UndefOr[ICertConfiguration] = js.undefined
  var ignoreSslError: js.UndefOr[Boolean] = js.undefined
  var proxy: js.UndefOr[IProxyConfiguration] = js.undefined
  var socketTimeout: js.UndefOr[Double] = js.undefined
}

object IRequestOptions {
  @scala.inline
  def apply(
    cert: ICertConfiguration = null,
    ignoreSslError: js.UndefOr[Boolean] = js.undefined,
    proxy: IProxyConfiguration = null,
    socketTimeout: Int | Double = null
  ): IRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSslError)) __obj.updateDynamic("ignoreSslError")(ignoreSslError.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (socketTimeout != null) __obj.updateDynamic("socketTimeout")(socketTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestOptions]
  }
}

