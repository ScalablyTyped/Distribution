package typings.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmpty[Finite, Tuple /* <: js.Array[_] */, Infinite] extends js.Object {
  var empty: Finite
  var infinite: Infinite
  var nonEmpty: js.Any
}

object AnonEmpty {
  @scala.inline
  def apply[Finite, Tuple /* <: js.Array[_] */, Infinite](empty: Finite, infinite: Infinite, nonEmpty: js.Any): AnonEmpty[Finite, Tuple, Infinite] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmpty[Finite, Tuple, Infinite]]
  }
}

