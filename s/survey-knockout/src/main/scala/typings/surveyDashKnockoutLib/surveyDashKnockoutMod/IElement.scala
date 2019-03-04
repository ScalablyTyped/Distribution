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
    clearIncorrectValues: js.Function0[js.Any],
    getLayoutType: js.Function0[java.lang.String],
    getPanel: js.Function0[IPanel],
    getType: js.Function0[java.lang.String],
    isLayoutTypeSupported: js.Function1[java.lang.String, scala.Boolean],
    isPage: scala.Boolean,
    isPanel: scala.Boolean,
    isReadOnly: scala.Boolean,
    isVisible: scala.Boolean,
    locStrsChanged: js.Function0[js.Any],
    name: java.lang.String,
    onAnyValueChanged: js.Function1[java.lang.String, js.Any],
    onFirstRendering: js.Function0[js.Any],
    onSurveyLoad: js.Function0[js.Any],
    parent: IPanel,
    removeElement: js.Function1[IElement, scala.Boolean],
    renderWidth: java.lang.String,
    rightIndent: scala.Double,
    runCondition: js.Function2[HashTable[_], HashTable[_], js.Any],
    setSurveyImpl: js.Function1[ISurveyImpl, js.Any],
    setVisibleIndex: js.Function1[scala.Double, scala.Double],
    startWithNewLine: scala.Boolean,
    updateCustomWidgets: js.Function0[js.Any],
    visible: scala.Boolean,
    width: java.lang.String
  ): IElement = {
    val __obj = js.Dynamic.literal(clearIncorrectValues = clearIncorrectValues, getLayoutType = getLayoutType, getPanel = getPanel, getType = getType, isLayoutTypeSupported = isLayoutTypeSupported, isPage = isPage, isPanel = isPanel, isReadOnly = isReadOnly, isVisible = isVisible, locStrsChanged = locStrsChanged, name = name, onAnyValueChanged = onAnyValueChanged, onFirstRendering = onFirstRendering, onSurveyLoad = onSurveyLoad, parent = parent, removeElement = removeElement, renderWidth = renderWidth, rightIndent = rightIndent, runCondition = runCondition, setSurveyImpl = setSurveyImpl, setVisibleIndex = setVisibleIndex, startWithNewLine = startWithNewLine, updateCustomWidgets = updateCustomWidgets, visible = visible, width = width)
  
    __obj.asInstanceOf[IElement]
  }
}

