package typings.xstate

import typings.xstate.libTypesMod.ActionTypes
import typings.xstate.libTypesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CtxEvent[TContext, TEvent /* <: EventObject */] extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var `type`: ActionTypes
  def expr(ctx: TContext, event: TEvent): js.Any
}

object Anon_CtxEvent {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](expr: (TContext, TEvent) => js.Any, `type`: ActionTypes, label: String = null): Anon_CtxEvent[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(expr = js.Any.fromFunction2(expr))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CtxEvent[TContext, TEvent]]
  }
}

