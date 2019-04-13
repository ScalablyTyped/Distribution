package typings
package webpackDashChainLib.webpackDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Module")
@js.native
class Module () extends ChainedMap[Config] {
  var rules: TypedChainedMap[this.type, Rule] = js.native
  def noParse(noParse: js.Array[stdLib.RegExp]): this.type = js.native
  def noParse(noParse: js.Function1[/* contentPath */ java.lang.String, scala.Boolean]): this.type = js.native
  def noParse(noParse: stdLib.RegExp): this.type = js.native
  def rule(name: java.lang.String): Rule = js.native
}

