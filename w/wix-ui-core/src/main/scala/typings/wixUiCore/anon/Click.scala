package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Click extends StObject {
  
  def blur(): js.Any
  
  def click(): js.Any
  
  def clickOutside(): Unit
  
  def dropdownContentDisplayed(): Boolean
  
  def exists(): Boolean
  
  def focus(): js.Any
  
  def getArrowElement(): typings.std.Element
  
  def getArrowOffset(): Bottom
  
  def getContentElement(): js.Any
  
  def getElementId(): js.Any
  
  def getInput(): js.Any
  
  def getOptionsCount(): js.Any
  
  def getPlaceholder(): js.Any
  
  def getPrefix(): js.Any
  
  def getSelectedOptionsCount(): Double
  
  def getSuffix(): js.Any
  
  def getTargetElement(): typings.std.Element
  
  def getValue(): js.Any
  
  def hasStyleState(state: js.Any): Boolean
  
  def inlineStyles(): js.Any
  
  def isContentElementExists(): Boolean
  
  def isDisabled(): js.Any
  
  def isReadOnly(): js.Any
  
  def isTargetElementExists(): Boolean
  
  def keyDown(key: js.Any): js.Any
  
  def mouseEnter(): js.Any
  
  def mouseLeave(): js.Any
  
  def optionAt(index: Double): ClassName
  
  def setValue(value: js.Any): Unit
  
  def triggerMouseDownOnDropdownContent(): js.Any
}
object Click {
  
  @scala.inline
  def apply(
    blur: () => js.Any,
    click: () => js.Any,
    clickOutside: () => Unit,
    dropdownContentDisplayed: () => Boolean,
    exists: () => Boolean,
    focus: () => js.Any,
    getArrowElement: () => typings.std.Element,
    getArrowOffset: () => Bottom,
    getContentElement: () => js.Any,
    getElementId: () => js.Any,
    getInput: () => js.Any,
    getOptionsCount: () => js.Any,
    getPlaceholder: () => js.Any,
    getPrefix: () => js.Any,
    getSelectedOptionsCount: () => Double,
    getSuffix: () => js.Any,
    getTargetElement: () => typings.std.Element,
    getValue: () => js.Any,
    hasStyleState: js.Any => Boolean,
    inlineStyles: () => js.Any,
    isContentElementExists: () => Boolean,
    isDisabled: () => js.Any,
    isReadOnly: () => js.Any,
    isTargetElementExists: () => Boolean,
    keyDown: js.Any => js.Any,
    mouseEnter: () => js.Any,
    mouseLeave: () => js.Any,
    optionAt: Double => ClassName,
    setValue: js.Any => Unit,
    triggerMouseDownOnDropdownContent: () => js.Any
  ): Click = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), click = js.Any.fromFunction0(click), clickOutside = js.Any.fromFunction0(clickOutside), dropdownContentDisplayed = js.Any.fromFunction0(dropdownContentDisplayed), exists = js.Any.fromFunction0(exists), focus = js.Any.fromFunction0(focus), getArrowElement = js.Any.fromFunction0(getArrowElement), getArrowOffset = js.Any.fromFunction0(getArrowOffset), getContentElement = js.Any.fromFunction0(getContentElement), getElementId = js.Any.fromFunction0(getElementId), getInput = js.Any.fromFunction0(getInput), getOptionsCount = js.Any.fromFunction0(getOptionsCount), getPlaceholder = js.Any.fromFunction0(getPlaceholder), getPrefix = js.Any.fromFunction0(getPrefix), getSelectedOptionsCount = js.Any.fromFunction0(getSelectedOptionsCount), getSuffix = js.Any.fromFunction0(getSuffix), getTargetElement = js.Any.fromFunction0(getTargetElement), getValue = js.Any.fromFunction0(getValue), hasStyleState = js.Any.fromFunction1(hasStyleState), inlineStyles = js.Any.fromFunction0(inlineStyles), isContentElementExists = js.Any.fromFunction0(isContentElementExists), isDisabled = js.Any.fromFunction0(isDisabled), isReadOnly = js.Any.fromFunction0(isReadOnly), isTargetElementExists = js.Any.fromFunction0(isTargetElementExists), keyDown = js.Any.fromFunction1(keyDown), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave), optionAt = js.Any.fromFunction1(optionAt), setValue = js.Any.fromFunction1(setValue), triggerMouseDownOnDropdownContent = js.Any.fromFunction0(triggerMouseDownOnDropdownContent))
    __obj.asInstanceOf[Click]
  }
  
  @scala.inline
  implicit class ClickMutableBuilder[Self <: Click] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlur(value: () => js.Any): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClick(value: () => js.Any): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClickOutside(value: () => Unit): Self = StObject.set(x, "clickOutside", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDropdownContentDisplayed(value: () => Boolean): Self = StObject.set(x, "dropdownContentDisplayed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocus(value: () => js.Any): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetArrowElement(value: () => typings.std.Element): Self = StObject.set(x, "getArrowElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetArrowOffset(value: () => Bottom): Self = StObject.set(x, "getArrowOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContentElement(value: () => js.Any): Self = StObject.set(x, "getContentElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElementId(value: () => js.Any): Self = StObject.set(x, "getElementId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInput(value: () => js.Any): Self = StObject.set(x, "getInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOptionsCount(value: () => js.Any): Self = StObject.set(x, "getOptionsCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlaceholder(value: () => js.Any): Self = StObject.set(x, "getPlaceholder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrefix(value: () => js.Any): Self = StObject.set(x, "getPrefix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedOptionsCount(value: () => Double): Self = StObject.set(x, "getSelectedOptionsCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSuffix(value: () => js.Any): Self = StObject.set(x, "getSuffix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTargetElement(value: () => typings.std.Element): Self = StObject.set(x, "getTargetElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasStyleState(value: js.Any => Boolean): Self = StObject.set(x, "hasStyleState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInlineStyles(value: () => js.Any): Self = StObject.set(x, "inlineStyles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsContentElementExists(value: () => Boolean): Self = StObject.set(x, "isContentElementExists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDisabled(value: () => js.Any): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsReadOnly(value: () => js.Any): Self = StObject.set(x, "isReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTargetElementExists(value: () => Boolean): Self = StObject.set(x, "isTargetElementExists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeyDown(value: js.Any => js.Any): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseEnter(value: () => js.Any): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMouseLeave(value: () => js.Any): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptionAt(value: Double => ClassName): Self = StObject.set(x, "optionAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: js.Any => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTriggerMouseDownOnDropdownContent(value: () => js.Any): Self = StObject.set(x, "triggerMouseDownOnDropdownContent", js.Any.fromFunction0(value))
  }
}
