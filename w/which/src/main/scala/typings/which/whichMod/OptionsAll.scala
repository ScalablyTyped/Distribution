package typings.which.whichMod

import typings.which.whichBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that ask for all matches. */
trait OptionsAll extends AsyncOptions {
  @JSName("all")
  var all_OptionsAll: `true`
}

object OptionsAll {
  @scala.inline
  def apply(all: `true`, path: String = null, pathExt: String = null): OptionsAll = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsAll]
  }
}

