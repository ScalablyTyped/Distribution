package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMatrixDropdownData extends StObject {
  
  var columns: js.Array[MatrixDropdownColumn] = js.native
  
  def createQuestion(row: MatrixDropdownRowModelBase, column: MatrixDropdownColumn): Question = js.native
  
  def createRowDetailPanel(row: MatrixDropdownRowModelBase): PanelModel = js.native
  
  def getIsDetailPanelShowing(row: MatrixDropdownRowModelBase): Boolean = js.native
  
  def getLocale(): String = js.native
  
  def getMarkdownHtml(text: String): String = js.native
  
  def getProcessedText(text: String): String = js.native
  
  def getRowIndex(row: MatrixDropdownRowModelBase): Double = js.native
  
  def getRowValue(rowIndex: Double): js.Any = js.native
  
  def getSharedQuestionByName(columnName: String, row: MatrixDropdownRowModelBase): Question = js.native
  
  def getSurvey(): ISurvey = js.native
  
  def hasDetailPanel(row: MatrixDropdownRowModelBase): Boolean = js.native
  
  def onRowChanged(row: MatrixDropdownRowModelBase, columnName: String, newRowValue: js.Any, isDeletingValue: Boolean): Unit = js.native
  
  def onRowChanging(row: MatrixDropdownRowModelBase, columnName: String, rowValue: js.Any): js.Any = js.native
  
  def onTotalValueChanged(): js.Any = js.native
  
  def setIsDetailPanelShowing(row: MatrixDropdownRowModelBase, `val`: Boolean): Unit = js.native
  
  def validateCell(row: MatrixDropdownRowModelBase, columnName: String, rowValue: js.Any): SurveyError = js.native
  
  var value: js.Any = js.native
}
object IMatrixDropdownData {
  
  @scala.inline
  def apply(
    columns: js.Array[MatrixDropdownColumn],
    createQuestion: (MatrixDropdownRowModelBase, MatrixDropdownColumn) => Question,
    createRowDetailPanel: MatrixDropdownRowModelBase => PanelModel,
    getIsDetailPanelShowing: MatrixDropdownRowModelBase => Boolean,
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getProcessedText: String => String,
    getRowIndex: MatrixDropdownRowModelBase => Double,
    getRowValue: Double => js.Any,
    getSharedQuestionByName: (String, MatrixDropdownRowModelBase) => Question,
    getSurvey: () => ISurvey,
    hasDetailPanel: MatrixDropdownRowModelBase => Boolean,
    onRowChanged: (MatrixDropdownRowModelBase, String, js.Any, Boolean) => Unit,
    onRowChanging: (MatrixDropdownRowModelBase, String, js.Any) => js.Any,
    onTotalValueChanged: () => js.Any,
    setIsDetailPanelShowing: (MatrixDropdownRowModelBase, Boolean) => Unit,
    validateCell: (MatrixDropdownRowModelBase, String, js.Any) => SurveyError,
    value: js.Any
  ): IMatrixDropdownData = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], createQuestion = js.Any.fromFunction2(createQuestion), createRowDetailPanel = js.Any.fromFunction1(createRowDetailPanel), getIsDetailPanelShowing = js.Any.fromFunction1(getIsDetailPanelShowing), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRowIndex = js.Any.fromFunction1(getRowIndex), getRowValue = js.Any.fromFunction1(getRowValue), getSharedQuestionByName = js.Any.fromFunction2(getSharedQuestionByName), getSurvey = js.Any.fromFunction0(getSurvey), hasDetailPanel = js.Any.fromFunction1(hasDetailPanel), onRowChanged = js.Any.fromFunction4(onRowChanged), onRowChanging = js.Any.fromFunction3(onRowChanging), onTotalValueChanged = js.Any.fromFunction0(onTotalValueChanged), setIsDetailPanelShowing = js.Any.fromFunction2(setIsDetailPanelShowing), validateCell = js.Any.fromFunction3(validateCell), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMatrixDropdownData]
  }
  
  @scala.inline
  implicit class IMatrixDropdownDataMutableBuilder[Self <: IMatrixDropdownData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[MatrixDropdownColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: MatrixDropdownColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCreateQuestion(value: (MatrixDropdownRowModelBase, MatrixDropdownColumn) => Question): Self = StObject.set(x, "createQuestion", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateRowDetailPanel(value: MatrixDropdownRowModelBase => PanelModel): Self = StObject.set(x, "createRowDetailPanel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetIsDetailPanelShowing(value: MatrixDropdownRowModelBase => Boolean): Self = StObject.set(x, "getIsDetailPanelShowing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLocale(value: () => String): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMarkdownHtml(value: String => String): Self = StObject.set(x, "getMarkdownHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProcessedText(value: String => String): Self = StObject.set(x, "getProcessedText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRowIndex(value: MatrixDropdownRowModelBase => Double): Self = StObject.set(x, "getRowIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRowValue(value: Double => js.Any): Self = StObject.set(x, "getRowValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSharedQuestionByName(value: (String, MatrixDropdownRowModelBase) => Question): Self = StObject.set(x, "getSharedQuestionByName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSurvey(value: () => ISurvey): Self = StObject.set(x, "getSurvey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasDetailPanel(value: MatrixDropdownRowModelBase => Boolean): Self = StObject.set(x, "hasDetailPanel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRowChanged(value: (MatrixDropdownRowModelBase, String, js.Any, Boolean) => Unit): Self = StObject.set(x, "onRowChanged", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnRowChanging(value: (MatrixDropdownRowModelBase, String, js.Any) => js.Any): Self = StObject.set(x, "onRowChanging", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnTotalValueChanged(value: () => js.Any): Self = StObject.set(x, "onTotalValueChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetIsDetailPanelShowing(value: (MatrixDropdownRowModelBase, Boolean) => Unit): Self = StObject.set(x, "setIsDetailPanelShowing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidateCell(value: (MatrixDropdownRowModelBase, String, js.Any) => SurveyError): Self = StObject.set(x, "validateCell", js.Any.fromFunction3(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
