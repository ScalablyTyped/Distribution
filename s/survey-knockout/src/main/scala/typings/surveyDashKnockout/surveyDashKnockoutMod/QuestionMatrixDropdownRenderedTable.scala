package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionMatrixDropdownRenderedTable")
@js.native
class QuestionMatrixDropdownRenderedTable protected () extends Base {
  def this(matrix: QuestionMatrixDropdownModelBase) = this()
  val footerRow: QuestionMatrixDropdownRenderedRow = js.native
  val hasFooter: Boolean = js.native
  val hasRemoveRow: Boolean = js.native
  val headerRow: QuestionMatrixDropdownRenderedRow = js.native
  var matrix: QuestionMatrixDropdownModelBase = js.native
  val rows: js.Array[QuestionMatrixDropdownRenderedRow] = js.native
  val showFooter: Boolean = js.native
  val showHeader: Boolean = js.native
  /* protected */ def build(): Unit = js.native
  /* protected */ def buildFooter(): Unit = js.native
  /* protected */ def buildHeader(): Unit = js.native
  /* protected */ def buildRows(): Unit = js.native
  def isRequireReset(): Boolean = js.native
  def onAddedRow(): Unit = js.native
  def onRemovedRow(index: Double): Unit = js.native
}

