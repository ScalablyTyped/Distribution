package typings.webpackChain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Plugins")
@js.native
class Plugins[Parent, PluginType /* <: typings.tapable.mod.Tapable.Plugin */] ()
  extends typings.webpackChain.mod._Config.TypedChainedMap[Parent, Plugin[Parent, PluginType]]

