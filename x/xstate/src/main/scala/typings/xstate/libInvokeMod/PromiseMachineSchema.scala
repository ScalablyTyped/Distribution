package typings.xstate.libInvokeMod

import typings.xstate.Anon_Pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseMachineSchema extends js.Object {
  var states: Anon_Pending
}

object PromiseMachineSchema {
  @scala.inline
  def apply(states: Anon_Pending): PromiseMachineSchema = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromiseMachineSchema]
  }
}

