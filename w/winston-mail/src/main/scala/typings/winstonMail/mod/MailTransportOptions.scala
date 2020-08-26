package typings.winstonMail.mod

import typings.winstonMail.anon.Ca
import typings.winstonMail.anon.Ciphers
import typings.winstonMail.anon.Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailTransportOptions extends js.Object {
  var authentication: js.UndefOr[js.Array[String]] = js.native
  var filter: js.UndefOr[js.Function1[/* obj */ Level, Boolean]] = js.native
  var formatter: js.UndefOr[js.Function1[/* obj */ Level, String]] = js.native
  var from: js.UndefOr[String] = js.native
  var handleExceptions: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  var html: js.UndefOr[Boolean] = js.native
  var level: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var ssl: js.UndefOr[Boolean | Ca] = js.native
  var subject: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var tls: js.UndefOr[Boolean | Ciphers] = js.native
  var to: String = js.native
  var unique: js.UndefOr[Boolean] = js.native
  var username: js.UndefOr[String] = js.native
}

object MailTransportOptions {
  @scala.inline
  def apply(to: String): MailTransportOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailTransportOptions]
  }
  @scala.inline
  implicit class MailTransportOptionsOps[Self <: MailTransportOptions] (val x: Self) extends AnyVal {
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
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationVarargs(value: String*): Self = this.set("authentication", js.Array(value :_*))
    @scala.inline
    def setAuthentication(value: js.Array[String]): Self = this.set("authentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthentication: Self = this.set("authentication", js.undefined)
    @scala.inline
    def setFilter(value: /* obj */ Level => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFormatter(value: /* obj */ Level => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setHandleExceptions(value: Boolean): Self = this.set("handleExceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleExceptions: Self = this.set("handleExceptions", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSsl(value: Boolean | Ca): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTls(value: Boolean | Ciphers): Self = this.set("tls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

