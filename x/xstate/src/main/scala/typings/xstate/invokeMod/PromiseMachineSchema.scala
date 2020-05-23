package typings.xstate.invokeMod

import typings.xstate.anon.Pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseMachineSchema extends js.Object {
  var states: Pending
}

object PromiseMachineSchema {
  @scala.inline
  def apply(states: Pending): PromiseMachineSchema = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseMachineSchema]
  }
}

