package typings.xDashEditable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEditable extends js.Object {
  var options: XEditableOptions
  def activate(): Unit
  def destroy(): Unit
  def disable(): Unit
  def enable(): Unit
  def getValue(isSingle: Boolean): js.Any
  def hide(): Unit
  def option(key: js.Any, value: js.Any): Unit
  def setValue(value: js.Any, convertStr: Boolean): Unit
  def show(closeAll: Boolean): Unit
  def submit(options: XEditableSubmitOptions): Unit
  def toggle(closeAll: Boolean): Unit
  def toggleDisabled(): Unit
  def validate(): Unit
}

object XEditable {
  @scala.inline
  def apply(
    activate: () => Unit,
    destroy: () => Unit,
    disable: () => Unit,
    enable: () => Unit,
    getValue: Boolean => js.Any,
    hide: () => Unit,
    option: (js.Any, js.Any) => Unit,
    options: XEditableOptions,
    setValue: (js.Any, Boolean) => Unit,
    show: Boolean => Unit,
    submit: XEditableSubmitOptions => Unit,
    toggle: Boolean => Unit,
    toggleDisabled: () => Unit,
    validate: () => Unit
  ): XEditable = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getValue = js.Any.fromFunction1(getValue), hide = js.Any.fromFunction0(hide), option = js.Any.fromFunction2(option), options = options, setValue = js.Any.fromFunction2(setValue), show = js.Any.fromFunction1(show), submit = js.Any.fromFunction1(submit), toggle = js.Any.fromFunction1(toggle), toggleDisabled = js.Any.fromFunction0(toggleDisabled), validate = js.Any.fromFunction0(validate))
  
    __obj.asInstanceOf[XEditable]
  }
}

