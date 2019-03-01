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
  def removeElement(element: IElement): scala.Boolean
}

object IPanel {
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
    setSurveyImpl: js.Function1[ISurveyImpl, js.Any],
    setVisibleIndex: js.Function1[scala.Double, scala.Double]
  ): IPanel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addElement")(addElement)
    __obj.updateDynamic("elementWidthChanged")(elementWidthChanged)
    __obj.updateDynamic("getChildrenLayoutType")(getChildrenLayoutType)
    __obj.updateDynamic("getQuestionTitleLocation")(getQuestionTitleLocation)
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
    __obj.updateDynamic("setSurveyImpl")(setSurveyImpl)
    __obj.updateDynamic("setVisibleIndex")(setVisibleIndex)
    __obj.asInstanceOf[IPanel]
  }
}

