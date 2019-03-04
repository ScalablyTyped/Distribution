package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPage
  extends IPanel
     with IConditionRunner

object IPage {
  @scala.inline
  def apply(
    addElement: js.Function2[IElement, scala.Double, js.Any],
    elementWidthChanged: js.Function1[IElement, js.Any],
    getChildrenLayoutType: js.Function0[java.lang.String],
    getQuestionTitleLocation: js.Function0[java.lang.String],
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
    runCondition: js.Function2[HashTable[_], HashTable[_], js.Any],
    setSurveyImpl: js.Function1[ISurveyImpl, js.Any],
    setVisibleIndex: js.Function1[scala.Double, scala.Double]
  ): IPage = {
    val __obj = js.Dynamic.literal(addElement = addElement, elementWidthChanged = elementWidthChanged, getChildrenLayoutType = getChildrenLayoutType, getQuestionTitleLocation = getQuestionTitleLocation, getType = getType, isPage = isPage, isReadOnly = isReadOnly, isVisible = isVisible, locStrsChanged = locStrsChanged, name = name, onFirstRendering = onFirstRendering, onSurveyLoad = onSurveyLoad, parent = parent, removeElement = removeElement, runCondition = runCondition, setSurveyImpl = setSurveyImpl, setVisibleIndex = setVisibleIndex)
  
    __obj.asInstanceOf[IPage]
  }
}

