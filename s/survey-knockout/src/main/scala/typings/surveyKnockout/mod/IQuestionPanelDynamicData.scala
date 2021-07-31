package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQuestionPanelDynamicData extends StObject {
  
  def getItemIndex(item: ISurveyData): Double
  
  def getPanelItemData(item: ISurveyData): js.Any
  
  def getRootData(): ISurveyData
  
  def getSharedQuestionFromArray(name: String, panelIndex: Double): Question
  
  def getSurvey(): ISurvey
  
  def setPanelItemData(item: ISurveyData, name: String, `val`: js.Any): js.Any
}
object IQuestionPanelDynamicData {
  
  @scala.inline
  def apply(
    getItemIndex: ISurveyData => Double,
    getPanelItemData: ISurveyData => js.Any,
    getRootData: () => ISurveyData,
    getSharedQuestionFromArray: (String, Double) => Question,
    getSurvey: () => ISurvey,
    setPanelItemData: (ISurveyData, String, js.Any) => js.Any
  ): IQuestionPanelDynamicData = {
    val __obj = js.Dynamic.literal(getItemIndex = js.Any.fromFunction1(getItemIndex), getPanelItemData = js.Any.fromFunction1(getPanelItemData), getRootData = js.Any.fromFunction0(getRootData), getSharedQuestionFromArray = js.Any.fromFunction2(getSharedQuestionFromArray), getSurvey = js.Any.fromFunction0(getSurvey), setPanelItemData = js.Any.fromFunction3(setPanelItemData))
    __obj.asInstanceOf[IQuestionPanelDynamicData]
  }
  
  @scala.inline
  implicit class IQuestionPanelDynamicDataMutableBuilder[Self <: IQuestionPanelDynamicData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetItemIndex(value: ISurveyData => Double): Self = StObject.set(x, "getItemIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPanelItemData(value: ISurveyData => js.Any): Self = StObject.set(x, "getPanelItemData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRootData(value: () => ISurveyData): Self = StObject.set(x, "getRootData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSharedQuestionFromArray(value: (String, Double) => Question): Self = StObject.set(x, "getSharedQuestionFromArray", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSurvey(value: () => ISurvey): Self = StObject.set(x, "getSurvey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPanelItemData(value: (ISurveyData, String, js.Any) => js.Any): Self = StObject.set(x, "setPanelItemData", js.Any.fromFunction3(value))
  }
}
