package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMatrixCellsOwner extends ILocalizableOwner {
  def getColumns(): js.Array[_] = js.native
  def getRows(): js.Array[_] = js.native
}

object IMatrixCellsOwner {
  @scala.inline
  def apply(
    getColumns: () => js.Array[_],
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getProcessedText: String => String,
    getRows: () => js.Array[_]
  ): IMatrixCellsOwner = {
    val __obj = js.Dynamic.literal(getColumns = js.Any.fromFunction0(getColumns), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRows = js.Any.fromFunction0(getRows))
    __obj.asInstanceOf[IMatrixCellsOwner]
  }
  @scala.inline
  implicit class IMatrixCellsOwnerOps[Self <: IMatrixCellsOwner] (val x: Self) extends AnyVal {
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
    def setGetColumns(value: () => js.Array[_]): Self = this.set("getColumns", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRows(value: () => js.Array[_]): Self = this.set("getRows", js.Any.fromFunction0(value))
  }
  
}

