package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteArray[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */, Replacement] extends js.Object {
  var empty: Holder
  var infinite: js.Array[Replacement]
  var nonEmpty: js.Any
}

object InfiniteArray {
  @scala.inline
  def apply[/* <: js.Array[_] */ Holder, /* <: js.Array[_] */ Tuple, Replacement](empty: Holder, infinite: js.Array[Replacement], nonEmpty: js.Any): InfiniteArray[Holder, Tuple, Replacement] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteArray[Holder, Tuple, Replacement]]
  }
}

