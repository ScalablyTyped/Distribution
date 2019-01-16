package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionMatrixModel")
@js.native
class QuestionMatrixModel protected ()
  extends QuestionMatrixBaseModel[MatrixRowModel, ItemValue]
     with IMatrixData
     with IMatrixCellsOwner {
  def this(name: java.lang.String) = this()
  var cells: MartrixCells = js.native
  val hasCellText: scala.Boolean = js.native
  /**
    * Returns true, if there is at least one row.
    */
  val hasRows: scala.Boolean = js.native
  /**
    * Set this property to true, if you want a user to answer all rows.
    */
  var isAllRowRequired: scala.Boolean = js.native
  /* protected */ def createMatrixRow(item: ItemValue, fullName: java.lang.String, value: js.Any): MatrixRowModel = js.native
  def getCellDisplayLocText(row: js.Any, column: js.Any): LocalizableString = js.native
  def getCellDisplayText(row: js.Any, column: js.Any): java.lang.String = js.native
  def getCellText(row: js.Any, column: js.Any): java.lang.String = js.native
  /* CompleteClass */
  override def getColumns(): js.Array[_] = js.native
  def getDefaultCellText(column: js.Any): java.lang.String = js.native
  /* InferMemberOverrides */
  override def getLocale(): java.lang.String = js.native
  /* InferMemberOverrides */
  override def getMarkdownHtml(text: java.lang.String): java.lang.String = js.native
  /* InferMemberOverrides */
  override def getProcessedText(text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getRows(): js.Array[_] = js.native
  /**
    * Returns the type of the object as a string as it represents in the json. It should be in lowcase.
    */
  /* InferMemberOverrides */
  override def getType(): java.lang.String = js.native
  /* InferMemberOverrides */
  override def locStrsChanged(): scala.Unit with js.Any = js.native
  /* CompleteClass */
  override def onMatrixRowChanged(row: MatrixRowModel): scala.Unit = js.native
  def setCellText(row: js.Any, column: js.Any, `val`: java.lang.String): scala.Unit = js.native
  def setDefaultCellText(column: js.Any, `val`: java.lang.String): scala.Unit = js.native
}

