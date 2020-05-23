package typings.xstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextValue[TContext] extends js.Object {
  var context: TContext
  var value: js.Any
}

object ContextValue {
  @scala.inline
  def apply[TContext](context: TContext, value: js.Any): ContextValue[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextValue[TContext]]
  }
}

