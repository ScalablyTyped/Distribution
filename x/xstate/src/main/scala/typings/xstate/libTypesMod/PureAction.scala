package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Pure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PureAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  @JSName("type")
  var type_PureAction: Pure
  def get(context: TContext, event: OmniEventObject[TEvent]): js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
}

object PureAction {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    get: (TContext, OmniEventObject[TEvent]) => js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]],
    `type`: Pure,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit = null
  ): PureAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.updateDynamic("type")(`type`)
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    __obj.asInstanceOf[PureAction[TContext, TEvent]]
  }
}

