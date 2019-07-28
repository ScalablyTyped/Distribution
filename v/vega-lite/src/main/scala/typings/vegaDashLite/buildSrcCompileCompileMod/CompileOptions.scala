package typings.vegaDashLite.buildSrcCompileCompileMod

import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcFielddefMod.FieldTitleFormatter
import typings.vegaDashUtil.vegaDashUtilMod.LoggerInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileOptions extends js.Object {
  var config: js.UndefOr[Config] = js.undefined
  var fieldTitle: js.UndefOr[FieldTitleFormatter] = js.undefined
  var logger: js.UndefOr[LoggerInterface] = js.undefined
}

object CompileOptions {
  @scala.inline
  def apply(config: Config = null, fieldTitle: FieldTitleFormatter = null, logger: LoggerInterface = null): CompileOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (fieldTitle != null) __obj.updateDynamic("fieldTitle")(fieldTitle)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    __obj.asInstanceOf[CompileOptions]
  }
}

