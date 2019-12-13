package typings.xstate

import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.SendAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_EventObject extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent] = js.native
}

