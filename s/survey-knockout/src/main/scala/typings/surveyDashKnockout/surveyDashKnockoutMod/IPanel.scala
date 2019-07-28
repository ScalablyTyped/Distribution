package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.surveyDashKnockout.surveyDashKnockoutMod.IParentElement because var conflicts: isReadOnly. Inlined addElement, removeElement */ trait IPanel extends ISurveyElement {
  var parent: IPanel
  def addElement(element: IElement, index: Double): js.Any
  def elementWidthChanged(el: IElement): js.Any
  def getChildrenLayoutType(): String
  def getQuestionTitleLocation(): String
  def indexOf(el: IElement): Double
  def removeElement(element: IElement): Boolean
}

object IPanel {
  @scala.inline
  def apply(
    addElement: (IElement, Double) => js.Any,
    elementWidthChanged: IElement => js.Any,
    getChildrenLayoutType: () => String,
    getQuestionTitleLocation: () => String,
    getType: () => String,
    indexOf: IElement => Double,
    isPage: Boolean,
    isReadOnly: Boolean,
    isVisible: Boolean,
    locStrsChanged: () => js.Any,
    name: String,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    parent: IPanel,
    removeElement: IElement => Boolean,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: Double => Double
  ): IPanel = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction2(addElement), elementWidthChanged = js.Any.fromFunction1(elementWidthChanged), getChildrenLayoutType = js.Any.fromFunction0(getChildrenLayoutType), getQuestionTitleLocation = js.Any.fromFunction0(getQuestionTitleLocation), getType = js.Any.fromFunction0(getType), indexOf = js.Any.fromFunction1(indexOf), isPage = isPage, isReadOnly = isReadOnly, isVisible = isVisible, locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name, onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), parent = parent, removeElement = js.Any.fromFunction1(removeElement), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex))
  
    __obj.asInstanceOf[IPanel]
  }
}

