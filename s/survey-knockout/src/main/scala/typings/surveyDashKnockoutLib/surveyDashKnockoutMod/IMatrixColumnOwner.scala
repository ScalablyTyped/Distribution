package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixColumnOwner extends ILocalizableOwner {
  def getCellType(): java.lang.String
  def getRequiredText(): java.lang.String
  def onColumnPropertiesChanged(column: MatrixDropdownColumn): scala.Unit
}

object IMatrixColumnOwner {
  @scala.inline
  def apply(
    getCellType: () => java.lang.String,
    getLocale: () => java.lang.String,
    getMarkdownHtml: java.lang.String => java.lang.String,
    getProcessedText: java.lang.String => java.lang.String,
    getRequiredText: () => java.lang.String,
    onColumnPropertiesChanged: MatrixDropdownColumn => scala.Unit
  ): IMatrixColumnOwner = {
    val __obj = js.Dynamic.literal(getCellType = js.Any.fromFunction0(getCellType), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRequiredText = js.Any.fromFunction0(getRequiredText), onColumnPropertiesChanged = js.Any.fromFunction1(onColumnPropertiesChanged))
  
    __obj.asInstanceOf[IMatrixColumnOwner]
  }
}

