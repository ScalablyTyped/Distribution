package typings.typescriptDashTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1EmptyInfiniteNonEmpty[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends js.Object {
  var empty: Holder
  var infinite: js.Any
  var nonEmpty: js.Any
}

object Anon_1EmptyInfiniteNonEmpty {
  @scala.inline
  def apply[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */](empty: Holder, infinite: js.Any, nonEmpty: js.Any): Anon_1EmptyInfiniteNonEmpty[Holder, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_1EmptyInfiniteNonEmpty[Holder, Tuple]]
  }
}

