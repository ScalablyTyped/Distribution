package typings
package whichLib.whichMod.whichNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that ask for a thrown error if executable is not found (the default behavior) */
trait OptionsThrow extends Options {
  @JSName("nothrow")
  var nothrow_OptionsThrow: js.UndefOr[whichLib.whichLibNumbers.`false`] = js.undefined
}

object OptionsThrow {
  @scala.inline
  def apply(
    all: js.UndefOr[scala.Boolean] = js.undefined,
    nothrow: whichLib.whichLibNumbers.`false` = null,
    path: java.lang.String = null,
    pathExt: java.lang.String = null
  ): OptionsThrow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (nothrow != null) __obj.updateDynamic("nothrow")(nothrow)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    __obj.asInstanceOf[OptionsThrow]
  }
}

