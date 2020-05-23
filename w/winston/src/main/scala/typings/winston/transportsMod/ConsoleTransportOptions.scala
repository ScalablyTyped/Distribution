package typings.winston.transportsMod

import typings.logform.mod.Format_
import typings.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleTransportOptions extends TransportStreamOptions {
  var consoleWarnLevels: js.UndefOr[js.Array[String]] = js.undefined
  var debugStdout: js.UndefOr[Boolean] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var stderrLevels: js.UndefOr[js.Array[String]] = js.undefined
}

object ConsoleTransportOptions {
  @scala.inline
  def apply(
    close: () => Unit = null,
    consoleWarnLevels: js.Array[String] = null,
    debugStdout: js.UndefOr[Boolean] = js.undefined,
    eol: String = null,
    format: Format_ = null,
    handleExceptions: js.UndefOr[Boolean] = js.undefined,
    level: String = null,
    log: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    logv: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    stderrLevels: js.Array[String] = null
  ): ConsoleTransportOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (consoleWarnLevels != null) __obj.updateDynamic("consoleWarnLevels")(consoleWarnLevels.asInstanceOf[js.Any])
    if (!js.isUndefined(debugStdout)) __obj.updateDynamic("debugStdout")(debugStdout.get.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions.get.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (logv != null) __obj.updateDynamic("logv")(js.Any.fromFunction2(logv))
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (stderrLevels != null) __obj.updateDynamic("stderrLevels")(stderrLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleTransportOptions]
  }
}

