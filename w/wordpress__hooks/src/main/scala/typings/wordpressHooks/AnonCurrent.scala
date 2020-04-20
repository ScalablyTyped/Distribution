package typings.wordpressHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  var __current: js.Array[T]
}

object AnonCurrent {
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](__current: js.Array[T]): AnonCurrent[T] = {
    val __obj = js.Dynamic.literal(__current = __current.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrent[T]]
  }
}

