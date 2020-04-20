package typings.winstonSyslog.mod

import typings.logform.mod.Format_
import typings.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyslogTransportOptions extends TransportStreamOptions {
  var app_name: js.UndefOr[String] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var facility: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var localhost: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var pid: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object SyslogTransportOptions {
  @scala.inline
  def apply(
    app_name: String = null,
    close: () => Unit = null,
    eol: String = null,
    facility: String = null,
    format: Format_ = null,
    handleExceptions: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    level: String = null,
    localhost: String = null,
    log: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    logv: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    path: String = null,
    pid: Int | Double = null,
    port: Int | Double = null,
    protocol: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): SyslogTransportOptions = {
    val __obj = js.Dynamic.literal()
    if (app_name != null) __obj.updateDynamic("app_name")(app_name.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (facility != null) __obj.updateDynamic("facility")(facility.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (localhost != null) __obj.updateDynamic("localhost")(localhost.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (logv != null) __obj.updateDynamic("logv")(js.Any.fromFunction2(logv))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pid != null) __obj.updateDynamic("pid")(pid.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyslogTransportOptions]
  }
}

