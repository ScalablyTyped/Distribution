package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMatrixColumnOwner
  extends StObject
     with ILocalizableOwner {
  
  def getCellType(): String
  
  def getCustomCellType(column: MatrixDropdownColumn, row: MatrixDropdownRowModelBase, cellType: String): String
  
  def getRequiredText(): String
  
  def hasChoices(): Boolean
  
  def onColumnCellTypeChanged(column: MatrixDropdownColumn): Unit
  
  def onColumnItemValuePropertyChanged(
    column: MatrixDropdownColumn,
    propertyName: String,
    obj: ItemValue,
    name: String,
    newValue: Any,
    oldValue: Any
  ): Unit
  
  def onColumnPropertyChanged(column: MatrixDropdownColumn, name: String, newValue: Any): Unit
  
  def onShowInMultipleColumnsChanged(column: MatrixDropdownColumn): Unit
}
object IMatrixColumnOwner {
  
  inline def apply(
    getCellType: () => String,
    getCustomCellType: (MatrixDropdownColumn, MatrixDropdownRowModelBase, String) => String,
    getLocale: () => String,
    getMarkdownHtml: (String, String) => String,
    getProcessedText: String => String,
    getRenderer: String => String,
    getRendererContext: LocalizableString => Any,
    getRequiredText: () => String,
    hasChoices: () => Boolean,
    onColumnCellTypeChanged: MatrixDropdownColumn => Unit,
    onColumnItemValuePropertyChanged: (MatrixDropdownColumn, String, ItemValue, String, Any, Any) => Unit,
    onColumnPropertyChanged: (MatrixDropdownColumn, String, Any) => Unit,
    onShowInMultipleColumnsChanged: MatrixDropdownColumn => Unit
  ): IMatrixColumnOwner = {
    val __obj = js.Dynamic.literal(getCellType = js.Any.fromFunction0(getCellType), getCustomCellType = js.Any.fromFunction3(getCustomCellType), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction2(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRenderer = js.Any.fromFunction1(getRenderer), getRendererContext = js.Any.fromFunction1(getRendererContext), getRequiredText = js.Any.fromFunction0(getRequiredText), hasChoices = js.Any.fromFunction0(hasChoices), onColumnCellTypeChanged = js.Any.fromFunction1(onColumnCellTypeChanged), onColumnItemValuePropertyChanged = js.Any.fromFunction6(onColumnItemValuePropertyChanged), onColumnPropertyChanged = js.Any.fromFunction3(onColumnPropertyChanged), onShowInMultipleColumnsChanged = js.Any.fromFunction1(onShowInMultipleColumnsChanged))
    __obj.asInstanceOf[IMatrixColumnOwner]
  }
  
  extension [Self <: IMatrixColumnOwner](x: Self) {
    
    inline def setGetCellType(value: () => String): Self = StObject.set(x, "getCellType", js.Any.fromFunction0(value))
    
    inline def setGetCustomCellType(value: (MatrixDropdownColumn, MatrixDropdownRowModelBase, String) => String): Self = StObject.set(x, "getCustomCellType", js.Any.fromFunction3(value))
    
    inline def setGetRequiredText(value: () => String): Self = StObject.set(x, "getRequiredText", js.Any.fromFunction0(value))
    
    inline def setHasChoices(value: () => Boolean): Self = StObject.set(x, "hasChoices", js.Any.fromFunction0(value))
    
    inline def setOnColumnCellTypeChanged(value: MatrixDropdownColumn => Unit): Self = StObject.set(x, "onColumnCellTypeChanged", js.Any.fromFunction1(value))
    
    inline def setOnColumnItemValuePropertyChanged(value: (MatrixDropdownColumn, String, ItemValue, String, Any, Any) => Unit): Self = StObject.set(x, "onColumnItemValuePropertyChanged", js.Any.fromFunction6(value))
    
    inline def setOnColumnPropertyChanged(value: (MatrixDropdownColumn, String, Any) => Unit): Self = StObject.set(x, "onColumnPropertyChanged", js.Any.fromFunction3(value))
    
    inline def setOnShowInMultipleColumnsChanged(value: MatrixDropdownColumn => Unit): Self = StObject.set(x, "onShowInMultipleColumnsChanged", js.Any.fromFunction1(value))
  }
}
