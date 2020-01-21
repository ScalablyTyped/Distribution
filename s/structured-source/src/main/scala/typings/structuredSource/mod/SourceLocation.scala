package typings.structuredSource.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: SourcePosition
  var start: SourcePosition
}

object SourceLocation {
  @scala.inline
  def apply(end: SourcePosition, start: SourcePosition): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceLocation]
  }
}

