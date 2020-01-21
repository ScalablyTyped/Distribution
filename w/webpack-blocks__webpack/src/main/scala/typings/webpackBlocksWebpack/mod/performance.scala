package typings.webpackBlocksWebpack.mod

import typings.webpack.mod.Options.Performance
import typings.webpackBlocksCore.mod.Block
import typings.webpackBlocksCore.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/webpack", "performance")
@js.native
object performance extends js.Object {
  def apply(performanceBudget: Performance): Block[Context] = js.native
}

