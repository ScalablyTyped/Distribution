package typings.typescriptDashTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_[Finite, Tuple /* <: js.Array[_] */, Infinite] extends js.Object {
  var empty: Finite
  var infinite: Infinite
  var nonEmpty: js.Any
}

object Anon_ {
  @scala.inline
  def apply[Finite, Tuple /* <: js.Array[_] */, Infinite](empty: Finite, infinite: Infinite, nonEmpty: js.Any): Anon_[Finite, Tuple, Infinite] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty)
  
    __obj.asInstanceOf[Anon_[Finite, Tuple, Infinite]]
  }
}

