package typings.webpackDashStream

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.webpack.webpackMod.optimizeNs.AggressiveMergingPlugin
import typings.webpack.webpackMod.optimizeNs.AggressiveSplittingPlugin
import typings.webpack.webpackMod.optimizeNs.DedupePlugin
import typings.webpack.webpackMod.optimizeNs.LimitChunkCountPlugin
import typings.webpack.webpackMod.optimizeNs.MinChunkSizePlugin
import typings.webpack.webpackMod.optimizeNs.ModuleConcatenationPlugin
import typings.webpack.webpackMod.optimizeNs.OccurrenceOrderPlugin
import typings.webpack.webpackMod.optimizeNs.UglifyJsPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofoptimize extends js.Object {
  var AggressiveMergingPlugin: Instantiable0[typings.webpack.webpackMod.optimizeNs.AggressiveMergingPlugin]
  val AggressiveMergingPluginNs: js.Any
  var AggressiveSplittingPlugin: Instantiable0[typings.webpack.webpackMod.optimizeNs.AggressiveSplittingPlugin]
  val AggressiveSplittingPluginNs: js.Any
  /** @deprecated */
  var DedupePlugin: Instantiable0[typings.webpack.webpackMod.optimizeNs.DedupePlugin]
  var LimitChunkCountPlugin: Instantiable1[/* options */ js.Any, typings.webpack.webpackMod.optimizeNs.LimitChunkCountPlugin]
  var MinChunkSizePlugin: Instantiable1[/* options */ js.Any, typings.webpack.webpackMod.optimizeNs.MinChunkSizePlugin]
  /** @deprecated use config.optimization.concatenateModules */
  var ModuleConcatenationPlugin: Instantiable0[typings.webpack.webpackMod.optimizeNs.ModuleConcatenationPlugin]
  var OccurrenceOrderPlugin: Instantiable1[
    /* preferEntry */ Boolean, 
    typings.webpack.webpackMod.optimizeNs.OccurrenceOrderPlugin
  ]
  var UglifyJsPlugin: Instantiable0[typings.webpack.webpackMod.optimizeNs.UglifyJsPlugin]
  val UglifyJsPluginNs: js.Any
}

object Typeofoptimize {
  @scala.inline
  def apply(
    AggressiveMergingPlugin: Instantiable0[AggressiveMergingPlugin],
    AggressiveMergingPluginNs: js.Any,
    AggressiveSplittingPlugin: Instantiable0[AggressiveSplittingPlugin],
    AggressiveSplittingPluginNs: js.Any,
    DedupePlugin: Instantiable0[DedupePlugin],
    LimitChunkCountPlugin: Instantiable1[/* options */ js.Any, LimitChunkCountPlugin],
    MinChunkSizePlugin: Instantiable1[/* options */ js.Any, MinChunkSizePlugin],
    ModuleConcatenationPlugin: Instantiable0[ModuleConcatenationPlugin],
    OccurrenceOrderPlugin: Instantiable1[/* preferEntry */ Boolean, OccurrenceOrderPlugin],
    UglifyJsPlugin: Instantiable0[UglifyJsPlugin],
    UglifyJsPluginNs: js.Any
  ): Typeofoptimize = {
    val __obj = js.Dynamic.literal(AggressiveMergingPlugin = AggressiveMergingPlugin, AggressiveMergingPluginNs = AggressiveMergingPluginNs, AggressiveSplittingPlugin = AggressiveSplittingPlugin, AggressiveSplittingPluginNs = AggressiveSplittingPluginNs, DedupePlugin = DedupePlugin, LimitChunkCountPlugin = LimitChunkCountPlugin, MinChunkSizePlugin = MinChunkSizePlugin, ModuleConcatenationPlugin = ModuleConcatenationPlugin, OccurrenceOrderPlugin = OccurrenceOrderPlugin, UglifyJsPlugin = UglifyJsPlugin, UglifyJsPluginNs = UglifyJsPluginNs)
  
    __obj.asInstanceOf[Typeofoptimize]
  }
}

