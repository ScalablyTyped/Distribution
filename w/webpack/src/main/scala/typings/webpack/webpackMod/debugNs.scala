package typings.webpack.webpackMod

import typings.webpack.webpackMod.debugNs.ProfilingPluginOptions
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
  class ProfilingPlugin () extends Plugin {
    def this(options: ProfilingPluginOptions) = this()
  }
  
  trait ProfilingPluginOptions extends js.Object {
    /** A relative path to a custom output file (json) */
    var outputPath: js.UndefOr[String] = js.undefined
  }
  
}

