package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMatrixColumnOwner extends ILocalizableOwner {
  
  def getCellType(): String = js.native
  
  def getRequiredText(): String = js.native
  
  def onColumnCellTypeChanged(column: MatrixDropdownColumn): Unit = js.native
  
  def onColumnPropertyChanged(column: MatrixDropdownColumn, name: String, newValue: js.Any): Unit = js.native
  
  def onShowInMultipleColumnsChanged(column: MatrixDropdownColumn): Unit = js.native
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
  
  @scala.inline
  implicit class IMatrixColumnOwnerOps[Self <: IMatrixColumnOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetCellType(value: () => String): Self = this.set("getCellType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRequiredText(value: () => String): Self = this.set("getRequiredText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnColumnCellTypeChanged(value: MatrixDropdownColumn => Unit): Self = this.set("onColumnCellTypeChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnColumnPropertyChanged(value: (MatrixDropdownColumn, String, js.Any) => Unit): Self = this.set("onColumnPropertyChanged", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnShowInMultipleColumnsChanged(value: MatrixDropdownColumn => Unit): Self = this.set("onShowInMultipleColumnsChanged", js.Any.fromFunction1(value))
  }
}
