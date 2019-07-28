package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixColumnOwner extends ILocalizableOwner {
  def getCellType(): String
  def getRequiredText(): String
  def onColumnPropertiesChanged(column: MatrixDropdownColumn): Unit
}

object IMatrixColumnOwner {
  @scala.inline
  def apply(
    getCellType: () => String,
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getProcessedText: String => String,
    getRequiredText: () => String,
    onColumnPropertiesChanged: MatrixDropdownColumn => Unit
  ): IMatrixColumnOwner = {
    val __obj = js.Dynamic.literal(getCellType = js.Any.fromFunction0(getCellType), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRequiredText = js.Any.fromFunction0(getRequiredText), onColumnPropertiesChanged = js.Any.fromFunction1(onColumnPropertiesChanged))
  
    __obj.asInstanceOf[IMatrixColumnOwner]
  }
}

