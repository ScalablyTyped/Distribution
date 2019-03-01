package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Variant of TS 2.2 {@link RequestInit} that permits a
  * {@link PasswordCredential} to be used in the {@code credentials} property.
  * All other properties are identical to {@link RequestInit}.
  */
trait CMRequestInit extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var cache: js.UndefOr[java.lang.String] = js.undefined
  var credentials: js.UndefOr[PasswordCredential | java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var integrity: js.UndefOr[java.lang.String] = js.undefined
  var keepalive: js.UndefOr[scala.Boolean] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var redirect: js.UndefOr[java.lang.String] = js.undefined
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  var referrerPolicy: js.UndefOr[java.lang.String] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

object CMRequestInit {
  @scala.inline
  def apply(
    body: js.Any = null,
    cache: java.lang.String = null,
    credentials: PasswordCredential | java.lang.String = null,
    headers: js.Any = null,
    integrity: java.lang.String = null,
    keepalive: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    mode: java.lang.String = null,
    redirect: java.lang.String = null,
    referrer: java.lang.String = null,
    referrerPolicy: java.lang.String = null,
    window: js.Any = null
  ): CMRequestInit = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[CMRequestInit]
  }
}

