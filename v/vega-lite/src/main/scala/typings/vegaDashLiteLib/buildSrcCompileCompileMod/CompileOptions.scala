package typings
package vegaDashLiteLib.buildSrcCompileCompileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileOptions extends js.Object {
  var config: js.UndefOr[vegaDashLiteLib.buildSrcConfigMod.Config] = js.undefined
  var fieldTitle: js.UndefOr[vegaDashLiteLib.buildSrcFielddefMod.FieldTitleFormatter] = js.undefined
  var logger: js.UndefOr[vegaDashUtilLib.vegaDashUtilMod.LoggerInterface] = js.undefined
}

object CompileOptions {
  @scala.inline
  def apply(
    config: vegaDashLiteLib.buildSrcConfigMod.Config = null,
    fieldTitle: vegaDashLiteLib.buildSrcFielddefMod.FieldTitleFormatter = null,
    logger: vegaDashUtilLib.vegaDashUtilMod.LoggerInterface = null
  ): CompileOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (fieldTitle != null) __obj.updateDynamic("fieldTitle")(fieldTitle)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    __obj.asInstanceOf[CompileOptions]
  }
}

