package typings.surveyKnockout.mod

import typings.surveyKnockout.anon.Calculations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrixModel")
@js.native
class QuestionMatrixModel protected ()
  extends QuestionMatrixBaseModel[MatrixRowModel, ItemValue]
     with IMatrixData
     with IMatrixCellsOwner {
  def this(name: String) = this()
  
  var cells: MartrixCells = js.native
  
  def getCellDisplayLocText(row: js.Any, column: js.Any): LocalizableString = js.native
  
  def getCellDisplayText(row: js.Any, column: js.Any): String = js.native
  
  def getCellText(row: js.Any, column: js.Any): String = js.native
  
  /* CompleteClass */
  override def getColumns(): js.Array[js.Any] = js.native
  
  def getDefaultCellText(column: js.Any): String = js.native
  
  def getItemClass(row: js.Any, column: js.Any): String = js.native
  
  /* CompleteClass */
  override def getLocale(): String = js.native
  
  /* CompleteClass */
  override def getMarkdownHtml(text: String): String = js.native
  
  def getPlainData(options: Calculations): js.Any = js.native
  
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  
  /* CompleteClass */
  override def getRows(): js.Array[js.Any] = js.native
  
  /**
    * Returns the type of the object as a string as it represents in the json. It should be in lowcase.
    */
  /* InferMemberOverrides */
  override def getType(): String = js.native
  
  val hasCellText: Boolean = js.native
  
  /**
    * Returns true, if there is at least one row.
    */
  val hasRows: Boolean = js.native
  
  /**
    * Set this property to true to hide the question if there is no visible rows in the matrix.
    */
  var hideIfRowsEmpty: Boolean = js.native
  
  /**
    * Set this property to true, if you want a user to answer all rows.
    */
  var isAllRowRequired: Boolean = js.native
  
  /* InferMemberOverrides */
  override def locStrsChanged(): Unit & js.Any = js.native
  
  /* CompleteClass */
  override def onMatrixRowChanged(row: MatrixRowModel): Unit = js.native
  
  /* protected */ def onMatrixRowCreated(row: MatrixRowModel): Unit = js.native
  
  /**
    * Use this property to render items in a specific order: "random" or "initial". Default is "initial".
    */
  var rowsOrder: String = js.native
  
  def setCellText(row: js.Any, column: js.Any, `val`: String): Unit = js.native
  
  def setDefaultCellText(column: js.Any, `val`: String): Unit = js.native
  
  /* protected */ def sortVisibleRows(array: js.Array[MatrixRowModel]): js.Array[MatrixRowModel] = js.native
}
