package typings.typescriptDashTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */, Replacement] extends js.Object {
  var empty: Holder
  var infinite: js.Array[Replacement]
  var nonEmpty: js.Any
}

object Anon_A {
  @scala.inline
  def apply[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */, Replacement](empty: Holder, infinite: js.Array[Replacement], nonEmpty: js.Any): Anon_A[Holder, Tuple, Replacement] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_A[Holder, Tuple, Replacement]]
  }
}

