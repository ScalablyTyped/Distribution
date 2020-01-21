package typings.unusedFilesWebpackPlugin.mod

import typings.unusedFilesWebpackPlugin.AnonIgnore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var failOnUnused: Boolean
  var globOptions: js.UndefOr[AnonIgnore] = js.undefined
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  var patterns: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    failOnUnused: Boolean,
    cwd: String = null,
    globOptions: AnonIgnore = null,
    ignore: String | js.Array[String] = null,
    patterns: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal(failOnUnused = failOnUnused.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (globOptions != null) __obj.updateDynamic("globOptions")(globOptions.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (patterns != null) __obj.updateDynamic("patterns")(patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

