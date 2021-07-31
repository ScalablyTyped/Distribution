package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconExists extends StObject {
  
  def click(): js.Any
  
  def exists(): Boolean
  
  def iconExists(): Boolean
  
  def isChecked(): Boolean
  
  def isDisabled(): Boolean
  
  def isFocusVisible(): Boolean
  
  def isFocused(): Boolean
  
  def isInputFocused(): Boolean
  
  def isRequired(): Boolean
  
  def keyDown(key: String): js.Any
  
  def labelExists(): Boolean
  
  def name(): String
  
  def select(): js.Any
  
  def value(): String
}
object IconExists {
  
  @scala.inline
  def apply(
    click: () => js.Any,
    exists: () => Boolean,
    iconExists: () => Boolean,
    isChecked: () => Boolean,
    isDisabled: () => Boolean,
    isFocusVisible: () => Boolean,
    isFocused: () => Boolean,
    isInputFocused: () => Boolean,
    isRequired: () => Boolean,
    keyDown: String => js.Any,
    labelExists: () => Boolean,
    name: () => String,
    select: () => js.Any,
    value: () => String
  ): IconExists = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), iconExists = js.Any.fromFunction0(iconExists), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled), isFocusVisible = js.Any.fromFunction0(isFocusVisible), isFocused = js.Any.fromFunction0(isFocused), isInputFocused = js.Any.fromFunction0(isInputFocused), isRequired = js.Any.fromFunction0(isRequired), keyDown = js.Any.fromFunction1(keyDown), labelExists = js.Any.fromFunction0(labelExists), name = js.Any.fromFunction0(name), select = js.Any.fromFunction0(select), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[IconExists]
  }
  
  @scala.inline
  implicit class IconExistsMutableBuilder[Self <: IconExists] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: () => js.Any): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIconExists(value: () => Boolean): Self = StObject.set(x, "iconExists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsChecked(value: () => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFocusVisible(value: () => Boolean): Self = StObject.set(x, "isFocusVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFocused(value: () => Boolean): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInputFocused(value: () => Boolean): Self = StObject.set(x, "isInputFocused", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRequired(value: () => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeyDown(value: String => js.Any): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelExists(value: () => Boolean): Self = StObject.set(x, "labelExists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: () => String): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
  }
}
