package typings.xstate

import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.SendAction
import typings.xstate.typesMod.SendActionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallTargetOptions extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
  ): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent] = js.native
}

