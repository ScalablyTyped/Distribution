package typings.tlfLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewLevel extends js.Object {
  var afterLog: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object NewLevel {
  @scala.inline
  def apply(afterLog: () => Unit = null): NewLevel = {
    val __obj = js.Dynamic.literal()
    if (afterLog != null) __obj.updateDynamic("afterLog")(js.Any.fromFunction0(afterLog))
    __obj.asInstanceOf[NewLevel]
  }
}

