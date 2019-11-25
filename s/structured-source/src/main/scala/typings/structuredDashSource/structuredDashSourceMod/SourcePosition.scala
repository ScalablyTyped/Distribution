package typings.structuredDashSource.structuredDashSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourcePosition extends js.Object {
  // Column number starts with 0.
  var column: Double
  // Line number starts with 1.
  var line: Double
}

object SourcePosition {
  @scala.inline
  def apply(column: Double, line: Double): SourcePosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourcePosition]
  }
}

