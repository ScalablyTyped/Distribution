package typings.styleToObject.anon

import typings.styleToObject.mod.DeclarationPos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: DeclarationPos
  var source: js.Any
  var start: DeclarationPos
}

object End {
  @scala.inline
  def apply(end: DeclarationPos, source: js.Any, start: DeclarationPos): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

