package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Click extends StObject {
  
  /**
    * Removes focus on the element
    * @returns {Promise<void>}
    */
  def blur(): js.Promise[Unit]
  
  def click(): js.Promise[Unit]
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  /**
    * Sets focus on the element
    * @returns {Promise<void>}
    */
  def focus(): js.Promise[Unit]
  
  /**
    * Gets AddItem subtitle
    * @return {Promise<string>}
    */
  def getSubtitle(): js.Promise[String]
  
  /**
    * Gets AddItem text
    * @return {Promise<string>}
    */
  def getText(): js.Promise[String]
  
  /**
    * Gets tooltip text
    * @return {Promise<string | null>}
    */
  def getTooltipContent(): js.Promise[String | Null]
  
  /**
    * Checks whether AddItem is focused
    * @returns {Promise<boolean>}
    */
  def isFocused(): js.Promise[Boolean]
  
  /**
    * Checks whether AddItem text exist
    * @returns {Promise<boolean>}
    */
  def textExists(): js.Promise[Boolean]
}
object Click {
  
  inline def apply(
    blur: () => js.Promise[Unit],
    click: () => js.Promise[Unit],
    element: () => js.Promise[Any],
    exists: () => js.Promise[Boolean],
    focus: () => js.Promise[Unit],
    getSubtitle: () => js.Promise[String],
    getText: () => js.Promise[String],
    getTooltipContent: () => js.Promise[String | Null],
    isFocused: () => js.Promise[Boolean],
    textExists: () => js.Promise[Boolean]
  ): Click = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), focus = js.Any.fromFunction0(focus), getSubtitle = js.Any.fromFunction0(getSubtitle), getText = js.Any.fromFunction0(getText), getTooltipContent = js.Any.fromFunction0(getTooltipContent), isFocused = js.Any.fromFunction0(isFocused), textExists = js.Any.fromFunction0(textExists))
    __obj.asInstanceOf[Click]
  }
  
  extension [Self <: Click](x: Self) {
    
    inline def setBlur(value: () => js.Promise[Unit]): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setElement(value: () => js.Promise[Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setFocus(value: () => js.Promise[Unit]): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    inline def setGetSubtitle(value: () => js.Promise[String]): Self = StObject.set(x, "getSubtitle", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setGetTooltipContent(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getTooltipContent", js.Any.fromFunction0(value))
    
    inline def setIsFocused(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
    
    inline def setTextExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "textExists", js.Any.fromFunction0(value))
  }
}
