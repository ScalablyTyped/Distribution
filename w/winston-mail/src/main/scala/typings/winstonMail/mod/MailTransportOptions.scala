package typings.winstonMail.mod

import typings.winstonMail.AnonCa
import typings.winstonMail.AnonCiphers
import typings.winstonMail.AnonLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailTransportOptions extends js.Object {
  var authentication: js.UndefOr[js.Array[String]] = js.undefined
  var filter: js.UndefOr[js.Function1[/* obj */ AnonLevel, Boolean]] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* obj */ AnonLevel, String]] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var handleExceptions: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var ssl: js.UndefOr[Boolean | AnonCa] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var tls: js.UndefOr[Boolean | AnonCiphers] = js.undefined
  var to: String
  var unique: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object MailTransportOptions {
  @scala.inline
  def apply(
    to: String,
    authentication: js.Array[String] = null,
    filter: /* obj */ AnonLevel => Boolean = null,
    formatter: /* obj */ AnonLevel => String = null,
    from: String = null,
    handleExceptions: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    html: js.UndefOr[Boolean] = js.undefined,
    level: String = null,
    name: String = null,
    password: String = null,
    port: Int | Double = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    ssl: Boolean | AnonCa = null,
    subject: String = null,
    timeout: Int | Double = null,
    tls: Boolean | AnonCiphers = null,
    unique: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): MailTransportOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (authentication != null) __obj.updateDynamic("authentication")(authentication.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailTransportOptions]
  }
}

