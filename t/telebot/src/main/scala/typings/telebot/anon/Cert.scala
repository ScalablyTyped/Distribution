package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cert extends js.Object {
   // Optional. Private key for server.
  var cert: js.UndefOr[String] = js.native
   // HTTPS url to send updates to.
  var host: js.UndefOr[String] = js.native
  // Optional. Use webhook instead of polling.
  var key: js.UndefOr[String] = js.native
   // Server port.
  var maxConnections: js.UndefOr[Double] = js.native
   // Webhook server host.
  var port: js.UndefOr[Double] = js.native
   // Optional. key.
  var url: js.UndefOr[String] = js.native
}

object Cert {
  @scala.inline
  def apply(): Cert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cert]
  }
  @scala.inline
  implicit class CertOps[Self <: Cert] (val x: Self) extends AnyVal {
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
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMaxConnections(value: Double): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConnections: Self = this.set("maxConnections", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

