package typings.typeformEmbed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupInstance extends js.Object {
  def close(): Unit
  def open(): Unit
}

object PopupInstance {
  @scala.inline
  def apply(close: () => Unit, open: () => Unit): PopupInstance = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[PopupInstance]
  }
}

