package typings.tsconfigPaths.configLoaderMod

import typings.tsconfigPaths.tsconfigLoaderMod.TsConfigLoaderParams
import typings.tsconfigPaths.tsconfigLoaderMod.TsConfigLoaderResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigLoaderParams extends js.Object {
  var cwd: String
  var explicitParams: js.UndefOr[ExplicitParams] = js.undefined
  var tsConfigLoader: js.UndefOr[TsConfigLoader] = js.undefined
}

object ConfigLoaderParams {
  @scala.inline
  def apply(
    cwd: String,
    explicitParams: ExplicitParams = null,
    tsConfigLoader: /* params */ TsConfigLoaderParams => TsConfigLoaderResult = null
  ): ConfigLoaderParams = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
    if (explicitParams != null) __obj.updateDynamic("explicitParams")(explicitParams.asInstanceOf[js.Any])
    if (tsConfigLoader != null) __obj.updateDynamic("tsConfigLoader")(js.Any.fromFunction1(tsConfigLoader))
    __obj.asInstanceOf[ConfigLoaderParams]
  }
}

