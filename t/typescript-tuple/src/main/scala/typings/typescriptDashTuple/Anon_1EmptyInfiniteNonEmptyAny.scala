package typings.typescriptDashTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1EmptyInfiniteNonEmptyAny[Holder /* <: js.Array[js.Array[_]] */, Types /* <: js.Array[_] */] extends js.Object {
  var empty: Holder
  var infinite: js.Any
  var nonEmpty: js.Any
}

object Anon_1EmptyInfiniteNonEmptyAny {
  @scala.inline
  def apply[Holder /* <: js.Array[js.Array[_]] */, Types /* <: js.Array[_] */](empty: Holder, infinite: js.Any, nonEmpty: js.Any): Anon_1EmptyInfiniteNonEmptyAny[Holder, Types] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite, nonEmpty = nonEmpty)
  
    __obj.asInstanceOf[Anon_1EmptyInfiniteNonEmptyAny[Holder, Types]]
  }
}

