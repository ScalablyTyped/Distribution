package typings.typedRestClient.interfacesMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestOptions extends js.Object {
  var allowRedirectDowngrade: js.UndefOr[Boolean] = js.undefined
  var allowRedirects: js.UndefOr[Boolean] = js.undefined
  var allowRetries: js.UndefOr[Boolean] = js.undefined
  var cert: js.UndefOr[ICertConfiguration] = js.undefined
  var headers: js.UndefOr[IHeaders] = js.undefined
  var ignoreSslError: js.UndefOr[Boolean] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var maxRedirects: js.UndefOr[Double] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var maxSockets: js.UndefOr[Double] = js.undefined
  var presignedUrlPatterns: js.UndefOr[js.Array[RegExp]] = js.undefined
  var proxy: js.UndefOr[IProxyConfiguration] = js.undefined
  var socketTimeout: js.UndefOr[Double] = js.undefined
}

object IRequestOptions {
  @scala.inline
  def apply(
    allowRedirectDowngrade: js.UndefOr[Boolean] = js.undefined,
    allowRedirects: js.UndefOr[Boolean] = js.undefined,
    allowRetries: js.UndefOr[Boolean] = js.undefined,
    cert: ICertConfiguration = null,
    headers: IHeaders = null,
    ignoreSslError: js.UndefOr[Boolean] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    maxRedirects: Int | Double = null,
    maxRetries: Int | Double = null,
    maxSockets: Int | Double = null,
    presignedUrlPatterns: js.Array[RegExp] = null,
    proxy: IProxyConfiguration = null,
    socketTimeout: Int | Double = null
  ): IRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowRedirectDowngrade)) __obj.updateDynamic("allowRedirectDowngrade")(allowRedirectDowngrade.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRedirects)) __obj.updateDynamic("allowRedirects")(allowRedirects.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRetries)) __obj.updateDynamic("allowRetries")(allowRetries.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSslError)) __obj.updateDynamic("ignoreSslError")(ignoreSslError.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (presignedUrlPatterns != null) __obj.updateDynamic("presignedUrlPatterns")(presignedUrlPatterns.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (socketTimeout != null) __obj.updateDynamic("socketTimeout")(socketTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestOptions]
  }
}

