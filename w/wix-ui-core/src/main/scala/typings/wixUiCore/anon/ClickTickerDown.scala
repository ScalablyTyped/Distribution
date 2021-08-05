package typings.wixUiCore.anon

import typings.std.CSSStyleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickTickerDown extends StObject {
  
  def blur(): js.Any
  
  def clickTickerDown(): js.Any
  
  def clickTickerUp(): js.Any
  
  def element(): js.Any
  
  def exists(): Boolean
  
  def focus(): js.Any
  
  def getInlineStyle(): CSSStyleDeclaration
  
  def getInputElement(): js.Any
  
  def getInputType(): js.Any
  
  def getTickers(): js.Any
  
  def getValue(): js.Any
  
  def isDisabled(): js.Any
  
  def keyDown(key: js.Any): js.Any
  
  def setValue(value: js.Any): Unit
}
object ClickTickerDown {
  
  inline def apply(
    blur: () => js.Any,
    clickTickerDown: () => js.Any,
    clickTickerUp: () => js.Any,
    element: () => js.Any,
    exists: () => Boolean,
    focus: () => js.Any,
    getInlineStyle: () => CSSStyleDeclaration,
    getInputElement: () => js.Any,
    getInputType: () => js.Any,
    getTickers: () => js.Any,
    getValue: () => js.Any,
    isDisabled: () => js.Any,
    keyDown: js.Any => js.Any,
    setValue: js.Any => Unit
  ): ClickTickerDown = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), clickTickerDown = js.Any.fromFunction0(clickTickerDown), clickTickerUp = js.Any.fromFunction0(clickTickerUp), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), focus = js.Any.fromFunction0(focus), getInlineStyle = js.Any.fromFunction0(getInlineStyle), getInputElement = js.Any.fromFunction0(getInputElement), getInputType = js.Any.fromFunction0(getInputType), getTickers = js.Any.fromFunction0(getTickers), getValue = js.Any.fromFunction0(getValue), isDisabled = js.Any.fromFunction0(isDisabled), keyDown = js.Any.fromFunction1(keyDown), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[ClickTickerDown]
  }
  
  extension [Self <: ClickTickerDown](x: Self) {
    
    inline def setBlur(value: () => js.Any): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    inline def setClickTickerDown(value: () => js.Any): Self = StObject.set(x, "clickTickerDown", js.Any.fromFunction0(value))
    
    inline def setClickTickerUp(value: () => js.Any): Self = StObject.set(x, "clickTickerUp", js.Any.fromFunction0(value))
    
    inline def setElement(value: () => js.Any): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setFocus(value: () => js.Any): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    inline def setGetInlineStyle(value: () => CSSStyleDeclaration): Self = StObject.set(x, "getInlineStyle", js.Any.fromFunction0(value))
    
    inline def setGetInputElement(value: () => js.Any): Self = StObject.set(x, "getInputElement", js.Any.fromFunction0(value))
    
    inline def setGetInputType(value: () => js.Any): Self = StObject.set(x, "getInputType", js.Any.fromFunction0(value))
    
    inline def setGetTickers(value: () => js.Any): Self = StObject.set(x, "getTickers", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setIsDisabled(value: () => js.Any): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    
    inline def setKeyDown(value: js.Any => js.Any): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: js.Any => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
