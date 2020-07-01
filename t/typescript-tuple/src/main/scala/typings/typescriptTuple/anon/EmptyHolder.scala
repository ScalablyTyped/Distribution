package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyHolder[Holder /* <: js.Array[js.Array[_]] */, Types /* <: js.Array[_] */] extends js.Object {
  var empty: Holder
  var infinite: js.Any
  var nonEmpty: js.Any
}

object EmptyHolder {
  @scala.inline
  def apply[/* <: js.Array[js.Array[_]] */ Holder, /* <: js.Array[_] */ Types](empty: Holder, infinite: js.Any, nonEmpty: js.Any): EmptyHolder[Holder, Types] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyHolder[Holder, Types]]
  }
}

