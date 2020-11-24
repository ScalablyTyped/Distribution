package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrixDropdownRenderedTable")
@js.native
class QuestionMatrixDropdownRenderedTable protected () extends Base {
  def this(matrix: QuestionMatrixDropdownModelBase) = this()
  
  /* protected */ def build(): Unit = js.native
  
  /* protected */ def buildFooter(): Unit = js.native
  
  /* protected */ def buildHeader(): Unit = js.native
  
  /* protected */ def buildRows(): Unit = js.native
  
  val footerRow: QuestionMatrixDropdownRenderedRow = js.native
  
  val hasFooter: Boolean = js.native
  
  val hasRemoveRows: Boolean = js.native
  
  val headerRow: QuestionMatrixDropdownRenderedRow = js.native
  
  def isRequireReset(): Boolean = js.native
  
  var matrix: QuestionMatrixDropdownModelBase = js.native
  
  def onAddedRow(): Unit = js.native
  
  def onDetailPanelChangeVisibility(row: MatrixDropdownRowModelBase, isShowing: Boolean): Unit = js.native
  
  def onRemovedRow(row: MatrixDropdownRowModelBase): Unit = js.native
  
  val rows: js.Array[QuestionMatrixDropdownRenderedRow] = js.native
  
  val showFooter: Boolean = js.native
  
  val showHeader: Boolean = js.native
}
