package typings
package winstonLib.winstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  var defaultMeta: js.UndefOr[js.Any] = js.undefined
  var exceptionHandlers: js.UndefOr[js.Any] = js.undefined
  var exitOnError: js.UndefOr[js.Function | scala.Boolean] = js.undefined
  var format: js.UndefOr[logformLib.logformMod.Format] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var levels: js.UndefOr[winstonLib.libWinstonConfigMod.AbstractConfigSetLevels] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var transports: js.UndefOr[
    js.Array[winstonDashTransportLib.winstonDashTransportMod.^] | winstonDashTransportLib.winstonDashTransportMod.^ 
  ] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(
    defaultMeta: js.Any = null,
    exceptionHandlers: js.Any = null,
    exitOnError: js.Function | scala.Boolean = null,
    format: logformLib.logformMod.Format = null,
    level: java.lang.String = null,
    levels: winstonLib.libWinstonConfigMod.AbstractConfigSetLevels = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    transports: js.Array[winstonDashTransportLib.winstonDashTransportMod.^] | winstonDashTransportLib.winstonDashTransportMod.^  = null
  ): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultMeta != null) __obj.updateDynamic("defaultMeta")(defaultMeta)
    if (exceptionHandlers != null) __obj.updateDynamic("exceptionHandlers")(exceptionHandlers)
    if (exitOnError != null) __obj.updateDynamic("exitOnError")(exitOnError.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (level != null) __obj.updateDynamic("level")(level)
    if (levels != null) __obj.updateDynamic("levels")(levels)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
}

