package typings.webpackDashChain.webpackDashChainMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Module")
@js.native
class Module () extends ChainedMap[Config] {
  var rules: TypedChainedMap[this.type, Rule] = js.native
  def noParse(noParse: js.Array[RegExp]): this.type = js.native
  def noParse(noParse: js.Function1[/* contentPath */ String, Boolean]): this.type = js.native
  def noParse(noParse: RegExp): this.type = js.native
  def rule(name: String): Rule = js.native
}

