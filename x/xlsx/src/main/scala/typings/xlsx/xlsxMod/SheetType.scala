package typings.xlsx.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.xlsx.xlsxStrings.sheet
  - typings.xlsx.xlsxStrings.chart
*/
trait SheetType extends _SheetKeys

object SheetType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chart: typings.xlsx.xlsxStrings.chart = this.cast("chart")
  @scala.inline
  def sheet: typings.xlsx.xlsxStrings.sheet = this.cast("sheet")
}

