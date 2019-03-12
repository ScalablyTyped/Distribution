package typings
package winstonLib.libWinstonTransportsMod.winstonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleTransportOptions
  extends winstonDashTransportLib.winstonDashTransportMod.TransportStreamNs.TransportStreamOptions {
  var consoleWarnLevels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var debugStdout: js.UndefOr[scala.Boolean] = js.undefined
  var eol: js.UndefOr[java.lang.String] = js.undefined
  var stderrLevels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ConsoleTransportOptions {
  @scala.inline
  def apply(
    close: () => scala.Unit = null,
    consoleWarnLevels: js.Array[java.lang.String] = null,
    debugStdout: js.UndefOr[scala.Boolean] = js.undefined,
    eol: java.lang.String = null,
    format: logformLib.logformMod.Format = null,
    handleExceptions: js.UndefOr[scala.Boolean] = js.undefined,
    level: java.lang.String = null,
    log: (/* info */ js.Any, /* next */ js.Function0[scala.Unit]) => _ = null,
    logv: (/* info */ js.Any, /* next */ js.Function0[scala.Unit]) => _ = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    stderrLevels: js.Array[java.lang.String] = null
  ): ConsoleTransportOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (consoleWarnLevels != null) __obj.updateDynamic("consoleWarnLevels")(consoleWarnLevels)
    if (!js.isUndefined(debugStdout)) __obj.updateDynamic("debugStdout")(debugStdout)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions)
    if (level != null) __obj.updateDynamic("level")(level)
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (logv != null) __obj.updateDynamic("logv")(js.Any.fromFunction2(logv))
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (stderrLevels != null) __obj.updateDynamic("stderrLevels")(stderrLevels)
    __obj.asInstanceOf[ConsoleTransportOptions]
  }
}

