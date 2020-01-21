package typings.walkdir

import typings.walkdir.walkdirBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalseSync extends js.Object {
  var sync: js.UndefOr[`false`] = js.undefined
}

object AnonFalseSync {
  @scala.inline
  def apply(sync: `false` = null): AnonFalseSync = {
    val __obj = js.Dynamic.literal()
    if (sync != null) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalseSync]
  }
}

