package typings.webpackDashChain.webpackDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Plugins")
@js.native
class Plugins[Parent, PluginType /* <: typings.tapable.tapableMod.Tapable.Plugin */] ()
  extends typings.webpackDashChain.webpackDashChainMod.__Config.TypedChainedMap[Parent, Plugin[Parent, PluginType]] {
  /* CompleteClass */
  override def end(): Parent = js.native
}

