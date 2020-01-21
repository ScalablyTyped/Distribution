package typings.webpackBlocksWebpack.mod

import typings.webpackBlocksCore.mod.Block
import typings.webpackBlocksCore.mod.Context
import typings.webpackBlocksCore.mod.MatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/webpack", "match")
@js.native
object `match` extends js.Object {
  def apply(test: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def apply(test: String, options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def apply(test: js.Array[String], configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def apply(test: js.Array[String], options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
}

