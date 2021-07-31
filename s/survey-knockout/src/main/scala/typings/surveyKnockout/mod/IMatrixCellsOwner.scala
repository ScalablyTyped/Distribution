package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMatrixCellsOwner
  extends StObject
     with ILocalizableOwner {
  
  def getColumns(): js.Array[js.Any]
  
  def getRows(): js.Array[js.Any]
}
object IMatrixCellsOwner {
  
  @scala.inline
  def apply(
    getColumns: () => js.Array[js.Any],
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getProcessedText: String => String,
    getRows: () => js.Array[js.Any]
  ): IMatrixCellsOwner = {
    val __obj = js.Dynamic.literal(getColumns = js.Any.fromFunction0(getColumns), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRows = js.Any.fromFunction0(getRows))
    __obj.asInstanceOf[IMatrixCellsOwner]
  }
  
  @scala.inline
  implicit class IMatrixCellsOwnerMutableBuilder[Self <: IMatrixCellsOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetColumns(value: () => js.Array[js.Any]): Self = StObject.set(x, "getColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRows(value: () => js.Array[js.Any]): Self = StObject.set(x, "getRows", js.Any.fromFunction0(value))
  }
}
