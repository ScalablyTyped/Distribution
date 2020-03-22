package typings.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInfiniteArray[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */, Replacement] extends js.Object {
  var empty: Holder
  var infinite: js.Array[Replacement]
  var nonEmpty: js.Any
}

object AnonInfiniteArray {
  @scala.inline
  def apply[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */, Replacement](empty: Holder, infinite: js.Array[Replacement], nonEmpty: js.Any): AnonInfiniteArray[Holder, Tuple, Replacement] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInfiniteArray[Holder, Tuple, Replacement]]
  }
}

