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

