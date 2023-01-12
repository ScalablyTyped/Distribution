package typings.xEditable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XEditable extends StObject {
  
  def activate(): Unit
  
  def destroy(): Unit
  
  def disable(): Unit
  
  def enable(): Unit
  
  def getValue(isSingle: Boolean): Any
  
  def hide(): Unit
  
  def option(key: Any, value: Any): Unit
  
  var options: XEditableOptions
  
  def setValue(value: Any, convertStr: Boolean): Unit
  
  def show(closeAll: Boolean): Unit
  
  def submit(options: XEditableSubmitOptions): Unit
  
  def toggle(closeAll: Boolean): Unit
  
  def toggleDisabled(): Unit
  
  def validate(): Unit
}
object XEditable {
  
  inline def apply(
    activate: () => Unit,
    destroy: () => Unit,
    disable: () => Unit,
    enable: () => Unit,
    getValue: Boolean => Any,
    hide: () => Unit,
    option: (Any, Any) => Unit,
    options: XEditableOptions,
    setValue: (Any, Boolean) => Unit,
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
  implicit open class MutableBuilder[Self <: XEditable] (val x: Self) extends AnyVal {
    
    inline def setActivate(value: () => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: Boolean => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setOption(value: (Any, Any) => Unit): Self = StObject.set(x, "option", js.Any.fromFunction2(value))
    
    inline def setOptions(value: XEditableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSetValue(value: (Any, Boolean) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    
    inline def setShow(value: Boolean => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    inline def setSubmit(value: XEditableSubmitOptions => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction1(value))
    
    inline def setToggle(value: Boolean => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
    
    inline def setToggleDisabled(value: () => Unit): Self = StObject.set(x, "toggleDisabled", js.Any.fromFunction0(value))
    
    inline def setValidate(value: () => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
  }
}
