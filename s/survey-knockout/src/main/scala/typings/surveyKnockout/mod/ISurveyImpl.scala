package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISurveyImpl extends StObject {
  
  def getSurvey(): ISurvey
  
  def getSurveyData(): ISurveyData
  
  def getTextProcessor(): ITextProcessor
}
object ISurveyImpl {
  
  inline def apply(getSurvey: () => ISurvey, getSurveyData: () => ISurveyData, getTextProcessor: () => ITextProcessor): ISurveyImpl = {
    val __obj = js.Dynamic.literal(getSurvey = js.Any.fromFunction0(getSurvey), getSurveyData = js.Any.fromFunction0(getSurveyData), getTextProcessor = js.Any.fromFunction0(getTextProcessor))
    __obj.asInstanceOf[ISurveyImpl]
  }
  
  extension [Self <: ISurveyImpl](x: Self) {
    
    inline def setGetSurvey(value: () => ISurvey): Self = StObject.set(x, "getSurvey", js.Any.fromFunction0(value))
    
    inline def setGetSurveyData(value: () => ISurveyData): Self = StObject.set(x, "getSurveyData", js.Any.fromFunction0(value))
    
    inline def setGetTextProcessor(value: () => ITextProcessor): Self = StObject.set(x, "getTextProcessor", js.Any.fromFunction0(value))
  }
}
