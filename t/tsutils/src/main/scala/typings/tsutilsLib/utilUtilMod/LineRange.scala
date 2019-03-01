package typings
package tsutilsLib.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineRange
  extends typescriptLib.typescriptMod.tsNs.TextRange {
  var contentLength: scala.Double
}

object LineRange {
  @scala.inline
  def apply(contentLength: scala.Double, end: scala.Double, pos: scala.Double): LineRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentLength")(contentLength)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("pos")(pos)
    __obj.asInstanceOf[LineRange]
  }
}

