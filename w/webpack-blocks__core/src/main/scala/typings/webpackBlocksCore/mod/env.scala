package typings.webpackBlocksCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/core", "env")
@js.native
object env extends js.Object {
  def apply(envName: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
}

