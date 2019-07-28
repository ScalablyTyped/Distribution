package typings.xstate

import typings.xstate.libTypesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CtxEvent extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](): Anon_CtxEvent[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _]): Anon_CtxEvent[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _], label: String): Anon_CtxEvent[TContext, TEvent] = js.native
}

