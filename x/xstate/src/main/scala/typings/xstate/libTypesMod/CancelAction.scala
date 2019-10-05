package typings.xstate.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelAction
  extends ActionObject[js.Any, js.Any] {
  var sendId: String | Double
}

object CancelAction {
  @scala.inline
  def apply(
    sendId: String | Double,
    `type`: String,
    exec: (js.Any, js.Any, /* meta */ ActionMeta[js.Any, js.Any]) => js.Any | Unit = null
  ): CancelAction = {
    val __obj = js.Dynamic.literal(sendId = sendId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    __obj.asInstanceOf[CancelAction]
  }
}

