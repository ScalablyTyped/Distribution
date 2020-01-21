package typings.webpackBlocksWebpack.mod

import typings.webpackBlocksCore.mod.Block
import typings.webpackBlocksCore.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/webpack", "env")
@js.native
object env extends js.Object {
  def apply(envName: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
}

