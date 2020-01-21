package typings.tlfLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewLevelBefore extends NewLevel {
  var before: String
}

object NewLevelBefore {
  @scala.inline
  def apply(before: String, afterLog: () => Unit = null): NewLevelBefore = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
    if (afterLog != null) __obj.updateDynamic("afterLog")(js.Any.fromFunction0(afterLog))
    __obj.asInstanceOf[NewLevelBefore]
  }
}

