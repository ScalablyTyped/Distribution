package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISurveyImpl extends js.Object {
  
  def geSurveyData(): ISurveyData = js.native
  
  def getSurvey(): ISurvey = js.native
  
  def getTextProcessor(): ITextProcessor = js.native
}
object ISurveyImpl {
  
  @scala.inline
  def apply(geSurveyData: () => ISurveyData, getSurvey: () => ISurvey, getTextProcessor: () => ITextProcessor): ISurveyImpl = {
    val __obj = js.Dynamic.literal(geSurveyData = js.Any.fromFunction0(geSurveyData), getSurvey = js.Any.fromFunction0(getSurvey), getTextProcessor = js.Any.fromFunction0(getTextProcessor))
    __obj.asInstanceOf[ISurveyImpl]
  }
  
  @scala.inline
  implicit class ISurveyImplOps[Self <: ISurveyImpl] (val x: Self) extends AnyVal {
    
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
    def setGeSurveyData(value: () => ISurveyData): Self = this.set("geSurveyData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSurvey(value: () => ISurvey): Self = this.set("getSurvey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextProcessor(value: () => ITextProcessor): Self = this.set("getTextProcessor", js.Any.fromFunction0(value))
  }
}
