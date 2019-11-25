package typings.typescriptDashTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1Empty[Default, Tuple /* <: js.Array[_] */] extends js.Object {
  var empty: Default
  var infinite: js.Any
  var multi: Default
  var single: js.Any
}

object Anon_1Empty {
  @scala.inline
  def apply[Default, Tuple /* <: js.Array[_] */](empty: Default, infinite: js.Any, multi: Default, single: js.Any): Anon_1Empty[Default, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_1Empty[Default, Tuple]]
  }
}

