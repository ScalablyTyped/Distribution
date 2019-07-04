package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- surveyDashKnockoutLib.surveyDashKnockoutMod.IParentElement because var conflicts: isReadOnly. Inlined addElement, removeElement */ trait IPanel extends ISurveyElement {
  var parent: IPanel
  def addElement(element: IElement, index: scala.Double): js.Any
  def elementWidthChanged(el: IElement): js.Any
  def getChildrenLayoutType(): java.lang.String
  def getQuestionTitleLocation(): java.lang.String
  def indexOf(el: IElement): scala.Double
  def removeElement(element: IElement): scala.Boolean
}

object IPanel {
  @scala.inline
  def apply(
    addElement: (IElement, scala.Double) => js.Any,
    elementWidthChanged: IElement => js.Any,
    getChildrenLayoutType: () => java.lang.String,
    getQuestionTitleLocation: () => java.lang.String,
    getType: () => java.lang.String,
    indexOf: IElement => scala.Double,
    isPage: scala.Boolean,
    isReadOnly: scala.Boolean,
    isVisible: scala.Boolean,
    locStrsChanged: () => js.Any,
    name: java.lang.String,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    parent: IPanel,
    removeElement: IElement => scala.Boolean,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: scala.Double => scala.Double
  ): IPanel = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction2(addElement), elementWidthChanged = js.Any.fromFunction1(elementWidthChanged), getChildrenLayoutType = js.Any.fromFunction0(getChildrenLayoutType), getQuestionTitleLocation = js.Any.fromFunction0(getQuestionTitleLocation), getType = js.Any.fromFunction0(getType), indexOf = js.Any.fromFunction1(indexOf), isPage = isPage, isReadOnly = isReadOnly, isVisible = isVisible, locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name, onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), parent = parent, removeElement = js.Any.fromFunction1(removeElement), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex))
  
    __obj.asInstanceOf[IPanel]
  }
}

