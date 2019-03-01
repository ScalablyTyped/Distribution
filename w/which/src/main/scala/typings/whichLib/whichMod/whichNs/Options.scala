package typings
package whichLib.whichMod.whichNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for which() sync and async APIs */
trait Options extends AsyncOptions {
  /** If true, returns null when not found */
  var nothrow: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    all: js.UndefOr[scala.Boolean] = js.undefined,
    nothrow: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    pathExt: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (!js.isUndefined(nothrow)) __obj.updateDynamic("nothrow")(nothrow)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    __obj.asInstanceOf[Options]
  }
}

