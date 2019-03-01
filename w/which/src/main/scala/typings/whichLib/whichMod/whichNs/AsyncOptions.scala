package typings
package whichLib.whichMod.whichNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for which() async API */
trait AsyncOptions extends js.Object {
  /** If true, return all matches, instead of just the first one. Note that this means the function returns an array of strings instead of a single string. */
  var all: js.UndefOr[scala.Boolean] = js.undefined
  /** Use instead of the PATH environment variable. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Use instead of the PATHEXT environment variable. */
  var pathExt: js.UndefOr[java.lang.String] = js.undefined
}

object AsyncOptions {
  @scala.inline
  def apply(
    all: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    pathExt: java.lang.String = null
  ): AsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    __obj.asInstanceOf[AsyncOptions]
  }
}

