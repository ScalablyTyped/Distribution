package typings.webPush.mod

import typings.webPush.anon.PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  var TTL: js.UndefOr[Double] = js.native
   // a value in seconds that describes how long a push message is retained by the push service (by default, four weeks).
  var contentEncoding: js.UndefOr[ContentEncoding] = js.native
  var gcmAPIKey: js.UndefOr[String] = js.native
  var headers: js.UndefOr[Headers] = js.native
   // the type of push encoding to use (e.g. 'aesgcm', by default, or 'aes128gcm').
  var proxy: js.UndefOr[String] = js.native
   // can be a GCM API key to be used for this request and this request only. This overrides any API key set via setGCMAPIKey().
  var vapidDetails: js.UndefOr[PrivateKey] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTTL(value: Double): Self = this.set("TTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTTL: Self = this.set("TTL", js.undefined)
    @scala.inline
    def setContentEncoding(value: ContentEncoding): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
    @scala.inline
    def setGcmAPIKey(value: String): Self = this.set("gcmAPIKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcmAPIKey: Self = this.set("gcmAPIKey", js.undefined)
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setVapidDetails(value: PrivateKey): Self = this.set("vapidDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVapidDetails: Self = this.set("vapidDetails", js.undefined)
  }
  
}

