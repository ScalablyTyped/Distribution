package typings.atWebpackDashBlocksCore.atWebpackDashBlocksCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/core", "Core")
@js.native
object Core extends js.Object {
  def createConfig(configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def createConfig(initialContext: InitialContext, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def env(envName: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def group(configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def `match`(test: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def `match`(test: String, options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def `match`(test: js.Array[String], configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def `match`(test: js.Array[String], options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def when(condition: Boolean, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
}

