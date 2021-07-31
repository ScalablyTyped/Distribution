package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focus extends StObject {
  
  def blur(): js.Any
  
  def exists(): Boolean
  
  def focus(): js.Any
  
  def getInput(): js.Any
  
  def getPlaceholder(): js.Any
  
  def getPrefix(): js.Any
  
  def getSuffix(): js.Any
  
  def getValue(): js.Any
  
  def hasStyleState(stateName: js.Any): Boolean
  
  def isDisabled(): js.Any
  
  def isReadOnly(): js.Any
  
  def keyDown(key: js.Any): js.Any
  
  def setValue(value: js.Any): Unit
}
object Focus {
  
  @scala.inline
  def apply(
    blur: () => js.Any,
    exists: () => Boolean,
    focus: () => js.Any,
    getInput: () => js.Any,
    getPlaceholder: () => js.Any,
    getPrefix: () => js.Any,
    getSuffix: () => js.Any,
    getValue: () => js.Any,
    hasStyleState: js.Any => Boolean,
    isDisabled: () => js.Any,
    isReadOnly: () => js.Any,
    keyDown: js.Any => js.Any,
    setValue: js.Any => Unit
  ): Focus = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), exists = js.Any.fromFunction0(exists), focus = js.Any.fromFunction0(focus), getInput = js.Any.fromFunction0(getInput), getPlaceholder = js.Any.fromFunction0(getPlaceholder), getPrefix = js.Any.fromFunction0(getPrefix), getSuffix = js.Any.fromFunction0(getSuffix), getValue = js.Any.fromFunction0(getValue), hasStyleState = js.Any.fromFunction1(hasStyleState), isDisabled = js.Any.fromFunction0(isDisabled), isReadOnly = js.Any.fromFunction0(isReadOnly), keyDown = js.Any.fromFunction1(keyDown), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[Focus]
  }
  
  @scala.inline
  implicit class FocusMutableBuilder[Self <: Focus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlur(value: () => js.Any): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocus(value: () => js.Any): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInput(value: () => js.Any): Self = StObject.set(x, "getInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlaceholder(value: () => js.Any): Self = StObject.set(x, "getPlaceholder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrefix(value: () => js.Any): Self = StObject.set(x, "getPrefix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSuffix(value: () => js.Any): Self = StObject.set(x, "getSuffix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasStyleState(value: js.Any => Boolean): Self = StObject.set(x, "hasStyleState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDisabled(value: () => js.Any): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsReadOnly(value: () => js.Any): Self = StObject.set(x, "isReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeyDown(value: js.Any => js.Any): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: js.Any => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
