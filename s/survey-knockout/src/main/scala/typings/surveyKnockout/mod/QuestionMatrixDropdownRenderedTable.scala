package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrixDropdownRenderedTable")
@js.native
open class QuestionMatrixDropdownRenderedTable protected () extends Base {
  def this(matrix: QuestionMatrixDropdownModelBase) = this()
  
  def allowRowsDragAndDrop: Boolean = js.native
  
  /* protected */ def build(): Unit = js.native
  
  /* protected */ def buildFooter(): Unit = js.native
  
  /* protected */ def buildHeader(): Unit = js.native
  
  /* protected */ def buildRows(): Unit = js.native
  
  /* protected */ def buildRowsActions(): Unit = js.native
  
  /* protected */ def createRenderedRow(cssClasses: Any): QuestionMatrixDropdownRenderedRow = js.native
  /* protected */ def createRenderedRow(cssClasses: Any, isDetailRow: Boolean): QuestionMatrixDropdownRenderedRow = js.native
  
  var cssClasses: Any = js.native
  
  def footerRow: QuestionMatrixDropdownRenderedRow = js.native
  
  var footerRowValue: QuestionMatrixDropdownRenderedRow = js.native
  
  var hasActionCellInRowsValues: Any = js.native
  
  def hasFooter: Boolean = js.native
  
  def hasRemoveRows: Boolean = js.native
  
  var hasRemoveRowsValue: Boolean = js.native
  
  def headerRow: QuestionMatrixDropdownRenderedRow = js.native
  
  var headerRowValue: QuestionMatrixDropdownRenderedRow = js.native
  
  def isRequireReset(): Boolean = js.native
  
  var matrix: QuestionMatrixDropdownModelBase = js.native
  
  def onAddedRow(): Unit = js.native
  
  def onDetailPanelChangeVisibility(row: MatrixDropdownRowModelBase, isShowing: Boolean): Unit = js.native
  
  def onRemovedRow(row: MatrixDropdownRowModelBase): Unit = js.native
  
  var renderedRowsChangedCallback: Any = js.native
  
  var rows: Any = js.native
  
  var rowsActions: Any = js.native
  
  /* protected */ def setDefaultRowActions(row: MatrixDropdownRowModelBase, actions: Any): Unit = js.native
  
  def showAddRowOnBottom: Boolean = js.native
  
  def showAddRowOnTop: Boolean = js.native
  
  def showFooter: Boolean = js.native
  
  def showHeader: Boolean = js.native
  
  def showTable: Boolean = js.native
  
  def updateShowTableAndAddRow(): Unit = js.native
}
