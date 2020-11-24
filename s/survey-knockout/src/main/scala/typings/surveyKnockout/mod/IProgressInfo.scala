package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProgressInfo extends js.Object {
  
  var answeredQuestionCount: Double = js.native
  
  var questionCount: Double = js.native
  
  var requiredAnsweredQuestionCount: Double = js.native
  
  var requiredQuestionCount: Double = js.native
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
  implicit class IProgressInfoOps[Self <: IProgressInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnsweredQuestionCount(value: Double): Self = this.set("answeredQuestionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionCount(value: Double): Self = this.set("questionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredAnsweredQuestionCount(value: Double): Self = this.set("requiredAnsweredQuestionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredQuestionCount(value: Double): Self = this.set("requiredQuestionCount", value.asInstanceOf[js.Any])
  }
}
