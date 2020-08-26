package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQuestionPanelDynamicData extends js.Object {
  def getItemIndex(item: ISurveyData): Double = js.native
  def getPanelItemData(item: ISurveyData): js.Any = js.native
  def getRootData(): ISurveyData = js.native
  def getSharedQuestionFromArray(name: String, panelIndex: Double): Question = js.native
  def getSurvey(): ISurvey = js.native
  def setPanelItemData(item: ISurveyData, name: String, `val`: js.Any): js.Any = js.native
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
  implicit class IQuestionPanelDynamicDataOps[Self <: IQuestionPanelDynamicData] (val x: Self) extends AnyVal {
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
    def setGetItemIndex(value: ISurveyData => Double): Self = this.set("getItemIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPanelItemData(value: ISurveyData => js.Any): Self = this.set("getPanelItemData", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRootData(value: () => ISurveyData): Self = this.set("getRootData", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSharedQuestionFromArray(value: (String, Double) => Question): Self = this.set("getSharedQuestionFromArray", js.Any.fromFunction2(value))
    @scala.inline
    def setGetSurvey(value: () => ISurvey): Self = this.set("getSurvey", js.Any.fromFunction0(value))
    @scala.inline
    def setSetPanelItemData(value: (ISurveyData, String, js.Any) => js.Any): Self = this.set("setPanelItemData", js.Any.fromFunction3(value))
  }
  
}

