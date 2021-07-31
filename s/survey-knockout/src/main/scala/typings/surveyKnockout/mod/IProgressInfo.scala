package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProgressInfo extends StObject {
  
  var answeredQuestionCount: Double
  
  var questionCount: Double
  
  var requiredAnsweredQuestionCount: Double
  
  var requiredQuestionCount: Double
}
object IProgressInfo {
  
  @scala.inline
  def apply(
    answeredQuestionCount: Double,
    questionCount: Double,
    requiredAnsweredQuestionCount: Double,
    requiredQuestionCount: Double
  ): IProgressInfo = {
    val __obj = js.Dynamic.literal(answeredQuestionCount = answeredQuestionCount.asInstanceOf[js.Any], questionCount = questionCount.asInstanceOf[js.Any], requiredAnsweredQuestionCount = requiredAnsweredQuestionCount.asInstanceOf[js.Any], requiredQuestionCount = requiredQuestionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressInfo]
  }
  
  @scala.inline
  implicit class IProgressInfoMutableBuilder[Self <: IProgressInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnsweredQuestionCount(value: Double): Self = StObject.set(x, "answeredQuestionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionCount(value: Double): Self = StObject.set(x, "questionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredAnsweredQuestionCount(value: Double): Self = StObject.set(x, "requiredAnsweredQuestionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredQuestionCount(value: Double): Self = StObject.set(x, "requiredQuestionCount", value.asInstanceOf[js.Any])
  }
}
