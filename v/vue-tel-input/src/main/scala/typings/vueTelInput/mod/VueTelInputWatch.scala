package typings.vueTelInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputWatch extends js.Object {
  def state(value: js.Any): Unit
  def value(): Unit
}

object VueTelInputWatch {
  @scala.inline
  def apply(state: js.Any => Unit, value: () => Unit): VueTelInputWatch = {
    val __obj = js.Dynamic.literal(state = js.Any.fromFunction1(state), value = js.Any.fromFunction0(value))
  
    __obj.asInstanceOf[VueTelInputWatch]
  }
}

