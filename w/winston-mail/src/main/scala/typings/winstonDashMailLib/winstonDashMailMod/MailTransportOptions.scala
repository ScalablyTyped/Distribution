package typings
package winstonDashMailLib.winstonDashMailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailTransportOptions extends js.Object {
  var authentication: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var filter: js.UndefOr[js.Function1[/* obj */ winstonDashMailLib.Anon_Level, scala.Boolean]] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* obj */ winstonDashMailLib.Anon_Level, java.lang.String]] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var handleExceptions: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var ssl: js.UndefOr[scala.Boolean | winstonDashMailLib.Anon_Ca] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var tls: js.UndefOr[scala.Boolean | winstonDashMailLib.Anon_Ciphers] = js.undefined
  var to: java.lang.String
  var unique: js.UndefOr[scala.Boolean] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object MailTransportOptions {
  @scala.inline
  def apply(
    to: java.lang.String,
    authentication: js.Array[java.lang.String] = null,
    filter: js.Function1[/* obj */ winstonDashMailLib.Anon_Level, scala.Boolean] = null,
    formatter: js.Function1[/* obj */ winstonDashMailLib.Anon_Level, java.lang.String] = null,
    from: java.lang.String = null,
    handleExceptions: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    level: java.lang.String = null,
    name: java.lang.String = null,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    ssl: scala.Boolean | winstonDashMailLib.Anon_Ca = null,
    subject: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    tls: scala.Boolean | winstonDashMailLib.Anon_Ciphers = null,
    unique: js.UndefOr[scala.Boolean] = js.undefined,
    username: java.lang.String = null
  ): MailTransportOptions = {
    val __obj = js.Dynamic.literal(to = to)
    if (authentication != null) __obj.updateDynamic("authentication")(authentication)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (from != null) __obj.updateDynamic("from")(from)
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (level != null) __obj.updateDynamic("level")(level)
    if (name != null) __obj.updateDynamic("name")(name)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[MailTransportOptions]
  }
}

