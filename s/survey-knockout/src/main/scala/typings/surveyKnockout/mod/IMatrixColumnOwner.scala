package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixColumnOwner extends ILocalizableOwner {
  def getCellType(): String
  def getRequiredText(): String
  def onColumnCellTypeChanged(column: MatrixDropdownColumn): Unit
  def onColumnPropertyChanged(column: MatrixDropdownColumn, name: String, newValue: js.Any): Unit
  def onShowInMultipleColumnsChanged(column: MatrixDropdownColumn): Unit
}

object IMatrixColumnOwner {
  @scala.inline
  def apply(
    getCellType: () => String,
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getProcessedText: String => String,
    getRequiredText: () => String,
    onColumnCellTypeChanged: MatrixDropdownColumn => Unit,
    onColumnPropertyChanged: (MatrixDropdownColumn, String, js.Any) => Unit,
    onShowInMultipleColumnsChanged: MatrixDropdownColumn => Unit
  ): IMatrixColumnOwner = {
    val __obj = js.Dynamic.literal(getCellType = js.Any.fromFunction0(getCellType), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRequiredText = js.Any.fromFunction0(getRequiredText), onColumnCellTypeChanged = js.Any.fromFunction1(onColumnCellTypeChanged), onColumnPropertyChanged = js.Any.fromFunction3(onColumnPropertyChanged), onShowInMultipleColumnsChanged = js.Any.fromFunction1(onShowInMultipleColumnsChanged))
    __obj.asInstanceOf[IMatrixColumnOwner]
  }
}

