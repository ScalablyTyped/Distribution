package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "optimize")
@js.native
object optimizeNs extends js.Object {
  @js.native
  class AggressiveMergingPlugin ()
    extends webpackLib.webpackMod.Plugin {
    def this(options: webpackLib.webpackMod.optimizeNs.AggressiveMergingPluginNs.Options) = this()
  }
  
  @js.native
  class AggressiveSplittingPlugin ()
    extends webpackLib.webpackMod.Plugin {
    def this(options: webpackLib.webpackMod.optimizeNs.AggressiveSplittingPluginNs.Options) = this()
  }
  
  /** @deprecated */
  @js.native
  class DedupePlugin ()
    extends webpackLib.webpackMod.Plugin
  
  @js.native
  class LimitChunkCountPlugin protected ()
    extends webpackLib.webpackMod.Plugin {
    def this(options: js.Any) = this()
  }
  
  @js.native
  class MinChunkSizePlugin protected ()
    extends webpackLib.webpackMod.Plugin {
    def this(options: js.Any) = this()
  }
  
  /** @deprecated use config.optimization.concatenateModules */
  @js.native
  class ModuleConcatenationPlugin ()
    extends webpackLib.webpackMod.Plugin
  
  @js.native
  class OccurrenceOrderPlugin protected ()
    extends webpackLib.webpackMod.Plugin {
    def this(preferEntry: scala.Boolean) = this()
  }
  
  @js.native
  class UglifyJsPlugin ()
    extends webpackLib.webpackMod.Plugin {
    def this(options: webpackLib.webpackMod.optimizeNs.UglifyJsPluginNs.Options) = this()
  }
  
  @JSName("AggressiveMergingPlugin")
  @js.native
  object AggressiveMergingPluginNs extends js.Object {
    trait Options extends js.Object {
      /**
        * When options.moveToParents is set, moving to an entry chunk is more expensive.
        * Defaults to 10, which means moving to an entry chunk is ten times more expensive than moving to a
        * normal chunk.
        */
      var entryChunkMultiplicator: js.UndefOr[scala.Double] = js.undefined
      /**
        * A factor which defines the minimum required size reduction for chunk merging.
        * Defaults to 1.5 which means that the total size needs to be reduced by 50% for chunk merging.
        */
      var minSizeReduce: js.UndefOr[scala.Double] = js.undefined
      /**
        * When set, modules that are not in both merged chunks are moved to all parents of the chunk.
        * Defaults to false.
        */
      var moveToParents: js.UndefOr[scala.Boolean] = js.undefined
    }
    
  }
  
  @JSName("AggressiveSplittingPlugin")
  @js.native
  object AggressiveSplittingPluginNs extends js.Object {
    trait Options extends js.Object {
      var chunkOverhead: webpackLib.webpackLibNumbers.`0`
      var entryChunkMultiplicator: webpackLib.webpackLibNumbers.`1`
      /**
        * Size in byte.
        * maximum size prefered for each chunk.
        *
        * Default: 51200
        */
      var maxSize: webpackLib.webpackLibNumbers.`50000`
      /**
        * Size in byte.
        * Only chunks bigger than the specified minSize are stored in records.
        * This ensures the chunks fill up as your application grows,
        * instead of creating too many chunks for every change.
        *
        * Default: 30720
        */
      var minSize: webpackLib.webpackLibNumbers.`30000`
    }
    
  }
  
  @JSName("UglifyJsPlugin")
  @js.native
  object UglifyJsPluginNs extends js.Object {
    trait Options
      extends uglifyDashJsLib.uglifyDashJsMod.MinifyOptions {
      var beautify: js.UndefOr[scala.Boolean] = js.undefined
      var comments: js.UndefOr[scala.Boolean | stdLib.RegExp | CommentFilter] = js.undefined
      var exclude: js.UndefOr[webpackLib.webpackMod.Condition | js.Array[webpackLib.webpackMod.Condition]] = js.undefined
      var include: js.UndefOr[webpackLib.webpackMod.Condition | js.Array[webpackLib.webpackMod.Condition]] = js.undefined
      /** Parallelization can speedup your build significantly and is therefore highly recommended. */
      var parallel: js.UndefOr[scala.Boolean | webpackLib.Anon_Cache] = js.undefined
      @JSName("sourceMap")
      var sourceMap_Options: js.UndefOr[scala.Boolean] = js.undefined
      var test: js.UndefOr[webpackLib.webpackMod.Condition | js.Array[webpackLib.webpackMod.Condition]] = js.undefined
    }
    
    type CommentFilter = js.Function2[/* astNode */ js.Any, /* comment */ js.Any, scala.Boolean]
  }
  
}

