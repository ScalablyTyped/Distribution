package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMatrixColumnOwner
  extends StObject
     with ILocalizableOwner {
  
  def getCellType(): String
  
  def getRequiredText(): String
  
  def onColumnCellTypeChanged(column: MatrixDropdownColumn): Unit
  
  def onColumnPropertyChanged(column: MatrixDropdownColumn, name: String, newValue: js.Any): Unit
  
  def onShowInMultipleColumnsChanged(column: MatrixDropdownColumn): Unit
}
object IMatrixColumnOwner {
  
  inline def apply(
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
  
  extension [Self <: IMatrixColumnOwner](x: Self) {
    
    inline def setGetCellType(value: () => String): Self = StObject.set(x, "getCellType", js.Any.fromFunction0(value))
    
    inline def setGetRequiredText(value: () => String): Self = StObject.set(x, "getRequiredText", js.Any.fromFunction0(value))
    
    inline def setOnColumnCellTypeChanged(value: MatrixDropdownColumn => Unit): Self = StObject.set(x, "onColumnCellTypeChanged", js.Any.fromFunction1(value))
    
    inline def setOnColumnPropertyChanged(value: (MatrixDropdownColumn, String, js.Any) => Unit): Self = StObject.set(x, "onColumnPropertyChanged", js.Any.fromFunction3(value))
    
    inline def setOnShowInMultipleColumnsChanged(value: MatrixDropdownColumn => Unit): Self = StObject.set(x, "onShowInMultipleColumnsChanged", js.Any.fromFunction1(value))
  }
}
