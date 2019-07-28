package typings.which.whichMod

import typings.which.whichNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that ask for a thrown error if executable is not found (the default behavior) */
trait OptionsThrow extends Options {
  @JSName("nothrow")
  var nothrow_OptionsThrow: js.UndefOr[`false`] = js.undefined
}

object OptionsThrow {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    nothrow: `false` = null,
    path: String = null,
    pathExt: String = null
  ): OptionsThrow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (nothrow != null) __obj.updateDynamic("nothrow")(nothrow)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    __obj.asInstanceOf[OptionsThrow]
  }
}

