package typings.which.whichMod

import typings.which.whichBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that ask for the first match (the default behavior) */
trait OptionsFirst extends AsyncOptions {
  @JSName("all")
  var all_OptionsFirst: js.UndefOr[`false`] = js.undefined
}

object OptionsFirst {
  @scala.inline
  def apply(all: `false` = null, path: String = null, pathExt: String = null): OptionsFirst = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsFirst]
  }
}

