package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitAlertElement extends js.Object {
  def close(): Unit
}

object UIkitAlertElement {
  @scala.inline
  def apply(close: () => Unit): UIkitAlertElement = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[UIkitAlertElement]
  }
}

