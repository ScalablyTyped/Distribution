package typings.webpackDashChain.webpackDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Plugin")
@js.native
class Plugin[Parent] ()
  extends typings.webpackDashChain.webpackDashChainMod.__Config.TypedChainedMap[Parent, js.Any]
     with Orderable {
  /* CompleteClass */
  override def after(name: String): this.type = js.native
  /* CompleteClass */
  override def before(name: String): this.type = js.native
  /* CompleteClass */
  override def end(): Parent = js.native
  def init(value: js.Function2[/* plugin */ PluginClass, /* args */ js.Array[_], this.type]): this.type = js.native
  def tap(f: js.Function1[/* args */ js.Array[_], js.Array[_]]): this.type = js.native
  def use(plugin: PluginClass): this.type = js.native
  def use(plugin: PluginClass, args: js.Array[_]): this.type = js.native
}

