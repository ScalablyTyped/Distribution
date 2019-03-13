package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPage
  extends IPanel
     with IConditionRunner {
  var isStarted: scala.Boolean
}

object IPage {
  @scala.inline
  def apply(
    addElement: (IElement, scala.Double) => js.Any,
    elementWidthChanged: IElement => js.Any,
    getChildrenLayoutType: () => java.lang.String,
    getQuestionTitleLocation: () => java.lang.String,
    getType: () => java.lang.String,
    isPage: scala.Boolean,
    isReadOnly: scala.Boolean,
    isStarted: scala.Boolean,
    isVisible: scala.Boolean,
    locStrsChanged: () => js.Any,
    name: java.lang.String,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    parent: IPanel,
    removeElement: IElement => scala.Boolean,
    runCondition: (HashTable[_], HashTable[_]) => js.Any,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: scala.Double => scala.Double
  ): IPage = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction2(addElement), elementWidthChanged = js.Any.fromFunction1(elementWidthChanged), getChildrenLayoutType = js.Any.fromFunction0(getChildrenLayoutType), getQuestionTitleLocation = js.Any.fromFunction0(getQuestionTitleLocation), getType = js.Any.fromFunction0(getType), isPage = isPage, isReadOnly = isReadOnly, isStarted = isStarted, isVisible = isVisible, locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name, onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), parent = parent, removeElement = js.Any.fromFunction1(removeElement), runCondition = js.Any.fromFunction2(runCondition), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex))
  
    __obj.asInstanceOf[IPage]
  }
}

