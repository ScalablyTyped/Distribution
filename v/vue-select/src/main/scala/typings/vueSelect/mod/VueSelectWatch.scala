package typings.vueSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueSelectWatch extends js.Object {
  def created(): Unit
  def multiple(reset: Boolean): Unit
  def mutableOptions(): Unit
  def mutableValue(`val`: js.Any, old: js.Any): Unit
  def options(`val`: js.Any): Unit
  def value(`val`: js.Any): Unit
}

object VueSelectWatch {
  @scala.inline
  def apply(
    created: () => Unit,
    multiple: Boolean => Unit,
    mutableOptions: () => Unit,
    mutableValue: (js.Any, js.Any) => Unit,
    options: js.Any => Unit,
    value: js.Any => Unit
  ): VueSelectWatch = {
    val __obj = js.Dynamic.literal(created = js.Any.fromFunction0(created), multiple = js.Any.fromFunction1(multiple), mutableOptions = js.Any.fromFunction0(mutableOptions), mutableValue = js.Any.fromFunction2(mutableValue), options = js.Any.fromFunction1(options), value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[VueSelectWatch]
  }
}

