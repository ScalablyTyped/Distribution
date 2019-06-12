package typings
package webpackDashChainLib.webpackDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Rule")
@js.native
class Rule () extends ChainedMap[Module] {
  var exclude: TypedChainedSet[this.type, webpackLib.webpackMod.Condition] = js.native
  var include: TypedChainedSet[this.type, webpackLib.webpackMod.Condition] = js.native
  var oneOfs: TypedChainedMap[this.type, OneOf] = js.native
  var uses: TypedChainedMap[this.type, Use[Rule]] = js.native
  @JSName("enforce")
  def enforce_post(value: webpackDashChainLib.webpackDashChainLibStrings.post): this.type = js.native
  @JSName("enforce")
  def enforce_pre(value: webpackDashChainLib.webpackDashChainLibStrings.pre): this.type = js.native
  def oneOf(name: java.lang.String): OneOf = js.native
  def parser(value: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  def post(): this.type = js.native
  def pre(): this.type = js.native
  def test(value: js.Array[webpackLib.webpackMod.Condition]): this.type = js.native
  def test(value: webpackLib.webpackMod.Condition): this.type = js.native
  @JSName("type")
  def type_javascriptauto(value: webpackDashChainLib.webpackDashChainLibStrings.`javascript/auto`): this.type = js.native
  @JSName("type")
  def type_javascriptdynamic(value: webpackDashChainLib.webpackDashChainLibStrings.`javascript/dynamic`): this.type = js.native
  @JSName("type")
  def type_javascriptesm(value: webpackDashChainLib.webpackDashChainLibStrings.`javascript/esm`): this.type = js.native
  @JSName("type")
  def type_json(value: webpackDashChainLib.webpackDashChainLibStrings.json): this.type = js.native
  @JSName("type")
  def type_webassemblyexperimental(value: webpackDashChainLib.webpackDashChainLibStrings.`webassembly/experimental`): this.type = js.native
  def use(name: java.lang.String): Use[Rule] = js.native
}

