package typings.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1EmptyInfiniteNonEmptyAny[Holder /* <: js.Array[js.Array[_]] */, Types /* <: js.Array[_] */] extends js.Object {
  var empty: Holder
  var infinite: js.Any
  var nonEmpty: js.Any
}

object Anon1EmptyInfiniteNonEmptyAny {
  @scala.inline
  def apply[Holder /* <: js.Array[js.Array[_]] */, Types /* <: js.Array[_] */](empty: Holder, infinite: js.Any, nonEmpty: js.Any): Anon1EmptyInfiniteNonEmptyAny[Holder, Types] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon1EmptyInfiniteNonEmptyAny[Holder, Types]]
  }
}

