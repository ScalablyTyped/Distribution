package typings.unusedDashFilesDashWebpackDashPlugin.unusedDashFilesDashWebpackDashPluginMod

import typings.unusedDashFilesDashWebpackDashPlugin.Anon_Ignore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var failOnUnused: Boolean
  var globOptions: js.UndefOr[Anon_Ignore] = js.undefined
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  var patterns: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    failOnUnused: Boolean,
    cwd: String = null,
    globOptions: Anon_Ignore = null,
    ignore: String | js.Array[String] = null,
    patterns: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal(failOnUnused = failOnUnused)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (globOptions != null) __obj.updateDynamic("globOptions")(globOptions)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (patterns != null) __obj.updateDynamic("patterns")(patterns)
    __obj.asInstanceOf[Options]
  }
}

