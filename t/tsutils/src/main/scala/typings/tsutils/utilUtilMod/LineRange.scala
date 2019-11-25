package typings.tsutils.utilUtilMod

import typings.typescript.typescriptMod.TextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineRange extends TextRange {
  var contentLength: Double
}

object LineRange {
  @scala.inline
  def apply(contentLength: Double, end: Double, pos: Double): LineRange = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LineRange]
  }
}

