package typings
package whichLib.whichMod.whichNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that ask to receive null instead of a thrown error */
trait OptionsNoThrow extends Options {
  @JSName("nothrow")
  var nothrow_OptionsNoThrow: whichLib.whichLibNumbers.`true`
}

object OptionsNoThrow {
  @scala.inline
  def apply(
    nothrow: whichLib.whichLibNumbers.`true`,
    all: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    pathExt: java.lang.String = null
  ): OptionsNoThrow = {
    val __obj = js.Dynamic.literal(nothrow = nothrow)
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    __obj.asInstanceOf[OptionsNoThrow]
  }
}

