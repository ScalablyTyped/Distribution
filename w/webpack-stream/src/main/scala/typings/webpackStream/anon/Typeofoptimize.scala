package typings.webpackStream.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.webpack.mod.optimize.AggressiveMergingPlugin
import typings.webpack.mod.optimize.AggressiveSplittingPlugin
import typings.webpack.mod.optimize.DedupePlugin
import typings.webpack.mod.optimize.LimitChunkCountPlugin
import typings.webpack.mod.optimize.MinChunkSizePlugin
import typings.webpack.mod.optimize.ModuleConcatenationPlugin
import typings.webpack.mod.optimize.OccurrenceOrderPlugin
import typings.webpack.mod.optimize.UglifyJsPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofoptimize extends js.Object {
  var AggressiveMergingPlugin: Instantiable0[typings.webpack.mod.optimize.AggressiveMergingPlugin]
  var AggressiveSplittingPlugin: Instantiable0[typings.webpack.mod.optimize.AggressiveSplittingPlugin]
  /** @deprecated */
  var DedupePlugin: Instantiable0[typings.webpack.mod.optimize.DedupePlugin]
  var LimitChunkCountPlugin: Instantiable1[/* options */ js.Any, typings.webpack.mod.optimize.LimitChunkCountPlugin]
  var MinChunkSizePlugin: Instantiable1[/* options */ js.Any, typings.webpack.mod.optimize.MinChunkSizePlugin]
  /** @deprecated use config.optimization.concatenateModules */
  var ModuleConcatenationPlugin: Instantiable0[typings.webpack.mod.optimize.ModuleConcatenationPlugin]
  var OccurrenceOrderPlugin: Instantiable1[/* preferEntry */ Boolean, typings.webpack.mod.optimize.OccurrenceOrderPlugin]
  var UglifyJsPlugin: Instantiable0[typings.webpack.mod.optimize.UglifyJsPlugin]
}

object Typeofoptimize {
  @scala.inline
  def apply(
    AggressiveMergingPlugin: Instantiable0[AggressiveMergingPlugin],
    AggressiveSplittingPlugin: Instantiable0[AggressiveSplittingPlugin],
    DedupePlugin: Instantiable0[DedupePlugin],
    LimitChunkCountPlugin: Instantiable1[/* options */ js.Any, LimitChunkCountPlugin],
    MinChunkSizePlugin: Instantiable1[/* options */ js.Any, MinChunkSizePlugin],
    ModuleConcatenationPlugin: Instantiable0[ModuleConcatenationPlugin],
    OccurrenceOrderPlugin: Instantiable1[/* preferEntry */ Boolean, OccurrenceOrderPlugin],
    UglifyJsPlugin: Instantiable0[UglifyJsPlugin]
  ): Typeofoptimize = {
    val __obj = js.Dynamic.literal(AggressiveMergingPlugin = AggressiveMergingPlugin.asInstanceOf[js.Any], AggressiveSplittingPlugin = AggressiveSplittingPlugin.asInstanceOf[js.Any], DedupePlugin = DedupePlugin.asInstanceOf[js.Any], LimitChunkCountPlugin = LimitChunkCountPlugin.asInstanceOf[js.Any], MinChunkSizePlugin = MinChunkSizePlugin.asInstanceOf[js.Any], ModuleConcatenationPlugin = ModuleConcatenationPlugin.asInstanceOf[js.Any], OccurrenceOrderPlugin = OccurrenceOrderPlugin.asInstanceOf[js.Any], UglifyJsPlugin = UglifyJsPlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptimize]
  }
}

