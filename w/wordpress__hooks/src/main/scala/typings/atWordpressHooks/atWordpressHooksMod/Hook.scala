package typings.atWordpressHooks.atWordpressHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hook[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  var handlers: js.Array[T]
  var runs: Double
}

object Hook {
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](handlers: js.Array[T], runs: Double): Hook[T] = {
    val __obj = js.Dynamic.literal(handlers = handlers, runs = runs)
  
    __obj.asInstanceOf[Hook[T]]
  }
}

