package typings
package whichLib.whichMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that ask for the first match (the default behavior) */
trait OptionsFirst extends AsyncOptions {
  @JSName("all")
  var all_OptionsFirst: js.UndefOr[whichLib.whichLibNumbers.`false`] = js.undefined
}

object OptionsFirst {
  @scala.inline
  def apply(
    all: whichLib.whichLibNumbers.`false` = null,
    path: java.lang.String = null,
    pathExt: java.lang.String = null
  ): OptionsFirst = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    __obj.asInstanceOf[OptionsFirst]
  }
}

