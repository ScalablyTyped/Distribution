package typings
package winstonLib.libWinstonTransportsMod.winstonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamTransportOptions
  extends winstonDashTransportLib.winstonDashTransportMod.TransportStreamNs.TransportStreamOptions {
  var eol: js.UndefOr[java.lang.String] = js.undefined
  var stream: nodeLib.NodeJSNs.WritableStream
}

object StreamTransportOptions {
  @scala.inline
  def apply(
    stream: nodeLib.NodeJSNs.WritableStream,
    close: js.Function0[scala.Unit] = null,
    eol: java.lang.String = null,
    format: logformLib.logformMod.Format = null,
    handleExceptions: js.UndefOr[scala.Boolean] = js.undefined,
    level: java.lang.String = null,
    log: js.Function2[/* info */ js.Any, /* next */ js.Function0[scala.Unit], _] = null,
    logv: js.Function2[/* info */ js.Any, /* next */ js.Function0[scala.Unit], _] = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): StreamTransportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stream")(stream)
    if (close != null) __obj.updateDynamic("close")(close)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions)
    if (level != null) __obj.updateDynamic("level")(level)
    if (log != null) __obj.updateDynamic("log")(log)
    if (logv != null) __obj.updateDynamic("logv")(logv)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[StreamTransportOptions]
  }
}

