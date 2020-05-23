package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyPrefix[Prefix /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends js.Object {
  var empty: Prefix
  var infinite: CODENAME
  var nonEmpty: js.Any
}

object EmptyPrefix {
  @scala.inline
  def apply[Prefix, Tuple](empty: Prefix, infinite: CODENAME, nonEmpty: js.Any): EmptyPrefix[Prefix, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyPrefix[Prefix, Tuple]]
  }
}

