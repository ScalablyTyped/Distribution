package typings.xEditable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XEditable extends StObject {
  
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
  implicit class XEditableMutableBuilder[Self <: XEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: () => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: Boolean => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOption(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "option", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions(value: XEditableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetValue(value: (js.Any, Boolean) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShow(value: Boolean => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubmit(value: XEditableSubmitOptions => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggle(value: Boolean => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleDisabled(value: () => Unit): Self = StObject.set(x, "toggleDisabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidate(value: () => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
  }
}
