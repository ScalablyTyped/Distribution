package typings.xstate

import typings.xstate.libTypesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: js.Any
  var value: StateValue
}

object Anon_Context {
  @scala.inline
  def apply(context: js.Any, value: StateValue): Anon_Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Context]
  }
}

