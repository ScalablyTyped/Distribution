package typings.tlfDashLog.tlfDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewLevelAfter extends NewLevel {
  var after: String
}

object NewLevelAfter {
  @scala.inline
  def apply(after: String, afterLog: () => Unit = null): NewLevelAfter = {
    val __obj = js.Dynamic.literal(after = after)
    if (afterLog != null) __obj.updateDynamic("afterLog")(js.Any.fromFunction0(afterLog))
    __obj.asInstanceOf[NewLevelAfter]
  }
}

