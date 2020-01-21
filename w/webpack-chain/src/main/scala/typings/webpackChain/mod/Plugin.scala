package typings.webpackChain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Plugin")
@js.native
class Plugin[Parent, PluginType /* <: typings.tapable.mod.Tapable.Plugin */] ()
  extends typings.webpackChain.mod._Config.TypedChainedMap[Parent, js.Any]
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

