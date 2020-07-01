package typings.wordpressHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Current[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  var __current: js.Array[T]
}

object Current {
  @scala.inline
  def apply[/* <: js.Function1[/ * repeated * / js.Any, _] */ T](__current: js.Array[T]): Current[T] = {
    val __obj = js.Dynamic.literal(__current = __current.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current[T]]
  }
}

