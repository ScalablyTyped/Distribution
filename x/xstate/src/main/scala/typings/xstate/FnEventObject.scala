package typings.xstate

import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.SendAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnEventObject extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent] = js.native
}

