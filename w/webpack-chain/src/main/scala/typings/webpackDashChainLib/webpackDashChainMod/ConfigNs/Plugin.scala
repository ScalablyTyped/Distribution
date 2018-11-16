package typings
package webpackDashChainLib.webpackDashChainMod.ConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin[Parent]
  extends webpackDashChainLib.webpackDashChainMod.underscoreUnderscoreConfigNs.TypedChainedMap[Parent, js.Any]
     with Orderable {
  def init(value: js.Function2[/* plugin */ PluginClass, /* args */ js.Array[_], this.type]): this.type = js.native
  def tap(f: js.Function1[/* args */ js.Array[_], js.Array[_]]): this.type = js.native
  def use(plugin: PluginClass): this.type = js.native
  def use(plugin: PluginClass, args: js.Array[_]): this.type = js.native
}

