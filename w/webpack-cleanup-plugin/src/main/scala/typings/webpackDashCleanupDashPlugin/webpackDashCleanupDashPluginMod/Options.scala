package typings.webpackDashCleanupDashPlugin.webpackDashCleanupDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Keep some files in the output path. It accepts globbing as in [minimatch](https://github.com/isaacs/minimatch).
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Print the list of the files that will be deleted without actually deleting them.
    */
  var preview: js.UndefOr[Boolean] = js.undefined
  /**
    * Mute the console output.
    */
  var quiet: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exclude: js.Array[String] = null,
    preview: js.UndefOr[Boolean] = js.undefined,
    quiet: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

