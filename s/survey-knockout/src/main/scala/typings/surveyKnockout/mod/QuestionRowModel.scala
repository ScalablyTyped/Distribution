package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionRowModel")
@js.native
class QuestionRowModel protected () extends Base {
  def this(panel: PanelModelBase) = this()
  val elements: js.Array[IElement] = js.native
  val index: Double = js.native
  var panel: PanelModelBase = js.native
  var visible: Boolean = js.native
  val visibleElements: js.Array[IElement] = js.native
  def addElement(q: IElement): Unit = js.native
  def updateVisible(): Unit = js.native
}

