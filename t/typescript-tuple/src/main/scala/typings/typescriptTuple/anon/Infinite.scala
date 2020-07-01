package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Infinite[Default, Tuple /* <: js.Array[_] */] extends js.Object {
  var empty: Default
  var infinite: js.Any
  var multi: Default
  var single: js.Any
}

object Infinite {
  @scala.inline
  def apply[Default, /* <: js.Array[_] */ Tuple](empty: Default, infinite: js.Any, multi: Default, single: js.Any): Infinite[Default, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any])
    __obj.asInstanceOf[Infinite[Default, Tuple]]
  }
}

