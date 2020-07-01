package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Empty[Finite, Tuple /* <: js.Array[_] */, Infinite] extends js.Object {
  var empty: Finite
  var infinite: Infinite
  var nonEmpty: js.Any
}

object Empty {
  @scala.inline
  def apply[Finite, /* <: js.Array[_] */ Tuple, Infinite](empty: Finite, infinite: Infinite, nonEmpty: js.Any): Empty[Finite, Tuple, Infinite] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Empty[Finite, Tuple, Infinite]]
  }
}

