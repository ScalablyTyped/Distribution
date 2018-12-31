package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionRowModel")
@js.native
class QuestionRowModel protected () extends Base {
  def this(panel: PanelModelBase) = this()
  val elements: js.Array[IElement] = js.native
  val index: scala.Double = js.native
  var panel: PanelModelBase = js.native
  var visible: scala.Boolean = js.native
  def addElement(q: IElement): scala.Unit = js.native
  def updateVisible(): scala.Unit = js.native
}

