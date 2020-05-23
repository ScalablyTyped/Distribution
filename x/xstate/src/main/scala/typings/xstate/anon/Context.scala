package typings.xstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[TContext] extends js.Object {
  var context: TContext
  var value: js.Any
}

object Context {
  @scala.inline
  def apply[TContext](context: TContext, value: js.Any): Context[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TContext]]
  }
}

