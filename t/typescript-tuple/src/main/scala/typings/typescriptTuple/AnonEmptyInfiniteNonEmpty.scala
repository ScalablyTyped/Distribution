package typings.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmptyInfiniteNonEmpty[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends js.Object {
  var empty: Holder
  var infinite: js.Any
  var nonEmpty: js.Any
}

object AnonEmptyInfiniteNonEmpty {
  @scala.inline
  def apply[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */](empty: Holder, infinite: js.Any, nonEmpty: js.Any): AnonEmptyInfiniteNonEmpty[Holder, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEmptyInfiniteNonEmpty[Holder, Tuple]]
  }
}

