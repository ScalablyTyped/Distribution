package typings.webpackDashChain.webpackDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Plugin")
@js.native
class Plugin[Parent, PluginType /* <: typings.tapable.tapableMod.Tapable.Plugin */] ()
  extends typings.webpackDashChain.webpackDashChainMod.__Config.TypedChainedMap[Parent, js.Any]
     with Orderable {
  /* CompleteClass */
  override def after(name: String): this.type = js.native
  /* CompleteClass */
  override def before(name: String): this.type = js.native
  /* CompleteClass */
  override def end(): Parent = js.native
  def init(
    value: js.Function2[
      /* plugin */ PluginType | PluginClass[PluginType], 
      /* args */ js.Array[_], 
      PluginType
    ]
  ): this.type = js.native
  def tap(f: js.Function1[/* args */ js.Array[_], js.Array[_]]): this.type = js.native
  def use(plugin: PluginType): this.type = js.native
  def use(plugin: PluginType, args: js.Array[_]): this.type = js.native
  def use(plugin: String): this.type = js.native
  def use(plugin: String, args: js.Array[_]): this.type = js.native
  def use(plugin: PluginClass[PluginType]): this.type = js.native
  def use(plugin: PluginClass[PluginType], args: js.Array[_]): this.type = js.native
}

