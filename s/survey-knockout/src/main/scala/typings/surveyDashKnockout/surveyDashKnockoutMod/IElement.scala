package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElement
  extends IConditionRunner
     with ISurveyElement {
  var isPanel: Boolean
  var parent: IPanel
  var renderWidth: String
  var rightIndent: Double
  var startWithNewLine: Boolean
  var visible: Boolean
  var width: String
  def clearErrors(): js.Any
  def clearIncorrectValues(): js.Any
  def getLayoutType(): String
  def getPanel(): IPanel
  def isLayoutTypeSupported(layoutType: String): Boolean
  def onAnyValueChanged(name: String): js.Any
  def removeElement(el: IElement): Boolean
  def updateCustomWidgets(): js.Any
}

object IElement {
  @scala.inline
  def apply(
    clearErrors: () => js.Any,
    clearIncorrectValues: () => js.Any,
    getLayoutType: () => String,
    getPanel: () => IPanel,
    getType: () => String,
    isLayoutTypeSupported: String => Boolean,
    isPage: Boolean,
    isPanel: Boolean,
    isReadOnly: Boolean,
    isVisible: Boolean,
    locStrsChanged: () => js.Any,
    name: String,
    onAnyValueChanged: String => js.Any,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    parent: IPanel,
    removeElement: IElement => Boolean,
    renderWidth: String,
    rightIndent: Double,
    runCondition: (HashTable[_], HashTable[_]) => js.Any,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: Double => Double,
    startWithNewLine: Boolean,
    updateCustomWidgets: () => js.Any,
    visible: Boolean,
    width: String
  ): IElement = {
    val __obj = js.Dynamic.literal(clearErrors = js.Any.fromFunction0(clearErrors), clearIncorrectValues = js.Any.fromFunction0(clearIncorrectValues), getLayoutType = js.Any.fromFunction0(getLayoutType), getPanel = js.Any.fromFunction0(getPanel), getType = js.Any.fromFunction0(getType), isLayoutTypeSupported = js.Any.fromFunction1(isLayoutTypeSupported), isPage = isPage, isPanel = isPanel, isReadOnly = isReadOnly, isVisible = isVisible, locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name, onAnyValueChanged = js.Any.fromFunction1(onAnyValueChanged), onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), parent = parent, removeElement = js.Any.fromFunction1(removeElement), renderWidth = renderWidth, rightIndent = rightIndent, runCondition = js.Any.fromFunction2(runCondition), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex), startWithNewLine = startWithNewLine, updateCustomWidgets = js.Any.fromFunction0(updateCustomWidgets), visible = visible, width = width)
  
    __obj.asInstanceOf[IElement]
  }
}

