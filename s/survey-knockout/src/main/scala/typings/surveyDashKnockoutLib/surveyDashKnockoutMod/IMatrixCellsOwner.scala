package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixCellsOwner extends ILocalizableOwner {
  def getColumns(): js.Array[_]
  def getRows(): js.Array[_]
}

object IMatrixCellsOwner {
  @scala.inline
  def apply(
    getColumns: () => js.Array[_],
    getLocale: () => java.lang.String,
    getMarkdownHtml: java.lang.String => java.lang.String,
    getProcessedText: java.lang.String => java.lang.String,
    getRows: () => js.Array[_]
  ): IMatrixCellsOwner = {
    val __obj = js.Dynamic.literal(getColumns = js.Any.fromFunction0(getColumns), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRows = js.Any.fromFunction0(getRows))
  
    __obj.asInstanceOf[IMatrixCellsOwner]
  }
}

