package typings.xstate

import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.SendAction
import typings.xstate.typesMod.SendActionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnErrorData extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](errorData: js.Any): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](errorData: js.Any, options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
}

