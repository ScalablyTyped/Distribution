package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait clipbuffer extends js.Object {
  def destructor(): Unit
  def focus(): Unit
  def init(): Unit
  def set(text: String): Unit
}

object clipbuffer {
  @scala.inline
  def apply(destructor: () => Unit, focus: () => Unit, init: () => Unit, set: String => Unit): clipbuffer = {
    val __obj = js.Dynamic.literal(destructor = js.Any.fromFunction0(destructor), focus = js.Any.fromFunction0(focus), init = js.Any.fromFunction0(init), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[clipbuffer]
  }
}

