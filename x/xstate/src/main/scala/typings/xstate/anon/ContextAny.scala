package typings.xstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextAny extends js.Object {
  var context: js.Any
  var value: js.Any
}

object ContextAny {
  @scala.inline
  def apply(context: js.Any, value: js.Any): ContextAny = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextAny]
  }
}

