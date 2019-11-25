package typings.atWebpackDashBlocksWebpack.atWebpackDashBlocksWebpackMod

import typings.webpack.webpackMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimizationOptions extends js.Object {
  var minimize: js.UndefOr[Boolean] = js.undefined
  var minimizer: js.UndefOr[js.Array[Plugin] | PluginFunction] = js.undefined
}

object OptimizationOptions {
  @scala.inline
  def apply(minimize: js.UndefOr[Boolean] = js.undefined, minimizer: js.Array[Plugin] | PluginFunction = null): OptimizationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minimize)) __obj.updateDynamic("minimize")(minimize.asInstanceOf[js.Any])
    if (minimizer != null) __obj.updateDynamic("minimizer")(minimizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizationOptions]
  }
}

