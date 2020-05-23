package typings.which.mod

import typings.which.whichBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that ask to receive null instead of a thrown error */
trait OptionsNoThrow extends Options {
  @JSName("nothrow")
  var nothrow_OptionsNoThrow: `true`
}

object OptionsNoThrow {
  @scala.inline
  def apply(
    nothrow: `true`,
    all: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    pathExt: String = null
  ): OptionsNoThrow = {
    val __obj = js.Dynamic.literal(nothrow = nothrow.asInstanceOf[js.Any])
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsNoThrow]
  }
}

