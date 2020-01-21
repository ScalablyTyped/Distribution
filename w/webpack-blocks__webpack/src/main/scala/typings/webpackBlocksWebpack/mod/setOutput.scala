package typings.webpackBlocksWebpack.mod

import typings.webpack.mod.Output
import typings.webpackBlocksCore.mod.Block
import typings.webpackBlocksCore.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/webpack", "setOutput")
@js.native
object setOutput extends js.Object {
  def apply(): Block[Context] = js.native
  def apply(output: String): Block[Context] = js.native
  def apply(output: Output): Block[Context] = js.native
}

