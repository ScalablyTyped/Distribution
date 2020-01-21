package typings.walkSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkSyncOptions extends js.Object {
  var directories: js.UndefOr[Boolean] = js.undefined
  var globs: js.UndefOr[js.Array[String]] = js.undefined
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
}

object WalkSyncOptions {
  @scala.inline
  def apply(
    directories: js.UndefOr[Boolean] = js.undefined,
    globs: js.Array[String] = null,
    ignore: js.Array[String] = null
  ): WalkSyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(directories)) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (globs != null) __obj.updateDynamic("globs")(globs.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkSyncOptions]
  }
}

