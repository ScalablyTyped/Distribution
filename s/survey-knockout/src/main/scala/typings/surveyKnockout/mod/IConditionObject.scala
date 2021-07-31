package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConditionObject extends StObject {
  
  var name: String
  
  var question: Question
  
  var text: String
}
object IConditionObject {
  
  @scala.inline
  def apply(name: String, question: Question, text: String): IConditionObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConditionObject]
  }
  
  @scala.inline
  implicit class IConditionObjectMutableBuilder[Self <: IConditionObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: Question): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
