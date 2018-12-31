package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "DragDropInfo")
@js.native
class DragDropInfo protected () extends js.Object {
  def this(source: IElement, target: IElement) = this()
  def this(source: IElement, target: IElement, nestedPanelDepth: scala.Double) = this()
  var destination: ISurveyElement = js.native
  var isBottom: scala.Boolean = js.native
  var isEdge: scala.Boolean = js.native
  var nestedPanelDepth: scala.Double = js.native
  var source: IElement = js.native
  var target: IElement = js.native
}

