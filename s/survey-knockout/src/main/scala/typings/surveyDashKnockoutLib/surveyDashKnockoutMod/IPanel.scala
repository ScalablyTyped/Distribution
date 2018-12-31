package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel
  extends ISurveyElement
     with IParentElement {
  var parent: IPanel
  def elementWidthChanged(el: IElement): js.Any
  def getQuestionTitleLocation(): java.lang.String
}

