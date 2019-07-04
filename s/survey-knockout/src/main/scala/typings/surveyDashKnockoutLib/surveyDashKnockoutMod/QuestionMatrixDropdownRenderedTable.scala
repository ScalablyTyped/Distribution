package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionMatrixDropdownRenderedTable")
@js.native
class QuestionMatrixDropdownRenderedTable protected () extends Base {
  def this(matrix: QuestionMatrixDropdownModelBase) = this()
  val footerRow: QuestionMatrixDropdownRenderedRow = js.native
  val hasRemoveRow: scala.Boolean = js.native
  val headerRow: QuestionMatrixDropdownRenderedRow = js.native
  var matrix: QuestionMatrixDropdownModelBase = js.native
  val rows: js.Array[QuestionMatrixDropdownRenderedRow] = js.native
  val showFooter: scala.Boolean = js.native
  val showHeader: scala.Boolean = js.native
  /* protected */ def build(): scala.Unit = js.native
  /* protected */ def buildFooter(): scala.Unit = js.native
  /* protected */ def buildHeader(): scala.Unit = js.native
  /* protected */ def buildRows(): scala.Unit = js.native
  def isRequireReset(): scala.Boolean = js.native
  def onAddedRow(): scala.Unit = js.native
  def onRemovedRow(index: scala.Double): scala.Unit = js.native
}

