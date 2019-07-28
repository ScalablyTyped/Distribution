package typings.winston.libWinstonTransportsMod

import typings.logform.logformMod.Format
import typings.node.httpMod.Agent
import typings.winston.Anon_Password
import typings.winstonDashTransport.winstonDashTransportMod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpTransportOptions extends TransportStreamOptions {
  var agent: js.UndefOr[Agent] = js.undefined
  var auth: js.UndefOr[Anon_Password] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var ssl: js.UndefOr[js.Any] = js.undefined
}

object HttpTransportOptions {
  @scala.inline
  def apply(
    agent: Agent = null,
    auth: Anon_Password = null,
    close: () => Unit = null,
    format: Format = null,
    handleExceptions: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    host: String = null,
    level: String = null,
    log: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    logv: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    path: String = null,
    port: Int | Double = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    ssl: js.Any = null
  ): HttpTransportOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (level != null) __obj.updateDynamic("level")(level)
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (logv != null) __obj.updateDynamic("logv")(js.Any.fromFunction2(logv))
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    __obj.asInstanceOf[HttpTransportOptions]
  }
}

