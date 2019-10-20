package typings.atWebpackDashBlocksTypescript.atWebpackDashBlocksTypescriptMod

import typings.atWebpackDashBlocksTypescript.Anon_Modules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelOptions extends js.Object {
  var babelrc: js.UndefOr[Boolean] = js.undefined
  var presets: js.UndefOr[js.Array[js.Array[Anon_Modules | String]]] = js.undefined
}

object BabelOptions {
  @scala.inline
  def apply(
    babelrc: js.UndefOr[Boolean] = js.undefined,
    presets: js.Array[js.Array[Anon_Modules | String]] = null
  ): BabelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(babelrc)) __obj.updateDynamic("babelrc")(babelrc)
    if (presets != null) __obj.updateDynamic("presets")(presets)
    __obj.asInstanceOf[BabelOptions]
  }
}

