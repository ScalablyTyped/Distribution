package typings
package webpackDashCleanupDashPluginLib.webpackDashCleanupDashPluginMod.WebpackCleanupPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Keep some files in the output path. It accepts globbing as in [minimatch](https://github.com/isaacs/minimatch).
    */
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Print the list of the files that will be deleted without actually deleting them.
    */
  var preview: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Mute the console output.
    */
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
}

