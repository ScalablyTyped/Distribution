package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOptionsCount extends StObject {
  
  def exists(): Boolean
  
  def getOptionsCount(): js.Any
  
  def getSelectedOptionsCount(): Double
  
  def optionAt(index: Double): ClassName
  
  def triggerMouseDown(): js.Any
}
object GetOptionsCount {
  
  @scala.inline
  def apply(
    exists: () => Boolean,
    getOptionsCount: () => js.Any,
    getSelectedOptionsCount: () => Double,
    optionAt: Double => ClassName,
    triggerMouseDown: () => js.Any
  ): GetOptionsCount = {
    val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getOptionsCount = js.Any.fromFunction0(getOptionsCount), getSelectedOptionsCount = js.Any.fromFunction0(getSelectedOptionsCount), optionAt = js.Any.fromFunction1(optionAt), triggerMouseDown = js.Any.fromFunction0(triggerMouseDown))
    __obj.asInstanceOf[GetOptionsCount]
  }
  
  @scala.inline
  implicit class GetOptionsCountMutableBuilder[Self <: GetOptionsCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOptionsCount(value: () => js.Any): Self = StObject.set(x, "getOptionsCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedOptionsCount(value: () => Double): Self = StObject.set(x, "getSelectedOptionsCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptionAt(value: Double => ClassName): Self = StObject.set(x, "optionAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTriggerMouseDown(value: () => js.Any): Self = StObject.set(x, "triggerMouseDown", js.Any.fromFunction0(value))
  }
}
