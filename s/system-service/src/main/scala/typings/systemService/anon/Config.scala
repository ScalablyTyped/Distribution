package typings.systemService.anon

import typings.systemLogger.mod.LoggerConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var config: LoggerConfiguration
  var file: js.UndefOr[Source] = js.undefined
  var source: js.UndefOr[SourceSourcesConfiguration] = js.undefined
}

object Config {
  @scala.inline
  def apply(config: LoggerConfiguration, file: Source = null, source: SourceSourcesConfiguration = null): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

