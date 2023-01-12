package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMatrixCellsOwner
  extends StObject
     with ILocalizableOwner {
  
  def getColumns(): js.Array[Any]
  
  def getRows(): js.Array[Any]
}
object IMatrixCellsOwner {
  
  inline def apply(
    getColumns: () => js.Array[Any],
    getLocale: () => String,
    getMarkdownHtml: (String, String) => String,
    getProcessedText: String => String,
    getRenderer: String => String,
    getRendererContext: LocalizableString => Any,
    getRows: () => js.Array[Any]
  ): IMatrixCellsOwner = {
    val __obj = js.Dynamic.literal(getColumns = js.Any.fromFunction0(getColumns), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction2(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRenderer = js.Any.fromFunction1(getRenderer), getRendererContext = js.Any.fromFunction1(getRendererContext), getRows = js.Any.fromFunction0(getRows))
    __obj.asInstanceOf[IMatrixCellsOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMatrixCellsOwner] (val x: Self) extends AnyVal {
    
    inline def setGetColumns(value: () => js.Array[Any]): Self = StObject.set(x, "getColumns", js.Any.fromFunction0(value))
    
    inline def setGetRows(value: () => js.Array[Any]): Self = StObject.set(x, "getRows", js.Any.fromFunction0(value))
  }
}
