package typings.which.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for which() sync and async APIs */
trait Options extends AsyncOptions {
  /** If true, returns null when not found */
  var nothrow: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    nothrow: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    pathExt: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (!js.isUndefined(nothrow)) __obj.updateDynamic("nothrow")(nothrow.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

