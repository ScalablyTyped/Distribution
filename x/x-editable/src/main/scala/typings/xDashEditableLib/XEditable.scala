package typings
package xDashEditableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEditable extends js.Object {
  var options: XEditableOptions
  def activate(): scala.Unit
  def destroy(): scala.Unit
  def disable(): scala.Unit
  def enable(): scala.Unit
  def getValue(isSingle: scala.Boolean): js.Any
  def hide(): scala.Unit
  def option(key: js.Any, value: js.Any): scala.Unit
  def setValue(value: js.Any, convertStr: scala.Boolean): scala.Unit
  def show(closeAll: scala.Boolean): scala.Unit
  def submit(options: XEditableSubmitOptions): scala.Unit
  def toggle(closeAll: scala.Boolean): scala.Unit
  def toggleDisabled(): scala.Unit
  def validate(): scala.Unit
}

object XEditable {
  @scala.inline
  def apply(
    activate: () => scala.Unit,
    destroy: () => scala.Unit,
    disable: () => scala.Unit,
    enable: () => scala.Unit,
    getValue: scala.Boolean => js.Any,
    hide: () => scala.Unit,
    option: (js.Any, js.Any) => scala.Unit,
    options: XEditableOptions,
    setValue: (js.Any, scala.Boolean) => scala.Unit,
    show: scala.Boolean => scala.Unit,
    submit: XEditableSubmitOptions => scala.Unit,
    toggle: scala.Boolean => scala.Unit,
    toggleDisabled: () => scala.Unit,
    validate: () => scala.Unit
  ): XEditable = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getValue = js.Any.fromFunction1(getValue), hide = js.Any.fromFunction0(hide), option = js.Any.fromFunction2(option), options = options, setValue = js.Any.fromFunction2(setValue), show = js.Any.fromFunction1(show), submit = js.Any.fromFunction1(submit), toggle = js.Any.fromFunction1(toggle), toggleDisabled = js.Any.fromFunction0(toggleDisabled), validate = js.Any.fromFunction0(validate))
  
    __obj.asInstanceOf[XEditable]
  }
}

