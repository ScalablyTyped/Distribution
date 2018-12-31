package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "debug")
@js.native
object debugNs extends js.Object {
  /**
    * Generate Chrome profile file which includes timings of plugins execution. Outputs `events.json` file by
    * default. It is possible to provide custom file path using `outputPath` option.
    *
    * In order to view the profile file:
    * * Run webpack with ProfilingPlugin.
    * * Go to Chrome, open the Profile Tab.
    * * Drag and drop generated file (events.json by default) into the profiler.
    *
    * It will then display timeline stats and calls per plugin!
    */
  @js.native
  class ProfilingPlugin ()
    extends webpackLib.webpackMod.webpackNs.debugNs.ProfilingPlugin {
    def this(options: webpackLib.webpackMod.webpackNs.debugNs.ProfilingPluginOptions) = this()
    /* CompleteClass */
    @JSName("apply")
    override def apply(args: js.Any*): scala.Unit = js.native
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
  }
  
}

