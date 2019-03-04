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
    getCellType: js.Function0[java.lang.String],
    getLocale: js.Function0[java.lang.String],
    getMarkdownHtml: js.Function1[java.lang.String, java.lang.String],
    getProcessedText: js.Function1[java.lang.String, java.lang.String],
    getRequiredText: js.Function0[java.lang.String],
    onColumnPropertiesChanged: js.Function1[MatrixDropdownColumn, scala.Unit]
  ): IMatrixColumnOwner = {
    val __obj = js.Dynamic.literal(getCellType = getCellType, getLocale = getLocale, getMarkdownHtml = getMarkdownHtml, getProcessedText = getProcessedText, getRequiredText = getRequiredText, onColumnPropertiesChanged = onColumnPropertiesChanged)
  
    __obj.asInstanceOf[IMatrixColumnOwner]
  }
}

