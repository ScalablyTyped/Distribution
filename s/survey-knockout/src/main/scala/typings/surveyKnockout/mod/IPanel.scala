package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.IParentElement because var conflicts: isReadOnly. Inlined addElement, removeElement */ trait IPanel extends ISurveyElement {
  var elements: js.Array[IElement]
  var parent: IPanel
  def addElement(element: IElement, index: Double): js.Any
  def elementWidthChanged(el: IElement): js.Any
  def getChildrenLayoutType(): String
  def getQuestionStartIndex(): String
  def getQuestionTitleLocation(): String
  def indexOf(el: IElement): Double
  def removeElement(element: IElement): Boolean
}

object IPanel {
  @scala.inline
  def apply(
    addElement: (IElement, Double) => js.Any,
    containsErrors: Boolean,
    delete: () => js.Any,
    elementWidthChanged: IElement => js.Any,
    elements: js.Array[IElement],
    getChildrenLayoutType: () => String,
    getQuestionStartIndex: () => String,
    getQuestionTitleLocation: () => String,
    getType: () => String,
    indexOf: IElement => Double,
    isPage: Boolean,
    isPanel: Boolean,
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
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction2(addElement), containsErrors = containsErrors.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), elementWidthChanged = js.Any.fromFunction1(elementWidthChanged), elements = elements.asInstanceOf[js.Any], getChildrenLayoutType = js.Any.fromFunction0(getChildrenLayoutType), getQuestionStartIndex = js.Any.fromFunction0(getQuestionStartIndex), getQuestionTitleLocation = js.Any.fromFunction0(getQuestionTitleLocation), getType = js.Any.fromFunction0(getType), indexOf = js.Any.fromFunction1(indexOf), isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name.asInstanceOf[js.Any], onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), parent = parent.asInstanceOf[js.Any], removeElement = js.Any.fromFunction1(removeElement), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex))
    __obj.asInstanceOf[IPanel]
  }
}

