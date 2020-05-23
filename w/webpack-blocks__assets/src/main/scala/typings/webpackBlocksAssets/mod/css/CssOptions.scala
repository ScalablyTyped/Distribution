package typings.webpackBlocksAssets.mod.css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssOptions extends js.Object {
  var `import`: js.UndefOr[Boolean | ImportFilter] = js.undefined
  var modules: js.UndefOr[Boolean | String | ModuleOptions] = js.undefined
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[Boolean | UrlFilter] = js.undefined
}

object CssOptions {
  @scala.inline
  def apply(
    `import`: Boolean | ImportFilter = null,
    modules: Boolean | String | ModuleOptions = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined,
    url: Boolean | UrlFilter = null
  ): CssOptions = {
    val __obj = js.Dynamic.literal()
    if (`import` != null) __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssOptions]
  }
}

