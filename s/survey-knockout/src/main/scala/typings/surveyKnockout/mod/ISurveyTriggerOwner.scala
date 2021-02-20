package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISurveyTriggerOwner extends StObject {
  
  def copyTriggerValue(name: String, fromName: String): js.Any = js.native
  
  def focusQuestion(name: String): Boolean = js.native
  
  def getObjects(pages: js.Array[String], questions: js.Array[String]): js.Array[_] = js.native
  
  def setCompleted(): js.Any = js.native
  
  def setTriggerValue(name: String, value: js.Any, isVariable: Boolean): js.Any = js.native
}
object ISurveyTriggerOwner {
  
  @scala.inline
  def apply(
    copyTriggerValue: (String, String) => js.Any,
    focusQuestion: String => Boolean,
    getObjects: (js.Array[String], js.Array[String]) => js.Array[_],
    setCompleted: () => js.Any,
    setTriggerValue: (String, js.Any, Boolean) => js.Any
  ): ISurveyTriggerOwner = {
    val __obj = js.Dynamic.literal(copyTriggerValue = js.Any.fromFunction2(copyTriggerValue), focusQuestion = js.Any.fromFunction1(focusQuestion), getObjects = js.Any.fromFunction2(getObjects), setCompleted = js.Any.fromFunction0(setCompleted), setTriggerValue = js.Any.fromFunction3(setTriggerValue))
    __obj.asInstanceOf[ISurveyTriggerOwner]
  }
  
  @scala.inline
  implicit class ISurveyTriggerOwnerMutableBuilder[Self <: ISurveyTriggerOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyTriggerValue(value: (String, String) => js.Any): Self = StObject.set(x, "copyTriggerValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocusQuestion(value: String => Boolean): Self = StObject.set(x, "focusQuestion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetObjects(value: (js.Array[String], js.Array[String]) => js.Array[_]): Self = StObject.set(x, "getObjects", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetCompleted(value: () => js.Any): Self = StObject.set(x, "setCompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTriggerValue(value: (String, js.Any, Boolean) => js.Any): Self = StObject.set(x, "setTriggerValue", js.Any.fromFunction3(value))
  }
}
