package typings
package atWordpressHooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  var __current: js.Array[T]
}

object Anon_Current {
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](__current: js.Array[T]): Anon_Current[T] = {
    val __obj = js.Dynamic.literal(__current = __current)
  
    __obj.asInstanceOf[Anon_Current[T]]
  }
}

