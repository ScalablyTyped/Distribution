package typings
package typedDashRestDashClientLib.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestOptions extends js.Object {
  var allowRedirects: js.UndefOr[scala.Boolean] = js.undefined
  var allowRetries: js.UndefOr[scala.Boolean] = js.undefined
  var cert: js.UndefOr[ICertConfiguration] = js.undefined
  var headers: js.UndefOr[IHeaders] = js.undefined
  var ignoreSslError: js.UndefOr[scala.Boolean] = js.undefined
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  var maxRedirects: js.UndefOr[scala.Double] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var maxSockets: js.UndefOr[scala.Double] = js.undefined
  var presignedUrlPatterns: js.UndefOr[js.Array[stdLib.RegExp]] = js.undefined
  var proxy: js.UndefOr[IProxyConfiguration] = js.undefined
  var socketTimeout: js.UndefOr[scala.Double] = js.undefined
}

object IRequestOptions {
  @scala.inline
  def apply(
    allowRedirects: js.UndefOr[scala.Boolean] = js.undefined,
    allowRetries: js.UndefOr[scala.Boolean] = js.undefined,
    cert: ICertConfiguration = null,
    headers: IHeaders = null,
    ignoreSslError: js.UndefOr[scala.Boolean] = js.undefined,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    maxRedirects: scala.Int | scala.Double = null,
    maxRetries: scala.Int | scala.Double = null,
    maxSockets: scala.Int | scala.Double = null,
    presignedUrlPatterns: js.Array[stdLib.RegExp] = null,
    proxy: IProxyConfiguration = null,
    socketTimeout: scala.Int | scala.Double = null
  ): IRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowRedirects)) __obj.updateDynamic("allowRedirects")(allowRedirects)
    if (!js.isUndefined(allowRetries)) __obj.updateDynamic("allowRetries")(allowRetries)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(ignoreSslError)) __obj.updateDynamic("ignoreSslError")(ignoreSslError)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (presignedUrlPatterns != null) __obj.updateDynamic("presignedUrlPatterns")(presignedUrlPatterns)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (socketTimeout != null) __obj.updateDynamic("socketTimeout")(socketTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestOptions]
  }
}

