package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElement
  extends IConditionRunner
     with ISurveyElement {
  var isPanel: scala.Boolean
  var parent: IPanel
  var renderWidth: java.lang.String
  var rightIndent: scala.Double
  var startWithNewLine: scala.Boolean
  var visible: scala.Boolean
  var width: java.lang.String
  def clearIncorrectValues(): js.Any
  def getLayoutType(): java.lang.String
  def getPanel(): IPanel
  def isLayoutTypeSupported(layoutType: java.lang.String): scala.Boolean
  def onAnyValueChanged(name: java.lang.String): js.Any
  def removeElement(el: IElement): scala.Boolean
  def updateCustomWidgets(): js.Any
}

object IElement {
  @scala.inline
  def apply(
    clearIncorrectValues: () => js.Any,
    getLayoutType: () => java.lang.String,
    getPanel: () => IPanel,
    getType: () => java.lang.String,
    isLayoutTypeSupported: java.lang.String => scala.Boolean,
    isPage: scala.Boolean,
    isPanel: scala.Boolean,
    isReadOnly: scala.Boolean,
    isVisible: scala.Boolean,
    locStrsChanged: () => js.Any,
    name: java.lang.String,
    onAnyValueChanged: java.lang.String => js.Any,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    parent: IPanel,
    removeElement: IElement => scala.Boolean,
    renderWidth: java.lang.String,
    rightIndent: scala.Double,
    runCondition: (HashTable[_], HashTable[_]) => js.Any,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: scala.Double => scala.Double,
    startWithNewLine: scala.Boolean,
    updateCustomWidgets: () => js.Any,
    visible: scala.Boolean,
    width: java.lang.String
  ): IElement = {
    val __obj = js.Dynamic.literal(clearIncorrectValues = js.Any.fromFunction0(clearIncorrectValues), getLayoutType = js.Any.fromFunction0(getLayoutType), getPanel = js.Any.fromFunction0(getPanel), getType = js.Any.fromFunction0(getType), isLayoutTypeSupported = js.Any.fromFunction1(isLayoutTypeSupported), isPage = isPage, isPanel = isPanel, isReadOnly = isReadOnly, isVisible = isVisible, locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name, onAnyValueChanged = js.Any.fromFunction1(onAnyValueChanged), onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), parent = parent, removeElement = js.Any.fromFunction1(removeElement), renderWidth = renderWidth, rightIndent = rightIndent, runCondition = js.Any.fromFunction2(runCondition), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex), startWithNewLine = startWithNewLine, updateCustomWidgets = js.Any.fromFunction0(updateCustomWidgets), visible = visible, width = width)
  
    __obj.asInstanceOf[IElement]
  }
}

