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
    extends webpackLib.webpackMod.webpackNs.optimizeNs.AggressiveMergingPlugin {
    def this(options: webpackLib.webpackMod.webpackNs.optimizeNs.AggressiveMergingPluginNs.Options) = this()
    /* CompleteClass */
    @JSName("apply")
    override def apply(args: js.Any*): scala.Unit = js.native
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
  }
  
  @js.native
  class AggressiveSplittingPlugin ()
    extends webpackLib.webpackMod.webpackNs.optimizeNs.AggressiveSplittingPlugin {
    def this(options: webpackLib.webpackMod.webpackNs.optimizeNs.AggressiveSplittingPluginNs.Options) = this()
    /* CompleteClass */
    @JSName("apply")
    override def apply(args: js.Any*): scala.Unit = js.native
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
  }
  
  /** @deprecated */
  @js.native
  class DedupePlugin ()
    extends webpackLib.webpackMod.webpackNs.optimizeNs.DedupePlugin {
    /* CompleteClass */
    @JSName("apply")
    override def apply(args: js.Any*): scala.Unit = js.native
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
  }
  
  @js.native
  class LimitChunkCountPlugin protected ()
    extends webpackLib.webpackMod.webpackNs.optimizeNs.LimitChunkCountPlugin {
    def this(options: js.Any) = this()
    /* CompleteClass */
    @JSName("apply")
    override def apply(args: js.Any*): scala.Unit = js.native
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
  }
  
  @js.native
  class MinChunkSizePlugin protected ()
    extends webpackLib.webpackMod.webpackNs.optimizeNs.MinChunkSizePlugin {
    def this(options: js.Any) = this()
    /* CompleteClass */
    @JSName("apply")
    override def apply(args: js.Any*): scala.Unit = js.native
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
  }
  
  /** @deprecated use config.optimization.concatenateModules */
  @js.native
  class ModuleConcatenationPlugin ()
    extends webpackLib.webpackMod.webpackNs.optimizeNs.ModuleConcatenationPlugin {
    /* CompleteClass */
    @JSName("apply")
    override def apply(args: js.Any*): scala.Unit = js.native
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
  }
  
  @js.native
  class OccurrenceOrderPlugin protected ()
    extends webpackLib.webpackMod.webpackNs.optimizeNs.OccurrenceOrderPlugin {
    def this(preferEntry: scala.Boolean) = this()
    /* CompleteClass */
    @JSName("apply")
    override def apply(args: js.Any*): scala.Unit = js.native
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
  }
  
  @js.native
  class UglifyJsPlugin ()
    extends webpackLib.webpackMod.webpackNs.optimizeNs.UglifyJsPlugin {
    def this(options: webpackLib.webpackMod.webpackNs.optimizeNs.UglifyJsPluginNs.Options) = this()
    /* CompleteClass */
    @JSName("apply")
    override def apply(args: js.Any*): scala.Unit = js.native
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
  }
  
}

