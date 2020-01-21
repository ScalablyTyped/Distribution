package typings.xstate.invokeMod

import typings.xstate.AnonPending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseMachineSchema extends js.Object {
  var states: AnonPending
}

object PromiseMachineSchema {
  @scala.inline
  def apply(states: AnonPending): PromiseMachineSchema = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromiseMachineSchema]
  }
}

