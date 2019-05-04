package typings
package vegaDashLiteLib.buildSrcCompileRepeaterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeaterValue extends js.Object {
  var column: js.UndefOr[java.lang.String] = js.undefined
  var row: js.UndefOr[java.lang.String] = js.undefined
}

object RepeaterValue {
  @scala.inline
  def apply(column: java.lang.String = null, row: java.lang.String = null): RepeaterValue = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (row != null) __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[RepeaterValue]
  }
}

