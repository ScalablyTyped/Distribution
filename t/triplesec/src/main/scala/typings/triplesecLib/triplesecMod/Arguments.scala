package typings
package triplesecLib.triplesecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arguments extends js.Object {
  var data: nodeLib.Buffer
  var key: nodeLib.Buffer
  var progress_hook: js.UndefOr[js.Function1[/* progress */ Progress, scala.Unit]] = js.undefined
}

object Arguments {
  @scala.inline
  def apply(
    data: nodeLib.Buffer,
    key: nodeLib.Buffer,
    progress_hook: js.Function1[/* progress */ Progress, scala.Unit] = null
  ): Arguments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("key")(key)
    if (progress_hook != null) __obj.updateDynamic("progress_hook")(progress_hook)
    __obj.asInstanceOf[Arguments]
  }
}

