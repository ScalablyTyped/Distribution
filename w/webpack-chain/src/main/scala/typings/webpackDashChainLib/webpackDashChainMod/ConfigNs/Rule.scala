package typings
package webpackDashChainLib.webpackDashChainMod.ConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule
  extends webpackDashChainLib.webpackDashChainMod.underscoreUnderscoreConfigNs.TypedChainedMap[Module, js.Any] {
  var exclude: TypedChainedSet[this.type, webpackLib.webpackMod.webpackNs.Condition] = js.native
  var include: TypedChainedSet[this.type, webpackLib.webpackMod.webpackNs.Condition] = js.native
  var uses: TypedChainedMap[this.type, Use] = js.native
  @JSName("enforce")
  def enforce_post(value: webpackDashChainLib.webpackDashChainLibStrings.post): this.type = js.native
  @JSName("enforce")
  def enforce_pre(value: webpackDashChainLib.webpackDashChainLibStrings.pre): this.type = js.native
  def parser(value: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  def post(): this.type = js.native
  def pre(): this.type = js.native
  def test(value: js.Array[webpackLib.webpackMod.webpackNs.Condition]): this.type = js.native
  def test(value: webpackLib.webpackMod.webpackNs.Condition): this.type = js.native
  def use(name: java.lang.String): Use = js.native
}

