package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParentElement extends StObject {
  
  def addElement(element: IElement, index: Double): js.Any
  
  var isReadOnly: Boolean
  
  def removeElement(element: IElement): Boolean
}
object IParentElement {
  
  inline def apply(addElement: (IElement, Double) => js.Any, isReadOnly: Boolean, removeElement: IElement => Boolean): IParentElement = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction2(addElement), isReadOnly = isReadOnly.asInstanceOf[js.Any], removeElement = js.Any.fromFunction1(removeElement))
    __obj.asInstanceOf[IParentElement]
  }
  
  extension [Self <: IParentElement](x: Self) {
    
    inline def setAddElement(value: (IElement, Double) => js.Any): Self = StObject.set(x, "addElement", js.Any.fromFunction2(value))
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    inline def setRemoveElement(value: IElement => Boolean): Self = StObject.set(x, "removeElement", js.Any.fromFunction1(value))
  }
}
