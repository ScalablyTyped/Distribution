package typings.webpackChain.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Module")
@js.native
class Module ()
  extends typings.webpackChain.mod._Config.TypedChainedMap[Config, js.Any] {
  var rules: TypedChainedMap[this.type, Rule[Module]] = js.native
  /* CompleteClass */
  override def end(): Config = js.native
  def noParse(noParse: js.Array[RegExp]): this.type = js.native
  def noParse(noParse: js.Function1[/* contentPath */ String, Boolean]): this.type = js.native
  def noParse(noParse: RegExp): this.type = js.native
  def rule(name: String): Rule[Module] = js.native
  def strictExportPresence(value: Boolean): this.type = js.native
}

