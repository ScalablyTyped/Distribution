package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISurveyTriggerOwner extends StObject {
  
  def canBeCompleted(): Unit
  
  def copyTriggerValue(name: String, fromName: String): Any
  
  def focusQuestion(name: String): Boolean
  
  def getObjects(pages: Any, questions: Any): js.Array[Any]
  
  def setCompleted(): Unit
  
  def setTriggerValue(name: String, value: Any, isVariable: Boolean): Any
  
  def triggerExecuted(trigger: Trigger): Unit
}
object ISurveyTriggerOwner {
  
  inline def apply(
    canBeCompleted: () => Unit,
    copyTriggerValue: (String, String) => Any,
    focusQuestion: String => Boolean,
    getObjects: (Any, Any) => js.Array[Any],
    setCompleted: () => Unit,
    setTriggerValue: (String, Any, Boolean) => Any,
    triggerExecuted: Trigger => Unit
  ): ISurveyTriggerOwner = {
    val __obj = js.Dynamic.literal(canBeCompleted = js.Any.fromFunction0(canBeCompleted), copyTriggerValue = js.Any.fromFunction2(copyTriggerValue), focusQuestion = js.Any.fromFunction1(focusQuestion), getObjects = js.Any.fromFunction2(getObjects), setCompleted = js.Any.fromFunction0(setCompleted), setTriggerValue = js.Any.fromFunction3(setTriggerValue), triggerExecuted = js.Any.fromFunction1(triggerExecuted))
    __obj.asInstanceOf[ISurveyTriggerOwner]
  }
  
  extension [Self <: ISurveyTriggerOwner](x: Self) {
    
    inline def setCanBeCompleted(value: () => Unit): Self = StObject.set(x, "canBeCompleted", js.Any.fromFunction0(value))
    
    inline def setCopyTriggerValue(value: (String, String) => Any): Self = StObject.set(x, "copyTriggerValue", js.Any.fromFunction2(value))
    
    inline def setFocusQuestion(value: String => Boolean): Self = StObject.set(x, "focusQuestion", js.Any.fromFunction1(value))
    
    inline def setGetObjects(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "getObjects", js.Any.fromFunction2(value))
    
    inline def setSetCompleted(value: () => Unit): Self = StObject.set(x, "setCompleted", js.Any.fromFunction0(value))
    
    inline def setSetTriggerValue(value: (String, Any, Boolean) => Any): Self = StObject.set(x, "setTriggerValue", js.Any.fromFunction3(value))
    
    inline def setTriggerExecuted(value: Trigger => Unit): Self = StObject.set(x, "triggerExecuted", js.Any.fromFunction1(value))
  }
}
