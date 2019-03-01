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
    getColumns: js.Function0[js.Array[_]],
    getLocale: js.Function0[java.lang.String],
    getMarkdownHtml: js.Function1[java.lang.String, java.lang.String],
    getProcessedText: js.Function1[java.lang.String, java.lang.String],
    getRows: js.Function0[js.Array[_]]
  ): IMatrixCellsOwner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getColumns")(getColumns)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("getMarkdownHtml")(getMarkdownHtml)
    __obj.updateDynamic("getProcessedText")(getProcessedText)
    __obj.updateDynamic("getRows")(getRows)
    __obj.asInstanceOf[IMatrixCellsOwner]
  }
}

