package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typestate[TContext] extends js.Object {
  var context: TContext
  var value: StateValue
}

object Typestate {
  @scala.inline
  def apply[TContext](context: TContext, value: StateValue): Typestate[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typestate[TContext]]
  }
}

