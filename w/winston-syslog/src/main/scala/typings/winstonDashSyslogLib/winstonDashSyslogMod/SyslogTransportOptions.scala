package typings
package winstonDashSyslogLib.winstonDashSyslogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyslogTransportOptions
  extends winstonDashTransportLib.winstonDashTransportMod.TransportStreamOptions {
  var app_name: js.UndefOr[java.lang.String] = js.undefined
  var eol: js.UndefOr[java.lang.String] = js.undefined
  var facility: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var localhost: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var pid: js.UndefOr[scala.Double] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SyslogTransportOptions {
  @scala.inline
  def apply(
    app_name: java.lang.String = null,
    close: () => scala.Unit = null,
    eol: java.lang.String = null,
    facility: java.lang.String = null,
    format: logformLib.logformMod.Format = null,
    handleExceptions: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    level: java.lang.String = null,
    localhost: java.lang.String = null,
    log: (/* info */ js.Any, /* next */ js.Function0[scala.Unit]) => _ = null,
    logv: (/* info */ js.Any, /* next */ js.Function0[scala.Unit]) => _ = null,
    path: java.lang.String = null,
    pid: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    protocol: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): SyslogTransportOptions = {
    val __obj = js.Dynamic.literal()
    if (app_name != null) __obj.updateDynamic("app_name")(app_name)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (facility != null) __obj.updateDynamic("facility")(facility)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions)
    if (host != null) __obj.updateDynamic("host")(host)
    if (level != null) __obj.updateDynamic("level")(level)
    if (localhost != null) __obj.updateDynamic("localhost")(localhost)
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (logv != null) __obj.updateDynamic("logv")(js.Any.fromFunction2(logv))
    if (path != null) __obj.updateDynamic("path")(path)
    if (pid != null) __obj.updateDynamic("pid")(pid.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SyslogTransportOptions]
  }
}

