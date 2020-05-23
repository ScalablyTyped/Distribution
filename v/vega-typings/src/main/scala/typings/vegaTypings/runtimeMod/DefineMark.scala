package typings.vegaTypings.runtimeMod

import typings.vegaTypings.vegaTypingsStrings.mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineMark[T /* <: String */, I, R /* <: String */] extends js.Object {
  var group: js.Any
  var items: js.Array[Item[I]]
  var marktype: T
  var role: mark | R
}

object DefineMark {
  @scala.inline
  def apply[T, I, R](group: js.Any, items: js.Array[Item[I]], marktype: T, role: mark | R): DefineMark[T, I, R] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], marktype = marktype.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineMark[T, I, R]]
  }
}

