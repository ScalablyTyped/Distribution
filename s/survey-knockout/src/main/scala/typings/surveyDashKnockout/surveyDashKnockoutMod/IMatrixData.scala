package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixData extends js.Object {
  def onMatrixRowChanged(row: MatrixRowModel): Unit
}

object IMatrixData {
  @scala.inline
  def apply(onMatrixRowChanged: MatrixRowModel => Unit): IMatrixData = {
    val __obj = js.Dynamic.literal(onMatrixRowChanged = js.Any.fromFunction1(onMatrixRowChanged))
  
    __obj.asInstanceOf[IMatrixData]
  }
}

