package typings.styleToObject

import typings.styleToObject.mod.DeclarationPos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: DeclarationPos
  var source: js.Any
  var start: DeclarationPos
}

object AnonEnd {
  @scala.inline
  def apply(end: DeclarationPos, source: js.Any, start: DeclarationPos): AnonEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

