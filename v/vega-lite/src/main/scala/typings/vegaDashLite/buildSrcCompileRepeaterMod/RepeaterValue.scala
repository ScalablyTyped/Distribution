package typings.vegaDashLite.buildSrcCompileRepeaterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeaterValue extends js.Object {
  var column: js.UndefOr[String] = js.undefined
  var row: js.UndefOr[String] = js.undefined
}

object RepeaterValue {
  @scala.inline
  def apply(column: String = null, row: String = null): RepeaterValue = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (row != null) __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[RepeaterValue]
  }
}

