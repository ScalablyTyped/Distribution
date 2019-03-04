package typings
package structuredDashSourceLib.structuredDashSourceMod.StructuredSourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourcePosition extends js.Object {
  // Column number starts with 0.
  var column: scala.Double
  // Line number starts with 1.
  var line: scala.Double
}

object SourcePosition {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double): SourcePosition = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[SourcePosition]
  }
}

