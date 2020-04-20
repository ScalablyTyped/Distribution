package typings.wolfy87Eventemitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonListener extends js.Object {
  var listener: js.Function
}

object AnonListener {
  @scala.inline
  def apply(listener: js.Function): AnonListener = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonListener]
  }
}

