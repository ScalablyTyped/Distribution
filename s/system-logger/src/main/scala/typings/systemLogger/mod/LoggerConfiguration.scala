package typings.systemLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerConfiguration extends js.Object {
  var externalDisplayFormat: js.UndefOr[js.Any] = js.undefined
  var level: typings.systemLogger.mod.level
  var silent: js.UndefOr[Boolean] = js.undefined
}

object LoggerConfiguration {
  @scala.inline
  def apply(level: level, externalDisplayFormat: js.Any = null, silent: js.UndefOr[Boolean] = js.undefined): LoggerConfiguration = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    if (externalDisplayFormat != null) __obj.updateDynamic("externalDisplayFormat")(externalDisplayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerConfiguration]
  }
}

