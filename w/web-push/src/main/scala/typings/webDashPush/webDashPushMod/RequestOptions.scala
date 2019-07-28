package typings.webDashPush.webDashPushMod

import typings.webDashPush.Anon_PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var TTL: js.UndefOr[Double] = js.undefined
   // a value in seconds that describes how long a push message is retained by the push service (by default, four weeks).
  var contentEncoding: js.UndefOr[ContentEncoding] = js.undefined
  var gcmAPIKey: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
   // the type of push encoding to use (e.g. 'aesgcm', by default, or 'aes128gcm').
  var proxy: js.UndefOr[String] = js.undefined
   // can be a GCM API key to be used for this request and this request only. This overrides any API key set via setGCMAPIKey().
  var vapidDetails: js.UndefOr[Anon_PrivateKey] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    TTL: Int | Double = null,
    contentEncoding: ContentEncoding = null,
    gcmAPIKey: String = null,
    headers: Headers = null,
    proxy: String = null,
    vapidDetails: Anon_PrivateKey = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (TTL != null) __obj.updateDynamic("TTL")(TTL.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding)
    if (gcmAPIKey != null) __obj.updateDynamic("gcmAPIKey")(gcmAPIKey)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (vapidDetails != null) __obj.updateDynamic("vapidDetails")(vapidDetails)
    __obj.asInstanceOf[RequestOptions]
  }
}

