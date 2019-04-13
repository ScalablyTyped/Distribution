package typings
package whichLib.whichMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that ask for all matches. */
trait OptionsAll extends AsyncOptions {
  @JSName("all")
  var all_OptionsAll: whichLib.whichLibNumbers.`true`
}

object OptionsAll {
  @scala.inline
  def apply(
    all: whichLib.whichLibNumbers.`true`,
    path: java.lang.String = null,
    pathExt: java.lang.String = null
  ): OptionsAll = {
    val __obj = js.Dynamic.literal(all = all)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    __obj.asInstanceOf[OptionsAll]
  }
}

