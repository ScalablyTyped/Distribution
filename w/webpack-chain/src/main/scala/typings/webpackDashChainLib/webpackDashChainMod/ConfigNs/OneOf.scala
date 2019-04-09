package typings
package webpackDashChainLib.webpackDashChainMod.ConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OneOf
  extends webpackDashChainLib.webpackDashChainMod.underscoreUnderscoreConfigNs.TypedChainedMap[Rule, js.Any]
     with Orderable {
  def resourceQuery(value: js.Array[webpackLib.webpackMod.webpackNs.Condition]): this.type = js.native
  def resourceQuery(value: webpackLib.webpackMod.webpackNs.Condition): this.type = js.native
  def use(name: java.lang.String): Use[this.type] = js.native
}

