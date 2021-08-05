package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAttribute extends StObject {
  
  def click(): js.Promise[Unit]
  
  def element(): js.Promise[js.Any]
  
  def exists(): js.Promise[Boolean]
  
  def getAttribute(name: String): js.Promise[String]
  
  def getLabelTextContent(): js.Promise[String]
  
  def getValue(): js.Promise[String]
  
  def hasError(): js.Promise[Boolean]
  
  def isCompleted(): js.Promise[Boolean]
  
  def isErrorIconDisplayed(): js.Promise[Boolean]
  
  def isLabelDisplayed(): js.Promise[Boolean]
  
  def isPercentagesProgressDisplayed(): js.Promise[Boolean]
  
  def isSuccessIconDisplayed(): js.Promise[Boolean]
}
object GetAttribute {
  
  inline def apply(
    click: () => js.Promise[Unit],
    element: () => js.Promise[js.Any],
    exists: () => js.Promise[Boolean],
    getAttribute: String => js.Promise[String],
    getLabelTextContent: () => js.Promise[String],
    getValue: () => js.Promise[String],
    hasError: () => js.Promise[Boolean],
    isCompleted: () => js.Promise[Boolean],
    isErrorIconDisplayed: () => js.Promise[Boolean],
    isLabelDisplayed: () => js.Promise[Boolean],
    isPercentagesProgressDisplayed: () => js.Promise[Boolean],
    isSuccessIconDisplayed: () => js.Promise[Boolean]
  ): GetAttribute = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAttribute = js.Any.fromFunction1(getAttribute), getLabelTextContent = js.Any.fromFunction0(getLabelTextContent), getValue = js.Any.fromFunction0(getValue), hasError = js.Any.fromFunction0(hasError), isCompleted = js.Any.fromFunction0(isCompleted), isErrorIconDisplayed = js.Any.fromFunction0(isErrorIconDisplayed), isLabelDisplayed = js.Any.fromFunction0(isLabelDisplayed), isPercentagesProgressDisplayed = js.Any.fromFunction0(isPercentagesProgressDisplayed), isSuccessIconDisplayed = js.Any.fromFunction0(isSuccessIconDisplayed))
    __obj.asInstanceOf[GetAttribute]
  }
  
  extension [Self <: GetAttribute](x: Self) {
    
    inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setElement(value: () => js.Promise[js.Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetAttribute(value: String => js.Promise[String]): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setGetLabelTextContent(value: () => js.Promise[String]): Self = StObject.set(x, "getLabelTextContent", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setHasError(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
    
    inline def setIsCompleted(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCompleted", js.Any.fromFunction0(value))
    
    inline def setIsErrorIconDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isErrorIconDisplayed", js.Any.fromFunction0(value))
    
    inline def setIsLabelDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLabelDisplayed", js.Any.fromFunction0(value))
    
    inline def setIsPercentagesProgressDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPercentagesProgressDisplayed", js.Any.fromFunction0(value))
    
    inline def setIsSuccessIconDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSuccessIconDisplayed", js.Any.fromFunction0(value))
  }
}
