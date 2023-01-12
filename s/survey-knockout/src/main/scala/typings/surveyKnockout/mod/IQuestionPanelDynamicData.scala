package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQuestionPanelDynamicData extends StObject {
  
  def getItemIndex(item: ISurveyData): Double
  
  def getPanelItemData(item: ISurveyData): Any
  
  def getRootData(): ISurveyData
  
  def getSharedQuestionFromArray(name: String, panelIndex: Double): Question
  
  def getSurvey(): ISurvey
  
  def setPanelItemData(item: ISurveyData, name: String, `val`: Any): Any
}
object IQuestionPanelDynamicData {
  
  inline def apply(
    getItemIndex: ISurveyData => Double,
    getPanelItemData: ISurveyData => Any,
    getRootData: () => ISurveyData,
    getSharedQuestionFromArray: (String, Double) => Question,
    getSurvey: () => ISurvey,
    setPanelItemData: (ISurveyData, String, Any) => Any
  ): IQuestionPanelDynamicData = {
    val __obj = js.Dynamic.literal(getItemIndex = js.Any.fromFunction1(getItemIndex), getPanelItemData = js.Any.fromFunction1(getPanelItemData), getRootData = js.Any.fromFunction0(getRootData), getSharedQuestionFromArray = js.Any.fromFunction2(getSharedQuestionFromArray), getSurvey = js.Any.fromFunction0(getSurvey), setPanelItemData = js.Any.fromFunction3(setPanelItemData))
    __obj.asInstanceOf[IQuestionPanelDynamicData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IQuestionPanelDynamicData] (val x: Self) extends AnyVal {
    
    inline def setGetItemIndex(value: ISurveyData => Double): Self = StObject.set(x, "getItemIndex", js.Any.fromFunction1(value))
    
    inline def setGetPanelItemData(value: ISurveyData => Any): Self = StObject.set(x, "getPanelItemData", js.Any.fromFunction1(value))
    
    inline def setGetRootData(value: () => ISurveyData): Self = StObject.set(x, "getRootData", js.Any.fromFunction0(value))
    
    inline def setGetSharedQuestionFromArray(value: (String, Double) => Question): Self = StObject.set(x, "getSharedQuestionFromArray", js.Any.fromFunction2(value))
    
    inline def setGetSurvey(value: () => ISurvey): Self = StObject.set(x, "getSurvey", js.Any.fromFunction0(value))
    
    inline def setSetPanelItemData(value: (ISurveyData, String, Any) => Any): Self = StObject.set(x, "setPanelItemData", js.Any.fromFunction3(value))
  }
}
