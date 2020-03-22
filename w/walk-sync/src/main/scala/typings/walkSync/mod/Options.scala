package typings.walkSync.mod

import typings.minimatch.mod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var directories: js.UndefOr[Boolean] = js.undefined
  var globs: js.UndefOr[js.Array[String | IMinimatch]] = js.undefined
  var ignore: js.UndefOr[js.Array[String | IMinimatch]] = js.undefined
  var includeBasePath: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    directories: js.UndefOr[Boolean] = js.undefined,
    globs: js.Array[String | IMinimatch] = null,
    ignore: js.Array[String | IMinimatch] = null,
    includeBasePath: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(directories)) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (globs != null) __obj.updateDynamic("globs")(globs.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(includeBasePath)) __obj.updateDynamic("includeBasePath")(includeBasePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

