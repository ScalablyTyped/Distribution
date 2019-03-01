package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultipleTextData
  extends IPanel
     with ILocalizableOwner {
  def getAllValues(): js.Any
  def getIsRequiredText(): java.lang.String
  def getMultipleTextValue(name: java.lang.String): js.Any
  def getSurvey(): ISurvey
  def getTextProcessor(): ITextProcessor
  def setMultipleTextValue(name: java.lang.String, value: js.Any): js.Any
}

object IMultipleTextData {
  @scala.inline
  def apply(
    addElement: js.Function2[IElement, scala.Double, js.Any],
    elementWidthChanged: js.Function1[IElement, js.Any],
    getAllValues: js.Function0[js.Any],
    getChildrenLayoutType: js.Function0[java.lang.String],
    getIsRequiredText: js.Function0[java.lang.String],
    getLocale: js.Function0[java.lang.String],
    getMarkdownHtml: js.Function1[java.lang.String, java.lang.String],
    getMultipleTextValue: js.Function1[java.lang.String, js.Any],
    getProcessedText: js.Function1[java.lang.String, java.lang.String],
    getQuestionTitleLocation: js.Function0[java.lang.String],
    getSurvey: js.Function0[ISurvey],
    getTextProcessor: js.Function0[ITextProcessor],
    getType: js.Function0[java.lang.String],
    isPage: scala.Boolean,
    isReadOnly: scala.Boolean,
    isVisible: scala.Boolean,
    locStrsChanged: js.Function0[js.Any],
    name: java.lang.String,
    onFirstRendering: js.Function0[js.Any],
    onSurveyLoad: js.Function0[js.Any],
    parent: IPanel,
    removeElement: js.Function1[IElement, scala.Boolean],
    setMultipleTextValue: js.Function2[java.lang.String, js.Any, js.Any],
    setSurveyImpl: js.Function1[ISurveyImpl, js.Any],
    setVisibleIndex: js.Function1[scala.Double, scala.Double]
  ): IMultipleTextData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addElement")(addElement)
    __obj.updateDynamic("elementWidthChanged")(elementWidthChanged)
    __obj.updateDynamic("getAllValues")(getAllValues)
    __obj.updateDynamic("getChildrenLayoutType")(getChildrenLayoutType)
    __obj.updateDynamic("getIsRequiredText")(getIsRequiredText)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("getMarkdownHtml")(getMarkdownHtml)
    __obj.updateDynamic("getMultipleTextValue")(getMultipleTextValue)
    __obj.updateDynamic("getProcessedText")(getProcessedText)
    __obj.updateDynamic("getQuestionTitleLocation")(getQuestionTitleLocation)
    __obj.updateDynamic("getSurvey")(getSurvey)
    __obj.updateDynamic("getTextProcessor")(getTextProcessor)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("isPage")(isPage)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("isVisible")(isVisible)
    __obj.updateDynamic("locStrsChanged")(locStrsChanged)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("onFirstRendering")(onFirstRendering)
    __obj.updateDynamic("onSurveyLoad")(onSurveyLoad)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("removeElement")(removeElement)
    __obj.updateDynamic("setMultipleTextValue")(setMultipleTextValue)
    __obj.updateDynamic("setSurveyImpl")(setSurveyImpl)
    __obj.updateDynamic("setVisibleIndex")(setVisibleIndex)
    __obj.asInstanceOf[IMultipleTextData]
  }
}

