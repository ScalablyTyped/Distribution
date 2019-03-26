package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelAction
  extends ActionObject[js.Any, js.Any] {
  var sendId: java.lang.String | scala.Double
}

object CancelAction {
  @scala.inline
  def apply(
    sendId: java.lang.String | scala.Double,
    `type`: java.lang.String,
    exec: ActionFunction[js.Any, js.Any] = null
  ): CancelAction = {
    val __obj = js.Dynamic.literal(sendId = sendId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (exec != null) __obj.updateDynamic("exec")(exec)
    __obj.asInstanceOf[CancelAction]
  }
}

