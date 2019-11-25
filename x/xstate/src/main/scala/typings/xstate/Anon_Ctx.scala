package typings.xstate

import typings.xstate.esTypesMod.ActionTypes
import typings.xstate.esTypesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ctx[TContext, TEvent /* <: EventObject */] extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var `type`: ActionTypes
  def expr(ctx: TContext, event: TEvent): js.Any
}

object Anon_Ctx {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](expr: (TContext, TEvent) => js.Any, `type`: ActionTypes, label: String = null): Anon_Ctx[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(expr = js.Any.fromFunction2(expr))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Ctx[TContext, TEvent]]
  }
}

