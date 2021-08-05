package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISurveyImpl extends StObject {
  
  def geSurveyData(): ISurveyData
  
  def getSurvey(): ISurvey
  
  def getTextProcessor(): ITextProcessor
}
object ISurveyImpl {
  
  inline def apply(geSurveyData: () => ISurveyData, getSurvey: () => ISurvey, getTextProcessor: () => ITextProcessor): ISurveyImpl = {
    val __obj = js.Dynamic.literal(geSurveyData = js.Any.fromFunction0(geSurveyData), getSurvey = js.Any.fromFunction0(getSurvey), getTextProcessor = js.Any.fromFunction0(getTextProcessor))
    __obj.asInstanceOf[ISurveyImpl]
  }
  
  extension [Self <: ISurveyImpl](x: Self) {
    
    inline def setGeSurveyData(value: () => ISurveyData): Self = StObject.set(x, "geSurveyData", js.Any.fromFunction0(value))
    
    inline def setGetSurvey(value: () => ISurvey): Self = StObject.set(x, "getSurvey", js.Any.fromFunction0(value))
    
    inline def setGetTextProcessor(value: () => ITextProcessor): Self = StObject.set(x, "getTextProcessor", js.Any.fromFunction0(value))
  }
}
