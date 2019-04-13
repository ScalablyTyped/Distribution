package typings
package webpackDashChainLib.webpackDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Plugin")
@js.native
class Plugin[Parent] ()
  extends ChainedMap[Parent]
     with Orderable {
  /* CompleteClass */
  override def after(name: java.lang.String): this.type = js.native
  /* CompleteClass */
  override def before(name: java.lang.String): this.type = js.native
  def init(value: js.Function2[/* plugin */ PluginClass, /* args */ js.Array[_], this.type]): this.type = js.native
  def tap(f: js.Function1[/* args */ js.Array[_], js.Array[_]]): this.type = js.native
  def use(plugin: PluginClass): this.type = js.native
  def use(plugin: PluginClass, args: js.Array[_]): this.type = js.native
}

