package typings.twit.twitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends ConfigKeys {
  var app_only_auth: js.UndefOr[Boolean] = js.undefined
  var strictSSL: js.UndefOr[Boolean] = js.undefined
  var timeout_ms: js.UndefOr[Double] = js.undefined
  var trusted_cert_fingerprints: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    consumer_key: String,
    consumer_secret: String,
    access_token: String = null,
    access_token_secret: String = null,
    app_only_auth: js.UndefOr[Boolean] = js.undefined,
    strictSSL: js.UndefOr[Boolean] = js.undefined,
    timeout_ms: Int | Double = null,
    trusted_cert_fingerprints: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal(consumer_key = consumer_key, consumer_secret = consumer_secret)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (access_token_secret != null) __obj.updateDynamic("access_token_secret")(access_token_secret)
    if (!js.isUndefined(app_only_auth)) __obj.updateDynamic("app_only_auth")(app_only_auth)
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL)
    if (timeout_ms != null) __obj.updateDynamic("timeout_ms")(timeout_ms.asInstanceOf[js.Any])
    if (trusted_cert_fingerprints != null) __obj.updateDynamic("trusted_cert_fingerprints")(trusted_cert_fingerprints)
    __obj.asInstanceOf[Options]
  }
}

