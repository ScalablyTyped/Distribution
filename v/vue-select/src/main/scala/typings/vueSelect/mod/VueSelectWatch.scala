package typings.vueSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueSelectWatch extends js.Object {
  def created(): Unit = js.native
  def multiple(reset: Boolean): Unit = js.native
  def mutableOptions(): Unit = js.native
  def mutableValue(`val`: js.Any, old: js.Any): Unit = js.native
  def options(`val`: js.Any): Unit = js.native
  def value(`val`: js.Any): Unit = js.native
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
  @scala.inline
  implicit class VueSelectWatchOps[Self <: VueSelectWatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreated(value: () => Unit): Self = this.set("created", js.Any.fromFunction0(value))
    @scala.inline
    def setMultiple(value: Boolean => Unit): Self = this.set("multiple", js.Any.fromFunction1(value))
    @scala.inline
    def setMutableOptions(value: () => Unit): Self = this.set("mutableOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setMutableValue(value: (js.Any, js.Any) => Unit): Self = this.set("mutableValue", js.Any.fromFunction2(value))
    @scala.inline
    def setOptions(value: js.Any => Unit): Self = this.set("options", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: js.Any => Unit): Self = this.set("value", js.Any.fromFunction1(value))
  }
  
}

