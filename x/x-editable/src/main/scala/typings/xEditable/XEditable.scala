package typings.xEditable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XEditable extends js.Object {
  
  def activate(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def getValue(isSingle: Boolean): js.Any = js.native
  
  def hide(): Unit = js.native
  
  def option(key: js.Any, value: js.Any): Unit = js.native
  
  var options: XEditableOptions = js.native
  
  def setValue(value: js.Any, convertStr: Boolean): Unit = js.native
  
  def show(closeAll: Boolean): Unit = js.native
  
  def submit(options: XEditableSubmitOptions): Unit = js.native
  
  def toggle(closeAll: Boolean): Unit = js.native
  
  def toggleDisabled(): Unit = js.native
  
  def validate(): Unit = js.native
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
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getValue = js.Any.fromFunction1(getValue), hide = js.Any.fromFunction0(hide), option = js.Any.fromFunction2(option), options = options.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue), show = js.Any.fromFunction1(show), submit = js.Any.fromFunction1(submit), toggle = js.Any.fromFunction1(toggle), toggleDisabled = js.Any.fromFunction0(toggleDisabled), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[XEditable]
  }
  
  @scala.inline
  implicit class XEditableOps[Self <: XEditable] (val x: Self) extends AnyVal {
    
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
    def setActivate(value: () => Unit): Self = this.set("activate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: Boolean => js.Any): Self = this.set("getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOption(value: (js.Any, js.Any) => Unit): Self = this.set("option", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions(value: XEditableOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetValue(value: (js.Any, Boolean) => Unit): Self = this.set("setValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShow(value: Boolean => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubmit(value: XEditableSubmitOptions => Unit): Self = this.set("submit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggle(value: Boolean => Unit): Self = this.set("toggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleDisabled(value: () => Unit): Self = this.set("toggleDisabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidate(value: () => Unit): Self = this.set("validate", js.Any.fromFunction0(value))
  }
}
