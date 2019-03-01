package typings
package winstonLib.libWinstonTransportsMod.winstonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpTransportOptions
  extends winstonDashTransportLib.winstonDashTransportMod.TransportStreamNs.TransportStreamOptions {
  var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  var auth: js.UndefOr[winstonLib.Anon_Password] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var ssl: js.UndefOr[js.Any] = js.undefined
}

object HttpTransportOptions {
  @scala.inline
  def apply(
    agent: nodeLib.httpMod.Agent = null,
    auth: winstonLib.Anon_Password = null,
    close: js.Function0[scala.Unit] = null,
    format: logformLib.logformMod.Format = null,
    handleExceptions: js.UndefOr[scala.Boolean] = js.undefined,
    headers: js.Object = null,
    host: java.lang.String = null,
    level: java.lang.String = null,
    log: js.Function2[/* info */ js.Any, /* next */ js.Function0[scala.Unit], _] = null,
    logv: js.Function2[/* info */ js.Any, /* next */ js.Function0[scala.Unit], _] = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    ssl: js.Any = null
  ): HttpTransportOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (close != null) __obj.updateDynamic("close")(close)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (level != null) __obj.updateDynamic("level")(level)
    if (log != null) __obj.updateDynamic("log")(log)
    if (logv != null) __obj.updateDynamic("logv")(logv)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    __obj.asInstanceOf[HttpTransportOptions]
  }
}

