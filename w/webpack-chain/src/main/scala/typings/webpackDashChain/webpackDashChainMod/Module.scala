package typings.webpackDashChain.webpackDashChainMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Module")
@js.native
class Module ()
  extends typings.webpackDashChain.webpackDashChainMod.__Config.TypedChainedMap[Config, js.Any] {
  var rules: TypedChainedMap[this.type, Rule] = js.native
  /* CompleteClass */
  override def end(): Config = js.native
  def noParse(noParse: js.Array[RegExp]): this.type = js.native
  def noParse(noParse: js.Function1[/* contentPath */ String, Boolean]): this.type = js.native
  def noParse(noParse: RegExp): this.type = js.native
  def rule(name: String): Rule = js.native
  def strictExportPresence(value: Boolean): this.type = js.native
}

