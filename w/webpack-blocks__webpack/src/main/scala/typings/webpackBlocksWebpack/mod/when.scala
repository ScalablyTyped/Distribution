package typings.webpackBlocksWebpack.mod

import typings.webpackBlocksCore.mod.Block
import typings.webpackBlocksCore.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/webpack", "when")
@js.native
object when extends js.Object {
  def apply(condition: Boolean, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
}

