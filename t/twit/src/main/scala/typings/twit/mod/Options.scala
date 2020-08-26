package typings.twit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends ConfigKeys {
  var app_only_auth: js.UndefOr[Boolean] = js.native
  var strictSSL: js.UndefOr[Boolean] = js.native
  var timeout_ms: js.UndefOr[Double] = js.native
  var trusted_cert_fingerprints: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(consumer_key: String, consumer_secret: String): Options = {
    val __obj = js.Dynamic.literal(consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setApp_only_auth(value: Boolean): Self = this.set("app_only_auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_only_auth: Self = this.set("app_only_auth", js.undefined)
    @scala.inline
    def setStrictSSL(value: Boolean): Self = this.set("strictSSL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictSSL: Self = this.set("strictSSL", js.undefined)
    @scala.inline
    def setTimeout_ms(value: Double): Self = this.set("timeout_ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout_ms: Self = this.set("timeout_ms", js.undefined)
    @scala.inline
    def setTrusted_cert_fingerprintsVarargs(value: String*): Self = this.set("trusted_cert_fingerprints", js.Array(value :_*))
    @scala.inline
    def setTrusted_cert_fingerprints(value: js.Array[String]): Self = this.set("trusted_cert_fingerprints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrusted_cert_fingerprints: Self = this.set("trusted_cert_fingerprints", js.undefined)
  }
  
}

