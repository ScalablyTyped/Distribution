package typings
package webpackLib.webpackMod.webpackNs.debugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilingPluginOptions extends js.Object {
  /** A relative path to a custom output file (json) */
  var outputPath: js.UndefOr[java.lang.String] = js.undefined
}

object ProfilingPluginOptions {
  @scala.inline
  def apply(outputPath: java.lang.String = null): ProfilingPluginOptions = {
    val __obj = js.Dynamic.literal()
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath)
    __obj.asInstanceOf[ProfilingPluginOptions]
  }
}

