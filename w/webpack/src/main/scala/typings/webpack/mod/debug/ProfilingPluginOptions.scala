package typings.webpack.mod.debug

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilingPluginOptions extends js.Object {
  /** A relative path to a custom output file (json) */
  var outputPath: js.UndefOr[String] = js.undefined
}

object ProfilingPluginOptions {
  @scala.inline
  def apply(outputPath: String = null): ProfilingPluginOptions = {
    val __obj = js.Dynamic.literal()
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilingPluginOptions]
  }
}

