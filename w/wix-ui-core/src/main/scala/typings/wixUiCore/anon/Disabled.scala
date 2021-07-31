package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled extends StObject {
  
  var disabled: Boolean
  
  def onBlur(): js.Any
  
  def onChange(): js.Any
  
  def onFocus(): js.Any
  
  var required: Boolean
}
object Disabled {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    onBlur: () => js.Any,
    onChange: () => js.Any,
    onFocus: () => js.Any,
    required: Boolean
  ): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  
  @scala.inline
  implicit class DisabledMutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(value: () => js.Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnChange(value: () => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFocus(value: () => js.Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
