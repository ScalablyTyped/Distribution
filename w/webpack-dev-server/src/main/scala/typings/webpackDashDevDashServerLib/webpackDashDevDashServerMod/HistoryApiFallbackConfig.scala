package typings
package webpackDashDevDashServerLib.webpackDashDevDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryApiFallbackConfig extends js.Object {
  var disableDotRule: js.UndefOr[scala.Boolean] = js.undefined
  var rewrites: js.UndefOr[js.Array[Rewrite]] = js.undefined
}

object HistoryApiFallbackConfig {
  @scala.inline
  def apply(disableDotRule: js.UndefOr[scala.Boolean] = js.undefined, rewrites: js.Array[Rewrite] = null): HistoryApiFallbackConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableDotRule)) __obj.updateDynamic("disableDotRule")(disableDotRule)
    if (rewrites != null) __obj.updateDynamic("rewrites")(rewrites)
    __obj.asInstanceOf[HistoryApiFallbackConfig]
  }
}

